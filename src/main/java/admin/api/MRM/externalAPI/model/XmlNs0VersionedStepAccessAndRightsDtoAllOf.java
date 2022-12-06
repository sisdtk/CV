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
import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

/**
 * XmlNs0VersionedStepAccessAndRightsDtoAllOf
 */

public class XmlNs0VersionedStepAccessAndRightsDtoAllOf
{
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;


  public XmlNs0VersionedStepAccessAndRightsDtoAllOf version(String version)
  {

    this.version = version;
    return this;
  }

  /**
   * @return version
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getVersion()
  {
    return version;
  }


  public void setVersion(String version)
  {
    this.version = version;
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
    XmlNs0VersionedStepAccessAndRightsDtoAllOf xmlNs0VersionedStepAccessAndRightsDtoAllOf = (XmlNs0VersionedStepAccessAndRightsDtoAllOf) o;
    return Objects.equals(this.version, xmlNs0VersionedStepAccessAndRightsDtoAllOf.version);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(version);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class XmlNs0VersionedStepAccessAndRightsDtoAllOf {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

