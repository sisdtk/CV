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

public class VariableVisibilityDto
{
  public static final String SERIALIZED_NAME_VISIBLE_TO_ANONYMOUS = "visibleToAnonymous";
  @SerializedName(SERIALIZED_NAME_VISIBLE_TO_ANONYMOUS)
  private ReadAccessEnum visibleToAnonymous;

  public static final String SERIALIZED_NAME_VISIBLE_TO_OTHERS = "visibleToOthers";
  @SerializedName(SERIALIZED_NAME_VISIBLE_TO_OTHERS)
  private ReadAccessEnum visibleToOthers;

  public static final String SERIALIZED_NAME_VISIBLE_TO_CREATOR = "visibleToCreator";
  @SerializedName(SERIALIZED_NAME_VISIBLE_TO_CREATOR)
  private ReadAccessEnum visibleToCreator;

  public static final String SERIALIZED_NAME_VISIBLE_TO_ASSIGNEE = "visibleToAssignee";
  @SerializedName(SERIALIZED_NAME_VISIBLE_TO_ASSIGNEE)
  private AssigneeAccessEnum visibleToAssignee;


  public VariableVisibilityDto visibleToAnonymous(ReadAccessEnum visibleToAnonymous)
  {

    this.visibleToAnonymous = visibleToAnonymous;
    return this;
  }

  /**
   * Get visibleToAnonymous
   *
   * @return visibleToAnonymous
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReadAccessEnum getVisibleToAnonymous()
  {
    return visibleToAnonymous;
  }


  public void setVisibleToAnonymous(ReadAccessEnum visibleToAnonymous)
  {
    this.visibleToAnonymous = visibleToAnonymous;
  }


  public VariableVisibilityDto visibleToOthers(ReadAccessEnum visibleToOthers)
  {

    this.visibleToOthers = visibleToOthers;
    return this;
  }

  /**
   * Get visibleToOthers
   *
   * @return visibleToOthers
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReadAccessEnum getVisibleToOthers()
  {
    return visibleToOthers;
  }


  public void setVisibleToOthers(ReadAccessEnum visibleToOthers)
  {
    this.visibleToOthers = visibleToOthers;
  }


  public VariableVisibilityDto visibleToCreator(ReadAccessEnum visibleToCreator)
  {

    this.visibleToCreator = visibleToCreator;
    return this;
  }

  /**
   * Get visibleToCreator
   *
   * @return visibleToCreator
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ReadAccessEnum getVisibleToCreator()
  {
    return visibleToCreator;
  }


  public void setVisibleToCreator(ReadAccessEnum visibleToCreator)
  {
    this.visibleToCreator = visibleToCreator;
  }


  public VariableVisibilityDto visibleToAssignee(AssigneeAccessEnum visibleToAssignee)
  {

    this.visibleToAssignee = visibleToAssignee;
    return this;
  }

  /**
   * Get visibleToAssignee
   *
   * @return visibleToAssignee
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AssigneeAccessEnum getVisibleToAssignee()
  {
    return visibleToAssignee;
  }


  public void setVisibleToAssignee(AssigneeAccessEnum visibleToAssignee)
  {
    this.visibleToAssignee = visibleToAssignee;
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
    VariableVisibilityDto variableVisibilityDto = (VariableVisibilityDto) o;
    return Objects.equals(this.visibleToAnonymous, variableVisibilityDto.visibleToAnonymous) &&
            Objects.equals(this.visibleToOthers, variableVisibilityDto.visibleToOthers) &&
            Objects.equals(this.visibleToCreator, variableVisibilityDto.visibleToCreator) &&
            Objects.equals(this.visibleToAssignee, variableVisibilityDto.visibleToAssignee);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(visibleToAnonymous, visibleToOthers, visibleToCreator, visibleToAssignee);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VariableVisibilityDto {\n");
    sb.append("    visibleToAnonymous: ").append(toIndentedString(visibleToAnonymous)).append("\n");
    sb.append("    visibleToOthers: ").append(toIndentedString(visibleToOthers)).append("\n");
    sb.append("    visibleToCreator: ").append(toIndentedString(visibleToCreator)).append("\n");
    sb.append("    visibleToAssignee: ").append(toIndentedString(visibleToAssignee)).append("\n");
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
