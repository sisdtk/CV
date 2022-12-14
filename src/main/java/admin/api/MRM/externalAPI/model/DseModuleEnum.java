/*
 * DSE REST INTERNAL API
 * <h2>DSE REST INTERNAL API</h1>
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
 * Gets or Sets DseModuleEnum
 */
@JsonAdapter(DseModuleEnum.Adapter.class)
public enum DseModuleEnum
{

    JOB("JOB"),

    PRODUCT("PRODUCT");

    private String value;

    DseModuleEnum(String value)
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

    public static DseModuleEnum fromValue(String value)
    {
        for (DseModuleEnum b : DseModuleEnum.values())
        {
            if (b.value.equals(value))
            {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DseModuleEnum>
    {
        @Override
        public void write(final JsonWriter jsonWriter, final DseModuleEnum enumeration) throws IOException
        {
            jsonWriter.value(enumeration.getValue());
        }

        @Override
        public DseModuleEnum read(final JsonReader jsonReader) throws IOException
        {
            String value = jsonReader.nextString();
            return DseModuleEnum.fromValue(value);
        }
    }
}

