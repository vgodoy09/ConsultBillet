package br.com.consultbilletregistry.http.abstraction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URLConnection;

import br.com.consultbilletregistry.http.ExtConnectionControl;
import br.com.consultbilletregistry.http.HttpUrlAbstraction;
import br.com.consultbilletregistry.lang.CoalesceDefault;


public abstract class HttpUrlProtocolAbstraction<T extends URLConnection> implements HttpUrlAbstraction<T> {

	protected final T urlConnection;
	private Integer code;
	private String data;
	private ExtConnectionControl connectionControl;

	public HttpUrlProtocolAbstraction(T urlConnection) {
		this.urlConnection = urlConnection;
		if(urlConnection == null) {
			throw new RuntimeException("A conexão não foi informada");
		}
	}

	@Override
	public abstract void setRequestMethod(String requestMethod);

	@Override
	public void setDoInput(boolean doinput) {
		urlConnection.setDoInput(doinput);
	}
	
	@Override
	public void setDoOutput(boolean doOutput) {
		urlConnection.setDoOutput(doOutput);
	}

	@Override
	public void addRequestProperty(String key, String value) {
		urlConnection.addRequestProperty(key, value);
	}

	@Override
	public void setConnectTimeout(int timeout) {
		urlConnection.setConnectTimeout(timeout);
	}

	@Override
	public int getResponseCode() {
		connect();
		return code;
	}
	
	public ExtConnectionControl getConnectionControl() {
		return connectionControl;
	}

	public void setConnectionControl(ExtConnectionControl connectionControl) {
		this.connectionControl = connectionControl;
	}

	protected abstract void disconnect();

	private void connect() {
		if(code == null) {
			Exception hasProblem = null;
			try {
				
				if(connectionControl != null) {
					connectionControl.beforeConnection(urlConnection);
				}
				
				urlConnection.connect();
				code = getCode();

				if((code == 200 || code == 201) && urlConnection.getDoInput()) {

					BufferedReader bufferedReader = null;
					StringBuilder sb = new StringBuilder();
					try {
						bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
						String line;
						while((line = bufferedReader.readLine()) != null) {
							sb.append(line + "\n");
						}
					} catch (IOException e) {
						throw new RuntimeException(e);
					} finally {
						if(bufferedReader != null) {
							try {
								bufferedReader.close();
							} catch (IOException e) {
								throw new RuntimeException(e);
							}
						}
					}
					data = sb.toString();
					System.out.println(data);
				} 
			}catch (Exception e) {
				hasProblem = e;
				throw new RuntimeException(e);
			} finally {
				if(connectionControl != null) {
					connectionControl.afterConnection(code, data, hasProblem);
				}
				if(urlConnection != null) {
					disconnect();
				}
			}
		}
	}

	@Override
	public String getResponseData() {
		connect();
		return data;
	}

	protected abstract int getCode();

	@Override
	public void write(String data) {

		if(data == null || data.isEmpty()) {
			return;
		}
		
		System.out.println(data);

		OutputStreamWriter outputStream = null;
		try {
			outputStream = new OutputStreamWriter(urlConnection.getOutputStream(), new CoalesceDefault<String>(urlConnection.getRequestProperty("Accept-Charset"), "UTF-8").choose());
			outputStream.write(data);
			outputStream.flush();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		} finally {
			if(outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
	}
}