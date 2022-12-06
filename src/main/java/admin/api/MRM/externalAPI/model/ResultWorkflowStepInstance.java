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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 *
 */
@JsonAdapter(ResultWorkflowStepInstance.Adapter.class)
public enum ResultWorkflowStepInstance
{

  REASSIGNED("REASSIGNED"),

  NOT_PROCESSED("NOT_PROCESSED"),

  GRANTED("GRANTED"),

  REJECTED("REJECTED"),

  AWAITING_PICKUP("AWAITING_PICKUP");

  private String value;

  ResultWorkflowStepInstance(String value)
  {
    this.value = value;
  }

  public String getValue()
  {
    return value;
  }

  @Override
  public String toString()
  {
    return String.valueOf(value);
  }

  public static ResultWorkflowStepInstance fromValue(String value)
  {
    for (ResultWorkflowStepInstance b : ResultWorkflowStepInstance.values())
    {
      if (b.value.equals(value))
      {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ResultWorkflowStepInstance>
  {
    @Override
    public void write(final JsonWriter jsonWriter, final ResultWorkflowStepInstance enumeration) throws IOException
    {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ResultWorkflowStepInstance read(final JsonReader jsonReader) throws IOException
    {
      String value = jsonReader.nextString();
      return ResultWorkflowStepInstance.fromValue(value);
    }
  }
}

