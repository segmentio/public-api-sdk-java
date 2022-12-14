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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** Returns the Source catalog item looked up by id. */
@ApiModel(description = "Returns the Source catalog item looked up by id.")
public class GetSourceMetadataV1Output {
    public static final String SERIALIZED_NAME_SOURCE_METADATA = "sourceMetadata";

    @SerializedName(SERIALIZED_NAME_SOURCE_METADATA)
    private SourceMetadata sourceMetadata;

    public GetSourceMetadataV1Output() {}

    public GetSourceMetadataV1Output sourceMetadata(SourceMetadata sourceMetadata) {

        this.sourceMetadata = sourceMetadata;
        return this;
    }

    /**
     * Get sourceMetadata
     *
     * @return sourceMetadata
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public SourceMetadata getSourceMetadata() {
        return sourceMetadata;
    }

    public void setSourceMetadata(SourceMetadata sourceMetadata) {
        this.sourceMetadata = sourceMetadata;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetSourceMetadataV1Output getSourceMetadataV1Output = (GetSourceMetadataV1Output) o;
        return Objects.equals(this.sourceMetadata, getSourceMetadataV1Output.sourceMetadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceMetadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSourceMetadataV1Output {\n");
        sb.append("    sourceMetadata: ").append(toIndentedString(sourceMetadata)).append("\n");
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
        openapiFields.add("sourceMetadata");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("sourceMetadata");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to GetSourceMetadataV1Output
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!GetSourceMetadataV1Output.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in GetSourceMetadataV1Output is not found"
                                        + " in the empty JSON string",
                                GetSourceMetadataV1Output.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!GetSourceMetadataV1Output.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `GetSourceMetadataV1Output` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : GetSourceMetadataV1Output.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetSourceMetadataV1Output.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetSourceMetadataV1Output' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetSourceMetadataV1Output> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(GetSourceMetadataV1Output.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GetSourceMetadataV1Output>() {
                        @Override
                        public void write(JsonWriter out, GetSourceMetadataV1Output value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GetSourceMetadataV1Output read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GetSourceMetadataV1Output given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetSourceMetadataV1Output
     * @throws IOException if the JSON string is invalid with respect to GetSourceMetadataV1Output
     */
    public static GetSourceMetadataV1Output fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetSourceMetadataV1Output.class);
    }

    /**
     * Convert an instance of GetSourceMetadataV1Output to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
