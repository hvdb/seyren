package com.seyren.core.service.notification;

import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.ProxyAuthenticationStrategy;

import com.seyren.core.util.config.SeyrenConfig;

public class CommonNotificationUtils {

    public static CloseableHttpClient getHttpClient(final SeyrenConfig seyrenConfig) {
        HttpClientBuilder clientBuilder = HttpClientBuilder.create();

        if (!StringUtils.isEmpty(seyrenConfig.getProxyUrl())) {
            Credentials cred = new UsernamePasswordCredentials(seyrenConfig.getProxyUsername(), seyrenConfig
                    .getProxyPassword());

            CredentialsProvider credsProvider = new BasicCredentialsProvider();
            credsProvider.setCredentials(new AuthScope(seyrenConfig.getProxyUrl(), seyrenConfig.getProxyPort()), cred);

            clientBuilder.useSystemProperties();
            clientBuilder.setProxy(new HttpHost(seyrenConfig.getProxyUrl(), seyrenConfig.getProxyPort()));
            clientBuilder.setDefaultCredentialsProvider(credsProvider);
            clientBuilder.setProxyAuthenticationStrategy(new ProxyAuthenticationStrategy());
        }

        return clientBuilder.build();

    }

}
