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
 * DTO for SingleSelectColumn variable type.
 */
@ApiModel(description = "DTO for SingleSelectColumn variable type.")

public class SingleSelectColumnDto
{
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_META_TYPE_ID = "metaTypeId";
  @SerializedName(SERIALIZED_NAME_META_TYPE_ID)
  private Integer metaTypeId;

  public static final String SERIALIZED_NAME_META_TYPE_NAME = "metaTypeName";
  @SerializedName(SERIALIZED_NAME_META_TYPE_NAME)
  private String metaTypeName;

  public static final String SERIALIZED_NAME_UNIQUE_NAME = "uniqueName";
  @SerializedName(SERIALIZED_NAME_UNIQUE_NAME)
  private String uniqueName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_RAW_LABEL = "rawLabel";
  @SerializedName(SERIALIZED_NAME_RAW_LABEL)
  private String rawLabel;

  public static final String SERIALIZED_NAME_MODE = "mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private Integer mode;

  public static final String SERIALIZED_NAME_TECHNICAL_NAME = "technicalName";
  @SerializedName(SERIALIZED_NAME_TECHNICAL_NAME)
  private String technicalName;

  public static final String SERIALIZED_NAME_SHARED_LOCALE = "sharedLocale";
  @SerializedName(SERIALIZED_NAME_SHARED_LOCALE)
  private Boolean sharedLocale;

  public static final String SERIALIZED_NAME_HELP_TEXT = "helpText";
  @SerializedName(SERIALIZED_NAME_HELP_TEXT)
  private String helpText;

  public static final String SERIALIZED_NAME_VISIBILITY = "visibility";
  @SerializedName(SERIALIZED_NAME_VISIBILITY)
  private VisibilityDto visibility;

  public static final String SERIALIZED_NAME_DEPENDS_FROM_VARIABLE_ID = "dependsFromVariableId";
  @SerializedName(SERIALIZED_NAME_DEPENDS_FROM_VARIABLE_ID)
  private Integer dependsFromVariableId;

  public static final String SERIALIZED_NAME_DEPENDS_FROM_VARIABLE_VALUES = "dependsFromVariableValues";
  @SerializedName(SERIALIZED_NAME_DEPENDS_FROM_VARIABLE_VALUES)
  private List<String> dependsFromVariableValues = null;

  public static final String SERIALIZED_NAME_TYPE_SPANNING = "typeSpanning";
  @SerializedName(SERIALIZED_NAME_TYPE_SPANNING)
  private Boolean typeSpanning;

  public static final String SERIALIZED_NAME_SYSTEM = "system";
  @SerializedName(SERIALIZED_NAME_SYSTEM)
  private Boolean system;

  public static final String SERIALIZED_NAME_STORAGE_TYPE = "storageType";
  @SerializedName(SERIALIZED_NAME_STORAGE_TYPE)
  private Integer storageType;

  public static final String SERIALIZED_NAME_SOURCE_CUSTOM_STRUCTURE_NAME = "sourceCustomStructureName";
  @SerializedName(SERIALIZED_NAME_SOURCE_CUSTOM_STRUCTURE_NAME)
  private String sourceCustomStructureName;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_STYLE = "style";
  @SerializedName(SERIALIZED_NAME_STYLE)
  private String style;

  public static final String SERIALIZED_NAME_DEFAULT_VALUE = "defaultValue";
  @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
  private String defaultValue;

  public static final String SERIALIZED_NAME_FORMER_TECHNICAL_VALUE = "formerTechnicalValue";
  @SerializedName(SERIALIZED_NAME_FORMER_TECHNICAL_VALUE)
  private String formerTechnicalValue;

