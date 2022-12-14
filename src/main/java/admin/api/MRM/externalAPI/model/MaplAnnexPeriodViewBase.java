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

import java.util.Objects;

/**
 *
 */
@ApiModel(description = "")

public class MaplAnnexPeriodViewBase
{
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private Integer startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private Integer endDate;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "categoryId";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private Integer categoryId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public MaplAnnexPeriodViewBase id(Integer id)
  {

    this.id = id;
    return this;
  }

  /**
   * @return id
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId()
  {
    return id;
  }


  public void setId(Integer id)
  {
    this.id = id;
  }


  public MaplAnnexPeriodViewBase startDate(Integer startDate)
  {

    this.startDate = startDate;
    return this;
  }

  /**
   * required
   *
   * @return startDate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "required")

  public Integer getStartDate()
  {
    return startDate;
  }


  public void setStartDate(Integer startDate)
  {
    this.startDate = startDate;
  }


  public MaplAnnexPeriodViewBase endDate(Integer endDate)
  {

    this.endDate = endDate;
    return this;
  }

  /**
   * required
   *
   * @return endDate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "required")

  public Integer getEndDate()
  {
    return endDate;
  }


  public void setEndDate(Integer endDate)
  {
    this.endDate = endDate;
  }


  public MaplAnnexPeriodViewBase categoryId(Integer categoryId)
  {

    this.categoryId = categoryId;
    return this;
  }

  /**
   * required
   *
   * @return categoryId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "required")

  public Integer getCategoryId()
  {
    return categoryId;
  }


  public void setCategoryId(Integer categoryId)
  {
    this.categoryId = categoryId;
  }


  public MaplAnnexPeriodViewBase name(String name)
  {

    this.name = name;
    return this;
  }

  /**
   * @return name
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName()
  {
    return name;
  }


  public void setName(String name)
  {
    this.name = name;
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
    MaplAnnexPeriodViewBase maplAnnexPeriodViewBase = (MaplAnnexPeriodViewBase) o;
    return Objects.equals(this.id, maplAnnexPeriodViewBase.id) &&
            Objects.equals(this.startDate, maplAnnexPeriodViewBase.startDate) &&
            Objects.equals(this.endDate, maplAnnexPeriodViewBase.endDate) &&
            Objects.equals(this.categoryId, maplAnnexPeriodViewBase.categoryId) &&
            Objects.equals(this.name, maplAnnexPeriodViewBase.name);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, startDate, endDate, categoryId, name);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaplAnnexPeriodViewBase {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

