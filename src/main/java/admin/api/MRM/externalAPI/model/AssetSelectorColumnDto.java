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
 * DTO for AssetSelectorColumn variable type.
 */
@ApiModel(description = "DTO for AssetSelectorColumn variable type.")

public class AssetSelectorColumnDto
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

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Integer width;

  public static final String SERIALIZED_NAME_POSITION = "position";
  @SerializedName(SERIALIZED_NAME_POSITION)
  private Integer position;

  public static final String SERIALIZED_NAME_ASSET = "asset";
  @SerializedName(SERIALIZED_NAME_ASSET)
  private AssetDto asset;

  public static final String SERIALIZED_NAME_FORMER_TECHNICAL_VALUE = "formerTechnicalValue";
  @SerializedName(SERIALIZED_NAME_FORMER_TECHNICAL_VALUE)
  private String formerTechnicalValue;

  public static final String SERIALIZED_NAME_DYNAMIC_TABLE_INDEX = "dynamicTableIndex";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_TABLE_INDEX)
  private String dynamicTableIndex;

  public static final String SERIALIZED_NAME_PREFILLING = "prefilling";
  @SerializedName(SERIALIZED_NAME_PREFILLING)
  private PrefillingDto prefilling;


  public AssetSelectorColumnDto id(Integer id)
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


  public AssetSelectorColumnDto metaTypeId(Integer metaTypeId)
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


  public AssetSelectorColumnDto metaTypeName(String metaTypeName)
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


  public AssetSelectorColumnDto uniqueName(String uniqueName)
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


  public AssetSelectorColumnDto displayName(String displayName)
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


  public AssetSelectorColumnDto rawLabel(String rawLabel)
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


  public AssetSelectorColumnDto mode(Integer mode)
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


  public AssetSelectorColumnDto technicalName(String technicalName)
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


  public AssetSelectorColumnDto sharedLocale(Boolean sharedLocale)
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


  public AssetSelectorColumnDto helpText(String helpText)
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


  public AssetSelectorColumnDto visibility(VisibilityDto visibility)
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


  public AssetSelectorColumnDto dependsFromVariableId(Integer dependsFromVariableId)
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


  public AssetSelectorColumnDto dependsFromVariableValues(List<String> dependsFromVariableValues)
  {

    this.dependsFromVariableValues = dependsFromVariableValues;
    return this;
  }

  public AssetSelectorColumnDto addDependsFromVariableValuesItem(String dependsFromVariableValuesItem)
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


  public AssetSelectorColumnDto typeSpanning(Boolean typeSpanning)
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


  public AssetSelectorColumnDto system(Boolean system)
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


  public AssetSelectorColumnDto storageType(Integer storageType)
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


  public AssetSelectorColumnDto width(Integer width)
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


  public AssetSelectorColumnDto position(Integer position)
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


  public AssetSelectorColumnDto asset(AssetDto asset)
  {

    this.asset = asset;
    return this;
  }

  /**
   * Get asset
   *
   * @return asset
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AssetDto getAsset()
  {
    return asset;
  }


  public void setAsset(AssetDto asset)
  {
    this.asset = asset;
  }


  public AssetSelectorColumnDto formerTechnicalValue(String formerTechnicalValue)
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


  public AssetSelectorColumnDto dynamicTableIndex(String dynamicTableIndex)
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


  public AssetSelectorColumnDto prefilling(PrefillingDto prefilling)
  {

    this.prefilling = prefilling;
    return this;
  }

  /**
   * Get prefilling
   *
   * @return prefilling
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PrefillingDto getPrefilling()
  {
    return prefilling;
  }


  public void setPrefilling(PrefillingDto prefilling)
  {
    this.prefilling = prefilling;
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
    AssetSelectorColumnDto assetSelectorColumnDto = (AssetSelectorColumnDto) o;
    return Objects.equals(this.id, assetSelectorColumnDto.id) &&
            Objects.equals(this.metaTypeId, assetSelectorColumnDto.metaTypeId) &&
            Objects.equals(this.metaTypeName, assetSelectorColumnDto.metaTypeName) &&
            Objects.equals(this.uniqueName, assetSelectorColumnDto.uniqueName) &&
            Objects.equals(this.displayName, assetSelectorColumnDto.displayName) &&
            Objects.equals(this.rawLabel, assetSelectorColumnDto.rawLabel) &&
            Objects.equals(this.mode, assetSelectorColumnDto.mode) &&
            Objects.equals(this.technicalName, assetSelectorColumnDto.technicalName) &&
            Objects.equals(this.sharedLocale, assetSelectorColumnDto.sharedLocale) &&
            Objects.equals(this.helpText, assetSelectorColumnDto.helpText) &&
            Objects.equals(this.visibility, assetSelectorColumnDto.visibility) &&
            Objects.equals(this.dependsFromVariableId, assetSelectorColumnDto.dependsFromVariableId) &&
            Objects.equals(this.dependsFromVariableValues, assetSelectorColumnDto.dependsFromVariableValues) &&
            Objects.equals(this.typeSpanning, assetSelectorColumnDto.typeSpanning) &&
            Objects.equals(this.system, assetSelectorColumnDto.system) &&
            Objects.equals(this.storageType, assetSelectorColumnDto.storageType) &&
            Objects.equals(this.width, assetSelectorColumnDto.width) &&
            Objects.equals(this.position, assetSelectorColumnDto.position) &&
            Objects.equals(this.asset, assetSelectorColumnDto.asset) &&
            Objects.equals(this.formerTechnicalValue, assetSelectorColumnDto.formerTechnicalValue) &&
            Objects.equals(this.dynamicTableIndex, assetSelectorColumnDto.dynamicTableIndex) &&
            Objects.equals(this.prefilling, assetSelectorColumnDto.prefilling);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, metaTypeId, metaTypeName, uniqueName, displayName, rawLabel, mode, technicalName, sharedLocale, helpText, visibility, dependsFromVariableId, dependsFromVariableValues, typeSpanning, system, storageType, width, position, asset, formerTechnicalValue, dynamicTableIndex, prefilling);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetSelectorColumnDto {\n");
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
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    formerTechnicalValue: ").append(toIndentedString(formerTechnicalValue)).append("\n");
    sb.append("    dynamicTableIndex: ").append(toIndentedString(dynamicTableIndex)).append("\n");
    sb.append("    prefilling: ").append(toIndentedString(prefilling)).append("\n");
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

