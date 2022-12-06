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

public class BpmnWorkflowTypeModel
{
  public static final String SERIALIZED_NAME_MODEL_DECORATION = "modelDecoration";
  @SerializedName(SERIALIZED_NAME_MODEL_DECORATION)
  private Object modelDecoration;

  public static final String SERIALIZED_NAME_XML = "xml";
  @SerializedName(SERIALIZED_NAME_XML)
  private String xml;


  public BpmnWorkflowTypeModel modelDecoration(Object modelDecoration)
  {

    this.modelDecoration = modelDecoration;
    return this;
  }

  /**
   * @return modelDecoration
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getModelDecoration()
  {
    return modelDecoration;
  }


  public void setModelDecoration(Object modelDecoration)
  {
    this.modelDecoration = modelDecoration;
  }


  public BpmnWorkflowTypeModel xml(String xml)
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
    BpmnWorkflowTypeModel bpmnWorkflowTypeModel = (BpmnWorkflowTypeModel) o;
    return Objects.equals(this.modelDecoration, bpmnWorkflowTypeModel.modelDecoration) &&
            Objects.equals(this.xml, bpmnWorkflowTypeModel.xml);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(modelDecoration, xml);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BpmnWorkflowTypeModel {\n");
    sb.append("    modelDecoration: ").append(toIndentedString(modelDecoration)).append("\n");
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
