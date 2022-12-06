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

public class XmlNs0VersionedWorkflowAccessAndRightsDto
{
  public static final String SERIALIZED_NAME_DATA_SHEET_VISIBILITY = "dataSheetVisibility";
  @SerializedName(SERIALIZED_NAME_DATA_SHEET_VISIBILITY)
  private Object dataSheetVisibility;

  public static final String SERIALIZED_NAME_VARIABLE_VISIBILITY = "variableVisibility";
  @SerializedName(SERIALIZED_NAME_VARIABLE_VISIBILITY)
  private Object variableVisibility;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public XmlNs0VersionedWorkflowAccessAndRightsDto dataSheetVisibility(Object dataSheetVisibility)
  {

    this.dataSheetVisibility = dataSheetVisibility;
    return this;
  }

  /**
   * @return dataSheetVisibility
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getDataSheetVisibility()
  {
    return dataSheetVisibility;
  }


  public void setDataSheetVisibility(Object dataSheetVisibility)
  {
    this.dataSheetVisibility = dataSheetVisibility;
  }


  public XmlNs0VersionedWorkflowAccessAndRightsDto variableVisibility(Object variableVisibility)
  {

    this.variableVisibility = variableVisibility;
    return this;
  }

  /**
   * @return variableVisibility
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getVariableVisibility()
  {
    return variableVisibility;
  }


  public void setVariableVisibility(Object variableVisibility)
  {
    this.variableVisibility = variableVisibility;
  }


  public XmlNs0VersionedWorkflowAccessAndRightsDto version(String version)
  {

    this.version = version;
    return this;
  }

  /**
   * @return version
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion()
  {
    return version;
  }


  public void setVersion(String version)
  {
    this.version = version;
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
    XmlNs0VersionedWorkflowAccessAndRightsDto xmlNs0VersionedWorkflowAccessAndRightsDto = (XmlNs0VersionedWorkflowAccessAndRightsDto) o;
    return Objects.equals(this.dataSheetVisibility, xmlNs0VersionedWorkflowAccessAndRightsDto.dataSheetVisibility) &&
            Objects.equals(this.variableVisibility, xmlNs0VersionedWorkflowAccessAndRightsDto.variableVisibility) &&
            Objects.equals(this.version, xmlNs0VersionedWorkflowAccessAndRightsDto.version);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(dataSheetVisibility, variableVisibility, version);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0VersionedWorkflowAccessAndRightsDto {\n");
    sb.append("    dataSheetVisibility: ").append(toIndentedString(dataSheetVisibility)).append("\n");
    sb.append("    variableVisibility: ").append(toIndentedString(variableVisibility)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
