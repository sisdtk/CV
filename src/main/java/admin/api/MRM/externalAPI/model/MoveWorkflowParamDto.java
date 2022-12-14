/*
 * DSE REST API
 * <h2>DSE REST API</h1>
 *
 * The version of the OpenAPI document: 1.0.0-SNAPSHOT
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package admin.api.MRM.externalAPI.model;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonInclude;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonProperty;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonPropertyOrder;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * DTO for DSE parameters while forwarding.
 */
@ApiModel(description = "DTO for DSE parameters while forwarding.")
@JsonPropertyOrder({
        MoveWorkflowParamDto.JSON_PROPERTY_ASSIGNEE_ID,
        MoveWorkflowParamDto.JSON_PROPERTY_COMMENT,
        MoveWorkflowParamDto.JSON_PROPERTY_USER_GROUP_ID
})
@JsonTypeName("MoveWorkflowParamDto")

public class MoveWorkflowParamDto
{
    public static final String JSON_PROPERTY_ASSIGNEE_ID = "assigneeId";
    private Integer assigneeId;

    public static final String JSON_PROPERTY_COMMENT = "comment";
    private String comment;

    public static final String JSON_PROPERTY_USER_GROUP_ID = "userGroupId";
    private Integer userGroupId;


    public MoveWorkflowParamDto assigneeId(Integer assigneeId)
    {

        this.assigneeId = assigneeId;
        return this;
    }

    /**
     * Get assigneeId
     *
     * @return assigneeId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_ASSIGNEE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Integer getAssigneeId()
    {
        return assigneeId;
    }


    @JsonProperty(JSON_PROPERTY_ASSIGNEE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAssigneeId(Integer assigneeId)
    {
        this.assigneeId = assigneeId;
    }


    public MoveWorkflowParamDto comment(String comment)
    {

        this.comment = comment;
        return this;
    }

    /**
     * Get comment
     *
     * @return comment
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_COMMENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public String getComment()
    {
        return comment;
    }


    @JsonProperty(JSON_PROPERTY_COMMENT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setComment(String comment)
    {
        this.comment = comment;
    }


    public MoveWorkflowParamDto userGroupId(Integer userGroupId)
    {

        this.userGroupId = userGroupId;
        return this;
    }

    /**
     * Get userGroupId
     *
     * @return userGroupId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    @JsonProperty(JSON_PROPERTY_USER_GROUP_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

    public Integer getUserGroupId()
    {
        return userGroupId;
    }


    @JsonProperty(JSON_PROPERTY_USER_GROUP_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUserGroupId(Integer userGroupId)
    {
        this.userGroupId = userGroupId;
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
        MoveWorkflowParamDto moveWorkflowParamDto = (MoveWorkflowParamDto) o;
        return Objects.equals(this.assigneeId, moveWorkflowParamDto.assigneeId) &&
                Objects.equals(this.comment, moveWorkflowParamDto.comment) &&
                Objects.equals(this.userGroupId, moveWorkflowParamDto.userGroupId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(assigneeId, comment, userGroupId);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoveWorkflowParamDto {\n");
        sb.append("    assigneeId: ").append(toIndentedString(assigneeId)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    userGroupId: ").append(toIndentedString(userGroupId)).append("\n");
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