  public static final String SERIALIZED_NAME_DYNAMIC_TABLE_INDEX = "dynamicTableIndex";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_TABLE_INDEX)
  private String dynamicTableIndex;


  public SingleSelectColumnDto id(Integer id)
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


  public SingleSelectColumnDto metaTypeId(Integer metaTypeId)
  {

    this.metaTypeId = metaTypeId;
    return this;
  }

  /**
   * @return metaTypeId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMetaTypeId()
  {
    return metaTypeId;
  }


  public void setMetaTypeId(Integer metaTypeId)
  {
    this.metaTypeId = metaTypeId;
  }


  public SingleSelectColumnDto metaTypeName(String metaTypeName)
  {

    this.metaTypeName = metaTypeName;
    return this;
  }

  /**
   * @return metaTypeName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMetaTypeName()
  {
    return metaTypeName;
  }


  public void setMetaTypeName(String metaTypeName)
  {
    this.metaTypeName = metaTypeName;
  }


  public SingleSelectColumnDto uniqueName(String uniqueName)
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


  public SingleSelectColumnDto displayName(String displayName)
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


  public SingleSelectColumnDto rawLabel(String rawLabel)
  {

    this.rawLabel = rawLabel;
    return this;
  }

  /**
   * @return rawLabel
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRawLabel()
  {
    return rawLabel;
  }


  public void setRawLabel(String rawLabel)
  {
    this.rawLabel = rawLabel;
  }


  public SingleSelectColumnDto mode(Integer mode)
  {

    this.mode = mode;
    return this;
  }

  /**
   * @return mode
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMode()
  {
    return mode;
  }


  public void setMode(Integer mode)
  {
    this.mode = mode;
  }


  public SingleSelectColumnDto technicalName(String technicalName)
  {

    this.technicalName = technicalName;
    return this;
  }

  /**
   * @return technicalName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTechnicalName()
  {
    return technicalName;
  }


  public void setTechnicalName(String technicalName)
  {
    this.technicalName = technicalName;
  }


  public SingleSelectColumnDto sharedLocale(Boolean sharedLocale)
  {

    this.sharedLocale = sharedLocale;
    return this;
  }

  /**
   * @return sharedLocale
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSharedLocale()
  {
    return sharedLocale;
  }


  public void setSharedLocale(Boolean sharedLocale)
  {
    this.sharedLocale = sharedLocale;
  }


  public SingleSelectColumnDto helpText(String helpText)
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


  public SingleSelectColumnDto visibility(VisibilityDto visibility)
  {

    this.visibility = visibility;
    return this;
  }

  /**
   * Get visibility
   *
   * @return visibility
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VisibilityDto getVisibility()
  {
    return visibility;
  }


  public void setVisibility(VisibilityDto visibility)
  {
    this.visibility = visibility;
  }


  public SingleSelectColumnDto dependsFromVariableId(Integer dependsFromVariableId)
  {

    this.dependsFromVariableId = dependsFromVariableId;
    return this;
  }

  /**
   * @return dependsFromVariableId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDependsFromVariableId()
  {
    return dependsFromVariableId;
  }


  public void setDependsFromVariableId(Integer dependsFromVariableId)
  {
    this.dependsFromVariableId = dependsFromVariableId;
  }


  public SingleSelectColumnDto dependsFromVariableValues(List<String> dependsFromVariableValues)
  {

    this.dependsFromVariableValues = dependsFromVariableValues;
    return this;
  }

  public SingleSelectColumnDto addDependsFromVariableValuesItem(String dependsFromVariableValuesItem)
  {
    if (this.dependsFromVariableValues == null)
    {
      this.dependsFromVariableValues = new ArrayList<String>();
    }
    this.dependsFromVariableValues.add(dependsFromVariableValuesItem);
    return this;
  }

  /**
   * @return dependsFromVariableValues
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDependsFromVariableValues()
  {
    return dependsFromVariableValues;
  }


  public void setDependsFromVariableValues(List<String> dependsFromVariableValues)
  {
    this.dependsFromVariableValues = dependsFromVariableValues;
  }


  public SingleSelectColumnDto typeSpanning(Boolean typeSpanning)
  {

    this.typeSpanning = typeSpanning;
    return this;
  }

  /**
   * @return typeSpanning
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getTypeSpanning()
  {
    return typeSpanning;
  }


  public void setTypeSpanning(Boolean typeSpanning)
  {
    this.typeSpanning = typeSpanning;
  }


  public SingleSelectColumnDto system(Boolean system)
  {

    this.system = system;
    return this;
  }

  /**
   * @return system
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSystem()
  {
    return system;
  }


  public void setSystem(Boolean system)
  {
    this.system = system;
  }


  public SingleSelectColumnDto storageType(Integer storageType)
  {

    this.storageType = storageType;
    return this;
  }

  /**
   * @return storageType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStorageType()
  {
    return storageType;
  }


  public void setStorageType(Integer storageType)
  {
    this.storageType = storageType;
  }


  public SingleSelectColumnDto sourceCustomStructureName(String sourceCustomStructureName)
  {

    this.sourceCustomStructureName = sourceCustomStructureName;
    return this;
  }

  /**
   * @return sourceCustomStructureName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSourceCustomStructureName()
  {
    return sourceCustomStructureName;
  }


  public void setSourceCustomStructureName(String sourceCustomStructureName)
  {
    this.sourceCustomStructureName = sourceCustomStructureName;
  }


  public SingleSelectColumnDto width(Integer width)
  {

    this.width = width;
    return this;
  }

  /**
   * @return width
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWidth()
  {
    return width;
  }


  public void setWidth(Integer width)
  {
    this.width = width;
  }


  public SingleSelectColumnDto position(Integer position)
  {

    this.position = position;
    return this;
  }

  /**
   * @return position
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPosition()
  {
    return position;
  }


  public void setPosition(Integer position)
  {
    this.position = position;
  }


  public SingleSelectColumnDto style(String style)
  {

    this.style = style;
    return this;
  }

  /**
   * @return style
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStyle()
  {
    return style;
  }


  public void setStyle(String style)
  {
    this.style = style;
  }


  public SingleSelectColumnDto defaultValue(String defaultValue)
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


  public SingleSelectColumnDto formerTechnicalValue(String formerTechnicalValue)
  {

    this.formerTechnicalValue = formerTechnicalValue;
    return this;
  }

  /**
   * @return formerTechnicalValue
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFormerTechnicalValue()
  {
    return formerTechnicalValue;
  }


  public void setFormerTechnicalValue(String formerTechnicalValue)
  {
    this.formerTechnicalValue = formerTechnicalValue;
  }


  public SingleSelectColumnDto dynamicTableIndex(String dynamicTableIndex)
  {

    this.dynamicTableIndex = dynamicTableIndex;
    return this;
  }

  /**
   * @return dynamicTableIndex
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDynamicTableIndex()
  {
    return dynamicTableIndex;
  }


  public void setDynamicTableIndex(String dynamicTableIndex)
  {
    this.dynamicTableIndex = dynamicTableIndex;
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
    SingleSelectColumnDto singleSelectColumnDto = (SingleSelectColumnDto) o;
    return Objects.equals(this.id, singleSelectColumnDto.id) &&
            Objects.equals(this.metaTypeId, singleSelectColumnDto.metaTypeId) &&
            Objects.equals(this.metaTypeName, singleSelectColumnDto.metaTypeName) &&
            Objects.equals(this.uniqueName, singleSelectColumnDto.uniqueName) &&
            Objects.equals(this.displayName, singleSelectColumnDto.displayName) &&
            Objects.equals(this.rawLabel, singleSelectColumnDto.rawLabel) &&
            Objects.equals(this.mode, singleSelectColumnDto.mode) &&
            Objects.equals(this.technicalName, singleSelectColumnDto.technicalName) &&
            Objects.equals(this.sharedLocale, singleSelectColumnDto.sharedLocale) &&
            Objects.equals(this.helpText, singleSelectColumnDto.helpText) &&
            Objects.equals(this.visibility, singleSelectColumnDto.visibility) &&
            Objects.equals(this.dependsFromVariableId, singleSelectColumnDto.dependsFromVariableId) &&
            Objects.equals(this.dependsFromVariableValues, singleSelectColumnDto.dependsFromVariableValues) &&
            Objects.equals(this.typeSpanning, singleSelectColumnDto.typeSpanning) &&
            Objects.equals(this.system, singleSelectColumnDto.system) &&
            Objects.equals(this.storageType, singleSelectColumnDto.storageType) &&
            Objects.equals(this.sourceCustomStructureName, singleSelectColumnDto.sourceCustomStructureName) &&
            Objects.equals(this.width, singleSelectColumnDto.width) &&
            Objects.equals(this.position, singleSelectColumnDto.position) &&
            Objects.equals(this.style, singleSelectColumnDto.style) &&
            Objects.equals(this.defaultValue, singleSelectColumnDto.defaultValue) &&
            Objects.equals(this.formerTechnicalValue, singleSelectColumnDto.formerTechnicalValue) &&
            Objects.equals(this.dynamicTableIndex, singleSelectColumnDto.dynamicTableIndex);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, metaTypeId, metaTypeName, uniqueName, displayName, rawLabel, mode, technicalName, sharedLocale, helpText, visibility, dependsFromVariableId, dependsFromVariableValues, typeSpanning, system, storageType, sourceCustomStructureName, width, position, style, defaultValue, formerTechnicalValue, dynamicTableIndex);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SingleSelectColumnDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metaTypeId: ").append(toIndentedString(metaTypeId)).append("\n");
    sb.append("    metaTypeName: ").append(toIndentedString(metaTypeName)).append("\n");
    sb.append("    uniqueName: ").append(toIndentedString(uniqueName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    rawLabel: ").append(toIndentedString(rawLabel)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    technicalName: ").append(toIndentedString(technicalName)).append("\n");
    sb.append("    sharedLocale: ").append(toIndentedString(sharedLocale)).append("\n");
    sb.append("    helpText: ").append(toIndentedString(helpText)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
    sb.append("    dependsFromVariableId: ").append(toIndentedString(dependsFromVariableId)).append("\n");
    sb.append("    dependsFromVariableValues: ").append(toIndentedString(dependsFromVariableValues)).append("\n");
    sb.append("    typeSpanning: ").append(toIndentedString(typeSpanning)).append("\n");
    sb.append("    system: ").append(toIndentedString(system)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    sourceCustomStructureName: ").append(toIndentedString(sourceCustomStructureName)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    formerTechnicalValue: ").append(toIndentedString(formerTechnicalValue)).append("\n");
    sb.append("    dynamicTableIndex: ").append(toIndentedString(dynamicTableIndex)).append("\n");
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

