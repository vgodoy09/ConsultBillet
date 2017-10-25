package br.com.consultbilletregistry.shopfacil;

import br.com.consultbilletregistry.model.BilletRegistryResponse;

public interface ObjectParsing {
	BilletRegistryResponse parse(String response);
}