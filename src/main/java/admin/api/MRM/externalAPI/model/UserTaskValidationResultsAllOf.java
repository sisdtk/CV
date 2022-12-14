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

import java.util.Objects;

/**
 * UserTaskValidationResultsAllOf
 */

public class UserTaskValidationResultsAllOf
{
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_INCOMING = "incoming";
  @SerializedName(SERIALIZED_NAME_INCOMING)
  private String incoming;

  public static final String SERIALIZED_NAME_OUTGOING = "outgoing";
  @SerializedName(SERIALIZED_NAME_OUTGOING)
  private String outgoing;

  public static final String SERIALIZED_NAME_CANDIDATE_GROUP = "candidateGroup";
  @SerializedName(SERIALIZED_NAME_CANDIDATE_GROUP)
  private String candidateGroup;

  public static final String SERIALIZED_NAME_CANDIDATE_USER = "candidateUser";
  @SerializedName(SERIALIZED_NAME_CANDIDATE_USER)
  private String candidateUser;

  public static final String SERIALIZED_NAME_CANDIDATE_USER_VARIABLE = "candidateUserVariable";
  @SerializedName(SERIALIZED_NAME_CANDIDATE_USER_VARIABLE)
  private String candidateUserVariable;

  public static final String SERIALIZED_NAME_STEP0 = "step0";
  @SerializedName(SERIALIZED_NAME_STEP0)
  private Boolean step0;

  public static final String SERIALIZED_NAME_DECISION = "decision";
  @SerializedName(SERIALIZED_NAME_DECISION)
  private GenericDecisionResult decision;

  public static final String SERIALIZED_NAME_SIMPLIFIED_VIEW_STEP = "simplifiedViewStep";
  @SerializedName(SERIALIZED_NAME_SIMPLIFIED_VIEW_STEP)
  private String simplifiedViewStep;


  public UserTaskValidationResultsAllOf name(String name)
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


  public UserTaskValidationResultsAllOf incoming(String incoming)
  {

    this.incoming = incoming;
    return this;
  }

  /**
   * @return incoming
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIncoming()
  {
    return incoming;
  }


  public void setIncoming(String incoming)
  {
    this.incoming = incoming;
  }


  public UserTaskValidationResultsAllOf outgoing(String outgoing)
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


  public UserTaskValidationResultsAllOf candidateGroup(String candidateGroup)
  {

    this.candidateGroup = candidateGroup;
    return this;
  }

  /**
   * @return candidateGroup
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCandidateGroup()
  {
    return candidateGroup;
  }


  public void setCandidateGroup(String candidateGroup)
  {
    this.candidateGroup = candidateGroup;
  }


  public UserTaskValidationResultsAllOf candidateUser(String candidateUser)
  {

    this.candidateUser = candidateUser;
    return this;
  }

  /**
   * @return candidateUser
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCandidateUser()
  {
    return candidateUser;
  }


  public void setCandidateUser(String candidateUser)
  {
    this.candidateUser = candidateUser;
  }


  public UserTaskValidationResultsAllOf candidateUserVariable(String candidateUserVariable)
  {

    this.candidateUserVariable = candidateUserVariable;
    return this;
  }

  /**
   * @return candidateUserVariable
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCandidateUserVariable()
  {
    return candidateUserVariable;
  }


  public void setCandidateUserVariable(String candidateUserVariable)
  {
    this.candidateUserVariable = candidateUserVariable;
  }


  public UserTaskValidationResultsAllOf step0(Boolean step0)
  {

    this.step0 = step0;
    return this;
  }

  /**
   * @return step0
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getStep0()
  {
    return step0;
  }


  public void setStep0(Boolean step0)
  {
    this.step0 = step0;
  }


  public UserTaskValidationResultsAllOf decision(GenericDecisionResult decision)
  {

    this.decision = decision;
    return this;
  }

  /**
   * Get decision
   *
   * @return decision
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GenericDecisionResult getDecision()
  {
    return decision;
  }


  public void setDecision(GenericDecisionResult decision)
  {
    this.decision = decision;
  }


  public UserTaskValidationResultsAllOf simplifiedViewStep(String simplifiedViewStep)
  {

    this.simplifiedViewStep = simplifiedViewStep;
    return this;
  }

  /**
   * @return simplifiedViewStep
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSimplifiedViewStep()
  {
    return simplifiedViewStep;
  }


  public void setSimplifiedViewStep(String simplifiedViewStep)
  {
    this.simplifiedViewStep = simplifiedViewStep;
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
    UserTaskValidationResultsAllOf userTaskValidationResultsAllOf = (UserTaskValidationResultsAllOf) o;
    return Objects.equals(this.name, userTaskValidationResultsAllOf.name) &&
            Objects.equals(this.incoming, userTaskValidationResultsAllOf.incoming) &&
            Objects.equals(this.outgoing, userTaskValidationResultsAllOf.outgoing) &&
            Objects.equals(this.candidateGroup, userTaskValidationResultsAllOf.candidateGroup) &&
            Objects.equals(this.candidateUser, userTaskValidationResultsAllOf.candidateUser) &&
            Objects.equals(this.candidateUserVariable, userTaskValidationResultsAllOf.candidateUserVariable) &&
            Objects.equals(this.step0, userTaskValidationResultsAllOf.step0) &&
            Objects.equals(this.decision, userTaskValidationResultsAllOf.decision) &&
            Objects.equals(this.simplifiedViewStep, userTaskValidationResultsAllOf.simplifiedViewStep);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(name, incoming, outgoing, candidateGroup, candidateUser, candidateUserVariable, step0, decision, simplifiedViewStep);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTaskValidationResultsAllOf {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    incoming: ").append(toIndentedString(incoming)).append("\n");
    sb.append("    outgoing: ").append(toIndentedString(outgoing)).append("\n");
    sb.append("    candidateGroup: ").append(toIndentedString(candidateGroup)).append("\n");
    sb.append("    candidateUser: ").append(toIndentedString(candidateUser)).append("\n");
    sb.append("    candidateUserVariable: ").append(toIndentedString(candidateUserVariable)).append("\n");
    sb.append("    step0: ").append(toIndentedString(step0)).append("\n");
    sb.append("    decision: ").append(toIndentedString(decision)).append("\n");
    sb.append("    simplifiedViewStep: ").append(toIndentedString(simplifiedViewStep)).append("\n");
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

