/*
 * Binance Derivatives Trading USDS Futures REST API
 * OpenAPI Specification for the Binance Derivatives Trading USDS Futures REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_usds_futures.rest.model;

import com.binance.connector.client.derivatives_trading_usds_futures.rest.JSON;
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

/** GetCurrentMultiAssetsModeResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GetCurrentMultiAssetsModeResponse {
    public static final String SERIALIZED_NAME_MULTI_ASSETS_MARGIN = "multiAssetsMargin";

    @SerializedName(SERIALIZED_NAME_MULTI_ASSETS_MARGIN)
    @jakarta.annotation.Nullable
    private Boolean multiAssetsMargin;

    public GetCurrentMultiAssetsModeResponse() {}

    public GetCurrentMultiAssetsModeResponse multiAssetsMargin(
            @jakarta.annotation.Nullable Boolean multiAssetsMargin) {
        this.multiAssetsMargin = multiAssetsMargin;
        return this;
    }

    /**
     * Get multiAssetsMargin
     *
     * @return multiAssetsMargin
     */
    @jakarta.annotation.Nullable
    public Boolean getMultiAssetsMargin() {
        return multiAssetsMargin;
    }

    public void setMultiAssetsMargin(@jakarta.annotation.Nullable Boolean multiAssetsMargin) {
        this.multiAssetsMargin = multiAssetsMargin;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetCurrentMultiAssetsModeResponse getCurrentMultiAssetsModeResponse =
                (GetCurrentMultiAssetsModeResponse) o;
        return Objects.equals(
                this.multiAssetsMargin, getCurrentMultiAssetsModeResponse.multiAssetsMargin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(multiAssetsMargin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetCurrentMultiAssetsModeResponse {\n");
        sb.append("		multiAssetsMargin: ").append(toIndentedString(multiAssetsMargin)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object multiAssetsMarginValue = getMultiAssetsMargin();
        String multiAssetsMarginValueAsString = "";
        multiAssetsMarginValueAsString = multiAssetsMarginValue.toString();
        sb.append("multiAssetsMargin=")
                .append(urlEncode(multiAssetsMarginValueAsString))
                .append("");
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
        openapiFields.add("multiAssetsMargin");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     GetCurrentMultiAssetsModeResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetCurrentMultiAssetsModeResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in GetCurrentMultiAssetsModeResponse is"
                                        + " not found in the empty JSON string",
                                GetCurrentMultiAssetsModeResponse.openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetCurrentMultiAssetsModeResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetCurrentMultiAssetsModeResponse' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetCurrentMultiAssetsModeResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(GetCurrentMultiAssetsModeResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GetCurrentMultiAssetsModeResponse>() {
                        @Override
                        public void write(JsonWriter out, GetCurrentMultiAssetsModeResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GetCurrentMultiAssetsModeResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GetCurrentMultiAssetsModeResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetCurrentMultiAssetsModeResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     GetCurrentMultiAssetsModeResponse
     */
    public static GetCurrentMultiAssetsModeResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetCurrentMultiAssetsModeResponse.class);
    }

    /**
     * Convert an instance of GetCurrentMultiAssetsModeResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
