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
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * UserVariableDtoAllOf
 */

public class UserVariableDtoAllOf
{
  public static final String SERIALIZED_NAME_USER_GROUP_ID = "userGroupId";
  @SerializedName(SERIALIZED_NAME_USER_GROUP_ID)
  private Integer userGroupId;

  public static final String SERIALIZED_NAME_DEFAULT_USER = "defaultUser";
  @SerializedName(SERIALIZED_NAME_DEFAULT_USER)
  private Integer defaultUser;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private UserDto user;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;


  public UserVariableDtoAllOf userGroupId(Integer userGroupId)
  {

    this.userGroupId = userGroupId;
    return this;
  }

  /**
   * @return userGroupId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getUserGroupId()
  {
    return userGroupId;
  }


  public void setUserGroupId(Integer userGroupId)
  {
    this.userGroupId = userGroupId;
  }


  public UserVariableDtoAllOf defaultUser(Integer defaultUser)
  {

    this.defaultUser = defaultUser;
    return this;
  }

  /**
   * @return defaultUser
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDefaultUser()
  {
    return defaultUser;
  }


  public void setDefaultUser(Integer defaultUser)
  {
    this.defaultUser = defaultUser;
  }


  public UserVariableDtoAllOf user(UserDto user)
  {

    this.user = user;
    return this;
  }

  /**
   * Get user
   *
   * @return user
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserDto getUser()
  {
    return user;
  }


  public void setUser(UserDto user)
  {
    this.user = user;
  }


  public UserVariableDtoAllOf displayName(String displayName)
  {

    this.displayName = displayName;
    return this;
  }

  /**
   * @return displayName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName()
  {
    return displayName;
  }


  public void setDisplayName(String displayName)
  {
    this.displayName = displayName;
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
    UserVariableDtoAllOf userVariableDtoAllOf = (UserVariableDtoAllOf) o;
    return Objects.equals(this.userGroupId, userVariableDtoAllOf.userGroupId) &&
            Objects.equals(this.defaultUser, userVariableDtoAllOf.defaultUser) &&
            Objects.equals(this.user, userVariableDtoAllOf.user) &&
            Objects.equals(this.displayName, userVariableDtoAllOf.displayName);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(userGroupId, defaultUser, user, displayName);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserVariableDtoAllOf {\n");
    sb.append("    userGroupId: ").append(toIndentedString(userGroupId)).append("\n");
    sb.append("    defaultUser: ").append(toIndentedString(defaultUser)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

