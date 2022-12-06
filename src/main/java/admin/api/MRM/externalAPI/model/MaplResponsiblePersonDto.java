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
 * MAPL responsible person
 */
@ApiModel(description = "MAPL responsible person")

public class MaplResponsiblePersonDto
{
  public static final String SERIALIZED_NAME_LOGIN = "login";
  @SerializedName(SERIALIZED_NAME_LOGIN)
  private String login;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;


  public MaplResponsiblePersonDto login(String login)
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


  public MaplResponsiblePersonDto userId(Integer userId)
  {

    this.userId = userId;
    return this;
  }

  /**
   * @return userId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUserId()
  {
    return userId;
  }


  public void setUserId(Integer userId)
  {
    this.userId = userId;
  }


  public MaplResponsiblePersonDto firstName(String firstName)
  {

    this.firstName = firstName;
    return this;
  }

  /**
   * @return firstName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName()
  {
    return firstName;
  }


  public void setFirstName(String firstName)
  {
    this.firstName = firstName;
  }


  public MaplResponsiblePersonDto lastName(String lastName)
  {

    this.lastName = lastName;
    return this;
  }

  /**
   * @return lastName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName()
  {
    return lastName;
  }


  public void setLastName(String lastName)
  {
    this.lastName = lastName;
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
    MaplResponsiblePersonDto maplResponsiblePersonDto = (MaplResponsiblePersonDto) o;
    return Objects.equals(this.login, maplResponsiblePersonDto.login) &&
            Objects.equals(this.userId, maplResponsiblePersonDto.userId) &&
            Objects.equals(this.firstName, maplResponsiblePersonDto.firstName) &&
            Objects.equals(this.lastName, maplResponsiblePersonDto.lastName);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(login, userId, firstName, lastName);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaplResponsiblePersonDto {\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
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
