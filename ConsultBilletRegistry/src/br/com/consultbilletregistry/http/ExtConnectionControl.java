/**
 * Este arquivo pertence ao acerto intelectual da Rede Novo Tempo de Comunica��o.
 */
package br.com.consultbilletregistry.http;

import java.net.URLConnection;

/**
 * "Falar � f�cil. Mostre-me o c�digo." - Linus Torvalds
 * "A perfei��o � atingida n�o quando n�o se tem mais o que colocar, mas sim quando n�o se tem mais o que tirar." - Antoine de Saint-Exup�ry
 * "Existem duas maneiras de construir um projeto de software. Uma � faz�-lo t�o simples que obviamente n�o h� falhas. A outra � faz�-lo t�o complicado que n�o existem falhas �bvias." - C.A.R. Hoare
 * 
 * @author eduardo
 * Nov 30, 2016 2:01:28 PM
 * 
 */
public interface ExtConnectionControl {

	/**
	 * Interceptador antes da conex�o
	 * @param urlConnection
	 */
	void beforeConnection(URLConnection urlConnection);
	
	/**
	 * Interceptador p�stumo da conex�o
	 * @param code
	 * @param data
	 * @param exception
	 */
	void afterConnection(Integer code, String data, Exception exception);
	
}