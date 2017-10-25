package br.com.consultbilletregistry.facade;

import br.com.consultbilletregistry.model.BilletRegistryRequest;
import br.com.consultbilletregistry.model.BilletRegistryResponse;

public interface Facade {
	public BilletRegistryResponse getBilletRegistry(BilletRegistryRequest billetRequest);
}
