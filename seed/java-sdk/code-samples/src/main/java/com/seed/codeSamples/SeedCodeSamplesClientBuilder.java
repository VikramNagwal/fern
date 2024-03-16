/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.codeSamples;

import com.seed.codeSamples.core.ClientOptions;
import com.seed.codeSamples.core.Environment;

public final class SeedCodeSamplesClientBuilder {
    private ClientOptions.Builder clientOptionsBuilder = ClientOptions.builder();

    private Environment environment;

    public SeedCodeSamplesClientBuilder url(String url) {
        this.environment = Environment.custom(url);
        return this;
    }

    public SeedCodeSamplesClient build() {
        clientOptionsBuilder.environment(this.environment);
        return new SeedCodeSamplesClient(clientOptionsBuilder.build());
    }
}