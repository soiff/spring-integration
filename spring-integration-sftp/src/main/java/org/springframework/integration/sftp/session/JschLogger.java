/*
 * Copyright 2002-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.integration.sftp.session;

import org.apache.log4j.Level;

import com.jcraft.jsch.Logger;

/**
 * @author Oleg Zhurakousky
 * @since 2.0.1
 */
class JschLogger implements Logger {
	
	private final static org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger("com.jcraft.jsch");

	public boolean isEnabled(int level) {
		return true;
	}

	public void log(int level, String message) {
		logger.log(Level.toLevel(level), message);
	}
}
