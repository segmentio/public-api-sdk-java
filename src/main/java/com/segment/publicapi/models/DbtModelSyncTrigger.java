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

/** Defines the dbt Model Sync Trigger. */
public class DbtModelSyncTrigger {
    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";

    @SerializedName(SERIALIZED_NAME_SOURCE_ID)
    private String sourceId;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    private String status;

    public DbtModelSyncTrigger() {}

    public DbtModelSyncTrigger id(String id) {

        this.id = id;
        return this;
    }

    /**
     * The id of the dbt model sync.
     *
     * @return id
     */
    @javax.annotation.Nonnull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DbtModelSyncTrigger sourceId(String sourceId) {

        this.sourceId = sourceId;
        return this;
    }

    /**
     * The Source id that was triggered.
     *
     * @return sourceId
     */
    @javax.annotation.Nullable
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public DbtModelSyncTrigger status(String status) {

        this.status = status;
        return this;
    }

    /**
     * The status of the trigger.
     *
     * @return status
     */
    @javax.annotation.Nonnull
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DbtModelSyncTrigger dbtModelSyncTrigger = (DbtModelSyncTrigger) o;
        return Objects.equals(this.id, dbtModelSyncTrigger.id)
                && Objects.equals(this.sourceId, dbtModelSyncTrigger.sourceId)
                && Objects.equals(this.status, dbtModelSyncTrigger.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sourceId, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DbtModelSyncTrigger {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
        openapiFields.add("id");
        openapiFields.add("sourceId");
        openapiFields.add("status");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("status");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to DbtModelSyncTrigger
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DbtModelSyncTrigger.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DbtModelSyncTrigger is not found in"
                                        + " the empty JSON string",
                                DbtModelSyncTrigger.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!DbtModelSyncTrigger.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `DbtModelSyncTrigger` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : DbtModelSyncTrigger.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
        }
        if ((jsonObj.get("sourceId") != null && !jsonObj.get("sourceId").isJsonNull())
                && !jsonObj.get("sourceId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `sourceId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("sourceId").toString()));
        }
        if (!jsonObj.get("status").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `status` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("status").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DbtModelSyncTrigger.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DbtModelSyncTrigger' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DbtModelSyncTrigger> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(DbtModelSyncTrigger.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DbtModelSyncTrigger>() {
                        @Override
                        public void write(JsonWriter out, DbtModelSyncTrigger value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DbtModelSyncTrigger read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DbtModelSyncTrigger given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DbtModelSyncTrigger
     * @throws IOException if the JSON string is invalid with respect to DbtModelSyncTrigger
     */
    public static DbtModelSyncTrigger fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DbtModelSyncTrigger.class);
    }

    /**
     * Convert an instance of DbtModelSyncTrigger to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
