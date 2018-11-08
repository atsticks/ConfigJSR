/*
 * Copyright (c) 2016-2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package org.eclipse.configjsr.configsources;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.config.spi.ConfigSource;

/**
 * @author <a href="mailto:struberg@apache.org">Mark Struberg</a>
 */
public class SampleYamlConfigSource implements ConfigSource {
    private Map<String, String> config = new HashMap<>();

    public SampleYamlConfigSource(URL url) {
        config.put("tck.config.test.sampleyaml.key1", "yamlvalue1");
    }

    @Override
    public int getOrdinal() {
        return 110;
    }

    @Override
    public Map<String, String> getProperties() {
        return config;
    }

    @Override
    public String getValue(String key) {
        return config.get(key);
    }

    @Override
    public String getName() {
        return null;
    }

}
