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
 * Process type details
 */
@ApiModel(description = "Process type details")

public class ProcessTypeDetailsAdminDto
{
  public static final String SERIALIZED_NAME_ALLOWED_SUB_OBJECT_TYPE_IDS = "allowedSubObjectTypeIds";
  @SerializedName(SERIALIZED_NAME_ALLOWED_SUB_OBJECT_TYPE_IDS)
  private List<Integer> allowedSubObjectTypeIds = null;

  public static final String SERIALIZED_NAME_CATEGORY_IDS = "categoryIds";
  @SerializedName(SERIALIZED_NAME_CATEGORY_IDS)
  private List<Integer> categoryIds = null;

  public static final String SERIALIZED_NAME_DEFAULT_SUB_OBJECT_TYPE_ID = "defaultSubObjectTypeId";
  @SerializedName(SERIALIZED_NAME_DEFAULT_SUB_OBJECT_TYPE_ID)
  private Integer defaultSubObjectTypeId;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private Map<String, String> description = null;

  public static final String SERIALIZED_NAME_FOR_SUB_OBJECTS_ONLY = "forSubObjectsOnly";
  @SerializedName(SERIALIZED_NAME_FOR_SUB_OBJECTS_ONLY)
  private Boolean forSubObjectsOnly;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<DseObjectTypeGroupDto> groups = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_MEDIA_GUID = "mediaGuid";
  @SerializedName(SERIALIZED_NAME_MEDIA_GUID)
  private Integer mediaGuid;

  public static final String SERIALIZED_NAME_RESPECT_RESTRICTION_BY_ORG_UNITS = "respectRestrictionByOrgUnits";
  @SerializedName(SERIALIZED_NAME_RESPECT_RESTRICTION_BY_ORG_UNITS)
  private Boolean respectRestrictionByOrgUnits;

  public static final String SERIALIZED_NAME_SUB_OBJECT_CAN_BE_ADDED_MANUALLY = "subObjectCanBeAddedManually";
  @SerializedName(SERIALIZED_NAME_SUB_OBJECT_CAN_BE_ADDED_MANUALLY)
  private Boolean subObjectCanBeAddedManually;

  public static final String SERIALIZED_NAME_TECHNICAL_NAME = "technicalName";
  @SerializedName(SERIALIZED_NAME_TECHNICAL_NAME)
  private String technicalName;

  public static final String SERIALIZED_NAME_TOPIC_ID = "topicId";
  @SerializedName(SERIALIZED_NAME_TOPIC_ID)
  private Integer topicId;

  public static final String SERIALIZED_NAME_UNIQUE_NAME = "uniqueName";
  @SerializedName(SERIALIZED_NAME_UNIQUE_NAME)
  private String uniqueName;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Map<String, String> name = null;

  public static final String SERIALIZED_NAME_RUN_MODULE = "runModule";
  @SerializedName(SERIALIZED_NAME_RUN_MODULE)
  private DseRunModuleEnum runModule;


  public ProcessTypeDetailsAdminDto allowedSubObjectTypeIds(List<Integer> allowedSubObjectTypeIds)
  {

    this.allowedSubObjectTypeIds = allowedSubObjectTypeIds;
    return this;
  }

  public ProcessTypeDetailsAdminDto addAllowedSubObjectTypeIdsItem(Integer allowedSubObjectTypeIdsItem)
  {
    if (this.allowedSubObjectTypeIds == null)
    {
      this.allowedSubObjectTypeIds = new ArrayList<Integer>();
    }
    this.allowedSubObjectTypeIds.add(allowedSubObjectTypeIdsItem);
    return this;
  }

