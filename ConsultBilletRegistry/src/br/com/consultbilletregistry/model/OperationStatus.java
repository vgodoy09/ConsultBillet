/**
 * Este arquivo pertence ao acerto intelectual da Rede Novo Tempo de Comunica��o.
 */
package br.com.consultbilletregistry.model;

/**
 * "Falar � f�cil. Mostre-me o c�digo." - Linus Torvalds
 * "A perfei��o � atingida n�o quando n�o se tem mais o que colocar, mas sim quando n�o se tem mais o que tirar." - Antoine de Saint-Exup�ry
 * "Existem duas maneiras de construir um projeto de software. Uma � faz�-lo t�o simples que obviamente n�o h� falhas. A outra � faz�-lo t�o complicado que n�o existem falhas �bvias." - C.A.R. Hoare
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