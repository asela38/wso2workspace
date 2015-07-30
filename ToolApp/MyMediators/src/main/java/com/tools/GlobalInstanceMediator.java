package com.tools;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.synapse.MessageContext; 
import org.apache.synapse.mediators.AbstractMediator;

public class GlobalInstanceMediator extends AbstractMediator { 
	
	private static Logger logger = Logger.getGlobal();
	
	private Map<String, MessageContext> map = new HashMap<>();

	public boolean mediate(MessageContext context) { 
		logger.log(Level.ALL, "GlobalInstanceMediator got the message context");		
		logger.log(Level.ALL, "Context Added to the Map ", context.getMessageID());
		map.put(context.getMessageID(), context);
		
		return true;
	}
}
