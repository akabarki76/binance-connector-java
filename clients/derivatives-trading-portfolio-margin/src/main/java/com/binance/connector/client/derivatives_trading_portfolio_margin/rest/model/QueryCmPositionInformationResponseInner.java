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
import jakarta.validation.constraints.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Objects;
import org.hibernate.validator.constraints.*;

/** QueryCmPositionInformationResponseInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class QueryCmPositionInformationResponseInner {
    public static final String SERIALIZED_NAME_SYMBOL = "symbol";

    @SerializedName(SERIALIZED_NAME_SYMBOL)
    @jakarta.annotation.Nullable
    private String symbol;

    public static final String SERIALIZED_NAME_POSITION_AMT = "positionAmt";

    @SerializedName(SERIALIZED_NAME_POSITION_AMT)
    @jakarta.annotation.Nullable
    private String positionAmt;

    public static final String SERIALIZED_NAME_ENTRY_PRICE = "entryPrice";

    @SerializedName(SERIALIZED_NAME_ENTRY_PRICE)
    @jakarta.annotation.Nullable
    private String entryPrice;

    public static final String SERIALIZED_NAME_MARK_PRICE = "markPrice";

    @SerializedName(SERIALIZED_NAME_MARK_PRICE)
    @jakarta.annotation.Nullable
    private String markPrice;

    public static final String SERIALIZED_NAME_UN_REALIZED_PROFIT = "unRealizedProfit";

    @SerializedName(SERIALIZED_NAME_UN_REALIZED_PROFIT)
    @jakarta.annotation.Nullable
    private String unRealizedProfit;

    public static final String SERIALIZED_NAME_LIQUIDATION_PRICE = "liquidationPrice";

    @SerializedName(SERIALIZED_NAME_LIQUIDATION_PRICE)
    @jakarta.annotation.Nullable
    private String liquidationPrice;

    public static final String SERIALIZED_NAME_LEVERAGE = "leverage";

    @SerializedName(SERIALIZED_NAME_LEVERAGE)
    @jakarta.annotation.Nullable
    private String leverage;

    public static final String SERIALIZED_NAME_POSITION_SIDE = "positionSide";

    @SerializedName(SERIALIZED_NAME_POSITION_SIDE)
    @jakarta.annotation.Nullable
    private String positionSide;

    public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
    @jakarta.annotation.Nullable
    private Long updateTime;

    public static final String SERIALIZED_NAME_MAX_QTY = "maxQty";

    @SerializedName(SERIALIZED_NAME_MAX_QTY)
    @jakarta.annotation.Nullable
    private String maxQty;

    public static final String SERIALIZED_NAME_NOTIONAL_VALUE = "notionalValue";

    @SerializedName(SERIALIZED_NAME_NOTIONAL_VALUE)
    @jakarta.annotation.Nullable
    private String notionalValue;

    public QueryCmPositionInformationResponseInner() {}

    public QueryCmPositionInformationResponseInner symbol(
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

    public QueryCmPositionInformationResponseInner positionAmt(
            @jakarta.annotation.Nullable String positionAmt) {
        this.positionAmt = positionAmt;
        return this;
    }

    /**
     * Get positionAmt
     *
     * @return positionAmt
     */
    @jakarta.annotation.Nullable
    public String getPositionAmt() {
        return positionAmt;
    }

    public void setPositionAmt(@jakarta.annotation.Nullable String positionAmt) {
        this.positionAmt = positionAmt;
    }

    public QueryCmPositionInformationResponseInner entryPrice(
            @jakarta.annotation.Nullable String entryPrice) {
        this.entryPrice = entryPrice;
        return this;
    }

    /**
     * Get entryPrice
     *
     * @return entryPrice
     */
    @jakarta.annotation.Nullable
    public String getEntryPrice() {
        return entryPrice;
    }

    public void setEntryPrice(@jakarta.annotation.Nullable String entryPrice) {
        this.entryPrice = entryPrice;
    }

    public QueryCmPositionInformationResponseInner markPrice(
            @jakarta.annotation.Nullable String markPrice) {
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

    public QueryCmPositionInformationResponseInner unRealizedProfit(
            @jakarta.annotation.Nullable String unRealizedProfit) {
        this.unRealizedProfit = unRealizedProfit;
        return this;
    }

    /**
     * Get unRealizedProfit
     *
     * @return unRealizedProfit
     */
    @jakarta.annotation.Nullable
    public String getUnRealizedProfit() {
        return unRealizedProfit;
    }

    public void setUnRealizedProfit(@jakarta.annotation.Nullable String unRealizedProfit) {
        this.unRealizedProfit = unRealizedProfit;
    }

    public QueryCmPositionInformationResponseInner liquidationPrice(
            @jakarta.annotation.Nullable String liquidationPrice) {
        this.liquidationPrice = liquidationPrice;
        return this;
    }

    /**
     * Get liquidationPrice
     *
     * @return liquidationPrice
     */
    @jakarta.annotation.Nullable
    public String getLiquidationPrice() {
        return liquidationPrice;
    }

    public void setLiquidationPrice(@jakarta.annotation.Nullable String liquidationPrice) {
        this.liquidationPrice = liquidationPrice;
    }

    public QueryCmPositionInformationResponseInner leverage(
            @jakarta.annotation.Nullable String leverage) {
        this.leverage = leverage;
        return this;
    }

    /**
     * Get leverage
     *
     * @return leverage
     */
    @jakarta.annotation.Nullable
    public String getLeverage() {
        return leverage;
    }

    public void setLeverage(@jakarta.annotation.Nullable String leverage) {
        this.leverage = leverage;
    }

    public QueryCmPositionInformationResponseInner positionSide(
            @jakarta.annotation.Nullable String positionSide) {
        this.positionSide = positionSide;
        return this;
    }

    /**
     * Get positionSide
     *
     * @return positionSide
     */
    @jakarta.annotation.Nullable
    public String getPositionSide() {
        return positionSide;
    }

    public void setPositionSide(@jakarta.annotation.Nullable String positionSide) {
        this.positionSide = positionSide;
    }

    public QueryCmPositionInformationResponseInner updateTime(
            @jakarta.annotation.Nullable Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Get updateTime
     *
     * @return updateTime
     */
    @jakarta.annotation.Nullable
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(@jakarta.annotation.Nullable Long updateTime) {
        this.updateTime = updateTime;
    }

    public QueryCmPositionInformationResponseInner maxQty(
            @jakarta.annotation.Nullable String maxQty) {
        this.maxQty = maxQty;
        return this;
    }

    /**
     * Get maxQty
     *
     * @return maxQty
     */
    @jakarta.annotation.Nullable
    public String getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(@jakarta.annotation.Nullable String maxQty) {
        this.maxQty = maxQty;
    }

    public QueryCmPositionInformationResponseInner notionalValue(
            @jakarta.annotation.Nullable String notionalValue) {
        this.notionalValue = notionalValue;
        return this;
    }

    /**
     * Get notionalValue
     *
     * @return notionalValue
     */
    @jakarta.annotation.Nullable
    public String getNotionalValue() {
        return notionalValue;
    }

    public void setNotionalValue(@jakarta.annotation.Nullable String notionalValue) {
        this.notionalValue = notionalValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryCmPositionInformationResponseInner queryCmPositionInformationResponseInner =
                (QueryCmPositionInformationResponseInner) o;
        return Objects.equals(this.symbol, queryCmPositionInformationResponseInner.symbol)
                && Objects.equals(
                        this.positionAmt, queryCmPositionInformationResponseInner.positionAmt)
                && Objects.equals(
                        this.entryPrice, queryCmPositionInformationResponseInner.entryPrice)
                && Objects.equals(this.markPrice, queryCmPositionInformationResponseInner.markPrice)
                && Objects.equals(
                        this.unRealizedProfit,
                        queryCmPositionInformationResponseInner.unRealizedProfit)
                && Objects.equals(
                        this.liquidationPrice,
                        queryCmPositionInformationResponseInner.liquidationPrice)
                && Objects.equals(this.leverage, queryCmPositionInformationResponseInner.leverage)
                && Objects.equals(
                        this.positionSide, queryCmPositionInformationResponseInner.positionSide)
                && Objects.equals(
                        this.updateTime, queryCmPositionInformationResponseInner.updateTime)
                && Objects.equals(this.maxQty, queryCmPositionInformationResponseInner.maxQty)
                && Objects.equals(
                        this.notionalValue, queryCmPositionInformationResponseInner.notionalValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                symbol,
                positionAmt,
                entryPrice,
                markPrice,
                unRealizedProfit,
                liquidationPrice,
                leverage,
                positionSide,
                updateTime,
                maxQty,
                notionalValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryCmPositionInformationResponseInner {\n");
        sb.append("		symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("		positionAmt: ").append(toIndentedString(positionAmt)).append("\n");
        sb.append("		entryPrice: ").append(toIndentedString(entryPrice)).append("\n");
        sb.append("		markPrice: ").append(toIndentedString(markPrice)).append("\n");
        sb.append("		unRealizedProfit: ").append(toIndentedString(unRealizedProfit)).append("\n");
        sb.append("		liquidationPrice: ").append(toIndentedString(liquidationPrice)).append("\n");
        sb.append("		leverage: ").append(toIndentedString(leverage)).append("\n");
        sb.append("		positionSide: ").append(toIndentedString(positionSide)).append("\n");
        sb.append("		updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("		maxQty: ").append(toIndentedString(maxQty)).append("\n");
        sb.append("		notionalValue: ").append(toIndentedString(notionalValue)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object symbolValue = getSymbol();
        String symbolValueAsString = "";
        symbolValueAsString = symbolValue.toString();
        sb.append("symbol=").append(urlEncode(symbolValueAsString)).append("");
        Object positionAmtValue = getPositionAmt();
        String positionAmtValueAsString = "";
        positionAmtValueAsString = positionAmtValue.toString();
        sb.append("positionAmt=").append(urlEncode(positionAmtValueAsString)).append("");
        Object entryPriceValue = getEntryPrice();
        String entryPriceValueAsString = "";
        entryPriceValueAsString = entryPriceValue.toString();
        sb.append("entryPrice=").append(urlEncode(entryPriceValueAsString)).append("");
        Object markPriceValue = getMarkPrice();
        String markPriceValueAsString = "";
        markPriceValueAsString = markPriceValue.toString();
        sb.append("markPrice=").append(urlEncode(markPriceValueAsString)).append("");
        Object unRealizedProfitValue = getUnRealizedProfit();
        String unRealizedProfitValueAsString = "";
        unRealizedProfitValueAsString = unRealizedProfitValue.toString();
        sb.append("unRealizedProfit=").append(urlEncode(unRealizedProfitValueAsString)).append("");
        Object liquidationPriceValue = getLiquidationPrice();
        String liquidationPriceValueAsString = "";
        liquidationPriceValueAsString = liquidationPriceValue.toString();
        sb.append("liquidationPrice=").append(urlEncode(liquidationPriceValueAsString)).append("");
        Object leverageValue = getLeverage();
        String leverageValueAsString = "";
        leverageValueAsString = leverageValue.toString();
        sb.append("leverage=").append(urlEncode(leverageValueAsString)).append("");
        Object positionSideValue = getPositionSide();
        String positionSideValueAsString = "";
        positionSideValueAsString = positionSideValue.toString();
        sb.append("positionSide=").append(urlEncode(positionSideValueAsString)).append("");
        Object updateTimeValue = getUpdateTime();
        String updateTimeValueAsString = "";
        updateTimeValueAsString = updateTimeValue.toString();
        sb.append("updateTime=").append(urlEncode(updateTimeValueAsString)).append("");
        Object maxQtyValue = getMaxQty();
        String maxQtyValueAsString = "";
        maxQtyValueAsString = maxQtyValue.toString();
        sb.append("maxQty=").append(urlEncode(maxQtyValueAsString)).append("");
        Object notionalValueValue = getNotionalValue();
        String notionalValueValueAsString = "";
        notionalValueValueAsString = notionalValueValue.toString();
        sb.append("notionalValue=").append(urlEncode(notionalValueValueAsString)).append("");
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
        openapiFields.add("positionAmt");
        openapiFields.add("entryPrice");
        openapiFields.add("markPrice");
        openapiFields.add("unRealizedProfit");
        openapiFields.add("liquidationPrice");
        openapiFields.add("leverage");
        openapiFields.add("positionSide");
        openapiFields.add("updateTime");
        openapiFields.add("maxQty");
        openapiFields.add("notionalValue");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     QueryCmPositionInformationResponseInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!QueryCmPositionInformationResponseInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " QueryCmPositionInformationResponseInner is not found in the"
                                    + " empty JSON string",
                                QueryCmPositionInformationResponseInner.openapiRequiredFields
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
        if ((jsonObj.get("positionAmt") != null && !jsonObj.get("positionAmt").isJsonNull())
                && !jsonObj.get("positionAmt").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `positionAmt` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("positionAmt").toString()));
        }
        if ((jsonObj.get("entryPrice") != null && !jsonObj.get("entryPrice").isJsonNull())
                && !jsonObj.get("entryPrice").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `entryPrice` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("entryPrice").toString()));
        }
        if ((jsonObj.get("markPrice") != null && !jsonObj.get("markPrice").isJsonNull())
                && !jsonObj.get("markPrice").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `markPrice` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("markPrice").toString()));
        }
        if ((jsonObj.get("unRealizedProfit") != null
                        && !jsonObj.get("unRealizedProfit").isJsonNull())
                && !jsonObj.get("unRealizedProfit").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `unRealizedProfit` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("unRealizedProfit").toString()));
        }
        if ((jsonObj.get("liquidationPrice") != null
                        && !jsonObj.get("liquidationPrice").isJsonNull())
                && !jsonObj.get("liquidationPrice").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `liquidationPrice` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("liquidationPrice").toString()));
        }
        if ((jsonObj.get("leverage") != null && !jsonObj.get("leverage").isJsonNull())
                && !jsonObj.get("leverage").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `leverage` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("leverage").toString()));
        }
        if ((jsonObj.get("positionSide") != null && !jsonObj.get("positionSide").isJsonNull())
                && !jsonObj.get("positionSide").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `positionSide` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("positionSide").toString()));
        }
        if ((jsonObj.get("maxQty") != null && !jsonObj.get("maxQty").isJsonNull())
                && !jsonObj.get("maxQty").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `maxQty` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("maxQty").toString()));
        }
        if ((jsonObj.get("notionalValue") != null && !jsonObj.get("notionalValue").isJsonNull())
                && !jsonObj.get("notionalValue").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `notionalValue` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("notionalValue").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!QueryCmPositionInformationResponseInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes 'QueryCmPositionInformationResponseInner'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<QueryCmPositionInformationResponseInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(QueryCmPositionInformationResponseInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<QueryCmPositionInformationResponseInner>() {
                        @Override
                        public void write(
                                JsonWriter out, QueryCmPositionInformationResponseInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public QueryCmPositionInformationResponseInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of QueryCmPositionInformationResponseInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of QueryCmPositionInformationResponseInner
     * @throws IOException if the JSON string is invalid with respect to
     *     QueryCmPositionInformationResponseInner
     */
    public static QueryCmPositionInformationResponseInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, QueryCmPositionInformationResponseInner.class);
    }

    /**
     * Convert an instance of QueryCmPositionInformationResponseInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
