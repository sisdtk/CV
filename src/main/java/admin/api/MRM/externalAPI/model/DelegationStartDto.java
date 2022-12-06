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
 * Period for which delegation is active
 */
@ApiModel(description = "Period for which delegation is active")

public class DelegationStartDto
{
  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  private String login;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private Integer startDate;

  public static final String SERIALIZED_NAME_STOP_DATE = "stopDate";
  @SerializedName(SERIALIZED_NAME_STOP_DATE)
  private Integer stopDate;


  public DelegationStartDto login(String login)
  {

    this.login = login;
    return this;
  }

  /**
   * @return login
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLogin()
  {
    return login;
  }


  public void setLogin(String login)
  {
    this.login = login;
  }


  public DelegationStartDto startDate(Integer startDate)
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


  public DelegationStartDto stopDate(Integer stopDate)
  {

    this.stopDate = stopDate;
    return this;
  }

  /**
   * @return stopDate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStopDate()
  {
    return stopDate;
  }


  public void setStopDate(Integer stopDate)
  {
    this.stopDate = stopDate;
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
    DelegationStartDto delegationStartDto = (DelegationStartDto) o;
    return Objects.equals(this.login, delegationStartDto.login) &&
            Objects.equals(this.startDate, delegationStartDto.startDate) &&
            Objects.equals(this.stopDate, delegationStartDto.stopDate);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(login, startDate, stopDate);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DelegationStartDto {\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    stopDate: ").append(toIndentedString(stopDate)).append("\n");
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

