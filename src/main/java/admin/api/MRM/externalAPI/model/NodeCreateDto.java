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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 */
@ApiModel(description = "")

public class NodeCreateDto
{
    public static final String SERIALIZED_NAME_DIMENSIONS = "dimensions";
    @SerializedName(SERIALIZED_NAME_DIMENSIONS)
    private Map<String, Object> dimensions = null;

    public static final String SERIALIZED_NAME_PERIODS = "periods";
    @SerializedName(SERIALIZED_NAME_PERIODS)
    private List<DsePeriodDto> periods = null;

    public static final String SERIALIZED_NAME_NODE = "node";
    @SerializedName(SERIALIZED_NAME_NODE)
    private DseCreateNodeRequestBody node;


    public NodeCreateDto dimensions(Map<String, Object> dimensions)
    {

        this.dimensions = dimensions;
        return this;
    }

    public NodeCreateDto putDimensionsItem(String key, Object dimensionsItem)
    {
        if (this.dimensions == null)
        {
            this.dimensions = new HashMap<String, Object>();
        }
        this.dimensions.put(key, dimensionsItem);
        return this;
    }

    /**
     * @return dimensions
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Map<String, Object> getDimensions()
    {
        return dimensions;
    }


    public void setDimensions(Map<String, Object> dimensions)
    {
        this.dimensions = dimensions;
    }


    public NodeCreateDto periods(List<DsePeriodDto> periods)
    {

        this.periods = periods;
        return this;
    }

    public NodeCreateDto addPeriodsItem(DsePeriodDto periodsItem)
    {
        if (this.periods == null)
        {
            this.periods = new ArrayList<DsePeriodDto>();
        }
        this.periods.add(periodsItem);
        return this;
    }

    /**
     * @return periods
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<DsePeriodDto> getPeriods()
    {
        return periods;
    }


    public void setPeriods(List<DsePeriodDto> periods)
    {
        this.periods = periods;
    }


    public NodeCreateDto node(DseCreateNodeRequestBody node)
    {

        this.node = node;
        return this;
    }

    /**
     * Get node
     *
     * @return node
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public DseCreateNodeRequestBody getNode()
    {
        return node;
    }


    public void setNode(DseCreateNodeRequestBody node)
    {
        this.node = node;
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
        NodeCreateDto nodeCreateDto = (NodeCreateDto) o;
        return Objects.equals(this.dimensions, nodeCreateDto.dimensions) &&
                Objects.equals(this.periods, nodeCreateDto.periods) &&
                Objects.equals(this.node, nodeCreateDto.node);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(dimensions, periods, node);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeCreateDto {\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    periods: ").append(toIndentedString(periods)).append("\n");
        sb.append("    node: ").append(toIndentedString(node)).append("\n");
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

