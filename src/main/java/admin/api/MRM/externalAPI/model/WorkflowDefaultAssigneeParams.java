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

public class WorkflowDefaultAssigneeParams
{
    public static final String SERIALIZED_NAME_DEFAULT_APPROVING_USER_I_D = "defaultApprovingUserID";
    @SerializedName(SERIALIZED_NAME_DEFAULT_APPROVING_USER_I_D)
    private Integer defaultApprovingUserID;

    public static final String SERIALIZED_NAME_WORKFLOW_OBJECT_I_D = "workflowObjectID";
    @SerializedName(SERIALIZED_NAME_WORKFLOW_OBJECT_I_D)
    private Integer workflowObjectID;

    public static final String SERIALIZED_NAME_WORKFLOW_STEP_TEMPLATE_I_D = "workflowStepTemplateID";
    @SerializedName(SERIALIZED_NAME_WORKFLOW_STEP_TEMPLATE_I_D)
    private Integer workflowStepTemplateID;


    public WorkflowDefaultAssigneeParams defaultApprovingUserID(Integer defaultApprovingUserID)
    {

        this.defaultApprovingUserID = defaultApprovingUserID;
        return this;
    }

    /**
     * @return defaultApprovingUserID
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getDefaultApprovingUserID()
    {
        return defaultApprovingUserID;
    }


    public void setDefaultApprovingUserID(Integer defaultApprovingUserID)
    {
        this.defaultApprovingUserID = defaultApprovingUserID;
    }


    public WorkflowDefaultAssigneeParams workflowObjectID(Integer workflowObjectID)
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


    public WorkflowDefaultAssigneeParams workflowStepTemplateID(Integer workflowStepTemplateID)
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
        WorkflowDefaultAssigneeParams workflowDefaultAssigneeParams = (WorkflowDefaultAssigneeParams) o;
        return Objects.equals(this.defaultApprovingUserID, workflowDefaultAssigneeParams.defaultApprovingUserID) &&
                Objects.equals(this.workflowObjectID, workflowDefaultAssigneeParams.workflowObjectID) &&
                Objects.equals(this.workflowStepTemplateID, workflowDefaultAssigneeParams.workflowStepTemplateID);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(defaultApprovingUserID, workflowObjectID, workflowStepTemplateID);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowDefaultAssigneeParams {\n");
        sb.append("    defaultApprovingUserID: ").append(toIndentedString(defaultApprovingUserID)).append("\n");
        sb.append("    workflowObjectID: ").append(toIndentedString(workflowObjectID)).append("\n");
        sb.append("    workflowStepTemplateID: ").append(toIndentedString(workflowStepTemplateID)).append("\n");
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

