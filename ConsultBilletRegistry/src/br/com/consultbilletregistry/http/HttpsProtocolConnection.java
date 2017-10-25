package br.com.consultbilletregistry.http;

import java.io.IOException;
import java.net.ProtocolException;

import javax.net.ssl.HttpsURLConnection;

import br.com.consultbilletregistry.http.abstraction.HttpUrlProtocolAbstraction;

public class HttpsProtocolConnection extends HttpUrlProtocolAbstraction<HttpsURLConnection> {

	public HttpsProtocolConnection(HttpsURLConnection urlConnection) {
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
