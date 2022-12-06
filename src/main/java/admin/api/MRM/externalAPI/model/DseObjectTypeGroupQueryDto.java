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
 *
 */
@ApiModel(description = "")

public class DseObjectTypeGroupQueryDto
{
    public static final String SERIALIZED_NAME_LIMIT = "limit";
    @SerializedName(SERIALIZED_NAME_LIMIT)
    private Integer limit;

    public static final String SERIALIZED_NAME_ORDER = "order";
    @SerializedName(SERIALIZED_NAME_ORDER)
    private String order;

    public static final String SERIALIZED_NAME_QUERY = "query";
    @SerializedName(SERIALIZED_NAME_QUERY)
    private String query;

    public static final String SERIALIZED_NAME_SORT = "sort";
    @SerializedName(SERIALIZED_NAME_SORT)
    private String sort;

    public static final String SERIALIZED_NAME_START = "start";
    @SerializedName(SERIALIZED_NAME_START)
    private Integer start;


    public DseObjectTypeGroupQueryDto limit(Integer limit)
    {

        this.limit = limit;
        return this;
    }

    /**
     * @return limit
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getLimit()
    {
        return limit;
    }


    public void setLimit(Integer limit)
    {
        this.limit = limit;
    }


    public DseObjectTypeGroupQueryDto order(String order)
    {

        this.order = order;
        return this;
    }

    /**
     * @return order
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getOrder()
    {
        return order;
    }


    public void setOrder(String order)
    {
        this.order = order;
    }


    public DseObjectTypeGroupQueryDto query(String query)
    {

        this.query = query;
        return this;
    }

    /**
     * @return query
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getQuery()
    {
        return query;
    }


    public void setQuery(String query)
    {
        this.query = query;
    }


    public DseObjectTypeGroupQueryDto sort(String sort)
    {

        this.sort = sort;
        return this;
    }

    /**
     * @return sort
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getSort()
    {
        return sort;
    }


    public void setSort(String sort)
    {
        this.sort = sort;
    }


    public DseObjectTypeGroupQueryDto start(Integer start)
    {

        this.start = start;
        return this;
    }

    /**
     * @return start
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getStart()
    {
        return start;
    }


    public void setStart(Integer start)
    {
        this.start = start;
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
        DseObjectTypeGroupQueryDto dseObjectTypeGroupQueryDto = (DseObjectTypeGroupQueryDto) o;
        return Objects.equals(this.limit, dseObjectTypeGroupQueryDto.limit) &&
                Objects.equals(this.order, dseObjectTypeGroupQueryDto.order) &&
                Objects.equals(this.query, dseObjectTypeGroupQueryDto.query) &&
                Objects.equals(this.sort, dseObjectTypeGroupQueryDto.sort) &&
                Objects.equals(this.start, dseObjectTypeGroupQueryDto.start);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(limit, order, query, sort, start);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class DseObjectTypeGroupQueryDto {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
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

