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

public class BaseNotificationTemplate
{
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;


  public BaseNotificationTemplate id(Integer id)
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


  public BaseNotificationTemplate subject(String subject)
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
    BaseNotificationTemplate baseNotificationTemplate = (BaseNotificationTemplate) o;
    return Objects.equals(this.id, baseNotificationTemplate.id) &&
            Objects.equals(this.subject, baseNotificationTemplate.subject);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, subject);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseNotificationTemplate {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
