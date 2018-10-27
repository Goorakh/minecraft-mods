package com.gorakh.slabsandstairs.handlers;

import com.gorakh.slabsandstairs.init.BlockInit;

public class RegistryHandler 
{
	public static void Client()
	{
		
	}
	
	public static void Common()
	{		
		BlockInit.init();
		BlockInit.register();
	}
}
