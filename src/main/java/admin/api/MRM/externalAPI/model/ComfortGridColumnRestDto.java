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
 * Comfort grid column definition
 */
@ApiModel(description = "Comfort grid column definition")

public class ComfortGridColumnRestDto
{
  public static final String SERIALIZED_NAME_ORDINAL_NUMB = "ordinalNumb";
  @SerializedName(SERIALIZED_NAME_ORDINAL_NUMB)
  private Integer ordinalNumb;

  public static final String SERIALIZED_NAME_VARIABLE_TYPE = "variableType";
  @SerializedName(SERIALIZED_NAME_VARIABLE_TYPE)
  private String variableType;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_DATA_SOURCE = "dataSource";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE)
  private String dataSource;

  public static final String SERIALIZED_NAME_HELP_TEXT = "helpText";
  @SerializedName(SERIALIZED_NAME_HELP_TEXT)
  private String helpText;

  public static final String SERIALIZED_NAME_SUMMARY_FUNCTION = "summaryFunction";
  @SerializedName(SERIALIZED_NAME_SUMMARY_FUNCTION)
  private String summaryFunction;

  public static final String SERIALIZED_NAME_SUMMARY_LABEL = "summaryLabel";
  @SerializedName(SERIALIZED_NAME_SUMMARY_LABEL)
  private String summaryLabel;

  public static final String SERIALIZED_NAME_EXPRESSION = "expression";
  @SerializedName(SERIALIZED_NAME_EXPRESSION)
  private String expression;

  public static final String SERIALIZED_NAME_INTERDEPENDENT_CHECKBOX = "interdependentCheckbox";
  @SerializedName(SERIALIZED_NAME_INTERDEPENDENT_CHECKBOX)
  private Boolean interdependentCheckbox;

  public static final String SERIALIZED_NAME_INTERDEPENDENT_COLUMN_ID = "interdependentColumnId";
  @SerializedName(SERIALIZED_NAME_INTERDEPENDENT_COLUMN_ID)
  private Integer interdependentColumnId;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "defaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public static final String SERIALIZED_NAME_DECIMAL_PLACES = "decimalPlaces";
  @SerializedName(SERIALIZED_NAME_DECIMAL_PLACES)
  private Integer decimalPlaces;

  public static final String SERIALIZED_NAME_UNIQUE_NAME = "uniqueName";
  @SerializedName(SERIALIZED_NAME_UNIQUE_NAME)
  private String uniqueName;

  public static final String SERIALIZED_NAME_MULTILANGUAGE_TEXT = "multilanguageText";
  @SerializedName(SERIALIZED_NAME_MULTILANGUAGE_TEXT)
  private String multilanguageText;


  public ComfortGridColumnRestDto ordinalNumb(Integer ordinalNumb)
  {

    this.ordinalNumb = ordinalNumb;
    return this;
  }

  /**
   * @return ordinalNumb
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getOrdinalNumb()
  {
    return ordinalNumb;
  }


  public void setOrdinalNumb(Integer ordinalNumb)
  {
    this.ordinalNumb = ordinalNumb;
  }


  public ComfortGridColumnRestDto variableType(String variableType)
  {

    this.variableType = variableType;
    return this;
  }

  /**
   * @return variableType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVariableType()
  {
    return variableType;
  }


  public void setVariableType(String variableType)
  {
    this.variableType = variableType;
  }


  public ComfortGridColumnRestDto displayName(String displayName)
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


  public ComfortGridColumnRestDto dataSource(String dataSource)
  {

    this.dataSource = dataSource;
    return this;
  }

  /**
   * @return dataSource
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDataSource()
  {
    return dataSource;
  }


  public void setDataSource(String dataSource)
  {
    this.dataSource = dataSource;
  }


  public ComfortGridColumnRestDto helpText(String helpText)
  {

    this.helpText = helpText;
    return this;
  }

  /**
   * @return helpText
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getHelpText()
  {
    return helpText;
  }


  public void setHelpText(String helpText)
  {
    this.helpText = helpText;
  }


  public ComfortGridColumnRestDto summaryFunction(String summaryFunction)
  {

    this.summaryFunction = summaryFunction;
    return this;
  }

  /**
   * @return summaryFunction
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSummaryFunction()
  {
    return summaryFunction;
  }


  public void setSummaryFunction(String summaryFunction)
  {
    this.summaryFunction = summaryFunction;
  }


  public ComfortGridColumnRestDto summaryLabel(String summaryLabel)
  {

    this.summaryLabel = summaryLabel;
    return this;
  }

  /**
   * @return summaryLabel
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSummaryLabel()
  {
    return summaryLabel;
  }


  public void setSummaryLabel(String summaryLabel)
  {
    this.summaryLabel = summaryLabel;
  }


  public ComfortGridColumnRestDto expression(String expression)
  {

    this.expression = expression;
    return this;
  }

  /**
   * @return expression
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExpression()
  {
    return expression;
  }


  public void setExpression(String expression)
  {
    this.expression = expression;
  }


  public ComfortGridColumnRestDto interdependentCheckbox(Boolean interdependentCheckbox)
  {

    this.interdependentCheckbox = interdependentCheckbox;
    return this;
  }

  /**
   * @return interdependentCheckbox
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getInterdependentCheckbox()
  {
    return interdependentCheckbox;
  }


  public void setInterdependentCheckbox(Boolean interdependentCheckbox)
  {
    this.interdependentCheckbox = interdependentCheckbox;
  }


  public ComfortGridColumnRestDto interdependentColumnId(Integer interdependentColumnId)
  {

    this.interdependentColumnId = interdependentColumnId;
    return this;
  }

  /**
   * @return interdependentColumnId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInterdependentColumnId()
  {
    return interdependentColumnId;
  }


  public void setInterdependentColumnId(Integer interdependentColumnId)
  {
    this.interdependentColumnId = interdependentColumnId;
  }


  public ComfortGridColumnRestDto defaultValue(String defaultValue)
  {

    this.defaultValue = defaultValue;
    return this;
  }

  /**
   * @return defaultValue
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDefaultValue()
  {
    return defaultValue;
  }


  public void setDefaultValue(String defaultValue)
  {
    this.defaultValue = defaultValue;
  }


  public ComfortGridColumnRestDto decimalPlaces(Integer decimalPlaces)
  {

    this.decimalPlaces = decimalPlaces;
    return this;
  }

  /**
   * @return decimalPlaces
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDecimalPlaces()
  {
    return decimalPlaces;
  }


  public void setDecimalPlaces(Integer decimalPlaces)
  {
    this.decimalPlaces = decimalPlaces;
  }


  public ComfortGridColumnRestDto uniqueName(String uniqueName)
  {

    this.uniqueName = uniqueName;
    return this;
  }

  /**
   * @return uniqueName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUniqueName()
  {
    return uniqueName;
  }


  public void setUniqueName(String uniqueName)
  {
    this.uniqueName = uniqueName;
  }


  public ComfortGridColumnRestDto multilanguageText(String multilanguageText)
  {

    this.multilanguageText = multilanguageText;
    return this;
  }

  /**
   * @return multilanguageText
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMultilanguageText()
  {
    return multilanguageText;
  }


  public void setMultilanguageText(String multilanguageText)
  {
    this.multilanguageText = multilanguageText;
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
    ComfortGridColumnRestDto comfortGridColumnRestDto = (ComfortGridColumnRestDto) o;
    return Objects.equals(this.ordinalNumb, comfortGridColumnRestDto.ordinalNumb) &&
            Objects.equals(this.variableType, comfortGridColumnRestDto.variableType) &&
            Objects.equals(this.displayName, comfortGridColumnRestDto.displayName) &&
            Objects.equals(this.dataSource, comfortGridColumnRestDto.dataSource) &&
            Objects.equals(this.helpText, comfortGridColumnRestDto.helpText) &&
            Objects.equals(this.summaryFunction, comfortGridColumnRestDto.summaryFunction) &&
            Objects.equals(this.summaryLabel, comfortGridColumnRestDto.summaryLabel) &&
            Objects.equals(this.expression, comfortGridColumnRestDto.expression) &&
            Objects.equals(this.interdependentCheckbox, comfortGridColumnRestDto.interdependentCheckbox) &&
            Objects.equals(this.interdependentColumnId, comfortGridColumnRestDto.interdependentColumnId) &&
            Objects.equals(this.defaultValue, comfortGridColumnRestDto.defaultValue) &&
            Objects.equals(this.decimalPlaces, comfortGridColumnRestDto.decimalPlaces) &&
            Objects.equals(this.uniqueName, comfortGridColumnRestDto.uniqueName) &&
            Objects.equals(this.multilanguageText, comfortGridColumnRestDto.multilanguageText);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(ordinalNumb, variableType, displayName, dataSource, helpText, summaryFunction, summaryLabel, expression, interdependentCheckbox, interdependentColumnId, defaultValue, decimalPlaces, uniqueName, multilanguageText);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComfortGridColumnRestDto {\n");
    sb.append("    ordinalNumb: ").append(toIndentedString(ordinalNumb)).append("\n");
    sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    helpText: ").append(toIndentedString(helpText)).append("\n");
    sb.append("    summaryFunction: ").append(toIndentedString(summaryFunction)).append("\n");
    sb.append("    summaryLabel: ").append(toIndentedString(summaryLabel)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    interdependentCheckbox: ").append(toIndentedString(interdependentCheckbox)).append("\n");
    sb.append("    interdependentColumnId: ").append(toIndentedString(interdependentColumnId)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    decimalPlaces: ").append(toIndentedString(decimalPlaces)).append("\n");
    sb.append("    uniqueName: ").append(toIndentedString(uniqueName)).append("\n");
    sb.append("    multilanguageText: ").append(toIndentedString(multilanguageText)).append("\n");
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

