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
 * UserVariableAllOf
 */

public class UserVariableAllOf
{
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;


  public UserVariableAllOf group(String group)
  {

    this.group = group;
    return this;
  }

  /**
   * @return group
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroup()
  {
    return group;
  }


  public void setGroup(String group)
  {
    this.group = group;
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
    UserVariableAllOf userVariableAllOf = (UserVariableAllOf) o;
    return Objects.equals(this.group, userVariableAllOf.group);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(group);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserVariableAllOf {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

