package br.com.consultbilletregistry.utils;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * Classe utilit�ria que manipula n�meros,
 * valores de dinheiro, e internacionalizado
 * @author eduardo.silva
 */
public final class NumberUtils {

	private NumberFormat numberFormat;
	private Locale locale;
	
	/**
	 * Cria uma int�ncia da classe com 
	 * localiza��o din�mica para a internacionaliza��o.
	 * @param locale
	 */
	public NumberUtils(Locale locale) {
		this.locale = locale;

		if (locale == null) {
			throw new IllegalArgumentException("A localiza��o da classe utilit�ria deve ser informada");
		}
		
		//Instancia as classes internas para uso da internacionaliza��o
		numberFormat = NumberFormat.getInstance(locale);
		numberFormat.setMinimumFractionDigits(2);
		numberFormat.setMaximumFractionDigits(2);
	}
	
	/**
	 * Formata um n�mero de acordo com a localiza��o,
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
	 * Formata n�mero, e 
	 * se o valor de noNegative for true
	 * tira o sinal de negativo p�e o n�mero entre par�ntesis
	 * @param number
	 * @param noNegative
	 * @return
	 */
	public String formatMoneyValue(Number number, boolean noNegative) {
		
		String formattedNumber = formatMoneyValue(number);
		
		//Se o n�mero for negativo, formata
		if (noNegative && formattedNumber.contains("-")) {
			//Retira o sinal de negativo
			formattedNumber = formattedNumber.replaceFirst("-", "");
			//Adiciona o par�ntesis
			formattedNumber = String.format("(%s)", formattedNumber);
		}
		return formattedNumber;
	}

	/**
	 * Retorna a localiza��o utilizada para a internacionaliza��o
	 * @return
	 */
	public Locale getLocale() {
		return locale;
	}

	/**
	 * Altera a localidade da internacionaliza��o
	 * @param locale
	 */
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
}
