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

/** Returns all available labels for the current Workspace. */
public class ListLabelsV1Output {
    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<LabelV1> labels = new ArrayList<>();

    public ListLabelsV1Output() {}

    public ListLabelsV1Output labels(List<LabelV1> labels) {

        this.labels = labels;
        return this;
    }

    public ListLabelsV1Output addLabelsItem(LabelV1 labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * All labels associated with the current Workspace.
     *
     * @return labels
     */
    @javax.annotation.Nonnull
    public List<LabelV1> getLabels() {
        return labels;
    }

    public void setLabels(List<LabelV1> labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLabelsV1Output listLabelsV1Output = (ListLabelsV1Output) o;
        return Objects.equals(this.labels, listLabelsV1Output.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLabelsV1Output {\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
        openapiFields.add("labels");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("labels");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ListLabelsV1Output
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ListLabelsV1Output.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ListLabelsV1Output is not found in the"
                                        + " empty JSON string",
                                ListLabelsV1Output.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ListLabelsV1Output.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ListLabelsV1Output` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ListLabelsV1Output.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the json data is an array
        if (!jsonObj.get("labels").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `labels` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("labels").toString()));
        }

        JsonArray jsonArraylabels = jsonObj.getAsJsonArray("labels");
        // validate the required field `labels` (array)
        for (int i = 0; i < jsonArraylabels.size(); i++) {
            LabelV1.validateJsonElement(jsonArraylabels.get(i));
        }
        ;
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ListLabelsV1Output.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ListLabelsV1Output' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ListLabelsV1Output> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ListLabelsV1Output.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ListLabelsV1Output>() {
                        @Override
                        public void write(JsonWriter out, ListLabelsV1Output value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ListLabelsV1Output read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ListLabelsV1Output given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ListLabelsV1Output
     * @throws IOException if the JSON string is invalid with respect to ListLabelsV1Output
     */
    public static ListLabelsV1Output fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ListLabelsV1Output.class);
    }

    /**
     * Convert an instance of ListLabelsV1Output to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
