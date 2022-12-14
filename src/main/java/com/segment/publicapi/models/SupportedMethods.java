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
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/** Methods that this Destination supports. Config API note: equal to &#x60;methods&#x60;. */
@ApiModel(
        description =
                "Methods that this Destination supports.  Config API note: equal to `methods`.")
public class SupportedMethods {
    public static final String SERIALIZED_NAME_PAGEVIEW = "pageview";

    @SerializedName(SERIALIZED_NAME_PAGEVIEW)
    private Boolean pageview;

    public static final String SERIALIZED_NAME_IDENTIFY = "identify";

    @SerializedName(SERIALIZED_NAME_IDENTIFY)
    private Boolean identify;

    public static final String SERIALIZED_NAME_ALIAS = "alias";

    @SerializedName(SERIALIZED_NAME_ALIAS)
    private Boolean alias;

    public static final String SERIALIZED_NAME_TRACK = "track";

    @SerializedName(SERIALIZED_NAME_TRACK)
    private Boolean track;

    public static final String SERIALIZED_NAME_GROUP = "group";

    @SerializedName(SERIALIZED_NAME_GROUP)
    private Boolean group;

    public SupportedMethods() {}

    public SupportedMethods pageview(Boolean pageview) {

        this.pageview = pageview;
        return this;
    }

    /**
     * Identifies if the Destination supports the &#x60;pageview&#x60; method.
     *
     * @return pageview
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Identifies if the Destination supports the `pageview` method.")
    public Boolean getPageview() {
        return pageview;
    }

    public void setPageview(Boolean pageview) {
        this.pageview = pageview;
    }

    public SupportedMethods identify(Boolean identify) {

        this.identify = identify;
        return this;
    }

    /**
     * Identifies if the Destination supports the &#x60;identify&#x60; method.
     *
     * @return identify
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Identifies if the Destination supports the `identify` method.")
    public Boolean getIdentify() {
        return identify;
    }

    public void setIdentify(Boolean identify) {
        this.identify = identify;
    }

    public SupportedMethods alias(Boolean alias) {

        this.alias = alias;
        return this;
    }

    /**
     * Identifies if the Destination supports the &#x60;alias&#x60; method.
     *
     * @return alias
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Identifies if the Destination supports the `alias` method.")
    public Boolean getAlias() {
        return alias;
    }

    public void setAlias(Boolean alias) {
        this.alias = alias;
    }

    public SupportedMethods track(Boolean track) {

        this.track = track;
        return this;
    }

    /**
     * Identifies if the Destination supports the &#x60;track&#x60; method.
     *
     * @return track
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Identifies if the Destination supports the `track` method.")
    public Boolean getTrack() {
        return track;
    }

    public void setTrack(Boolean track) {
        this.track = track;
    }

    public SupportedMethods group(Boolean group) {

        this.group = group;
        return this;
    }

    /**
     * Identifies if the Destination supports the &#x60;group&#x60; method.
     *
     * @return group
     */
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Identifies if the Destination supports the `group` method.")
    public Boolean getGroup() {
        return group;
    }

    public void setGroup(Boolean group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SupportedMethods supportedMethods = (SupportedMethods) o;
        return Objects.equals(this.pageview, supportedMethods.pageview)
                && Objects.equals(this.identify, supportedMethods.identify)
                && Objects.equals(this.alias, supportedMethods.alias)
                && Objects.equals(this.track, supportedMethods.track)
                && Objects.equals(this.group, supportedMethods.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pageview, identify, alias, track, group);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SupportedMethods {\n");
        sb.append("    pageview: ").append(toIndentedString(pageview)).append("\n");
        sb.append("    identify: ").append(toIndentedString(identify)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    track: ").append(toIndentedString(track)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
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
        openapiFields.add("pageview");
        openapiFields.add("identify");
        openapiFields.add("alias");
        openapiFields.add("track");
        openapiFields.add("group");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to SupportedMethods
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (!SupportedMethods.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON object is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SupportedMethods is not found in the"
                                        + " empty JSON string",
                                SupportedMethods.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
        // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
            if (!SupportedMethods.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `SupportedMethods` properties. JSON: %s",
                                entry.getKey(), jsonObj.toString()));
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SupportedMethods.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SupportedMethods' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SupportedMethods> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(SupportedMethods.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SupportedMethods>() {
                        @Override
                        public void write(JsonWriter out, SupportedMethods value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SupportedMethods read(JsonReader in) throws IOException {
                            JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
                            validateJsonObject(jsonObj);
                            return thisAdapter.fromJsonTree(jsonObj);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SupportedMethods given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SupportedMethods
     * @throws IOException if the JSON string is invalid with respect to SupportedMethods
     */
    public static SupportedMethods fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, SupportedMethods.class);
    }

    /**
     * Convert an instance of SupportedMethods to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
