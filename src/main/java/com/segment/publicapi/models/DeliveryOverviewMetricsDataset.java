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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** Dataset within GetDeliveryOverviewMetricsBetaOutput. */
public class DeliveryOverviewMetricsDataset {
    public static final String SERIALIZED_NAME_EVENT_NAME = "eventName";

    @SerializedName(SERIALIZED_NAME_EVENT_NAME)
    private String eventName;

    public static final String SERIALIZED_NAME_APP_VERSION = "appVersion";

    @SerializedName(SERIALIZED_NAME_APP_VERSION)
    private String appVersion;

    public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";

    @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
    private String eventType;

    public static final String SERIALIZED_NAME_DISCARD_REASON = "discardReason";

    @SerializedName(SERIALIZED_NAME_DISCARD_REASON)
    private String discardReason;

    public static final String SERIALIZED_NAME_TOTAL = "total";

    @SerializedName(SERIALIZED_NAME_TOTAL)
    private BigDecimal total;

    public static final String SERIALIZED_NAME_SERIES = "series";

    @SerializedName(SERIALIZED_NAME_SERIES)
    private List<DeliveryOverviewMetricsDatapoint> series = new ArrayList<>();

    public static final String SERIALIZED_NAME_TOTAL_RETRY_COUNT = "totalRetryCount";

    @SerializedName(SERIALIZED_NAME_TOTAL_RETRY_COUNT)
    private BigDecimal totalRetryCount;

    public DeliveryOverviewMetricsDataset() {}

    public DeliveryOverviewMetricsDataset eventName(String eventName) {

        this.eventName = eventName;
        return this;
    }

    /**
     * The name of the event if groupBy[] included &#39;eventName&#39; in the request.
     *
     * @return eventName
     */
    @javax.annotation.Nullable
    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public DeliveryOverviewMetricsDataset appVersion(String appVersion) {

        this.appVersion = appVersion;
        return this;
    }

    /**
     * The version of the app if groupBy[] included &#39;appVersion&#39; in the request.
     *
     * @return appVersion
     */
    @javax.annotation.Nullable
    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public DeliveryOverviewMetricsDataset eventType(String eventType) {

        this.eventType = eventType;
        return this;
    }

    /**
     * The event type if groupBy[] included &#39;eventType&#39; in the request.
     *
     * @return eventType
     */
    @javax.annotation.Nullable
    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public DeliveryOverviewMetricsDataset discardReason(String discardReason) {

        this.discardReason = discardReason;
        return this;
    }

    /**
     * The discard reason for dropped events if groupBy[] included &#39;discardReason&#39; in the
     * request.
     *
     * @return discardReason
     */
    @javax.annotation.Nullable
    public String getDiscardReason() {
        return discardReason;
    }

    public void setDiscardReason(String discardReason) {
        this.discardReason = discardReason;
    }

    public DeliveryOverviewMetricsDataset total(BigDecimal total) {

        this.total = total;
        return this;
    }

    /**
     * Holds the count of all event counts over the timeframe of the series.
     *
     * @return total
     */
    @javax.annotation.Nonnull
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public DeliveryOverviewMetricsDataset series(List<DeliveryOverviewMetricsDatapoint> series) {

        this.series = series;
        return this;
    }

    public DeliveryOverviewMetricsDataset addSeriesItem(
            DeliveryOverviewMetricsDatapoint seriesItem) {
        if (this.series == null) {
            this.series = new ArrayList<>();
        }
        this.series.add(seriesItem);
        return this;
    }

    /**
     * A list of the event counts broken down by the requested granularity, timeframe, and groupBy
     * options.
     *
     * @return series
     */
    @javax.annotation.Nonnull
    public List<DeliveryOverviewMetricsDatapoint> getSeries() {
        return series;
    }

    public void setSeries(List<DeliveryOverviewMetricsDatapoint> series) {
        this.series = series;
    }

    public DeliveryOverviewMetricsDataset totalRetryCount(BigDecimal totalRetryCount) {

        this.totalRetryCount = totalRetryCount;
        return this;
    }

