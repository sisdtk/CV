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

public class AssignmentContainerDto
{
  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private List<AssignmentDto> rows = null;


  public AssignmentContainerDto rows(List<AssignmentDto> rows)
  {

    this.rows = rows;
    return this;
  }

  public AssignmentContainerDto addRowsItem(AssignmentDto rowsItem)
  {
    if (this.rows == null)
    {
      this.rows = new ArrayList<AssignmentDto>();
    }
    this.rows.add(rowsItem);
    return this;
  }

  /**
   * @return rows
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AssignmentDto> getRows()
  {
    return rows;
  }


  public void setRows(List<AssignmentDto> rows)
  {
    this.rows = rows;
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
    AssignmentContainerDto assignmentContainerDto = (AssignmentContainerDto) o;
    return Objects.equals(this.rows, assignmentContainerDto.rows);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(rows);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignmentContainerDto {\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
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
