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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** Defines a data Source for Segment data. */
public class SourceAlpha {
    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_SLUG = "slug";

    @SerializedName(SERIALIZED_NAME_SLUG)
    private String slug;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_METADATA = "metadata";

    @SerializedName(SERIALIZED_NAME_METADATA)
    private SourceMetadataV1 metadata;

    public static final String SERIALIZED_NAME_WORKSPACE_ID = "workspaceId";

    @SerializedName(SERIALIZED_NAME_WORKSPACE_ID)
    private String workspaceId;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_WRITE_KEYS = "writeKeys";

    @SerializedName(SERIALIZED_NAME_WRITE_KEYS)
    private List<String> writeKeys = new ArrayList<>();

    public static final String SERIALIZED_NAME_SETTINGS = "settings";

    @SerializedName(SERIALIZED_NAME_SETTINGS)
    private Map<String, Object> settings;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<LabelV1> labels = new ArrayList<>();

    public SourceAlpha() {}

    public SourceAlpha id(String id) {

        this.id = id;
        return this;
    }

    /**
     * The id of the Source. Config API note: analogous to &#x60;name&#x60;.
     *
     * @return id
     */
    @javax.annotation.Nonnull
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SourceAlpha slug(String slug) {

        this.slug = slug;
        return this;
    }

    /**
     * The slug used to identify the Source in the Segment app. Config API note: equal to
     * &#x60;name&#x60;.
     *
     * @return slug
     */
    @javax.annotation.Nonnull
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public SourceAlpha name(String name) {

        this.name = name;
        return this;
    }

    /**
     * The name of the Source. Config API note: equal to &#x60;displayName&#x60;.
     *
     * @return name
     */
    @javax.annotation.Nullable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SourceAlpha metadata(SourceMetadataV1 metadata) {

        this.metadata = metadata;
        return this;
    }

    /**
     * Get metadata
     *
     * @return metadata
     */
    @javax.annotation.Nonnull
    public SourceMetadataV1 getMetadata() {
        return metadata;
    }

    public void setMetadata(SourceMetadataV1 metadata) {
        this.metadata = metadata;
    }

    public SourceAlpha workspaceId(String workspaceId) {

        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * The id of the Workspace that owns the Source. Config API note: equal to &#x60;parent&#x60;.
     *
     * @return workspaceId
     */
    @javax.annotation.Nonnull
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public SourceAlpha enabled(Boolean enabled) {

        this.enabled = enabled;
        return this;
    }

    /**
     * Enable to receive data from the Source.
     *
     * @return enabled
     */
    @javax.annotation.Nonnull
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public SourceAlpha writeKeys(List<String> writeKeys) {

        this.writeKeys = writeKeys;
        return this;
    }

    public SourceAlpha addWriteKeysItem(String writeKeysItem) {
        if (this.writeKeys == null) {
            this.writeKeys = new ArrayList<>();
        }
        this.writeKeys.add(writeKeysItem);
        return this;
    }

    /**
     * The write keys used to send data from the Source. This field is left empty when the current
     * token does not have the &#39;source admin&#39; permission.
     *
     * @return writeKeys
     */
    @javax.annotation.Nonnull
    public List<String> getWriteKeys() {
        return writeKeys;
    }

    public void setWriteKeys(List<String> writeKeys) {
        this.writeKeys = writeKeys;
    }

    public SourceAlpha settings(Map<String, Object> settings) {

        this.settings = settings;
        return this;
    }

    public SourceAlpha putSettingsItem(String key, Object settingsItem) {
        if (this.settings == null) {
            this.settings = new HashMap<>();
        }
        this.settings.put(key, settingsItem);
        return this;
    }

    /**
     * A key-value object that contains instance-specific settings for a Source. The
     * &#x60;options&#x60; field in the Source metadata defines the schema of this object.
     *
     * @return settings
     */
    @javax.annotation.Nullable
    public Map<String, Object> getSettings() {
        return settings;
    }

    public void setSettings(Map<String, Object> settings) {
        this.settings = settings;
    }

    public SourceAlpha labels(List<LabelV1> labels) {

        this.labels = labels;
        return this;
    }

    public SourceAlpha addLabelsItem(LabelV1 labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * A list of labels applied to the Source.
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
        SourceAlpha sourceAlpha = (SourceAlpha) o;
        return Objects.equals(this.id, sourceAlpha.id)
                && Objects.equals(this.slug, sourceAlpha.slug)
                && Objects.equals(this.name, sourceAlpha.name)
                && Objects.equals(this.metadata, sourceAlpha.metadata)
                && Objects.equals(this.workspaceId, sourceAlpha.workspaceId)
                && Objects.equals(this.enabled, sourceAlpha.enabled)
                && Objects.equals(this.writeKeys, sourceAlpha.writeKeys)
                && Objects.equals(this.settings, sourceAlpha.settings)
                && Objects.equals(this.labels, sourceAlpha.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, slug, name, metadata, workspaceId, enabled, writeKeys, settings, labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceAlpha {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    writeKeys: ").append(toIndentedString(writeKeys)).append("\n");
        sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
        openapiFields.add("id");
        openapiFields.add("slug");
        openapiFields.add("name");
        openapiFields.add("metadata");
        openapiFields.add("workspaceId");
        openapiFields.add("enabled");
        openapiFields.add("writeKeys");
        openapiFields.add("settings");
        openapiFields.add("labels");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("slug");
        openapiRequiredFields.add("metadata");
        openapiRequiredFields.add("workspaceId");
        openapiRequiredFields.add("enabled");
        openapiRequiredFields.add("writeKeys");
        openapiRequiredFields.add("labels");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to SourceAlpha
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SourceAlpha.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SourceAlpha is not found in the empty"
                                        + " JSON string",
                                SourceAlpha.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!SourceAlpha.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SourceAlpha` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : SourceAlpha.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
        }
        if (!jsonObj.get("slug").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `slug` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("slug").toString()));
        }
        if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
                && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        // validate the required field `metadata`
        SourceMetadataV1.validateJsonElement(jsonObj.get("metadata"));
        if (!jsonObj.get("workspaceId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `workspaceId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("workspaceId").toString()));
        }
        // ensure the required json array is present
        if (jsonObj.get("writeKeys") == null) {
            throw new IllegalArgumentException(
                    "Expected the field `linkedContent` to be an array in the JSON string but got"
                            + " `null`");
        } else if (!jsonObj.get("writeKeys").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `writeKeys` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("writeKeys").toString()));
        }
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
            if (!SourceAlpha.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SourceAlpha' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SourceAlpha> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SourceAlpha.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SourceAlpha>() {
                        @Override
                        public void write(JsonWriter out, SourceAlpha value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SourceAlpha read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SourceAlpha given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SourceAlpha
     * @throws IOException if the JSON string is invalid with respect to SourceAlpha
     */
    public static SourceAlpha fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SourceAlpha.class);
    }

    /**
     * Convert an instance of SourceAlpha to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
