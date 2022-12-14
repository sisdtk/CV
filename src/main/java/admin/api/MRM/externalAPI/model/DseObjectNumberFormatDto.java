/*
 * DSE REST INTERNAL API
 * <h2>DSE REST INTERNAL API</h1>
 *
 * The version of the OpenAPI document: 1.0.0-SNAPSHOT
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package admin.api.MRM.externalAPI.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DseObjectNumberFormatDto
 */

public class DseObjectNumberFormatDto
{
    public static final String SERIALIZED_NAME_FORMATS = "formats";
    @SerializedName(SERIALIZED_NAME_FORMATS)
    private List<DseObjectNumberFormatLineDto> formats = null;

    public static final String SERIALIZED_NAME_SUCCESS = "success";
    @SerializedName(SERIALIZED_NAME_SUCCESS)
    private Boolean success;


    public DseObjectNumberFormatDto formats(List<DseObjectNumberFormatLineDto> formats)
    {

        this.formats = formats;
        return this;
    }

    public DseObjectNumberFormatDto addFormatsItem(DseObjectNumberFormatLineDto formatsItem)
    {
        if (this.formats == null)
        {
            this.formats = new ArrayList<DseObjectNumberFormatLineDto>();
        }
        this.formats.add(formatsItem);
        return this;
    }

    /**
     * Get formats
     *
     * @return formats
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public List<DseObjectNumberFormatLineDto> getFormats()
    {
        return formats;
    }


    public void setFormats(List<DseObjectNumberFormatLineDto> formats)
    {
        this.formats = formats;
    }


    public DseObjectNumberFormatDto success(Boolean success)
    {

        this.success = success;
        return this;
    }

    /**
     * Get success
     *
     * @return success
     **/
    @ApiModelProperty(required = true, value = "")

    public Boolean getSuccess()
    {
        return success;
    }


    public void setSuccess(Boolean success)
    {
        this.success = success;
    }


    @Override
    public boolean equals(java.lang.Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        DseObjectNumberFormatDto dseObjectNumberFormatDto = (DseObjectNumberFormatDto) o;
        return Objects.equals(this.formats, dseObjectNumberFormatDto.formats) &&
                Objects.equals(this.success, dseObjectNumberFormatDto.success);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(formats, success);
    }


    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class DseObjectNumberFormatDto {\n");
        sb.append("    formats: ").append(toIndentedString(formats)).append("\n");
        sb.append("    success: ").append(toIndentedString(success)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o)
    {
        if (o == null)
        {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

