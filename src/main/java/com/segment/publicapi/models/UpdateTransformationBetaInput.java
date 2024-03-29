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

/** The input to update a Transformation. */
public class UpdateTransformationBetaInput {
    public static final String SERIALIZED_NAME_TRANSFORMATION_ID = "transformationId";

    @SerializedName(SERIALIZED_NAME_TRANSFORMATION_ID)
    private String transformationId;

    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";

    @SerializedName(SERIALIZED_NAME_SOURCE_ID)
    private String sourceId;

    public static final String SERIALIZED_NAME_DESTINATION_METADATA_ID = "destinationMetadataId";

    @SerializedName(SERIALIZED_NAME_DESTINATION_METADATA_ID)
    private String destinationMetadataId;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_IF = "if";

    @SerializedName(SERIALIZED_NAME_IF)
    private String _if;

    public static final String SERIALIZED_NAME_NEW_EVENT_NAME = "newEventName";

    @SerializedName(SERIALIZED_NAME_NEW_EVENT_NAME)
    private String newEventName;

    public static final String SERIALIZED_NAME_PROPERTY_RENAMES = "propertyRenames";

    @SerializedName(SERIALIZED_NAME_PROPERTY_RENAMES)
    private List<PropertyRenameBeta> propertyRenames;

    public static final String SERIALIZED_NAME_PROPERTY_VALUE_TRANSFORMATIONS =
            "propertyValueTransformations";

    @SerializedName(SERIALIZED_NAME_PROPERTY_VALUE_TRANSFORMATIONS)
    private List<PropertyValueTransformationBeta> propertyValueTransformations;

    public UpdateTransformationBetaInput() {}

    public UpdateTransformationBetaInput transformationId(String transformationId) {

        this.transformationId = transformationId;
        return this;
    }

    /**
     * ID of the Transformation to update.
     *
     * @return transformationId
     */
    @javax.annotation.Nonnull
    public String getTransformationId() {
        return transformationId;
    }

    public void setTransformationId(String transformationId) {
        this.transformationId = transformationId;
    }

    public UpdateTransformationBetaInput name(String name) {

        this.name = name;
        return this;
    }

    /**
     * The name of the Transformation.
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

    public UpdateTransformationBetaInput sourceId(String sourceId) {

        this.sourceId = sourceId;
        return this;
    }

    /**
     * The optional Source to be associated with the Transformation.
     *
     * @return sourceId
     */
    @javax.annotation.Nullable
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public UpdateTransformationBetaInput destinationMetadataId(String destinationMetadataId) {

        this.destinationMetadataId = destinationMetadataId;
        return this;
    }

    /**
     * The optional Destination metadata to be associated with the Transformation.
     *
     * @return destinationMetadataId
     */
    @javax.annotation.Nullable
    public String getDestinationMetadataId() {
        return destinationMetadataId;
    }

    public void setDestinationMetadataId(String destinationMetadataId) {
        this.destinationMetadataId = destinationMetadataId;
    }

    public UpdateTransformationBetaInput enabled(Boolean enabled) {

        this.enabled = enabled;
        return this;
    }

    /**
     * If the Transformation should be enabled.
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

    public UpdateTransformationBetaInput _if(String _if) {

        this._if = _if;
        return this;
    }

    /**
     * If statement ([FQL](https://segment.com/docs/config-api/fql/)) to match events. For standard
     * event matchers, use the following: Track -\\&gt;
     * \&quot;event&#x3D;&#39;\\&lt;eventName\\&gt;&#39;\&quot; Identify -\\&gt;
     * \&quot;type&#x3D;&#39;identify&#39;\&quot; Group -\\&gt;
     * \&quot;type&#x3D;&#39;group&#39;\&quot;
     *
     * @return _if
     */
    @javax.annotation.Nullable
    public String getIf() {
        return _if;
    }

    public void setIf(String _if) {
        this._if = _if;
    }

