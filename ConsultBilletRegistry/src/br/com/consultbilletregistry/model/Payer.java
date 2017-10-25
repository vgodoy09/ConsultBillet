package br.com.consultbilletregistry.model;

public class Payer {
	private String nome;
	private String documento;
	private String tipo_documento;
	private Address endereco;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public Address getEndereco() {
		return endereco;
	}
	public void setEndereco(Address endereco) {
		this.endereco = endereco;
	}
	public String getTipo_documento() {
		return tipo_documento;
	}
	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}
	@Override
	public String toString() {
		return "Payer [nome=" + nome + ", documento=" + documento
				+ ", tipo_documento=" + tipo_documento + ", endereco="
				+ endereco + "]";
	}
	
}