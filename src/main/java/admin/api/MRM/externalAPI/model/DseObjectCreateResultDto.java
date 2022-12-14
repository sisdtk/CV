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
 * Result of DSE object creation
 */
@ApiModel(description = "Result of DSE object creation")

public class DseObjectCreateResultDto
{
    public static final String SERIALIZED_NAME_INSTANCE_ID = "instanceId";
    @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
    private Integer instanceId;

    public static final String SERIALIZED_NAME_L10N_LOCALE_ID = "l10nLocaleId";
    @SerializedName(SERIALIZED_NAME_L10N_LOCALE_ID)
    private Integer l10nLocaleId;

    public static final String SERIALIZED_NAME_STEP_NUMBER = "stepNumber";
    @SerializedName(SERIALIZED_NAME_STEP_NUMBER)
    private Integer stepNumber;


    public DseObjectCreateResultDto instanceId(Integer instanceId)
    {

        this.instanceId = instanceId;
        return this;
    }

    /**
     * @return instanceId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getInstanceId()
    {
        return instanceId;
    }


    public void setInstanceId(Integer instanceId)
    {
        this.instanceId = instanceId;
    }


    public DseObjectCreateResultDto l10nLocaleId(Integer l10nLocaleId)
    {

        this.l10nLocaleId = l10nLocaleId;
        return this;
    }

    /**
     * @return l10nLocaleId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getL10nLocaleId()
    {
        return l10nLocaleId;
    }


    public void setL10nLocaleId(Integer l10nLocaleId)
    {
        this.l10nLocaleId = l10nLocaleId;
    }


    public DseObjectCreateResultDto stepNumber(Integer stepNumber)
    {

        this.stepNumber = stepNumber;
        return this;
    }

    /**
     * @return stepNumber
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getStepNumber()
    {
        return stepNumber;
    }


    public void setStepNumber(Integer stepNumber)
    {
        this.stepNumber = stepNumber;
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
        DseObjectCreateResultDto dseObjectCreateResultDto = (DseObjectCreateResultDto) o;
        return Objects.equals(this.instanceId, dseObjectCreateResultDto.instanceId) &&
                Objects.equals(this.l10nLocaleId, dseObjectCreateResultDto.l10nLocaleId) &&
                Objects.equals(this.stepNumber, dseObjectCreateResultDto.stepNumber);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(instanceId, l10nLocaleId, stepNumber);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class DseObjectCreateResultDto {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    l10nLocaleId: ").append(toIndentedString(l10nLocaleId)).append("\n");
        sb.append("    stepNumber: ").append(toIndentedString(stepNumber)).append("\n");
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

