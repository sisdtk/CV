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

public class BpmnWorkflowObject
{
  public static final String SERIALIZED_NAME_WORKFLOW_OBJECT_TYPE_I_D = "workflowObjectTypeID";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_OBJECT_TYPE_I_D)
  private Integer workflowObjectTypeID;

  public static final String SERIALIZED_NAME_WORKFLOW_TYPE_I_D = "workflowTypeID";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TYPE_I_D)
  private Integer workflowTypeID;

  public static final String SERIALIZED_NAME_WORKFLOW_STATUS = "workflowStatus";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_STATUS)
  private Status workflowStatus;

  public static final String SERIALIZED_NAME_WORKFLOW_OBJECT_I_D = "workflowObjectID";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_OBJECT_I_D)
  private Integer workflowObjectID;

  public static final String SERIALIZED_NAME_WORKFLOW_TYPE = "workflowType";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TYPE)
  private WorkflowType workflowType;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_PROCESS_INSTANCE_ID = "processInstanceId";
  @SerializedName(SERIALIZED_NAME_PROCESS_INSTANCE_ID)
  private String processInstanceId;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private Integer endDate;


  public BpmnWorkflowObject workflowObjectTypeID(Integer workflowObjectTypeID)
  {

    this.workflowObjectTypeID = workflowObjectTypeID;
    return this;
  }

  /**
   * @return workflowObjectTypeID
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWorkflowObjectTypeID()
  {
    return workflowObjectTypeID;
  }


  public void setWorkflowObjectTypeID(Integer workflowObjectTypeID)
  {
    this.workflowObjectTypeID = workflowObjectTypeID;
  }


  public BpmnWorkflowObject workflowTypeID(Integer workflowTypeID)
  {

    this.workflowTypeID = workflowTypeID;
    return this;
  }

  /**
   * @return workflowTypeID
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWorkflowTypeID()
  {
    return workflowTypeID;
  }


  public void setWorkflowTypeID(Integer workflowTypeID)
  {
    this.workflowTypeID = workflowTypeID;
  }


  public BpmnWorkflowObject workflowStatus(Status workflowStatus)
  {

    this.workflowStatus = workflowStatus;
    return this;
  }

  /**
   * Get workflowStatus
   *
   * @return workflowStatus
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Status getWorkflowStatus()
  {
    return workflowStatus;
  }


  public void setWorkflowStatus(Status workflowStatus)
  {
    this.workflowStatus = workflowStatus;
  }


  public BpmnWorkflowObject workflowObjectID(Integer workflowObjectID)
  {

    this.workflowObjectID = workflowObjectID;
    return this;
  }

  /**
   * @return workflowObjectID
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWorkflowObjectID()
  {
    return workflowObjectID;
  }


  public void setWorkflowObjectID(Integer workflowObjectID)
  {
    this.workflowObjectID = workflowObjectID;
  }


  public BpmnWorkflowObject workflowType(WorkflowType workflowType)
  {

    this.workflowType = workflowType;
    return this;
  }

  /**
   * Get workflowType
   *
   * @return workflowType
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowType getWorkflowType()
  {
    return workflowType;
  }


  public void setWorkflowType(WorkflowType workflowType)
  {
    this.workflowType = workflowType;
  }


  public BpmnWorkflowObject type(String type)
  {

    this.type = type;
    return this;
  }

  /**
   * @return type
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType()
  {
    return type;
  }


  public void setType(String type)
  {
    this.type = type;
  }


  public BpmnWorkflowObject processInstanceId(String processInstanceId)
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


  public BpmnWorkflowObject endDate(Integer endDate)
  {

    this.endDate = endDate;
    return this;
  }

  /**
   * @return endDate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEndDate()
  {
    return endDate;
  }


  public void setEndDate(Integer endDate)
  {
    this.endDate = endDate;
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
    BpmnWorkflowObject bpmnWorkflowObject = (BpmnWorkflowObject) o;
    return Objects.equals(this.workflowObjectTypeID, bpmnWorkflowObject.workflowObjectTypeID) &&
            Objects.equals(this.workflowTypeID, bpmnWorkflowObject.workflowTypeID) &&
            Objects.equals(this.workflowStatus, bpmnWorkflowObject.workflowStatus) &&
            Objects.equals(this.workflowObjectID, bpmnWorkflowObject.workflowObjectID) &&
            Objects.equals(this.workflowType, bpmnWorkflowObject.workflowType) &&
            Objects.equals(this.type, bpmnWorkflowObject.type) &&
            Objects.equals(this.processInstanceId, bpmnWorkflowObject.processInstanceId) &&
            Objects.equals(this.endDate, bpmnWorkflowObject.endDate);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(workflowObjectTypeID, workflowTypeID, workflowStatus, workflowObjectID, workflowType, type, processInstanceId, endDate);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BpmnWorkflowObject {\n");
    sb.append("    workflowObjectTypeID: ").append(toIndentedString(workflowObjectTypeID)).append("\n");
    sb.append("    workflowTypeID: ").append(toIndentedString(workflowTypeID)).append("\n");
    sb.append("    workflowStatus: ").append(toIndentedString(workflowStatus)).append("\n");
    sb.append("    workflowObjectID: ").append(toIndentedString(workflowObjectID)).append("\n");
    sb.append("    workflowType: ").append(toIndentedString(workflowType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    processInstanceId: ").append(toIndentedString(processInstanceId)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
