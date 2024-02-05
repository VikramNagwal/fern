/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.singleUrlEnvironmentDefault;

import com.seed.singleUrlEnvironmentDefault.core.ClientOptions;
import com.seed.singleUrlEnvironmentDefault.core.Environment;

public final class SeedSingleUrlEnvironmentDefaultClientBuilder {
    private ClientOptions.Builder clientOptionsBuilder = ClientOptions.builder();

    private String token = null;

    private Environment environment = Environment.PRODUCTION;

    /**
     * Sets token
     */
    public SeedSingleUrlEnvironmentDefaultClientBuilder token(String token) {
        this.token = token;
        return this;
    }

    public SeedSingleUrlEnvironmentDefaultClientBuilder environment(Environment environment) {
        this.environment = environment;
        return this;
    }

    public SeedSingleUrlEnvironmentDefaultClientBuilder url(String url) {
        this.environment = Environment.custom(url);
        return this;
    }

    public SeedSingleUrlEnvironmentDefaultClient build() {
        if (token == null) {
            throw new RuntimeException("Please provide token");
        }
        this.clientOptionsBuilder.addHeader("Authorization", "Bearer " + this.token);
        clientOptionsBuilder.environment(this.environment);
        return new SeedSingleUrlEnvironmentDefaultClient(clientOptionsBuilder.build());
    }
}