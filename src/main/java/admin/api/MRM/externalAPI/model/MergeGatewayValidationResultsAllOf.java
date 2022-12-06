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
 * MergeGatewayValidationResultsAllOf
 */

public class MergeGatewayValidationResultsAllOf
{
  public static final String SERIALIZED_NAME_INCOMING = "incoming";
  @SerializedName(SERIALIZED_NAME_INCOMING)
  private List<String> incoming = null;

  public static final String SERIALIZED_NAME_OUTGOING = "outgoing";
  @SerializedName(SERIALIZED_NAME_OUTGOING)
  private String outgoing;


  public MergeGatewayValidationResultsAllOf incoming(List<String> incoming)
  {

    this.incoming = incoming;
    return this;
  }

  public MergeGatewayValidationResultsAllOf addIncomingItem(String incomingItem)
  {
    if (this.incoming == null)
    {
      this.incoming = new ArrayList<String>();
    }
    this.incoming.add(incomingItem);
    return this;
  }

  /**
   * @return incoming
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIncoming()
  {
    return incoming;
  }


  public void setIncoming(List<String> incoming)
  {
    this.incoming = incoming;
  }


  public MergeGatewayValidationResultsAllOf outgoing(String outgoing)
  {

    this.outgoing = outgoing;
    return this;
  }

  /**
   * @return outgoing
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOutgoing()
  {
    return outgoing;
  }


  public void setOutgoing(String outgoing)
  {
    this.outgoing = outgoing;
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
    MergeGatewayValidationResultsAllOf mergeGatewayValidationResultsAllOf = (MergeGatewayValidationResultsAllOf) o;
    return Objects.equals(this.incoming, mergeGatewayValidationResultsAllOf.incoming) &&
            Objects.equals(this.outgoing, mergeGatewayValidationResultsAllOf.outgoing);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(incoming, outgoing);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeGatewayValidationResultsAllOf {\n");
    sb.append("    incoming: ").append(toIndentedString(incoming)).append("\n");
    sb.append("    outgoing: ").append(toIndentedString(outgoing)).append("\n");
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

