package com.wso2.training;

import org.apache.synapse.MessageContext; 
import org.apache.synapse.mediators.AbstractMediator;

public class TransactionsMediator extends AbstractMediator { 

	public boolean mediate(MessageContext context) {
		 
		System.out.println("MyMediator:" + context.getEnvelope().toString());

		return true;
	}
}
