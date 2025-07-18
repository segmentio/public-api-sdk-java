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

public class Config extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(Config.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!Config.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'Config' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PeriodicConfig> adapterPeriodicConfig =
                    gson.getDelegateAdapter(this, TypeToken.get(PeriodicConfig.class));
            final TypeAdapter<SpecificDaysConfig> adapterSpecificDaysConfig =
                    gson.getDelegateAdapter(this, TypeToken.get(SpecificDaysConfig.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<Config>() {
                        @Override
                        public void write(JsonWriter out, Config value) throws IOException {
                            if (value == null || value.getActualInstance() == null) {
                                elementAdapter.write(out, null);
                                return;
                            }

                            // check if the actual instance is of the type `PeriodicConfig`
                            if (value.getActualInstance() instanceof PeriodicConfig) {
                                JsonElement element =
                                        adapterPeriodicConfig.toJsonTree(
                                                (PeriodicConfig) value.getActualInstance());
                                elementAdapter.write(out, element);
                                return;
                            }
                            // check if the actual instance is of the type `SpecificDaysConfig`
                            if (value.getActualInstance() instanceof SpecificDaysConfig) {
                                JsonElement element =
                                        adapterSpecificDaysConfig.toJsonTree(
                                                (SpecificDaysConfig) value.getActualInstance());
                                elementAdapter.write(out, element);
                                return;
                            }
                            throw new IOException(
                                    "Failed to serialize as the type doesn't match anyOf schemae:"
                                            + " PeriodicConfig, SpecificDaysConfig");
                        }

                        @Override
                        public Config read(JsonReader in) throws IOException {
                            Object deserialized = null;
                            JsonElement jsonElement = elementAdapter.read(in);

                            ArrayList<String> errorMessages = new ArrayList<>();
                            TypeAdapter actualAdapter = elementAdapter;

                            // deserialize PeriodicConfig
                            try {
                                // validate the JSON object to see if any exception is thrown
                                PeriodicConfig.validateJsonElement(jsonElement);
                                actualAdapter = adapterPeriodicConfig;
                                Config ret = new Config();
                                ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                                return ret;
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for PeriodicConfig failed with"
                                                        + " `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema 'PeriodicConfig'",
                                        e);
                            }
                            // deserialize SpecificDaysConfig
                            try {
                                // validate the JSON object to see if any exception is thrown
                                SpecificDaysConfig.validateJsonElement(jsonElement);
                                actualAdapter = adapterSpecificDaysConfig;
                                Config ret = new Config();
                                ret.setActualInstance(actualAdapter.fromJsonTree(jsonElement));
                                return ret;
                            } catch (Exception e) {
                                // deserialization failed, continue
                                errorMessages.add(
                                        String.format(
                                                "Deserialization for SpecificDaysConfig failed with"
                                                        + " `%s`.",
                                                e.getMessage()));
                                log.log(
                                        Level.FINER,
                                        "Input data does not match schema 'SpecificDaysConfig'",
                                        e);
                            }

                            throw new IOException(
                                    String.format(
                                            "Failed deserialization for Config: no class matches"
                                                + " result, expected at least 1. Detailed failure"
                                                + " message for anyOf schemas: %s. JSON: %s",
                                            errorMessages, jsonElement.toString()));
                        }
                    }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, Class<?>> schemas = new HashMap<String, Class<?>>();

    public Config() {
        super("anyOf", Boolean.TRUE);
    }

    public Config(PeriodicConfig o) {
        super("anyOf", Boolean.TRUE);
        setActualInstance(o);
    }

    public Config(SpecificDaysConfig o) {
        super("anyOf", Boolean.TRUE);
        setActualInstance(o);
    }

    static {
        schemas.put("PeriodicConfig", PeriodicConfig.class);
        schemas.put("SpecificDaysConfig", SpecificDaysConfig.class);
    }

    @Override
    public Map<String, Class<?>> getSchemas() {
        return Config.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check the instance parameter is valid
     * against the anyOf child schemas: PeriodicConfig, SpecificDaysConfig
     *
     * <p>It could be an instance of the 'anyOf' schemas.
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance == null) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof PeriodicConfig) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof SpecificDaysConfig) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException(
                "Invalid instance type. Must be PeriodicConfig, SpecificDaysConfig");
    }

    /**
     * Get the actual instance, which can be the following: PeriodicConfig, SpecificDaysConfig
     *
     * @return The actual instance (PeriodicConfig, SpecificDaysConfig)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `PeriodicConfig`. If the actual instance is not `PeriodicConfig`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `PeriodicConfig`
     * @throws ClassCastException if the instance is not `PeriodicConfig`
     */
    public PeriodicConfig getPeriodicConfig() throws ClassCastException {
        return (PeriodicConfig) super.getActualInstance();
    }

    /**
     * Get the actual instance of `SpecificDaysConfig`. If the actual instance is not
     * `SpecificDaysConfig`, the ClassCastException will be thrown.
     *
     * @return The actual instance of `SpecificDaysConfig`
     * @throws ClassCastException if the instance is not `SpecificDaysConfig`
     */
    public SpecificDaysConfig getSpecificDaysConfig() throws ClassCastException {
        return (SpecificDaysConfig) super.getActualInstance();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to Config
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        // validate anyOf schemas one by one
        ArrayList<String> errorMessages = new ArrayList<>();
        // validate the json string with PeriodicConfig
        try {
            PeriodicConfig.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for PeriodicConfig failed with `%s`.",
                            e.getMessage()));
            // continue to the next one
        }
        // validate the json string with SpecificDaysConfig
        try {
            SpecificDaysConfig.validateJsonElement(jsonElement);
            return;
        } catch (Exception e) {
            errorMessages.add(
                    String.format(
                            "Deserialization for SpecificDaysConfig failed with `%s`.",
                            e.getMessage()));
            // continue to the next one
        }
        throw new IOException(
                String.format(
                        "The JSON string is invalid for Config with anyOf schemas: PeriodicConfig,"
                            + " SpecificDaysConfig. no class match the result, expected at least 1."
                            + " Detailed failure message for anyOf schemas: %s. JSON: %s",
                        errorMessages, jsonElement.toString()));
    }

    /**
     * Create an instance of Config given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Config
     * @throws IOException if the JSON string is invalid with respect to Config
     */
    public static Config fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, Config.class);
    }

    /**
     * Convert an instance of Config to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
