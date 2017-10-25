package br.com.consultbilletregistry.http;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;

import br.com.consultbilletregistry.http.abstraction.HttpUrlProtocolAbstraction;



public class HttpProtocolConnection extends HttpUrlProtocolAbstraction<HttpURLConnection> {

	public HttpProtocolConnection(HttpURLConnection urlConnection) {
		super(urlConnection);
	}

	@Override
	public void setRequestMethod(String requestMethod) {
		try {
			urlConnection.setRequestMethod(requestMethod);
		} catch (ProtocolException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	protected int getCode() {
		try {
			return urlConnection.getResponseCode();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	protected void disconnect() {
		urlConnection.disconnect();
	}

}
