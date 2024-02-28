/**
 * This file was auto-generated by Fern from our API Definition.
 */

package types;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import core.ObjectMappers;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonDeserialize(
    builder = SendResponse.Builder.class
)
public final class SendResponse {
  private final String message;

  private final int status;

  private SendResponse(String message, int status) {
    this.message = message;
    this.status = status;
  }

  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  @JsonProperty("status")
  public int getStatus() {
    return status;
  }

  @JsonProperty("success")
  public Boolean getSuccess() {
    return true;
  }

  @java.lang.Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof SendResponse && equalTo((SendResponse) other);
  }

  private boolean equalTo(SendResponse other) {
    return message.equals(other.message) && status == other.status;
  }

  @java.lang.Override
  public int hashCode() {
    return Objects.hash(this.message, this.status);
  }

  @java.lang.Override
  public String toString() {
    return ObjectMappers.stringify(this);
  }

  public static MessageStage builder() {
    return new Builder();
  }

  public interface MessageStage {
    StatusStage message(String message);

    Builder from(SendResponse other);
  }

  public interface StatusStage {
    _FinalStage status(int status);
  }

  public interface _FinalStage {
    SendResponse build();
  }

  @JsonIgnoreProperties(
      ignoreUnknown = true
  )
  public static final class Builder implements MessageStage, StatusStage, _FinalStage {
    private String message;

    private int status;

    private Builder() {
    }

    @java.lang.Override
    public Builder from(SendResponse other) {
      message(other.getMessage());
      status(other.getStatus());
      return this;
    }

    @java.lang.Override
    @JsonSetter("message")
    public StatusStage message(String message) {
      this.message = message;
      return this;
    }

    @java.lang.Override
    @JsonSetter("status")
    public _FinalStage status(int status) {
      this.status = status;
      return this;
    }

    @java.lang.Override
    public SendResponse build() {
      return new SendResponse(message, status);
    }
  }
}