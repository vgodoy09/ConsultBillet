package br.com.consultbilletregistry.view;

import javax.servlet.http.HttpServletRequest;

public abstract class ViewHelper<T> {
	 public abstract void setDados(HttpServletRequest request);
	 public abstract T getDados();
}
