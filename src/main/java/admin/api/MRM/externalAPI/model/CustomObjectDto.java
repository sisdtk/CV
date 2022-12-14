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
 * Base DTO for custom object.
 */
@ApiModel(description = "Base DTO for custom object.")

public class CustomObjectDto
{
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CUSTOM_STRUCTURE_ID = "customStructureId";
  @SerializedName(SERIALIZED_NAME_CUSTOM_STRUCTURE_ID)
  private Integer customStructureId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Integer status;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;


  public CustomObjectDto id(Integer id)
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


  public CustomObjectDto customStructureId(Integer customStructureId)
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


  public CustomObjectDto status(Integer status)
  {

    this.status = status;
    return this;
  }

  /**
   * @return status
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStatus()
  {
    return status;
  }


  public void setStatus(Integer status)
  {
    this.status = status;
  }


  public CustomObjectDto name(String name)
  {

    this.name = name;
    return this;
  }

  /**
   * @return name
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName()
  {
    return name;
  }


  public void setName(String name)
  {
    this.name = name;
  }


  public CustomObjectDto displayName(String displayName)
  {

    this.displayName = displayName;
    return this;
  }

  /**
   * @return displayName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName()
  {
    return displayName;
  }


  public void setDisplayName(String displayName)
  {
    this.displayName = displayName;
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
    CustomObjectDto customObjectDto = (CustomObjectDto) o;
    return Objects.equals(this.id, customObjectDto.id) &&
            Objects.equals(this.customStructureId, customObjectDto.customStructureId) &&
            Objects.equals(this.status, customObjectDto.status) &&
            Objects.equals(this.name, customObjectDto.name) &&
            Objects.equals(this.displayName, customObjectDto.displayName);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, customStructureId, status, name, displayName);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomObjectDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customStructureId: ").append(toIndentedString(customStructureId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

