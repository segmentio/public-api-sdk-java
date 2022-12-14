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

/** Input for CreateEdgeFunctions. */
@ApiModel(description = "Input for CreateEdgeFunctions.")
public class CreateEdgeFunctionsAlphaInput {
    public static final String SERIALIZED_NAME_UPLOAD_U_R_L = "uploadURL";

    @SerializedName(SERIALIZED_NAME_UPLOAD_U_R_L)
    private String uploadURL;

    public CreateEdgeFunctionsAlphaInput() {}

    public CreateEdgeFunctionsAlphaInput uploadURL(String uploadURL) {

        this.uploadURL = uploadURL;
        return this;
    }

    /**
     * The id of the Source associated with this Edge Function.
     *
     * @return uploadURL
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            required = true,
            value = "The id of the Source associated with this Edge Function.")
    public String getUploadURL() {
        return uploadURL;
    }

    public void setUploadURL(String uploadURL) {
        this.uploadURL = uploadURL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEdgeFunctionsAlphaInput createEdgeFunctionsAlphaInput =
                (CreateEdgeFunctionsAlphaInput) o;
        return Objects.equals(this.uploadURL, createEdgeFunctionsAlphaInput.uploadURL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uploadURL);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEdgeFunctionsAlphaInput {\n");
        sb.append("    uploadURL: ").append(toIndentedString(uploadURL)).append("\n");
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
        openapiFields.add("uploadURL");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("uploadURL");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to
     *     CreateEdgeFunctionsAlphaInput
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!CreateEdgeFunctionsAlphaInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateEdgeFunctionsAlphaInput is not"
                                        + " found in the empty JSON string",
                                CreateEdgeFunctionsAlphaInput.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!CreateEdgeFunctionsAlphaInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateEdgeFunctionsAlphaInput` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateEdgeFunctionsAlphaInput.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if (!jsonObj.get("uploadURL").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `uploadURL` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("uploadURL").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateEdgeFunctionsAlphaInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateEdgeFunctionsAlphaInput' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateEdgeFunctionsAlphaInput> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(CreateEdgeFunctionsAlphaInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateEdgeFunctionsAlphaInput>() {
                        @Override
                        public void write(JsonWriter out, CreateEdgeFunctionsAlphaInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateEdgeFunctionsAlphaInput read(JsonReader in)
                                throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateEdgeFunctionsAlphaInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateEdgeFunctionsAlphaInput
     * @throws IOException if the JSON string is invalid with respect to
     *     CreateEdgeFunctionsAlphaInput
     */
    public static CreateEdgeFunctionsAlphaInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateEdgeFunctionsAlphaInput.class);
    }

    /**
     * Convert an instance of CreateEdgeFunctionsAlphaInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
