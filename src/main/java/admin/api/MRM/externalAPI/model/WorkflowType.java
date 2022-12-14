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
 *
 */
@ApiModel(description = "")

public class WorkflowType
{
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_CREATOR_USER_I_D = "creatorUserID";
    @SerializedName(SERIALIZED_NAME_CREATOR_USER_I_D)
    private Integer creatorUserID;

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


    public WorkflowType name(String name)
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


    public WorkflowType description(String description)
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


    public WorkflowType creatorUserID(Integer creatorUserID)
    {

        this.creatorUserID = creatorUserID;
        return this;
    }

    /**
     * @return creatorUserID
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getCreatorUserID()
    {
        return creatorUserID;
    }


    public void setCreatorUserID(Integer creatorUserID)
    {
        this.creatorUserID = creatorUserID;
    }


    public WorkflowType workflowTypeId(Integer workflowTypeId)
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


    public WorkflowType workflowStepTemplates(List<WorkflowStepTemplate> workflowStepTemplates)
    {

        this.workflowStepTemplates = workflowStepTemplates;
        return this;
    }

    public WorkflowType addWorkflowStepTemplatesItem(WorkflowStepTemplate workflowStepTemplatesItem)
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


    public WorkflowType creationDate(Integer creationDate)
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


    public WorkflowType lastUpdate(Integer lastUpdate)
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


    public WorkflowType isDeleted(Boolean isDeleted)
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


    public WorkflowType pickableConfiguration(Integer pickableConfiguration)
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
        WorkflowType workflowType = (WorkflowType) o;
        return Objects.equals(this.name, workflowType.name) &&
                Objects.equals(this.description, workflowType.description) &&
                Objects.equals(this.creatorUserID, workflowType.creatorUserID) &&
                Objects.equals(this.workflowTypeId, workflowType.workflowTypeId) &&
                Objects.equals(this.workflowStepTemplates, workflowType.workflowStepTemplates) &&
                Objects.equals(this.creationDate, workflowType.creationDate) &&
                Objects.equals(this.lastUpdate, workflowType.lastUpdate) &&
                Objects.equals(this.isDeleted, workflowType.isDeleted) &&
                Objects.equals(this.pickableConfiguration, workflowType.pickableConfiguration);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, description, creatorUserID, workflowTypeId, workflowStepTemplates, creationDate, lastUpdate, isDeleted, pickableConfiguration);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowType {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    creatorUserID: ").append(toIndentedString(creatorUserID)).append("\n");
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

