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

public class MaplYearDto
{
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private Integer startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private Integer endDate;

  public static final String SERIALIZED_NAME_PLANNING_TYPE = "planningType";
  @SerializedName(SERIALIZED_NAME_PLANNING_TYPE)
  private String planningType;

  public static final String SERIALIZED_NAME_CURRENCY_ID = "currencyId";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
  private Integer currencyId;


  public MaplYearDto id(Integer id)
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


  public MaplYearDto name(String name)
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


  public MaplYearDto startDate(Integer startDate)
  {

    this.startDate = startDate;
    return this;
  }

  /**
   * @return startDate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStartDate()
  {
    return startDate;
  }


  public void setStartDate(Integer startDate)
  {
    this.startDate = startDate;
  }


  public MaplYearDto endDate(Integer endDate)
  {

    this.endDate = endDate;
    return this;
  }

  /**
   * @return endDate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEndDate()
  {
    return endDate;
  }


  public void setEndDate(Integer endDate)
  {
    this.endDate = endDate;
  }


  public MaplYearDto planningType(String planningType)
  {

    this.planningType = planningType;
    return this;
  }

  /**
   * @return planningType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPlanningType()
  {
    return planningType;
  }


  public void setPlanningType(String planningType)
  {
    this.planningType = planningType;
  }


  public MaplYearDto currencyId(Integer currencyId)
  {

    this.currencyId = currencyId;
    return this;
  }

  /**
   * @return currencyId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCurrencyId()
  {
    return currencyId;
  }


  public void setCurrencyId(Integer currencyId)
  {
    this.currencyId = currencyId;
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
    MaplYearDto maplYearDto = (MaplYearDto) o;
    return Objects.equals(this.id, maplYearDto.id) &&
            Objects.equals(this.name, maplYearDto.name) &&
            Objects.equals(this.startDate, maplYearDto.startDate) &&
            Objects.equals(this.endDate, maplYearDto.endDate) &&
            Objects.equals(this.planningType, maplYearDto.planningType) &&
            Objects.equals(this.currencyId, maplYearDto.currencyId);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, name, startDate, endDate, planningType, currencyId);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaplYearDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    planningType: ").append(toIndentedString(planningType)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
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
