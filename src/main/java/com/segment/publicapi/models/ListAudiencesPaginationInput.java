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
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * Fork of Autobahn&#39;s PaginationInput. Count is limited to 200 in this fork. Pagination
 * parameters. Every resource that returns a list of items in its &#x60;Output&#x60; object may
 * contain a &#x60;PaginationInput&#x60; in its &#x60;Input&#x60; object. Required, though some of
 * its fields are optional.
 */
public class ListAudiencesPaginationInput {
    public static final String SERIALIZED_NAME_CURSOR = "cursor";

    @SerializedName(SERIALIZED_NAME_CURSOR)
    private String cursor;

    public static final String SERIALIZED_NAME_COUNT = "count";

    @SerializedName(SERIALIZED_NAME_COUNT)
    private BigDecimal count;

    public ListAudiencesPaginationInput() {}

    public ListAudiencesPaginationInput cursor(String cursor) {

        this.cursor = cursor;
        return this;
    }

    /**
     * The page to request. Acceptable values to use here are in PaginationOutput objects, in the
     * &#x60;current&#x60;, &#x60;next&#x60;, and &#x60;previous&#x60; keys. Consumers of the API
     * must treat this value as opaque.
     *
     * @return cursor
     */
    @javax.annotation.Nullable
    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public ListAudiencesPaginationInput count(BigDecimal count) {

        this.count = count;
        return this;
    }

    /**
     * The number of items to retrieve in a page, between 1 and 200.
     *
     * @return count
     */
    @javax.annotation.Nonnull
    public BigDecimal getCount() {
        return count;
    }

    public void setCount(BigDecimal count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAudiencesPaginationInput listAudiencesPaginationInput =
                (ListAudiencesPaginationInput) o;
        return Objects.equals(this.cursor, listAudiencesPaginationInput.cursor)
                && Objects.equals(this.count, listAudiencesPaginationInput.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cursor, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAudiencesPaginationInput {\n");
        sb.append("    cursor: ").append(toIndentedString(cursor)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
        openapiFields.add("cursor");
        openapiFields.add("count");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("count");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ListAudiencesPaginationInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ListAudiencesPaginationInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ListAudiencesPaginationInput is not"
                                        + " found in the empty JSON string",
                                ListAudiencesPaginationInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ListAudiencesPaginationInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ListAudiencesPaginationInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : ListAudiencesPaginationInput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("cursor") != null && !jsonObj.get("cursor").isJsonNull())
                && !jsonObj.get("cursor").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `cursor` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("cursor").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ListAudiencesPaginationInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ListAudiencesPaginationInput' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ListAudiencesPaginationInput> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ListAudiencesPaginationInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ListAudiencesPaginationInput>() {
                        @Override
                        public void write(JsonWriter out, ListAudiencesPaginationInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ListAudiencesPaginationInput read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ListAudiencesPaginationInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ListAudiencesPaginationInput
     * @throws IOException if the JSON string is invalid with respect to
     *     ListAudiencesPaginationInput
     */
    public static ListAudiencesPaginationInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ListAudiencesPaginationInput.class);
    }

    /**
     * Convert an instance of ListAudiencesPaginationInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
