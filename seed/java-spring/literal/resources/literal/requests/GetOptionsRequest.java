/**
 * This file was auto-generated by Fern from our API Definition.
 */

package resources.literal.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import core.ObjectMappers;
import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;

public final class GetOptionsRequest {
  private GetOptionsRequest() {
  }

  @JsonProperty("dryRun")
  public Boolean getDryRun() {
    return true;
  }

  @java.lang.Override
  public boolean equals(Object other) {
    if (this == other) return true;
    return other instanceof GetOptionsRequest;
  }

  @java.lang.Override
  public String toString() {
    return ObjectMappers.stringify(this);
  }
}