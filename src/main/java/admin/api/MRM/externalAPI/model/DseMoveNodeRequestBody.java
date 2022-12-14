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

public class DseMoveNodeRequestBody
{
    public static final String SERIALIZED_NAME_PARENT = "parent";
    @SerializedName(SERIALIZED_NAME_PARENT)
    private DseMaplParentVariable parent;

    public static final String SERIALIZED_NAME_NODE_ID = "nodeId";
    @SerializedName(SERIALIZED_NAME_NODE_ID)
    private Integer nodeId;


    public DseMoveNodeRequestBody parent(DseMaplParentVariable parent)
    {

        this.parent = parent;
        return this;
    }

    /**
     * Get parent
     *
     * @return parent
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public DseMaplParentVariable getParent()
    {
        return parent;
    }


    public void setParent(DseMaplParentVariable parent)
    {
        this.parent = parent;
    }


    public DseMoveNodeRequestBody nodeId(Integer nodeId)
    {

        this.nodeId = nodeId;
        return this;
    }

    /**
     * @return nodeId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getNodeId()
    {
        return nodeId;
    }


    public void setNodeId(Integer nodeId)
    {
        this.nodeId = nodeId;
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
        DseMoveNodeRequestBody dseMoveNodeRequestBody = (DseMoveNodeRequestBody) o;
        return Objects.equals(this.parent, dseMoveNodeRequestBody.parent) &&
                Objects.equals(this.nodeId, dseMoveNodeRequestBody.nodeId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(parent, nodeId);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class DseMoveNodeRequestBody {\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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

