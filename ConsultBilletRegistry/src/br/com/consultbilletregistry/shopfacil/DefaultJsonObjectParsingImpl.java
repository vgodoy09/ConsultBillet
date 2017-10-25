package br.com.consultbilletregistry.shopfacil;

import org.codehaus.jackson.map.ObjectMapper;

import br.com.consultbilletregistry.model.BilletRegistryResponse;

public class DefaultJsonObjectParsingImpl implements ObjectParsing {


	@Override
	public BilletRegistryResponse parse(String response) {
		BilletRegistryResponse readValue = null;
		try {
			readValue = new ObjectMapper().readValue(response, BilletRegistryResponse.class);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return readValue;
	}

}
