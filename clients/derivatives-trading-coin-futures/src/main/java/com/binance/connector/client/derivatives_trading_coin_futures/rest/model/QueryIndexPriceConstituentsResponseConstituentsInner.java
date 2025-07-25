/*
 * Binance Derivatives Trading COIN Futures REST API
 * OpenAPI Specification for the Binance Derivatives Trading COIN Futures REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_coin_futures.rest.model;

import com.binance.connector.client.derivatives_trading_coin_futures.rest.JSON;
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

/** QueryIndexPriceConstituentsResponseConstituentsInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class QueryIndexPriceConstituentsResponseConstituentsInner {
    public static final String SERIALIZED_NAME_EXCHANGE = "exchange";

    @SerializedName(SERIALIZED_NAME_EXCHANGE)
    @jakarta.annotation.Nullable
    private String exchange;

    public static final String SERIALIZED_NAME_SYMBOL = "symbol";

    @SerializedName(SERIALIZED_NAME_SYMBOL)
    @jakarta.annotation.Nullable
    private String symbol;

    public QueryIndexPriceConstituentsResponseConstituentsInner() {}

    public QueryIndexPriceConstituentsResponseConstituentsInner exchange(
            @jakarta.annotation.Nullable String exchange) {
        this.exchange = exchange;
        return this;
    }

    /**
     * Get exchange
     *
     * @return exchange
     */
    @jakarta.annotation.Nullable
    public String getExchange() {
        return exchange;
    }

    public void setExchange(@jakarta.annotation.Nullable String exchange) {
        this.exchange = exchange;
    }

    public QueryIndexPriceConstituentsResponseConstituentsInner symbol(
            @jakarta.annotation.Nullable String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Get symbol
     *
     * @return symbol
     */
    @jakarta.annotation.Nullable
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(@jakarta.annotation.Nullable String symbol) {
        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryIndexPriceConstituentsResponseConstituentsInner
                queryIndexPriceConstituentsResponseConstituentsInner =
                        (QueryIndexPriceConstituentsResponseConstituentsInner) o;
        return Objects.equals(
                        this.exchange,
                        queryIndexPriceConstituentsResponseConstituentsInner.exchange)
                && Objects.equals(
                        this.symbol, queryIndexPriceConstituentsResponseConstituentsInner.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(exchange, symbol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryIndexPriceConstituentsResponseConstituentsInner {\n");
        sb.append("		exchange: ").append(toIndentedString(exchange)).append("\n");
        sb.append("		symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object exchangeValue = getExchange();
        String exchangeValueAsString = "";
        exchangeValueAsString = exchangeValue.toString();
        sb.append("exchange=").append(urlEncode(exchangeValueAsString)).append("");
        Object symbolValue = getSymbol();
        String symbolValueAsString = "";
        symbolValueAsString = symbolValue.toString();
        sb.append("symbol=").append(urlEncode(symbolValueAsString)).append("");
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
        openapiFields.add("exchange");
        openapiFields.add("symbol");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     QueryIndexPriceConstituentsResponseConstituentsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!QueryIndexPriceConstituentsResponseConstituentsInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " QueryIndexPriceConstituentsResponseConstituentsInner is not"
                                    + " found in the empty JSON string",
                                QueryIndexPriceConstituentsResponseConstituentsInner
                                        .openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("exchange") != null && !jsonObj.get("exchange").isJsonNull())
                && !jsonObj.get("exchange").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `exchange` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("exchange").toString()));
        }
        if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull())
                && !jsonObj.get("symbol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `symbol` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("symbol").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!QueryIndexPriceConstituentsResponseConstituentsInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'QueryIndexPriceConstituentsResponseConstituentsInner' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<QueryIndexPriceConstituentsResponseConstituentsInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(
                                    QueryIndexPriceConstituentsResponseConstituentsInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<QueryIndexPriceConstituentsResponseConstituentsInner>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                QueryIndexPriceConstituentsResponseConstituentsInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public QueryIndexPriceConstituentsResponseConstituentsInner read(
                                JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of QueryIndexPriceConstituentsResponseConstituentsInner given an JSON
     * string
     *
     * @param jsonString JSON string
     * @return An instance of QueryIndexPriceConstituentsResponseConstituentsInner
     * @throws IOException if the JSON string is invalid with respect to
     *     QueryIndexPriceConstituentsResponseConstituentsInner
     */
    public static QueryIndexPriceConstituentsResponseConstituentsInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, QueryIndexPriceConstituentsResponseConstituentsInner.class);
    }

    /**
     * Convert an instance of QueryIndexPriceConstituentsResponseConstituentsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
