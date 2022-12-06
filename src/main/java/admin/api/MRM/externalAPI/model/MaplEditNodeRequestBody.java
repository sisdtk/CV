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

public class MaplEditNodeRequestBody
{
  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private Integer startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private Integer endDate;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_NODE_NAME = "nodeName";
  @SerializedName(SERIALIZED_NAME_NODE_NAME)
  private String nodeName;

  public static final String SERIALIZED_NAME_CURRENCY_ID = "currencyId";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
  private Integer currencyId;

  public static final String SERIALIZED_NAME_NODE_TYPE_ID = "nodeTypeId";
  @SerializedName(SERIALIZED_NAME_NODE_TYPE_ID)
  private Integer nodeTypeId;

  public static final String SERIALIZED_NAME_RESPONSIBLE_PERSON = "responsiblePerson";
  @SerializedName(SERIALIZED_NAME_RESPONSIBLE_PERSON)
  private ResponsiblePerson responsiblePerson;

  public static final String SERIALIZED_NAME_GENERAL_NOTE = "generalNote";
  @SerializedName(SERIALIZED_NAME_GENERAL_NOTE)
  private String generalNote;


  public MaplEditNodeRequestBody startDate(Integer startDate)
  {

    this.startDate = startDate;
    return this;
  }

  /**
   * @return startDate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getStartDate()
  {
    return startDate;
  }


  public void setStartDate(Integer startDate)
  {
    this.startDate = startDate;
  }


  public MaplEditNodeRequestBody endDate(Integer endDate)
  {

    this.endDate = endDate;
    return this;
  }

  /**
   * @return endDate
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getEndDate()
  {
    return endDate;
  }


  public void setEndDate(Integer endDate)
  {
    this.endDate = endDate;
  }


  public MaplEditNodeRequestBody externalId(String externalId)
  {

    this.externalId = externalId;
    return this;
  }

  /**
   * @return externalId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getExternalId()
  {
    return externalId;
  }


  public void setExternalId(String externalId)
  {
    this.externalId = externalId;
  }


  public MaplEditNodeRequestBody nodeName(String nodeName)
  {

    this.nodeName = nodeName;
    return this;
  }

  /**
   * @return nodeName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeName()
  {
    return nodeName;
  }


  public void setNodeName(String nodeName)
  {
    this.nodeName = nodeName;
  }


  public MaplEditNodeRequestBody currencyId(Integer currencyId)
  {

    this.currencyId = currencyId;
    return this;
  }

  /**
   * @return currencyId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getCurrencyId()
  {
    return currencyId;
  }


  public void setCurrencyId(Integer currencyId)
  {
    this.currencyId = currencyId;
  }


  public MaplEditNodeRequestBody nodeTypeId(Integer nodeTypeId)
  {

    this.nodeTypeId = nodeTypeId;
    return this;
  }

  /**
   * @return nodeTypeId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNodeTypeId()
  {
    return nodeTypeId;
  }


  public void setNodeTypeId(Integer nodeTypeId)
  {
    this.nodeTypeId = nodeTypeId;
  }


  public MaplEditNodeRequestBody responsiblePerson(ResponsiblePerson responsiblePerson)
  {

    this.responsiblePerson = responsiblePerson;
    return this;
  }

  /**
   * Get responsiblePerson
   *
   * @return responsiblePerson
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResponsiblePerson getResponsiblePerson()
  {
    return responsiblePerson;
  }


  public void setResponsiblePerson(ResponsiblePerson responsiblePerson)
  {
    this.responsiblePerson = responsiblePerson;
  }


  public MaplEditNodeRequestBody generalNote(String generalNote)
  {

    this.generalNote = generalNote;
    return this;
  }

  /**
   * @return generalNote
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGeneralNote()
  {
    return generalNote;
  }


  public void setGeneralNote(String generalNote)
  {
    this.generalNote = generalNote;
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
    MaplEditNodeRequestBody maplEditNodeRequestBody = (MaplEditNodeRequestBody) o;
    return Objects.equals(this.startDate, maplEditNodeRequestBody.startDate) &&
            Objects.equals(this.endDate, maplEditNodeRequestBody.endDate) &&
            Objects.equals(this.externalId, maplEditNodeRequestBody.externalId) &&
            Objects.equals(this.nodeName, maplEditNodeRequestBody.nodeName) &&
            Objects.equals(this.currencyId, maplEditNodeRequestBody.currencyId) &&
            Objects.equals(this.nodeTypeId, maplEditNodeRequestBody.nodeTypeId) &&
            Objects.equals(this.responsiblePerson, maplEditNodeRequestBody.responsiblePerson) &&
            Objects.equals(this.generalNote, maplEditNodeRequestBody.generalNote);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(startDate, endDate, externalId, nodeName, currencyId, nodeTypeId, responsiblePerson, generalNote);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaplEditNodeRequestBody {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    nodeTypeId: ").append(toIndentedString(nodeTypeId)).append("\n");
    sb.append("    responsiblePerson: ").append(toIndentedString(responsiblePerson)).append("\n");
    sb.append("    generalNote: ").append(toIndentedString(generalNote)).append("\n");
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
