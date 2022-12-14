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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import org.openapitools.jackson.nullable.JsonNullable;

/** The input parameters for updating a Destination subscription. */
@ApiModel(description = "The input parameters for updating a Destination subscription.")
public class DestinationSubscriptionUpdateInput {
    public static final String SERIALIZED_NAME_NAME = "name";

    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;

    public static final String SERIALIZED_NAME_TRIGGER = "trigger";

    @SerializedName(SERIALIZED_NAME_TRIGGER)
    private String trigger;

    public static final String SERIALIZED_NAME_ENABLED = "enabled";

    @SerializedName(SERIALIZED_NAME_ENABLED)
    private Boolean enabled;

    public static final String SERIALIZED_NAME_SETTINGS = "settings";

    @SerializedName(SERIALIZED_NAME_SETTINGS)
    private Map settings;

    public DestinationSubscriptionUpdateInput() {}

    public DestinationSubscriptionUpdateInput name(String name) {

        this.name = name;
        return this;
    }

    /**
     * The user-defined name for the subscription.
     *
     * @return name
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The user-defined name for the subscription.")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DestinationSubscriptionUpdateInput trigger(String trigger) {

        this.trigger = trigger;
        return this;
    }

    /**
     * The fql statement.
     *
     * @return trigger
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The fql statement.")
    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public DestinationSubscriptionUpdateInput enabled(Boolean enabled) {

        this.enabled = enabled;
        return this;
    }

    /**
     * Is the subscription enabled.
     *
     * @return enabled
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Is the subscription enabled.")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public DestinationSubscriptionUpdateInput settings(Map settings) {

        this.settings = settings;
        return this;
    }

    /**
     * The fields used for configuring this action.
     *
     * @return settings
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "The fields used for configuring this action.")
    public Map getSettings() {
        return settings;
    }

    public void setSettings(Map settings) {
        this.settings = settings;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DestinationSubscriptionUpdateInput destinationSubscriptionUpdateInput =
                (DestinationSubscriptionUpdateInput) o;
        return Objects.equals(this.name, destinationSubscriptionUpdateInput.name)
                && Objects.equals(this.trigger, destinationSubscriptionUpdateInput.trigger)
                && Objects.equals(this.enabled, destinationSubscriptionUpdateInput.enabled)
                && Objects.equals(this.settings, destinationSubscriptionUpdateInput.settings);
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
        return Objects.hash(name, trigger, enabled, settings);
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
        sb.append("class DestinationSubscriptionUpdateInput {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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
        openapiFields.add("trigger");
        openapiFields.add("enabled");
        openapiFields.add("settings");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to
     *     DestinationSubscriptionUpdateInput
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!DestinationSubscriptionUpdateInput.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DestinationSubscriptionUpdateInput is"
                                        + " not found in the empty JSON string",
                                DestinationSubscriptionUpdateInput.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!DestinationSubscriptionUpdateInput.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                    + " `DestinationSubscriptionUpdateInput` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
        if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull())
                && !jsonObj.get("name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `name` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("name").toString()));
        }
        if ((jsonObj.get("trigger") != null && !jsonObj.get("trigger").isJsonNull())
                && !jsonObj.get("trigger").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `trigger` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("trigger").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DestinationSubscriptionUpdateInput.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DestinationSubscriptionUpdateInput' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DestinationSubscriptionUpdateInput> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(DestinationSubscriptionUpdateInput.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DestinationSubscriptionUpdateInput>() {
                        @Override
                        public void write(JsonWriter out, DestinationSubscriptionUpdateInput value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DestinationSubscriptionUpdateInput read(JsonReader in)
                                throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DestinationSubscriptionUpdateInput given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DestinationSubscriptionUpdateInput
     * @throws IOException if the JSON string is invalid with respect to
     *     DestinationSubscriptionUpdateInput
     */
    public static DestinationSubscriptionUpdateInput fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, DestinationSubscriptionUpdateInput.class);
    }

    /**
     * Convert an instance of DestinationSubscriptionUpdateInput to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
