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

public class DseEditNodeRequestBody
{
    public static final String SERIALIZED_NAME_START_DATE = "startDate";
    @SerializedName(SERIALIZED_NAME_START_DATE)
    private Integer startDate;

    public static final String SERIALIZED_NAME_END_DATE = "endDate";
    @SerializedName(SERIALIZED_NAME_END_DATE)
    private Integer endDate;

    public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
    @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
    private String externalId;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_CURRENCY_ID = "currencyId";
    @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
    private String currencyId;

    public static final String SERIALIZED_NAME_NODE_TYPE_ID = "nodeTypeId";
    @SerializedName(SERIALIZED_NAME_NODE_TYPE_ID)
    private Integer nodeTypeId;


    public DseEditNodeRequestBody startDate(Integer startDate)
    {

        this.startDate = startDate;
        return this;
    }

    /**
     * @return startDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getStartDate()
    {
        return startDate;
    }


    public void setStartDate(Integer startDate)
    {
        this.startDate = startDate;
    }


    public DseEditNodeRequestBody endDate(Integer endDate)
    {

        this.endDate = endDate;
        return this;
    }

    /**
     * @return endDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getEndDate()
    {
        return endDate;
    }


    public void setEndDate(Integer endDate)
    {
        this.endDate = endDate;
    }


    public DseEditNodeRequestBody externalId(String externalId)
    {

        this.externalId = externalId;
        return this;
    }

    /**
     * @return externalId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getExternalId()
    {
        return externalId;
    }


    public void setExternalId(String externalId)
    {
        this.externalId = externalId;
    }


    public DseEditNodeRequestBody name(String name)
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


    public DseEditNodeRequestBody currencyId(String currencyId)
    {

        this.currencyId = currencyId;
        return this;
    }

    /**
     * @return currencyId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getCurrencyId()
    {
        return currencyId;
    }


    public void setCurrencyId(String currencyId)
    {
        this.currencyId = currencyId;
    }


    public DseEditNodeRequestBody nodeTypeId(Integer nodeTypeId)
    {

        this.nodeTypeId = nodeTypeId;
        return this;
    }

    /**
     * @return nodeTypeId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getNodeTypeId()
    {
        return nodeTypeId;
    }


    public void setNodeTypeId(Integer nodeTypeId)
    {
        this.nodeTypeId = nodeTypeId;
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
        DseEditNodeRequestBody dseEditNodeRequestBody = (DseEditNodeRequestBody) o;
        return Objects.equals(this.startDate, dseEditNodeRequestBody.startDate) &&
                Objects.equals(this.endDate, dseEditNodeRequestBody.endDate) &&
                Objects.equals(this.externalId, dseEditNodeRequestBody.externalId) &&
                Objects.equals(this.name, dseEditNodeRequestBody.name) &&
                Objects.equals(this.currencyId, dseEditNodeRequestBody.currencyId) &&
                Objects.equals(this.nodeTypeId, dseEditNodeRequestBody.nodeTypeId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(startDate, endDate, externalId, name, currencyId, nodeTypeId);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class DseEditNodeRequestBody {\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
        sb.append("    nodeTypeId: ").append(toIndentedString(nodeTypeId)).append("\n");
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

