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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 */
@ApiModel(description = "")

public class BpmnWorkflowStepInstanceQuery
{
  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;

  public static final String SERIALIZED_NAME_USER_GROUP_IDS = "userGroupIds";
  @SerializedName(SERIALIZED_NAME_USER_GROUP_IDS)
  private List<Integer> userGroupIds = null;

  public static final String SERIALIZED_NAME_PROCESS_INSTANCE_ID = "processInstanceId";
  @SerializedName(SERIALIZED_NAME_PROCESS_INSTANCE_ID)
  private String processInstanceId;

  public static final String SERIALIZED_NAME_TIMEOUT = "timeout";
  @SerializedName(SERIALIZED_NAME_TIMEOUT)
  private Integer timeout;


  public BpmnWorkflowStepInstanceQuery userId(Integer userId)
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


  public BpmnWorkflowStepInstanceQuery userGroupIds(List<Integer> userGroupIds)
  {

    this.userGroupIds = userGroupIds;
    return this;
  }

  public BpmnWorkflowStepInstanceQuery addUserGroupIdsItem(Integer userGroupIdsItem)
  {
    if (this.userGroupIds == null)
    {
      this.userGroupIds = new ArrayList<Integer>();
    }
    this.userGroupIds.add(userGroupIdsItem);
    return this;
  }

  /**
   * @return userGroupIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getUserGroupIds()
  {
    return userGroupIds;
  }


  public void setUserGroupIds(List<Integer> userGroupIds)
  {
    this.userGroupIds = userGroupIds;
  }


  public BpmnWorkflowStepInstanceQuery processInstanceId(String processInstanceId)
  {

    this.processInstanceId = processInstanceId;
    return this;
  }

  /**
   * @return processInstanceId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getProcessInstanceId()
  {
    return processInstanceId;
  }


  public void setProcessInstanceId(String processInstanceId)
  {
    this.processInstanceId = processInstanceId;
  }


  public BpmnWorkflowStepInstanceQuery timeout(Integer timeout)
  {

    this.timeout = timeout;
    return this;
  }

  /**
   * @return timeout
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTimeout()
  {
    return timeout;
  }


  public void setTimeout(Integer timeout)
  {
    this.timeout = timeout;
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
    BpmnWorkflowStepInstanceQuery bpmnWorkflowStepInstanceQuery = (BpmnWorkflowStepInstanceQuery) o;
    return Objects.equals(this.userId, bpmnWorkflowStepInstanceQuery.userId) &&
            Objects.equals(this.userGroupIds, bpmnWorkflowStepInstanceQuery.userGroupIds) &&
            Objects.equals(this.processInstanceId, bpmnWorkflowStepInstanceQuery.processInstanceId) &&
            Objects.equals(this.timeout, bpmnWorkflowStepInstanceQuery.timeout);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(userId, userGroupIds, processInstanceId, timeout);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BpmnWorkflowStepInstanceQuery {\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userGroupIds: ").append(toIndentedString(userGroupIds)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
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