    public UpdateTransformationBetaInput newEventName(String newEventName) {

        this.newEventName = newEventName;
        return this;
    }

    /**
     * Optional new event name for renaming events. Works only for &#39;track&#39; event type.
     *
     * @return newEventName
     */
    @javax.annotation.Nullable
    public String getNewEventName() {
        return newEventName;
    }

    public void setNewEventName(String newEventName) {
        this.newEventName = newEventName;
    }

    public UpdateTransformationBetaInput propertyRenames(List<PropertyRenameBeta> propertyRenames) {

        this.propertyRenames = propertyRenames;
        return this;
    }

    public UpdateTransformationBetaInput addPropertyRenamesItem(
            PropertyRenameBeta propertyRenamesItem) {
        if (this.propertyRenames == null) {
            this.propertyRenames = new ArrayList<>();
        }
        this.propertyRenames.add(propertyRenamesItem);
        return this;
    }

    /**
     * Optional array for renaming properties collected by your events.
     *
     * @return propertyRenames
     */
    @javax.annotation.Nullable
    public List<PropertyRenameBeta> getPropertyRenames() {
        return propertyRenames;
    }

    public void setPropertyRenames(List<PropertyRenameBeta> propertyRenames) {
        this.propertyRenames = propertyRenames;
    }

    public UpdateTransformationBetaInput propertyValueTransformations(
            List<PropertyValueTransformationBeta> propertyValueTransformations) {

        this.propertyValueTransformations = propertyValueTransformations;
        return this;
    }

    public UpdateTransformationBetaInput addPropertyValueTransformationsItem(
            PropertyValueTransformationBeta propertyValueTransformationsItem) {
        if (this.propertyValueTransformations == null) {
            this.propertyValueTransformations = new ArrayList<>();
        }
        this.propertyValueTransformations.add(propertyValueTransformationsItem);
        return this;
    }

    /**
     * Optional array for transforming properties and values collected by your events. Limited to 10
     * properties.
     *
     * @return propertyValueTransformations
     */
    @javax.annotation.Nullable
    public List<PropertyValueTransformationBeta> getPropertyValueTransformations() {
        return propertyValueTransformations;
    }

