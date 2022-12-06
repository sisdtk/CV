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
 * DateInputLineDtoAllOf
 */

public class DateInputLineDtoAllOf
{
  public static final String SERIALIZED_NAME_PREFILLING = "prefilling";
  @SerializedName(SERIALIZED_NAME_PREFILLING)
  private PrefillingDto prefilling;


  public DateInputLineDtoAllOf prefilling(PrefillingDto prefilling)
  {

    this.prefilling = prefilling;
    return this;
  }

  /**
   * Get prefilling
   *
   * @return prefilling
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PrefillingDto getPrefilling()
  {
    return prefilling;
  }


  public void setPrefilling(PrefillingDto prefilling)
  {
    this.prefilling = prefilling;
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
    DateInputLineDtoAllOf dateInputLineDtoAllOf = (DateInputLineDtoAllOf) o;
    return Objects.equals(this.prefilling, dateInputLineDtoAllOf.prefilling);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(prefilling);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DateInputLineDtoAllOf {\n");
    sb.append("    prefilling: ").append(toIndentedString(prefilling)).append("\n");
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

