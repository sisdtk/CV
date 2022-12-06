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
 * DTO for media details.
 */
@ApiModel(description = "DTO for media details.")

public class DseObjectLightDto
{
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;

    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
    private String displayName;

    public static final String SERIALIZED_NAME_DEEP_LINK = "deepLink";
    @SerializedName(SERIALIZED_NAME_DEEP_LINK)
    private String deepLink;


    public DseObjectLightDto id(Integer id)
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


    public DseObjectLightDto name(String name)
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


    public DseObjectLightDto displayName(String displayName)
    {

        this.displayName = displayName;
        return this;
    }

    /**
     * @return displayName
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getDisplayName()
    {
        return displayName;
    }


    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }


    public DseObjectLightDto deepLink(String deepLink)
    {

        this.deepLink = deepLink;
        return this;
    }

    /**
     * @return deepLink
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getDeepLink()
    {
        return deepLink;
    }


    public void setDeepLink(String deepLink)
    {
        this.deepLink = deepLink;
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
        DseObjectLightDto dseObjectLightDto = (DseObjectLightDto) o;
        return Objects.equals(this.id, dseObjectLightDto.id) &&
                Objects.equals(this.name, dseObjectLightDto.name) &&
                Objects.equals(this.displayName, dseObjectLightDto.displayName) &&
                Objects.equals(this.deepLink, dseObjectLightDto.deepLink);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, name, displayName, deepLink);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("class DseObjectLightDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    deepLink: ").append(toIndentedString(deepLink)).append("\n");
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
