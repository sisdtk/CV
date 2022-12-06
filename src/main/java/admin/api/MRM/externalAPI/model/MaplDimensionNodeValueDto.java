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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 */
@ApiModel(description = "")

public class MaplDimensionNodeValueDto
{
  public static final String SERIALIZED_NAME_DIMENSION_ID = "dimensionId";
  @SerializedName(SERIALIZED_NAME_DIMENSION_ID)
  private Integer dimensionId;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<MaplDimensionValueViewBase> values = null;

  public static final String SERIALIZED_NAME_DIMENSION_TYPE = "dimensionType";
  @SerializedName(SERIALIZED_NAME_DIMENSION_TYPE)
  private MaplDimensionTypesDto dimensionType;


  public MaplDimensionNodeValueDto dimensionId(Integer dimensionId)
  {

    this.dimensionId = dimensionId;
    return this;
  }

  /**
   * @return dimensionId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDimensionId()
  {
    return dimensionId;
  }


  public void setDimensionId(Integer dimensionId)
  {
    this.dimensionId = dimensionId;
  }


  public MaplDimensionNodeValueDto values(List<MaplDimensionValueViewBase> values)
  {

    this.values = values;
    return this;
  }

  public MaplDimensionNodeValueDto addValuesItem(MaplDimensionValueViewBase valuesItem)
  {
    if (this.values == null)
    {
      this.values = new ArrayList<MaplDimensionValueViewBase>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * @return values
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MaplDimensionValueViewBase> getValues()
  {
    return values;
  }


  public void setValues(List<MaplDimensionValueViewBase> values)
  {
    this.values = values;
  }


  public MaplDimensionNodeValueDto dimensionType(MaplDimensionTypesDto dimensionType)
  {

    this.dimensionType = dimensionType;
    return this;
  }

  /**
   * Get dimensionType
   *
   * @return dimensionType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MaplDimensionTypesDto getDimensionType()
  {
    return dimensionType;
  }


  public void setDimensionType(MaplDimensionTypesDto dimensionType)
  {
    this.dimensionType = dimensionType;
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
    MaplDimensionNodeValueDto maplDimensionNodeValueDto = (MaplDimensionNodeValueDto) o;
    return Objects.equals(this.dimensionId, maplDimensionNodeValueDto.dimensionId) &&
            Objects.equals(this.values, maplDimensionNodeValueDto.values) &&
            Objects.equals(this.dimensionType, maplDimensionNodeValueDto.dimensionType);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(dimensionId, values, dimensionType);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaplDimensionNodeValueDto {\n");
    sb.append("    dimensionId: ").append(toIndentedString(dimensionId)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    dimensionType: ").append(toIndentedString(dimensionType)).append("\n");
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

