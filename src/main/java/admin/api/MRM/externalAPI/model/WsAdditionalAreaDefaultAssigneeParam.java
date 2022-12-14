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

public class WsAdditionalAreaDefaultAssigneeParam
{
    public static final String SERIALIZED_NAME_USER_ID = "userId";
    @SerializedName(SERIALIZED_NAME_USER_ID)
    private Integer userId;

    public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
    @SerializedName(SERIALIZED_NAME_GROUP_ID)
    private Integer groupId;


    public WsAdditionalAreaDefaultAssigneeParam userId(Integer userId)
    {

        this.userId = userId;
        return this;
    }

    /**
     * @return userId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getUserId()
    {
        return userId;
    }


    public void setUserId(Integer userId)
    {
        this.userId = userId;
    }


    public WsAdditionalAreaDefaultAssigneeParam groupId(Integer groupId)
    {

        this.groupId = groupId;
        return this;
    }

    /**
     * @return groupId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getGroupId()
    {
        return groupId;
    }


    public void setGroupId(Integer groupId)
    {
        this.groupId = groupId;
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
        WsAdditionalAreaDefaultAssigneeParam wsAdditionalAreaDefaultAssigneeParam = (WsAdditionalAreaDefaultAssigneeParam) o;
        return Objects.equals(this.userId, wsAdditionalAreaDefaultAssigneeParam.userId) &&
                Objects.equals(this.groupId, wsAdditionalAreaDefaultAssigneeParam.groupId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(userId, groupId);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class WsAdditionalAreaDefaultAssigneeParam {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

