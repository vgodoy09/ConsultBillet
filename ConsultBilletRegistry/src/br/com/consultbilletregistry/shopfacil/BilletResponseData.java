package br.com.consultbilletregistry.shopfacil;

import br.com.consultbilletregistry.model.BilletRegistryResponse;

public interface BilletResponseData {

	public abstract int getCode();

	public abstract BilletRegistryResponse getData();

}