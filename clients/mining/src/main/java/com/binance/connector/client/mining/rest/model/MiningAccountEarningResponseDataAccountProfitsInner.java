/*
 * Binance Mining REST API
 * OpenAPI Specification for the Binance Mining REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.mining.rest.model;

import com.binance.connector.client.mining.rest.JSON;
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

/** MiningAccountEarningResponseDataAccountProfitsInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class MiningAccountEarningResponseDataAccountProfitsInner {
    public static final String SERIALIZED_NAME_TIME = "time";

    @SerializedName(SERIALIZED_NAME_TIME)
    @jakarta.annotation.Nullable
    private Long time;

    public static final String SERIALIZED_NAME_COIN_NAME = "coinName";

    @SerializedName(SERIALIZED_NAME_COIN_NAME)
    @jakarta.annotation.Nullable
    private String coinName;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @jakarta.annotation.Nullable
    private Long type;

    public static final String SERIALIZED_NAME_PUID = "puid";

    @SerializedName(SERIALIZED_NAME_PUID)
    @jakarta.annotation.Nullable
    private Long puid;

    public static final String SERIALIZED_NAME_SUB_NAME = "subName";

    @SerializedName(SERIALIZED_NAME_SUB_NAME)
    @jakarta.annotation.Nullable
    private String subName;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";

    @SerializedName(SERIALIZED_NAME_AMOUNT)
    @jakarta.annotation.Nullable
    private Double amount;

    public MiningAccountEarningResponseDataAccountProfitsInner() {}

    public MiningAccountEarningResponseDataAccountProfitsInner time(
            @jakarta.annotation.Nullable Long time) {
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

    public MiningAccountEarningResponseDataAccountProfitsInner coinName(
            @jakarta.annotation.Nullable String coinName) {
        this.coinName = coinName;
        return this;
    }

    /**
     * Get coinName
     *
     * @return coinName
     */
    @jakarta.annotation.Nullable
    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(@jakarta.annotation.Nullable String coinName) {
        this.coinName = coinName;
    }

    public MiningAccountEarningResponseDataAccountProfitsInner type(
            @jakarta.annotation.Nullable Long type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @jakarta.annotation.Nullable
    public Long getType() {
        return type;
    }

    public void setType(@jakarta.annotation.Nullable Long type) {
        this.type = type;
    }

    public MiningAccountEarningResponseDataAccountProfitsInner puid(
            @jakarta.annotation.Nullable Long puid) {
        this.puid = puid;
        return this;
    }

    /**
     * Get puid
     *
     * @return puid
     */
    @jakarta.annotation.Nullable
    public Long getPuid() {
        return puid;
    }

    public void setPuid(@jakarta.annotation.Nullable Long puid) {
        this.puid = puid;
    }

    public MiningAccountEarningResponseDataAccountProfitsInner subName(
            @jakarta.annotation.Nullable String subName) {
        this.subName = subName;
        return this;
    }

    /**
     * Get subName
     *
     * @return subName
     */
    @jakarta.annotation.Nullable
    public String getSubName() {
        return subName;
    }

    public void setSubName(@jakarta.annotation.Nullable String subName) {
        this.subName = subName;
    }

    public MiningAccountEarningResponseDataAccountProfitsInner amount(
            @jakarta.annotation.Nullable Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @jakarta.annotation.Nullable
    @Valid
    public Double getAmount() {
        return amount;
    }

    public void setAmount(@jakarta.annotation.Nullable Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MiningAccountEarningResponseDataAccountProfitsInner
                miningAccountEarningResponseDataAccountProfitsInner =
                        (MiningAccountEarningResponseDataAccountProfitsInner) o;
        return Objects.equals(this.time, miningAccountEarningResponseDataAccountProfitsInner.time)
                && Objects.equals(
                        this.coinName, miningAccountEarningResponseDataAccountProfitsInner.coinName)
                && Objects.equals(
                        this.type, miningAccountEarningResponseDataAccountProfitsInner.type)
                && Objects.equals(
                        this.puid, miningAccountEarningResponseDataAccountProfitsInner.puid)
                && Objects.equals(
                        this.subName, miningAccountEarningResponseDataAccountProfitsInner.subName)
                && Objects.equals(
                        this.amount, miningAccountEarningResponseDataAccountProfitsInner.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, coinName, type, puid, subName, amount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MiningAccountEarningResponseDataAccountProfitsInner {\n");
        sb.append("		time: ").append(toIndentedString(time)).append("\n");
        sb.append("		coinName: ").append(toIndentedString(coinName)).append("\n");
        sb.append("		type: ").append(toIndentedString(type)).append("\n");
        sb.append("		puid: ").append(toIndentedString(puid)).append("\n");
        sb.append("		subName: ").append(toIndentedString(subName)).append("\n");
        sb.append("		amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object timeValue = getTime();
        String timeValueAsString = "";
        timeValueAsString = timeValue.toString();
        sb.append("time=").append(urlEncode(timeValueAsString)).append("");
        Object coinNameValue = getCoinName();
        String coinNameValueAsString = "";
        coinNameValueAsString = coinNameValue.toString();
        sb.append("coinName=").append(urlEncode(coinNameValueAsString)).append("");
        Object typeValue = getType();
        String typeValueAsString = "";
        typeValueAsString = typeValue.toString();
        sb.append("type=").append(urlEncode(typeValueAsString)).append("");
        Object puidValue = getPuid();
        String puidValueAsString = "";
        puidValueAsString = puidValue.toString();
        sb.append("puid=").append(urlEncode(puidValueAsString)).append("");
        Object subNameValue = getSubName();
        String subNameValueAsString = "";
        subNameValueAsString = subNameValue.toString();
        sb.append("subName=").append(urlEncode(subNameValueAsString)).append("");
        Object amountValue = getAmount();
        String amountValueAsString = "";
        amountValueAsString = amountValue.toString();
        sb.append("amount=").append(urlEncode(amountValueAsString)).append("");
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
        openapiFields.add("time");
        openapiFields.add("coinName");
        openapiFields.add("type");
        openapiFields.add("puid");
        openapiFields.add("subName");
        openapiFields.add("amount");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     MiningAccountEarningResponseDataAccountProfitsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!MiningAccountEarningResponseDataAccountProfitsInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " MiningAccountEarningResponseDataAccountProfitsInner is not"
                                    + " found in the empty JSON string",
                                MiningAccountEarningResponseDataAccountProfitsInner
                                        .openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("coinName") != null && !jsonObj.get("coinName").isJsonNull())
                && !jsonObj.get("coinName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `coinName` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("coinName").toString()));
        }
        if ((jsonObj.get("subName") != null && !jsonObj.get("subName").isJsonNull())
                && !jsonObj.get("subName").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `subName` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("subName").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!MiningAccountEarningResponseDataAccountProfitsInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'MiningAccountEarningResponseDataAccountProfitsInner' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<MiningAccountEarningResponseDataAccountProfitsInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(
                                    MiningAccountEarningResponseDataAccountProfitsInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<MiningAccountEarningResponseDataAccountProfitsInner>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                MiningAccountEarningResponseDataAccountProfitsInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public MiningAccountEarningResponseDataAccountProfitsInner read(
                                JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of MiningAccountEarningResponseDataAccountProfitsInner given an JSON
     * string
     *
     * @param jsonString JSON string
     * @return An instance of MiningAccountEarningResponseDataAccountProfitsInner
     * @throws IOException if the JSON string is invalid with respect to
     *     MiningAccountEarningResponseDataAccountProfitsInner
     */
    public static MiningAccountEarningResponseDataAccountProfitsInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, MiningAccountEarningResponseDataAccountProfitsInner.class);
    }

    /**
     * Convert an instance of MiningAccountEarningResponseDataAccountProfitsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
