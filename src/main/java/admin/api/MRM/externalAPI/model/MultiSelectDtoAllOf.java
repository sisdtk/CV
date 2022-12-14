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
import io.swagger.annotations.ApiModelProperty;

/**
 * MultiSelectDtoAllOf
 */

public class MultiSelectDtoAllOf
{
    public static final String SERIALIZED_NAME_TYPE_SPANNING = "typeSpanning";
    @SerializedName(SERIALIZED_NAME_TYPE_SPANNING)
    private Boolean typeSpanning;

    public static final String SERIALIZED_NAME_STYLE = "style";
    @SerializedName(SERIALIZED_NAME_STYLE)
    private String style;

    public static final String SERIALIZED_NAME_INHERIT_FROM_PARENT = "inheritFromParent";
    @SerializedName(SERIALIZED_NAME_INHERIT_FROM_PARENT)
    private Boolean inheritFromParent;

    public static final String SERIALIZED_NAME_DEFAULT_VALUE = "defaultValue";
    @SerializedName(SERIALIZED_NAME_DEFAULT_VALUE)
    private String defaultValue;

    public static final String SERIALIZED_NAME_SERIALVERSIONUID = "serialversionuid";
    @SerializedName(SERIALIZED_NAME_SERIALVERSIONUID)
    private Long serialversionuid;

    public static final String SERIALIZED_NAME_INTERDEPENDENT_CHECK_BOX = "interdependentCheckBox";
    @SerializedName(SERIALIZED_NAME_INTERDEPENDENT_CHECK_BOX)
    private Boolean interdependentCheckBox;

    public static final String SERIALIZED_NAME_INTERDEPENDENT_VARIABLE_TECH_NAME = "interdependentVariableTechName";
    @SerializedName(SERIALIZED_NAME_INTERDEPENDENT_VARIABLE_TECH_NAME)
    private String interdependentVariableTechName;


    public MultiSelectDtoAllOf typeSpanning(Boolean typeSpanning)
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


    public MultiSelectDtoAllOf style(String style)
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


    public MultiSelectDtoAllOf inheritFromParent(Boolean inheritFromParent)
    {

        this.inheritFromParent = inheritFromParent;
        return this;
    }

    /**
     * @return inheritFromParent
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Boolean getInheritFromParent()
    {
        return inheritFromParent;
    }


    public void setInheritFromParent(Boolean inheritFromParent)
    {
        this.inheritFromParent = inheritFromParent;
    }


    public MultiSelectDtoAllOf defaultValue(String defaultValue)
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


    public MultiSelectDtoAllOf serialversionuid(Long serialversionuid)
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


    public MultiSelectDtoAllOf interdependentCheckBox(Boolean interdependentCheckBox)
    {

        this.interdependentCheckBox = interdependentCheckBox;
        return this;
    }

    /**
     * @return interdependentCheckBox
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Boolean getInterdependentCheckBox()
    {
        return interdependentCheckBox;
    }


    public void setInterdependentCheckBox(Boolean interdependentCheckBox)
    {
        this.interdependentCheckBox = interdependentCheckBox;
    }


    public MultiSelectDtoAllOf interdependentVariableTechName(String interdependentVariableTechName)
    {

        this.interdependentVariableTechName = interdependentVariableTechName;
        return this;
    }

    /**
     * @return interdependentVariableTechName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getInterdependentVariableTechName()
    {
        return interdependentVariableTechName;
    }


    public void setInterdependentVariableTechName(String interdependentVariableTechName)
    {
        this.interdependentVariableTechName = interdependentVariableTechName;
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
        MultiSelectDtoAllOf multiSelectDtoAllOf = (MultiSelectDtoAllOf) o;
        return Objects.equals(this.typeSpanning, multiSelectDtoAllOf.typeSpanning) &&
                Objects.equals(this.style, multiSelectDtoAllOf.style) &&
                Objects.equals(this.inheritFromParent, multiSelectDtoAllOf.inheritFromParent) &&
                Objects.equals(this.defaultValue, multiSelectDtoAllOf.defaultValue) &&
                Objects.equals(this.serialversionuid, multiSelectDtoAllOf.serialversionuid) &&
                Objects.equals(this.interdependentCheckBox, multiSelectDtoAllOf.interdependentCheckBox) &&
                Objects.equals(this.interdependentVariableTechName, multiSelectDtoAllOf.interdependentVariableTechName);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(typeSpanning, style, inheritFromParent, defaultValue, serialversionuid, interdependentCheckBox, interdependentVariableTechName);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class MultiSelectDtoAllOf {\n");
        sb.append("    typeSpanning: ").append(toIndentedString(typeSpanning)).append("\n");
        sb.append("    style: ").append(toIndentedString(style)).append("\n");
        sb.append("    inheritFromParent: ").append(toIndentedString(inheritFromParent)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    serialversionuid: ").append(toIndentedString(serialversionuid)).append("\n");
        sb.append("    interdependentCheckBox: ").append(toIndentedString(interdependentCheckBox)).append("\n");
        sb.append("    interdependentVariableTechName: ").append(toIndentedString(interdependentVariableTechName)).append("\n");
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