    public void setPropertyValueTransformations(
            List<PropertyValueTransformationBeta> propertyValueTransformations) {
        this.propertyValueTransformations = propertyValueTransformations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTransformationBetaInput updateTransformationBetaInput =
                (UpdateTransformationBetaInput) o;
        return Objects.equals(this.transformationId, updateTransformationBetaInput.transformationId)
                && Objects.equals(this.name, updateTransformationBetaInput.name)
                && Objects.equals(this.sourceId, updateTransformationBetaInput.sourceId)
                && Objects.equals(
                        this.destinationMetadataId,
                        updateTransformationBetaInput.destinationMetadataId)
                && Objects.equals(this.enabled, updateTransformationBetaInput.enabled)
                && Objects.equals(this._if, updateTransformationBetaInput._if)
                && Objects.equals(this.newEventName, updateTransformationBetaInput.newEventName)
                && Objects.equals(
                        this.propertyRenames, updateTransformationBetaInput.propertyRenames)
                && Objects.equals(
                        this.propertyValueTransformations,
                        updateTransformationBetaInput.propertyValueTransformations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                transformationId,
                name,
                sourceId,
                destinationMetadataId,
                enabled,
                _if,
                newEventName,
                propertyRenames,
                propertyValueTransformations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTransformationBetaInput {\n");
        sb.append("    transformationId: ").append(toIndentedString(transformationId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    destinationMetadataId: ")
                .append(toIndentedString(destinationMetadataId))
                .append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    _if: ").append(toIndentedString(_if)).append("\n");
        sb.append("    newEventName: ").append(toIndentedString(newEventName)).append("\n");
        sb.append("    propertyRenames: ").append(toIndentedString(propertyRenames)).append("\n");
        sb.append("    propertyValueTransformations: ")
                .append(toIndentedString(propertyValueTransformations))
                .append("\n");
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
        openapiFields.add("transformationId");
        openapiFields.add("name");
        openapiFields.add("sourceId");
        openapiFields.add("destinationMetadataId");
        openapiFields.add("enabled");
        openapiFields.add("if");
        openapiFields.add("newEventName");
        openapiFields.add("propertyRenames");
        openapiFields.add("propertyValueTransformations");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("transformationId");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     UpdateTransformationBetaInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UpdateTransformationBetaInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in UpdateTransformationBetaInput is not"
                                        + " found in the empty JSON string",
                                UpdateTransformationBetaInput.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!UpdateTransformationBetaInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `UpdateTransformationBetaInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : UpdateTransformationBetaInput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("transformationId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `transformationId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("transformationId").toString()));
        }
        if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
                && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if ((jsonObj.get("sourceId") != null && !jsonObj.get("sourceId").isJsonNull())
                && !jsonObj.get("sourceId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `sourceId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("sourceId").toString()));
        }
        if ((jsonObj.get("destinationMetadataId") != null
                        && !jsonObj.get("destinationMetadataId").isJsonNull())
                && !jsonObj.get("destinationMetadataId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `destinationMetadataId` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("destinationMetadataId").toString()));
        }
        if ((jsonObj.get("if") != null && !jsonObj.get("if").isJsonNull())
                && !jsonObj.get("if").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `if` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("if").toString()));
        }
        if ((jsonObj.get("newEventName") != null && !jsonObj.get("newEventName").isJsonNull())
                && !jsonObj.get("newEventName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `newEventName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("newEventName").toString()));
        }
        if (jsonObj.get("propertyRenames") != null
                && !jsonObj.get("propertyRenames").isJsonNull()) {
            JsonArray jsonArraypropertyRenames = jsonObj.getAsJsonArray("propertyRenames");
            if (jsonArraypropertyRenames != null) {
                // ensure the json data is an array
                if (!jsonObj.get("propertyRenames").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `propertyRenames` to be an array in the"
                                            + " JSON string but got `%s`",
                                    jsonObj.get("propertyRenames").toString()));
                }

                // validate the optional field `propertyRenames` (array)
                for (int i = 0; i < jsonArraypropertyRenames.size(); i++) {
                    PropertyRenameBeta.validateJsonElement(jsonArraypropertyRenames.get(i));
                }
                ;
            }
        }
        if (jsonObj.get("propertyValueTransformations") != null
                && !jsonObj.get("propertyValueTransformations").isJsonNull()) {
            JsonArray jsonArraypropertyValueTransformations =
                    jsonObj.getAsJsonArray("propertyValueTransformations");
            if (jsonArraypropertyValueTransformations != null) {
                // ensure the json data is an array
                if (!jsonObj.get("propertyValueTransformations").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `propertyValueTransformations` to be an"
                                            + " array in the JSON string but got `%s`",
                                    jsonObj.get("propertyValueTransformations").toString()));
                }

                // validate the optional field `propertyValueTransformations` (array)
                for (int i = 0; i < jsonArraypropertyValueTransformations.size(); i++) {
                    PropertyValueTransformationBeta.validateJsonElement(
                            jsonArraypropertyValueTransformations.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UpdateTransformationBetaInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'UpdateTransformationBetaInput' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UpdateTransformationBetaInput> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(UpdateTransformationBetaInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UpdateTransformationBetaInput>() {
                        @Override
                        public void write(JsonWriter out, UpdateTransformationBetaInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UpdateTransformationBetaInput read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UpdateTransformationBetaInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UpdateTransformationBetaInput
     * @throws IOException if the JSON string is invalid with respect to
     *     UpdateTransformationBetaInput
     */
    public static UpdateTransformationBetaInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, UpdateTransformationBetaInput.class);
    }

    /**
     * Convert an instance of UpdateTransformationBetaInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
