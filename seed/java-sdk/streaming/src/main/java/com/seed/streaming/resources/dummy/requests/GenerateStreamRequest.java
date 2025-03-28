/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.streaming.resources.dummy.requests;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seed.streaming.core.ObjectMappers;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = GenerateStreamRequest.Builder.class)
public final class GenerateStreamRequest {
    private final int numEvents;

    private final Map<String, Object> additionalProperties;

    private GenerateStreamRequest(int numEvents, Map<String, Object> additionalProperties) {
        this.numEvents = numEvents;
        this.additionalProperties = additionalProperties;
    }

    @JsonProperty("stream")
    public Boolean getStream() {
        return true;
    }

    @JsonProperty("num_events")
    public int getNumEvents() {
        return numEvents;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof GenerateStreamRequest && equalTo((GenerateStreamRequest) other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    private boolean equalTo(GenerateStreamRequest other) {
        return numEvents == other.numEvents;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.numEvents);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static NumEventsStage builder() {
        return new Builder();
    }

    public interface NumEventsStage {
        _FinalStage numEvents(int numEvents);

        Builder from(GenerateStreamRequest other);
    }

    public interface _FinalStage {
        GenerateStreamRequest build();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements NumEventsStage, _FinalStage {
        private int numEvents;

        @JsonAnySetter
        private Map<String, Object> additionalProperties = new HashMap<>();

        private Builder() {}

        @java.lang.Override
        public Builder from(GenerateStreamRequest other) {
            numEvents(other.getNumEvents());
            return this;
        }

        @java.lang.Override
        @JsonSetter("num_events")
        public _FinalStage numEvents(int numEvents) {
            this.numEvents = numEvents;
            return this;
        }

        @java.lang.Override
        public GenerateStreamRequest build() {
            return new GenerateStreamRequest(numEvents, additionalProperties);
        }
    }
}
