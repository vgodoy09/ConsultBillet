package br.com.consultbilletregistry.model;

import java.util.Date;

public class OptionalInformation {
	private String agencia_pagador;
	private String razao_conta_pagador;
	private String conta_pagador;
	private String controle_participante;
	private String especie;
	private String aceite;
	private String tipo_protesto_negociacao;
	private Integer qtde_dias_protesto;
	private String tipo_decurso_prazo;
	private Integer qtde_dias_decurso;
	private String tipo_emissao_papeleta;
	private Integer qtde_parcelas;
	private Integer perc_juros;
	private Integer valor_juros;
	private Integer qtde_dias_juros;
	private Integer perc_multa_atraso;
	private Integer valor_multa_atraso;
	private Integer qtde_dias_multa_atraso;
	private Integer perc_desconto_1;
	private Integer valor_desconto_1;
	private Date data_limite_desconto_1;
	private Integer perc_desconto_2;
	private Integer valor_desconto_2;
	private Date data_limite_desconto_2;
	private Integer perc_desconto_3;
	private Integer valor_desconto_3;
	private Date data_limite_desconto_3;
	private String tipo_bonificacao;
	private Integer perc_desc_bonificacao;
	private Integer valor_desc_bonificacao;
	private Date data_limite_desc_bonificacao;
	private Integer valor_abatimento;
	private Integer valor_iof;
	private String sequencia_registro;
	private Buyer sacador_avalista;
	
