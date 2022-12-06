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

public class MaplDimensionViewBase
{
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private String info;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private MaplDimensionTypesDto type;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private Boolean required;

  public static final String SERIALIZED_NAME_COPYABLE = "copyable";
  @SerializedName(SERIALIZED_NAME_COPYABLE)
  private Boolean copyable;

  public static final String SERIALIZED_NAME_INHERITABLE = "inheritable";
  @SerializedName(SERIALIZED_NAME_INHERITABLE)
  private Boolean inheritable;

  public static final String SERIALIZED_NAME_ARCHIVED = "archived";
  @SerializedName(SERIALIZED_NAME_ARCHIVED)
  private Boolean archived;


  public MaplDimensionViewBase id(Integer id)
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


  public MaplDimensionViewBase name(String name)
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


  public MaplDimensionViewBase info(String info)
  {

    this.info = info;
    return this;
  }

  /**
   * @return info
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInfo()
  {
    return info;
  }


  public void setInfo(String info)
  {
    this.info = info;
  }


  public MaplDimensionViewBase type(MaplDimensionTypesDto type)
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

  public MaplDimensionTypesDto getType()
  {
    return type;
  }


  public void setType(MaplDimensionTypesDto type)
  {
    this.type = type;
  }


  public MaplDimensionViewBase readOnly(Boolean readOnly)
  {

    this.readOnly = readOnly;
    return this;
  }

  /**
   * @return readOnly
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getReadOnly()
  {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly)
  {
    this.readOnly = readOnly;
  }


  public MaplDimensionViewBase required(Boolean required)
  {

    this.required = required;
    return this;
  }

  /**
   * @return required
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getRequired()
  {
    return required;
  }


  public void setRequired(Boolean required)
  {
    this.required = required;
  }


  public MaplDimensionViewBase copyable(Boolean copyable)
  {

    this.copyable = copyable;
    return this;
  }

  /**
   * @return copyable
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCopyable()
  {
    return copyable;
  }


  public void setCopyable(Boolean copyable)
  {
    this.copyable = copyable;
  }


  public MaplDimensionViewBase inheritable(Boolean inheritable)
  {

    this.inheritable = inheritable;
    return this;
  }

  /**
   * @return inheritable
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getInheritable()
  {
    return inheritable;
  }


  public void setInheritable(Boolean inheritable)
  {
    this.inheritable = inheritable;
  }


  public MaplDimensionViewBase archived(Boolean archived)
  {

    this.archived = archived;
    return this;
  }

  /**
   * @return archived
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getArchived()
  {
    return archived;
  }


  public void setArchived(Boolean archived)
  {
    this.archived = archived;
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
    MaplDimensionViewBase maplDimensionViewBase = (MaplDimensionViewBase) o;
    return Objects.equals(this.id, maplDimensionViewBase.id) &&
            Objects.equals(this.name, maplDimensionViewBase.name) &&
            Objects.equals(this.info, maplDimensionViewBase.info) &&
            Objects.equals(this.type, maplDimensionViewBase.type) &&
            Objects.equals(this.readOnly, maplDimensionViewBase.readOnly) &&
            Objects.equals(this.required, maplDimensionViewBase.required) &&
            Objects.equals(this.copyable, maplDimensionViewBase.copyable) &&
            Objects.equals(this.inheritable, maplDimensionViewBase.inheritable) &&
            Objects.equals(this.archived, maplDimensionViewBase.archived);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, name, info, type, readOnly, required, copyable, inheritable, archived);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaplDimensionViewBase {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    copyable: ").append(toIndentedString(copyable)).append("\n");
    sb.append("    inheritable: ").append(toIndentedString(inheritable)).append("\n");
    sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
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
