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
 * TaskTimelineDtoAllOf
 */

public class TaskTimelineDtoAllOf
{
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ASSIGNEE_ID = "assigneeId";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE_ID)
  private Integer assigneeId;


  public TaskTimelineDtoAllOf name(String name)
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


  public TaskTimelineDtoAllOf assigneeId(Integer assigneeId)
  {

    this.assigneeId = assigneeId;
    return this;
  }

  /**
   * @return assigneeId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAssigneeId()
  {
    return assigneeId;
  }


  public void setAssigneeId(Integer assigneeId)
  {
    this.assigneeId = assigneeId;
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
    TaskTimelineDtoAllOf taskTimelineDtoAllOf = (TaskTimelineDtoAllOf) o;
    return Objects.equals(this.name, taskTimelineDtoAllOf.name) &&
            Objects.equals(this.assigneeId, taskTimelineDtoAllOf.assigneeId);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(name, assigneeId);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskTimelineDtoAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
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

