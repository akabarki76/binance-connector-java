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

/** NewCmOrderRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class NewCmOrderRequest {
    public static final String SERIALIZED_NAME_SYMBOL = "symbol";

    @SerializedName(SERIALIZED_NAME_SYMBOL)
    @jakarta.annotation.Nonnull
    private String symbol;

    public static final String SERIALIZED_NAME_SIDE = "side";

    @SerializedName(SERIALIZED_NAME_SIDE)
    @jakarta.annotation.Nonnull
    private Side side;

    public static final String SERIALIZED_NAME_POSITION_SIDE = "positionSide";

    @SerializedName(SERIALIZED_NAME_POSITION_SIDE)
    @jakarta.annotation.Nullable
    private PositionSide positionSide;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @jakarta.annotation.Nonnull
    private Type type;

    public static final String SERIALIZED_NAME_TIME_IN_FORCE = "timeInForce";

    @SerializedName(SERIALIZED_NAME_TIME_IN_FORCE)
    @jakarta.annotation.Nullable
    private TimeInForce timeInForce;

    public static final String SERIALIZED_NAME_QUANTITY = "quantity";

    @SerializedName(SERIALIZED_NAME_QUANTITY)
    @jakarta.annotation.Nullable
    private Double quantity;

    public static final String SERIALIZED_NAME_REDUCE_ONLY = "reduceOnly";

    @SerializedName(SERIALIZED_NAME_REDUCE_ONLY)
    @jakarta.annotation.Nullable
    private String reduceOnly;

    public static final String SERIALIZED_NAME_PRICE = "price";

    @SerializedName(SERIALIZED_NAME_PRICE)
    @jakarta.annotation.Nullable
    private Double price;

    public static final String SERIALIZED_NAME_PRICE_MATCH = "priceMatch";

    @SerializedName(SERIALIZED_NAME_PRICE_MATCH)
    @jakarta.annotation.Nullable
    private PriceMatch priceMatch;

    public static final String SERIALIZED_NAME_NEW_CLIENT_ORDER_ID = "newClientOrderId";

    @SerializedName(SERIALIZED_NAME_NEW_CLIENT_ORDER_ID)
    @jakarta.annotation.Nullable
    private String newClientOrderId;

    public static final String SERIALIZED_NAME_NEW_ORDER_RESP_TYPE = "newOrderRespType";

    @SerializedName(SERIALIZED_NAME_NEW_ORDER_RESP_TYPE)
    @jakarta.annotation.Nullable
    private NewOrderRespType newOrderRespType;

    public static final String SERIALIZED_NAME_RECV_WINDOW = "recvWindow";

    @SerializedName(SERIALIZED_NAME_RECV_WINDOW)
    @jakarta.annotation.Nullable
    private Long recvWindow;

    public NewCmOrderRequest() {}

    public NewCmOrderRequest symbol(@jakarta.annotation.Nonnull String symbol) {
        this.symbol = symbol;
        return this;
    }

    /**
     * Get symbol
     *
     * @return symbol
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(@jakarta.annotation.Nonnull String symbol) {
        this.symbol = symbol;
    }

    public NewCmOrderRequest side(@jakarta.annotation.Nonnull Side side) {
        this.side = side;
        return this;
    }

    /**
     * Get side
     *
     * @return side
     */
    @jakarta.annotation.Nonnull
    @NotNull
    @Valid
    public Side getSide() {
        return side;
    }

    public void setSide(@jakarta.annotation.Nonnull Side side) {
        this.side = side;
    }

    public NewCmOrderRequest positionSide(@jakarta.annotation.Nullable PositionSide positionSide) {
        this.positionSide = positionSide;
        return this;
    }

    /**
     * Get positionSide
     *
     * @return positionSide
     */
    @jakarta.annotation.Nullable
    @Valid
    public PositionSide getPositionSide() {
        return positionSide;
    }

    public void setPositionSide(@jakarta.annotation.Nullable PositionSide positionSide) {
        this.positionSide = positionSide;
    }

    public NewCmOrderRequest type(@jakarta.annotation.Nonnull Type type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @jakarta.annotation.Nonnull
    @NotNull
    @Valid
    public Type getType() {
        return type;
    }

    public void setType(@jakarta.annotation.Nonnull Type type) {
        this.type = type;
    }

    public NewCmOrderRequest timeInForce(@jakarta.annotation.Nullable TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    /**
     * Get timeInForce
     *
     * @return timeInForce
     */
    @jakarta.annotation.Nullable
    @Valid
    public TimeInForce getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(@jakarta.annotation.Nullable TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
    }

    public NewCmOrderRequest quantity(@jakarta.annotation.Nullable Double quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Get quantity
     *
     * @return quantity
     */
    @jakarta.annotation.Nullable
    @Valid
    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(@jakarta.annotation.Nullable Double quantity) {
        this.quantity = quantity;
    }

    public NewCmOrderRequest reduceOnly(@jakarta.annotation.Nullable String reduceOnly) {
        this.reduceOnly = reduceOnly;
        return this;
    }

    /**
     * Get reduceOnly
     *
     * @return reduceOnly
     */
    @jakarta.annotation.Nullable
    public String getReduceOnly() {
        return reduceOnly;
    }

    public void setReduceOnly(@jakarta.annotation.Nullable String reduceOnly) {
        this.reduceOnly = reduceOnly;
    }

    public NewCmOrderRequest price(@jakarta.annotation.Nullable Double price) {
        this.price = price;
        return this;
    }

    /**
     * Get price
     *
     * @return price
     */
    @jakarta.annotation.Nullable
    @Valid
    public Double getPrice() {
        return price;
    }

    public void setPrice(@jakarta.annotation.Nullable Double price) {
        this.price = price;
    }

    public NewCmOrderRequest priceMatch(@jakarta.annotation.Nullable PriceMatch priceMatch) {
        this.priceMatch = priceMatch;
        return this;
    }

    /**
     * Get priceMatch
     *
     * @return priceMatch
     */
    @jakarta.annotation.Nullable
    @Valid
    public PriceMatch getPriceMatch() {
        return priceMatch;
    }

    public void setPriceMatch(@jakarta.annotation.Nullable PriceMatch priceMatch) {
        this.priceMatch = priceMatch;
    }

    public NewCmOrderRequest newClientOrderId(
            @jakarta.annotation.Nullable String newClientOrderId) {
        this.newClientOrderId = newClientOrderId;
        return this;
    }

    /**
     * Get newClientOrderId
     *
     * @return newClientOrderId
     */
    @jakarta.annotation.Nullable
    public String getNewClientOrderId() {
        return newClientOrderId;
    }

    public void setNewClientOrderId(@jakarta.annotation.Nullable String newClientOrderId) {
        this.newClientOrderId = newClientOrderId;
    }

    public NewCmOrderRequest newOrderRespType(
            @jakarta.annotation.Nullable NewOrderRespType newOrderRespType) {
        this.newOrderRespType = newOrderRespType;
        return this;
    }

    /**
     * Get newOrderRespType
     *
     * @return newOrderRespType
     */
    @jakarta.annotation.Nullable
    @Valid
    public NewOrderRespType getNewOrderRespType() {
        return newOrderRespType;
    }

    public void setNewOrderRespType(
            @jakarta.annotation.Nullable NewOrderRespType newOrderRespType) {
        this.newOrderRespType = newOrderRespType;
    }

    public NewCmOrderRequest recvWindow(@jakarta.annotation.Nullable Long recvWindow) {
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
        NewCmOrderRequest newCmOrderRequest = (NewCmOrderRequest) o;
        return Objects.equals(this.symbol, newCmOrderRequest.symbol)
                && Objects.equals(this.side, newCmOrderRequest.side)
                && Objects.equals(this.positionSide, newCmOrderRequest.positionSide)
                && Objects.equals(this.type, newCmOrderRequest.type)
                && Objects.equals(this.timeInForce, newCmOrderRequest.timeInForce)
                && Objects.equals(this.quantity, newCmOrderRequest.quantity)
                && Objects.equals(this.reduceOnly, newCmOrderRequest.reduceOnly)
                && Objects.equals(this.price, newCmOrderRequest.price)
                && Objects.equals(this.priceMatch, newCmOrderRequest.priceMatch)
                && Objects.equals(this.newClientOrderId, newCmOrderRequest.newClientOrderId)
                && Objects.equals(this.newOrderRespType, newCmOrderRequest.newOrderRespType)
                && Objects.equals(this.recvWindow, newCmOrderRequest.recvWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                symbol,
                side,
                positionSide,
                type,
                timeInForce,
                quantity,
                reduceOnly,
                price,
                priceMatch,
                newClientOrderId,
                newOrderRespType,
                recvWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewCmOrderRequest {\n");
        sb.append("		symbol: ").append(toIndentedString(symbol)).append("\n");
        sb.append("		side: ").append(toIndentedString(side)).append("\n");
        sb.append("		positionSide: ").append(toIndentedString(positionSide)).append("\n");
        sb.append("		type: ").append(toIndentedString(type)).append("\n");
        sb.append("		timeInForce: ").append(toIndentedString(timeInForce)).append("\n");
        sb.append("		quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("		reduceOnly: ").append(toIndentedString(reduceOnly)).append("\n");
        sb.append("		price: ").append(toIndentedString(price)).append("\n");
        sb.append("		priceMatch: ").append(toIndentedString(priceMatch)).append("\n");
        sb.append("		newClientOrderId: ").append(toIndentedString(newClientOrderId)).append("\n");
        sb.append("		newOrderRespType: ").append(toIndentedString(newOrderRespType)).append("\n");
        sb.append("		recvWindow: ").append(toIndentedString(recvWindow)).append("\n");
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
        Object positionSideValue = getPositionSide();
        String positionSideValueAsString = "";
        positionSideValueAsString = positionSideValue.toString();
        sb.append("positionSide=").append(urlEncode(positionSideValueAsString)).append("");
        Object typeValue = getType();
        String typeValueAsString = "";
        typeValueAsString = typeValue.toString();
        sb.append("type=").append(urlEncode(typeValueAsString)).append("");
        Object timeInForceValue = getTimeInForce();
        String timeInForceValueAsString = "";
        timeInForceValueAsString = timeInForceValue.toString();
        sb.append("timeInForce=").append(urlEncode(timeInForceValueAsString)).append("");
        Object quantityValue = getQuantity();
        String quantityValueAsString = "";
        quantityValueAsString = quantityValue.toString();
        sb.append("quantity=").append(urlEncode(quantityValueAsString)).append("");
        Object reduceOnlyValue = getReduceOnly();
        String reduceOnlyValueAsString = "";
        reduceOnlyValueAsString = reduceOnlyValue.toString();
        sb.append("reduceOnly=").append(urlEncode(reduceOnlyValueAsString)).append("");
        Object priceValue = getPrice();
        String priceValueAsString = "";
        priceValueAsString = priceValue.toString();
        sb.append("price=").append(urlEncode(priceValueAsString)).append("");
        Object priceMatchValue = getPriceMatch();
        String priceMatchValueAsString = "";
        priceMatchValueAsString = priceMatchValue.toString();
        sb.append("priceMatch=").append(urlEncode(priceMatchValueAsString)).append("");
        Object newClientOrderIdValue = getNewClientOrderId();
        String newClientOrderIdValueAsString = "";
        newClientOrderIdValueAsString = newClientOrderIdValue.toString();
        sb.append("newClientOrderId=").append(urlEncode(newClientOrderIdValueAsString)).append("");
        Object newOrderRespTypeValue = getNewOrderRespType();
        String newOrderRespTypeValueAsString = "";
        newOrderRespTypeValueAsString = newOrderRespTypeValue.toString();
        sb.append("newOrderRespType=").append(urlEncode(newOrderRespTypeValueAsString)).append("");
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
        openapiFields.add("symbol");
        openapiFields.add("side");
        openapiFields.add("positionSide");
        openapiFields.add("type");
        openapiFields.add("timeInForce");
        openapiFields.add("quantity");
        openapiFields.add("reduceOnly");
        openapiFields.add("price");
        openapiFields.add("priceMatch");
        openapiFields.add("newClientOrderId");
        openapiFields.add("newOrderRespType");
        openapiFields.add("recvWindow");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("symbol");
        openapiRequiredFields.add("side");
        openapiRequiredFields.add("type");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to NewCmOrderRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!NewCmOrderRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in NewCmOrderRequest is not found in the"
                                        + " empty JSON string",
                                NewCmOrderRequest.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : NewCmOrderRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("symbol").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `symbol` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("symbol").toString()));
        }
        // validate the required field `side`
        Side.validateJsonElement(jsonObj.get("side"));
        // validate the optional field `positionSide`
        if (jsonObj.get("positionSide") != null && !jsonObj.get("positionSide").isJsonNull()) {
            PositionSide.validateJsonElement(jsonObj.get("positionSide"));
        }
        // validate the required field `type`
        Type.validateJsonElement(jsonObj.get("type"));
        // validate the optional field `timeInForce`
        if (jsonObj.get("timeInForce") != null && !jsonObj.get("timeInForce").isJsonNull()) {
            TimeInForce.validateJsonElement(jsonObj.get("timeInForce"));
        }
        if ((jsonObj.get("reduceOnly") != null && !jsonObj.get("reduceOnly").isJsonNull())
                && !jsonObj.get("reduceOnly").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `reduceOnly` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("reduceOnly").toString()));
        }
        // validate the optional field `priceMatch`
        if (jsonObj.get("priceMatch") != null && !jsonObj.get("priceMatch").isJsonNull()) {
            PriceMatch.validateJsonElement(jsonObj.get("priceMatch"));
        }
        if ((jsonObj.get("newClientOrderId") != null
                        && !jsonObj.get("newClientOrderId").isJsonNull())
                && !jsonObj.get("newClientOrderId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `newClientOrderId` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("newClientOrderId").toString()));
        }
        // validate the optional field `newOrderRespType`
        if (jsonObj.get("newOrderRespType") != null
                && !jsonObj.get("newOrderRespType").isJsonNull()) {
            NewOrderRespType.validateJsonElement(jsonObj.get("newOrderRespType"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!NewCmOrderRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'NewCmOrderRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<NewCmOrderRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(NewCmOrderRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<NewCmOrderRequest>() {
                        @Override
                        public void write(JsonWriter out, NewCmOrderRequest value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public NewCmOrderRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of NewCmOrderRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of NewCmOrderRequest
     * @throws IOException if the JSON string is invalid with respect to NewCmOrderRequest
     */
    public static NewCmOrderRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, NewCmOrderRequest.class);
    }

    /**
     * Convert an instance of NewCmOrderRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
