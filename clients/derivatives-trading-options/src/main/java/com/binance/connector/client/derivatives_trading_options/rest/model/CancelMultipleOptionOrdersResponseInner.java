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

/** CancelMultipleOptionOrdersResponseInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class CancelMultipleOptionOrdersResponseInner {
    public static final String SERIALIZED_NAME_ORDER_ID = "orderId";

    @SerializedName(SERIALIZED_NAME_ORDER_ID)
    @jakarta.annotation.Nullable
    private Long orderId;

    public static final String SERIALIZED_NAME_SYMBOL = "symbol";

    @SerializedName(SERIALIZED_NAME_SYMBOL)
    @jakarta.annotation.Nullable
    private String symbol;

    public static final String SERIALIZED_NAME_PRICE = "price";

    @SerializedName(SERIALIZED_NAME_PRICE)
    @jakarta.annotation.Nullable
    private String price;

    public static final String SERIALIZED_NAME_QUANTITY = "quantity";

    @SerializedName(SERIALIZED_NAME_QUANTITY)
    @jakarta.annotation.Nullable
    private String quantity;

    public static final String SERIALIZED_NAME_EXECUTED_QTY = "executedQty";

    @SerializedName(SERIALIZED_NAME_EXECUTED_QTY)
    @jakarta.annotation.Nullable
    private String executedQty;

    public static final String SERIALIZED_NAME_FEE = "fee";

    @SerializedName(SERIALIZED_NAME_FEE)
    @jakarta.annotation.Nullable
    private Long fee;

    public static final String SERIALIZED_NAME_SIDE = "side";

    @SerializedName(SERIALIZED_NAME_SIDE)
    @jakarta.annotation.Nullable
    private String side;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @jakarta.annotation.Nullable
    private String type;

    public static final String SERIALIZED_NAME_TIME_IN_FORCE = "timeInForce";

    @SerializedName(SERIALIZED_NAME_TIME_IN_FORCE)
    @jakarta.annotation.Nullable
    private String timeInForce;

    public static final String SERIALIZED_NAME_CREATE_TIME = "createTime";

    @SerializedName(SERIALIZED_NAME_CREATE_TIME)
    @jakarta.annotation.Nullable
    private Long createTime;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    @jakarta.annotation.Nullable
    private String status;

    public static final String SERIALIZED_NAME_AVG_PRICE = "avgPrice";

    @SerializedName(SERIALIZED_NAME_AVG_PRICE)
    @jakarta.annotation.Nullable
    private String avgPrice;

    public static final String SERIALIZED_NAME_REDUCE_ONLY = "reduceOnly";

    @SerializedName(SERIALIZED_NAME_REDUCE_ONLY)
    @jakarta.annotation.Nullable
    private Boolean reduceOnly;

    public static final String SERIALIZED_NAME_CLIENT_ORDER_ID = "clientOrderId";

    @SerializedName(SERIALIZED_NAME_CLIENT_ORDER_ID)
    @jakarta.annotation.Nullable
    private String clientOrderId;

    public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
    @jakarta.annotation.Nullable
    private Long updateTime;

    public CancelMultipleOptionOrdersResponseInner() {}

    public CancelMultipleOptionOrdersResponseInner orderId(
            @jakarta.annotation.Nullable Long orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Get orderId
     *
     * @return orderId
     */
    @jakarta.annotation.Nullable
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(@jakarta.annotation.Nullable Long orderId) {
        this.orderId = orderId;
    }

    public CancelMultipleOptionOrdersResponseInner symbol(
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

    public CancelMultipleOptionOrdersResponseInner price(
            @jakarta.annotation.Nullable String price) {
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

    public CancelMultipleOptionOrdersResponseInner quantity(
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

    public CancelMultipleOptionOrdersResponseInner executedQty(
            @jakarta.annotation.Nullable String executedQty) {
        this.executedQty = executedQty;
        return this;
    }

    /**
     * Get executedQty
     *
     * @return executedQty
     */
    @jakarta.annotation.Nullable
    public String getExecutedQty() {
        return executedQty;
    }

    public void setExecutedQty(@jakarta.annotation.Nullable String executedQty) {
        this.executedQty = executedQty;
    }

    public CancelMultipleOptionOrdersResponseInner fee(@jakarta.annotation.Nullable Long fee) {
        this.fee = fee;
        return this;
    }

    /**
     * Get fee
     *
     * @return fee
     */
    @jakarta.annotation.Nullable
    public Long getFee() {
        return fee;
    }

    public void setFee(@jakarta.annotation.Nullable Long fee) {
        this.fee = fee;
    }

    public CancelMultipleOptionOrdersResponseInner side(@jakarta.annotation.Nullable String side) {
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

    public CancelMultipleOptionOrdersResponseInner type(@jakarta.annotation.Nullable String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return type;
    }

    public void setType(@jakarta.annotation.Nullable String type) {
        this.type = type;
    }

    public CancelMultipleOptionOrdersResponseInner timeInForce(
            @jakarta.annotation.Nullable String timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    /**
     * Get timeInForce
     *
     * @return timeInForce
     */
    @jakarta.annotation.Nullable
    public String getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(@jakarta.annotation.Nullable String timeInForce) {
        this.timeInForce = timeInForce;
    }

    public CancelMultipleOptionOrdersResponseInner createTime(
            @jakarta.annotation.Nullable Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get createTime
     *
     * @return createTime
     */
    @jakarta.annotation.Nullable
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(@jakarta.annotation.Nullable Long createTime) {
        this.createTime = createTime;
    }

    public CancelMultipleOptionOrdersResponseInner status(
            @jakarta.annotation.Nullable String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return status;
    }

    public void setStatus(@jakarta.annotation.Nullable String status) {
        this.status = status;
    }

    public CancelMultipleOptionOrdersResponseInner avgPrice(
            @jakarta.annotation.Nullable String avgPrice) {
        this.avgPrice = avgPrice;
        return this;
    }

    /**
     * Get avgPrice
     *
     * @return avgPrice
     */
    @jakarta.annotation.Nullable
    public String getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(@jakarta.annotation.Nullable String avgPrice) {
        this.avgPrice = avgPrice;
    }

    public CancelMultipleOptionOrdersResponseInner reduceOnly(
            @jakarta.annotation.Nullable Boolean reduceOnly) {
        this.reduceOnly = reduceOnly;
        return this;
    }

    /**
     * Get reduceOnly
     *
     * @return reduceOnly
     */
    @jakarta.annotation.Nullable
    public Boolean getReduceOnly() {
        return reduceOnly;
    }

    public void setReduceOnly(@jakarta.annotation.Nullable Boolean reduceOnly) {
        this.reduceOnly = reduceOnly;
    }

    public CancelMultipleOptionOrdersResponseInner clientOrderId(
            @jakarta.annotation.Nullable String clientOrderId) {
        this.clientOrderId = clientOrderId;
        return this;
    }

    /**
     * Get clientOrderId
     *
     * @return clientOrderId
     */
    @jakarta.annotation.Nullable
    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(@jakarta.annotation.Nullable String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public CancelMultipleOptionOrdersResponseInner updateTime(
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CancelMultipleOptionOrdersResponseInner cancelMultipleOptionOrdersResponseInner =
                (CancelMultipleOptionOrdersResponseInner) o;
        return Objects.equals(this.orderId, cancelMultipleOptionOrdersResponseInner.orderId)
                && Objects.equals(this.symbol, cancelMultipleOptionOrdersResponseInner.symbol)
                && Objects.equals(this.price, cancelMultipleOptionOrdersResponseInner.price)
                && Objects.equals(this.quantity, cancelMultipleOptionOrdersResponseInner.quantity)
                && Objects.equals(
                        this.executedQty, cancelMultipleOptionOrdersResponseInner.executedQty)
                && Objects.equals(this.fee, cancelMultipleOptionOrdersResponseInner.fee)
                && Objects.equals(this.side, cancelMultipleOptionOrdersResponseInner.side)
                && Objects.equals(this.type, cancelMultipleOptionOrdersResponseInner.type)
                && Objects.equals(
                        this.timeInForce, cancelMultipleOptionOrdersResponseInner.timeInForce)
                && Objects.equals(
                        this.createTime, cancelMultipleOptionOrdersResponseInner.createTime)
                && Objects.equals(this.status, cancelMultipleOptionOrdersResponseInner.status)
                && Objects.equals(this.avgPrice, cancelMultipleOptionOrdersResponseInner.avgPrice)
                && Objects.equals(
                        this.reduceOnly, cancelMultipleOptionOrdersResponseInner.reduceOnly)
                && Objects.equals(
                        this.clientOrderId, cancelMultipleOptionOrdersResponseInner.clientOrderId)
                && Objects.equals(
                        this.updateTime, cancelMultipleOptionOrdersResponseInner.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                orderId,
                symbol,
                price,
                quantity,
                executedQty,
                fee,
                side,
                type,
                timeInForce,
                createTime,
                status,
                avgPrice,
                reduceOnly,
                clientOrderId,
                updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelMultipleOptionOrdersResponseInner {\n");
        sb.append("		orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("		symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("		price: ").append(toIndentedString(price)).append("\n");
        sb.append("		quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("		executedQty: ").append(toIndentedString(executedQty)).append("\n");
        sb.append("		fee: ").append(toIndentedString(fee)).append("\n");
        sb.append("		side: ").append(toIndentedString(side)).append("\n");
        sb.append("		type: ").append(toIndentedString(type)).append("\n");
        sb.append("		timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
        sb.append("		createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("		status: ").append(toIndentedString(status)).append("\n");
        sb.append("		avgPrice: ").append(toIndentedString(avgPrice)).append("\n");
        sb.append("		reduceOnly: ").append(toIndentedString(reduceOnly)).append("\n");
        sb.append("		clientOrderId: ").append(toIndentedString(clientOrderId)).append("\n");
        sb.append("		updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object orderIdValue = getOrderId();
        String orderIdValueAsString = "";
        orderIdValueAsString = orderIdValue.toString();
        sb.append("orderId=").append(urlEncode(orderIdValueAsString)).append("");
        Object symbolValue = getSymbol();
        String symbolValueAsString = "";
        symbolValueAsString = symbolValue.toString();
        sb.append("symbol=").append(urlEncode(symbolValueAsString)).append("");
        Object priceValue = getPrice();
        String priceValueAsString = "";
        priceValueAsString = priceValue.toString();
        sb.append("price=").append(urlEncode(priceValueAsString)).append("");
        Object quantityValue = getQuantity();
        String quantityValueAsString = "";
        quantityValueAsString = quantityValue.toString();
        sb.append("quantity=").append(urlEncode(quantityValueAsString)).append("");
        Object executedQtyValue = getExecutedQty();
        String executedQtyValueAsString = "";
        executedQtyValueAsString = executedQtyValue.toString();
        sb.append("executedQty=").append(urlEncode(executedQtyValueAsString)).append("");
        Object feeValue = getFee();
        String feeValueAsString = "";
        feeValueAsString = feeValue.toString();
        sb.append("fee=").append(urlEncode(feeValueAsString)).append("");
        Object sideValue = getSide();
        String sideValueAsString = "";
        sideValueAsString = sideValue.toString();
        sb.append("side=").append(urlEncode(sideValueAsString)).append("");
        Object typeValue = getType();
        String typeValueAsString = "";
        typeValueAsString = typeValue.toString();
        sb.append("type=").append(urlEncode(typeValueAsString)).append("");
        Object timeInForceValue = getTimeInForce();
        String timeInForceValueAsString = "";
        timeInForceValueAsString = timeInForceValue.toString();
        sb.append("timeInForce=").append(urlEncode(timeInForceValueAsString)).append("");
        Object createTimeValue = getCreateTime();
        String createTimeValueAsString = "";
        createTimeValueAsString = createTimeValue.toString();
        sb.append("createTime=").append(urlEncode(createTimeValueAsString)).append("");
        Object statusValue = getStatus();
        String statusValueAsString = "";
        statusValueAsString = statusValue.toString();
        sb.append("status=").append(urlEncode(statusValueAsString)).append("");
        Object avgPriceValue = getAvgPrice();
        String avgPriceValueAsString = "";
        avgPriceValueAsString = avgPriceValue.toString();
        sb.append("avgPrice=").append(urlEncode(avgPriceValueAsString)).append("");
        Object reduceOnlyValue = getReduceOnly();
        String reduceOnlyValueAsString = "";
        reduceOnlyValueAsString = reduceOnlyValue.toString();
        sb.append("reduceOnly=").append(urlEncode(reduceOnlyValueAsString)).append("");
        Object clientOrderIdValue = getClientOrderId();
        String clientOrderIdValueAsString = "";
        clientOrderIdValueAsString = clientOrderIdValue.toString();
        sb.append("clientOrderId=").append(urlEncode(clientOrderIdValueAsString)).append("");
        Object updateTimeValue = getUpdateTime();
        String updateTimeValueAsString = "";
        updateTimeValueAsString = updateTimeValue.toString();
        sb.append("updateTime=").append(urlEncode(updateTimeValueAsString)).append("");
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
        openapiFields.add("orderId");
        openapiFields.add("symbol");
        openapiFields.add("price");
        openapiFields.add("quantity");
        openapiFields.add("executedQty");
        openapiFields.add("fee");
        openapiFields.add("side");
        openapiFields.add("type");
        openapiFields.add("timeInForce");
        openapiFields.add("createTime");
        openapiFields.add("status");
        openapiFields.add("avgPrice");
        openapiFields.add("reduceOnly");
        openapiFields.add("clientOrderId");
        openapiFields.add("updateTime");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     CancelMultipleOptionOrdersResponseInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!CancelMultipleOptionOrdersResponseInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " CancelMultipleOptionOrdersResponseInner is not found in the"
                                    + " empty JSON string",
                                CancelMultipleOptionOrdersResponseInner.openapiRequiredFields
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
        if ((jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull())
                && !jsonObj.get("price").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `price` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("price").toString()));
        }
        if ((jsonObj.get("quantity") != null && !jsonObj.get("quantity").isJsonNull())
                && !jsonObj.get("quantity").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `quantity` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("quantity").toString()));
        }
        if ((jsonObj.get("executedQty") != null && !jsonObj.get("executedQty").isJsonNull())
                && !jsonObj.get("executedQty").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `executedQty` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("executedQty").toString()));
        }
        if ((jsonObj.get("side") != null && !jsonObj.get("side").isJsonNull())
                && !jsonObj.get("side").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `side` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("side").toString()));
        }
        if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull())
                && !jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
        if ((jsonObj.get("timeInForce") != null && !jsonObj.get("timeInForce").isJsonNull())
                && !jsonObj.get("timeInForce").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `timeInForce` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("timeInForce").toString()));
        }
        if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull())
                && !jsonObj.get("status").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `status` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("status").toString()));
        }
        if ((jsonObj.get("avgPrice") != null && !jsonObj.get("avgPrice").isJsonNull())
                && !jsonObj.get("avgPrice").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `avgPrice` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("avgPrice").toString()));
        }
        if ((jsonObj.get("clientOrderId") != null && !jsonObj.get("clientOrderId").isJsonNull())
                && !jsonObj.get("clientOrderId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `clientOrderId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("clientOrderId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!CancelMultipleOptionOrdersResponseInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes 'CancelMultipleOptionOrdersResponseInner'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<CancelMultipleOptionOrdersResponseInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(CancelMultipleOptionOrdersResponseInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<CancelMultipleOptionOrdersResponseInner>() {
                        @Override
                        public void write(
                                JsonWriter out, CancelMultipleOptionOrdersResponseInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public CancelMultipleOptionOrdersResponseInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of CancelMultipleOptionOrdersResponseInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of CancelMultipleOptionOrdersResponseInner
     * @throws IOException if the JSON string is invalid with respect to
     *     CancelMultipleOptionOrdersResponseInner
     */
    public static CancelMultipleOptionOrdersResponseInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, CancelMultipleOptionOrdersResponseInner.class);
    }

    /**
     * Convert an instance of CancelMultipleOptionOrdersResponseInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
