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
 * RealNumberDecisionAllOf
 */

public class RealNumberDecisionAllOf
{
  public static final String SERIALIZED_NAME_OUTGOING = "outgoing";
  @SerializedName(SERIALIZED_NAME_OUTGOING)
  private List<String> outgoing = null;


  public RealNumberDecisionAllOf outgoing(List<String> outgoing)
  {

    this.outgoing = outgoing;
    return this;
  }

  public RealNumberDecisionAllOf addOutgoingItem(String outgoingItem)
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
    RealNumberDecisionAllOf realNumberDecisionAllOf = (RealNumberDecisionAllOf) o;
    return Objects.equals(this.outgoing, realNumberDecisionAllOf.outgoing);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(outgoing);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealNumberDecisionAllOf {\n");
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
