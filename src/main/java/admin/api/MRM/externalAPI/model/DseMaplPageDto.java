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
 * Page of data loaded from MAPL
 */
@ApiModel(description = "Page of data loaded from MAPL")

public class DseMaplPageDto
{
    public static final String SERIALIZED_NAME_CONTENT = "content";
    @SerializedName(SERIALIZED_NAME_CONTENT)
    private List<Object> content = null;

    public static final String SERIALIZED_NAME_OFFSET = "offset";
    @SerializedName(SERIALIZED_NAME_OFFSET)
    private Integer offset;

    public static final String SERIALIZED_NAME_LIMIT = "limit";
    @SerializedName(SERIALIZED_NAME_LIMIT)
    private Integer limit;

    public static final String SERIALIZED_NAME_TOTAL_ELEMENTS = "totalElements";
    @SerializedName(SERIALIZED_NAME_TOTAL_ELEMENTS)
    private Long totalElements;


    public DseMaplPageDto content(List<Object> content)
    {

        this.content = content;
        return this;
    }

    public DseMaplPageDto addContentItem(Object contentItem)
    {
        if (this.content == null)
        {
            this.content = new ArrayList<Object>();
        }
        this.content.add(contentItem);
        return this;
    }

    /**
     * @return content
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<Object> getContent()
    {
        return content;
    }


    public void setContent(List<Object> content)
    {
        this.content = content;
    }


    public DseMaplPageDto offset(Integer offset)
    {

        this.offset = offset;
        return this;
    }

    /**
     * @return offset
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getOffset()
    {
        return offset;
    }


    public void setOffset(Integer offset)
    {
        this.offset = offset;
    }


    public DseMaplPageDto limit(Integer limit)
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


    public DseMaplPageDto totalElements(Long totalElements)
    {

        this.totalElements = totalElements;
        return this;
    }

    /**
     * @return totalElements
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Long getTotalElements()
    {
        return totalElements;
    }


    public void setTotalElements(Long totalElements)
    {
        this.totalElements = totalElements;
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
        DseMaplPageDto dseMaplPageDto = (DseMaplPageDto) o;
        return Objects.equals(this.content, dseMaplPageDto.content) &&
                Objects.equals(this.offset, dseMaplPageDto.offset) &&
                Objects.equals(this.limit, dseMaplPageDto.limit) &&
                Objects.equals(this.totalElements, dseMaplPageDto.totalElements);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(content, offset, limit, totalElements);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class DseMaplPageDto {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
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

