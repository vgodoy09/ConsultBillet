package br.com.consultbilletregistry.facade;

import br.com.consultbilletregistry.model.BilletRegistryRequest;
import br.com.consultbilletregistry.model.BilletRegistryResponse;
import br.com.consultbilletregistry.shopfacil.BilletRegistry;

public class FacadeSystem implements Facade{

	@Override
	public BilletRegistryResponse getBilletRegistry(BilletRegistryRequest billetRequest) {
		BilletRegistry billetRegistry = new BilletRegistry();
		return billetRegistry.registry(billetRequest).getData();
	}

}
