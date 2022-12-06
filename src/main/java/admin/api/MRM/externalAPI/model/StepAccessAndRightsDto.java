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

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 */
@ApiModel(description = "")

public class StepAccessAndRightsDto
{
  public static final String SERIALIZED_NAME_DATA_SHEET_VISIBILITY = "dataSheetVisibility";
  @SerializedName(SERIALIZED_NAME_DATA_SHEET_VISIBILITY)
  private Map<String, DataSheetVisibilityEnum> dataSheetVisibility = null;

  public static final String SERIALIZED_NAME_VARIABLE_VISIBILITY = "variableVisibility";
  @SerializedName(SERIALIZED_NAME_VARIABLE_VISIBILITY)
  private Map<String, VariableVisibilityDto> variableVisibility = null;

  public static final String SERIALIZED_NAME_DEFAULT_DATA_SHEET = "defaultDataSheet";
  @SerializedName(SERIALIZED_NAME_DEFAULT_DATA_SHEET)
  private String defaultDataSheet;


  public StepAccessAndRightsDto dataSheetVisibility(Map<String, DataSheetVisibilityEnum> dataSheetVisibility)
  {

    this.dataSheetVisibility = dataSheetVisibility;
    return this;
  }

  public StepAccessAndRightsDto putDataSheetVisibilityItem(String key, DataSheetVisibilityEnum dataSheetVisibilityItem)
  {
    if (this.dataSheetVisibility == null)
    {
      this.dataSheetVisibility = new HashMap<String, DataSheetVisibilityEnum>();
    }
    this.dataSheetVisibility.put(key, dataSheetVisibilityItem);
    return this;
  }

  /**
   * @return dataSheetVisibility
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, DataSheetVisibilityEnum> getDataSheetVisibility()
  {
    return dataSheetVisibility;
  }


  public void setDataSheetVisibility(Map<String, DataSheetVisibilityEnum> dataSheetVisibility)
  {
    this.dataSheetVisibility = dataSheetVisibility;
  }


  public StepAccessAndRightsDto variableVisibility(Map<String, VariableVisibilityDto> variableVisibility)
  {

    this.variableVisibility = variableVisibility;
    return this;
  }

  public StepAccessAndRightsDto putVariableVisibilityItem(String key, VariableVisibilityDto variableVisibilityItem)
  {
    if (this.variableVisibility == null)
    {
      this.variableVisibility = new HashMap<String, VariableVisibilityDto>();
    }
    this.variableVisibility.put(key, variableVisibilityItem);
    return this;
  }

  /**
   * @return variableVisibility
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, VariableVisibilityDto> getVariableVisibility()
  {
    return variableVisibility;
  }


  public void setVariableVisibility(Map<String, VariableVisibilityDto> variableVisibility)
  {
    this.variableVisibility = variableVisibility;
  }


  public StepAccessAndRightsDto defaultDataSheet(String defaultDataSheet)
  {

    this.defaultDataSheet = defaultDataSheet;
    return this;
  }

  /**
   * @return defaultDataSheet
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefaultDataSheet()
  {
    return defaultDataSheet;
  }


  public void setDefaultDataSheet(String defaultDataSheet)
  {
    this.defaultDataSheet = defaultDataSheet;
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
    StepAccessAndRightsDto stepAccessAndRightsDto = (StepAccessAndRightsDto) o;
    return Objects.equals(this.dataSheetVisibility, stepAccessAndRightsDto.dataSheetVisibility) &&
            Objects.equals(this.variableVisibility, stepAccessAndRightsDto.variableVisibility) &&
            Objects.equals(this.defaultDataSheet, stepAccessAndRightsDto.defaultDataSheet);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(dataSheetVisibility, variableVisibility, defaultDataSheet);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StepAccessAndRightsDto {\n");
    sb.append("    dataSheetVisibility: ").append(toIndentedString(dataSheetVisibility)).append("\n");
    sb.append("    variableVisibility: ").append(toIndentedString(variableVisibility)).append("\n");
    sb.append("    defaultDataSheet: ").append(toIndentedString(defaultDataSheet)).append("\n");
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

