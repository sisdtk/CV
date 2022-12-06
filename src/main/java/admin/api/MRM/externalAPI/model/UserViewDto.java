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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 */
@ApiModel(description = "")

public class UserViewDto
{
  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private LocalDate startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private LocalDate endDate;

  public static final String SERIALIZED_NAME_ZOOM_LEVEL = "zoomLevel";
  @SerializedName(SERIALIZED_NAME_ZOOM_LEVEL)
  private Integer zoomLevel;

  public static final String SERIALIZED_NAME_USER_RESOURCE_IDS = "userResourceIds";
  @SerializedName(SERIALIZED_NAME_USER_RESOURCE_IDS)
  private List<Integer> userResourceIds = null;

  public static final String SERIALIZED_NAME_VERTICAL_OFFSET = "verticalOffset";
  @SerializedName(SERIALIZED_NAME_VERTICAL_OFFSET)
  private Integer verticalOffset;

  public static final String SERIALIZED_NAME_HORIZONTAL_OFFSET = "horizontalOffset";
  @SerializedName(SERIALIZED_NAME_HORIZONTAL_OFFSET)
  private Integer horizontalOffset;


  public UserViewDto userId(Integer userId)
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


  public UserViewDto startDate(LocalDate startDate)
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


  public UserViewDto endDate(LocalDate endDate)
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


  public UserViewDto zoomLevel(Integer zoomLevel)
  {

    this.zoomLevel = zoomLevel;
    return this;
  }

  /**
   * @return zoomLevel
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getZoomLevel()
  {
    return zoomLevel;
  }


  public void setZoomLevel(Integer zoomLevel)
  {
    this.zoomLevel = zoomLevel;
  }


  public UserViewDto userResourceIds(List<Integer> userResourceIds)
  {

    this.userResourceIds = userResourceIds;
    return this;
  }

  public UserViewDto addUserResourceIdsItem(Integer userResourceIdsItem)
  {
    if (this.userResourceIds == null)
    {
      this.userResourceIds = new ArrayList<Integer>();
    }
    this.userResourceIds.add(userResourceIdsItem);
    return this;
  }

  /**
   * @return userResourceIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getUserResourceIds()
  {
    return userResourceIds;
  }


  public void setUserResourceIds(List<Integer> userResourceIds)
  {
    this.userResourceIds = userResourceIds;
  }


  public UserViewDto verticalOffset(Integer verticalOffset)
  {

    this.verticalOffset = verticalOffset;
    return this;
  }

  /**
   * @return verticalOffset
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVerticalOffset()
  {
    return verticalOffset;
  }


  public void setVerticalOffset(Integer verticalOffset)
  {
    this.verticalOffset = verticalOffset;
  }


  public UserViewDto horizontalOffset(Integer horizontalOffset)
  {

    this.horizontalOffset = horizontalOffset;
    return this;
  }

  /**
   * @return horizontalOffset
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getHorizontalOffset()
  {
    return horizontalOffset;
  }


  public void setHorizontalOffset(Integer horizontalOffset)
  {
    this.horizontalOffset = horizontalOffset;
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
    UserViewDto userViewDto = (UserViewDto) o;
    return Objects.equals(this.userId, userViewDto.userId) &&
            Objects.equals(this.startDate, userViewDto.startDate) &&
            Objects.equals(this.endDate, userViewDto.endDate) &&
            Objects.equals(this.zoomLevel, userViewDto.zoomLevel) &&
            Objects.equals(this.userResourceIds, userViewDto.userResourceIds) &&
            Objects.equals(this.verticalOffset, userViewDto.verticalOffset) &&
            Objects.equals(this.horizontalOffset, userViewDto.horizontalOffset);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(userId, startDate, endDate, zoomLevel, userResourceIds, verticalOffset, horizontalOffset);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserViewDto {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    zoomLevel: ").append(toIndentedString(zoomLevel)).append("\n");
    sb.append("    userResourceIds: ").append(toIndentedString(userResourceIds)).append("\n");
    sb.append("    verticalOffset: ").append(toIndentedString(verticalOffset)).append("\n");
    sb.append("    horizontalOffset: ").append(toIndentedString(horizontalOffset)).append("\n");
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
