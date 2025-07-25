/*
 * Binance Derivatives Trading Portfolio Margin REST API
 * OpenAPI Specification for the Binance Derivatives Trading Portfolio Margin REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_portfolio_margin.rest.model;

import com.binance.connector.client.derivatives_trading_portfolio_margin.rest.JSON;
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

/** UmPositionAdlQuantileEstimationResponseInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class UmPositionAdlQuantileEstimationResponseInner {
    public static final String SERIALIZED_NAME_SYMBOL = "symbol";

    @SerializedName(SERIALIZED_NAME_SYMBOL)
    @jakarta.annotation.Nullable
    private String symbol;

    public static final String SERIALIZED_NAME_ADL_QUANTILE = "adlQuantile";

    @SerializedName(SERIALIZED_NAME_ADL_QUANTILE)
    @jakarta.annotation.Nullable
    private CmPositionAdlQuantileEstimationResponseInnerAdlQuantile adlQuantile;

    public UmPositionAdlQuantileEstimationResponseInner() {}

    public UmPositionAdlQuantileEstimationResponseInner symbol(
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

    public UmPositionAdlQuantileEstimationResponseInner adlQuantile(
            @jakarta.annotation.Nullable
                    CmPositionAdlQuantileEstimationResponseInnerAdlQuantile adlQuantile) {
        this.adlQuantile = adlQuantile;
        return this;
    }

    /**
     * Get adlQuantile
     *
     * @return adlQuantile
     */
    @jakarta.annotation.Nullable
    @Valid
    public CmPositionAdlQuantileEstimationResponseInnerAdlQuantile getAdlQuantile() {
        return adlQuantile;
    }

    public void setAdlQuantile(
            @jakarta.annotation.Nullable
                    CmPositionAdlQuantileEstimationResponseInnerAdlQuantile adlQuantile) {
        this.adlQuantile = adlQuantile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UmPositionAdlQuantileEstimationResponseInner umPositionAdlQuantileEstimationResponseInner =
                (UmPositionAdlQuantileEstimationResponseInner) o;
        return Objects.equals(this.symbol, umPositionAdlQuantileEstimationResponseInner.symbol)
                && Objects.equals(
                        this.adlQuantile, umPositionAdlQuantileEstimationResponseInner.adlQuantile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(symbol, adlQuantile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UmPositionAdlQuantileEstimationResponseInner {\n");
        sb.append("		symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("		adlQuantile: ").append(toIndentedString(adlQuantile)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object symbolValue = getSymbol();
        String symbolValueAsString = "";
        symbolValueAsString = symbolValue.toString();
        sb.append("symbol=").append(urlEncode(symbolValueAsString)).append("");
        Object adlQuantileValue = getAdlQuantile();
        String adlQuantileValueAsString = "";
        adlQuantileValueAsString = adlQuantileValue.toString();
        sb.append("adlQuantile=").append(urlEncode(adlQuantileValueAsString)).append("");
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
        openapiFields.add("adlQuantile");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     UmPositionAdlQuantileEstimationResponseInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!UmPositionAdlQuantileEstimationResponseInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " UmPositionAdlQuantileEstimationResponseInner is not found"
                                    + " in the empty JSON string",
                                UmPositionAdlQuantileEstimationResponseInner.openapiRequiredFields
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
        // validate the optional field `adlQuantile`
        if (jsonObj.get("adlQuantile") != null && !jsonObj.get("adlQuantile").isJsonNull()) {
            CmPositionAdlQuantileEstimationResponseInnerAdlQuantile.validateJsonElement(
                    jsonObj.get("adlQuantile"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!UmPositionAdlQuantileEstimationResponseInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'UmPositionAdlQuantileEstimationResponseInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<UmPositionAdlQuantileEstimationResponseInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(UmPositionAdlQuantileEstimationResponseInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<UmPositionAdlQuantileEstimationResponseInner>() {
                        @Override
                        public void write(
                                JsonWriter out, UmPositionAdlQuantileEstimationResponseInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public UmPositionAdlQuantileEstimationResponseInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of UmPositionAdlQuantileEstimationResponseInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of UmPositionAdlQuantileEstimationResponseInner
     * @throws IOException if the JSON string is invalid with respect to
     *     UmPositionAdlQuantileEstimationResponseInner
     */
    public static UmPositionAdlQuantileEstimationResponseInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, UmPositionAdlQuantileEstimationResponseInner.class);
    }

    /**
     * Convert an instance of UmPositionAdlQuantileEstimationResponseInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
