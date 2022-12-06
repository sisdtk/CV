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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ChildrenValidationResultsAllOf
 */

public class ChildrenValidationResultsAllOf
{
  public static final String SERIALIZED_NAME_ELEMENTS = "elements";
  @SerializedName(SERIALIZED_NAME_ELEMENTS)
  private List<BaseValidationResults> elements = null;


  public ChildrenValidationResultsAllOf elements(List<BaseValidationResults> elements)
  {

    this.elements = elements;
    return this;
  }

  public ChildrenValidationResultsAllOf addElementsItem(BaseValidationResults elementsItem)
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
    ChildrenValidationResultsAllOf childrenValidationResultsAllOf = (ChildrenValidationResultsAllOf) o;
    return Objects.equals(this.elements, childrenValidationResultsAllOf.elements);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(elements);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChildrenValidationResultsAllOf {\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
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

