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
import com.google.gson.annotations.JsonAdapter;
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

/** Represents a Function in a list. */
public class ListFunctionItemV1 {
    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    /** The Function type. Config API note: equal to &#x60;type&#x60;. */
    @JsonAdapter(ResourceTypeEnum.Adapter.class)
    public enum ResourceTypeEnum {
        DESTINATION("DESTINATION"),

        INSERT_DESTINATION("INSERT_DESTINATION"),

        INSERT_SOURCE("INSERT_SOURCE"),

        SOURCE("SOURCE");

        private String value;

        ResourceTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static ResourceTypeEnum fromValue(String value) {
            for (ResourceTypeEnum b : ResourceTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<ResourceTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final ResourceTypeEnum enumeration)
                    throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public ResourceTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return ResourceTypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resourceType";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
    private ResourceTypeEnum resourceType;

    public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";

    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;

    public static final String SERIALIZED_NAME_CREATED_BY = "createdBy";

    @SerializedName(SERIALIZED_NAME_CREATED_BY)
    private String createdBy;

    public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";

    @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
    private String displayName;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_LOGO_URL = "logoUrl";

    @SerializedName(SERIALIZED_NAME_LOGO_URL)
    private String logoUrl;

    public static final String SERIALIZED_NAME_CATALOG_ID = "catalogId";

    @SerializedName(SERIALIZED_NAME_CATALOG_ID)
    private String catalogId;

    public ListFunctionItemV1() {}

    public ListFunctionItemV1 id(String id) {

        this.id = id;
        return this;
    }

    /**
     * An identifier for this Function.
     *
     * @return id
     */
    @javax.annotation.Nullable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListFunctionItemV1 resourceType(ResourceTypeEnum resourceType) {

        this.resourceType = resourceType;
        return this;
    }

    /**
     * The Function type. Config API note: equal to &#x60;type&#x60;.
     *
     * @return resourceType
     */
    @javax.annotation.Nullable
    public ResourceTypeEnum getResourceType() {
        return resourceType;
    }

    public void setResourceType(ResourceTypeEnum resourceType) {
        this.resourceType = resourceType;
    }

    public ListFunctionItemV1 createdAt(String createdAt) {

        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time this Function was created.
     *
     * @return createdAt
     */
    @javax.annotation.Nullable
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ListFunctionItemV1 createdBy(String createdBy) {

        this.createdBy = createdBy;
        return this;
    }

    /**
     * The id of the user who created this Function.
     *
     * @return createdBy
     */
    @javax.annotation.Nullable
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ListFunctionItemV1 displayName(String displayName) {

        this.displayName = displayName;
        return this;
    }

    /**
     * A display name for this Function.
     *
     * @return displayName
     */
    @javax.annotation.Nullable
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ListFunctionItemV1 description(String description) {

        this.description = description;
        return this;
    }

    /**
     * A description for this Function.
     *
     * @return description
     */
    @javax.annotation.Nullable
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListFunctionItemV1 logoUrl(String logoUrl) {

        this.logoUrl = logoUrl;
        return this;
    }

    /**
     * The URL of the logo for this Function.
     *
     * @return logoUrl
     */
    @javax.annotation.Nullable
    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public ListFunctionItemV1 catalogId(String catalogId) {

        this.catalogId = catalogId;
        return this;
    }

    /**
     * The catalog id of this Function.
     *
     * @return catalogId
     */
    @javax.annotation.Nullable
    public String getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFunctionItemV1 listFunctionItemV1 = (ListFunctionItemV1) o;
        return Objects.equals(this.id, listFunctionItemV1.id)
                && Objects.equals(this.resourceType, listFunctionItemV1.resourceType)
                && Objects.equals(this.createdAt, listFunctionItemV1.createdAt)
                && Objects.equals(this.createdBy, listFunctionItemV1.createdBy)
                && Objects.equals(this.displayName, listFunctionItemV1.displayName)
                && Objects.equals(this.description, listFunctionItemV1.description)
                && Objects.equals(this.logoUrl, listFunctionItemV1.logoUrl)
                && Objects.equals(this.catalogId, listFunctionItemV1.catalogId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                resourceType,
                createdAt,
                createdBy,
                displayName,
                description,
                logoUrl,
                catalogId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFunctionItemV1 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    logoUrl: ").append(toIndentedString(logoUrl)).append("\n");
        sb.append("    catalogId: ").append(toIndentedString(catalogId)).append("\n");
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
        openapiFields.add("resourceType");
        openapiFields.add("createdAt");
        openapiFields.add("createdBy");
        openapiFields.add("displayName");
        openapiFields.add("description");
        openapiFields.add("logoUrl");
        openapiFields.add("catalogId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ListFunctionItemV1
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ListFunctionItemV1.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ListFunctionItemV1 is not found in the"
                                        + " empty JSON string",
                                ListFunctionItemV1.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ListFunctionItemV1.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ListFunctionItemV1` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull())
                && !jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
        }
        if ((jsonObj.get("resourceType") != null && !jsonObj.get("resourceType").isJsonNull())
                && !jsonObj.get("resourceType").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `resourceType` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("resourceType").toString()));
        }
        if ((jsonObj.get("createdAt") != null && !jsonObj.get("createdAt").isJsonNull())
                && !jsonObj.get("createdAt").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `createdAt` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("createdAt").toString()));
        }
        if ((jsonObj.get("createdBy") != null && !jsonObj.get("createdBy").isJsonNull())
                && !jsonObj.get("createdBy").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `createdBy` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("createdBy").toString()));
        }
        if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull())
                && !jsonObj.get("displayName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `displayName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("displayName").toString()));
        }
        if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
                && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("description").toString()));
        }
        if ((jsonObj.get("logoUrl") != null && !jsonObj.get("logoUrl").isJsonNull())
                && !jsonObj.get("logoUrl").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `logoUrl` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("logoUrl").toString()));
        }
        if ((jsonObj.get("catalogId") != null && !jsonObj.get("catalogId").isJsonNull())
                && !jsonObj.get("catalogId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `catalogId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("catalogId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ListFunctionItemV1.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ListFunctionItemV1' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ListFunctionItemV1> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ListFunctionItemV1.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ListFunctionItemV1>() {
                        @Override
                        public void write(JsonWriter out, ListFunctionItemV1 value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ListFunctionItemV1 read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ListFunctionItemV1 given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ListFunctionItemV1
     * @throws IOException if the JSON string is invalid with respect to ListFunctionItemV1
     */
    public static ListFunctionItemV1 fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ListFunctionItemV1.class);
    }

    /**
     * Convert an instance of ListFunctionItemV1 to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
