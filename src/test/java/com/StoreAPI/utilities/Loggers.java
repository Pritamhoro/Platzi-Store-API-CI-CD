package com.StoreAPI.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;

public class Loggers 
{
	public static Logger GetLogger(Class<?>clazz)
	{
		return (Logger) LogManager.getLogger();
	}
}
