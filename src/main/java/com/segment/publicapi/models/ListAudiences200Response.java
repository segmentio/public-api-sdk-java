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
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** ListAudiences200Response */
public class ListAudiences200Response {
    public static final String SERIALIZED_NAME_DATA = "data";

    @SerializedName(SERIALIZED_NAME_DATA)
    private ListAudiencesAlphaOutput data;

    public ListAudiences200Response() {}

    public ListAudiences200Response data(ListAudiencesAlphaOutput data) {

        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")
    public ListAudiencesAlphaOutput getData() {
        return data;
    }

    public void setData(ListAudiencesAlphaOutput data) {
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
        ListAudiences200Response listAudiences200Response = (ListAudiences200Response) o;
        return Objects.equals(this.data, listAudiences200Response.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAudiences200Response {\n");
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
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to ListAudiences200Response
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!ListAudiences200Response.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ListAudiences200Response is not found"
                                        + " in the empty JSON string",
                                ListAudiences200Response.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!ListAudiences200Response.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ListAudiences200Response` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ListAudiences200Response.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ListAudiences200Response' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ListAudiences200Response> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ListAudiences200Response.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ListAudiences200Response>() {
                        @Override
                        public void write(JsonWriter out, ListAudiences200Response value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ListAudiences200Response read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ListAudiences200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ListAudiences200Response
     * @throws IOException if the JSON string is invalid with respect to ListAudiences200Response
     */
    public static ListAudiences200Response fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ListAudiences200Response.class);
    }

    /**
     * Convert an instance of ListAudiences200Response to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}