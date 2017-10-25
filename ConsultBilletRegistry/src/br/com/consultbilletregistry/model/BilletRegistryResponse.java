package br.com.consultbilletregistry.model;

public class BilletRegistryResponse {

	private String merchant_id;
	private BilletResponse boleto;
	private OperationStatus status;

	public String getMerchant_id() {
		return merchant_id;
	}
	public void setMerchant_id(String merchant_id) {
		this.merchant_id = merchant_id;
	}
	public BilletResponse getBoleto() {
		return boleto;
	}
	public void setBoleto(BilletResponse boleto) {
		this.boleto = boleto;
	}
	public OperationStatus getStatus() {
		return status;
	}
	public void setStatus(OperationStatus status) {
		this.status = status;
	}
}