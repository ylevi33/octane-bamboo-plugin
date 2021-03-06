/*
 *     Copyright 2017 EntIT Software LLC, a Micro Focus company, L.P.
 *     Licensed under the Apache License, Version 2.0 (the "License");
 *     you may not use this file except in compliance with the License.
 *     You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *     Unless required by applicable law or agreed to in writing, software
 *     distributed under the License is distributed on an "AS IS" BASIS,
 *     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *     See the License for the specific language governing permissions and
 *     limitations under the License.
 *
 */

package com.hp.octane.plugins.bamboo.api;

public interface OctaneConfigurationKeys {
	String PLUGIN_PREFIX = "com.hp.octane.plugins.bamboo.";
	String OCTANE_URL = PLUGIN_PREFIX + "octaneUrl";
	String ACCESS_KEY = PLUGIN_PREFIX + "accessKey";
	String API_SECRET = PLUGIN_PREFIX + "apiSecret";
	String IMPERSONATION_USER = PLUGIN_PREFIX + "userName";
	String SHARED_SPACE_ID = PLUGIN_PREFIX + "sharedSpaceId";
	String UUID = "uuid";
}
