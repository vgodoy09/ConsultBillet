package br.com.consultbilletregistry.model;


public class BilletRegistryRequest {
	
	private String nosso_numero;
	private String numero_documento;
	private boolean production;

	public boolean isProduction() {
		return production;
	}
	public void setProduction(boolean production) {
		this.production = production;
	}
	public String getNosso_numero() {
		return nosso_numero;
	}
	public void setNosso_numero(String nosso_numero) {
		this.nosso_numero = nosso_numero;
	}
	public String getNumero_documento() {
		return numero_documento;
	}
	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}
}