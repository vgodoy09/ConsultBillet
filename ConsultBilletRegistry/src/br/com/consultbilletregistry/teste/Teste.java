package br.com.consultbilletregistry.teste;

import br.com.consultbilletregistry.model.BilletRegistryRequest;
import br.com.consultbilletregistry.model.BilletResponse;
import br.com.consultbilletregistry.model.OperationStatus;
import br.com.consultbilletregistry.shopfacil.BilletRegistry;
import br.com.consultbilletregistry.shopfacil.BilletResponseData;

public class Teste {
	public static void main(String[] args) {
		BilletRegistry billetRegistry = new BilletRegistry();
		BilletRegistryRequest requestData = new BilletRegistryRequest();
		
		requestData.setNosso_numero("3099240");
		requestData.setNumero_documento("26/00003099240-5");
		requestData.setProduction(true);
		
		
		BilletResponseData responseData = billetRegistry.registry(requestData);
		
		BilletResponse boleto = responseData.getData().getBoleto();
		OperationStatus status = responseData.getData().getStatus();
		
		String billet = boleto.getNosso_numero() + boleto.getNumero_documento() + boleto.getData_registro() + boleto.getData_requisicao();
		
		String s = status.toString();
	}
}
