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
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** The metadata for the Warehouse. */
@ApiModel(description = "The metadata for the Warehouse.")
public class Metadata2 {
    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_SLUG = "slug";

    @SerializedName(SERIALIZED_NAME_SLUG)
    private String slug;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_LOGOS = "logos";

    @SerializedName(SERIALIZED_NAME_LOGOS)
    private Logos2 logos;

    public static final String SERIALIZED_NAME_OPTIONS = "options";

    @SerializedName(SERIALIZED_NAME_OPTIONS)
    private List<IntegrationOptionBeta> options = new ArrayList<>();

    public Metadata2() {}

    public Metadata2 id(String id) {

        this.id = id;
        return this;
    }

    /**
     * The id of this object.
     *
     * @return id
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "The id of this object.")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Metadata2 name(String name) {

        this.name = name;
        return this;
    }

    /**
     * The name of this object.
     *
     * @return name
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "The name of this object.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Metadata2 slug(String slug) {

        this.slug = slug;
        return this;
    }

    /**
     * A human-readable, unique identifier for object.
     *
     * @return slug
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "A human-readable, unique identifier for object.")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Metadata2 description(String description) {

        this.description = description;
        return this;
    }

    /**
     * A description, in English, of this object.
     *
     * @return description
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "A description, in English, of this object.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Metadata2 logos(Logos2 logos) {

        this.logos = logos;
        return this;
    }

    /**
     * Get logos
     *
     * @return logos
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")
    public Logos2 getLogos() {
        return logos;
    }

    public void setLogos(Logos2 logos) {
        this.logos = logos;
    }

    public Metadata2 options(List<IntegrationOptionBeta> options) {

        this.options = options;
        return this;
    }

    public Metadata2 addOptionsItem(IntegrationOptionBeta optionsItem) {
        this.options.add(optionsItem);
        return this;
    }

    /**
     * The Integration options for this object.
     *
     * @return options
     */
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "The Integration options for this object.")
    public List<IntegrationOptionBeta> getOptions() {
        return options;
    }

    public void setOptions(List<IntegrationOptionBeta> options) {
        this.options = options;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Metadata2 metadata2 = (Metadata2) o;
        return Objects.equals(this.id, metadata2.id)
                && Objects.equals(this.name, metadata2.name)
                && Objects.equals(this.slug, metadata2.slug)
                && Objects.equals(this.description, metadata2.description)
                && Objects.equals(this.logos, metadata2.logos)
                && Objects.equals(this.options, metadata2.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, slug, description, logos, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Metadata2 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    logos: ").append(toIndentedString(logos)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
        openapiFields.add("name");
        openapiFields.add("slug");
        openapiFields.add("description");
        openapiFields.add("logos");
        openapiFields.add("options");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("slug");
        openapiRequiredFields.add("description");
        openapiRequiredFields.add("logos");
        openapiRequiredFields.add("options");
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to Metadata2
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!Metadata2.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in Metadata2 is not found in the empty"
                                        + " JSON string",
                                Metadata2.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!Metadata2.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `Metadata2` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : Metadata2.openapiRequiredFields) {
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
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if (!jsonObj.get("slug").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `slug` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("slug").toString()));
        }
        if (!jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("description").toString()));
        }
        // ensure the json data is an array
        if (!jsonObj.get("options").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `options` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("options").toString()));
        }

        JsonArray jsonArrayoptions = jsonObj.getAsJsonArray("options");
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Metadata2.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Metadata2' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<Metadata2> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(Metadata2.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Metadata2>() {
                        @Override
                        public void write(JsonWriter out, Metadata2 value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public Metadata2 read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of Metadata2 given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Metadata2
     * @throws IOException if the JSON string is invalid with respect to Metadata2
     */
    public static Metadata2 fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Metadata2.class);
    }

    /**
     * Convert an instance of Metadata2 to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
