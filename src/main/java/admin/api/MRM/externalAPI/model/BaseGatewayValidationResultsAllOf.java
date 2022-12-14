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

import java.util.Objects;

/**
 * BaseGatewayValidationResultsAllOf
 */

public class BaseGatewayValidationResultsAllOf
{
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private GatewayType type;


  public BaseGatewayValidationResultsAllOf type(GatewayType type)
  {

    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GatewayType getType()
  {
    return type;
  }


  public void setType(GatewayType type)
  {
    this.type = type;
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
    BaseGatewayValidationResultsAllOf baseGatewayValidationResultsAllOf = (BaseGatewayValidationResultsAllOf) o;
    return Objects.equals(this.type, baseGatewayValidationResultsAllOf.type);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(type);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseGatewayValidationResultsAllOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

