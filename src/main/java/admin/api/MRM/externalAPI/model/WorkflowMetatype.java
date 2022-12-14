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
 * Defines representation of metatype of MMS workflow.
 */
@ApiModel(description = "Defines representation of metatype of MMS workflow.")

public class WorkflowMetatype
{
    public static final String SERIALIZED_NAME_WORKFLOW_TYPE_ID = "workflowTypeId";
    @SerializedName(SERIALIZED_NAME_WORKFLOW_TYPE_ID)
    private Integer workflowTypeId;

    public static final String SERIALIZED_NAME_WORKFLOW_OBJECT_TYPE_ID = "workflowObjectTypeId";
    @SerializedName(SERIALIZED_NAME_WORKFLOW_OBJECT_TYPE_ID)
    private Integer workflowObjectTypeId;

    public static final String SERIALIZED_NAME_WORKFLOW_METATYPE_ID = "workflowMetatypeId";
    @SerializedName(SERIALIZED_NAME_WORKFLOW_METATYPE_ID)
    private Integer workflowMetatypeId;

    public static final String SERIALIZED_NAME_WORKFLOW_TYPE = "workflowType";
    @SerializedName(SERIALIZED_NAME_WORKFLOW_TYPE)
    private WorkflowType workflowType;


    public WorkflowMetatype workflowTypeId(Integer workflowTypeId)
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


    public WorkflowMetatype workflowObjectTypeId(Integer workflowObjectTypeId)
    {

        this.workflowObjectTypeId = workflowObjectTypeId;
        return this;
    }

    /**
     * @return workflowObjectTypeId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getWorkflowObjectTypeId()
    {
        return workflowObjectTypeId;
    }


    public void setWorkflowObjectTypeId(Integer workflowObjectTypeId)
    {
        this.workflowObjectTypeId = workflowObjectTypeId;
    }


    public WorkflowMetatype workflowMetatypeId(Integer workflowMetatypeId)
    {

        this.workflowMetatypeId = workflowMetatypeId;
        return this;
    }

    /**
     * @return workflowMetatypeId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getWorkflowMetatypeId()
    {
        return workflowMetatypeId;
    }


    public void setWorkflowMetatypeId(Integer workflowMetatypeId)
    {
        this.workflowMetatypeId = workflowMetatypeId;
    }


    public WorkflowMetatype workflowType(WorkflowType workflowType)
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
        WorkflowMetatype workflowMetatype = (WorkflowMetatype) o;
        return Objects.equals(this.workflowTypeId, workflowMetatype.workflowTypeId) &&
                Objects.equals(this.workflowObjectTypeId, workflowMetatype.workflowObjectTypeId) &&
                Objects.equals(this.workflowMetatypeId, workflowMetatype.workflowMetatypeId) &&
                Objects.equals(this.workflowType, workflowMetatype.workflowType);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(workflowTypeId, workflowObjectTypeId, workflowMetatypeId, workflowType);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowMetatype {\n");
        sb.append("    workflowTypeId: ").append(toIndentedString(workflowTypeId)).append("\n");
        sb.append("    workflowObjectTypeId: ").append(toIndentedString(workflowObjectTypeId)).append("\n");
        sb.append("    workflowMetatypeId: ").append(toIndentedString(workflowMetatypeId)).append("\n");
        sb.append("    workflowType: ").append(toIndentedString(workflowType)).append("\n");
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

