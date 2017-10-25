package br.com.consultbilletregistry.http;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.net.ssl.HttpsURLConnection;

import br.com.consultbilletregistry.http.abstraction.HttpUrlProtocolAbstraction;

public class UrlProtocolConnectionFactory {

	private UrlProtocolConnectionFactory() {}
	
	public static HttpUrlProtocolAbstraction<? extends URLConnection> getOpenURLConnection(String urlString) {
		if(urlString == null || urlString.isEmpty()) {
			throw new RuntimeException("Informe uma URL para abrir uma conexão");
		}
		
		URLConnection urlConnection = null;
		try {
			URL url = new URL(urlString);
			urlConnection = url.openConnection();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		System.out.println("URL: " + urlString);
		
		HttpUrlProtocolAbstraction<? extends URLConnection> protocolAbstraction = null;
		
		if(urlConnection instanceof HttpsURLConnection) {
			protocolAbstraction = new HttpsProtocolConnection((HttpsURLConnection) urlConnection);
		} else if(urlConnection instanceof HttpURLConnection) {
			protocolAbstraction = new HttpProtocolConnection((HttpURLConnection) urlConnection);
		}

		return protocolAbstraction;
		
	}
	
}