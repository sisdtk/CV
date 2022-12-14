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

public class WorkflowEventContainer
{
    public static final String SERIALIZED_NAME_WORKFLOW_EVENTS = "workflowEvents";
    @SerializedName(SERIALIZED_NAME_WORKFLOW_EVENTS)
    private List<WorkflowEventLightDto> workflowEvents = null;


    public WorkflowEventContainer workflowEvents(List<WorkflowEventLightDto> workflowEvents)
    {

        this.workflowEvents = workflowEvents;
        return this;
    }

    public WorkflowEventContainer addWorkflowEventsItem(WorkflowEventLightDto workflowEventsItem)
    {
        if (this.workflowEvents == null)
        {
            this.workflowEvents = new ArrayList<WorkflowEventLightDto>();
        }
        this.workflowEvents.add(workflowEventsItem);
        return this;
    }

    /**
     * @return workflowEvents
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<WorkflowEventLightDto> getWorkflowEvents()
    {
        return workflowEvents;
    }


    public void setWorkflowEvents(List<WorkflowEventLightDto> workflowEvents)
    {
        this.workflowEvents = workflowEvents;
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
        WorkflowEventContainer workflowEventContainer = (WorkflowEventContainer) o;
        return Objects.equals(this.workflowEvents, workflowEventContainer.workflowEvents);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(workflowEvents);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowEventContainer {\n");
        sb.append("    workflowEvents: ").append(toIndentedString(workflowEvents)).append("\n");
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

