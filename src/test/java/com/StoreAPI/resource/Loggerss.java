package com.StoreAPI.resource;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Loggerss 
{
	public static Logger getLoggers(Class<?>clazz)
	{
		return LogManager.getLogger();
	}
}
