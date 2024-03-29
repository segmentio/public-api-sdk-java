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

/** Returns a newly created Source. */
public class CreateSourceV1Output {
    public static final String SERIALIZED_NAME_SOURCE = "source";

    @SerializedName(SERIALIZED_NAME_SOURCE)
    private SourceV1 source;

    public CreateSourceV1Output() {}

    public CreateSourceV1Output source(SourceV1 source) {

        this.source = source;
        return this;
    }

    /**
     * Get source
     *
     * @return source
     */
    @javax.annotation.Nonnull
    public SourceV1 getSource() {
        return source;
    }

    public void setSource(SourceV1 source) {
        this.source = source;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSourceV1Output createSourceV1Output = (CreateSourceV1Output) o;
        return Objects.equals(this.source, createSourceV1Output.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSourceV1Output {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
        openapiFields.add("source");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("source");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to CreateSourceV1Output
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CreateSourceV1Output.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateSourceV1Output is not found in"
                                        + " the empty JSON string",
                                CreateSourceV1Output.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CreateSourceV1Output.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateSourceV1Output` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateSourceV1Output.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the required field `source`
        SourceV1.validateJsonElement(jsonObj.get("source"));
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateSourceV1Output.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateSourceV1Output' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateSourceV1Output> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(CreateSourceV1Output.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateSourceV1Output>() {
                        @Override
                        public void write(JsonWriter out, CreateSourceV1Output value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateSourceV1Output read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateSourceV1Output given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateSourceV1Output
     * @throws IOException if the JSON string is invalid with respect to CreateSourceV1Output
     */
    public static CreateSourceV1Output fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateSourceV1Output.class);
    }

    /**
     * Convert an instance of CreateSourceV1Output to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
