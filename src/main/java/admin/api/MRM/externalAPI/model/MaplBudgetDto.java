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

public class MaplBudgetDto
{
  public static final String SERIALIZED_NAME_YEAR = "year";
  @SerializedName(SERIALIZED_NAME_YEAR)
  private MaplBYearDto year;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private MaplBMonthDTO month;

  public static final String SERIALIZED_NAME_QUARTER = "quarter";
  @SerializedName(SERIALIZED_NAME_QUARTER)
  private MaplBQuarterDto quarter;


  public MaplBudgetDto year(MaplBYearDto year)
  {

    this.year = year;
    return this;
  }

  /**
   * Get year
   *
   * @return year
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MaplBYearDto getYear()
  {
    return year;
  }


  public void setYear(MaplBYearDto year)
  {
    this.year = year;
  }


  public MaplBudgetDto month(MaplBMonthDTO month)
  {

    this.month = month;
    return this;
  }

  /**
   * Get month
   *
   * @return month
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MaplBMonthDTO getMonth()
  {
    return month;
  }


  public void setMonth(MaplBMonthDTO month)
  {
    this.month = month;
  }


  public MaplBudgetDto quarter(MaplBQuarterDto quarter)
  {

    this.quarter = quarter;
    return this;
  }

  /**
   * Get quarter
   *
   * @return quarter
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MaplBQuarterDto getQuarter()
  {
    return quarter;
  }


  public void setQuarter(MaplBQuarterDto quarter)
  {
    this.quarter = quarter;
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
    MaplBudgetDto maplBudgetDto = (MaplBudgetDto) o;
    return Objects.equals(this.year, maplBudgetDto.year) &&
            Objects.equals(this.month, maplBudgetDto.month) &&
            Objects.equals(this.quarter, maplBudgetDto.quarter);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(year, month, quarter);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaplBudgetDto {\n");
    sb.append("    year: ").append(toIndentedString(year)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    quarter: ").append(toIndentedString(quarter)).append("\n");
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

