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

public class SyncResponseOfDseNodeDto
{
  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private String errors;

  public static final String SERIALIZED_NAME_BUDGET_ERRORS = "budgetErrors";
  @SerializedName(SERIALIZED_NAME_BUDGET_ERRORS)
  private String budgetErrors;

  public static final String SERIALIZED_NAME_TIMELINE_ERRORS = "timelineErrors";
  @SerializedName(SERIALIZED_NAME_TIMELINE_ERRORS)
  private String timelineErrors;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private DseNodeDto content;


  public SyncResponseOfDseNodeDto errors(String errors)
  {

    this.errors = errors;
    return this;
  }

  /**
   * @return errors
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getErrors()
  {
    return errors;
  }


  public void setErrors(String errors)
  {
    this.errors = errors;
  }


  public SyncResponseOfDseNodeDto budgetErrors(String budgetErrors)
  {

    this.budgetErrors = budgetErrors;
    return this;
  }

  /**
   * @return budgetErrors
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBudgetErrors()
  {
    return budgetErrors;
  }


  public void setBudgetErrors(String budgetErrors)
  {
    this.budgetErrors = budgetErrors;
  }


  public SyncResponseOfDseNodeDto timelineErrors(String timelineErrors)
  {

    this.timelineErrors = timelineErrors;
    return this;
  }

  /**
   * @return timelineErrors
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTimelineErrors()
  {
    return timelineErrors;
  }


  public void setTimelineErrors(String timelineErrors)
  {
    this.timelineErrors = timelineErrors;
  }


  public SyncResponseOfDseNodeDto content(DseNodeDto content)
  {

    this.content = content;
    return this;
  }

  /**
   * Get content
   *
   * @return content
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DseNodeDto getContent()
  {
    return content;
  }


  public void setContent(DseNodeDto content)
  {
    this.content = content;
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
    SyncResponseOfDseNodeDto syncResponseOfDseNodeDto = (SyncResponseOfDseNodeDto) o;
    return Objects.equals(this.errors, syncResponseOfDseNodeDto.errors) &&
            Objects.equals(this.budgetErrors, syncResponseOfDseNodeDto.budgetErrors) &&
            Objects.equals(this.timelineErrors, syncResponseOfDseNodeDto.timelineErrors) &&
            Objects.equals(this.content, syncResponseOfDseNodeDto.content);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(errors, budgetErrors, timelineErrors, content);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncResponseOfDseNodeDto {\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    budgetErrors: ").append(toIndentedString(budgetErrors)).append("\n");
    sb.append("    timelineErrors: ").append(toIndentedString(timelineErrors)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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
