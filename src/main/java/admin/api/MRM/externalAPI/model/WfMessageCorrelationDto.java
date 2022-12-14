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

import java.util.HashMap;
import java.util.Map;

/**
 *
 */
@ApiModel(description = "")

public class WfMessageCorrelationDto
{
    public static final String SERIALIZED_NAME_ALL = "all";
    @SerializedName(SERIALIZED_NAME_ALL)
    private Boolean all;

    public static final String SERIALIZED_NAME_MESSAGE_NAME = "messageName";
    @SerializedName(SERIALIZED_NAME_MESSAGE_NAME)
    private String messageName;

    public static final String SERIALIZED_NAME_CORRELATION_KEYS = "correlationKeys";
    @SerializedName(SERIALIZED_NAME_CORRELATION_KEYS)
    private Map<String, Object> correlationKeys = null;

    public static final String SERIALIZED_NAME_PROCESS_VARIABLES = "processVariables";
    @SerializedName(SERIALIZED_NAME_PROCESS_VARIABLES)
    private Map<String, Object> processVariables = null;


    public WfMessageCorrelationDto all(Boolean all)
    {

        this.all = all;
        return this;
    }

    /**
     * @return all
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Boolean getAll()
    {
        return all;
    }


    public void setAll(Boolean all)
    {
        this.all = all;
    }


    public WfMessageCorrelationDto messageName(String messageName)
    {

        this.messageName = messageName;
        return this;
    }

    /**
     * @return messageName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getMessageName()
    {
        return messageName;
    }


    public void setMessageName(String messageName)
    {
        this.messageName = messageName;
    }


    public WfMessageCorrelationDto correlationKeys(Map<String, Object> correlationKeys)
    {

        this.correlationKeys = correlationKeys;
        return this;
    }

    public WfMessageCorrelationDto putCorrelationKeysItem(String key, Object correlationKeysItem)
    {
        if (this.correlationKeys == null)
        {
            this.correlationKeys = new HashMap<String, Object>();
        }
        this.correlationKeys.put(key, correlationKeysItem);
        return this;
    }

    /**
     * @return correlationKeys
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Map<String, Object> getCorrelationKeys()
    {
        return correlationKeys;
    }


    public void setCorrelationKeys(Map<String, Object> correlationKeys)
    {
        this.correlationKeys = correlationKeys;
    }


    public WfMessageCorrelationDto processVariables(Map<String, Object> processVariables)
    {

        this.processVariables = processVariables;
        return this;
    }

    public WfMessageCorrelationDto putProcessVariablesItem(String key, Object processVariablesItem)
    {
        if (this.processVariables == null)
        {
            this.processVariables = new HashMap<String, Object>();
        }
        this.processVariables.put(key, processVariablesItem);
        return this;
    }

    /**
     * @return processVariables
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Map<String, Object> getProcessVariables()
    {
        return processVariables;
    }


    public void setProcessVariables(Map<String, Object> processVariables)
    {
        this.processVariables = processVariables;
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
        WfMessageCorrelationDto wfMessageCorrelationDto = (WfMessageCorrelationDto) o;
        return Objects.equals(this.all, wfMessageCorrelationDto.all) &&
                Objects.equals(this.messageName, wfMessageCorrelationDto.messageName) &&
                Objects.equals(this.correlationKeys, wfMessageCorrelationDto.correlationKeys) &&
                Objects.equals(this.processVariables, wfMessageCorrelationDto.processVariables);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(all, messageName, correlationKeys, processVariables);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class WfMessageCorrelationDto {\n");
        sb.append("    all: ").append(toIndentedString(all)).append("\n");
        sb.append("    messageName: ").append(toIndentedString(messageName)).append("\n");
        sb.append("    correlationKeys: ").append(toIndentedString(correlationKeys)).append("\n");
        sb.append("    processVariables: ").append(toIndentedString(processVariables)).append("\n");
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