  /**
   * @return allowedSubObjectTypeIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getAllowedSubObjectTypeIds()
  {
    return allowedSubObjectTypeIds;
  }


  public void setAllowedSubObjectTypeIds(List<Integer> allowedSubObjectTypeIds)
  {
    this.allowedSubObjectTypeIds = allowedSubObjectTypeIds;
  }


  public ProcessTypeDetailsAdminDto categoryIds(List<Integer> categoryIds)
  {

    this.categoryIds = categoryIds;
    return this;
  }

  public ProcessTypeDetailsAdminDto addCategoryIdsItem(Integer categoryIdsItem)
  {
    if (this.categoryIds == null)
    {
      this.categoryIds = new ArrayList<Integer>();
    }
    this.categoryIds.add(categoryIdsItem);
    return this;
  }

  /**
   * @return categoryIds
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Integer> getCategoryIds()
  {
    return categoryIds;
  }


  public void setCategoryIds(List<Integer> categoryIds)
  {
    this.categoryIds = categoryIds;
  }


  public ProcessTypeDetailsAdminDto defaultSubObjectTypeId(Integer defaultSubObjectTypeId)
  {

    this.defaultSubObjectTypeId = defaultSubObjectTypeId;
    return this;
  }

  /**
   * @return defaultSubObjectTypeId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDefaultSubObjectTypeId()
  {
    return defaultSubObjectTypeId;
  }


  public void setDefaultSubObjectTypeId(Integer defaultSubObjectTypeId)
  {
    this.defaultSubObjectTypeId = defaultSubObjectTypeId;
  }


  public ProcessTypeDetailsAdminDto description(Map<String, String> description)
  {

    this.description = description;
    return this;
  }

  public ProcessTypeDetailsAdminDto putDescriptionItem(String key, String descriptionItem)
  {
    if (this.description == null)
    {
      this.description = new HashMap<String, String>();
    }
    this.description.put(key, descriptionItem);
    return this;
  }

  /**
   * @return description
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getDescription()
  {
    return description;
  }


  public void setDescription(Map<String, String> description)
  {
    this.description = description;
  }


  public ProcessTypeDetailsAdminDto forSubObjectsOnly(Boolean forSubObjectsOnly)
  {

    this.forSubObjectsOnly = forSubObjectsOnly;
    return this;
  }

  /**
   * @return forSubObjectsOnly
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getForSubObjectsOnly()
  {
    return forSubObjectsOnly;
  }


  public void setForSubObjectsOnly(Boolean forSubObjectsOnly)
  {
    this.forSubObjectsOnly = forSubObjectsOnly;
  }


  public ProcessTypeDetailsAdminDto groups(List<DseObjectTypeGroupDto> groups)
  {

    this.groups = groups;
    return this;
  }

  public ProcessTypeDetailsAdminDto addGroupsItem(DseObjectTypeGroupDto groupsItem)
  {
    if (this.groups == null)
    {
      this.groups = new ArrayList<DseObjectTypeGroupDto>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * @return groups
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<DseObjectTypeGroupDto> getGroups()
  {
    return groups;
  }


  public void setGroups(List<DseObjectTypeGroupDto> groups)
  {
    this.groups = groups;
  }


  public ProcessTypeDetailsAdminDto id(Integer id)
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


  public ProcessTypeDetailsAdminDto mediaGuid(Integer mediaGuid)
  {

    this.mediaGuid = mediaGuid;
    return this;
  }

  /**
   * @return mediaGuid
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getMediaGuid()
  {
    return mediaGuid;
  }


  public void setMediaGuid(Integer mediaGuid)
  {
    this.mediaGuid = mediaGuid;
  }


  public ProcessTypeDetailsAdminDto respectRestrictionByOrgUnits(Boolean respectRestrictionByOrgUnits)
  {

    this.respectRestrictionByOrgUnits = respectRestrictionByOrgUnits;
    return this;
  }

  /**
   * @return respectRestrictionByOrgUnits
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getRespectRestrictionByOrgUnits()
  {
    return respectRestrictionByOrgUnits;
  }


  public void setRespectRestrictionByOrgUnits(Boolean respectRestrictionByOrgUnits)
  {
    this.respectRestrictionByOrgUnits = respectRestrictionByOrgUnits;
  }


  public ProcessTypeDetailsAdminDto subObjectCanBeAddedManually(Boolean subObjectCanBeAddedManually)
  {

    this.subObjectCanBeAddedManually = subObjectCanBeAddedManually;
    return this;
  }

  /**
   * @return subObjectCanBeAddedManually
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getSubObjectCanBeAddedManually()
  {
    return subObjectCanBeAddedManually;
  }


  public void setSubObjectCanBeAddedManually(Boolean subObjectCanBeAddedManually)
  {
    this.subObjectCanBeAddedManually = subObjectCanBeAddedManually;
  }


  public ProcessTypeDetailsAdminDto technicalName(String technicalName)
  {

    this.technicalName = technicalName;
    return this;
  }

  /**
   * @return technicalName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTechnicalName()
  {
    return technicalName;
  }


  public void setTechnicalName(String technicalName)
  {
    this.technicalName = technicalName;
  }


  public ProcessTypeDetailsAdminDto topicId(Integer topicId)
  {

    this.topicId = topicId;
    return this;
  }

  /**
   * @return topicId
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getTopicId()
  {
    return topicId;
  }


  public void setTopicId(Integer topicId)
  {
    this.topicId = topicId;
  }


  public ProcessTypeDetailsAdminDto uniqueName(String uniqueName)
  {

    this.uniqueName = uniqueName;
    return this;
  }

  /**
   * @return uniqueName
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUniqueName()
  {
    return uniqueName;
  }


  public void setUniqueName(String uniqueName)
  {
    this.uniqueName = uniqueName;
  }


  public ProcessTypeDetailsAdminDto name(Map<String, String> name)
  {

    this.name = name;
    return this;
  }

  public ProcessTypeDetailsAdminDto putNameItem(String key, String nameItem)
  {
    if (this.name == null)
    {
      this.name = new HashMap<String, String>();
    }
    this.name.put(key, nameItem);
    return this;
  }

  /**
   * @return name
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getName()
  {
    return name;
  }


  public void setName(Map<String, String> name)
  {
    this.name = name;
  }


  public ProcessTypeDetailsAdminDto runModule(DseRunModuleEnum runModule)
  {

    this.runModule = runModule;
    return this;
  }

  /**
   * Get runModule
   *
   * @return runModule
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DseRunModuleEnum getRunModule()
  {
    return runModule;
  }


  public void setRunModule(DseRunModuleEnum runModule)
  {
    this.runModule = runModule;
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
    ProcessTypeDetailsAdminDto processTypeDetailsAdminDto = (ProcessTypeDetailsAdminDto) o;
    return Objects.equals(this.allowedSubObjectTypeIds, processTypeDetailsAdminDto.allowedSubObjectTypeIds) &&
            Objects.equals(this.categoryIds, processTypeDetailsAdminDto.categoryIds) &&
            Objects.equals(this.defaultSubObjectTypeId, processTypeDetailsAdminDto.defaultSubObjectTypeId) &&
            Objects.equals(this.description, processTypeDetailsAdminDto.description) &&
            Objects.equals(this.forSubObjectsOnly, processTypeDetailsAdminDto.forSubObjectsOnly) &&
            Objects.equals(this.groups, processTypeDetailsAdminDto.groups) &&
            Objects.equals(this.id, processTypeDetailsAdminDto.id) &&
            Objects.equals(this.mediaGuid, processTypeDetailsAdminDto.mediaGuid) &&
            Objects.equals(this.respectRestrictionByOrgUnits, processTypeDetailsAdminDto.respectRestrictionByOrgUnits) &&
            Objects.equals(this.subObjectCanBeAddedManually, processTypeDetailsAdminDto.subObjectCanBeAddedManually) &&
            Objects.equals(this.technicalName, processTypeDetailsAdminDto.technicalName) &&
            Objects.equals(this.topicId, processTypeDetailsAdminDto.topicId) &&
            Objects.equals(this.uniqueName, processTypeDetailsAdminDto.uniqueName) &&
            Objects.equals(this.name, processTypeDetailsAdminDto.name) &&
            Objects.equals(this.runModule, processTypeDetailsAdminDto.runModule);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(allowedSubObjectTypeIds, categoryIds, defaultSubObjectTypeId, description, forSubObjectsOnly, groups, id, mediaGuid, respectRestrictionByOrgUnits, subObjectCanBeAddedManually, technicalName, topicId, uniqueName, name, runModule);
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessTypeDetailsAdminDto {\n");
    sb.append("    allowedSubObjectTypeIds: ").append(toIndentedString(allowedSubObjectTypeIds)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
    sb.append("    defaultSubObjectTypeId: ").append(toIndentedString(defaultSubObjectTypeId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    forSubObjectsOnly: ").append(toIndentedString(forSubObjectsOnly)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaGuid: ").append(toIndentedString(mediaGuid)).append("\n");
    sb.append("    respectRestrictionByOrgUnits: ").append(toIndentedString(respectRestrictionByOrgUnits)).append("\n");
    sb.append("    subObjectCanBeAddedManually: ").append(toIndentedString(subObjectCanBeAddedManually)).append("\n");
    sb.append("    technicalName: ").append(toIndentedString(technicalName)).append("\n");
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
    sb.append("    uniqueName: ").append(toIndentedString(uniqueName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    runModule: ").append(toIndentedString(runModule)).append("\n");
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
