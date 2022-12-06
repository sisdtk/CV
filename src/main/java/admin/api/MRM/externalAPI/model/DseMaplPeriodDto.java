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
 * MAPL period
 */
@ApiModel(description = "MAPL period")

public class DseMaplPeriodDto
{
    public static final String SERIALIZED_NAME_START_DATE = "startDate";
    @SerializedName(SERIALIZED_NAME_START_DATE)
    private Integer startDate;

    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public static final String SERIALIZED_NAME_PLANNING_TYPE = "planningType";
    @SerializedName(SERIALIZED_NAME_PLANNING_TYPE)
    private String planningType;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_END_DATE = "endDate";
    @SerializedName(SERIALIZED_NAME_END_DATE)
    private Integer endDate;


    public DseMaplPeriodDto startDate(Integer startDate)
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


    public DseMaplPeriodDto id(Integer id)
    {

        this.id = id;
        return this;
    }

    /**
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getId()
    {
        return id;
    }


    public void setId(Integer id)
    {
        this.id = id;
    }


    public DseMaplPeriodDto type(String type)
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


    public DseMaplPeriodDto planningType(String planningType)
    {

        this.planningType = planningType;
        return this;
    }

    /**
     * @return planningType
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getPlanningType()
    {
        return planningType;
    }


    public void setPlanningType(String planningType)
    {
        this.planningType = planningType;
    }


    public DseMaplPeriodDto name(String name)
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


    public DseMaplPeriodDto endDate(Integer endDate)
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
        DseMaplPeriodDto dseMaplPeriodDto = (DseMaplPeriodDto) o;
        return Objects.equals(this.startDate, dseMaplPeriodDto.startDate) &&
                Objects.equals(this.id, dseMaplPeriodDto.id) &&
                Objects.equals(this.type, dseMaplPeriodDto.type) &&
                Objects.equals(this.planningType, dseMaplPeriodDto.planningType) &&
                Objects.equals(this.name, dseMaplPeriodDto.name) &&
                Objects.equals(this.endDate, dseMaplPeriodDto.endDate);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(startDate, id, type, planningType, name, endDate);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class DseMaplPeriodDto {\n");
        sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    planningType: ").append(toIndentedString(planningType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

