/*
 * Segment Public API
 * The Segment Public API helps you manage your Segment Workspaces and its resources. You can use the API to perform CRUD (create, read, update, delete) operations at no extra charge. This includes working with resources such as Sources, Destinations, Warehouses, Tracking Plans, and the Segment Destinations and Sources Catalogs.  All CRUD endpoints in the API follow REST conventions and use standard HTTP methods. Different URL endpoints represent different resources in a Workspace.  See the next sections for more information on how to use the Segment Public API.
 *
 * Contact: friends@segment.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.segment.publicapi.models;


import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.segment.publicapi.JSON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** Creates an insert Function instance. */
@ApiModel(description = "Creates an insert Function instance.")
public class CreateInsertFunctionInstanceAlphaInput {
    public static final String SERIALIZED_NAME_FUNCTION_ID = "functionId";

    @SerializedName(SERIALIZED_NAME_FUNCTION_ID)
    private String functionId;

    public static final String SERIALIZED_NAME_INTEGRATION_ID = "integrationId";

    @SerializedName(SERIALIZED_NAME_INTEGRATION_ID)
    private String integrationId;

    /** The insert Function type. */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        INSERT_FUNCTION_DESTINATION("INSERT_FUNCTION_DESTINATION");

        private String value;

        TypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<TypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final TypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public TypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return TypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private TypeEnum type;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_SETTINGS = "settings";

    @SerializedName(SERIALIZED_NAME_SETTINGS)
    private Map<String, Object> settings = new HashMap<>();

    public CreateInsertFunctionInstanceAlphaInput() {}

    public CreateInsertFunctionInstanceAlphaInput functionId(String functionId) {

        this.functionId = functionId;
        return this;
    }

    /**
     * Insert Function id to which this instance is associated.
     *
     * @return functionId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            required = true,
            value = "Insert Function id to which this instance is associated.")
    public String getFunctionId() {
        return functionId;
    }

    public void setFunctionId(String functionId) {
        this.functionId = functionId;
    }

    public CreateInsertFunctionInstanceAlphaInput integrationId(String integrationId) {

        this.integrationId = integrationId;
        return this;
    }

    /**
     * The Source or Destination id to be connected.
     *
     * @return integrationId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "The Source or Destination id to be connected.")
    public String getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(String integrationId) {
        this.integrationId = integrationId;
    }

    public CreateInsertFunctionInstanceAlphaInput type(TypeEnum type) {

        this.type = type;
        return this;
    }

    /**
     * The insert Function type.
     *
     * @return type
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "The insert Function type.")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateInsertFunctionInstanceAlphaInput enabled(Boolean enabled) {

        this.enabled = enabled;
        return this;
    }

    /**
     * Whether this insert Function instance should be enabled for the Destination.
     *
     * @return enabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(
            value = "Whether this insert Function instance should be enabled for the Destination.")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CreateInsertFunctionInstanceAlphaInput name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Defines the display name of the insert Function instance.
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            required = true,
            value = "Defines the display name of the insert Function instance.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateInsertFunctionInstanceAlphaInput settings(Map<String, Object> settings) {

        this.settings = settings;
        return this;
    }

    public CreateInsertFunctionInstanceAlphaInput putSettingsItem(String key, Object settingsItem) {
        this.settings.put(key, settingsItem);
        return this;
    }

    /**
     * An object that contains settings for this insert Function instance based on the settings
     * present in the insert Function class.
     *
     * @return settings
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            required = true,
            value =
                    "An object that contains settings for this insert Function instance based on"
                            + " the settings present in the insert Function class.")
    public Map<String, Object> getSettings() {
        return settings;
    }

    public void setSettings(Map<String, Object> settings) {
        this.settings = settings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateInsertFunctionInstanceAlphaInput createInsertFunctionInstanceAlphaInput =
                (CreateInsertFunctionInstanceAlphaInput) o;
        return Objects.equals(this.functionId, createInsertFunctionInstanceAlphaInput.functionId)
                && Objects.equals(
                        this.integrationId, createInsertFunctionInstanceAlphaInput.integrationId)
                && Objects.equals(this.type, createInsertFunctionInstanceAlphaInput.type)
                && Objects.equals(this.enabled, createInsertFunctionInstanceAlphaInput.enabled)
                && Objects.equals(this.name, createInsertFunctionInstanceAlphaInput.name)
                && Objects.equals(this.settings, createInsertFunctionInstanceAlphaInput.settings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(functionId, integrationId, type, enabled, name, settings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInsertFunctionInstanceAlphaInput {\n");
        sb.append("    functionId: ").append(toIndentedString(functionId)).append("\n");
        sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("functionId");
        openapiFields.add("integrationId");
        openapiFields.add("type");
        openapiFields.add("enabled");
        openapiFields.add("name");
        openapiFields.add("settings");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("functionId");
        openapiRequiredFields.add("integrationId");
        openapiRequiredFields.add("type");
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("settings");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to
     *     CreateInsertFunctionInstanceAlphaInput
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CreateInsertFunctionInstanceAlphaInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateInsertFunctionInstanceAlphaInput"
                                        + " is not found in the empty JSON string",
                                CreateInsertFunctionInstanceAlphaInput.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CreateInsertFunctionInstanceAlphaInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `CreateInsertFunctionInstanceAlphaInput` properties. JSON:"
                                    + " %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateInsertFunctionInstanceAlphaInput.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if (!jsonObj.get("functionId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `functionId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("functionId").toString()));
        }
        if (!jsonObj.get("integrationId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `integrationId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("integrationId").toString()));
        }
        if (!jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateInsertFunctionInstanceAlphaInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateInsertFunctionInstanceAlphaInput'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateInsertFunctionInstanceAlphaInput> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(CreateInsertFunctionInstanceAlphaInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateInsertFunctionInstanceAlphaInput>() {
                        @Override
                        public void write(
                                JsonWriter out, CreateInsertFunctionInstanceAlphaInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateInsertFunctionInstanceAlphaInput read(JsonReader in)
                                throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateInsertFunctionInstanceAlphaInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateInsertFunctionInstanceAlphaInput
     * @throws IOException if the JSON string is invalid with respect to
     *     CreateInsertFunctionInstanceAlphaInput
     */
    public static CreateInsertFunctionInstanceAlphaInput fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateInsertFunctionInstanceAlphaInput.class);
    }

    /**
     * Convert an instance of CreateInsertFunctionInstanceAlphaInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}