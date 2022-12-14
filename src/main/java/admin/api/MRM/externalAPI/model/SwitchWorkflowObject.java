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

public class SwitchWorkflowObject
{
  public static final String SERIALIZED_NAME_WORKFLOW_TYPE_ID = "workflowTypeId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TYPE_ID)
  private Integer workflowTypeId;

  public static final String SERIALIZED_NAME_WORKFLOW_STEP_TEMPLATE_ID = "workflowStepTemplateId";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_STEP_TEMPLATE_ID)
  private Integer workflowStepTemplateId;

  public static final String SERIALIZED_NAME_USER_ID = "userId";
  @SerializedName(SERIALIZED_NAME_USER_ID)
  private Integer userId;


  public SwitchWorkflowObject workflowTypeId(Integer workflowTypeId)
  {

    this.workflowTypeId = workflowTypeId;
    return this;
  }

  /**
   * @return workflowTypeId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWorkflowTypeId()
  {
    return workflowTypeId;
  }


  public void setWorkflowTypeId(Integer workflowTypeId)
  {
    this.workflowTypeId = workflowTypeId;
  }


  public SwitchWorkflowObject workflowStepTemplateId(Integer workflowStepTemplateId)
  {

    this.workflowStepTemplateId = workflowStepTemplateId;
    return this;
  }

  /**
   * @return workflowStepTemplateId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWorkflowStepTemplateId()
  {
    return workflowStepTemplateId;
  }


  public void setWorkflowStepTemplateId(Integer workflowStepTemplateId)
  {
    this.workflowStepTemplateId = workflowStepTemplateId;
  }


  public SwitchWorkflowObject userId(Integer userId)
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
    SwitchWorkflowObject switchWorkflowObject = (SwitchWorkflowObject) o;
    return Objects.equals(this.workflowTypeId, switchWorkflowObject.workflowTypeId) &&
            Objects.equals(this.workflowStepTemplateId, switchWorkflowObject.workflowStepTemplateId) &&
            Objects.equals(this.userId, switchWorkflowObject.userId);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(workflowTypeId, workflowStepTemplateId, userId);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchWorkflowObject {\n");
    sb.append("    workflowTypeId: ").append(toIndentedString(workflowTypeId)).append("\n");
    sb.append("    workflowStepTemplateId: ").append(toIndentedString(workflowStepTemplateId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