    /**
     * The number of events successfully delivered upon retry.
     *
     * @return totalRetryCount
     */
    @javax.annotation.Nullable
    public BigDecimal getTotalRetryCount() {
        return totalRetryCount;
    }

    public void setTotalRetryCount(BigDecimal totalRetryCount) {
        this.totalRetryCount = totalRetryCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeliveryOverviewMetricsDataset deliveryOverviewMetricsDataset =
                (DeliveryOverviewMetricsDataset) o;
        return Objects.equals(this.eventName, deliveryOverviewMetricsDataset.eventName)
                && Objects.equals(this.appVersion, deliveryOverviewMetricsDataset.appVersion)
                && Objects.equals(this.eventType, deliveryOverviewMetricsDataset.eventType)
                && Objects.equals(this.discardReason, deliveryOverviewMetricsDataset.discardReason)
                && Objects.equals(this.total, deliveryOverviewMetricsDataset.total)
                && Objects.equals(this.series, deliveryOverviewMetricsDataset.series)
                && Objects.equals(
                        this.totalRetryCount, deliveryOverviewMetricsDataset.totalRetryCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                eventName, appVersion, eventType, discardReason, total, series, totalRetryCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeliveryOverviewMetricsDataset {\n");
        sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
        sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
        sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
        sb.append("    discardReason: ").append(toIndentedString(discardReason)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    series: ").append(toIndentedString(series)).append("\n");
        sb.append("    totalRetryCount: ").append(toIndentedString(totalRetryCount)).append("\n");
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
        openapiFields.add("eventName");
        openapiFields.add("appVersion");
        openapiFields.add("eventType");
        openapiFields.add("discardReason");
        openapiFields.add("total");
        openapiFields.add("series");
        openapiFields.add("totalRetryCount");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("total");
        openapiRequiredFields.add("series");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     DeliveryOverviewMetricsDataset
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DeliveryOverviewMetricsDataset.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DeliveryOverviewMetricsDataset is not"
                                        + " found in the empty JSON string",
                                DeliveryOverviewMetricsDataset.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!DeliveryOverviewMetricsDataset.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `DeliveryOverviewMetricsDataset` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : DeliveryOverviewMetricsDataset.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("eventName") != null && !jsonObj.get("eventName").isJsonNull())
                && !jsonObj.get("eventName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `eventName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("eventName").toString()));
        }
        if ((jsonObj.get("appVersion") != null && !jsonObj.get("appVersion").isJsonNull())
                && !jsonObj.get("appVersion").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `appVersion` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("appVersion").toString()));
        }
        if ((jsonObj.get("eventType") != null && !jsonObj.get("eventType").isJsonNull())
                && !jsonObj.get("eventType").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `eventType` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("eventType").toString()));
        }
        if ((jsonObj.get("discardReason") != null && !jsonObj.get("discardReason").isJsonNull())
                && !jsonObj.get("discardReason").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `discardReason` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("discardReason").toString()));
        }
        // ensure the json data is an array
        if (!jsonObj.get("series").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `series` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("series").toString()));
        }

        JsonArray jsonArrayseries = jsonObj.getAsJsonArray("series");
        // validate the required field `series` (array)
        for (int i = 0; i < jsonArrayseries.size(); i++) {
            DeliveryOverviewMetricsDatapoint.validateJsonElement(jsonArrayseries.get(i));
        }
        ;
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DeliveryOverviewMetricsDataset.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DeliveryOverviewMetricsDataset' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DeliveryOverviewMetricsDataset> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(DeliveryOverviewMetricsDataset.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DeliveryOverviewMetricsDataset>() {
                        @Override
                        public void write(JsonWriter out, DeliveryOverviewMetricsDataset value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DeliveryOverviewMetricsDataset read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DeliveryOverviewMetricsDataset given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DeliveryOverviewMetricsDataset
     * @throws IOException if the JSON string is invalid with respect to
     *     DeliveryOverviewMetricsDataset
     */
    public static DeliveryOverviewMetricsDataset fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, DeliveryOverviewMetricsDataset.class);
    }

    /**
     * Convert an instance of DeliveryOverviewMetricsDataset to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}