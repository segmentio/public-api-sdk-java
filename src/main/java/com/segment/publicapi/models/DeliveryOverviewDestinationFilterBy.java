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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * The &#x60;DeliveryOverviewDestinationFilterBy&#x60; object is a map of the filterable fields and
 * their values.
 */
public class DeliveryOverviewDestinationFilterBy {
    public static final String SERIALIZED_NAME_DISCARD_REASON = "discardReason";

    @SerializedName(SERIALIZED_NAME_DISCARD_REASON)
    private List<String> discardReason;

    public static final String SERIALIZED_NAME_EVENT_NAME = "eventName";

    @SerializedName(SERIALIZED_NAME_EVENT_NAME)
    private List<String> eventName;

    public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";

    @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
    private List<String> eventType;

    public static final String SERIALIZED_NAME_APP_VERSION = "appVersion";

    @SerializedName(SERIALIZED_NAME_APP_VERSION)
    private List<String> appVersion;

    public static final String SERIALIZED_NAME_SUBSCRIPTION_ID = "subscriptionId";

    @SerializedName(SERIALIZED_NAME_SUBSCRIPTION_ID)
    private List<String> subscriptionId;

    public static final String SERIALIZED_NAME_ACTIVATION_ID = "activationId";

    @SerializedName(SERIALIZED_NAME_ACTIVATION_ID)
    private List<String> activationId;

    public static final String SERIALIZED_NAME_AUDIENCE_ID = "audienceId";

    @SerializedName(SERIALIZED_NAME_AUDIENCE_ID)
    private List<String> audienceId;

    public static final String SERIALIZED_NAME_SPACE_ID = "spaceId";

    @SerializedName(SERIALIZED_NAME_SPACE_ID)
    private List<String> spaceId;

    public DeliveryOverviewDestinationFilterBy() {}

    public DeliveryOverviewDestinationFilterBy discardReason(List<String> discardReason) {

        this.discardReason = discardReason;
        return this;
    }

    public DeliveryOverviewDestinationFilterBy addDiscardReasonItem(String discardReasonItem) {
        if (this.discardReason == null) {
            this.discardReason = new ArrayList<>();
        }
        this.discardReason.add(discardReasonItem);
        return this;
    }

    /**
     * A list of strings of discard reasons. See [Discard Record
     * Documentation](https://segment.com/docs/connections/delivery-overview/#troubleshooting) for
     * valid error codes.
     *
     * @return discardReason
     */
    @javax.annotation.Nullable
    public List<String> getDiscardReason() {
        return discardReason;
    }

    public void setDiscardReason(List<String> discardReason) {
        this.discardReason = discardReason;
    }

    public DeliveryOverviewDestinationFilterBy eventName(List<String> eventName) {

        this.eventName = eventName;
        return this;
    }

    public DeliveryOverviewDestinationFilterBy addEventNameItem(String eventNameItem) {
        if (this.eventName == null) {
            this.eventName = new ArrayList<>();
        }
        this.eventName.add(eventNameItem);
        return this;
    }

    /**
     * A list of strings of event names.
     *
     * @return eventName
     */
    @javax.annotation.Nullable
    public List<String> getEventName() {
        return eventName;
    }

    public void setEventName(List<String> eventName) {
        this.eventName = eventName;
    }

    public DeliveryOverviewDestinationFilterBy eventType(List<String> eventType) {

        this.eventType = eventType;
        return this;
    }

    public DeliveryOverviewDestinationFilterBy addEventTypeItem(String eventTypeItem) {
        if (this.eventType == null) {
            this.eventType = new ArrayList<>();
        }
        this.eventType.add(eventTypeItem);
        return this;
    }

    /**
     * A list of strings of event types. Valid options are: &#x60;alias&#x60;, &#x60;group&#x60;,
     * &#x60;identify&#x60;, &#x60;page&#x60;, &#x60;screen&#x60;, and &#x60;track&#x60;.
     *
     * @return eventType
     */
    @javax.annotation.Nullable
    public List<String> getEventType() {
        return eventType;
    }

    public void setEventType(List<String> eventType) {
        this.eventType = eventType;
    }

    public DeliveryOverviewDestinationFilterBy appVersion(List<String> appVersion) {

        this.appVersion = appVersion;
        return this;
    }

    public DeliveryOverviewDestinationFilterBy addAppVersionItem(String appVersionItem) {
        if (this.appVersion == null) {
            this.appVersion = new ArrayList<>();
        }
        this.appVersion.add(appVersionItem);
        return this;
    }

    /**
     * A list of strings of app versions.
     *
     * @return appVersion
     */
    @javax.annotation.Nullable
    public List<String> getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(List<String> appVersion) {
        this.appVersion = appVersion;
    }

    public DeliveryOverviewDestinationFilterBy subscriptionId(List<String> subscriptionId) {

        this.subscriptionId = subscriptionId;
        return this;
    }

    public DeliveryOverviewDestinationFilterBy addSubscriptionIdItem(String subscriptionIdItem) {
        if (this.subscriptionId == null) {
            this.subscriptionId = new ArrayList<>();
        }
        this.subscriptionId.add(subscriptionIdItem);
        return this;
    }

