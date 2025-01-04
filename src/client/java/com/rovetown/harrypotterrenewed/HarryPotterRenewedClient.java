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

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HarryPotterRenewedClient implements ClientModInitializer {
	/**
	 * Logger instance for logging messages from the HarryPotterRenewedClient class.
	 * This is used to provide runtime feedback in the console, helping developers
	 * and users identify the state of the client (e.g., successful initialization).
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(HarryPotterRenewed.class);

	/**
	 * Sets a custom logger, primarily for testing purposes.
	 *
	 * @param logger the new logger
	 */
	public static void setLogger(Logger logger) {
		LOGGER = logger;
	}

	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.

		// Log to the console that the client has been initialized successfully.
		LOGGER.warn("Harry Potter Renewed Client has been initialized successfully!");
	}
}
