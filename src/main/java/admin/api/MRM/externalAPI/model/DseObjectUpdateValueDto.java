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

/**
 * DTO for label-value pair.
 */
@ApiModel(description = "DTO for label-value pair.")

public class DseObjectUpdateValueDto
{
    public static final String SERIALIZED_NAME_LABEL = "label";
    @SerializedName(SERIALIZED_NAME_LABEL)
    private Object label;

    public static final String SERIALIZED_NAME_VALUE = "value";
    @SerializedName(SERIALIZED_NAME_VALUE)
    private String value;

    public static final String SERIALIZED_NAME_INHERIT_FROM_PARENT = "inheritFromParent";
    @SerializedName(SERIALIZED_NAME_INHERIT_FROM_PARENT)
    private InheritFromParentEnum inheritFromParent;

    public static final String SERIALIZED_NAME_TECHNICAL_NAME = "technicalName";
    @SerializedName(SERIALIZED_NAME_TECHNICAL_NAME)
    private String technicalName;


    public DseObjectUpdateValueDto label(Object label)
    {

        this.label = label;
        return this;
    }

    /**
     * @return label
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "{}", value = "")

    public Object getLabel()
    {
        return label;
    }


    public void setLabel(Object label)
    {
        this.label = label;
    }


    public DseObjectUpdateValueDto value(String value)
    {

        this.value = value;
        return this;
    }

    /**
     * @return value
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getValue()
    {
        return value;
    }


    public void setValue(String value)
    {
        this.value = value;
    }


    public DseObjectUpdateValueDto inheritFromParent(InheritFromParentEnum inheritFromParent)
    {

        this.inheritFromParent = inheritFromParent;
        return this;
    }

    /**
     * Get inheritFromParent
     *
     * @return inheritFromParent
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public InheritFromParentEnum getInheritFromParent()
    {
        return inheritFromParent;
    }


    public void setInheritFromParent(InheritFromParentEnum inheritFromParent)
    {
        this.inheritFromParent = inheritFromParent;
    }


    public DseObjectUpdateValueDto technicalName(String technicalName)
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
        DseObjectUpdateValueDto dseObjectUpdateValueDto = (DseObjectUpdateValueDto) o;
        return Objects.equals(this.label, dseObjectUpdateValueDto.label) &&
                Objects.equals(this.value, dseObjectUpdateValueDto.value) &&
                Objects.equals(this.inheritFromParent, dseObjectUpdateValueDto.inheritFromParent) &&
                Objects.equals(this.technicalName, dseObjectUpdateValueDto.technicalName);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(label, value, inheritFromParent, technicalName);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class DseObjectUpdateValueDto {\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    inheritFromParent: ").append(toIndentedString(inheritFromParent)).append("\n");
        sb.append("    technicalName: ").append(toIndentedString(technicalName)).append("\n");
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