    /**
     * A list of strings of subscription IDs for Actions Destinations.
     *
     * @return subscriptionId
     */
    @javax.annotation.Nullable
    public List<String> getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(List<String> subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public DeliveryOverviewDestinationFilterBy activationId(List<String> activationId) {

        this.activationId = activationId;
        return this;
    }

    public DeliveryOverviewDestinationFilterBy addActivationIdItem(String activationIdItem) {
        if (this.activationId == null) {
            this.activationId = new ArrayList<>();
        }
        this.activationId.add(activationIdItem);
        return this;
    }

    /**
     * A list of strings of event context IDs from a Linked Audience mapping/activation.
     *
     * @return activationId
     */
    @javax.annotation.Nullable
    public List<String> getActivationId() {
        return activationId;
    }

    public void setActivationId(List<String> activationId) {
        this.activationId = activationId;
    }

    public DeliveryOverviewDestinationFilterBy audienceId(List<String> audienceId) {

        this.audienceId = audienceId;
        return this;
    }

    public DeliveryOverviewDestinationFilterBy addAudienceIdItem(String audienceIdItem) {
        if (this.audienceId == null) {
            this.audienceId = new ArrayList<>();
        }
        this.audienceId.add(audienceIdItem);
        return this;
    }

    /**
     * A list of strings of audience IDs for a Linked Audience.
     *
     * @return audienceId
     */
    @javax.annotation.Nullable
    public List<String> getAudienceId() {
        return audienceId;
    }

    public void setAudienceId(List<String> audienceId) {
        this.audienceId = audienceId;
    }

    public DeliveryOverviewDestinationFilterBy spaceId(List<String> spaceId) {

        this.spaceId = spaceId;
        return this;
    }

    public DeliveryOverviewDestinationFilterBy addSpaceIdItem(String spaceIdItem) {
        if (this.spaceId == null) {
            this.spaceId = new ArrayList<>();
        }
        this.spaceId.add(spaceIdItem);
        return this;
    }

    /**
     * A list of strings of space IDs for a Linked Audience.
     *
     * @return spaceId
     */
    @javax.annotation.Nullable
    public List<String> getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(List<String> spaceId) {
        this.spaceId = spaceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeliveryOverviewDestinationFilterBy deliveryOverviewDestinationFilterBy =
                (DeliveryOverviewDestinationFilterBy) o;
        return Objects.equals(this.discardReason, deliveryOverviewDestinationFilterBy.discardReason)
                && Objects.equals(this.eventName, deliveryOverviewDestinationFilterBy.eventName)
                && Objects.equals(this.eventType, deliveryOverviewDestinationFilterBy.eventType)
                && Objects.equals(this.appVersion, deliveryOverviewDestinationFilterBy.appVersion)
                && Objects.equals(
                        this.subscriptionId, deliveryOverviewDestinationFilterBy.subscriptionId)
                && Objects.equals(
                        this.activationId, deliveryOverviewDestinationFilterBy.activationId)
                && Objects.equals(this.audienceId, deliveryOverviewDestinationFilterBy.audienceId)
                && Objects.equals(this.spaceId, deliveryOverviewDestinationFilterBy.spaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                discardReason,
                eventName,
                eventType,
                appVersion,
                subscriptionId,
                activationId,
                audienceId,
                spaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeliveryOverviewDestinationFilterBy {\n");
        sb.append("    discardReason: ").append(toIndentedString(discardReason)).append("\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("    activationId: ").append(toIndentedString(activationId)).append("\n");
        sb.append("    audienceId: ").append(toIndentedString(audienceId)).append("\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
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
        openapiFields.add("discardReason");
        openapiFields.add("eventName");
        openapiFields.add("eventType");
        openapiFields.add("appVersion");
        openapiFields.add("subscriptionId");
        openapiFields.add("activationId");
        openapiFields.add("audienceId");
        openapiFields.add("spaceId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     DeliveryOverviewDestinationFilterBy
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DeliveryOverviewDestinationFilterBy.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DeliveryOverviewDestinationFilterBy is"
                                        + " not found in the empty JSON string",
                                DeliveryOverviewDestinationFilterBy.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!DeliveryOverviewDestinationFilterBy.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `DeliveryOverviewDestinationFilterBy` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("discardReason") != null
                && !jsonObj.get("discardReason").isJsonNull()
                && !jsonObj.get("discardReason").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `discardReason` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("discardReason").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("eventName") != null
                && !jsonObj.get("eventName").isJsonNull()
                && !jsonObj.get("eventName").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `eventName` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("eventName").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("eventType") != null
                && !jsonObj.get("eventType").isJsonNull()
                && !jsonObj.get("eventType").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `eventType` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("eventType").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("appVersion") != null
                && !jsonObj.get("appVersion").isJsonNull()
                && !jsonObj.get("appVersion").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `appVersion` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("appVersion").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("subscriptionId") != null
                && !jsonObj.get("subscriptionId").isJsonNull()
                && !jsonObj.get("subscriptionId").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `subscriptionId` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("subscriptionId").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("activationId") != null
                && !jsonObj.get("activationId").isJsonNull()
                && !jsonObj.get("activationId").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `activationId` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("activationId").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("audienceId") != null
                && !jsonObj.get("audienceId").isJsonNull()
                && !jsonObj.get("audienceId").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `audienceId` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("audienceId").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("spaceId") != null
                && !jsonObj.get("spaceId").isJsonNull()
                && !jsonObj.get("spaceId").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `spaceId` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("spaceId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DeliveryOverviewDestinationFilterBy.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DeliveryOverviewDestinationFilterBy' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DeliveryOverviewDestinationFilterBy> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(DeliveryOverviewDestinationFilterBy.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DeliveryOverviewDestinationFilterBy>() {
                        @Override
                        public void write(JsonWriter out, DeliveryOverviewDestinationFilterBy value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DeliveryOverviewDestinationFilterBy read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DeliveryOverviewDestinationFilterBy given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DeliveryOverviewDestinationFilterBy
     * @throws IOException if the JSON string is invalid with respect to
     *     DeliveryOverviewDestinationFilterBy
     */
    public static DeliveryOverviewDestinationFilterBy fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, DeliveryOverviewDestinationFilterBy.class);
    }

    /**
     * Convert an instance of DeliveryOverviewDestinationFilterBy to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
