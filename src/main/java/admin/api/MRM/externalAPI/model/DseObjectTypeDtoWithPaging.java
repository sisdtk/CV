/*
 * DSE REST API
 * <h2>DSE REST API</h1>
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
 * A page of DSE object types
 */
@ApiModel(description = "A page of DSE object types")

public class DseObjectTypeDtoWithPaging
{
    public static final String SERIALIZED_NAME_TOTAL = "total";
    @SerializedName(SERIALIZED_NAME_TOTAL)
    private Integer total;

    public static final String SERIALIZED_NAME_TYPES = "types";
    @SerializedName(SERIALIZED_NAME_TYPES)
    private List<DseObjectTypeDto> types = null;


    public DseObjectTypeDtoWithPaging total(Integer total)
    {

        this.total = total;
        return this;
    }

    /**
     * Get total
     *
     * @return total
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getTotal()
    {
        return total;
    }


    public void setTotal(Integer total)
    {
        this.total = total;
    }


    public DseObjectTypeDtoWithPaging types(List<DseObjectTypeDto> types)
    {

        this.types = types;
        return this;
    }

    public DseObjectTypeDtoWithPaging addTypesItem(DseObjectTypeDto typesItem)
    {
        if (this.types == null)
        {
            this.types = new ArrayList<DseObjectTypeDto>();
        }
        this.types.add(typesItem);
        return this;
    }

    /**
     * Get types
     *
     * @return types
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<DseObjectTypeDto> getTypes()
    {
        return types;
    }


    public void setTypes(List<DseObjectTypeDto> types)
    {
        this.types = types;
    }


    @Override
    public boolean equals(java.lang.Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        DseObjectTypeDtoWithPaging dseObjectTypeDtoWithPaging = (DseObjectTypeDtoWithPaging) o;
        return Objects.equals(this.total, dseObjectTypeDtoWithPaging.total) &&
                Objects.equals(this.types, dseObjectTypeDtoWithPaging.types);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(total, types);
    }


    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class DseObjectTypeDtoWithPaging {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o)
    {
        if (o == null)
        {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

