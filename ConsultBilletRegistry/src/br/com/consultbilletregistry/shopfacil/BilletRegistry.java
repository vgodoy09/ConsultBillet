package br.com.consultbilletregistry.shopfacil;

import static br.com.consultbilletregistry.utils.CheckInstanceObject.IsNull;

import java.net.URLConnection;

import br.com.consultbilletregistry.connection.UrlConnectionBuilder;
import br.com.consultbilletregistry.http.HttpMethod;
import br.com.consultbilletregistry.http.ResponseData;
import br.com.consultbilletregistry.http.UrlProtocolConnectionFactory;
import br.com.consultbilletregistry.http.abstraction.HttpUrlProtocolAbstraction;
import br.com.consultbilletregistry.model.BilletRegistryRequest;



public class BilletRegistry {

	public static final HttpMethod REQUEST_METHOD = HttpMethod.GET;
	public static final String HOMOLOG_URL_COMPLEMENT = "homolog.";
	public static final int CONNECTION_TIMEOUT = 10000;
	public static final String MERCHANT = "100006457";
	
	
	public static String SECURITY_KEY = "O-xxKp3hGZfIS1cD4inBR1aCcVdn57DdiCoSkVmz1fY";
	
	public String urlComplement = "";
	public String url = "";
	
	private ObjectParsing objectParsing = null;

	public BilletResponseData registry(BilletRegistryRequest requestData) {
		if(IsNull(requestData))
			return null;
		
		objectParsing = new DefaultJsonObjectParsingImpl();
		
		if(!requestData.isProduction()) {
			SECURITY_KEY = "XqY_0eCfCmH_v_todSwaUTYnbxFQfSntUiWFJBL9kR0";
			urlComplement = HOMOLOG_URL_COMPLEMENT;
		} 
		url = "https://" + urlComplement + "meiosdepagamentobradesco.com.br/apiregistro/api?nosso_numero="+requestData.getNosso_numero()+"&numero_documento="+requestData.getNumero_documento()+"";
		
		
		ShopFacilExtConnectionControl extControl  = new ShopFacilExtConnectionControl(objectParsing);
		
		HttpUrlProtocolAbstraction<? extends URLConnection> protocolAbstraction = UrlProtocolConnectionFactory.getOpenURLConnection(url);
		protocolAbstraction.setConnectionControl(extControl);
		UrlConnectionBuilder builder = new UrlConnectionBuilder(protocolAbstraction)
			.setHasInput(true)
			.setHasOutput(true)
			.setBase64Authorization(MERCHANT + ":" + SECURITY_KEY)
			.setRequestMethod(REQUEST_METHOD);
		
		ResponseData build = builder.setConnectionTimeout(CONNECTION_TIMEOUT).build();
		
		BilletResponseData billetResponseData = new ShopFacilBilletResponseData(build, extControl);
		return billetResponseData;
	}
}