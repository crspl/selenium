// Licensed to the Software Freedom Conservancy (SFC) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The SFC licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.


package org.openqa.selenium.server.browserlaunchers;

import org.apache.commons.logging.Log;
import org.openqa.jetty.log.LogFactory;

/**
 * {@link org.openqa.selenium.server.browserlaunchers.SafariLauncherIntegrationTest} integration test class.
 */
public class LauncherFunctionalTestCase {

  private static final Log LOGGER = LogFactory.getLog(SafariLauncherIntegrationTest.class);
  private static final int SECONDS = 1000;
  private static final int WAIT_TIME = 15 * SECONDS;

  protected void launchBrowser(AbstractBrowserLauncher launcher) {
    launcher.launch("http://www.google.com");
    int seconds = 15;
    LOGGER.info("Killing browser in " + Integer.toString(seconds) + " seconds");
    Sleeper.sleepTight(WAIT_TIME);
    launcher.close();
    LOGGER.info("He's dead now, right?");
  }

}
