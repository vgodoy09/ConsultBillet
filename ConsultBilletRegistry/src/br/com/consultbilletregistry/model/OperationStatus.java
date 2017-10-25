/**
 * Este arquivo pertence ao acerto intelectual da Rede Novo Tempo de Comunicação.
 */
package br.com.consultbilletregistry.model;

/**
 * "Falar é fácil. Mostre-me o código." - Linus Torvalds
 * "A perfeição é atingida não quando não se tem mais o que colocar, mas sim quando não se tem mais o que tirar." - Antoine de Saint-Exupéry
 * "Existem duas maneiras de construir um projeto de software. Uma é fazê-lo tão simples que obviamente não há falhas. A outra é fazê-lo tão complicado que não existem falhas óbvias." - C.A.R. Hoare
 * 
 * @author eduardo.silva
 * Dec 1, 2016 1:56:32 PM
 * 
 */
public class OperationStatus {

	private Integer codigo;
	private String mensagem;
	private String detalhes;

	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getDetalhes() {
		return detalhes;
	}
	public void setDetalhes(String detalhes) {
		this.detalhes = detalhes;
	}
	@Override
	public String toString() {
		return "BilletRegistryStatus [codigo=" + codigo + ", mensagem="
				+ mensagem + ", detalhes=" + detalhes + "]";
	}
}