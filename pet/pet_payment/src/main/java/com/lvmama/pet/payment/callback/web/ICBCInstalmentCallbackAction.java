package com.lvmama.pet.payment.callback.web;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.lvmama.pet.payment.callback.data.CallbackData;
import com.lvmama.pet.payment.callback.data.ICBCInstalmentCallbackData;

@Results( {
	@Result(name = "order_success", location = "/WEB-INF/pages/common/order_pay_detail.ftl", type = "freemarker")
	})
/**
 * 工行分期支付回调
 */
public class ICBCInstalmentCallbackAction  extends CallbackBaseAction {

	
	
	/**
	 * @author ZHANG Nan
	 */
	private static final long serialVersionUID = -3878246147581791405L;

	@Action("/pay/icbc_instalment_callback")
	public String execute() {
		return callback(true);
	}
	
	@Override
	CallbackData getCallbackData() {
		return new ICBCInstalmentCallbackData(getPureParaPair());
	}

}
