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

/** Input to create an activation. */
public class AddActivationToAudienceAlphaInput {
    public static final String SERIALIZED_NAME_VERSION_SCHEMA = "versionSchema";

    @SerializedName(SERIALIZED_NAME_VERSION_SCHEMA)
    private String versionSchema;

    public static final String SERIALIZED_NAME_WORKSPACE_ID = "workspaceId";

    @SerializedName(SERIALIZED_NAME_WORKSPACE_ID)
    private String workspaceId;

    public static final String SERIALIZED_NAME_DESTINATION_ID = "destinationId";

    @SerializedName(SERIALIZED_NAME_DESTINATION_ID)
    private String destinationId;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_HAS_ENABLED_RESYNC = "hasEnabledResync";

    @SerializedName(SERIALIZED_NAME_HAS_ENABLED_RESYNC)
    private Boolean hasEnabledResync;

    public static final String SERIALIZED_NAME_EMIT_ENTITY_CONTEXT = "emitEntityContext";

    @SerializedName(SERIALIZED_NAME_EMIT_ENTITY_CONTEXT)
    private String emitEntityContext;

    public static final String SERIALIZED_NAME_EVENT_EMITTER = "eventEmitter";

    @SerializedName(SERIALIZED_NAME_EVENT_EMITTER)
    private Object eventEmitter = null;

