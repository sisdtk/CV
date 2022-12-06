/*
 * All MRM packages REST API
 * <h2>All MRM packages REST API</h1>
 *
 * The version of the OpenAPI document: 1.0.0-SNAPSHOT
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package admin.api.MRM.externalAPI.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ForkGatewayValidationResultsAllOf
 */

public class ForkGatewayValidationResultsAllOf
{
  public static final String SERIALIZED_NAME_INCOMING = "incoming";
  @SerializedName(SERIALIZED_NAME_INCOMING)
  private String incoming;

  public static final String SERIALIZED_NAME_OUTGOING = "outgoing";
  @SerializedName(SERIALIZED_NAME_OUTGOING)
  private List<String> outgoing = null;

  public static final String SERIALIZED_NAME_DEFAULT_OUTGOING = "defaultOutgoing";
  @SerializedName(SERIALIZED_NAME_DEFAULT_OUTGOING)
  private String defaultOutgoing;

  public static final String SERIALIZED_NAME_DECISION = "decision";
  @SerializedName(SERIALIZED_NAME_DECISION)
  private NonGenericDecision decision;


  public ForkGatewayValidationResultsAllOf incoming(String incoming)
  {

    this.incoming = incoming;
    return this;
  }

  /**
   * @return incoming
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIncoming()
  {
    return incoming;
  }


  public void setIncoming(String incoming)
  {
    this.incoming = incoming;
  }


  public ForkGatewayValidationResultsAllOf outgoing(List<String> outgoing)
  {

    this.outgoing = outgoing;
    return this;
  }

  public ForkGatewayValidationResultsAllOf addOutgoingItem(String outgoingItem)
  {
    if (this.outgoing == null)
    {
      this.outgoing = new ArrayList<String>();
    }
    this.outgoing.add(outgoingItem);
    return this;
  }

  /**
   * @return outgoing
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getOutgoing()
  {
    return outgoing;
  }


  public void setOutgoing(List<String> outgoing)
  {
    this.outgoing = outgoing;
  }


  public ForkGatewayValidationResultsAllOf defaultOutgoing(String defaultOutgoing)
  {

    this.defaultOutgoing = defaultOutgoing;
    return this;
  }

  /**
   * @return defaultOutgoing
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefaultOutgoing()
  {
    return defaultOutgoing;
  }


  public void setDefaultOutgoing(String defaultOutgoing)
  {
    this.defaultOutgoing = defaultOutgoing;
  }


  public ForkGatewayValidationResultsAllOf decision(NonGenericDecision decision)
  {

    this.decision = decision;
    return this;
  }

  /**
   * Get decision
   *
   * @return decision
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NonGenericDecision getDecision()
  {
    return decision;
  }


  public void setDecision(NonGenericDecision decision)
  {
    this.decision = decision;
  }


  @Override
  public boolean equals(Object o)
  {
    if (this == o)
    {
      return true;
    }
    if (o == null || getClass() != o.getClass())
    {
      return false;
    }
    ForkGatewayValidationResultsAllOf forkGatewayValidationResultsAllOf = (ForkGatewayValidationResultsAllOf) o;
    return Objects.equals(this.incoming, forkGatewayValidationResultsAllOf.incoming) &&
            Objects.equals(this.outgoing, forkGatewayValidationResultsAllOf.outgoing) &&
            Objects.equals(this.defaultOutgoing, forkGatewayValidationResultsAllOf.defaultOutgoing) &&
            Objects.equals(this.decision, forkGatewayValidationResultsAllOf.decision);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(incoming, outgoing, defaultOutgoing, decision);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ForkGatewayValidationResultsAllOf {\n");
    sb.append("    incoming: ").append(toIndentedString(incoming)).append("\n");
    sb.append("    outgoing: ").append(toIndentedString(outgoing)).append("\n");
    sb.append("    defaultOutgoing: ").append(toIndentedString(defaultOutgoing)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o)
  {
    if (o == null)
    {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
