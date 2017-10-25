package br.com.consultbilletregistry.utils;

/**
 * Classe Utilitária para auxiliar na substituição de caracteres em uma frase.
 * @author eduardo.silva
 *
 */
public class StringReplacement {

	/**
	 * Substitui cada caractere que vai sair pelo caractere que vai entrar na mensagem informada
	 * @param leavingCharacteres
	 * @param replacingCharacters
	 * @param message
	 * @return a mensagem com a substituição ou a própria mensagem caso algum parâmetro venha como nulo
	 */
	public static String replace(String leavingCharacteres, String replacingCharacters, String message) {
		if(replacingCharacters == null || leavingCharacteres == null || message == null) {
			return message;
		}
		return message.replaceAll("[" + leavingCharacteres + "]", replacingCharacters);
	}
}