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

/** MarkPriceResponse1 */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class MarkPriceResponse1 {
    public static final String SERIALIZED_NAME_SYMBOL = "symbol";

    @SerializedName(SERIALIZED_NAME_SYMBOL)
    @jakarta.annotation.Nullable
    private String symbol;

    public static final String SERIALIZED_NAME_MARK_PRICE = "markPrice";

    @SerializedName(SERIALIZED_NAME_MARK_PRICE)
    @jakarta.annotation.Nullable
    private String markPrice;

    public static final String SERIALIZED_NAME_INDEX_PRICE = "indexPrice";

    @SerializedName(SERIALIZED_NAME_INDEX_PRICE)
    @jakarta.annotation.Nullable
    private String indexPrice;

    public static final String SERIALIZED_NAME_ESTIMATED_SETTLE_PRICE = "estimatedSettlePrice";

    @SerializedName(SERIALIZED_NAME_ESTIMATED_SETTLE_PRICE)
    @jakarta.annotation.Nullable
    private String estimatedSettlePrice;

    public static final String SERIALIZED_NAME_LAST_FUNDING_RATE = "lastFundingRate";

    @SerializedName(SERIALIZED_NAME_LAST_FUNDING_RATE)
    @jakarta.annotation.Nullable
    private String lastFundingRate;

    public static final String SERIALIZED_NAME_INTEREST_RATE = "interestRate";

    @SerializedName(SERIALIZED_NAME_INTEREST_RATE)
    @jakarta.annotation.Nullable
    private String interestRate;

    public static final String SERIALIZED_NAME_NEXT_FUNDING_TIME = "nextFundingTime";

    @SerializedName(SERIALIZED_NAME_NEXT_FUNDING_TIME)
    @jakarta.annotation.Nullable
    private Long nextFundingTime;

    public static final String SERIALIZED_NAME_TIME = "time";

    @SerializedName(SERIALIZED_NAME_TIME)
    @jakarta.annotation.Nullable
    private Long time;

    public MarkPriceResponse1() {}

    public MarkPriceResponse1 symbol(@jakarta.annotation.Nullable String symbol) {
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

    public MarkPriceResponse1 markPrice(@jakarta.annotation.Nullable String markPrice) {
        this.markPrice = markPrice;
        return this;
    }

    /**
     * Get markPrice
     *
     * @return markPrice
     */
    @jakarta.annotation.Nullable
    public String getMarkPrice() {
        return markPrice;
    }

    public void setMarkPrice(@jakarta.annotation.Nullable String markPrice) {
        this.markPrice = markPrice;
    }

    public MarkPriceResponse1 indexPrice(@jakarta.annotation.Nullable String indexPrice) {
        this.indexPrice = indexPrice;
        return this;
    }

    /**
     * Get indexPrice
     *
     * @return indexPrice
     */
    @jakarta.annotation.Nullable
    public String getIndexPrice() {
        return indexPrice;
    }

    public void setIndexPrice(@jakarta.annotation.Nullable String indexPrice) {
        this.indexPrice = indexPrice;
    }

    public MarkPriceResponse1 estimatedSettlePrice(
            @jakarta.annotation.Nullable String estimatedSettlePrice) {
        this.estimatedSettlePrice = estimatedSettlePrice;
        return this;
    }

    /**
     * Get estimatedSettlePrice
     *
     * @return estimatedSettlePrice
     */
    @jakarta.annotation.Nullable
    public String getEstimatedSettlePrice() {
        return estimatedSettlePrice;
    }

    public void setEstimatedSettlePrice(@jakarta.annotation.Nullable String estimatedSettlePrice) {
        this.estimatedSettlePrice = estimatedSettlePrice;
    }

    public MarkPriceResponse1 lastFundingRate(@jakarta.annotation.Nullable String lastFundingRate) {
        this.lastFundingRate = lastFundingRate;
        return this;
    }

    /**
     * Get lastFundingRate
     *
     * @return lastFundingRate
     */
    @jakarta.annotation.Nullable
    public String getLastFundingRate() {
        return lastFundingRate;
    }

    public void setLastFundingRate(@jakarta.annotation.Nullable String lastFundingRate) {
        this.lastFundingRate = lastFundingRate;
    }

    public MarkPriceResponse1 interestRate(@jakarta.annotation.Nullable String interestRate) {
        this.interestRate = interestRate;
        return this;
    }

    /**
     * Get interestRate
     *
     * @return interestRate
     */
    @jakarta.annotation.Nullable
    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(@jakarta.annotation.Nullable String interestRate) {
        this.interestRate = interestRate;
    }

    public MarkPriceResponse1 nextFundingTime(@jakarta.annotation.Nullable Long nextFundingTime) {
        this.nextFundingTime = nextFundingTime;
        return this;
    }

    /**
     * Get nextFundingTime
     *
     * @return nextFundingTime
     */
    @jakarta.annotation.Nullable
    public Long getNextFundingTime() {
        return nextFundingTime;
    }

    public void setNextFundingTime(@jakarta.annotation.Nullable Long nextFundingTime) {
        this.nextFundingTime = nextFundingTime;
    }

    public MarkPriceResponse1 time(@jakarta.annotation.Nullable Long time) {
        this.time = time;
        return this;
    }

    /**
     * Get time
     *
     * @return time
     */
    @jakarta.annotation.Nullable
    public Long getTime() {
        return time;
    }

    public void setTime(@jakarta.annotation.Nullable Long time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarkPriceResponse1 markPriceResponse1 = (MarkPriceResponse1) o;
        return Objects.equals(this.symbol, markPriceResponse1.symbol)
                && Objects.equals(this.markPrice, markPriceResponse1.markPrice)
                && Objects.equals(this.indexPrice, markPriceResponse1.indexPrice)
                && Objects.equals(
                        this.estimatedSettlePrice, markPriceResponse1.estimatedSettlePrice)
                && Objects.equals(this.lastFundingRate, markPriceResponse1.lastFundingRate)
                && Objects.equals(this.interestRate, markPriceResponse1.interestRate)
                && Objects.equals(this.nextFundingTime, markPriceResponse1.nextFundingTime)
                && Objects.equals(this.time, markPriceResponse1.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                symbol,
                markPrice,
                indexPrice,
                estimatedSettlePrice,
                lastFundingRate,
                interestRate,
                nextFundingTime,
                time);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarkPriceResponse1 {\n");
        sb.append("		symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("		markPrice: ").append(toIndentedString(markPrice)).append("\n");
        sb.append("		indexPrice: ").append(toIndentedString(indexPrice)).append("\n");
        sb.append("		estimatedSettlePrice: ")
                .append(toIndentedString(estimatedSettlePrice))
                .append("\n");
        sb.append("		lastFundingRate: ").append(toIndentedString(lastFundingRate)).append("\n");
        sb.append("		interestRate: ").append(toIndentedString(interestRate)).append("\n");
        sb.append("		nextFundingTime: ").append(toIndentedString(nextFundingTime)).append("\n");
        sb.append("		time: ").append(toIndentedString(time)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object symbolValue = getSymbol();
        String symbolValueAsString = "";
        symbolValueAsString = symbolValue.toString();
        sb.append("symbol=").append(urlEncode(symbolValueAsString)).append("");
        Object markPriceValue = getMarkPrice();
        String markPriceValueAsString = "";
        markPriceValueAsString = markPriceValue.toString();
        sb.append("markPrice=").append(urlEncode(markPriceValueAsString)).append("");
        Object indexPriceValue = getIndexPrice();
        String indexPriceValueAsString = "";
        indexPriceValueAsString = indexPriceValue.toString();
        sb.append("indexPrice=").append(urlEncode(indexPriceValueAsString)).append("");
        Object estimatedSettlePriceValue = getEstimatedSettlePrice();
        String estimatedSettlePriceValueAsString = "";
        estimatedSettlePriceValueAsString = estimatedSettlePriceValue.toString();
        sb.append("estimatedSettlePrice=")
                .append(urlEncode(estimatedSettlePriceValueAsString))
                .append("");
        Object lastFundingRateValue = getLastFundingRate();
        String lastFundingRateValueAsString = "";
        lastFundingRateValueAsString = lastFundingRateValue.toString();
        sb.append("lastFundingRate=").append(urlEncode(lastFundingRateValueAsString)).append("");
        Object interestRateValue = getInterestRate();
        String interestRateValueAsString = "";
        interestRateValueAsString = interestRateValue.toString();
        sb.append("interestRate=").append(urlEncode(interestRateValueAsString)).append("");
        Object nextFundingTimeValue = getNextFundingTime();
        String nextFundingTimeValueAsString = "";
        nextFundingTimeValueAsString = nextFundingTimeValue.toString();
        sb.append("nextFundingTime=").append(urlEncode(nextFundingTimeValueAsString)).append("");
        Object timeValue = getTime();
        String timeValueAsString = "";
        timeValueAsString = timeValue.toString();
        sb.append("time=").append(urlEncode(timeValueAsString)).append("");
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
        openapiFields.add("markPrice");
        openapiFields.add("indexPrice");
        openapiFields.add("estimatedSettlePrice");
        openapiFields.add("lastFundingRate");
        openapiFields.add("interestRate");
        openapiFields.add("nextFundingTime");
        openapiFields.add("time");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to MarkPriceResponse1
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!MarkPriceResponse1.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in MarkPriceResponse1 is not found in the"
                                        + " empty JSON string",
                                MarkPriceResponse1.openapiRequiredFields.toString()));
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
        if ((jsonObj.get("markPrice") != null && !jsonObj.get("markPrice").isJsonNull())
                && !jsonObj.get("markPrice").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `markPrice` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("markPrice").toString()));
        }
        if ((jsonObj.get("indexPrice") != null && !jsonObj.get("indexPrice").isJsonNull())
                && !jsonObj.get("indexPrice").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `indexPrice` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("indexPrice").toString()));
        }
        if ((jsonObj.get("estimatedSettlePrice") != null
                        && !jsonObj.get("estimatedSettlePrice").isJsonNull())
                && !jsonObj.get("estimatedSettlePrice").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `estimatedSettlePrice` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("estimatedSettlePrice").toString()));
        }
        if ((jsonObj.get("lastFundingRate") != null && !jsonObj.get("lastFundingRate").isJsonNull())
                && !jsonObj.get("lastFundingRate").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `lastFundingRate` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("lastFundingRate").toString()));
        }
        if ((jsonObj.get("interestRate") != null && !jsonObj.get("interestRate").isJsonNull())
                && !jsonObj.get("interestRate").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `interestRate` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("interestRate").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!MarkPriceResponse1.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'MarkPriceResponse1' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<MarkPriceResponse1> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(MarkPriceResponse1.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<MarkPriceResponse1>() {
                        @Override
                        public void write(JsonWriter out, MarkPriceResponse1 value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public MarkPriceResponse1 read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of MarkPriceResponse1 given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of MarkPriceResponse1
     * @throws IOException if the JSON string is invalid with respect to MarkPriceResponse1
     */
    public static MarkPriceResponse1 fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, MarkPriceResponse1.class);
    }

    /**
     * Convert an instance of MarkPriceResponse1 to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
