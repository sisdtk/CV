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

public class ProcessValidationResults
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

  public static final String SERIALIZED_NAME_VERSION_TAG = "versionTag";
  @SerializedName(SERIALIZED_NAME_VERSION_TAG)
  private Integer versionTag;

  public static final String SERIALIZED_NAME_SIMPLIFIED_VIEW = "simplifiedView";
  @SerializedName(SERIALIZED_NAME_SIMPLIFIED_VIEW)
  private Boolean simplifiedView;

  public static final String SERIALIZED_NAME_SIMPLIFIED_VIEW_STEPS = "simplifiedViewSteps";
  @SerializedName(SERIALIZED_NAME_SIMPLIFIED_VIEW_STEPS)
  private List<SimplifiedViewStep> simplifiedViewSteps = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public ProcessValidationResults validationResults(List<ValidationResult> validationResults)
  {

    this.validationResults = validationResults;
    return this;
  }

  public ProcessValidationResults addValidationResultsItem(ValidationResult validationResultsItem)
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


  public ProcessValidationResults id(String id)
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


  public ProcessValidationResults elements(List<BaseValidationResults> elements)
  {

    this.elements = elements;
    return this;
  }

  public ProcessValidationResults addElementsItem(BaseValidationResults elementsItem)
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


  public ProcessValidationResults versionTag(Integer versionTag)
  {

    this.versionTag = versionTag;
    return this;
  }

  /**
   * @return versionTag
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersionTag()
  {
    return versionTag;
  }


  public void setVersionTag(Integer versionTag)
  {
    this.versionTag = versionTag;
  }


  public ProcessValidationResults simplifiedView(Boolean simplifiedView)
  {

    this.simplifiedView = simplifiedView;
    return this;
  }

  /**
   * @return simplifiedView
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSimplifiedView()
  {
    return simplifiedView;
  }


  public void setSimplifiedView(Boolean simplifiedView)
  {
    this.simplifiedView = simplifiedView;
  }


  public ProcessValidationResults simplifiedViewSteps(List<SimplifiedViewStep> simplifiedViewSteps)
  {

    this.simplifiedViewSteps = simplifiedViewSteps;
    return this;
  }

  public ProcessValidationResults addSimplifiedViewStepsItem(SimplifiedViewStep simplifiedViewStepsItem)
  {
    if (this.simplifiedViewSteps == null)
    {
      this.simplifiedViewSteps = new ArrayList<SimplifiedViewStep>();
    }
    this.simplifiedViewSteps.add(simplifiedViewStepsItem);
    return this;
  }

  /**
   * @return simplifiedViewSteps
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<SimplifiedViewStep> getSimplifiedViewSteps()
  {
    return simplifiedViewSteps;
  }


  public void setSimplifiedViewSteps(List<SimplifiedViewStep> simplifiedViewSteps)
  {
    this.simplifiedViewSteps = simplifiedViewSteps;
  }


  public ProcessValidationResults name(String name)
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
    ProcessValidationResults processValidationResults = (ProcessValidationResults) o;
    return Objects.equals(this.validationResults, processValidationResults.validationResults) &&
            Objects.equals(this.id, processValidationResults.id) &&
            Objects.equals(this.elements, processValidationResults.elements) &&
            Objects.equals(this.versionTag, processValidationResults.versionTag) &&
            Objects.equals(this.simplifiedView, processValidationResults.simplifiedView) &&
            Objects.equals(this.simplifiedViewSteps, processValidationResults.simplifiedViewSteps) &&
            Objects.equals(this.name, processValidationResults.name);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(validationResults, id, elements, versionTag, simplifiedView, simplifiedViewSteps, name);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessValidationResults {\n");
    sb.append("    validationResults: ").append(toIndentedString(validationResults)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    versionTag: ").append(toIndentedString(versionTag)).append("\n");
    sb.append("    simplifiedView: ").append(toIndentedString(simplifiedView)).append("\n");
    sb.append("    simplifiedViewSteps: ").append(toIndentedString(simplifiedViewSteps)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
