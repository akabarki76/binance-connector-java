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
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Objects;
import org.hibernate.validator.constraints.*;

/** PlaceMultipleOrdersRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class PlaceMultipleOrdersRequest {
    public static final String SERIALIZED_NAME_BATCH_ORDERS = "batchOrders";

    @SerializedName(SERIALIZED_NAME_BATCH_ORDERS)
    @jakarta.annotation.Nonnull
    private BatchOrdersPlaceMultipleOrders batchOrders;

    public static final String SERIALIZED_NAME_RECV_WINDOW = "recvWindow";

    @SerializedName(SERIALIZED_NAME_RECV_WINDOW)
    @jakarta.annotation.Nullable
    private Long recvWindow;

    public PlaceMultipleOrdersRequest() {}

    public PlaceMultipleOrdersRequest batchOrders(
            @jakarta.annotation.Nonnull BatchOrdersPlaceMultipleOrders batchOrders) {
        this.batchOrders = batchOrders;
        return this;
    }

    /**
     * Get batchOrders
     *
     * @return batchOrders
     */
    @jakarta.annotation.Nonnull
    @NotNull
    @Valid
    public BatchOrdersPlaceMultipleOrders getBatchOrders() {
        return batchOrders;
    }

    public void setBatchOrders(
            @jakarta.annotation.Nonnull BatchOrdersPlaceMultipleOrders batchOrders) {
        this.batchOrders = batchOrders;
    }

    public PlaceMultipleOrdersRequest recvWindow(@jakarta.annotation.Nullable Long recvWindow) {
        this.recvWindow = recvWindow;
        return this;
    }

    /**
     * Get recvWindow
     *
     * @return recvWindow
     */
    @jakarta.annotation.Nullable
    public Long getRecvWindow() {
        return recvWindow;
    }

    public void setRecvWindow(@jakarta.annotation.Nullable Long recvWindow) {
        this.recvWindow = recvWindow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PlaceMultipleOrdersRequest placeMultipleOrdersRequest = (PlaceMultipleOrdersRequest) o;
        return Objects.equals(this.batchOrders, placeMultipleOrdersRequest.batchOrders)
                && Objects.equals(this.recvWindow, placeMultipleOrdersRequest.recvWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchOrders, recvWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlaceMultipleOrdersRequest {\n");
        sb.append("		batchOrders: ").append(toIndentedString(batchOrders)).append("\n");
        sb.append("		recvWindow: ").append(toIndentedString(recvWindow)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object batchOrdersValue = getBatchOrders();
        String batchOrdersValueAsString = "";
        batchOrdersValueAsString = batchOrdersValue.toString();
        sb.append("batchOrders=").append(urlEncode(batchOrdersValueAsString)).append("");
        Object recvWindowValue = getRecvWindow();
        String recvWindowValueAsString = "";
        recvWindowValueAsString = recvWindowValue.toString();
        sb.append("recvWindow=").append(urlEncode(recvWindowValueAsString)).append("");
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
        openapiFields.add("batchOrders");
        openapiFields.add("recvWindow");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("batchOrders");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to PlaceMultipleOrdersRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PlaceMultipleOrdersRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in PlaceMultipleOrdersRequest is not"
                                        + " found in the empty JSON string",
                                PlaceMultipleOrdersRequest.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : PlaceMultipleOrdersRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PlaceMultipleOrdersRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PlaceMultipleOrdersRequest' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PlaceMultipleOrdersRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(PlaceMultipleOrdersRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<PlaceMultipleOrdersRequest>() {
                        @Override
                        public void write(JsonWriter out, PlaceMultipleOrdersRequest value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public PlaceMultipleOrdersRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of PlaceMultipleOrdersRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PlaceMultipleOrdersRequest
     * @throws IOException if the JSON string is invalid with respect to PlaceMultipleOrdersRequest
     */
    public static PlaceMultipleOrdersRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PlaceMultipleOrdersRequest.class);
    }

    /**
     * Convert an instance of PlaceMultipleOrdersRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
