/**
 * Este arquivo pertence ao acerto intelectual da Rede Novo Tempo de Comunica��o.
 */
package br.com.consultbilletregistry.shopfacil;

import java.net.HttpURLConnection;
import java.net.URLConnection;

import br.com.consultbilletregistry.http.ExtConnectionControl;
import br.com.consultbilletregistry.model.BilletRegistryResponse;

/**
 * "Falar � f�cil. Mostre-me o c�digo." - Linus Torvalds
 * "A perfei��o � atingida n�o quando n�o se tem mais o que colocar, mas sim quando n�o se tem mais o que tirar." - Antoine de Saint-Exup�ry
 * "Existem duas maneiras de construir um projeto de software. Uma � faz�-lo t�o simples que obviamente n�o h� falhas. A outra � faz�-lo t�o complicado que n�o existem falhas �bvias." - C.A.R. Hoare
 * 
 * Esta classe configura interceptores do registro do boleto via Shop F�cil
 * 
 * @author eduardo
 * Nov 30, 2016 2:31:00 PM
 * 
 */
public class ShopFacilExtConnectionControl implements ExtConnectionControl {

	private final ObjectParsing objectParsing;
	
	private BilletRegistryResponse parse;

	public ShopFacilExtConnectionControl(ObjectParsing objectParsing) {
		this.objectParsing = objectParsing;
	}
	
	public BilletRegistryResponse getReturnShopFacil() {
		return parse;
	}
	
	@Override
	public void beforeConnection(URLConnection urlConnection) {
	}


	@Override
	public void afterConnection(Integer code, String data, Exception exception) {
		if(code == HttpURLConnection.HTTP_CREATED || code == HttpURLConnection.HTTP_OK) {
			parse = objectParsing.parse(data);
		}
		System.out.println(data);
	}
}