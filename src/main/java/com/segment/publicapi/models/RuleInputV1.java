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
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** Represents a rule to add to a Tracking Plan. */
@ApiModel(description = "Represents a rule to add to a Tracking Plan.")
public class RuleInputV1 {
    /** The type for this Tracking Plan rule. */
    @JsonAdapter(TypeEnum.Adapter.class)
    public enum TypeEnum {
        COMMON("COMMON"),

        GROUP("GROUP"),

        IDENTIFY("IDENTIFY"),

        PAGE("PAGE"),

        SCREEN("SCREEN"),

        TRACK("TRACK");

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

    public static final String SERIALIZED_NAME_KEY = "key";

    @SerializedName(SERIALIZED_NAME_KEY)
    private String key;

    public static final String SERIALIZED_NAME_JSON_SCHEMA = "jsonSchema";

    @SerializedName(SERIALIZED_NAME_JSON_SCHEMA)
    private Object jsonSchema = null;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private BigDecimal version;

    public RuleInputV1() {}

    public RuleInputV1 type(TypeEnum type) {

        this.type = type;
        return this;
    }

    /**
     * The type for this Tracking Plan rule.
     *
     * @return type
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "The type for this Tracking Plan rule.")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public RuleInputV1 key(String key) {

        this.key = key;
        return this;
    }

    /**
     * Key to this rule (free-form string like &#39;Button clicked&#39;).
     *
     * @return key
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Key to this rule (free-form string like 'Button clicked').")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public RuleInputV1 jsonSchema(Object jsonSchema) {

        this.jsonSchema = jsonSchema;
        return this;
    }

    /**
     * JSON Schema of this rule.
     *
     * @return jsonSchema
     */
    @javax.annotation.Nullable
    @ApiModelProperty(required = true, value = "JSON Schema of this rule.")
    public Object getJsonSchema() {
        return jsonSchema;
    }

    public void setJsonSchema(Object jsonSchema) {
        this.jsonSchema = jsonSchema;
    }

    public RuleInputV1 version(BigDecimal version) {

        this.version = version;
        return this;
    }

    /**
     * Version of this rule.
     *
     * @return version
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Version of this rule.")
    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleInputV1 ruleInputV1 = (RuleInputV1) o;
        return Objects.equals(this.type, ruleInputV1.type)
                && Objects.equals(this.key, ruleInputV1.key)
                && Objects.equals(this.jsonSchema, ruleInputV1.jsonSchema)
                && Objects.equals(this.version, ruleInputV1.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, key, jsonSchema, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleInputV1 {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    jsonSchema: ").append(toIndentedString(jsonSchema)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
        openapiFields.add("type");
        openapiFields.add("key");
        openapiFields.add("jsonSchema");
        openapiFields.add("version");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("type");
        openapiRequiredFields.add("jsonSchema");
        openapiRequiredFields.add("version");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to RuleInputV1
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!RuleInputV1.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in RuleInputV1 is not found in the empty"
                                        + " JSON string",
                                RuleInputV1.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!RuleInputV1.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `RuleInputV1` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : RuleInputV1.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if (!jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
        if ((jsonObj.get("key") != null && !jsonObj.get("key").isJsonNull())
                && !jsonObj.get("key").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `key` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("key").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!RuleInputV1.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'RuleInputV1' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<RuleInputV1> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(RuleInputV1.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<RuleInputV1>() {
                        @Override
                        public void write(JsonWriter out, RuleInputV1 value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public RuleInputV1 read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of RuleInputV1 given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of RuleInputV1
     * @throws IOException if the JSON string is invalid with respect to RuleInputV1
     */
    public static RuleInputV1 fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, RuleInputV1.class);
    }

    /**
     * Convert an instance of RuleInputV1 to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}