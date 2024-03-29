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

/** Returns a Source. */
public class GetSourceAlphaOutput {
    public static final String SERIALIZED_NAME_SOURCE = "source";

    @SerializedName(SERIALIZED_NAME_SOURCE)
    private SourceAlpha source;

    public static final String SERIALIZED_NAME_TRACKING_PLAN_ID = "trackingPlanId";

    @SerializedName(SERIALIZED_NAME_TRACKING_PLAN_ID)
    private String trackingPlanId;

    public GetSourceAlphaOutput() {}

    public GetSourceAlphaOutput source(SourceAlpha source) {

        this.source = source;
        return this;
    }

    /**
     * Get source
     *
     * @return source
     */
    @javax.annotation.Nonnull
    public SourceAlpha getSource() {
        return source;
    }

    public void setSource(SourceAlpha source) {
        this.source = source;
    }

    public GetSourceAlphaOutput trackingPlanId(String trackingPlanId) {

        this.trackingPlanId = trackingPlanId;
        return this;
    }

    /**
     * The id of the Tracking Plan connected to the Source.
     *
     * @return trackingPlanId
     */
    @javax.annotation.Nullable
    public String getTrackingPlanId() {
        return trackingPlanId;
    }

    public void setTrackingPlanId(String trackingPlanId) {
        this.trackingPlanId = trackingPlanId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetSourceAlphaOutput getSourceAlphaOutput = (GetSourceAlphaOutput) o;
        return Objects.equals(this.source, getSourceAlphaOutput.source)
                && Objects.equals(this.trackingPlanId, getSourceAlphaOutput.trackingPlanId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, trackingPlanId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetSourceAlphaOutput {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    trackingPlanId: ").append(toIndentedString(trackingPlanId)).append("\n");
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
        openapiFields.add("trackingPlanId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("source");
        openapiRequiredFields.add("trackingPlanId");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to GetSourceAlphaOutput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetSourceAlphaOutput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in GetSourceAlphaOutput is not found in"
                                        + " the empty JSON string",
                                GetSourceAlphaOutput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!GetSourceAlphaOutput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `GetSourceAlphaOutput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : GetSourceAlphaOutput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the required field `source`
        SourceAlpha.validateJsonElement(jsonObj.get("source"));
        if ((jsonObj.get("trackingPlanId") != null && !jsonObj.get("trackingPlanId").isJsonNull())
                && !jsonObj.get("trackingPlanId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `trackingPlanId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("trackingPlanId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetSourceAlphaOutput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetSourceAlphaOutput' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetSourceAlphaOutput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(GetSourceAlphaOutput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GetSourceAlphaOutput>() {
                        @Override
                        public void write(JsonWriter out, GetSourceAlphaOutput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GetSourceAlphaOutput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GetSourceAlphaOutput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetSourceAlphaOutput
     * @throws IOException if the JSON string is invalid with respect to GetSourceAlphaOutput
     */
    public static GetSourceAlphaOutput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetSourceAlphaOutput.class);
    }

    /**
     * Convert an instance of GetSourceAlphaOutput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
