/**
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
package com.seyren.core.util.config;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Fix this one.
 * The config file needs to be loaded.
 * 
 */
@Ignore
public class SeyrenConfigPropertyFileTest {

    private SeyrenConfig config;

    @Before
    public void before() {
        config = new SeyrenConfig();
    }

    @Test
    public void defaultBaseUrlIsCorrect() {
        if (config.isBaseUrlSetToDefault()) {
            assertThat(config.getBaseUrl(), is("http://localhost:9998"));
        }
    }

    @Test
    public void defaultMongoUrlIsCorrect() {
        assertThat(config.getMongoUrl(), is("mongodb://localhost:27017/seyren"));
    }

    @Test
    public void defaultGraphiteUrlIsCorrect() {
        assertThat(config.getGraphiteUrl(), is("http://localhost:9999"));
    }

    @Test
    public void defaultGraphiteUsernameIsCorrect() {
        assertThat(config.getGraphiteUsername(), is(""));
    }

    @Test
    public void defaultGraphitePasswordIsCorrect() {
        assertThat(config.getGraphitePassword(), is(""));
    }

    @Test
    public void defaultGraphiteSchemeIsCorrect() {
        assertThat(config.getGraphiteScheme(), is("http"));
    }

    @Test
    public void defaultGraphiteHostIsCorrect() {
        assertThat(config.getGraphiteHost(), is("localhost:9999"));
    }

    @Test
    public void defaultGraphitePathIsCorrect() {
        assertThat(config.getGraphitePath(), is(""));
    }

    @Test
    public void defaultGraphiteKeyStoreIsCorrect() {
        assertThat(config.getGraphiteKeyStore(), is(""));
    }

    @Test
    public void defaultGraphiteKeyStorePasswordIsCorrect() {
        assertThat(config.getGraphiteKeyStorePassword(), is(""));
    }

    @Test
    public void defaultGraphiteTrustStoreIsCorrect() {
        assertThat(config.getGraphiteTrustStore(), is(""));
    }

    @Test
    public void defaultSmtpFromIsCorrect() {
        assertThat(config.getSmtpFrom(), is("alert@seyren"));
    }

    @Test
    public void defaultSmtpUsernameIsCorrect() {
        assertThat(config.getSmtpUsername(), is(""));
    }

    @Test
    public void defaultSmtpPasswordIsCorrect() {
        assertThat(config.getSmtpPassword(), is(""));
    }

    @Test
    public void defaultSmtpHostIsCorrect() {
        assertThat(config.getSmtpHost(), is("localhost"));
    }

    @Test
    public void defaultSmtpProtocolIsCorrect() {
        assertThat(config.getSmtpProtocol(), is("smtp"));
    }

    @Test
    public void defaultSmtpPortIsCorrect() {
        assertThat(config.getSmtpPort(), is(25));
    }

    @Test
    public void defaultHipChatAuthTokenIsCorrect() {
        assertThat(config.getHipChatAuthToken(), is(""));
    }

    @Test
    public void defaultHipChatUsernameIsCorrect() {
        assertThat(config.getHipChatUsername(), is("Seyren Alert"));
    }

    @Test
    public void defaultPagerDutyDomainIsCorrect() {
        assertThat(config.getPagerDutyDomain(), is(""));
    }

    @Test
    public void defaultHubotUrlIsCorrect() {
        assertThat(config.getHubotUrl(), is(""));
    }

    @Test
    public void defaultFlowdockExternalUsernameIsCorrect() {
        assertThat(config.getFlowdockExternalUsername(), is("Seyren"));
    }

    @Test
    public void defaultFlowdockTagsIsCorrect() {
        assertThat(config.getFlowdockTags(), is(""));
    }

    @Test
    public void defaultFlowdockEmojisIsCorrect() {
        assertThat(config.getFlowdockEmojis(), is(""));
    }

    @Test
    public void defaultProxyUrlIsCorrect() {
        assertThat(config.getProxyUrl(), is("172.0.0.1"));
    }

    @Test
    public void defaultProxyUsernameIsCorrect() {
        assertThat(config.getProxyUsername(), is(""));
    }

    @Test
    public void defaultProxyPasswordIsCorrect() {
        assertThat(config.getProxyPassword(), is(""));
    }

    @Test
    public void defaultProxyPortIsCorrect() {
        assertThat(config.getProxyPort(), is(0));
    }

    @After
    public void after() {
        System.clearProperty("PROPERTY_FILENAME");
        System.setProperty("PROPERTY_FILENAME", "");
    }

}
