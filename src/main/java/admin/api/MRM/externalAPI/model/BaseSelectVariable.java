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

import java.util.Objects;

/**
 *
 */
@ApiModel(description = "")

public class BaseSelectVariable
{
  public static final String SERIALIZED_NAME_UNIQUE_NAME = "uniqueName";
  @SerializedName(SERIALIZED_NAME_UNIQUE_NAME)
  private String uniqueName;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_SOURCE_CUSTOM_STRUCTURE = "sourceCustomStructure";
  @SerializedName(SERIALIZED_NAME_SOURCE_CUSTOM_STRUCTURE)
  private String sourceCustomStructure;


  public BaseSelectVariable uniqueName(String uniqueName)
  {

    this.uniqueName = uniqueName;
    return this;
  }

  /**
   * @return uniqueName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUniqueName()
  {
    return uniqueName;
  }


  public void setUniqueName(String uniqueName)
  {
    this.uniqueName = uniqueName;
  }


  public BaseSelectVariable displayName(String displayName)
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


  public BaseSelectVariable sourceCustomStructure(String sourceCustomStructure)
  {

    this.sourceCustomStructure = sourceCustomStructure;
    return this;
  }

  /**
   * @return sourceCustomStructure
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSourceCustomStructure()
  {
    return sourceCustomStructure;
  }


  public void setSourceCustomStructure(String sourceCustomStructure)
  {
    this.sourceCustomStructure = sourceCustomStructure;
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
    BaseSelectVariable baseSelectVariable = (BaseSelectVariable) o;
    return Objects.equals(this.uniqueName, baseSelectVariable.uniqueName) &&
            Objects.equals(this.displayName, baseSelectVariable.displayName) &&
            Objects.equals(this.sourceCustomStructure, baseSelectVariable.sourceCustomStructure);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(uniqueName, displayName, sourceCustomStructure);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseSelectVariable {\n");
    sb.append("    uniqueName: ").append(toIndentedString(uniqueName)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    sourceCustomStructure: ").append(toIndentedString(sourceCustomStructure)).append("\n");
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
