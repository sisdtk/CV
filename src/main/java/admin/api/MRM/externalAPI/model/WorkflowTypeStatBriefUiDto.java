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

public class WorkflowTypeStatBriefUiDto
{
    public static final String SERIALIZED_NAME_ACTIVE_JOBS = "activeJobs";
    @SerializedName(SERIALIZED_NAME_ACTIVE_JOBS)
    private Integer activeJobs;

    public static final String SERIALIZED_NAME_WORKFLOW_VERSION = "workflowVersion";
    @SerializedName(SERIALIZED_NAME_WORKFLOW_VERSION)
    private Integer workflowVersion;

    public static final String SERIALIZED_NAME_WORKFLOW_TYPE_NAME = "workflowTypeName";
    @SerializedName(SERIALIZED_NAME_WORKFLOW_TYPE_NAME)
    private String workflowTypeName;

    public static final String SERIALIZED_NAME_WORKFLOW_TYPE_ID = "workflowTypeId";
    @SerializedName(SERIALIZED_NAME_WORKFLOW_TYPE_ID)
    private Integer workflowTypeId;


    public WorkflowTypeStatBriefUiDto activeJobs(Integer activeJobs)
    {

        this.activeJobs = activeJobs;
        return this;
    }

    /**
     * @return activeJobs
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getActiveJobs()
    {
        return activeJobs;
    }


    public void setActiveJobs(Integer activeJobs)
    {
        this.activeJobs = activeJobs;
    }


    public WorkflowTypeStatBriefUiDto workflowVersion(Integer workflowVersion)
    {

        this.workflowVersion = workflowVersion;
        return this;
    }

    /**
     * @return workflowVersion
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getWorkflowVersion()
    {
        return workflowVersion;
    }


    public void setWorkflowVersion(Integer workflowVersion)
    {
        this.workflowVersion = workflowVersion;
    }


    public WorkflowTypeStatBriefUiDto workflowTypeName(String workflowTypeName)
    {

        this.workflowTypeName = workflowTypeName;
        return this;
    }

    /**
     * @return workflowTypeName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getWorkflowTypeName()
    {
        return workflowTypeName;
    }


    public void setWorkflowTypeName(String workflowTypeName)
    {
        this.workflowTypeName = workflowTypeName;
    }


    public WorkflowTypeStatBriefUiDto workflowTypeId(Integer workflowTypeId)
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
        WorkflowTypeStatBriefUiDto workflowTypeStatBriefUiDto = (WorkflowTypeStatBriefUiDto) o;
        return Objects.equals(this.activeJobs, workflowTypeStatBriefUiDto.activeJobs) &&
                Objects.equals(this.workflowVersion, workflowTypeStatBriefUiDto.workflowVersion) &&
                Objects.equals(this.workflowTypeName, workflowTypeStatBriefUiDto.workflowTypeName) &&
                Objects.equals(this.workflowTypeId, workflowTypeStatBriefUiDto.workflowTypeId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(activeJobs, workflowVersion, workflowTypeName, workflowTypeId);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowTypeStatBriefUiDto {\n");
        sb.append("    activeJobs: ").append(toIndentedString(activeJobs)).append("\n");
        sb.append("    workflowVersion: ").append(toIndentedString(workflowVersion)).append("\n");
        sb.append("    workflowTypeName: ").append(toIndentedString(workflowTypeName)).append("\n");
        sb.append("    workflowTypeId: ").append(toIndentedString(workflowTypeId)).append("\n");
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
