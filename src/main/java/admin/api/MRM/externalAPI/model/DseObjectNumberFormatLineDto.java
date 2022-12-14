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

import java.util.Objects;

/**
 * DseObjectNumberFormatLineDto
 */

public class DseObjectNumberFormatLineDto
{
    public static final String SERIALIZED_NAME_FORMAT = "format";
    @SerializedName(SERIALIZED_NAME_FORMAT)
    private String format;

    public static final String SERIALIZED_NAME_LAST_MODIFICATION_AUTHOR = "lastModificationAuthor";
    @SerializedName(SERIALIZED_NAME_LAST_MODIFICATION_AUTHOR)
    private String lastModificationAuthor;

    public static final String SERIALIZED_NAME_LAST_MODIFICATION_DATE = "lastModificationDate";
    @SerializedName(SERIALIZED_NAME_LAST_MODIFICATION_DATE)
    private String lastModificationDate;

    public static final String SERIALIZED_NAME_MODULE_NAME = "moduleName";
    @SerializedName(SERIALIZED_NAME_MODULE_NAME)
    private String moduleName;

    public static final String SERIALIZED_NAME_PREVIEW = "preview";
    @SerializedName(SERIALIZED_NAME_PREVIEW)
    private String preview;

    public static final String SERIALIZED_NAME_START_NUMBER = "startNumber";
    @SerializedName(SERIALIZED_NAME_START_NUMBER)
    private Long startNumber;

    public static final String SERIALIZED_NAME_TOPIC_ID = "topicId";
    @SerializedName(SERIALIZED_NAME_TOPIC_ID)
    private Integer topicId;


    public DseObjectNumberFormatLineDto format(String format)
    {

        this.format = format;
        return this;
    }

    /**
     * Get format
     *
     * @return format
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getFormat()
    {
        return format;
    }


    public void setFormat(String format)
    {
        this.format = format;
    }


    public DseObjectNumberFormatLineDto lastModificationAuthor(String lastModificationAuthor)
    {

        this.lastModificationAuthor = lastModificationAuthor;
        return this;
    }

    /**
     * Get lastModificationAuthor
     *
     * @return lastModificationAuthor
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getLastModificationAuthor()
    {
        return lastModificationAuthor;
    }


    public void setLastModificationAuthor(String lastModificationAuthor)
    {
        this.lastModificationAuthor = lastModificationAuthor;
    }


    public DseObjectNumberFormatLineDto lastModificationDate(String lastModificationDate)
    {

        this.lastModificationDate = lastModificationDate;
        return this;
    }

    /**
     * Get lastModificationDate
     *
     * @return lastModificationDate
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getLastModificationDate()
    {
        return lastModificationDate;
    }


    public void setLastModificationDate(String lastModificationDate)
    {
        this.lastModificationDate = lastModificationDate;
    }


    public DseObjectNumberFormatLineDto moduleName(String moduleName)
    {

        this.moduleName = moduleName;
        return this;
    }

    /**
     * Get moduleName
     *
     * @return moduleName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getModuleName()
    {
        return moduleName;
    }


    public void setModuleName(String moduleName)
    {
        this.moduleName = moduleName;
    }


    public DseObjectNumberFormatLineDto preview(String preview)
    {

        this.preview = preview;
        return this;
    }

    /**
     * Get preview
     *
     * @return preview
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getPreview()
    {
        return preview;
    }


    public void setPreview(String preview)
    {
        this.preview = preview;
    }


    public DseObjectNumberFormatLineDto startNumber(Long startNumber)
    {

        this.startNumber = startNumber;
        return this;
    }

    /**
     * Get startNumber
     *
     * @return startNumber
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Long getStartNumber()
    {
        return startNumber;
    }


    public void setStartNumber(Long startNumber)
    {
        this.startNumber = startNumber;
    }


    public DseObjectNumberFormatLineDto topicId(Integer topicId)
    {

        this.topicId = topicId;
        return this;
    }

    /**
     * Get topicId
     *
     * @return topicId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getTopicId()
    {
        return topicId;
    }


    public void setTopicId(Integer topicId)
    {
        this.topicId = topicId;
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
        DseObjectNumberFormatLineDto dseObjectNumberFormatLineDto = (DseObjectNumberFormatLineDto) o;
        return Objects.equals(this.format, dseObjectNumberFormatLineDto.format) &&
                Objects.equals(this.lastModificationAuthor, dseObjectNumberFormatLineDto.lastModificationAuthor) &&
                Objects.equals(this.lastModificationDate, dseObjectNumberFormatLineDto.lastModificationDate) &&
                Objects.equals(this.moduleName, dseObjectNumberFormatLineDto.moduleName) &&
                Objects.equals(this.preview, dseObjectNumberFormatLineDto.preview) &&
                Objects.equals(this.startNumber, dseObjectNumberFormatLineDto.startNumber) &&
                Objects.equals(this.topicId, dseObjectNumberFormatLineDto.topicId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(format, lastModificationAuthor, lastModificationDate, moduleName, preview, startNumber, topicId);
    }


    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class DseObjectNumberFormatLineDto {\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    lastModificationAuthor: ").append(toIndentedString(lastModificationAuthor)).append("\n");
        sb.append("    lastModificationDate: ").append(toIndentedString(lastModificationDate)).append("\n");
        sb.append("    moduleName: ").append(toIndentedString(moduleName)).append("\n");
        sb.append("    preview: ").append(toIndentedString(preview)).append("\n");
        sb.append("    startNumber: ").append(toIndentedString(startNumber)).append("\n");
        sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
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

