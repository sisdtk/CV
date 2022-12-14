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

public class CandidateGroupDefinitionError
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

  public static final String SERIALIZED_NAME_ATTR_NAME = "attrName";
  @SerializedName(SERIALIZED_NAME_ATTR_NAME)
  private String attrName;

  public static final String SERIALIZED_NAME_ATTR_VALUE = "attrValue";
  @SerializedName(SERIALIZED_NAME_ATTR_VALUE)
  private String attrValue;

  public static final String SERIALIZED_NAME_AREA_I_DS = "areaIDs";
  @SerializedName(SERIALIZED_NAME_AREA_I_DS)
  private List<Integer> areaIDs = null;


  public CandidateGroupDefinitionError severity(ValidationResultSeverity severity)
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


  public CandidateGroupDefinitionError message(String message)
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


  public CandidateGroupDefinitionError messageParams(List<String> messageParams)
  {

    this.messageParams = messageParams;
    return this;
  }

  public CandidateGroupDefinitionError addMessageParamsItem(String messageParamsItem)
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


  public CandidateGroupDefinitionError attrName(String attrName)
  {

    this.attrName = attrName;
    return this;
  }

  /**
   * @return attrName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAttrName()
  {
    return attrName;
  }


  public void setAttrName(String attrName)
  {
    this.attrName = attrName;
  }


  public CandidateGroupDefinitionError attrValue(String attrValue)
  {

    this.attrValue = attrValue;
    return this;
  }

  /**
   * @return attrValue
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAttrValue()
  {
    return attrValue;
  }


  public void setAttrValue(String attrValue)
  {
    this.attrValue = attrValue;
  }


  public CandidateGroupDefinitionError areaIDs(List<Integer> areaIDs)
  {

    this.areaIDs = areaIDs;
    return this;
  }

  public CandidateGroupDefinitionError addAreaIDsItem(Integer areaIDsItem)
  {
    if (this.areaIDs == null)
    {
      this.areaIDs = new ArrayList<Integer>();
    }
    this.areaIDs.add(areaIDsItem);
    return this;
  }

  /**
   * @return areaIDs
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getAreaIDs()
  {
    return areaIDs;
  }


  public void setAreaIDs(List<Integer> areaIDs)
  {
    this.areaIDs = areaIDs;
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
    CandidateGroupDefinitionError candidateGroupDefinitionError = (CandidateGroupDefinitionError) o;
    return Objects.equals(this.severity, candidateGroupDefinitionError.severity) &&
            Objects.equals(this.message, candidateGroupDefinitionError.message) &&
            Objects.equals(this.messageParams, candidateGroupDefinitionError.messageParams) &&
            Objects.equals(this.attrName, candidateGroupDefinitionError.attrName) &&
            Objects.equals(this.attrValue, candidateGroupDefinitionError.attrValue) &&
            Objects.equals(this.areaIDs, candidateGroupDefinitionError.areaIDs);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(severity, message, messageParams, attrName, attrValue, areaIDs);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CandidateGroupDefinitionError {\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageParams: ").append(toIndentedString(messageParams)).append("\n");
    sb.append("    attrName: ").append(toIndentedString(attrName)).append("\n");
    sb.append("    attrValue: ").append(toIndentedString(attrValue)).append("\n");
    sb.append("    areaIDs: ").append(toIndentedString(areaIDs)).append("\n");
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

