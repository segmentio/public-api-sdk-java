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

/** DeleteInsertFunctionInstance200Response */
public class DeleteInsertFunctionInstance200Response {
    public static final String SERIALIZED_NAME_DATA = "data";

    @SerializedName(SERIALIZED_NAME_DATA)
    private DeleteInsertFunctionInstanceAlphaOutput data;

    public DeleteInsertFunctionInstance200Response() {}

    public DeleteInsertFunctionInstance200Response data(
            DeleteInsertFunctionInstanceAlphaOutput data) {

        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @javax.annotation.Nullable
    public DeleteInsertFunctionInstanceAlphaOutput getData() {
        return data;
    }

    public void setData(DeleteInsertFunctionInstanceAlphaOutput data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteInsertFunctionInstance200Response deleteInsertFunctionInstance200Response =
                (DeleteInsertFunctionInstance200Response) o;
        return Objects.equals(this.data, deleteInsertFunctionInstance200Response.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteInsertFunctionInstance200Response {\n");
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
        openapiFields.add("data");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     DeleteInsertFunctionInstance200Response
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DeleteInsertFunctionInstance200Response.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " DeleteInsertFunctionInstance200Response is not found in the"
                                    + " empty JSON string",
                                DeleteInsertFunctionInstance200Response.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!DeleteInsertFunctionInstance200Response.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `DeleteInsertFunctionInstance200Response` properties. JSON:"
                                    + " %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the optional field `data`
        if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
            DeleteInsertFunctionInstanceAlphaOutput.validateJsonElement(jsonObj.get("data"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DeleteInsertFunctionInstance200Response.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes 'DeleteInsertFunctionInstance200Response'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DeleteInsertFunctionInstance200Response> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(DeleteInsertFunctionInstance200Response.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DeleteInsertFunctionInstance200Response>() {
                        @Override
                        public void write(
                                JsonWriter out, DeleteInsertFunctionInstance200Response value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DeleteInsertFunctionInstance200Response read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DeleteInsertFunctionInstance200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DeleteInsertFunctionInstance200Response
     * @throws IOException if the JSON string is invalid with respect to
     *     DeleteInsertFunctionInstance200Response
     */
    public static DeleteInsertFunctionInstance200Response fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, DeleteInsertFunctionInstance200Response.class);
    }

    /**
     * Convert an instance of DeleteInsertFunctionInstance200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
