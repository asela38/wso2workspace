package com.tools;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.synapse.MessageContext; 
import org.apache.synapse.mediators.AbstractMediator;

public class InfiniteLoopMediator extends AbstractMediator { 
	
	private static Logger logger = Logger.getGlobal();

	public boolean mediate(MessageContext context) { 
		logger.log(Level.ALL, "InfiniteLoopMediator got the message context");
		while(true) {
			System.out.println("Looping");
		}
	}
}
