package br.com.consultbilletregistry.connection;

import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import br.com.consultbilletregistry.designpattern.Builder;
import br.com.consultbilletregistry.http.HttpMethod;
import br.com.consultbilletregistry.http.ResponseData;
import br.com.consultbilletregistry.http.abstraction.HttpUrlProtocolAbstraction;
import br.com.consultbilletregistry.security.Base64;
import static br.com.consultbilletregistry.utils.CheckInstanceObject.*;

public class UrlConnectionBuilder implements Builder<ResponseData> {

	private HttpMethod requestMethod;
	private Integer connectionTimeout;
	private final HttpUrlProtocolAbstraction<?> urlAbstraction;
	private Map<String, String> requestProperties = new HashMap<String, String>();
	private String data;
	private boolean hasInput;
	private boolean hasOutput;
	
	public UrlConnectionBuilder(HttpUrlProtocolAbstraction<? extends URLConnection> urlAbstraction) {
		
		if(urlAbstraction == null) {
			throw new RuntimeException("Informe a abstração URL");
		}
		
		this.urlAbstraction = urlAbstraction;
	}
	
	public UrlConnectionBuilder setHasInput(boolean hasInput) {
		this.hasInput = hasInput;
		return this;
	}
	
	public UrlConnectionBuilder setHasOutput(boolean hasOutput) {
		this.hasOutput = hasOutput;
		return this;
	}

	public UrlConnectionBuilder putRequestProperty(String property, String value) {
		requestProperties.put(property, value);
		System.out.println("Property " + property + "; Value: " + value);
		return this;
	}

	public UrlConnectionBuilder setBase64Authorization(String authorization) {
		putRequestProperty("Authorization", "Basic " + Base64.encode(authorization));
		return this;
	}

	public UrlConnectionBuilder setData(String data) {
		this.data = data;
		return this;
	}

	public UrlConnectionBuilder setRequestMethod(HttpMethod rm) {
		this.requestMethod = rm;
		return this;
	}

	public UrlConnectionBuilder setConnectionTimeout(int connectionTimeout) {
		this.connectionTimeout = connectionTimeout;
		return this;
	}

	@Override
	public ResponseData build() {
		
		if(requestMethod == null) {
			throw new RuntimeException("Informe um método HTTP");
		}

		urlAbstraction.setDoInput(hasInput);
		urlAbstraction.setDoOutput(hasOutput);
		
		if(!requestProperties.isEmpty()) {
			Set<Entry<String, String>> properties = requestProperties.entrySet();
			for(Entry<String, String> entry : properties) {
				urlAbstraction.addRequestProperty(entry.getKey(), entry.getValue());
			}
		}
		urlAbstraction.setRequestMethod(requestMethod.name());
		if(!IsNull(data))
			urlAbstraction.write(data);
		
		if(connectionTimeout != null) {
			urlAbstraction.setConnectTimeout(connectionTimeout);
		}
		
		return new ResponseData(urlAbstraction);
	}

	@Override
	public String toString() {
		return "UrlConnectionBuilder [requestMethod=" + requestMethod
				+ ", connectionTimeout=" + connectionTimeout
				+ ", urlAbstraction=" + urlAbstraction + ", requestProperties="
				+ requestProperties + ", data=" + data + ", hasInput="
				+ hasInput + "]";
	}
}