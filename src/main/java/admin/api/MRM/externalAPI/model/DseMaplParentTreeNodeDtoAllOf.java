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
 * DseMaplParentTreeNodeDtoAllOf
 */

public class DseMaplParentTreeNodeDtoAllOf
{
    public static final String SERIALIZED_NAME_CHILDREN = "children";
    @SerializedName(SERIALIZED_NAME_CHILDREN)
    private List<DseMaplParentTargetDto> children = null;


    public DseMaplParentTreeNodeDtoAllOf children(List<DseMaplParentTargetDto> children)
    {

        this.children = children;
        return this;
    }

    public DseMaplParentTreeNodeDtoAllOf addChildrenItem(DseMaplParentTargetDto childrenItem)
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
        DseMaplParentTreeNodeDtoAllOf dseMaplParentTreeNodeDtoAllOf = (DseMaplParentTreeNodeDtoAllOf) o;
        return Objects.equals(this.children, dseMaplParentTreeNodeDtoAllOf.children);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(children);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class DseMaplParentTreeNodeDtoAllOf {\n");
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

