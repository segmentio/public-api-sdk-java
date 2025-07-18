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
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.segment.publicapi.JSON;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AudiencePreviewResult extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AudiencePreviewResult.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AudiencePreviewResult.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AudiencePreviewResult' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AudiencePreviewAccountResult> adapterAudiencePreviewAccountResult =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(AudiencePreviewAccountResult.class));
            final TypeAdapter<AudiencePreviewProfileResult> adapterAudiencePreviewProfileResult =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(AudiencePreviewProfileResult.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AudiencePreviewResult>() {
                        @Override
                        public void write(JsonWriter out, AudiencePreviewResult value)
                                throws IOException {
                            if (value == null || value.getActualInstance() == null) {
                                elementAdapter.write(out, null);
                                return;
                            }

                            // check if the actual instance is of the type
                            // `AudiencePreviewAccountResult`
                            if (value.getActualInstance() instanceof AudiencePreviewAccountResult) {
                                JsonElement element =
                                        adapterAudiencePreviewAccountResult.toJsonTree(
                                                (AudiencePreviewAccountResult)
                                                        value.getActualInstance());
                                elementAdapter.write(out, element);
                                return;
                            }
                            // check if the actual instance is of the type
                            // `AudiencePreviewProfileResult`
                            if (value.getActualInstance() instanceof AudiencePreviewProfileResult) {
                                JsonElement element =
                                        adapterAudiencePreviewProfileResult.toJsonTree(
                                                (AudiencePreviewProfileResult)
                                                        value.getActualInstance());
                                elementAdapter.write(out, element);
                                return;
                            }
                            throw new IOException(
                                    "Failed to serialize as the type doesn't match anyOf schemae:"
                                            + " AudiencePreviewAccountResult,"
                                            + " AudiencePreviewProfileResult");
                        }

                        @Override
                        public AudiencePreviewResult read(JsonReader in) throws IOException {
                            Object deserialized = null;
                            JsonElement jsonElement = elementAdapter.read(in);

                            ArrayList<String> errorMessages = new ArrayList<>();
                            TypeAdapter actualAdapter = elementAdapter;

                            // deserialize AudiencePreviewAccountResult
                            try {
                                // validate the JSON object to see if any exception is thrown
                                AudiencePreviewAccountResult.validateJsonElement(jsonElement);
                                actualAdapter = adapterAudiencePreviewAccountResult;
                                AudiencePreviewResult ret = new AudiencePreviewResult();
                                ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                                return ret;
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for AudiencePreviewAccountResult"
                                                        + " failed with `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema"
                                                + " 'AudiencePreviewAccountResult'",
                                        e);
                            }
                            // deserialize AudiencePreviewProfileResult
                            try {
                                // validate the JSON object to see if any exception is thrown
                                AudiencePreviewProfileResult.validateJsonElement(jsonElement);
                                actualAdapter = adapterAudiencePreviewProfileResult;
                                AudiencePreviewResult ret = new AudiencePreviewResult();
                                ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                                return ret;
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for AudiencePreviewProfileResult"
                                                        + " failed with `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema"
                                                + " 'AudiencePreviewProfileResult'",
                                        e);
                            }

                            throw new IOException(
                                    String.format(
                                            "Failed deserialization for AudiencePreviewResult: no"
                                                + " class matches result, expected at least 1."
                                                + " Detailed failure message for anyOf schemas: %s."
                                                + " JSON: %s",
                                            errorMessages, jsonElement.toString()));
                        }
                    }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public AudiencePreviewResult() {
        super("anyOf", Boolean.FALSE);
    }

    public AudiencePreviewResult(AudiencePreviewAccountResult o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AudiencePreviewResult(AudiencePreviewProfileResult o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AudiencePreviewAccountResult", AudiencePreviewAccountResult.class);
        schemas.put("AudiencePreviewProfileResult", AudiencePreviewProfileResult.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return AudiencePreviewResult.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check the instance parameter is valid
     * against the anyOf child schemas: AudiencePreviewAccountResult, AudiencePreviewProfileResult
     *
     * <p>It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AudiencePreviewAccountResult) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof AudiencePreviewProfileResult) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException(
                "Invalid instance type. Must be AudiencePreviewAccountResult,"
                        + " AudiencePreviewProfileResult");
    }

    /**
     * Get the actual instance, which can be the following: AudiencePreviewAccountResult,
     * AudiencePreviewProfileResult
     *
     * @return The actual instance (AudiencePreviewAccountResult, AudiencePreviewProfileResult)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AudiencePreviewAccountResult`. If the actual instance is not
     * `AudiencePreviewAccountResult`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `AudiencePreviewAccountResult`
     * @throws ClassCastException if the instance is not `AudiencePreviewAccountResult`
     */
    public AudiencePreviewAccountResult getAudiencePreviewAccountResult()
            throws ClassCastException {
        return (AudiencePreviewAccountResult) super.getActualInstance();
    }

    /**
     * Get the actual instance of `AudiencePreviewProfileResult`. If the actual instance is not
     * `AudiencePreviewProfileResult`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `AudiencePreviewProfileResult`
     * @throws ClassCastException if the instance is not `AudiencePreviewProfileResult`
     */
    public AudiencePreviewProfileResult getAudiencePreviewProfileResult()
            throws ClassCastException {
        return (AudiencePreviewProfileResult) super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AudiencePreviewResult
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with AudiencePreviewAccountResult
        try {
            AudiencePreviewAccountResult.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for AudiencePreviewAccountResult failed with `%s`.",
                            e.getMessage()));
            // continue to the next one
        }
        // validate the json string with AudiencePreviewProfileResult
        try {
            AudiencePreviewProfileResult.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for AudiencePreviewProfileResult failed with `%s`.",
                            e.getMessage()));
            // continue to the next one
        }
        throw new IOException(
                String.format(
                        "The JSON string is invalid for AudiencePreviewResult with anyOf schemas:"
                                + " AudiencePreviewAccountResult, AudiencePreviewProfileResult. no"
                                + " class match the result, expected at least 1. Detailed failure"
                                + " message for anyOf schemas: %s. JSON: %s",
                        errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of AudiencePreviewResult given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AudiencePreviewResult
     * @throws IOException if the JSON string is invalid with respect to AudiencePreviewResult
     */
    public static AudiencePreviewResult fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AudiencePreviewResult.class);
    }

    /**
     * Convert an instance of AudiencePreviewResult to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
