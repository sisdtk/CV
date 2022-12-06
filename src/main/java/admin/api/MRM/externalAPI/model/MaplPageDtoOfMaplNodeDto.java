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
 *
 */
@ApiModel(description = "")

public class MaplPageDtoOfMaplNodeDto
{
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private List<MaplNodeDto> content = null;

  public static final String SERIALIZED_NAME_OFFSET = "offset";
  @SerializedName(SERIALIZED_NAME_OFFSET)
  private Integer offset;

  public static final String SERIALIZED_NAME_TOTAL_ELEMENTS = "totalElements";
  @SerializedName(SERIALIZED_NAME_TOTAL_ELEMENTS)
  private Long totalElements;

  public static final String SERIALIZED_NAME_LIMIT = "limit";
  @SerializedName(SERIALIZED_NAME_LIMIT)
  private Integer limit;

  public static final String SERIALIZED_NAME_NUMBER_OF_ELEMENTS = "numberOfElements";
  @SerializedName(SERIALIZED_NAME_NUMBER_OF_ELEMENTS)
  private Integer numberOfElements;


  public MaplPageDtoOfMaplNodeDto content(List<MaplNodeDto> content)
  {

    this.content = content;
    return this;
  }

  public MaplPageDtoOfMaplNodeDto addContentItem(MaplNodeDto contentItem)
  {
    if (this.content == null)
    {
      this.content = new ArrayList<MaplNodeDto>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * @return content
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MaplNodeDto> getContent()
  {
    return content;
  }


  public void setContent(List<MaplNodeDto> content)
  {
    this.content = content;
  }


  public MaplPageDtoOfMaplNodeDto offset(Integer offset)
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


  public MaplPageDtoOfMaplNodeDto totalElements(Long totalElements)
  {

    this.totalElements = totalElements;
    return this;
  }

  /**
   * @return totalElements
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Long getTotalElements()
  {
    return totalElements;
  }


  public void setTotalElements(Long totalElements)
  {
    this.totalElements = totalElements;
  }


  public MaplPageDtoOfMaplNodeDto limit(Integer limit)
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


  public MaplPageDtoOfMaplNodeDto numberOfElements(Integer numberOfElements)
  {

    this.numberOfElements = numberOfElements;
    return this;
  }

  /**
   * @return numberOfElements
   **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getNumberOfElements()
  {
    return numberOfElements;
  }


  public void setNumberOfElements(Integer numberOfElements)
  {
    this.numberOfElements = numberOfElements;
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
    MaplPageDtoOfMaplNodeDto maplPageDtoOfMaplNodeDto = (MaplPageDtoOfMaplNodeDto) o;
    return Objects.equals(this.content, maplPageDtoOfMaplNodeDto.content) &&
            Objects.equals(this.offset, maplPageDtoOfMaplNodeDto.offset) &&
            Objects.equals(this.totalElements, maplPageDtoOfMaplNodeDto.totalElements) &&
            Objects.equals(this.limit, maplPageDtoOfMaplNodeDto.limit) &&
            Objects.equals(this.numberOfElements, maplPageDtoOfMaplNodeDto.numberOfElements);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(content, offset, totalElements, limit, numberOfElements);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaplPageDtoOfMaplNodeDto {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
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

