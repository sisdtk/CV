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
 * Product identifier
 */
@ApiModel(description = "Product identifier")

public class ProductIdsDto
{
  public static final String SERIALIZED_NAME_INSTANCE_ID = "instanceId";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Integer instanceId;

  public static final String SERIALIZED_NAME_ORDINAL_NUMBER = "ordinalNumber";
  @SerializedName(SERIALIZED_NAME_ORDINAL_NUMBER)
  private Integer ordinalNumber;

  public static final String SERIALIZED_NAME_TYPE_ID = "typeId";
  @SerializedName(SERIALIZED_NAME_TYPE_ID)
  private Integer typeId;

  public static final String SERIALIZED_NAME_L10N_LOCALE_ID = "l10nLocaleId";
  @SerializedName(SERIALIZED_NAME_L10N_LOCALE_ID)
  private Integer l10nLocaleId;


  public ProductIdsDto instanceId(Integer instanceId)
  {

    this.instanceId = instanceId;
    return this;
  }

  /**
   * @return instanceId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInstanceId()
  {
    return instanceId;
  }


  public void setInstanceId(Integer instanceId)
  {
    this.instanceId = instanceId;
  }


  public ProductIdsDto ordinalNumber(Integer ordinalNumber)
  {

    this.ordinalNumber = ordinalNumber;
    return this;
  }

  /**
   * @return ordinalNumber
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrdinalNumber()
  {
    return ordinalNumber;
  }


  public void setOrdinalNumber(Integer ordinalNumber)
  {
    this.ordinalNumber = ordinalNumber;
  }


  public ProductIdsDto typeId(Integer typeId)
  {

    this.typeId = typeId;
    return this;
  }

  /**
   * @return typeId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTypeId()
  {
    return typeId;
  }


  public void setTypeId(Integer typeId)
  {
    this.typeId = typeId;
  }


  public ProductIdsDto l10nLocaleId(Integer l10nLocaleId)
  {

    this.l10nLocaleId = l10nLocaleId;
    return this;
  }

  /**
   * @return l10nLocaleId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getL10nLocaleId()
  {
    return l10nLocaleId;
  }


  public void setL10nLocaleId(Integer l10nLocaleId)
  {
    this.l10nLocaleId = l10nLocaleId;
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
    ProductIdsDto productIdsDto = (ProductIdsDto) o;
    return Objects.equals(this.instanceId, productIdsDto.instanceId) &&
            Objects.equals(this.ordinalNumber, productIdsDto.ordinalNumber) &&
            Objects.equals(this.typeId, productIdsDto.typeId) &&
            Objects.equals(this.l10nLocaleId, productIdsDto.l10nLocaleId);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(instanceId, ordinalNumber, typeId, l10nLocaleId);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductIdsDto {\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    ordinalNumber: ").append(toIndentedString(ordinalNumber)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    l10nLocaleId: ").append(toIndentedString(l10nLocaleId)).append("\n");
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
