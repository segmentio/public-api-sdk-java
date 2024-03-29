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
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.segment.publicapi.JSON;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** Represents a notice within a sync for a Source and Warehouse pair. */
public class SyncNoticeV1 {
    public static final String SERIALIZED_NAME_LEVEL = "level";

    @SerializedName(SERIALIZED_NAME_LEVEL)
    private String level;

    public static final String SERIALIZED_NAME_MESSAGE = "message";

    @SerializedName(SERIALIZED_NAME_MESSAGE)
    private String message;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;

    public SyncNoticeV1() {}

    public SyncNoticeV1 level(String level) {

        this.level = level;
        return this;
    }

    /**
     * The severity of the notice.
     *
     * @return level
     */
    @javax.annotation.Nonnull
    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public SyncNoticeV1 message(String message) {

        this.message = message;
        return this;
    }

    /**
     * The human-readable message that describes the notice.
     *
     * @return message
     */
    @javax.annotation.Nonnull
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public SyncNoticeV1 createdAt(String createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * The timestamp of this sync notice&#39;s creation.
     *
     * @return createdAt
     */
    @javax.annotation.Nonnull
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SyncNoticeV1 syncNoticeV1 = (SyncNoticeV1) o;
        return Objects.equals(this.level, syncNoticeV1.level)
                && Objects.equals(this.message, syncNoticeV1.message)
                && Objects.equals(this.createdAt, syncNoticeV1.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(level, message, createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SyncNoticeV1 {\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
        openapiFields.add("level");
        openapiFields.add("message");
        openapiFields.add("createdAt");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("level");
        openapiRequiredFields.add("message");
        openapiRequiredFields.add("createdAt");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SyncNoticeV1
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SyncNoticeV1.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SyncNoticeV1 is not found in the empty"
                                        + " JSON string",
                                SyncNoticeV1.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SyncNoticeV1.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SyncNoticeV1` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : SyncNoticeV1.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("level").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `level` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("level").toString()));
        }
        if (!jsonObj.get("message").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `message` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("message").toString()));
        }
        if (!jsonObj.get("createdAt").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `createdAt` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("createdAt").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SyncNoticeV1.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SyncNoticeV1' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SyncNoticeV1> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SyncNoticeV1.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SyncNoticeV1>() {
                        @Override
                        public void write(JsonWriter out, SyncNoticeV1 value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SyncNoticeV1 read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SyncNoticeV1 given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SyncNoticeV1
     * @throws IOException if the JSON string is invalid with respect to SyncNoticeV1
     */
    public static SyncNoticeV1 fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SyncNoticeV1.class);
    }

    /**
     * Convert an instance of SyncNoticeV1 to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
