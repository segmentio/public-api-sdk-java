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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** PropertyValueTransformationBeta */
public class PropertyValueTransformationBeta {
    public static final String SERIALIZED_NAME_PROPERTY_PATHS = "propertyPaths";

    @SerializedName(SERIALIZED_NAME_PROPERTY_PATHS)
    private List<String> propertyPaths = new ArrayList<>();

    public static final String SERIALIZED_NAME_PROPERTY_VALUE = "propertyValue";

    @SerializedName(SERIALIZED_NAME_PROPERTY_VALUE)
    private String propertyValue;

    public PropertyValueTransformationBeta() {}

    public PropertyValueTransformationBeta propertyPaths(List<String> propertyPaths) {

        this.propertyPaths = propertyPaths;
        return this;
    }

    public PropertyValueTransformationBeta addPropertyPathsItem(String propertyPathsItem) {
        if (this.propertyPaths == null) {
            this.propertyPaths = new ArrayList<>();
        }
        this.propertyPaths.add(propertyPathsItem);
        return this;
    }

    /**
     * The property paths. The maximum number of paths is 10.
     *
     * @return propertyPaths
     */
    @javax.annotation.Nonnull
    public List<String> getPropertyPaths() {
        return propertyPaths;
    }

    public void setPropertyPaths(List<String> propertyPaths) {
        this.propertyPaths = propertyPaths;
    }

    public PropertyValueTransformationBeta propertyValue(String propertyValue) {

        this.propertyValue = propertyValue;
        return this;
    }

    /**
     * The new value of the property paths.
     *
     * @return propertyValue
     */
    @javax.annotation.Nonnull
    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PropertyValueTransformationBeta propertyValueTransformationBeta =
                (PropertyValueTransformationBeta) o;
        return Objects.equals(this.propertyPaths, propertyValueTransformationBeta.propertyPaths)
                && Objects.equals(
                        this.propertyValue, propertyValueTransformationBeta.propertyValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(propertyPaths, propertyValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PropertyValueTransformationBeta {\n");
        sb.append("    propertyPaths: ").append(toIndentedString(propertyPaths)).append("\n");
        sb.append("    propertyValue: ").append(toIndentedString(propertyValue)).append("\n");
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
        openapiFields.add("propertyPaths");
        openapiFields.add("propertyValue");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("propertyPaths");
        openapiRequiredFields.add("propertyValue");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     PropertyValueTransformationBeta
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PropertyValueTransformationBeta.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in PropertyValueTransformationBeta is not"
                                        + " found in the empty JSON string",
                                PropertyValueTransformationBeta.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!PropertyValueTransformationBeta.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `PropertyValueTransformationBeta` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : PropertyValueTransformationBeta.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the required json array is present
        if (jsonObj.get("propertyPaths") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("propertyPaths").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `propertyPaths` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("propertyPaths").toString()));
        }
        if (!jsonObj.get("propertyValue").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `propertyValue` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("propertyValue").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PropertyValueTransformationBeta.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PropertyValueTransformationBeta' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PropertyValueTransformationBeta> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(PropertyValueTransformationBeta.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<PropertyValueTransformationBeta>() {
                        @Override
                        public void write(JsonWriter out, PropertyValueTransformationBeta value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public PropertyValueTransformationBeta read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of PropertyValueTransformationBeta given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PropertyValueTransformationBeta
     * @throws IOException if the JSON string is invalid with respect to
     *     PropertyValueTransformationBeta
     */
    public static PropertyValueTransformationBeta fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PropertyValueTransformationBeta.class);
    }

    /**
     * Convert an instance of PropertyValueTransformationBeta to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