    public static final String SERIALIZED_NAME_SUBSCRIPTION = "subscription";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION)
    private Object subscription = null;

    public AddActivationToAudienceAlphaInput() {}

    public AddActivationToAudienceAlphaInput versionSchema(String versionSchema) {

        this.versionSchema = versionSchema;
        return this;
    }

    /**
     * Version Schema.
     *
     * @return versionSchema
     */
    @javax.annotation.Nonnull
    public String getVersionSchema() {
        return versionSchema;
    }

    public void setVersionSchema(String versionSchema) {
        this.versionSchema = versionSchema;
    }

    public AddActivationToAudienceAlphaInput workspaceId(String workspaceId) {

        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * The id of the Workspace the audience exists within.
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

    public AddActivationToAudienceAlphaInput destinationId(String destinationId) {

        this.destinationId = destinationId;
        return this;
    }

    /**
     * The Destination id.
     *
     * @return destinationId
     */
    @javax.annotation.Nonnull
    public String getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(String destinationId) {
        this.destinationId = destinationId;
    }

    public AddActivationToAudienceAlphaInput enabled(Boolean enabled) {

        this.enabled = enabled;
        return this;
    }

    /**
     * Whether the event emitter should be created in an enabled state.
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

    public AddActivationToAudienceAlphaInput hasEnabledResync(Boolean hasEnabledResync) {

        this.hasEnabledResync = hasEnabledResync;
        return this;
    }

    /**
     * Whether the event emitter should be created with the resync option.
     *
     * @return hasEnabledResync
     */
    @javax.annotation.Nullable
    public Boolean getHasEnabledResync() {
        return hasEnabledResync;
    }

    public void setHasEnabledResync(Boolean hasEnabledResync) {
        this.hasEnabledResync = hasEnabledResync;
    }

    public AddActivationToAudienceAlphaInput emitEntityContext(String emitEntityContext) {

        this.emitEntityContext = emitEntityContext;
        return this;
    }

    /**
     * Whether the event emitter should emit events when the profile changes or when any enriched
     * entity values changes. Only valid for identify events.
     *
     * @return emitEntityContext
     */
    @javax.annotation.Nullable
    public String getEmitEntityContext() {
        return emitEntityContext;
    }

    public void setEmitEntityContext(String emitEntityContext) {
        this.emitEntityContext = emitEntityContext;
    }

    public AddActivationToAudienceAlphaInput eventEmitter(Object eventEmitter) {

        this.eventEmitter = eventEmitter;
        return this;
    }

    /**
     * Configuration settings for the event emitter to be created.
     *
     * @return eventEmitter
     */
    @javax.annotation.Nullable
    public Object getEventEmitter() {
        return eventEmitter;
    }

    public void setEventEmitter(Object eventEmitter) {
        this.eventEmitter = eventEmitter;
    }

    public AddActivationToAudienceAlphaInput subscription(Object subscription) {

        this.subscription = subscription;
        return this;
    }

    /**
     * Subscription info to connect the event emitter to a Destination attached to the audience.
     *
     * @return subscription
     */
    @javax.annotation.Nullable
    public Object getSubscription() {
        return subscription;
    }

    public void setSubscription(Object subscription) {
        this.subscription = subscription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddActivationToAudienceAlphaInput addActivationToAudienceAlphaInput =
                (AddActivationToAudienceAlphaInput) o;
        return Objects.equals(this.versionSchema, addActivationToAudienceAlphaInput.versionSchema)
                && Objects.equals(this.workspaceId, addActivationToAudienceAlphaInput.workspaceId)
                && Objects.equals(
                        this.destinationId, addActivationToAudienceAlphaInput.destinationId)
                && Objects.equals(this.enabled, addActivationToAudienceAlphaInput.enabled)
                && Objects.equals(
                        this.hasEnabledResync, addActivationToAudienceAlphaInput.hasEnabledResync)
                && Objects.equals(
                        this.emitEntityContext, addActivationToAudienceAlphaInput.emitEntityContext)
                && Objects.equals(this.eventEmitter, addActivationToAudienceAlphaInput.eventEmitter)
                && Objects.equals(
                        this.subscription, addActivationToAudienceAlphaInput.subscription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                versionSchema,
                workspaceId,
                destinationId,
                enabled,
                hasEnabledResync,
                emitEntityContext,
                eventEmitter,
                subscription);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddActivationToAudienceAlphaInput {\n");
        sb.append("    versionSchema: ").append(toIndentedString(versionSchema)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    destinationId: ").append(toIndentedString(destinationId)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    hasEnabledResync: ").append(toIndentedString(hasEnabledResync)).append("\n");
        sb.append("    emitEntityContext: ")
                .append(toIndentedString(emitEntityContext))
                .append("\n");
        sb.append("    eventEmitter: ").append(toIndentedString(eventEmitter)).append("\n");
        sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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
        openapiFields.add("versionSchema");
        openapiFields.add("workspaceId");
        openapiFields.add("destinationId");
        openapiFields.add("enabled");
        openapiFields.add("hasEnabledResync");
        openapiFields.add("emitEntityContext");
        openapiFields.add("eventEmitter");
        openapiFields.add("subscription");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("versionSchema");
        openapiRequiredFields.add("workspaceId");
        openapiRequiredFields.add("destinationId");
        openapiRequiredFields.add("eventEmitter");
        openapiRequiredFields.add("subscription");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     AddActivationToAudienceAlphaInput
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AddActivationToAudienceAlphaInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AddActivationToAudienceAlphaInput is"
                                        + " not found in the empty JSON string",
                                AddActivationToAudienceAlphaInput.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!AddActivationToAudienceAlphaInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `AddActivationToAudienceAlphaInput` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : AddActivationToAudienceAlphaInput.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("versionSchema").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `versionSchema` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("versionSchema").toString()));
        }
        if (!jsonObj.get("workspaceId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `workspaceId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("workspaceId").toString()));
        }
        if (!jsonObj.get("destinationId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `destinationId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("destinationId").toString()));
        }
        if ((jsonObj.get("emitEntityContext") != null
                        && !jsonObj.get("emitEntityContext").isJsonNull())
                && !jsonObj.get("emitEntityContext").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `emitEntityContext` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("emitEntityContext").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AddActivationToAudienceAlphaInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AddActivationToAudienceAlphaInput' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AddActivationToAudienceAlphaInput> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(AddActivationToAudienceAlphaInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AddActivationToAudienceAlphaInput>() {
                        @Override
                        public void write(JsonWriter out, AddActivationToAudienceAlphaInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AddActivationToAudienceAlphaInput read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AddActivationToAudienceAlphaInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AddActivationToAudienceAlphaInput
     * @throws IOException if the JSON string is invalid with respect to
     *     AddActivationToAudienceAlphaInput
     */
    public static AddActivationToAudienceAlphaInput fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AddActivationToAudienceAlphaInput.class);
    }

    /**
     * Convert an instance of AddActivationToAudienceAlphaInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
