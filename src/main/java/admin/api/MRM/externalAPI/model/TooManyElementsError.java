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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 */
@ApiModel(description = "")

public class TooManyElementsError
{
  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private ValidationResultSeverity severity;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_MESSAGE_PARAMS = "messageParams";
  @SerializedName(SERIALIZED_NAME_MESSAGE_PARAMS)
  private List<String> messageParams = null;


  public TooManyElementsError severity(ValidationResultSeverity severity)
  {

    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   *
   * @return severity
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ValidationResultSeverity getSeverity()
  {
    return severity;
  }


  public void setSeverity(ValidationResultSeverity severity)
  {
    this.severity = severity;
  }


  public TooManyElementsError message(String message)
  {

    this.message = message;
    return this;
  }

  /**
   * @return message
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getMessage()
  {
    return message;
  }


  public void setMessage(String message)
  {
    this.message = message;
  }


  public TooManyElementsError messageParams(List<String> messageParams)
  {

    this.messageParams = messageParams;
    return this;
  }

  public TooManyElementsError addMessageParamsItem(String messageParamsItem)
  {
    if (this.messageParams == null)
    {
      this.messageParams = new ArrayList<String>();
    }
    this.messageParams.add(messageParamsItem);
    return this;
  }

  /**
   * @return messageParams
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getMessageParams()
  {
    return messageParams;
  }


  public void setMessageParams(List<String> messageParams)
  {
    this.messageParams = messageParams;
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
    TooManyElementsError tooManyElementsError = (TooManyElementsError) o;
    return Objects.equals(this.severity, tooManyElementsError.severity) &&
            Objects.equals(this.message, tooManyElementsError.message) &&
            Objects.equals(this.messageParams, tooManyElementsError.messageParams);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(severity, message, messageParams);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class TooManyElementsError {\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageParams: ").append(toIndentedString(messageParams)).append("\n");
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

