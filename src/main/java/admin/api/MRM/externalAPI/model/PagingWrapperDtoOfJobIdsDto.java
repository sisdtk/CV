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
 * Generic page of data
 */
@ApiModel(description = "Generic page of data")

public class PagingWrapperDtoOfJobIdsDto
{
    public static final String SERIALIZED_NAME_ITEMS = "items";
    @SerializedName(SERIALIZED_NAME_ITEMS)
    private List<JobIdsDto> items = null;

    public static final String SERIALIZED_NAME_TOTAL = "total";
    @SerializedName(SERIALIZED_NAME_TOTAL)
    private Integer total;


    public PagingWrapperDtoOfJobIdsDto items(List<JobIdsDto> items)
    {

        this.items = items;
        return this;
    }

    public PagingWrapperDtoOfJobIdsDto addItemsItem(JobIdsDto itemsItem)
    {
        if (this.items == null)
        {
            this.items = new ArrayList<JobIdsDto>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Get items
     *
     * @return items
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<JobIdsDto> getItems()
    {
        return items;
    }


    public void setItems(List<JobIdsDto> items)
    {
        this.items = items;
    }


    public PagingWrapperDtoOfJobIdsDto total(Integer total)
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
        PagingWrapperDtoOfJobIdsDto pagingWrapperDtoOfJobIdsDto = (PagingWrapperDtoOfJobIdsDto) o;
        return Objects.equals(this.items, pagingWrapperDtoOfJobIdsDto.items) &&
                Objects.equals(this.total, pagingWrapperDtoOfJobIdsDto.total);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(items, total);
    }


    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class PagingWrapperDtoOfJobIdsDto {\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

