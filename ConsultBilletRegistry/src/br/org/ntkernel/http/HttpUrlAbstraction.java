package br.org.ntkernel.http;

import java.net.URLConnection;

public interface HttpUrlAbstraction<T extends URLConnection> {
	void setRequestMethod(String requestMethod);
	void setDoInput(boolean doinput);
	void setDoOutput(boolean doOutput);
	void addRequestProperty(String key, String value);
	void setConnectTimeout(int timeout);
	void write(String data);
	int getResponseCode();
	String getResponseData();
}