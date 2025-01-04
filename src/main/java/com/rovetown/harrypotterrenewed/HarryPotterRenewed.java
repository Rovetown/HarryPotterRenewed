/*
 *
 *  * Copyright © 2025-2025, Rovetown. All rights reserved.
 *  *
 *  * This mod is inspired by the Harry Potter series, created by J.K. Rowling and owned by Warner Brothers Entertainment.
 *  * All intellectual property related to Harry Potter, Hogwarts, and associated elements remains the property of
 *  * J.K. Rowling and Warner Brothers Entertainment.
 *  *
 *  * All code within this project is written by Rovetown unless explicitly stated otherwise. This includes assets and
 *  * custom implementations unless external libraries or third-party packages are used. Examples of external libraries
 *  * include, but are not limited to, Geckolib and the Architectury API.
 *  *
 *  * This software is distributed under fair use guidelines for educational or entertainment purposes. No commercial
 *  * exploitation of the Harry Potter intellectual property is intended or allowed.
 *
 *
 */
package com.rovetown.harrypotterrenewed;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HarryPotterRenewed implements ModInitializer {
	public static final String MOD_ID = "harrypotterrenewed";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.warn("HARRY POTTER RENEWED INITIALIZED!");
	}
}