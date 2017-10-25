/**
 * Este arquivo pertence ao acerto intelectual da Rede Novo Tempo de Comunicação.
 */
package br.com.consultbilletregistry.shopfacil;

import java.net.HttpURLConnection;
import java.net.URLConnection;

import br.com.consultbilletregistry.http.ExtConnectionControl;
import br.com.consultbilletregistry.model.BilletRegistryResponse;

/**
 * "Falar é fácil. Mostre-me o código." - Linus Torvalds
 * "A perfeição é atingida não quando não se tem mais o que colocar, mas sim quando não se tem mais o que tirar." - Antoine de Saint-Exupéry
 * "Existem duas maneiras de construir um projeto de software. Uma é fazê-lo tão simples que obviamente não há falhas. A outra é fazê-lo tão complicado que não existem falhas óbvias." - C.A.R. Hoare
 * 
 * Esta classe configura interceptores do registro do boleto via Shop Fácil
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