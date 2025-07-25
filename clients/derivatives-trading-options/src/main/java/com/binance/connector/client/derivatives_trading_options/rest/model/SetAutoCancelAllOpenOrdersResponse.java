/*
 * Binance Derivatives Trading Options REST API
 * OpenAPI Specification for the Binance Derivatives Trading Options REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_options.rest.model;

import com.binance.connector.client.derivatives_trading_options.rest.JSON;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import jakarta.validation.constraints.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Objects;
import org.hibernate.validator.constraints.*;

/** SetAutoCancelAllOpenOrdersResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SetAutoCancelAllOpenOrdersResponse {
    public static final String SERIALIZED_NAME_UNDERLYING = "underlying";

    @SerializedName(SERIALIZED_NAME_UNDERLYING)
    @jakarta.annotation.Nullable
    private String underlying;

    public static final String SERIALIZED_NAME_COUNTDOWN_TIME = "countdownTime";

    @SerializedName(SERIALIZED_NAME_COUNTDOWN_TIME)
    @jakarta.annotation.Nullable
    private Long countdownTime;

    public SetAutoCancelAllOpenOrdersResponse() {}

    public SetAutoCancelAllOpenOrdersResponse underlying(
            @jakarta.annotation.Nullable String underlying) {
        this.underlying = underlying;
        return this;
    }

    /**
     * Get underlying
     *
     * @return underlying
     */
    @jakarta.annotation.Nullable
    public String getUnderlying() {
        return underlying;
    }

    public void setUnderlying(@jakarta.annotation.Nullable String underlying) {
        this.underlying = underlying;
    }

    public SetAutoCancelAllOpenOrdersResponse countdownTime(
            @jakarta.annotation.Nullable Long countdownTime) {
        this.countdownTime = countdownTime;
        return this;
    }

    /**
     * Get countdownTime
     *
     * @return countdownTime
     */
    @jakarta.annotation.Nullable
    public Long getCountdownTime() {
        return countdownTime;
    }

    public void setCountdownTime(@jakarta.annotation.Nullable Long countdownTime) {
        this.countdownTime = countdownTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SetAutoCancelAllOpenOrdersResponse setAutoCancelAllOpenOrdersResponse =
                (SetAutoCancelAllOpenOrdersResponse) o;
        return Objects.equals(this.underlying, setAutoCancelAllOpenOrdersResponse.underlying)
                && Objects.equals(
                        this.countdownTime, setAutoCancelAllOpenOrdersResponse.countdownTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(underlying, countdownTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetAutoCancelAllOpenOrdersResponse {\n");
        sb.append("		underlying: ").append(toIndentedString(underlying)).append("\n");
        sb.append("		countdownTime: ").append(toIndentedString(countdownTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object underlyingValue = getUnderlying();
        String underlyingValueAsString = "";
        underlyingValueAsString = underlyingValue.toString();
        sb.append("underlying=").append(urlEncode(underlyingValueAsString)).append("");
        Object countdownTimeValue = getCountdownTime();
        String countdownTimeValueAsString = "";
        countdownTimeValueAsString = countdownTimeValue.toString();
        sb.append("countdownTime=").append(urlEncode(countdownTimeValueAsString)).append("");
        return sb.toString();
    }

    public static String urlEncode(String s) {
        try {
            return URLEncoder.encode(s, StandardCharsets.UTF_8.name());
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(StandardCharsets.UTF_8.name() + " is unsupported", e);
        }
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n		");
    }

    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("underlying");
        openapiFields.add("countdownTime");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     SetAutoCancelAllOpenOrdersResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SetAutoCancelAllOpenOrdersResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SetAutoCancelAllOpenOrdersResponse is"
                                        + " not found in the empty JSON string",
                                SetAutoCancelAllOpenOrdersResponse.openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("underlying") != null && !jsonObj.get("underlying").isJsonNull())
                && !jsonObj.get("underlying").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `underlying` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("underlying").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SetAutoCancelAllOpenOrdersResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SetAutoCancelAllOpenOrdersResponse' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SetAutoCancelAllOpenOrdersResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(SetAutoCancelAllOpenOrdersResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SetAutoCancelAllOpenOrdersResponse>() {
                        @Override
                        public void write(JsonWriter out, SetAutoCancelAllOpenOrdersResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SetAutoCancelAllOpenOrdersResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SetAutoCancelAllOpenOrdersResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SetAutoCancelAllOpenOrdersResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     SetAutoCancelAllOpenOrdersResponse
     */
    public static SetAutoCancelAllOpenOrdersResponse fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, SetAutoCancelAllOpenOrdersResponse.class);
    }

    /**
     * Convert an instance of SetAutoCancelAllOpenOrdersResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
