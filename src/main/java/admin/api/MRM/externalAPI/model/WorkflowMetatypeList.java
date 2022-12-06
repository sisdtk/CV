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

import java.util.ArrayList;
import java.util.List;

/**
 * Defines representation of metatypes of MMS workflow type.
 */
@ApiModel(description = "Defines representation of metatypes of MMS workflow type.")

public class WorkflowMetatypeList
{
    public static final String SERIALIZED_NAME_WORKFLOW_TYPE = "workflowType";
    @SerializedName(SERIALIZED_NAME_WORKFLOW_TYPE)
    private WorkflowType workflowType;

    public static final String SERIALIZED_NAME_WORKFLOW_METATYPES = "workflowMetatypes";
    @SerializedName(SERIALIZED_NAME_WORKFLOW_METATYPES)
    private List<WorkflowMetatypeParameters> workflowMetatypes = null;


    public WorkflowMetatypeList workflowType(WorkflowType workflowType)
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


    public WorkflowMetatypeList workflowMetatypes(List<WorkflowMetatypeParameters> workflowMetatypes)
    {

        this.workflowMetatypes = workflowMetatypes;
        return this;
    }

    public WorkflowMetatypeList addWorkflowMetatypesItem(WorkflowMetatypeParameters workflowMetatypesItem)
    {
        if (this.workflowMetatypes == null)
        {
            this.workflowMetatypes = new ArrayList<WorkflowMetatypeParameters>();
        }
        this.workflowMetatypes.add(workflowMetatypesItem);
        return this;
    }

    /**
     * @return workflowMetatypes
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<WorkflowMetatypeParameters> getWorkflowMetatypes()
    {
        return workflowMetatypes;
    }


    public void setWorkflowMetatypes(List<WorkflowMetatypeParameters> workflowMetatypes)
    {
        this.workflowMetatypes = workflowMetatypes;
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
        WorkflowMetatypeList workflowMetatypeList = (WorkflowMetatypeList) o;
        return Objects.equals(this.workflowType, workflowMetatypeList.workflowType) &&
                Objects.equals(this.workflowMetatypes, workflowMetatypeList.workflowMetatypes);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(workflowType, workflowMetatypes);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowMetatypeList {\n");
        sb.append("    workflowType: ").append(toIndentedString(workflowType)).append("\n");
        sb.append("    workflowMetatypes: ").append(toIndentedString(workflowMetatypes)).append("\n");
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

