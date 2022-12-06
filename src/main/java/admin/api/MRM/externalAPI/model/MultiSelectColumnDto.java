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

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Base DTO for selectable variable types.
 */
@ApiModel(description = "Base DTO for selectable variable types.")

public class MultiSelectColumnDto
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

    public static final String SERIALIZED_NAME_STYLE = "style";
    @SerializedName(SERIALIZED_NAME_STYLE)
    private String style;

    public static final String SERIALIZED_NAME_DEFAULT_VALUE = "defaultValue";
    @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
    private String defaultValue;

    public static final String SERIALIZED_NAME_WIDTH = "width";
    @SerializedName(SERIALIZED_NAME_WIDTH)
    private Integer width;

    public static final String SERIALIZED_NAME_POSITION = "position";
    @SerializedName(SERIALIZED_NAME_POSITION)
    private Integer position;

    public static final String SERIALIZED_NAME_SERIALVERSIONUID = "serialversionuid";
    @SerializedName(SERIALIZED_NAME_SERIALVERSIONUID)
    private Long serialversionuid;


    public MultiSelectColumnDto id(Integer id)
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


    public MultiSelectColumnDto metaTypeId(Integer metaTypeId)
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


    public MultiSelectColumnDto metaTypeName(String metaTypeName)
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


    public MultiSelectColumnDto uniqueName(String uniqueName)
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


    public MultiSelectColumnDto displayName(String displayName)
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


    public MultiSelectColumnDto rawLabel(String rawLabel)
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


    public MultiSelectColumnDto mode(Integer mode)
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


    public MultiSelectColumnDto technicalName(String technicalName)
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


    public MultiSelectColumnDto sharedLocale(Boolean sharedLocale)
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


    public MultiSelectColumnDto helpText(String helpText)
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


    public MultiSelectColumnDto visibility(VisibilityDto visibility)
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


    public MultiSelectColumnDto dependsFromVariableId(Integer dependsFromVariableId)
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


    public MultiSelectColumnDto dependsFromVariableValues(List<String> dependsFromVariableValues)
    {

        this.dependsFromVariableValues = dependsFromVariableValues;
        return this;
    }

    public MultiSelectColumnDto addDependsFromVariableValuesItem(String dependsFromVariableValuesItem)
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


    public MultiSelectColumnDto typeSpanning(Boolean typeSpanning)
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


    public MultiSelectColumnDto system(Boolean system)
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


    public MultiSelectColumnDto storageType(Integer storageType)
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


    public MultiSelectColumnDto sourceCustomStructureName(String sourceCustomStructureName)
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


    public MultiSelectColumnDto style(String style)
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


    public MultiSelectColumnDto defaultValue(String defaultValue)
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


    public MultiSelectColumnDto width(Integer width)
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


    public MultiSelectColumnDto position(Integer position)
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


    public MultiSelectColumnDto serialversionuid(Long serialversionuid)
    {

        this.serialversionuid = serialversionuid;
        return this;
    }

    /**
     * @return serialversionuid
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Long getSerialversionuid()
    {
        return serialversionuid;
    }


    public void setSerialversionuid(Long serialversionuid)
    {
        this.serialversionuid = serialversionuid;
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
        MultiSelectColumnDto multiSelectColumnDto = (MultiSelectColumnDto) o;
        return Objects.equals(this.id, multiSelectColumnDto.id) &&
                Objects.equals(this.metaTypeId, multiSelectColumnDto.metaTypeId) &&
                Objects.equals(this.metaTypeName, multiSelectColumnDto.metaTypeName) &&
                Objects.equals(this.uniqueName, multiSelectColumnDto.uniqueName) &&
                Objects.equals(this.displayName, multiSelectColumnDto.displayName) &&
                Objects.equals(this.rawLabel, multiSelectColumnDto.rawLabel) &&
                Objects.equals(this.mode, multiSelectColumnDto.mode) &&
                Objects.equals(this.technicalName, multiSelectColumnDto.technicalName) &&
                Objects.equals(this.sharedLocale, multiSelectColumnDto.sharedLocale) &&
                Objects.equals(this.helpText, multiSelectColumnDto.helpText) &&
                Objects.equals(this.visibility, multiSelectColumnDto.visibility) &&
                Objects.equals(this.dependsFromVariableId, multiSelectColumnDto.dependsFromVariableId) &&
                Objects.equals(this.dependsFromVariableValues, multiSelectColumnDto.dependsFromVariableValues) &&
                Objects.equals(this.typeSpanning, multiSelectColumnDto.typeSpanning) &&
                Objects.equals(this.system, multiSelectColumnDto.system) &&
                Objects.equals(this.storageType, multiSelectColumnDto.storageType) &&
                Objects.equals(this.sourceCustomStructureName, multiSelectColumnDto.sourceCustomStructureName) &&
                Objects.equals(this.style, multiSelectColumnDto.style) &&
                Objects.equals(this.defaultValue, multiSelectColumnDto.defaultValue) &&
                Objects.equals(this.width, multiSelectColumnDto.width) &&
                Objects.equals(this.position, multiSelectColumnDto.position) &&
                Objects.equals(this.serialversionuid, multiSelectColumnDto.serialversionuid);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, metaTypeId, metaTypeName, uniqueName, displayName, rawLabel, mode, technicalName, sharedLocale, helpText, visibility, dependsFromVariableId, dependsFromVariableValues, typeSpanning, system, storageType, sourceCustomStructureName, style, defaultValue, width, position, serialversionuid);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiSelectColumnDto {\n");
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
        sb.append("    style: ").append(toIndentedString(style)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    position: ").append(toIndentedString(position)).append("\n");
        sb.append("    serialversionuid: ").append(toIndentedString(serialversionuid)).append("\n");
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

