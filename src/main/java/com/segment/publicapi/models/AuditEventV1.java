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

/** Represents an Audit Trail event. */
public class AuditEventV1 {
    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    private String id;

    public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";

    @SerializedName(SERIALIZED_NAME_TIMESTAMP)
    private String timestamp;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    private String type;

    public static final String SERIALIZED_NAME_ACTOR = "actor";

    @SerializedName(SERIALIZED_NAME_ACTOR)
    private String actor;

    public static final String SERIALIZED_NAME_ACTOR_EMAIL = "actorEmail";

    @SerializedName(SERIALIZED_NAME_ACTOR_EMAIL)
    private String actorEmail;

    public static final String SERIALIZED_NAME_RESOURCE_ID = "resourceId";

    @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
    private String resourceId;

    public static final String SERIALIZED_NAME_RESOURCE_TYPE = "resourceType";

    @SerializedName(SERIALIZED_NAME_RESOURCE_TYPE)
    private String resourceType;

    public static final String SERIALIZED_NAME_RESOURCE_NAME = "resourceName";

    @SerializedName(SERIALIZED_NAME_RESOURCE_NAME)
    private String resourceName;

    public AuditEventV1() {}

    public AuditEventV1 id(String id) {

        this.id = id;
        return this;
    }

    /**
     * Unique identifier for this audit trail event.
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

    public AuditEventV1 timestamp(String timestamp) {

        this.timestamp = timestamp;
        return this;
    }

    /**
     * The timestamp of this event in ISO-8601 format.
     *
     * @return timestamp
     */
    @javax.annotation.Nonnull
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public AuditEventV1 type(String type) {

        this.type = type;
        return this;
    }

    /**
     * The type of this event.
     *
     * @return type
     */
    @javax.annotation.Nonnull
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AuditEventV1 actor(String actor) {

        this.actor = actor;
        return this;
    }

    /**
     * The user or API token that triggered this event.
     *
     * @return actor
     */
    @javax.annotation.Nonnull
    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public AuditEventV1 actorEmail(String actorEmail) {

        this.actorEmail = actorEmail;
        return this;
    }

    /**
     * The email of the user that triggered this event.
     *
     * @return actorEmail
     */
    @javax.annotation.Nullable
    public String getActorEmail() {
        return actorEmail;
    }

    public void setActorEmail(String actorEmail) {
        this.actorEmail = actorEmail;
    }

    public AuditEventV1 resourceId(String resourceId) {

        this.resourceId = resourceId;
        return this;
    }

    /**
     * The identifier of the resource affected by this event.
     *
     * @return resourceId
     */
    @javax.annotation.Nonnull
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public AuditEventV1 resourceType(String resourceType) {

        this.resourceType = resourceType;
        return this;
    }

    /**
     * The kind of resource affected by this event.
     *
     * @return resourceType
     */
    @javax.annotation.Nonnull
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public AuditEventV1 resourceName(String resourceName) {

        this.resourceName = resourceName;
        return this;
    }

    /**
     * The name of the resource affected by this event.
     *
     * @return resourceName
     */
    @javax.annotation.Nonnull
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuditEventV1 auditEventV1 = (AuditEventV1) o;
        return Objects.equals(this.id, auditEventV1.id)
                && Objects.equals(this.timestamp, auditEventV1.timestamp)
                && Objects.equals(this.type, auditEventV1.type)
                && Objects.equals(this.actor, auditEventV1.actor)
                && Objects.equals(this.actorEmail, auditEventV1.actorEmail)
                && Objects.equals(this.resourceId, auditEventV1.resourceId)
                && Objects.equals(this.resourceType, auditEventV1.resourceType)
                && Objects.equals(this.resourceName, auditEventV1.resourceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, timestamp, type, actor, actorEmail, resourceId, resourceType, resourceName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditEventV1 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
        sb.append("    actorEmail: ").append(toIndentedString(actorEmail)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
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
        openapiFields.add("timestamp");
        openapiFields.add("type");
        openapiFields.add("actor");
        openapiFields.add("actorEmail");
        openapiFields.add("resourceId");
        openapiFields.add("resourceType");
        openapiFields.add("resourceName");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("timestamp");
        openapiRequiredFields.add("type");
        openapiRequiredFields.add("actor");
        openapiRequiredFields.add("resourceId");
        openapiRequiredFields.add("resourceType");
        openapiRequiredFields.add("resourceName");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AuditEventV1
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AuditEventV1.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AuditEventV1 is not found in the empty"
                                        + " JSON string",
                                AuditEventV1.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!AuditEventV1.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `AuditEventV1` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : AuditEventV1.openapiRequiredFields) {
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
        if (!jsonObj.get("timestamp").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `timestamp` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("timestamp").toString()));
        }
        if (!jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
        if (!jsonObj.get("actor").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `actor` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("actor").toString()));
        }
        if ((jsonObj.get("actorEmail") != null && !jsonObj.get("actorEmail").isJsonNull())
                && !jsonObj.get("actorEmail").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `actorEmail` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("actorEmail").toString()));
        }
        if (!jsonObj.get("resourceId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `resourceId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("resourceId").toString()));
        }
        if (!jsonObj.get("resourceType").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `resourceType` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("resourceType").toString()));
        }
        if (!jsonObj.get("resourceName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `resourceName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("resourceName").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AuditEventV1.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AuditEventV1' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AuditEventV1> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AuditEventV1.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AuditEventV1>() {
                        @Override
                        public void write(JsonWriter out, AuditEventV1 value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AuditEventV1 read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AuditEventV1 given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AuditEventV1
     * @throws IOException if the JSON string is invalid with respect to AuditEventV1
     */
    public static AuditEventV1 fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AuditEventV1.class);
    }

    /**
     * Convert an instance of AuditEventV1 to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
