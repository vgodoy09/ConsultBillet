/**
 * Este arquivo pertence ao acerto intelectual da Rede Novo Tempo de Comunicação.
 */
package br.com.consultbilletregistry.http;

import java.net.URLConnection;

/**
 * "Falar é fácil. Mostre-me o código." - Linus Torvalds
 * "A perfeição é atingida não quando não se tem mais o que colocar, mas sim quando não se tem mais o que tirar." - Antoine de Saint-Exupéry
 * "Existem duas maneiras de construir um projeto de software. Uma é fazê-lo tão simples que obviamente não há falhas. A outra é fazê-lo tão complicado que não existem falhas óbvias." - C.A.R. Hoare
 * 
 * @author eduardo
 * Nov 30, 2016 2:01:28 PM
 * 
 */
public interface ExtConnectionControl {

	/**
	 * Interceptador antes da conexão
	 * @param urlConnection
	 */
	void beforeConnection(URLConnection urlConnection);
	
	/**
	 * Interceptador póstumo da conexão
	 * @param code
	 * @param data
	 * @param exception
	 */
	void afterConnection(Integer code, String data, Exception exception);
	
}