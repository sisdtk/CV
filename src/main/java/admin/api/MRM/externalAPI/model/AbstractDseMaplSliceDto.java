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
 * Abstract slice of data read from MAPL
 */
@ApiModel(description = "Abstract slice of data read from MAPL")

public class AbstractDseMaplSliceDto
{
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private List<Object> content = null;


  public AbstractDseMaplSliceDto content(List<Object> content)
  {

    this.content = content;
    return this;
  }

  public AbstractDseMaplSliceDto addContentItem(Object contentItem)
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
    AbstractDseMaplSliceDto abstractDseMaplSliceDto = (AbstractDseMaplSliceDto) o;
    return Objects.equals(this.content, abstractDseMaplSliceDto.content);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(content);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AbstractDseMaplSliceDto {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
