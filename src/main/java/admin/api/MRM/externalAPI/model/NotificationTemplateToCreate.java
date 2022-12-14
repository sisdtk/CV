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

public class NotificationTemplateToCreate
{
    public static final String SERIALIZED_NAME_DSE_OBJECT_TYPE_ID = "dseObjectTypeId";
    @SerializedName(SERIALIZED_NAME_DSE_OBJECT_TYPE_ID)
    private Integer dseObjectTypeId;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_LANGUAGE = "language";
    @SerializedName(SERIALIZED_NAME_LANGUAGE)
    private String language;

    public static final String SERIALIZED_NAME_SUBJECT = "subject";
    @SerializedName(SERIALIZED_NAME_SUBJECT)
    private String subject;

    public static final String SERIALIZED_NAME_PAPER = "paper";
    @SerializedName(SERIALIZED_NAME_PAPER)
    private String paper;


    public NotificationTemplateToCreate dseObjectTypeId(Integer dseObjectTypeId)
    {

        this.dseObjectTypeId = dseObjectTypeId;
        return this;
    }

    /**
     * @return dseObjectTypeId
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Integer getDseObjectTypeId()
    {
        return dseObjectTypeId;
    }


    public void setDseObjectTypeId(Integer dseObjectTypeId)
    {
        this.dseObjectTypeId = dseObjectTypeId;
    }


    public NotificationTemplateToCreate name(String name)
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


    public NotificationTemplateToCreate language(String language)
    {

        this.language = language;
        return this;
    }

    /**
     * @return language
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getLanguage()
    {
        return language;
    }


    public void setLanguage(String language)
    {
        this.language = language;
    }


    public NotificationTemplateToCreate subject(String subject)
    {

        this.subject = subject;
        return this;
    }

    /**
     * @return subject
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getSubject()
    {
        return subject;
    }


    public void setSubject(String subject)
    {
        this.subject = subject;
    }


    public NotificationTemplateToCreate paper(String paper)
    {

        this.paper = paper;
        return this;
    }

    /**
     * @return paper
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getPaper()
    {
        return paper;
    }


    public void setPaper(String paper)
    {
        this.paper = paper;
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
        NotificationTemplateToCreate notificationTemplateToCreate = (NotificationTemplateToCreate) o;
        return Objects.equals(this.dseObjectTypeId, notificationTemplateToCreate.dseObjectTypeId) &&
                Objects.equals(this.name, notificationTemplateToCreate.name) &&
                Objects.equals(this.language, notificationTemplateToCreate.language) &&
                Objects.equals(this.subject, notificationTemplateToCreate.subject) &&
                Objects.equals(this.paper, notificationTemplateToCreate.paper);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(dseObjectTypeId, name, language, subject, paper);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotificationTemplateToCreate {\n");
        sb.append("    dseObjectTypeId: ").append(toIndentedString(dseObjectTypeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
        sb.append("    paper: ").append(toIndentedString(paper)).append("\n");
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

