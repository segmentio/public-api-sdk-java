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

/** Defines an invitation to join a Workspace. */
public class InviteV1 {
    public static final String SERIALIZED_NAME_EMAIL = "email";

    @SerializedName(SERIALIZED_NAME_EMAIL)
    private String email;

    public static final String SERIALIZED_NAME_PERMISSIONS = "permissions";

    @SerializedName(SERIALIZED_NAME_PERMISSIONS)
    private List<InvitePermissionV1> permissions;

    public InviteV1() {}

    public InviteV1 email(String email) {

        this.email = email;
        return this;
    }

    /**
     * The invited user&#39;s email to attach the permissions to.
     *
     * @return email
     */
    @javax.annotation.Nonnull
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public InviteV1 permissions(List<InvitePermissionV1> permissions) {

        this.permissions = permissions;
        return this;
    }

    public InviteV1 addPermissionsItem(InvitePermissionV1 permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * The permissions to attach to the invited user.
     *
     * @return permissions
     */
    @javax.annotation.Nullable
    public List<InvitePermissionV1> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<InvitePermissionV1> permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InviteV1 inviteV1 = (InviteV1) o;
        return Objects.equals(this.email, inviteV1.email)
                && Objects.equals(this.permissions, inviteV1.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, permissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InviteV1 {\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
        openapiFields.add("email");
        openapiFields.add("permissions");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("email");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to InviteV1
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!InviteV1.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in InviteV1 is not found in the empty"
                                        + " JSON string",
                                InviteV1.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!InviteV1.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the `InviteV1`"
                                        + " properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : InviteV1.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("email").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `email` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("email").toString()));
        }
        if (jsonObj.get("permissions") != null && !jsonObj.get("permissions").isJsonNull()) {
            JsonArray jsonArraypermissions = jsonObj.getAsJsonArray("permissions");
            if (jsonArraypermissions != null) {
                // ensure the json data is an array
                if (!jsonObj.get("permissions").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `permissions` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("permissions").toString()));
                }

                // validate the optional field `permissions` (array)
                for (int i = 0; i < jsonArraypermissions.size(); i++) {
                    InvitePermissionV1.validateJsonElement(jsonArraypermissions.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!InviteV1.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'InviteV1' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<InviteV1> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(InviteV1.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<InviteV1>() {
                        @Override
                        public void write(JsonWriter out, InviteV1 value) throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public InviteV1 read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of InviteV1 given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of InviteV1
     * @throws IOException if the JSON string is invalid with respect to InviteV1
     */
    public static InviteV1 fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, InviteV1.class);
    }

    /**
     * Convert an instance of InviteV1 to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
