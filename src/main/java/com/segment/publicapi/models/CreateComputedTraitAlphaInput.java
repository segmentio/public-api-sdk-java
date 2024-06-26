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
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** Input to create a trait. */
public class CreateComputedTraitAlphaInput {
    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_DESCRIPTION = "description";

    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;

    public static final String SERIALIZED_NAME_DEFINITION = "definition";

    @SerializedName(SERIALIZED_NAME_DEFINITION)
    private TraitDefinition definition;

    public static final String SERIALIZED_NAME_OPTIONS = "options";

    @SerializedName(SERIALIZED_NAME_OPTIONS)
    private TraitOptions options;

    public CreateComputedTraitAlphaInput() {}

    public CreateComputedTraitAlphaInput name(String name) {

        this.name = name;
        return this;
    }

    /**
     * The name of the computation.
     *
     * @return name
     */
    @javax.annotation.Nonnull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateComputedTraitAlphaInput enabled(Boolean enabled) {

        this.enabled = enabled;
        return this;
    }

    /**
     * Determines whether a computation is enabled.
     *
     * @return enabled
     */
    @javax.annotation.Nullable
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CreateComputedTraitAlphaInput description(String description) {

        this.description = description;
        return this;
    }

    /**
     * The description of the computation.
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

    public CreateComputedTraitAlphaInput definition(TraitDefinition definition) {

        this.definition = definition;
        return this;
    }

    /**
     * Get definition
     *
     * @return definition
     */
    @javax.annotation.Nonnull
    public TraitDefinition getDefinition() {
        return definition;
    }

    public void setDefinition(TraitDefinition definition) {
        this.definition = definition;
    }

    public CreateComputedTraitAlphaInput options(TraitOptions options) {

        this.options = options;
        return this;
    }

    /**
     * Get options
     *
     * @return options
     */
    @javax.annotation.Nullable
    public TraitOptions getOptions() {
        return options;
    }

    public void setOptions(TraitOptions options) {
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
        CreateComputedTraitAlphaInput createComputedTraitAlphaInput =
                (CreateComputedTraitAlphaInput) o;
        return Objects.equals(this.name, createComputedTraitAlphaInput.name)
                && Objects.equals(this.enabled, createComputedTraitAlphaInput.enabled)
                && Objects.equals(this.description, createComputedTraitAlphaInput.description)
                && Objects.equals(this.definition, createComputedTraitAlphaInput.definition)
                && Objects.equals(this.options, createComputedTraitAlphaInput.options);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enabled, description, definition, options);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateComputedTraitAlphaInput {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
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
        openapiFields.add("name");
        openapiFields.add("enabled");
        openapiFields.add("description");
        openapiFields.add("definition");
        openapiFields.add("options");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("name");
        openapiRequiredFields.add("definition");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     CreateComputedTraitAlphaInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CreateComputedTraitAlphaInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in CreateComputedTraitAlphaInput is not"
                                        + " found in the empty JSON string",
                                CreateComputedTraitAlphaInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!CreateComputedTraitAlphaInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `CreateComputedTraitAlphaInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : CreateComputedTraitAlphaInput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull())
                && !jsonObj.get("description").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `description` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("description").toString()));
        }
        // validate the required field `definition`
        TraitDefinition.validateJsonElement(jsonObj.get("definition"));
        // validate the optional field `options`
        if (jsonObj.get("options") != null && !jsonObj.get("options").isJsonNull()) {
            TraitOptions.validateJsonElement(jsonObj.get("options"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CreateComputedTraitAlphaInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'CreateComputedTraitAlphaInput' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CreateComputedTraitAlphaInput> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(CreateComputedTraitAlphaInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CreateComputedTraitAlphaInput>() {
                        @Override
                        public void write(JsonWriter out, CreateComputedTraitAlphaInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CreateComputedTraitAlphaInput read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CreateComputedTraitAlphaInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CreateComputedTraitAlphaInput
     * @throws IOException if the JSON string is invalid with respect to
     *     CreateComputedTraitAlphaInput
     */
    public static CreateComputedTraitAlphaInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, CreateComputedTraitAlphaInput.class);
    }

    /**
     * Convert an instance of CreateComputedTraitAlphaInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
