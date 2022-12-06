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
import org.threeten.bp.LocalDate;

import java.util.Objects;

/**
 *
 */
@ApiModel(description = "")

public class BaseTimelineDto
{
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_JOB_TYPE_ID = "jobTypeId";
  @SerializedName(SERIALIZED_NAME_JOB_TYPE_ID)
  private Integer jobTypeId;

  public static final String SERIALIZED_NAME_JOB_NAME = "jobName";
  @SerializedName(SERIALIZED_NAME_JOB_NAME)
  private String jobName;

  public static final String SERIALIZED_NAME_JOB_TYPE_NAME = "jobTypeName";
  @SerializedName(SERIALIZED_NAME_JOB_TYPE_NAME)
  private String jobTypeName;


  public BaseTimelineDto startDate(LocalDate startDate)
  {

    this.startDate = startDate;
    return this;
  }

  /**
   * @return startDate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getStartDate()
  {
    return startDate;
  }


  public void setStartDate(LocalDate startDate)
  {
    this.startDate = startDate;
  }


  public BaseTimelineDto endDate(LocalDate endDate)
  {

    this.endDate = endDate;
    return this;
  }

  /**
   * @return endDate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public LocalDate getEndDate()
  {
    return endDate;
  }


  public void setEndDate(LocalDate endDate)
  {
    this.endDate = endDate;
  }


  public BaseTimelineDto jobTypeId(Integer jobTypeId)
  {

    this.jobTypeId = jobTypeId;
    return this;
  }

  /**
   * @return jobTypeId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getJobTypeId()
  {
    return jobTypeId;
  }


  public void setJobTypeId(Integer jobTypeId)
  {
    this.jobTypeId = jobTypeId;
  }


  public BaseTimelineDto jobName(String jobName)
  {

    this.jobName = jobName;
    return this;
  }

  /**
   * @return jobName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJobName()
  {
    return jobName;
  }


  public void setJobName(String jobName)
  {
    this.jobName = jobName;
  }


  public BaseTimelineDto jobTypeName(String jobTypeName)
  {

    this.jobTypeName = jobTypeName;
    return this;
  }

  /**
   * @return jobTypeName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJobTypeName()
  {
    return jobTypeName;
  }


  public void setJobTypeName(String jobTypeName)
  {
    this.jobTypeName = jobTypeName;
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
    BaseTimelineDto baseTimelineDto = (BaseTimelineDto) o;
    return Objects.equals(this.startDate, baseTimelineDto.startDate) &&
            Objects.equals(this.endDate, baseTimelineDto.endDate) &&
            Objects.equals(this.jobTypeId, baseTimelineDto.jobTypeId) &&
            Objects.equals(this.jobName, baseTimelineDto.jobName) &&
            Objects.equals(this.jobTypeName, baseTimelineDto.jobTypeName);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(startDate, endDate, jobTypeId, jobName, jobTypeName);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseTimelineDto {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    jobTypeId: ").append(toIndentedString(jobTypeId)).append("\n");
    sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
    sb.append("    jobTypeName: ").append(toIndentedString(jobTypeName)).append("\n");
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

