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
 * XmlNs0WorkflowAccessAndRightsDtoAllOf
 */

public class XmlNs0WorkflowAccessAndRightsDtoAllOf
{
  public static final String SERIALIZED_NAME_DATA_SHEET_VISIBILITY = "dataSheetVisibility";
  @SerializedName(SERIALIZED_NAME_DATA_SHEET_VISIBILITY)
  private Object dataSheetVisibility;

  public static final String SERIALIZED_NAME_VARIABLE_VISIBILITY = "variableVisibility";
  @SerializedName(SERIALIZED_NAME_VARIABLE_VISIBILITY)
  private Object variableVisibility;


  public XmlNs0WorkflowAccessAndRightsDtoAllOf dataSheetVisibility(Object dataSheetVisibility)
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


  public XmlNs0WorkflowAccessAndRightsDtoAllOf variableVisibility(Object variableVisibility)
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
    XmlNs0WorkflowAccessAndRightsDtoAllOf xmlNs0WorkflowAccessAndRightsDtoAllOf = (XmlNs0WorkflowAccessAndRightsDtoAllOf) o;
    return Objects.equals(this.dataSheetVisibility, xmlNs0WorkflowAccessAndRightsDtoAllOf.dataSheetVisibility) &&
            Objects.equals(this.variableVisibility, xmlNs0WorkflowAccessAndRightsDtoAllOf.variableVisibility);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(dataSheetVisibility, variableVisibility);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0WorkflowAccessAndRightsDtoAllOf {\n");
    sb.append("    dataSheetVisibility: ").append(toIndentedString(dataSheetVisibility)).append("\n");
    sb.append("    variableVisibility: ").append(toIndentedString(variableVisibility)).append("\n");
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

