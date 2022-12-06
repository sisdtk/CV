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

public class MaplDimensionPossibleValueDto
{
  public static final String SERIALIZED_NAME_PARENT_VALUE_ID = "parentValueId";
  @SerializedName(SERIALIZED_NAME_PARENT_VALUE_ID)
  private Integer parentValueId;

  public static final String SERIALIZED_NAME_VALUE_ID = "valueId";
  @SerializedName(SERIALIZED_NAME_VALUE_ID)
  private Integer valueId;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;


  public MaplDimensionPossibleValueDto parentValueId(Integer parentValueId)
  {

    this.parentValueId = parentValueId;
    return this;
  }

  /**
   * @return parentValueId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getParentValueId()
  {
    return parentValueId;
  }


  public void setParentValueId(Integer parentValueId)
  {
    this.parentValueId = parentValueId;
  }


  public MaplDimensionPossibleValueDto valueId(Integer valueId)
  {

    this.valueId = valueId;
    return this;
  }

  /**
   * @return valueId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getValueId()
  {
    return valueId;
  }


  public void setValueId(Integer valueId)
  {
    this.valueId = valueId;
  }


  public MaplDimensionPossibleValueDto value(String value)
  {

    this.value = value;
    return this;
  }

  /**
   * @return value
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getValue()
  {
    return value;
  }


  public void setValue(String value)
  {
    this.value = value;
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
    MaplDimensionPossibleValueDto maplDimensionPossibleValueDto = (MaplDimensionPossibleValueDto) o;
    return Objects.equals(this.parentValueId, maplDimensionPossibleValueDto.parentValueId) &&
            Objects.equals(this.valueId, maplDimensionPossibleValueDto.valueId) &&
            Objects.equals(this.value, maplDimensionPossibleValueDto.value);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(parentValueId, valueId, value);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaplDimensionPossibleValueDto {\n");
    sb.append("    parentValueId: ").append(toIndentedString(parentValueId)).append("\n");
    sb.append("    valueId: ").append(toIndentedString(valueId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

