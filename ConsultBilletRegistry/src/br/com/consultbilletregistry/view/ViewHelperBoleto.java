package br.com.consultbilletregistry.view;

import javax.servlet.http.HttpServletRequest;

import br.com.consultbilletregistry.model.BilletRegistryRequest;

public class ViewHelperBoleto extends ViewHelper<BilletRegistryRequest>{
	private BilletRegistryRequest billetRequest;
	
	@Override
	public void setDados(HttpServletRequest request) {
    	String nosso_numero = request.getParameter("nosso_numero");
    	String numero_documento = request.getParameter("numero_documento");
    	String production = request.getParameter("production");
        billetRequest = new BilletRegistryRequest();
        billetRequest.setNosso_numero(nosso_numero);
        billetRequest.setNumero_documento(numero_documento);
        billetRequest.setProduction(Boolean.parseBoolean(production));
	}

	@Override
	public BilletRegistryRequest getDados() {
		return billetRequest;
	}

}
