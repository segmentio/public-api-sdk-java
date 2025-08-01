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
import com.google.gson.JsonArray;
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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** Output for listing all activations. */
public class ListActivationsAlphaOutput {
    public static final String SERIALIZED_NAME_ACTIVATIONS = "activations";

    @SerializedName(SERIALIZED_NAME_ACTIVATIONS)
    private List<ActivationSummaryOutput> activations = new ArrayList<>();

    public static final String SERIALIZED_NAME_PAGINATION = "pagination";

    @SerializedName(SERIALIZED_NAME_PAGINATION)
    private PaginationOutput pagination;

    public ListActivationsAlphaOutput() {}

    public ListActivationsAlphaOutput activations(List<ActivationSummaryOutput> activations) {

        this.activations = activations;
        return this;
    }

    public ListActivationsAlphaOutput addActivationsItem(ActivationSummaryOutput activationsItem) {
        if (this.activations == null) {
            this.activations = new ArrayList<>();
        }
        this.activations.add(activationsItem);
        return this;
    }

    /**
     * A list of activation results.
     *
     * @return activations
     */
    @javax.annotation.Nonnull
    public List<ActivationSummaryOutput> getActivations() {
        return activations;
    }

    public void setActivations(List<ActivationSummaryOutput> activations) {
        this.activations = activations;
    }

    public ListActivationsAlphaOutput pagination(PaginationOutput pagination) {

        this.pagination = pagination;
        return this;
    }

    /**
     * Get pagination
     *
     * @return pagination
     */
    @javax.annotation.Nullable
    public PaginationOutput getPagination() {
        return pagination;
    }

    public void setPagination(PaginationOutput pagination) {
        this.pagination = pagination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListActivationsAlphaOutput listActivationsAlphaOutput = (ListActivationsAlphaOutput) o;
        return Objects.equals(this.activations, listActivationsAlphaOutput.activations)
                && Objects.equals(this.pagination, listActivationsAlphaOutput.pagination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(activations, pagination);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListActivationsAlphaOutput {\n");
        sb.append("    activations: ").append(toIndentedString(activations)).append("\n");
        sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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
        openapiFields.add("activations");
        openapiFields.add("pagination");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("activations");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ListActivationsAlphaOutput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ListActivationsAlphaOutput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ListActivationsAlphaOutput is not"
                                        + " found in the empty JSON string",
                                ListActivationsAlphaOutput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ListActivationsAlphaOutput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ListActivationsAlphaOutput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ListActivationsAlphaOutput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the json data is an array
        if (!jsonObj.get("activations").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `activations` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("activations").toString()));
        }

        JsonArray jsonArrayactivations = jsonObj.getAsJsonArray("activations");
        // validate the required field `activations` (array)
        for (int i = 0; i < jsonArrayactivations.size(); i++) {
            ActivationSummaryOutput.validateJsonElement(jsonArrayactivations.get(i));
        }
        ;
        // validate the optional field `pagination`
        if (jsonObj.get("pagination") != null && !jsonObj.get("pagination").isJsonNull()) {
            PaginationOutput.validateJsonElement(jsonObj.get("pagination"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ListActivationsAlphaOutput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ListActivationsAlphaOutput' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ListActivationsAlphaOutput> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ListActivationsAlphaOutput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ListActivationsAlphaOutput>() {
                        @Override
                        public void write(JsonWriter out, ListActivationsAlphaOutput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ListActivationsAlphaOutput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ListActivationsAlphaOutput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ListActivationsAlphaOutput
     * @throws IOException if the JSON string is invalid with respect to ListActivationsAlphaOutput
     */
    public static ListActivationsAlphaOutput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ListActivationsAlphaOutput.class);
    }

    /**
     * Convert an instance of ListActivationsAlphaOutput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
