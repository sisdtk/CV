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
 * DTO for workflow.
 */
@ApiModel(description = "DTO for workflow.")

public class BreadcrumbWorkflowDto
{
  public static final String SERIALIZED_NAME_INSTANCE_ID = "instanceId";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Integer instanceId;

  public static final String SERIALIZED_NAME_TYPE_ID = "typeId";
  @SerializedName(SERIALIZED_NAME_TYPE_ID)
  private Integer typeId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CREATOR = "creator";
  @SerializedName(SERIALIZED_NAME_CREATOR)
  private UserDto creator;

  public static final String SERIALIZED_NAME_CURRENT_STEP = "currentStep";
  @SerializedName(SERIALIZED_NAME_CURRENT_STEP)
  private BreadcrumbWorkflowStepDetailsDto currentStep;

  public static final String SERIALIZED_NAME_STEPS = "steps";
  @SerializedName(SERIALIZED_NAME_STEPS)
  private List<BreadcrumbWorkflowStepDto> steps = null;


  public BreadcrumbWorkflowDto instanceId(Integer instanceId)
  {

    this.instanceId = instanceId;
    return this;
  }

  /**
   * @return instanceId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getInstanceId()
  {
    return instanceId;
  }


  public void setInstanceId(Integer instanceId)
  {
    this.instanceId = instanceId;
  }


  public BreadcrumbWorkflowDto typeId(Integer typeId)
  {

    this.typeId = typeId;
    return this;
  }

  /**
   * @return typeId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTypeId()
  {
    return typeId;
  }


  public void setTypeId(Integer typeId)
  {
    this.typeId = typeId;
  }


  public BreadcrumbWorkflowDto name(String name)
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


  public BreadcrumbWorkflowDto creator(UserDto creator)
  {

    this.creator = creator;
    return this;
  }

  /**
   * Get creator
   *
   * @return creator
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UserDto getCreator()
  {
    return creator;
  }


  public void setCreator(UserDto creator)
  {
    this.creator = creator;
  }


  public BreadcrumbWorkflowDto currentStep(BreadcrumbWorkflowStepDetailsDto currentStep)
  {

    this.currentStep = currentStep;
    return this;
  }

  /**
   * Get currentStep
   *
   * @return currentStep
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public BreadcrumbWorkflowStepDetailsDto getCurrentStep()
  {
    return currentStep;
  }


  public void setCurrentStep(BreadcrumbWorkflowStepDetailsDto currentStep)
  {
    this.currentStep = currentStep;
  }


  public BreadcrumbWorkflowDto steps(List<BreadcrumbWorkflowStepDto> steps)
  {

    this.steps = steps;
    return this;
  }

  public BreadcrumbWorkflowDto addStepsItem(BreadcrumbWorkflowStepDto stepsItem)
  {
    if (this.steps == null)
    {
      this.steps = new ArrayList<BreadcrumbWorkflowStepDto>();
    }
    this.steps.add(stepsItem);
    return this;
  }

  /**
   * @return steps
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<BreadcrumbWorkflowStepDto> getSteps()
  {
    return steps;
  }


  public void setSteps(List<BreadcrumbWorkflowStepDto> steps)
  {
    this.steps = steps;
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
    BreadcrumbWorkflowDto breadcrumbWorkflowDto = (BreadcrumbWorkflowDto) o;
    return Objects.equals(this.instanceId, breadcrumbWorkflowDto.instanceId) &&
            Objects.equals(this.typeId, breadcrumbWorkflowDto.typeId) &&
            Objects.equals(this.name, breadcrumbWorkflowDto.name) &&
            Objects.equals(this.creator, breadcrumbWorkflowDto.creator) &&
            Objects.equals(this.currentStep, breadcrumbWorkflowDto.currentStep) &&
            Objects.equals(this.steps, breadcrumbWorkflowDto.steps);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(instanceId, typeId, name, creator, currentStep, steps);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BreadcrumbWorkflowDto {\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    currentStep: ").append(toIndentedString(currentStep)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
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
