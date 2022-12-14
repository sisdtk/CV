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

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 *
 */
@ApiModel(description = "")

public class WorkflowStepEventDto
{
    public static final String SERIALIZED_NAME_APPROVER_ID = "approverId";
    @SerializedName(SERIALIZED_NAME_APPROVER_ID)
    private Integer approverId;

    public static final String SERIALIZED_NAME_WORKFLOW_STEP_TEMPLATE_ID = "workflowStepTemplateId";
    @SerializedName(SERIALIZED_NAME_WORKFLOW_STEP_TEMPLATE_ID)
    private Integer workflowStepTemplateId;

    public static final String SERIALIZED_NAME_WORKFLOW_OBJECT_ID = "workflowObjectId";
    @SerializedName(SERIALIZED_NAME_WORKFLOW_OBJECT_ID)
    private Integer workflowObjectId;

    public static final String SERIALIZED_NAME_WORKFLOW_STEP_NAME = "workflowStepName";
    @SerializedName(SERIALIZED_NAME_WORKFLOW_STEP_NAME)
    private String workflowStepName;

    public static final String SERIALIZED_NAME_PROCESSED = "processed";
    @SerializedName(SERIALIZED_NAME_PROCESSED)
    private Boolean processed;


    public WorkflowStepEventDto approverId(Integer approverId)
    {

        this.approverId = approverId;
        return this;
    }

    /**
     * @return approverId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getApproverId()
    {
        return approverId;
    }


    public void setApproverId(Integer approverId)
    {
        this.approverId = approverId;
    }


    public WorkflowStepEventDto workflowStepTemplateId(Integer workflowStepTemplateId)
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


    public WorkflowStepEventDto workflowObjectId(Integer workflowObjectId)
    {

        this.workflowObjectId = workflowObjectId;
        return this;
    }

    /**
     * @return workflowObjectId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getWorkflowObjectId()
    {
        return workflowObjectId;
    }


    public void setWorkflowObjectId(Integer workflowObjectId)
    {
        this.workflowObjectId = workflowObjectId;
    }


    public WorkflowStepEventDto workflowStepName(String workflowStepName)
    {

        this.workflowStepName = workflowStepName;
        return this;
    }

    /**
     * @return workflowStepName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getWorkflowStepName()
    {
        return workflowStepName;
    }


    public void setWorkflowStepName(String workflowStepName)
    {
        this.workflowStepName = workflowStepName;
    }


    public WorkflowStepEventDto processed(Boolean processed)
    {

        this.processed = processed;
        return this;
    }

    /**
     * @return processed
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Boolean getProcessed()
    {
        return processed;
    }


    public void setProcessed(Boolean processed)
    {
        this.processed = processed;
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
        WorkflowStepEventDto workflowStepEventDto = (WorkflowStepEventDto) o;
        return Objects.equals(this.approverId, workflowStepEventDto.approverId) &&
                Objects.equals(this.workflowStepTemplateId, workflowStepEventDto.workflowStepTemplateId) &&
                Objects.equals(this.workflowObjectId, workflowStepEventDto.workflowObjectId) &&
                Objects.equals(this.workflowStepName, workflowStepEventDto.workflowStepName) &&
                Objects.equals(this.processed, workflowStepEventDto.processed);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(approverId, workflowStepTemplateId, workflowObjectId, workflowStepName, processed);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowStepEventDto {\n");
        sb.append("    approverId: ").append(toIndentedString(approverId)).append("\n");
        sb.append("    workflowStepTemplateId: ").append(toIndentedString(workflowStepTemplateId)).append("\n");
        sb.append("    workflowObjectId: ").append(toIndentedString(workflowObjectId)).append("\n");
        sb.append("    workflowStepName: ").append(toIndentedString(workflowStepName)).append("\n");
        sb.append("    processed: ").append(toIndentedString(processed)).append("\n");
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

