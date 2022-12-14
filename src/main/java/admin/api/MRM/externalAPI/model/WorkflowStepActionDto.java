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

public class WorkflowStepActionDto
{
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_CONFIGURATION = "configuration";
    @SerializedName(SERIALIZED_NAME_CONFIGURATION)
    private String _configuration;

    public static final String SERIALIZED_NAME_TYPE = "type";
    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;


    public WorkflowStepActionDto id(Integer id)
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


    public WorkflowStepActionDto name(String name)
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


    public WorkflowStepActionDto _configuration(String _configuration)
    {

        this._configuration = _configuration;
        return this;
    }

    /**
     * @return _configuration
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getConfiguration()
    {
        return _configuration;
    }


    public void setConfiguration(String _configuration)
    {
        this._configuration = _configuration;
    }


    public WorkflowStepActionDto type(String type)
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
        WorkflowStepActionDto workflowStepActionDto = (WorkflowStepActionDto) o;
        return Objects.equals(this.id, workflowStepActionDto.id) &&
                Objects.equals(this.name, workflowStepActionDto.name) &&
                Objects.equals(this._configuration, workflowStepActionDto._configuration) &&
                Objects.equals(this.type, workflowStepActionDto.type);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, name, _configuration, type);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowStepActionDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    _configuration: ").append(toIndentedString(_configuration)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

