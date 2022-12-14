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
 * Command used to create a MAPL node
 */
@ApiModel(description = "Command used to create a MAPL node")

public class DseMaplCreateNodeRequestBody
{
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_START_DATE = "startDate";
    @SerializedName(SERIALIZED_NAME_START_DATE)
    private Integer startDate;

    public static final String SERIALIZED_NAME_END_DATE = "endDate";
    @SerializedName(SERIALIZED_NAME_END_DATE)
    private Integer endDate;

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public static final String SERIALIZED_NAME_INFO = "info";
    @SerializedName(SERIALIZED_NAME_INFO)
    private String info;

    public static final String SERIALIZED_NAME_RESP_PERSON = "respPerson";
    @SerializedName(SERIALIZED_NAME_RESP_PERSON)
    private MaplResponsiblePersonDto respPerson;

    public static final String SERIALIZED_NAME_CURRENCY_ID = "currencyId";
    @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
    private Integer currencyId;

    public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
    @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
    private String externalId;


    public DseMaplCreateNodeRequestBody name(String name)
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


    public DseMaplCreateNodeRequestBody startDate(Integer startDate)
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


    public DseMaplCreateNodeRequestBody endDate(Integer endDate)
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


    public DseMaplCreateNodeRequestBody type(String type)
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


    public DseMaplCreateNodeRequestBody info(String info)
    {

        this.info = info;
        return this;
    }

    /**
     * @return info
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getInfo()
    {
        return info;
    }


    public void setInfo(String info)
    {
        this.info = info;
    }


    public DseMaplCreateNodeRequestBody respPerson(MaplResponsiblePersonDto respPerson)
    {

        this.respPerson = respPerson;
        return this;
    }

    /**
     * Get respPerson
     *
     * @return respPerson
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public MaplResponsiblePersonDto getRespPerson()
    {
        return respPerson;
    }


    public void setRespPerson(MaplResponsiblePersonDto respPerson)
    {
        this.respPerson = respPerson;
    }


    public DseMaplCreateNodeRequestBody currencyId(Integer currencyId)
    {

        this.currencyId = currencyId;
        return this;
    }

    /**
     * @return currencyId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getCurrencyId()
    {
        return currencyId;
    }


    public void setCurrencyId(Integer currencyId)
    {
        this.currencyId = currencyId;
    }


    public DseMaplCreateNodeRequestBody externalId(String externalId)
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
        DseMaplCreateNodeRequestBody dseMaplCreateNodeRequestBody = (DseMaplCreateNodeRequestBody) o;
        return Objects.equals(this.name, dseMaplCreateNodeRequestBody.name) &&
                Objects.equals(this.startDate, dseMaplCreateNodeRequestBody.startDate) &&
                Objects.equals(this.endDate, dseMaplCreateNodeRequestBody.endDate) &&
                Objects.equals(this.type, dseMaplCreateNodeRequestBody.type) &&
                Objects.equals(this.info, dseMaplCreateNodeRequestBody.info) &&
                Objects.equals(this.respPerson, dseMaplCreateNodeRequestBody.respPerson) &&
                Objects.equals(this.currencyId, dseMaplCreateNodeRequestBody.currencyId) &&
                Objects.equals(this.externalId, dseMaplCreateNodeRequestBody.externalId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, startDate, endDate, type, info, respPerson, currencyId, externalId);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class DseMaplCreateNodeRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    info: ").append(toIndentedString(info)).append("\n");
        sb.append("    respPerson: ").append(toIndentedString(respPerson)).append("\n");
        sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
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

