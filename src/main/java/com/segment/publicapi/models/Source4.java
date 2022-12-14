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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** The returned Source object. */
@ApiModel(description = "The returned Source object.")
public class Source4 {
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
    private Metadata1 metadata;

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
    private Map settings;

    public static final String SERIALIZED_NAME_LABELS = "labels";

    @SerializedName(SERIALIZED_NAME_LABELS)
    private List<LabelV1> labels = new ArrayList<>();

    public Source4() {}

    public Source4 id(String id) {

        this.id = id;
        return this;
    }

    /**
     * The id of the Source. Config API note: analogous to &#x60;name&#x60;.
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            required = true,
            value = "The id of the Source.  Config API note: analogous to `name`.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Source4 slug(String slug) {

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
    @ApiModelProperty(
            required = true,
            value =
                    "The slug used to identify the Source in the Segment app.  Config API note:"
                            + " equal to `name`.")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Source4 name(String name) {

        this.name = name;
        return this;
    }

    /**
     * The name of the Source. Config API note: equal to &#x60;displayName&#x60;.
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The name of the Source.  Config API note: equal to `displayName`.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Source4 metadata(Metadata1 metadata) {

        this.metadata = metadata;
        return this;
    }

    /**
     * Get metadata
     *
     * @return metadata
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Metadata1 getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata1 metadata) {
        this.metadata = metadata;
    }

    public Source4 workspaceId(String workspaceId) {

        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * The id of the Workspace that owns the Source. Config API note: equal to &#x60;parent&#x60;.
     *
     * @return workspaceId
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(
            required = true,
            value =
                    "The id of the Workspace that owns the Source.  Config API note: equal to"
                            + " `parent`.")
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public Source4 enabled(Boolean enabled) {

        this.enabled = enabled;
        return this;
    }

    /**
     * Enable to receive data from the Source.
     *
     * @return enabled
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "Enable to receive data from the Source.")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Source4 writeKeys(List<String> writeKeys) {

        this.writeKeys = writeKeys;
        return this;
    }

    public Source4 addWriteKeysItem(String writeKeysItem) {
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
    @ApiModelProperty(
            required = true,
            value =
                    "The write keys used to send data from the Source. This field is left empty"
                        + " when the current token does not have the 'source admin' permission.")
    public List<String> getWriteKeys() {
        return writeKeys;
    }

    public void setWriteKeys(List<String> writeKeys) {
        this.writeKeys = writeKeys;
    }

    public Source4 settings(Map settings) {

        this.settings = settings;
        return this;
    }

    /**
     * The settings associated with the Source.
     *
     * @return settings
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The settings associated with the Source.")
    public Map getSettings() {
        return settings;
    }

    public void setSettings(Map settings) {
        this.settings = settings;
    }

    public Source4 labels(List<LabelV1> labels) {

        this.labels = labels;
        return this;
    }

    public Source4 addLabelsItem(LabelV1 labelsItem) {
        this.labels.add(labelsItem);
        return this;
    }

    /**
     * A list of labels applied to the Source.
     *
     * @return labels
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "A list of labels applied to the Source.")
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
        Source4 source4 = (Source4) o;
        return Objects.equals(this.id, source4.id)
                && Objects.equals(this.slug, source4.slug)
                && Objects.equals(this.name, source4.name)
                && Objects.equals(this.metadata, source4.metadata)
                && Objects.equals(this.workspaceId, source4.workspaceId)
                && Objects.equals(this.enabled, source4.enabled)
                && Objects.equals(this.writeKeys, source4.writeKeys)
                && Objects.equals(this.settings, source4.settings)
                && Objects.equals(this.labels, source4.labels);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null
                        && b != null
                        && a.isPresent()
                        && b.isPresent()
                        && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, slug, name, metadata, workspaceId, enabled, writeKeys, settings, labels);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Source4 {\n");
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
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to Source4
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!Source4.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Source4 is not found in the empty JSON"
                                        + " string",
                                Source4.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!Source4.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `Source4`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : Source4.openapiRequiredFields) {
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
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Source4.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Source4' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Source4> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Source4.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Source4>() {
                        @Override
                        public void write(JsonWriter out, Source4 value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Source4 read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Source4 given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Source4
     * @throws IOException if the JSON string is invalid with respect to Source4
     */
    public static Source4 fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Source4.class);
    }

    /**
     * Convert an instance of Source4 to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
