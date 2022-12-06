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

import java.util.*;

/**
 * GenericDecisionResultAllOf
 */

public class GenericDecisionResultAllOf
{
  public static final String SERIALIZED_NAME_GATEWAY_ID = "gatewayId";
  @SerializedName(SERIALIZED_NAME_GATEWAY_ID)
  private String gatewayId;

  public static final String SERIALIZED_NAME_DECISION_NAME_TO_OUTGOING = "decisionNameToOutgoing";
  @SerializedName(SERIALIZED_NAME_DECISION_NAME_TO_OUTGOING)
  private Map<String, String> decisionNameToOutgoing = null;

  public static final String SERIALIZED_NAME_IGNORED_DECISIONS = "ignoredDecisions";
  @SerializedName(SERIALIZED_NAME_IGNORED_DECISIONS)
  private List<String> ignoredDecisions = null;


  public GenericDecisionResultAllOf gatewayId(String gatewayId)
  {

    this.gatewayId = gatewayId;
    return this;
  }

  /**
   * @return gatewayId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGatewayId()
  {
    return gatewayId;
  }


  public void setGatewayId(String gatewayId)
  {
    this.gatewayId = gatewayId;
  }


  public GenericDecisionResultAllOf decisionNameToOutgoing(Map<String, String> decisionNameToOutgoing)
  {

    this.decisionNameToOutgoing = decisionNameToOutgoing;
    return this;
  }

  public GenericDecisionResultAllOf putDecisionNameToOutgoingItem(String key, String decisionNameToOutgoingItem)
  {
    if (this.decisionNameToOutgoing == null)
    {
      this.decisionNameToOutgoing = new HashMap<String, String>();
    }
    this.decisionNameToOutgoing.put(key, decisionNameToOutgoingItem);
    return this;
  }

  /**
   * @return decisionNameToOutgoing
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getDecisionNameToOutgoing()
  {
    return decisionNameToOutgoing;
  }


  public void setDecisionNameToOutgoing(Map<String, String> decisionNameToOutgoing)
  {
    this.decisionNameToOutgoing = decisionNameToOutgoing;
  }


  public GenericDecisionResultAllOf ignoredDecisions(List<String> ignoredDecisions)
  {

    this.ignoredDecisions = ignoredDecisions;
    return this;
  }

  public GenericDecisionResultAllOf addIgnoredDecisionsItem(String ignoredDecisionsItem)
  {
    if (this.ignoredDecisions == null)
    {
      this.ignoredDecisions = new ArrayList<String>();
    }
    this.ignoredDecisions.add(ignoredDecisionsItem);
    return this;
  }

  /**
   * @return ignoredDecisions
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIgnoredDecisions()
  {
    return ignoredDecisions;
  }


  public void setIgnoredDecisions(List<String> ignoredDecisions)
  {
    this.ignoredDecisions = ignoredDecisions;
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
    GenericDecisionResultAllOf genericDecisionResultAllOf = (GenericDecisionResultAllOf) o;
    return Objects.equals(this.gatewayId, genericDecisionResultAllOf.gatewayId) &&
            Objects.equals(this.decisionNameToOutgoing, genericDecisionResultAllOf.decisionNameToOutgoing) &&
            Objects.equals(this.ignoredDecisions, genericDecisionResultAllOf.ignoredDecisions);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(gatewayId, decisionNameToOutgoing, ignoredDecisions);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericDecisionResultAllOf {\n");
    sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
    sb.append("    decisionNameToOutgoing: ").append(toIndentedString(decisionNameToOutgoing)).append("\n");
    sb.append("    ignoredDecisions: ").append(toIndentedString(ignoredDecisions)).append("\n");
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

