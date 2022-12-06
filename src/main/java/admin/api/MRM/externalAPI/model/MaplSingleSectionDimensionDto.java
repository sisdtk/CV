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

public class MaplSingleSectionDimensionDto
{
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DIMENSION_ID = "dimensionId";
  @SerializedName(SERIALIZED_NAME_DIMENSION_ID)
  private Integer dimensionId;

  public static final String SERIALIZED_NAME_LABEL = "label";
  @SerializedName(SERIALIZED_NAME_LABEL)
  private String label;

  public static final String SERIALIZED_NAME_AVAILABLE_OPTIONS = "availableOptions";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_OPTIONS)
  private List<MaplSelectionOptionDto> availableOptions = null;


  public MaplSingleSectionDimensionDto name(String name)
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


  public MaplSingleSectionDimensionDto type(String type)
  {

    this.type = type;
    return this;
  }

  /**
   * @return type
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getType()
  {
    return type;
  }


  public void setType(String type)
  {
    this.type = type;
  }


  public MaplSingleSectionDimensionDto dimensionId(Integer dimensionId)
  {

    this.dimensionId = dimensionId;
    return this;
  }

  /**
   * @return dimensionId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDimensionId()
  {
    return dimensionId;
  }


  public void setDimensionId(Integer dimensionId)
  {
    this.dimensionId = dimensionId;
  }


  public MaplSingleSectionDimensionDto label(String label)
  {

    this.label = label;
    return this;
  }

  /**
   * @return label
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLabel()
  {
    return label;
  }


  public void setLabel(String label)
  {
    this.label = label;
  }


  public MaplSingleSectionDimensionDto availableOptions(List<MaplSelectionOptionDto> availableOptions)
  {

    this.availableOptions = availableOptions;
    return this;
  }

  public MaplSingleSectionDimensionDto addAvailableOptionsItem(MaplSelectionOptionDto availableOptionsItem)
  {
    if (this.availableOptions == null)
    {
      this.availableOptions = new ArrayList<MaplSelectionOptionDto>();
    }
    this.availableOptions.add(availableOptionsItem);
    return this;
  }

  /**
   * @return availableOptions
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<MaplSelectionOptionDto> getAvailableOptions()
  {
    return availableOptions;
  }


  public void setAvailableOptions(List<MaplSelectionOptionDto> availableOptions)
  {
    this.availableOptions = availableOptions;
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
    MaplSingleSectionDimensionDto maplSingleSectionDimensionDto = (MaplSingleSectionDimensionDto) o;
    return Objects.equals(this.name, maplSingleSectionDimensionDto.name) &&
            Objects.equals(this.type, maplSingleSectionDimensionDto.type) &&
            Objects.equals(this.dimensionId, maplSingleSectionDimensionDto.dimensionId) &&
            Objects.equals(this.label, maplSingleSectionDimensionDto.label) &&
            Objects.equals(this.availableOptions, maplSingleSectionDimensionDto.availableOptions);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(name, type, dimensionId, label, availableOptions);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaplSingleSectionDimensionDto {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dimensionId: ").append(toIndentedString(dimensionId)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    availableOptions: ").append(toIndentedString(availableOptions)).append("\n");
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

