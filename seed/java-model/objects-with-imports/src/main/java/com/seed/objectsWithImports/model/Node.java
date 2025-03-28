/**
 * This file was auto-generated by Fern from our API Definition.
 */
package com.seed.objectsWithImports.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.seed.objectsWithImports.core.ObjectMappers;
import com.seed.objectsWithImports.model.commons.metadata.Metadata;
import java.util.Objects;
import java.util.Optional;

@JsonInclude(JsonInclude.Include.NON_ABSENT)
@JsonDeserialize(builder = Node.Builder.class)
public final class Node {
    private final String id;

    private final Optional<String> label;

    private final Optional<Metadata> metadata;

    private Node(String id, Optional<String> label, Optional<Metadata> metadata) {
        this.id = id;
        this.label = label;
        this.metadata = metadata;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("label")
    public Optional<String> getLabel() {
        return label;
    }

    @JsonProperty("metadata")
    public Optional<Metadata> getMetadata() {
        return metadata;
    }

    @java.lang.Override
    public boolean equals(Object other) {
        if (this == other) return true;
        return other instanceof Node && equalTo((Node) other);
    }

    private boolean equalTo(Node other) {
        return id.equals(other.id) && label.equals(other.label) && metadata.equals(other.metadata);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(this.id, this.label, this.metadata);
    }

    @java.lang.Override
    public String toString() {
        return ObjectMappers.stringify(this);
    }

    public static IdStage builder() {
        return new Builder();
    }

    public interface IdStage {
        _FinalStage id(String id);

        Builder from(Node other);
    }

    public interface _FinalStage {
        Node build();

        _FinalStage label(Optional<String> label);

        _FinalStage label(String label);

        _FinalStage metadata(Optional<Metadata> metadata);

        _FinalStage metadata(Metadata metadata);
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder implements IdStage, _FinalStage {
        private String id;

        private Optional<Metadata> metadata = Optional.empty();

        private Optional<String> label = Optional.empty();

        private Builder() {}

        @java.lang.Override
        public Builder from(Node other) {
            id(other.getId());
            label(other.getLabel());
            metadata(other.getMetadata());
            return this;
        }

        @java.lang.Override
        @JsonSetter("id")
        public _FinalStage id(String id) {
            this.id = Objects.requireNonNull(id, "id must not be null");
            return this;
        }

        @java.lang.Override
        public _FinalStage metadata(Metadata metadata) {
            this.metadata = Optional.ofNullable(metadata);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "metadata", nulls = Nulls.SKIP)
        public _FinalStage metadata(Optional<Metadata> metadata) {
            this.metadata = metadata;
            return this;
        }

        @java.lang.Override
        public _FinalStage label(String label) {
            this.label = Optional.ofNullable(label);
            return this;
        }

        @java.lang.Override
        @JsonSetter(value = "label", nulls = Nulls.SKIP)
        public _FinalStage label(Optional<String> label) {
            this.label = label;
            return this;
        }

        @java.lang.Override
        public Node build() {
            return new Node(id, label, metadata);
        }
    }
}
