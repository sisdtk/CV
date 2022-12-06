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
 * OldWorkflowStepTemplateAllOf
 */

public class OldWorkflowStepTemplateAllOf
{
  public static final String SERIALIZED_NAME_NEXT_STEP_I_D = "nextStepID";
  @SerializedName(SERIALIZED_NAME_NEXT_STEP_I_D)
  private Integer nextStepID;

  public static final String SERIALIZED_NAME_REJECT_TO_STEP_I_D = "rejectToStepID";
  @SerializedName(SERIALIZED_NAME_REJECT_TO_STEP_I_D)
  private Integer rejectToStepID;

  public static final String SERIALIZED_NAME_REJECT_TO_STEP_MANDATORY = "rejectToStepMandatory";
  @SerializedName(SERIALIZED_NAME_REJECT_TO_STEP_MANDATORY)
  private Boolean rejectToStepMandatory;

  public static final String SERIALIZED_NAME_ADDITIONA_AREAS = "additionaAreas";
  @SerializedName(SERIALIZED_NAME_ADDITIONA_AREAS)
  private List<WsAdditionalArea> additionaAreas = null;


  public OldWorkflowStepTemplateAllOf nextStepID(Integer nextStepID)
  {

    this.nextStepID = nextStepID;
    return this;
  }

  /**
   * @return nextStepID
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getNextStepID()
  {
    return nextStepID;
  }


  public void setNextStepID(Integer nextStepID)
  {
    this.nextStepID = nextStepID;
  }


  public OldWorkflowStepTemplateAllOf rejectToStepID(Integer rejectToStepID)
  {

    this.rejectToStepID = rejectToStepID;
    return this;
  }

  /**
   * @return rejectToStepID
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getRejectToStepID()
  {
    return rejectToStepID;
  }


  public void setRejectToStepID(Integer rejectToStepID)
  {
    this.rejectToStepID = rejectToStepID;
  }


  public OldWorkflowStepTemplateAllOf rejectToStepMandatory(Boolean rejectToStepMandatory)
  {

    this.rejectToStepMandatory = rejectToStepMandatory;
    return this;
  }

  /**
   * @return rejectToStepMandatory
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRejectToStepMandatory()
  {
    return rejectToStepMandatory;
  }


  public void setRejectToStepMandatory(Boolean rejectToStepMandatory)
  {
    this.rejectToStepMandatory = rejectToStepMandatory;
  }


  public OldWorkflowStepTemplateAllOf additionaAreas(List<WsAdditionalArea> additionaAreas)
  {

    this.additionaAreas = additionaAreas;
    return this;
  }

  public OldWorkflowStepTemplateAllOf addAdditionaAreasItem(WsAdditionalArea additionaAreasItem)
  {
    if (this.additionaAreas == null)
    {
      this.additionaAreas = new ArrayList<WsAdditionalArea>();
    }
    this.additionaAreas.add(additionaAreasItem);
    return this;
  }

  /**
   * @return additionaAreas
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<WsAdditionalArea> getAdditionaAreas()
  {
    return additionaAreas;
  }


  public void setAdditionaAreas(List<WsAdditionalArea> additionaAreas)
  {
    this.additionaAreas = additionaAreas;
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
    OldWorkflowStepTemplateAllOf oldWorkflowStepTemplateAllOf = (OldWorkflowStepTemplateAllOf) o;
    return Objects.equals(this.nextStepID, oldWorkflowStepTemplateAllOf.nextStepID) &&
            Objects.equals(this.rejectToStepID, oldWorkflowStepTemplateAllOf.rejectToStepID) &&
            Objects.equals(this.rejectToStepMandatory, oldWorkflowStepTemplateAllOf.rejectToStepMandatory) &&
            Objects.equals(this.additionaAreas, oldWorkflowStepTemplateAllOf.additionaAreas);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(nextStepID, rejectToStepID, rejectToStepMandatory, additionaAreas);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OldWorkflowStepTemplateAllOf {\n");
    sb.append("    nextStepID: ").append(toIndentedString(nextStepID)).append("\n");
    sb.append("    rejectToStepID: ").append(toIndentedString(rejectToStepID)).append("\n");
    sb.append("    rejectToStepMandatory: ").append(toIndentedString(rejectToStepMandatory)).append("\n");
    sb.append("    additionaAreas: ").append(toIndentedString(additionaAreas)).append("\n");
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
