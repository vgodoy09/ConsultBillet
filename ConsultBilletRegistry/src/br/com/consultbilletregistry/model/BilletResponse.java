package br.com.consultbilletregistry.model;

import java.util.Date;

public class BilletResponse {
	private String nosso_numero;
	private String numero_documento;
	private Date data_requisicao;
	private Date data_registro;

	public String getNosso_numero() {
		return nosso_numero;
	}
	public String getNumero_documento() {
		return numero_documento;
	}
	public Date getData_requisicao() {
		return data_requisicao;
	}
	public Date getData_registro() {
		return data_registro;
	}
	public void setNosso_numero(String nosso_numero) {
		this.nosso_numero = nosso_numero;
	}
	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}
	public void setData_requisicao(Date data_requisicao) {
		this.data_requisicao = data_requisicao;
	}
	public void setData_registro(Date data_registro) {
		this.data_registro = data_registro;
	}
	@Override
	public String toString() {
		return "BilletResponse [nosso_numero=" + nosso_numero
				+ ", numero_documento=" + numero_documento
				+ ", data_requisicao=" + data_requisicao + ", data_registro="
				+ data_registro + "]";
	}
}