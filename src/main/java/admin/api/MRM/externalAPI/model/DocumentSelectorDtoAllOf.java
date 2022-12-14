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
 * DocumentSelectorDtoAllOf
 */

public class DocumentSelectorDtoAllOf
{
    public static final String SERIALIZED_NAME_TYPE_SPANNING = "typeSpanning";
    @SerializedName(SERIALIZED_NAME_TYPE_SPANNING)
    private Boolean typeSpanning;

    public static final String SERIALIZED_NAME_INHERIT_FROM_PARENT = "inheritFromParent";
    @SerializedName(SERIALIZED_NAME_INHERIT_FROM_PARENT)
    private Boolean inheritFromParent;


    public DocumentSelectorDtoAllOf typeSpanning(Boolean typeSpanning)
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


    public DocumentSelectorDtoAllOf inheritFromParent(Boolean inheritFromParent)
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
        DocumentSelectorDtoAllOf documentSelectorDtoAllOf = (DocumentSelectorDtoAllOf) o;
        return Objects.equals(this.typeSpanning, documentSelectorDtoAllOf.typeSpanning) &&
                Objects.equals(this.inheritFromParent, documentSelectorDtoAllOf.inheritFromParent);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(typeSpanning, inheritFromParent);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class DocumentSelectorDtoAllOf {\n");
        sb.append("    typeSpanning: ").append(toIndentedString(typeSpanning)).append("\n");
        sb.append("    inheritFromParent: ").append(toIndentedString(inheritFromParent)).append("\n");
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

