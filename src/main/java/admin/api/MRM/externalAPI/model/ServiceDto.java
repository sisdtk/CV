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

public class ServiceDto
{
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_METHODS = "methods";
  @SerializedName(SERIALIZED_NAME_METHODS)
  private List<MethodDto> methods = null;


  public ServiceDto name(String name)
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


  public ServiceDto description(String description)
  {

    this.description = description;
    return this;
  }

  /**
   * @return description
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription()
  {
    return description;
  }


  public void setDescription(String description)
  {
    this.description = description;
  }


  public ServiceDto methods(List<MethodDto> methods)
  {

    this.methods = methods;
    return this;
  }

  public ServiceDto addMethodsItem(MethodDto methodsItem)
  {
    if (this.methods == null)
    {
      this.methods = new ArrayList<MethodDto>();
    }
    this.methods.add(methodsItem);
    return this;
  }

  /**
   * @return methods
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MethodDto> getMethods()
  {
    return methods;
  }


  public void setMethods(List<MethodDto> methods)
  {
    this.methods = methods;
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
    ServiceDto serviceDto = (ServiceDto) o;
    return Objects.equals(this.name, serviceDto.name) &&
            Objects.equals(this.description, serviceDto.description) &&
            Objects.equals(this.methods, serviceDto.methods);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(name, description, methods);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    methods: ").append(toIndentedString(methods)).append("\n");
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
