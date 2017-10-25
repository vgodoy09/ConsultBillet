package br.com.consultbilletregistry.model;

public class Billet {
	private String carteira;
	private Integer nosso_numero;
	private String numero_documento;
	private String data_emissao;
	private String data_vencimento;
	private String valor_titulo;
	private Payer pagador; //OKAY
	private OptionalInformation informacoes_opcionais;
	
	public String getCarteira() {
		return carteira;
	}
	public void setCarteira(String carteira) {
		this.carteira = carteira;
	}
	public Integer getNosso_numero() {
		return nosso_numero;
	}
	public void setNosso_numero(Integer nosso_numero) {
		this.nosso_numero = nosso_numero;
	}
	public String getData_emissao() {
		return data_emissao;
	}
	public void setData_emissao(String data_emissao) {
		this.data_emissao = data_emissao;
	}
	public String getData_vencimento() {
		return data_vencimento;
	}
	public void setData_vencimento(String data_vencimento) {
		this.data_vencimento = data_vencimento;
	}
	public String getValor_titulo() {
		return valor_titulo;
	}
	public void setValor_titulo(String valor_titulo) {
		this.valor_titulo = valor_titulo;
	}
	public String getNumero_documento() {
		return numero_documento;
	}
	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}
	public Payer getPagador() {
		return pagador;
	}
	public void setPagador(Payer pagador) {
		this.pagador = pagador;
	}
	public OptionalInformation getInformacoes_opcionais() {
		return informacoes_opcionais;
	}
	public void setInformacoes_opcionais(OptionalInformation informacoes_opcionais) {
		this.informacoes_opcionais = informacoes_opcionais;
	}
	@Override
	public String toString() {
		return "Billet [carteira=" + carteira + ", nosso_numero="
				+ nosso_numero + ", numero_documento=" + numero_documento
				+ ", data_emissao=" + data_emissao + ", data_vencimento="
				+ data_vencimento + ", valor_titulo=" + valor_titulo + "]";
	}
	
}