	public String getAgencia_pagador() {
		return agencia_pagador;
	}
	public void setAgencia_pagador(String agencia_pagador) {
		this.agencia_pagador = agencia_pagador;
	}
	public String getRazao_conta_pagador() {
		return razao_conta_pagador;
	}
	public void setRazao_conta_pagador(String razao_conta_pagador) {
		this.razao_conta_pagador = razao_conta_pagador;
	}
	public String getControle_participante() {
		return controle_participante;
	}
	public void setControle_participante(String controle_participante) {
		this.controle_participante = controle_participante;
	}
	public String getConta_pagador() {
		return conta_pagador;
	}
	public String getEspecie() {
		return especie;
	}
	public String getAceite() {
		return aceite;
	}
	public String getTipo_protesto_negociacao() {
		return tipo_protesto_negociacao;
	}
	public Integer getQtde_dias_protesto() {
		return qtde_dias_protesto;
	}
	public String getTipo_decurso_prazo() {
		return tipo_decurso_prazo;
	}
	public Integer getQtde_dias_decurso() {
		return qtde_dias_decurso;
	}
	public String getTipo_emissao_papeleta() {
		return tipo_emissao_papeleta;
	}
	public Integer getQtde_parcelas() {
		return qtde_parcelas;
	}
	public Integer getPerc_juros() {
		return perc_juros;
	}
	public Integer getValor_juros() {
		return valor_juros;
	}
	public Integer getQtde_dias_juros() {
		return qtde_dias_juros;
	}
	public Integer getPerc_multa_atraso() {
		return perc_multa_atraso;
	}
	public Integer getValor_multa_atraso() {
		return valor_multa_atraso;
	}
	public Integer getQtde_dias_multa_atraso() {
		return qtde_dias_multa_atraso;
	}
	public Integer getPerc_desconto_1() {
		return perc_desconto_1;
	}
	public Integer getValor_desconto_1() {
		return valor_desconto_1;
	}
	public Date getData_limite_desconto_1() {
		return data_limite_desconto_1;
	}
	public Integer getPerc_desconto_2() {
		return perc_desconto_2;
	}
	public Integer getValor_desconto_2() {
		return valor_desconto_2;
	}
	public Date getData_limite_desconto_2() {
		return data_limite_desconto_2;
	}
	public Integer getPerc_desconto_3() {
		return perc_desconto_3;
	}
	public Integer getValor_desconto_3() {
		return valor_desconto_3;
	}
	public Date getData_limite_desconto_3() {
		return data_limite_desconto_3;
	}
	public String getTipo_bonificacao() {
		return tipo_bonificacao;
	}
	public Integer getPerc_desc_bonificacao() {
		return perc_desc_bonificacao;
	}
	public Integer getValor_desc_bonificacao() {
		return valor_desc_bonificacao;
	}
	public Date getData_limite_desc_bonificacao() {
		return data_limite_desc_bonificacao;
	}
	public Integer getValor_abatimento() {
		return valor_abatimento;
	}
	public Integer getValor_iof() {
		return valor_iof;
	}
	public String getSequencia_registro() {
		return sequencia_registro;
	}
	public Buyer getSacador_avalista() {
		return sacador_avalista;
	}
	public void setConta_pagador(String conta_pagador) {
		this.conta_pagador = conta_pagador;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public void setAceite(String aceite) {
		this.aceite = aceite;
	}
	public void setTipo_protesto_negociacao(String tipo_protesto_negociacao) {
		this.tipo_protesto_negociacao = tipo_protesto_negociacao;
	}
	public void setQtde_dias_protesto(Integer qtde_dias_protesto) {
		this.qtde_dias_protesto = qtde_dias_protesto;
	}
	public void setTipo_decurso_prazo(String tipo_decurso_prazo) {
		this.tipo_decurso_prazo = tipo_decurso_prazo;
	}
	public void setQtde_dias_decurso(Integer qtde_dias_decurso) {
		this.qtde_dias_decurso = qtde_dias_decurso;
	}
	public void setTipo_emissao_papeleta(String tipo_emissao_papeleta) {
		this.tipo_emissao_papeleta = tipo_emissao_papeleta;
	}
	public void setQtde_parcelas(Integer qtde_parcelas) {
		this.qtde_parcelas = qtde_parcelas;
	}
	public void setPerc_juros(Integer perc_juros) {
		this.perc_juros = perc_juros;
	}
	public void setValor_juros(Integer valor_juros) {
		this.valor_juros = valor_juros;
	}
	public void setQtde_dias_juros(Integer qtde_dias_juros) {
		this.qtde_dias_juros = qtde_dias_juros;
	}
	public void setPerc_multa_atraso(Integer perc_multa_atraso) {
		this.perc_multa_atraso = perc_multa_atraso;
	}
	public void setValor_multa_atraso(Integer valor_multa_atraso) {
		this.valor_multa_atraso = valor_multa_atraso;
	}
	public void setQtde_dias_multa_atraso(Integer qtde_dias_multa_atraso) {
		this.qtde_dias_multa_atraso = qtde_dias_multa_atraso;
	}
	public void setPerc_desconto_1(Integer perc_desconto_1) {
		this.perc_desconto_1 = perc_desconto_1;
	}
	public void setValor_desconto_1(Integer valor_desconto_1) {
		this.valor_desconto_1 = valor_desconto_1;
	}
	public void setData_limite_desconto_1(Date data_limite_desconto_1) {
		this.data_limite_desconto_1 = data_limite_desconto_1;
	}
	public void setPerc_desconto_2(Integer perc_desconto_2) {
		this.perc_desconto_2 = perc_desconto_2;
	}
	public void setValor_desconto_2(Integer valor_desconto_2) {
		this.valor_desconto_2 = valor_desconto_2;
	}
	public void setData_limite_desconto_2(Date data_limite_desconto_2) {
		this.data_limite_desconto_2 = data_limite_desconto_2;
	}
	public void setPerc_desconto_3(Integer perc_desconto_3) {
		this.perc_desconto_3 = perc_desconto_3;
	}
	public void setValor_desconto_3(Integer valor_desconto_3) {
		this.valor_desconto_3 = valor_desconto_3;
	}
	public void setData_limite_desconto_3(Date data_limite_desconto_3) {
		this.data_limite_desconto_3 = data_limite_desconto_3;
	}
	public void setTipo_bonificacao(String tipo_bonificacao) {
		this.tipo_bonificacao = tipo_bonificacao;
	}
	public void setPerc_desc_bonificacao(Integer perc_desc_bonificacao) {
		this.perc_desc_bonificacao = perc_desc_bonificacao;
	}
	public void setValor_desc_bonificacao(Integer valor_desc_bonificacao) {
		this.valor_desc_bonificacao = valor_desc_bonificacao;
	}
	public void setData_limite_desc_bonificacao(Date data_limite_desc_bonificacao) {
		this.data_limite_desc_bonificacao = data_limite_desc_bonificacao;
	}
	public void setValor_abatimento(Integer valor_abatimento) {
		this.valor_abatimento = valor_abatimento;
	}
	public void setValor_iof(Integer valor_iof) {
		this.valor_iof = valor_iof;
	}
	public void setSequencia_registro(String sequencia_registro) {
		this.sequencia_registro = sequencia_registro;
	}
	public void setSacador_avalista(Buyer sacador_avalista) {
		this.sacador_avalista = sacador_avalista;
	}
}