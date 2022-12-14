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
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** The latest version of Edge Function bundle. */
@ApiModel(description = "The latest version of Edge Function bundle.")
public class EdgeFunctions1 {
    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";

    @SerializedName(SERIALIZED_NAME_SOURCE_ID)
    private String sourceId;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;

    public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";

    @SerializedName(SERIALIZED_NAME_CREATED_BY)
    private String createdBy;

    public static final String SERIALIZED_NAME_DOWNLOAD_U_R_L = "downloadURL";

    @SerializedName(SERIALIZED_NAME_DOWNLOAD_U_R_L)
    private String downloadURL;

    public static final String SERIALIZED_NAME_VERSION = "version";

    @SerializedName(SERIALIZED_NAME_VERSION)
    private BigDecimal version;

    public EdgeFunctions1() {}

    public EdgeFunctions1 id(String id) {

        this.id = id;
        return this;
    }

    /**
     * The Edge Function id.
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "The Edge Function id.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EdgeFunctions1 sourceId(String sourceId) {

        this.sourceId = sourceId;
        return this;
    }

    /**
     * The Source id.
     *
     * @return sourceId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "The Source id.")
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public EdgeFunctions1 createdAt(String createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * Creation date.
     *
     * @return createdAt
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Creation date.")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public EdgeFunctions1 createdBy(String createdBy) {

        this.createdBy = createdBy;
        return this;
    }

    /**
     * Creating user&#39;s id.
     *
     * @return createdBy
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Creating user's id.")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public EdgeFunctions1 downloadURL(String downloadURL) {

        this.downloadURL = downloadURL;
        return this;
    }

    /**
     * The CDN URL that can be used to fetch your latest EdgeFunctions bundle.
     *
     * @return downloadURL
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            required = true,
            value = "The CDN URL that can be used to fetch your latest EdgeFunctions bundle.")
    public String getDownloadURL() {
        return downloadURL;
    }

    public void setDownloadURL(String downloadURL) {
        this.downloadURL = downloadURL;
    }

    public EdgeFunctions1 version(BigDecimal version) {

        this.version = version;
        return this;
    }

    /**
     * Revision number associated with the latest Edge Function.
     *
     * @return version
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            required = true,
            value = "Revision number associated with the latest Edge Function.")
    public BigDecimal getVersion() {
        return version;
    }

    public void setVersion(BigDecimal version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgeFunctions1 edgeFunctions1 = (EdgeFunctions1) o;
        return Objects.equals(this.id, edgeFunctions1.id)
                && Objects.equals(this.sourceId, edgeFunctions1.sourceId)
                && Objects.equals(this.createdAt, edgeFunctions1.createdAt)
                && Objects.equals(this.createdBy, edgeFunctions1.createdBy)
                && Objects.equals(this.downloadURL, edgeFunctions1.downloadURL)
                && Objects.equals(this.version, edgeFunctions1.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sourceId, createdAt, createdBy, downloadURL, version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeFunctions1 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    downloadURL: ").append(toIndentedString(downloadURL)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
        openapiFields.add("id");
        openapiFields.add("sourceId");
        openapiFields.add("createdAt");
        openapiFields.add("createdBy");
        openapiFields.add("downloadURL");
        openapiFields.add("version");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("sourceId");
        openapiRequiredFields.add("createdAt");
        openapiRequiredFields.add("createdBy");
        openapiRequiredFields.add("downloadURL");
        openapiRequiredFields.add("version");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to EdgeFunctions1
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!EdgeFunctions1.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in EdgeFunctions1 is not found in the"
                                        + " empty JSON string",
                                EdgeFunctions1.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!EdgeFunctions1.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `EdgeFunctions1` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : EdgeFunctions1.openapiRequiredFields) {
            if (jsonObj.get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonObj.toString()));
            }
        }
        if (!jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
        }
        if (!jsonObj.get("sourceId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `sourceId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("sourceId").toString()));
        }
        if (!jsonObj.get("createdAt").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `createdAt` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("createdAt").toString()));
        }
        if (!jsonObj.get("createdBy").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `createdBy` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("createdBy").toString()));
        }
        if (!jsonObj.get("downloadURL").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `downloadURL` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("downloadURL").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!EdgeFunctions1.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'EdgeFunctions1' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<EdgeFunctions1> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(EdgeFunctions1.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<EdgeFunctions1>() {
                        @Override
                        public void write(JsonWriter out, EdgeFunctions1 value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public EdgeFunctions1 read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of EdgeFunctions1 given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of EdgeFunctions1
     * @throws IOException if the JSON string is invalid with respect to EdgeFunctions1
     */
    public static EdgeFunctions1 fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, EdgeFunctions1.class);
    }

    /**
     * Convert an instance of EdgeFunctions1 to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
