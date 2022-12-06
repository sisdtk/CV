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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 *
 */
@ApiModel(description = "")

public class UserLightDto
{
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Integer value;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;


  public UserLightDto value(Integer value)
  {

    this.value = value;
    return this;
  }

  /**
   * @return value
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getValue()
  {
    return value;
  }


  public void setValue(Integer value)
  {
    this.value = value;
  }


  public UserLightDto label(String label)
  {

    this.label = label;
    return this;
  }

  /**
   * @return label
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLabel()
  {
    return label;
  }


  public void setLabel(String label)
  {
    this.label = label;
  }


  public UserLightDto group(String group)
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
    UserLightDto userLightDto = (UserLightDto) o;
    return Objects.equals(this.value, userLightDto.value) &&
            Objects.equals(this.label, userLightDto.label) &&
            Objects.equals(this.group, userLightDto.group);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(value, label, group);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserLightDto {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
