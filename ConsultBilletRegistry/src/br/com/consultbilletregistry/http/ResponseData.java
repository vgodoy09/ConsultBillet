package br.com.consultbilletregistry.http;

import java.net.URLConnection;

import br.com.consultbilletregistry.http.abstraction.HttpUrlProtocolAbstraction;


public class ResponseData {

	private final HttpUrlProtocolAbstraction<? extends URLConnection> protocolAbstraction;
	
	public ResponseData(HttpUrlProtocolAbstraction<? extends URLConnection> protocolAbstraction) {
		this.protocolAbstraction = protocolAbstraction;
	}
	
	public int getCode() {
		return protocolAbstraction.getResponseCode();
	}
	
	public String getData() {
		return protocolAbstraction.getResponseData(); 
	}
	
}