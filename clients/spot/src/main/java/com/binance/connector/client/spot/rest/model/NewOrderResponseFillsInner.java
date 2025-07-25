/*
 * Binance Spot REST API
 * OpenAPI Specifications for the Binance Spot REST API  API documents:   - [Github rest-api documentation file](https://github.com/binance/binance-spot-api-docs/blob/master/rest-api.md)   - [General API information for rest-api on website](https://developers.binance.com/docs/binance-spot-api-docs/rest-api/general-api-information)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.spot.rest.model;

import com.binance.connector.client.spot.rest.JSON;
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

/** NewOrderResponseFillsInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class NewOrderResponseFillsInner {
    public static final String SERIALIZED_NAME_PRICE = "price";

    @SerializedName(SERIALIZED_NAME_PRICE)
    @jakarta.annotation.Nullable
    private String price;

    public static final String SERIALIZED_NAME_QTY = "qty";

    @SerializedName(SERIALIZED_NAME_QTY)
    @jakarta.annotation.Nullable
    private String qty;

    public static final String SERIALIZED_NAME_COMMISSION = "commission";

    @SerializedName(SERIALIZED_NAME_COMMISSION)
    @jakarta.annotation.Nullable
    private String commission;

    public static final String SERIALIZED_NAME_COMMISSION_ASSET = "commissionAsset";

    @SerializedName(SERIALIZED_NAME_COMMISSION_ASSET)
    @jakarta.annotation.Nullable
    private String commissionAsset;

    public static final String SERIALIZED_NAME_TRADE_ID = "tradeId";

    @SerializedName(SERIALIZED_NAME_TRADE_ID)
    @jakarta.annotation.Nullable
    private Long tradeId;

    public NewOrderResponseFillsInner() {}

    public NewOrderResponseFillsInner price(@jakarta.annotation.Nullable String price) {
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

    public NewOrderResponseFillsInner qty(@jakarta.annotation.Nullable String qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Get qty
     *
     * @return qty
     */
    @jakarta.annotation.Nullable
    public String getQty() {
        return qty;
    }

    public void setQty(@jakarta.annotation.Nullable String qty) {
        this.qty = qty;
    }

    public NewOrderResponseFillsInner commission(@jakarta.annotation.Nullable String commission) {
        this.commission = commission;
        return this;
    }

    /**
     * Get commission
     *
     * @return commission
     */
    @jakarta.annotation.Nullable
    public String getCommission() {
        return commission;
    }

    public void setCommission(@jakarta.annotation.Nullable String commission) {
        this.commission = commission;
    }

    public NewOrderResponseFillsInner commissionAsset(
            @jakarta.annotation.Nullable String commissionAsset) {
        this.commissionAsset = commissionAsset;
        return this;
    }

    /**
     * Get commissionAsset
     *
     * @return commissionAsset
     */
    @jakarta.annotation.Nullable
    public String getCommissionAsset() {
        return commissionAsset;
    }

    public void setCommissionAsset(@jakarta.annotation.Nullable String commissionAsset) {
        this.commissionAsset = commissionAsset;
    }

    public NewOrderResponseFillsInner tradeId(@jakarta.annotation.Nullable Long tradeId) {
        this.tradeId = tradeId;
        return this;
    }

    /**
     * Get tradeId
     *
     * @return tradeId
     */
    @jakarta.annotation.Nullable
    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(@jakarta.annotation.Nullable Long tradeId) {
        this.tradeId = tradeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NewOrderResponseFillsInner newOrderResponseFillsInner = (NewOrderResponseFillsInner) o;
        return Objects.equals(this.price, newOrderResponseFillsInner.price)
                && Objects.equals(this.qty, newOrderResponseFillsInner.qty)
                && Objects.equals(this.commission, newOrderResponseFillsInner.commission)
                && Objects.equals(this.commissionAsset, newOrderResponseFillsInner.commissionAsset)
                && Objects.equals(this.tradeId, newOrderResponseFillsInner.tradeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, qty, commission, commissionAsset, tradeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewOrderResponseFillsInner {\n");
        sb.append("		price: ").append(toIndentedString(price)).append("\n");
        sb.append("		qty: ").append(toIndentedString(qty)).append("\n");
        sb.append("		commission: ").append(toIndentedString(commission)).append("\n");
        sb.append("		commissionAsset: ").append(toIndentedString(commissionAsset)).append("\n");
        sb.append("		tradeId: ").append(toIndentedString(tradeId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object priceValue = getPrice();
        String priceValueAsString = "";
        priceValueAsString = priceValue.toString();
        sb.append("price=").append(urlEncode(priceValueAsString)).append("");
        Object qtyValue = getQty();
        String qtyValueAsString = "";
        qtyValueAsString = qtyValue.toString();
        sb.append("qty=").append(urlEncode(qtyValueAsString)).append("");
        Object commissionValue = getCommission();
        String commissionValueAsString = "";
        commissionValueAsString = commissionValue.toString();
        sb.append("commission=").append(urlEncode(commissionValueAsString)).append("");
        Object commissionAssetValue = getCommissionAsset();
        String commissionAssetValueAsString = "";
        commissionAssetValueAsString = commissionAssetValue.toString();
        sb.append("commissionAsset=").append(urlEncode(commissionAssetValueAsString)).append("");
        Object tradeIdValue = getTradeId();
        String tradeIdValueAsString = "";
        tradeIdValueAsString = tradeIdValue.toString();
        sb.append("tradeId=").append(urlEncode(tradeIdValueAsString)).append("");
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
        openapiFields.add("price");
        openapiFields.add("qty");
        openapiFields.add("commission");
        openapiFields.add("commissionAsset");
        openapiFields.add("tradeId");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to NewOrderResponseFillsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!NewOrderResponseFillsInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in NewOrderResponseFillsInner is not"
                                        + " found in the empty JSON string",
                                NewOrderResponseFillsInner.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull())
                && !jsonObj.get("price").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `price` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("price").toString()));
        }
        if ((jsonObj.get("qty") != null && !jsonObj.get("qty").isJsonNull())
                && !jsonObj.get("qty").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `qty` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("qty").toString()));
        }
        if ((jsonObj.get("commission") != null && !jsonObj.get("commission").isJsonNull())
                && !jsonObj.get("commission").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `commission` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("commission").toString()));
        }
        if ((jsonObj.get("commissionAsset") != null && !jsonObj.get("commissionAsset").isJsonNull())
                && !jsonObj.get("commissionAsset").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `commissionAsset` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("commissionAsset").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!NewOrderResponseFillsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'NewOrderResponseFillsInner' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<NewOrderResponseFillsInner> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(NewOrderResponseFillsInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<NewOrderResponseFillsInner>() {
                        @Override
                        public void write(JsonWriter out, NewOrderResponseFillsInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public NewOrderResponseFillsInner read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of NewOrderResponseFillsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of NewOrderResponseFillsInner
     * @throws IOException if the JSON string is invalid with respect to NewOrderResponseFillsInner
     */
    public static NewOrderResponseFillsInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, NewOrderResponseFillsInner.class);
    }

    /**
     * Convert an instance of NewOrderResponseFillsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
