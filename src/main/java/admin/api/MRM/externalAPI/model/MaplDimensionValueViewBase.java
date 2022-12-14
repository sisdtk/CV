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

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 */
@ApiModel(description = "")

public class MaplDimensionValueViewBase
{
  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public static final String SERIALIZED_NAME_WEIGHT = "weight";
  @SerializedName(SERIALIZED_NAME_WEIGHT)
  private BigDecimal weight;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;


  public MaplDimensionValueViewBase value(String value)
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


  public MaplDimensionValueViewBase weight(BigDecimal weight)
  {

    this.weight = weight;
    return this;
  }

  /**
   * @return weight
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BigDecimal getWeight()
  {
    return weight;
  }


  public void setWeight(BigDecimal weight)
  {
    this.weight = weight;
  }


  public MaplDimensionValueViewBase id(Integer id)
  {

    this.id = id;
    return this;
  }

  /**
   * @return id
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId()
  {
    return id;
  }


  public void setId(Integer id)
  {
    this.id = id;
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
    MaplDimensionValueViewBase maplDimensionValueViewBase = (MaplDimensionValueViewBase) o;
    return Objects.equals(this.value, maplDimensionValueViewBase.value) &&
            Objects.equals(this.weight, maplDimensionValueViewBase.weight) &&
            Objects.equals(this.id, maplDimensionValueViewBase.id);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(value, weight, id);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaplDimensionValueViewBase {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

