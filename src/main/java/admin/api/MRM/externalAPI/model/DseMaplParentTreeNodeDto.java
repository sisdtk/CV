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

public class DseMaplParentTreeNodeDto
{
    public static final String SERIALIZED_NAME_LABEL = "label";
    @SerializedName(SERIALIZED_NAME_LABEL)
    private String label;

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public static final String SERIALIZED_NAME_NODE_ID = "nodeId";
    @SerializedName(SERIALIZED_NAME_NODE_ID)
    private Integer nodeId;

    public static final String SERIALIZED_NAME_CHILDREN = "children";
    @SerializedName(SERIALIZED_NAME_CHILDREN)
    private List<DseMaplParentTargetDto> children = null;


    public DseMaplParentTreeNodeDto label(String label)
    {

        this.label = label;
        return this;
    }

    /**
     * @return label
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getLabel()
    {
        return label;
    }


    public void setLabel(String label)
    {
        this.label = label;
    }


    public DseMaplParentTreeNodeDto type(String type)
    {

        this.type = type;
        return this;
    }

    /**
     * @return type
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getType()
    {
        return type;
    }


    public void setType(String type)
    {
        this.type = type;
    }


    public DseMaplParentTreeNodeDto nodeId(Integer nodeId)
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


    public DseMaplParentTreeNodeDto children(List<DseMaplParentTargetDto> children)
    {

        this.children = children;
        return this;
    }

    public DseMaplParentTreeNodeDto addChildrenItem(DseMaplParentTargetDto childrenItem)
    {
        if (this.children == null)
        {
            this.children = new ArrayList<DseMaplParentTargetDto>();
        }
        this.children.add(childrenItem);
        return this;
    }

    /**
     * @return children
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<DseMaplParentTargetDto> getChildren()
    {
        return children;
    }


    public void setChildren(List<DseMaplParentTargetDto> children)
    {
        this.children = children;
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
        DseMaplParentTreeNodeDto dseMaplParentTreeNodeDto = (DseMaplParentTreeNodeDto) o;
        return Objects.equals(this.label, dseMaplParentTreeNodeDto.label) &&
                Objects.equals(this.type, dseMaplParentTreeNodeDto.type) &&
                Objects.equals(this.nodeId, dseMaplParentTreeNodeDto.nodeId) &&
                Objects.equals(this.children, dseMaplParentTreeNodeDto.children);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(label, type, nodeId, children);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class DseMaplParentTreeNodeDto {\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    children: ").append(toIndentedString(children)).append("\n");
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
