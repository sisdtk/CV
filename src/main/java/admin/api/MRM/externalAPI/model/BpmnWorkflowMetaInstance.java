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

public class BpmnWorkflowMetaInstance
{
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_WORKFLOW_METATYPE = "workflowMetatype";
  @SerializedName(SERIALIZED_NAME_WORKFLOW_METATYPE)
  private WorkflowMetatype workflowMetatype;

  public static final String SERIALIZED_NAME_DSE_OBJECT_TYPE_ID = "dseObjectTypeId";
  @SerializedName(SERIALIZED_NAME_DSE_OBJECT_TYPE_ID)
  private Integer dseObjectTypeId;

  public static final String SERIALIZED_NAME_XML = "xml";
  @SerializedName(SERIALIZED_NAME_XML)
  private String xml;


  public BpmnWorkflowMetaInstance id(Integer id)
  {

    this.id = id;
    return this;
  }

  /**
   * @return id
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getId()
  {
    return id;
  }


  public void setId(Integer id)
  {
    this.id = id;
  }


  public BpmnWorkflowMetaInstance workflowMetatype(WorkflowMetatype workflowMetatype)
  {

    this.workflowMetatype = workflowMetatype;
    return this;
  }

  /**
   * Get workflowMetatype
   *
   * @return workflowMetatype
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public WorkflowMetatype getWorkflowMetatype()
  {
    return workflowMetatype;
  }


  public void setWorkflowMetatype(WorkflowMetatype workflowMetatype)
  {
    this.workflowMetatype = workflowMetatype;
  }


  public BpmnWorkflowMetaInstance dseObjectTypeId(Integer dseObjectTypeId)
  {

    this.dseObjectTypeId = dseObjectTypeId;
    return this;
  }

  /**
   * @return dseObjectTypeId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDseObjectTypeId()
  {
    return dseObjectTypeId;
  }


  public void setDseObjectTypeId(Integer dseObjectTypeId)
  {
    this.dseObjectTypeId = dseObjectTypeId;
  }


  public BpmnWorkflowMetaInstance xml(String xml)
  {

    this.xml = xml;
    return this;
  }

  /**
   * @return xml
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getXml()
  {
    return xml;
  }


  public void setXml(String xml)
  {
    this.xml = xml;
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
    BpmnWorkflowMetaInstance bpmnWorkflowMetaInstance = (BpmnWorkflowMetaInstance) o;
    return Objects.equals(this.id, bpmnWorkflowMetaInstance.id) &&
            Objects.equals(this.workflowMetatype, bpmnWorkflowMetaInstance.workflowMetatype) &&
            Objects.equals(this.dseObjectTypeId, bpmnWorkflowMetaInstance.dseObjectTypeId) &&
            Objects.equals(this.xml, bpmnWorkflowMetaInstance.xml);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(id, workflowMetatype, dseObjectTypeId, xml);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BpmnWorkflowMetaInstance {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    workflowMetatype: ").append(toIndentedString(workflowMetatype)).append("\n");
    sb.append("    dseObjectTypeId: ").append(toIndentedString(dseObjectTypeId)).append("\n");
    sb.append("    xml: ").append(toIndentedString(xml)).append("\n");
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

