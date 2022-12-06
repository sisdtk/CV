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

public class MergeGatewayValidationResults
{
  public static final String SERIALIZED_NAME_VALIDATION_RESULTS = "validationResults";
  @SerializedName(SERIALIZED_NAME_VALIDATION_RESULTS)
  private List<ValidationResult> validationResults = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_ELEMENTS = "elements";
  @SerializedName(SERIALIZED_NAME_ELEMENTS)
  private List<BaseValidationResults> elements = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private GatewayType type;

  public static final String SERIALIZED_NAME_INCOMING = "incoming";
  @SerializedName(SERIALIZED_NAME_INCOMING)
  private List<String> incoming = null;

  public static final String SERIALIZED_NAME_OUTGOING = "outgoing";
  @SerializedName(SERIALIZED_NAME_OUTGOING)
  private String outgoing;


  public MergeGatewayValidationResults validationResults(List<ValidationResult> validationResults)
  {

    this.validationResults = validationResults;
    return this;
  }

  public MergeGatewayValidationResults addValidationResultsItem(ValidationResult validationResultsItem)
  {
    if (this.validationResults == null)
    {
      this.validationResults = new ArrayList<ValidationResult>();
    }
    this.validationResults.add(validationResultsItem);
    return this;
  }

  /**
   * @return validationResults
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<ValidationResult> getValidationResults()
  {
    return validationResults;
  }


  public void setValidationResults(List<ValidationResult> validationResults)
  {
    this.validationResults = validationResults;
  }


  public MergeGatewayValidationResults id(String id)
  {

    this.id = id;
    return this;
  }

  /**
   * @return id
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getId()
  {
    return id;
  }


  public void setId(String id)
  {
    this.id = id;
  }


  public MergeGatewayValidationResults elements(List<BaseValidationResults> elements)
  {

    this.elements = elements;
    return this;
  }

  public MergeGatewayValidationResults addElementsItem(BaseValidationResults elementsItem)
  {
    if (this.elements == null)
    {
      this.elements = new ArrayList<BaseValidationResults>();
    }
    this.elements.add(elementsItem);
    return this;
  }

  /**
   * @return elements
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BaseValidationResults> getElements()
  {
    return elements;
  }


  public void setElements(List<BaseValidationResults> elements)
  {
    this.elements = elements;
  }


  public MergeGatewayValidationResults type(GatewayType type)
  {

    this.type = type;
    return this;
  }

  /**
   * Get type
   *
   * @return type
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GatewayType getType()
  {
    return type;
  }


  public void setType(GatewayType type)
  {
    this.type = type;
  }


  public MergeGatewayValidationResults incoming(List<String> incoming)
  {

    this.incoming = incoming;
    return this;
  }

  public MergeGatewayValidationResults addIncomingItem(String incomingItem)
  {
    if (this.incoming == null)
    {
      this.incoming = new ArrayList<String>();
    }
    this.incoming.add(incomingItem);
    return this;
  }

  /**
   * @return incoming
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getIncoming()
  {
    return incoming;
  }


  public void setIncoming(List<String> incoming)
  {
    this.incoming = incoming;
  }


  public MergeGatewayValidationResults outgoing(String outgoing)
  {

    this.outgoing = outgoing;
    return this;
  }

  /**
   * @return outgoing
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getOutgoing()
  {
    return outgoing;
  }


  public void setOutgoing(String outgoing)
  {
    this.outgoing = outgoing;
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
    MergeGatewayValidationResults mergeGatewayValidationResults = (MergeGatewayValidationResults) o;
    return Objects.equals(this.validationResults, mergeGatewayValidationResults.validationResults) &&
            Objects.equals(this.id, mergeGatewayValidationResults.id) &&
            Objects.equals(this.elements, mergeGatewayValidationResults.elements) &&
            Objects.equals(this.type, mergeGatewayValidationResults.type) &&
            Objects.equals(this.incoming, mergeGatewayValidationResults.incoming) &&
            Objects.equals(this.outgoing, mergeGatewayValidationResults.outgoing);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(validationResults, id, elements, type, incoming, outgoing);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeGatewayValidationResults {\n");
    sb.append("    validationResults: ").append(toIndentedString(validationResults)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    incoming: ").append(toIndentedString(incoming)).append("\n");
    sb.append("    outgoing: ").append(toIndentedString(outgoing)).append("\n");
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

