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

/** ExtendBlockTradeOrderResponseLegsInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ExtendBlockTradeOrderResponseLegsInner {
    public static final String SERIALIZED_NAME_SYMBOL = "symbol";

    @SerializedName(SERIALIZED_NAME_SYMBOL)
    @jakarta.annotation.Nullable
    private String symbol;

    public static final String SERIALIZED_NAME_SIDE = "side";

    @SerializedName(SERIALIZED_NAME_SIDE)
    @jakarta.annotation.Nullable
    private String side;

    public static final String SERIALIZED_NAME_QUANTITY = "quantity";

    @SerializedName(SERIALIZED_NAME_QUANTITY)
    @jakarta.annotation.Nullable
    private String quantity;

    public static final String SERIALIZED_NAME_PRICE = "price";

    @SerializedName(SERIALIZED_NAME_PRICE)
    @jakarta.annotation.Nullable
    private String price;

    public ExtendBlockTradeOrderResponseLegsInner() {}

    public ExtendBlockTradeOrderResponseLegsInner symbol(
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

    public ExtendBlockTradeOrderResponseLegsInner side(@jakarta.annotation.Nullable String side) {
        this.side = side;
        return this;
    }

    /**
     * Get side
     *
     * @return side
     */
    @jakarta.annotation.Nullable
    public String getSide() {
        return side;
    }

    public void setSide(@jakarta.annotation.Nullable String side) {
        this.side = side;
    }

    public ExtendBlockTradeOrderResponseLegsInner quantity(
            @jakarta.annotation.Nullable String quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get quantity
     *
     * @return quantity
     */
    @jakarta.annotation.Nullable
    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(@jakarta.annotation.Nullable String quantity) {
        this.quantity = quantity;
    }

    public ExtendBlockTradeOrderResponseLegsInner price(@jakarta.annotation.Nullable String price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     */
    @jakarta.annotation.Nullable
    public String getPrice() {
        return price;
    }

    public void setPrice(@jakarta.annotation.Nullable String price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtendBlockTradeOrderResponseLegsInner extendBlockTradeOrderResponseLegsInner =
                (ExtendBlockTradeOrderResponseLegsInner) o;
        return Objects.equals(this.symbol, extendBlockTradeOrderResponseLegsInner.symbol)
                && Objects.equals(this.side, extendBlockTradeOrderResponseLegsInner.side)
                && Objects.equals(this.quantity, extendBlockTradeOrderResponseLegsInner.quantity)
                && Objects.equals(this.price, extendBlockTradeOrderResponseLegsInner.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, side, quantity, price);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendBlockTradeOrderResponseLegsInner {\n");
        sb.append("		symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("		side: ").append(toIndentedString(side)).append("\n");
        sb.append("		quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("		price: ").append(toIndentedString(price)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object symbolValue = getSymbol();
        String symbolValueAsString = "";
        symbolValueAsString = symbolValue.toString();
        sb.append("symbol=").append(urlEncode(symbolValueAsString)).append("");
        Object sideValue = getSide();
        String sideValueAsString = "";
        sideValueAsString = sideValue.toString();
        sb.append("side=").append(urlEncode(sideValueAsString)).append("");
        Object quantityValue = getQuantity();
        String quantityValueAsString = "";
        quantityValueAsString = quantityValue.toString();
        sb.append("quantity=").append(urlEncode(quantityValueAsString)).append("");
        Object priceValue = getPrice();
        String priceValueAsString = "";
        priceValueAsString = priceValue.toString();
        sb.append("price=").append(urlEncode(priceValueAsString)).append("");
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
        openapiFields.add("symbol");
        openapiFields.add("side");
        openapiFields.add("quantity");
        openapiFields.add("price");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ExtendBlockTradeOrderResponseLegsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ExtendBlockTradeOrderResponseLegsInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ExtendBlockTradeOrderResponseLegsInner"
                                        + " is not found in the empty JSON string",
                                ExtendBlockTradeOrderResponseLegsInner.openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("symbol") != null && !jsonObj.get("symbol").isJsonNull())
                && !jsonObj.get("symbol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `symbol` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("symbol").toString()));
        }
        if ((jsonObj.get("side") != null && !jsonObj.get("side").isJsonNull())
                && !jsonObj.get("side").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `side` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("side").toString()));
        }
        if ((jsonObj.get("quantity") != null && !jsonObj.get("quantity").isJsonNull())
                && !jsonObj.get("quantity").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `quantity` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("quantity").toString()));
        }
        if ((jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull())
                && !jsonObj.get("price").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `price` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("price").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ExtendBlockTradeOrderResponseLegsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ExtendBlockTradeOrderResponseLegsInner'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ExtendBlockTradeOrderResponseLegsInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ExtendBlockTradeOrderResponseLegsInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ExtendBlockTradeOrderResponseLegsInner>() {
                        @Override
                        public void write(
                                JsonWriter out, ExtendBlockTradeOrderResponseLegsInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ExtendBlockTradeOrderResponseLegsInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ExtendBlockTradeOrderResponseLegsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ExtendBlockTradeOrderResponseLegsInner
     * @throws IOException if the JSON string is invalid with respect to
     *     ExtendBlockTradeOrderResponseLegsInner
     */
    public static ExtendBlockTradeOrderResponseLegsInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, ExtendBlockTradeOrderResponseLegsInner.class);
    }

    /**
     * Convert an instance of ExtendBlockTradeOrderResponseLegsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
