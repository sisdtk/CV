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

public class MaplCreateNodeRequestBody
{
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_START_DATE = "startDate";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private Integer startDate;

  public static final String SERIALIZED_NAME_END_DATE = "endDate";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private Integer endDate;

  public static final String SERIALIZED_NAME_NODE_TYPE_ID = "nodeTypeId";
  @SerializedName(SERIALIZED_NAME_NODE_TYPE_ID)
  private String nodeTypeId;

  public static final String SERIALIZED_NAME_INFO = "info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private String info;

  public static final String SERIALIZED_NAME_CURRENCY_ID = "currencyId";
  @SerializedName(SERIALIZED_NAME_CURRENCY_ID)
  private Integer currencyId;

  public static final String SERIALIZED_NAME_EXTERNAL_ID = "externalId";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ID)
  private String externalId;

  public static final String SERIALIZED_NAME_RESP_PERSON = "respPerson";
  @SerializedName(SERIALIZED_NAME_RESP_PERSON)
  private ResponsiblePerson respPerson;


  public MaplCreateNodeRequestBody name(String name)
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


  public MaplCreateNodeRequestBody startDate(Integer startDate)
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


  public MaplCreateNodeRequestBody endDate(Integer endDate)
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


  public MaplCreateNodeRequestBody nodeTypeId(String nodeTypeId)
  {

    this.nodeTypeId = nodeTypeId;
    return this;
  }

  /**
   * @return nodeTypeId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNodeTypeId()
  {
    return nodeTypeId;
  }


  public void setNodeTypeId(String nodeTypeId)
  {
    this.nodeTypeId = nodeTypeId;
  }


  public MaplCreateNodeRequestBody info(String info)
  {

    this.info = info;
    return this;
  }

  /**
   * @return info
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getInfo()
  {
    return info;
  }


  public void setInfo(String info)
  {
    this.info = info;
  }


  public MaplCreateNodeRequestBody currencyId(Integer currencyId)
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


  public MaplCreateNodeRequestBody externalId(String externalId)
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


  public MaplCreateNodeRequestBody respPerson(ResponsiblePerson respPerson)
  {

    this.respPerson = respPerson;
    return this;
  }

  /**
   * Get respPerson
   *
   * @return respPerson
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ResponsiblePerson getRespPerson()
  {
    return respPerson;
  }


  public void setRespPerson(ResponsiblePerson respPerson)
  {
    this.respPerson = respPerson;
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
    MaplCreateNodeRequestBody maplCreateNodeRequestBody = (MaplCreateNodeRequestBody) o;
    return Objects.equals(this.name, maplCreateNodeRequestBody.name) &&
            Objects.equals(this.startDate, maplCreateNodeRequestBody.startDate) &&
            Objects.equals(this.endDate, maplCreateNodeRequestBody.endDate) &&
            Objects.equals(this.nodeTypeId, maplCreateNodeRequestBody.nodeTypeId) &&
            Objects.equals(this.info, maplCreateNodeRequestBody.info) &&
            Objects.equals(this.currencyId, maplCreateNodeRequestBody.currencyId) &&
            Objects.equals(this.externalId, maplCreateNodeRequestBody.externalId) &&
            Objects.equals(this.respPerson, maplCreateNodeRequestBody.respPerson);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(name, startDate, endDate, nodeTypeId, info, currencyId, externalId, respPerson);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaplCreateNodeRequestBody {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    nodeTypeId: ").append(toIndentedString(nodeTypeId)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    respPerson: ").append(toIndentedString(respPerson)).append("\n");
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

