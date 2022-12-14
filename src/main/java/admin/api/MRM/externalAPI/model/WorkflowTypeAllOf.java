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
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * WorkflowTypeAllOf
 */

public class WorkflowTypeAllOf
{
    public static final String SERIALIZED_NAME_WORKFLOW_TYPE_ID = "workflowTypeId";
    @SerializedName(SERIALIZED_NAME_WORKFLOW_TYPE_ID)
    private Integer workflowTypeId;

    public static final String SERIALIZED_NAME_WORKFLOW_STEP_TEMPLATES = "workflowStepTemplates";
    @SerializedName(SERIALIZED_NAME_WORKFLOW_STEP_TEMPLATES)
    private List<WorkflowStepTemplate> workflowStepTemplates = null;

    public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
    @SerializedName(SERIALIZED_NAME_CREATION_DATE)
    private Integer creationDate;

    public static final String SERIALIZED_NAME_LAST_UPDATE = "lastUpdate";
    @SerializedName(SERIALIZED_NAME_LAST_UPDATE)
    private Integer lastUpdate;

    public static final String SERIALIZED_NAME_IS_DELETED = "isDeleted";
    @SerializedName(SERIALIZED_NAME_IS_DELETED)
    private Boolean isDeleted;

    public static final String SERIALIZED_NAME_PICKABLE_CONFIGURATION = "pickableConfiguration";
    @SerializedName(SERIALIZED_NAME_PICKABLE_CONFIGURATION)
    private Integer pickableConfiguration;


    public WorkflowTypeAllOf workflowTypeId(Integer workflowTypeId)
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


    public WorkflowTypeAllOf workflowStepTemplates(List<WorkflowStepTemplate> workflowStepTemplates)
    {

        this.workflowStepTemplates = workflowStepTemplates;
        return this;
    }

    public WorkflowTypeAllOf addWorkflowStepTemplatesItem(WorkflowStepTemplate workflowStepTemplatesItem)
    {
        if (this.workflowStepTemplates == null)
        {
            this.workflowStepTemplates = new ArrayList<WorkflowStepTemplate>();
        }
        this.workflowStepTemplates.add(workflowStepTemplatesItem);
        return this;
    }

    /**
     * @return workflowStepTemplates
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<WorkflowStepTemplate> getWorkflowStepTemplates()
    {
        return workflowStepTemplates;
    }


    public void setWorkflowStepTemplates(List<WorkflowStepTemplate> workflowStepTemplates)
    {
        this.workflowStepTemplates = workflowStepTemplates;
    }


    public WorkflowTypeAllOf creationDate(Integer creationDate)
    {

        this.creationDate = creationDate;
        return this;
    }

    /**
     * @return creationDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getCreationDate()
    {
        return creationDate;
    }


    public void setCreationDate(Integer creationDate)
    {
        this.creationDate = creationDate;
    }


    public WorkflowTypeAllOf lastUpdate(Integer lastUpdate)
    {

        this.lastUpdate = lastUpdate;
        return this;
    }

    /**
     * @return lastUpdate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getLastUpdate()
    {
        return lastUpdate;
    }


    public void setLastUpdate(Integer lastUpdate)
    {
        this.lastUpdate = lastUpdate;
    }


    public WorkflowTypeAllOf isDeleted(Boolean isDeleted)
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


    public WorkflowTypeAllOf pickableConfiguration(Integer pickableConfiguration)
    {

        this.pickableConfiguration = pickableConfiguration;
        return this;
    }

    /**
     * @return pickableConfiguration
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getPickableConfiguration()
    {
        return pickableConfiguration;
    }


    public void setPickableConfiguration(Integer pickableConfiguration)
    {
        this.pickableConfiguration = pickableConfiguration;
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
        WorkflowTypeAllOf workflowTypeAllOf = (WorkflowTypeAllOf) o;
        return Objects.equals(this.workflowTypeId, workflowTypeAllOf.workflowTypeId) &&
                Objects.equals(this.workflowStepTemplates, workflowTypeAllOf.workflowStepTemplates) &&
                Objects.equals(this.creationDate, workflowTypeAllOf.creationDate) &&
                Objects.equals(this.lastUpdate, workflowTypeAllOf.lastUpdate) &&
                Objects.equals(this.isDeleted, workflowTypeAllOf.isDeleted) &&
                Objects.equals(this.pickableConfiguration, workflowTypeAllOf.pickableConfiguration);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(workflowTypeId, workflowStepTemplates, creationDate, lastUpdate, isDeleted, pickableConfiguration);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowTypeAllOf {\n");
        sb.append("    workflowTypeId: ").append(toIndentedString(workflowTypeId)).append("\n");
        sb.append("    workflowStepTemplates: ").append(toIndentedString(workflowStepTemplates)).append("\n");
        sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
        sb.append("    lastUpdate: ").append(toIndentedString(lastUpdate)).append("\n");
        sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
        sb.append("    pickableConfiguration: ").append(toIndentedString(pickableConfiguration)).append("\n");
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

