/* 
 * PaymentQuickPayException.java  
 * 
 * version TODO
 *
 * 2016年10月11日 
 * 
 * Copyright (c) 2016,zlebank.All rights reserved.
 * 
 */
package com.zlebank.zplatform.payment.exception;

import com.zlebank.zplatform.payment.commons.exception.AbstractAccountPayDescException;

/**
 * Class Description
 *
 * @author guojia
 * @version
 * @date 2016年10月11日 下午5:10:06
 * @since 
 */
public class PaymentAccountPayException extends AbstractAccountPayDescException{

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 4634586182669271478L;
	private String code;
	/**
	 *
	 * @return
	 */
	@Override
	public String getCode() {
		// TODO Auto-generated method stub
		return code;
	}
	
	public PaymentAccountPayException(String code,Object ... para ) {
        this.params = para;
        this.code = code;
    }
	
	public PaymentAccountPayException(String code) {
        this.code = code;
    }
	/**
	 * 
	 */
	public PaymentAccountPayException() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
