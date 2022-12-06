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

public class OldWorkflowMetaInstance
{
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;

    public static final String SERIALIZED_NAME_WORKFLOW_METATYPE = "workflowMetatype";
    @SerializedName(SERIALIZED_NAME_WORKFLOW_METATYPE)
    private WorkflowMetatype workflowMetatype;

    public static final String SERIALIZED_NAME_DSE_OBJECT_TYPE_ID = "dseObjectTypeId";
    @SerializedName(SERIALIZED_NAME_DSE_OBJECT_TYPE_ID)
    private Integer dseObjectTypeId;

    public static final String SERIALIZED_NAME_TASK_TEMPLATE_ID = "taskTemplateId";
    @SerializedName(SERIALIZED_NAME_TASK_TEMPLATE_ID)
    private Integer taskTemplateId;


    public OldWorkflowMetaInstance id(Integer id)
    {

        this.id = id;
        return this;
    }

    /**
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getId()
    {
        return id;
    }


    public void setId(Integer id)
    {
        this.id = id;
    }


    public OldWorkflowMetaInstance workflowMetatype(WorkflowMetatype workflowMetatype)
    {

        this.workflowMetatype = workflowMetatype;
        return this;
    }

    /**
     * Get workflowMetatype
     *
     * @return workflowMetatype
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public WorkflowMetatype getWorkflowMetatype()
    {
        return workflowMetatype;
    }


    public void setWorkflowMetatype(WorkflowMetatype workflowMetatype)
    {
        this.workflowMetatype = workflowMetatype;
    }


    public OldWorkflowMetaInstance dseObjectTypeId(Integer dseObjectTypeId)
    {

        this.dseObjectTypeId = dseObjectTypeId;
        return this;
    }

    /**
     * @return dseObjectTypeId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getDseObjectTypeId()
    {
        return dseObjectTypeId;
    }


    public void setDseObjectTypeId(Integer dseObjectTypeId)
    {
        this.dseObjectTypeId = dseObjectTypeId;
    }


    public OldWorkflowMetaInstance taskTemplateId(Integer taskTemplateId)
    {

        this.taskTemplateId = taskTemplateId;
        return this;
    }

    /**
     * @return taskTemplateId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getTaskTemplateId()
    {
        return taskTemplateId;
    }


    public void setTaskTemplateId(Integer taskTemplateId)
    {
        this.taskTemplateId = taskTemplateId;
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
        OldWorkflowMetaInstance oldWorkflowMetaInstance = (OldWorkflowMetaInstance) o;
        return Objects.equals(this.id, oldWorkflowMetaInstance.id) &&
                Objects.equals(this.workflowMetatype, oldWorkflowMetaInstance.workflowMetatype) &&
                Objects.equals(this.dseObjectTypeId, oldWorkflowMetaInstance.dseObjectTypeId) &&
                Objects.equals(this.taskTemplateId, oldWorkflowMetaInstance.taskTemplateId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, workflowMetatype, dseObjectTypeId, taskTemplateId);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class OldWorkflowMetaInstance {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    workflowMetatype: ").append(toIndentedString(workflowMetatype)).append("\n");
        sb.append("    dseObjectTypeId: ").append(toIndentedString(dseObjectTypeId)).append("\n");
        sb.append("    taskTemplateId: ").append(toIndentedString(taskTemplateId)).append("\n");
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
