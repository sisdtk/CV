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

public class BpmnWorkflowStepTemplate
{
  public static final String SERIALIZED_NAME_WORKFLOW_STEP_TEMPLATE_I_D = "workflowStepTemplateID";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_STEP_TEMPLATE_I_D)
  private Integer workflowStepTemplateID;

  public static final String SERIALIZED_NAME_WORKFLOW_TYPE_I_D = "workflowTypeID";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_TYPE_I_D)
  private Integer workflowTypeID;

  public static final String SERIALIZED_NAME_AREA_I_D = "areaID";
  @SerializedName(SERIALIZED_NAME_AREA_I_D)
  private Integer areaID;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_STEP_NUMBER = "stepNumber";
  @SerializedName(SERIALIZED_NAME_STEP_NUMBER)
  private Integer stepNumber;

  public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
  @SerializedName(SERIALIZED_NAME_IS_DELETED)
  private Boolean isDeleted;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Integer duration;

  public static final String SERIALIZED_NAME_PICKABLE_CONFIGURATION = "pickableConfiguration";
  @SerializedName(SERIALIZED_NAME_PICKABLE_CONFIGURATION)
  private PickableJobConfigurationEnum pickableConfiguration;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_TASK_DEF_KEY = "taskDefKey";
  @SerializedName(SERIALIZED_NAME_TASK_DEF_KEY)
  private String taskDefKey;

  public static final String SERIALIZED_NAME_ASYNC_AFTER = "asyncAfter";
  @SerializedName(SERIALIZED_NAME_ASYNC_AFTER)
  private Boolean asyncAfter;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_CANDIDATE_USER = "candidateUser";
  @SerializedName(SERIALIZED_NAME_CANDIDATE_USER)
  private String candidateUser;


  public BpmnWorkflowStepTemplate workflowStepTemplateID(Integer workflowStepTemplateID)
  {

    this.workflowStepTemplateID = workflowStepTemplateID;
    return this;
  }

  /**
   * @return workflowStepTemplateID
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getWorkflowStepTemplateID()
  {
    return workflowStepTemplateID;
  }


  public void setWorkflowStepTemplateID(Integer workflowStepTemplateID)
  {
    this.workflowStepTemplateID = workflowStepTemplateID;
  }


  public BpmnWorkflowStepTemplate workflowTypeID(Integer workflowTypeID)
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


  public BpmnWorkflowStepTemplate areaID(Integer areaID)
  {

    this.areaID = areaID;
    return this;
  }

  /**
   * @return areaID
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAreaID()
  {
    return areaID;
  }


  public void setAreaID(Integer areaID)
  {
    this.areaID = areaID;
  }


  public BpmnWorkflowStepTemplate name(String name)
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


  public BpmnWorkflowStepTemplate stepNumber(Integer stepNumber)
  {

    this.stepNumber = stepNumber;
    return this;
  }

  /**
   * @return stepNumber
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStepNumber()
  {
    return stepNumber;
  }


  public void setStepNumber(Integer stepNumber)
  {
    this.stepNumber = stepNumber;
  }


  public BpmnWorkflowStepTemplate isDeleted(Boolean isDeleted)
  {

    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * @return isDeleted
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getIsDeleted()
  {
    return isDeleted;
  }


  public void setIsDeleted(Boolean isDeleted)
  {
    this.isDeleted = isDeleted;
  }


  public BpmnWorkflowStepTemplate duration(Integer duration)
  {

    this.duration = duration;
    return this;
  }

  /**
   * @return duration
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDuration()
  {
    return duration;
  }


  public void setDuration(Integer duration)
  {
    this.duration = duration;
  }


  public BpmnWorkflowStepTemplate pickableConfiguration(PickableJobConfigurationEnum pickableConfiguration)
  {

    this.pickableConfiguration = pickableConfiguration;
    return this;
  }

  /**
   * Get pickableConfiguration
   *
   * @return pickableConfiguration
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PickableJobConfigurationEnum getPickableConfiguration()
  {
    return pickableConfiguration;
  }


  public void setPickableConfiguration(PickableJobConfigurationEnum pickableConfiguration)
  {
    this.pickableConfiguration = pickableConfiguration;
  }


  public BpmnWorkflowStepTemplate type(String type)
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


  public BpmnWorkflowStepTemplate taskDefKey(String taskDefKey)
  {

    this.taskDefKey = taskDefKey;
    return this;
  }

  /**
   * @return taskDefKey
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTaskDefKey()
  {
    return taskDefKey;
  }


  public void setTaskDefKey(String taskDefKey)
  {
    this.taskDefKey = taskDefKey;
  }


  public BpmnWorkflowStepTemplate asyncAfter(Boolean asyncAfter)
  {

    this.asyncAfter = asyncAfter;
    return this;
  }

  /**
   * @return asyncAfter
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getAsyncAfter()
  {
    return asyncAfter;
  }


  public void setAsyncAfter(Boolean asyncAfter)
  {
    this.asyncAfter = asyncAfter;
  }


  public BpmnWorkflowStepTemplate description(String description)
  {

    this.description = description;
    return this;
  }

  /**
   * @return description
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription()
  {
    return description;
  }


  public void setDescription(String description)
  {
    this.description = description;
  }


  public BpmnWorkflowStepTemplate candidateUser(String candidateUser)
  {

    this.candidateUser = candidateUser;
    return this;
  }

  /**
   * @return candidateUser
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCandidateUser()
  {
    return candidateUser;
  }


  public void setCandidateUser(String candidateUser)
  {
    this.candidateUser = candidateUser;
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
    BpmnWorkflowStepTemplate bpmnWorkflowStepTemplate = (BpmnWorkflowStepTemplate) o;
    return Objects.equals(this.workflowStepTemplateID, bpmnWorkflowStepTemplate.workflowStepTemplateID) &&
            Objects.equals(this.workflowTypeID, bpmnWorkflowStepTemplate.workflowTypeID) &&
            Objects.equals(this.areaID, bpmnWorkflowStepTemplate.areaID) &&
            Objects.equals(this.name, bpmnWorkflowStepTemplate.name) &&
            Objects.equals(this.stepNumber, bpmnWorkflowStepTemplate.stepNumber) &&
            Objects.equals(this.isDeleted, bpmnWorkflowStepTemplate.isDeleted) &&
            Objects.equals(this.duration, bpmnWorkflowStepTemplate.duration) &&
            Objects.equals(this.pickableConfiguration, bpmnWorkflowStepTemplate.pickableConfiguration) &&
            Objects.equals(this.type, bpmnWorkflowStepTemplate.type) &&
            Objects.equals(this.taskDefKey, bpmnWorkflowStepTemplate.taskDefKey) &&
            Objects.equals(this.asyncAfter, bpmnWorkflowStepTemplate.asyncAfter) &&
            Objects.equals(this.description, bpmnWorkflowStepTemplate.description) &&
            Objects.equals(this.candidateUser, bpmnWorkflowStepTemplate.candidateUser);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(workflowStepTemplateID, workflowTypeID, areaID, name, stepNumber, isDeleted, duration, pickableConfiguration, type, taskDefKey, asyncAfter, description, candidateUser);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BpmnWorkflowStepTemplate {\n");
    sb.append("    workflowStepTemplateID: ").append(toIndentedString(workflowStepTemplateID)).append("\n");
    sb.append("    workflowTypeID: ").append(toIndentedString(workflowTypeID)).append("\n");
    sb.append("    areaID: ").append(toIndentedString(areaID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    stepNumber: ").append(toIndentedString(stepNumber)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    pickableConfiguration: ").append(toIndentedString(pickableConfiguration)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    taskDefKey: ").append(toIndentedString(taskDefKey)).append("\n");
    sb.append("    asyncAfter: ").append(toIndentedString(asyncAfter)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    candidateUser: ").append(toIndentedString(candidateUser)).append("\n");
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
