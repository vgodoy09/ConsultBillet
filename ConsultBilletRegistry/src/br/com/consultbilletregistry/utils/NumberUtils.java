package br.com.consultbilletregistry.utils;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Classe utilitária que manipula números,
 * valores de dinheiro, e internacionalizado
 * @author eduardo.silva
 */
public final class NumberUtils {

	private NumberFormat numberFormat;
	private Locale locale;
	
	/**
	 * Cria uma intância da classe com 
	 * localização dinâmica para a internacionalização.
	 * @param locale
	 */
	public NumberUtils(Locale locale) {
		this.locale = locale;

		if (locale == null) {
			throw new IllegalArgumentException("A localização da classe utilitária deve ser informada");
		}
		
		//Instancia as classes internas para uso da internacionalização
		numberFormat = NumberFormat.getInstance(locale);
		numberFormat.setMinimumFractionDigits(2);
		numberFormat.setMaximumFractionDigits(2);
	}
	
	/**
	 * Formata um número de acordo com a localização,
	 * @param number
	 * @return
	 */
	public String formatMoneyValue(Number number) {
		String formattedNumber = numberFormat.format(number);
		formattedNumber = String.format("%s", formattedNumber);
		
		return formattedNumber;
	}
	/**
	 * 
	 * @param number
	 * @return
	 */
	public String moneyValueTwoDecimal(Number number) {
		String formattedNumber = String.format("%.2f", number);
		formattedNumber = formattedNumber.replaceAll(",", ".");
		Double convertDouble = Double.parseDouble(formattedNumber);
		
		return formatMoneyValue(convertDouble);
	}
	/**
	 * Formata número, e 
	 * se o valor de noNegative for true
	 * tira o sinal de negativo põe o número entre parêntesis
	 * @param number
	 * @param noNegative
	 * @return
	 */
	public String formatMoneyValue(Number number, boolean noNegative) {
		
		String formattedNumber = formatMoneyValue(number);
		
		//Se o número for negativo, formata
		if (noNegative && formattedNumber.contains("-")) {
			//Retira o sinal de negativo
			formattedNumber = formattedNumber.replaceFirst("-", "");
			//Adiciona o parêntesis
			formattedNumber = String.format("(%s)", formattedNumber);
		}
		return formattedNumber;
	}

	/**
	 * Retorna a localização utilizada para a internacionalização
	 * @return
	 */
	public Locale getLocale() {
		return locale;
	}

	/**
	 * Altera a localidade da internacionalização
	 * @param locale
	 */
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
}
