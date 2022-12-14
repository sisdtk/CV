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

/**
 * DseObjectCreateResultDtoAllOf
 */

public class DseObjectCreateResultDtoAllOf
{
    public static final String SERIALIZED_NAME_STEP_NUMBER = "stepNumber";
    @SerializedName(SERIALIZED_NAME_STEP_NUMBER)
    private Integer stepNumber;


    public DseObjectCreateResultDtoAllOf stepNumber(Integer stepNumber)
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
        DseObjectCreateResultDtoAllOf dseObjectCreateResultDtoAllOf = (DseObjectCreateResultDtoAllOf) o;
        return Objects.equals(this.stepNumber, dseObjectCreateResultDtoAllOf.stepNumber);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(stepNumber);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class DseObjectCreateResultDtoAllOf {\n");
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

