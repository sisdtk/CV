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
 * DTO for information about prefilling from custom structure.
 */
@ApiModel(description = "DTO for information about prefilling from custom structure.")

public class PrefillingDto
{
  public static final String SERIALIZED_NAME_CUSTOM_STRUCTURE_ID = "customStructureId";
  @SerializedName(SERIALIZED_NAME_CUSTOM_STRUCTURE_ID)
  private Integer customStructureId;

  public static final String SERIALIZED_NAME_ATTRIBUTE_ID = "attributeId";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTE_ID)
  private String attributeId;

  public static final String SERIALIZED_NAME_KEY_ID = "keyId";
  @SerializedName(SERIALIZED_NAME_KEY_ID)
  private Integer keyId;

  public static final String SERIALIZED_NAME_OVERRIDE_ID = "overrideId";
  @SerializedName(SERIALIZED_NAME_OVERRIDE_ID)
  private Integer overrideId;

  public static final String SERIALIZED_NAME_PERMANENT_BINDING = "permanentBinding";
  @SerializedName(SERIALIZED_NAME_PERMANENT_BINDING)
  private Boolean permanentBinding;


  public PrefillingDto customStructureId(Integer customStructureId)
  {

    this.customStructureId = customStructureId;
    return this;
  }

  /**
   * @return customStructureId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCustomStructureId()
  {
    return customStructureId;
  }


  public void setCustomStructureId(Integer customStructureId)
  {
    this.customStructureId = customStructureId;
  }


  public PrefillingDto attributeId(String attributeId)
  {

    this.attributeId = attributeId;
    return this;
  }

  /**
   * @return attributeId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAttributeId()
  {
    return attributeId;
  }


  public void setAttributeId(String attributeId)
  {
    this.attributeId = attributeId;
  }


  public PrefillingDto keyId(Integer keyId)
  {

    this.keyId = keyId;
    return this;
  }

  /**
   * @return keyId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getKeyId()
  {
    return keyId;
  }


  public void setKeyId(Integer keyId)
  {
    this.keyId = keyId;
  }


  public PrefillingDto overrideId(Integer overrideId)
  {

    this.overrideId = overrideId;
    return this;
  }

  /**
   * @return overrideId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOverrideId()
  {
    return overrideId;
  }


  public void setOverrideId(Integer overrideId)
  {
    this.overrideId = overrideId;
  }


  public PrefillingDto permanentBinding(Boolean permanentBinding)
  {

    this.permanentBinding = permanentBinding;
    return this;
  }

  /**
   * @return permanentBinding
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getPermanentBinding()
  {
    return permanentBinding;
  }


  public void setPermanentBinding(Boolean permanentBinding)
  {
    this.permanentBinding = permanentBinding;
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
    PrefillingDto prefillingDto = (PrefillingDto) o;
    return Objects.equals(this.customStructureId, prefillingDto.customStructureId) &&
            Objects.equals(this.attributeId, prefillingDto.attributeId) &&
            Objects.equals(this.keyId, prefillingDto.keyId) &&
            Objects.equals(this.overrideId, prefillingDto.overrideId) &&
            Objects.equals(this.permanentBinding, prefillingDto.permanentBinding);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(customStructureId, attributeId, keyId, overrideId, permanentBinding);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrefillingDto {\n");
    sb.append("    customStructureId: ").append(toIndentedString(customStructureId)).append("\n");
    sb.append("    attributeId: ").append(toIndentedString(attributeId)).append("\n");
    sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
    sb.append("    overrideId: ").append(toIndentedString(overrideId)).append("\n");
    sb.append("    permanentBinding: ").append(toIndentedString(permanentBinding)).append("\n");
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

