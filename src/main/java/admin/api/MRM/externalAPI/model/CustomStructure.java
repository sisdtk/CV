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

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 */
@ApiModel(description = "")

public class CustomStructure
{
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_CUSTOM_OBJECTS = "customObjects";
  @SerializedName(SERIALIZED_NAME_CUSTOM_OBJECTS)
  private Map<String, String> customObjects = null;


  public CustomStructure name(String name)
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


  public CustomStructure label(String label)
  {

    this.label = label;
    return this;
  }

  /**
   * @return label
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLabel()
  {
    return label;
  }


  public void setLabel(String label)
  {
    this.label = label;
  }


  public CustomStructure customObjects(Map<String, String> customObjects)
  {

    this.customObjects = customObjects;
    return this;
  }

  public CustomStructure putCustomObjectsItem(String key, String customObjectsItem)
  {
    if (this.customObjects == null)
    {
      this.customObjects = new HashMap<String, String>();
    }
    this.customObjects.put(key, customObjectsItem);
    return this;
  }

  /**
   * @return customObjects
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getCustomObjects()
  {
    return customObjects;
  }


  public void setCustomObjects(Map<String, String> customObjects)
  {
    this.customObjects = customObjects;
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
    CustomStructure customStructure = (CustomStructure) o;
    return Objects.equals(this.name, customStructure.name) &&
            Objects.equals(this.label, customStructure.label) &&
            Objects.equals(this.customObjects, customStructure.customObjects);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(name, label, customObjects);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomStructure {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    customObjects: ").append(toIndentedString(customObjects)).append("\n");
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

