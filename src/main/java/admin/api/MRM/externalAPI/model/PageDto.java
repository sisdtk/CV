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
 * Generic page of data
 */
@ApiModel(description = "Generic page of data")

public class PageDto
{
  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private List<Object> data = null;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_TOTAL_COUNT = "totalCount";
  @SerializedName(SERIALIZED_NAME_TOTAL_COUNT)
  private Integer totalCount;


  public PageDto data(List<Object> data)
  {

    this.data = data;
    return this;
  }

  public PageDto addDataItem(Object dataItem)
  {
    if (this.data == null)
    {
      this.data = new ArrayList<Object>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * @return data
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Object> getData()
  {
    return data;
  }


  public void setData(List<Object> data)
  {
    this.data = data;
  }


  public PageDto offset(Integer offset)
  {

    this.offset = offset;
    return this;
  }

  /**
   * @return offset
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getOffset()
  {
    return offset;
  }


  public void setOffset(Integer offset)
  {
    this.offset = offset;
  }


  public PageDto limit(Integer limit)
  {

    this.limit = limit;
    return this;
  }

  /**
   * @return limit
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getLimit()
  {
    return limit;
  }


  public void setLimit(Integer limit)
  {
    this.limit = limit;
  }


  public PageDto totalCount(Integer totalCount)
  {

    this.totalCount = totalCount;
    return this;
  }

  /**
   * @return totalCount
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getTotalCount()
  {
    return totalCount;
  }


  public void setTotalCount(Integer totalCount)
  {
    this.totalCount = totalCount;
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
    PageDto pageDto = (PageDto) o;
    return Objects.equals(this.data, pageDto.data) &&
            Objects.equals(this.offset, pageDto.offset) &&
            Objects.equals(this.limit, pageDto.limit) &&
            Objects.equals(this.totalCount, pageDto.totalCount);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(data, offset, limit, totalCount);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageDto {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
