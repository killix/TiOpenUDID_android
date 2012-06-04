/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package net.iamyellow.TiOpenUDID;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
//import org.appcelerator.kroll.common.Log;
//import org.appcelerator.kroll.common.TiConfig;

import org.OpenUDID.OpenUDID_manager;


@Kroll.module(name="Tiopenudid", id="net.iamyellow.TiOpenUDID")
public class TiopenudidModule extends KrollModule
{

	// Standard Debugging variables
	//private static final String LCAT = "TiopenudidModule";
	//private static final boolean DBG = TiConfig.LOGD;
	private static String openUDID = null;

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;
	
	public TiopenudidModule()
	{
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app)
	{
		OpenUDID_manager.sync(app);
	}

	// Properties
	@Kroll.getProperty
	public String getUniqueID()
	{
		if (openUDID == null) {
			openUDID = OpenUDID_manager.getOpenUDID();
		}
		return openUDID;
	}	
}

