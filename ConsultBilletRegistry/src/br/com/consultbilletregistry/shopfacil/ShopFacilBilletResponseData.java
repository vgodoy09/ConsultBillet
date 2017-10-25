package br.com.consultbilletregistry.shopfacil;

import br.com.consultbilletregistry.http.ResponseData;
import br.com.consultbilletregistry.model.BilletRegistryResponse;


public class ShopFacilBilletResponseData implements BilletResponseData {

	private final ResponseData responseData;
	private final ShopFacilExtConnectionControl extControl;

	public ShopFacilBilletResponseData(ResponseData responseData, ShopFacilExtConnectionControl extControl) {
		this.responseData = responseData;
		this.extControl = extControl;
	}
	
	@Override
	public int getCode() {
		return responseData.getCode();
	}
	
	@Override
	public BilletRegistryResponse getData() {
		getCode();
		
		BilletRegistryResponse billetResponse = null;
		if(extControl != null) {
			billetResponse = extControl.getReturnShopFacil();
		}
		return billetResponse;
	}
	
	@Override
	public String toString() {
		return "BilletResponseData [responseData=" + responseData + "]";
	}
}