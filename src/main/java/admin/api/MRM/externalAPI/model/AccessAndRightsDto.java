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

import java.util.*;

/**
 *
 */
@ApiModel(description = "")

public class AccessAndRightsDto
{
  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Integer version;

  public static final String SERIALIZED_NAME_ACCESS_AND_RIGHTS = "accessAndRights";
  @SerializedName(SERIALIZED_NAME_ACCESS_AND_RIGHTS)
  private List<WorkflowAccessAndRightsDto> accessAndRights = null;

  public static final String SERIALIZED_NAME_STEP_ACCESS_AND_RIGHTS = "stepAccessAndRights";
  @SerializedName(SERIALIZED_NAME_STEP_ACCESS_AND_RIGHTS)
  private Map<String, StepAccessAndRightsDto> stepAccessAndRights = null;


  public AccessAndRightsDto version(Integer version)
  {

    this.version = version;
    return this;
  }

  /**
   * @return version
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getVersion()
  {
    return version;
  }


  public void setVersion(Integer version)
  {
    this.version = version;
  }


  public AccessAndRightsDto accessAndRights(List<WorkflowAccessAndRightsDto> accessAndRights)
  {

    this.accessAndRights = accessAndRights;
    return this;
  }

  public AccessAndRightsDto addAccessAndRightsItem(WorkflowAccessAndRightsDto accessAndRightsItem)
  {
    if (this.accessAndRights == null)
    {
      this.accessAndRights = new ArrayList<WorkflowAccessAndRightsDto>();
    }
    this.accessAndRights.add(accessAndRightsItem);
    return this;
  }

  /**
   * @return accessAndRights
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WorkflowAccessAndRightsDto> getAccessAndRights()
  {
    return accessAndRights;
  }


  public void setAccessAndRights(List<WorkflowAccessAndRightsDto> accessAndRights)
  {
    this.accessAndRights = accessAndRights;
  }


  public AccessAndRightsDto stepAccessAndRights(Map<String, StepAccessAndRightsDto> stepAccessAndRights)
  {

    this.stepAccessAndRights = stepAccessAndRights;
    return this;
  }

  public AccessAndRightsDto putStepAccessAndRightsItem(String key, StepAccessAndRightsDto stepAccessAndRightsItem)
  {
    if (this.stepAccessAndRights == null)
    {
      this.stepAccessAndRights = new HashMap<String, StepAccessAndRightsDto>();
    }
    this.stepAccessAndRights.put(key, stepAccessAndRightsItem);
    return this;
  }

  /**
   * @return stepAccessAndRights
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, StepAccessAndRightsDto> getStepAccessAndRights()
  {
    return stepAccessAndRights;
  }


  public void setStepAccessAndRights(Map<String, StepAccessAndRightsDto> stepAccessAndRights)
  {
    this.stepAccessAndRights = stepAccessAndRights;
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
    AccessAndRightsDto accessAndRightsDto = (AccessAndRightsDto) o;
    return Objects.equals(this.version, accessAndRightsDto.version) &&
            Objects.equals(this.accessAndRights, accessAndRightsDto.accessAndRights) &&
            Objects.equals(this.stepAccessAndRights, accessAndRightsDto.stepAccessAndRights);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(version, accessAndRights, stepAccessAndRights);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessAndRightsDto {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    accessAndRights: ").append(toIndentedString(accessAndRights)).append("\n");
    sb.append("    stepAccessAndRights: ").append(toIndentedString(stepAccessAndRights)).append("\n");
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

