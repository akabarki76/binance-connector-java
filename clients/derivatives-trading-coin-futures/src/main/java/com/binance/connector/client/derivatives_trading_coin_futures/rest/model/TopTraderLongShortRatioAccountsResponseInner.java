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

/** TopTraderLongShortRatioAccountsResponseInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class TopTraderLongShortRatioAccountsResponseInner {
    public static final String SERIALIZED_NAME_PAIR = "pair";

    @SerializedName(SERIALIZED_NAME_PAIR)
    @jakarta.annotation.Nullable
    private String pair;

    public static final String SERIALIZED_NAME_LONG_SHORT_RATIO = "longShortRatio";

    @SerializedName(SERIALIZED_NAME_LONG_SHORT_RATIO)
    @jakarta.annotation.Nullable
    private String longShortRatio;

    public static final String SERIALIZED_NAME_LONG_ACCOUNT = "longAccount";

    @SerializedName(SERIALIZED_NAME_LONG_ACCOUNT)
    @jakarta.annotation.Nullable
    private String longAccount;

    public static final String SERIALIZED_NAME_SHORT_ACCOUNT = "shortAccount";

    @SerializedName(SERIALIZED_NAME_SHORT_ACCOUNT)
    @jakarta.annotation.Nullable
    private String shortAccount;

    public static final String SERIALIZED_NAME_TIMESTAMP = "timestamp";

    @SerializedName(SERIALIZED_NAME_TIMESTAMP)
    @jakarta.annotation.Nullable
    private Long timestamp;

    public TopTraderLongShortRatioAccountsResponseInner() {}

    public TopTraderLongShortRatioAccountsResponseInner pair(
            @jakarta.annotation.Nullable String pair) {
        this.pair = pair;
        return this;
    }

    /**
     * Get pair
     *
     * @return pair
     */
    @jakarta.annotation.Nullable
    public String getPair() {
        return pair;
    }

    public void setPair(@jakarta.annotation.Nullable String pair) {
        this.pair = pair;
    }

    public TopTraderLongShortRatioAccountsResponseInner longShortRatio(
            @jakarta.annotation.Nullable String longShortRatio) {
        this.longShortRatio = longShortRatio;
        return this;
    }

    /**
     * Get longShortRatio
     *
     * @return longShortRatio
     */
    @jakarta.annotation.Nullable
    public String getLongShortRatio() {
        return longShortRatio;
    }

    public void setLongShortRatio(@jakarta.annotation.Nullable String longShortRatio) {
        this.longShortRatio = longShortRatio;
    }

    public TopTraderLongShortRatioAccountsResponseInner longAccount(
            @jakarta.annotation.Nullable String longAccount) {
        this.longAccount = longAccount;
        return this;
    }

    /**
     * Get longAccount
     *
     * @return longAccount
     */
    @jakarta.annotation.Nullable
    public String getLongAccount() {
        return longAccount;
    }

    public void setLongAccount(@jakarta.annotation.Nullable String longAccount) {
        this.longAccount = longAccount;
    }

    public TopTraderLongShortRatioAccountsResponseInner shortAccount(
            @jakarta.annotation.Nullable String shortAccount) {
        this.shortAccount = shortAccount;
        return this;
    }

    /**
     * Get shortAccount
     *
     * @return shortAccount
     */
    @jakarta.annotation.Nullable
    public String getShortAccount() {
        return shortAccount;
    }

    public void setShortAccount(@jakarta.annotation.Nullable String shortAccount) {
        this.shortAccount = shortAccount;
    }

    public TopTraderLongShortRatioAccountsResponseInner timestamp(
            @jakarta.annotation.Nullable Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     *
     * @return timestamp
     */
    @jakarta.annotation.Nullable
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(@jakarta.annotation.Nullable Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TopTraderLongShortRatioAccountsResponseInner topTraderLongShortRatioAccountsResponseInner =
                (TopTraderLongShortRatioAccountsResponseInner) o;
        return Objects.equals(this.pair, topTraderLongShortRatioAccountsResponseInner.pair)
                && Objects.equals(
                        this.longShortRatio,
                        topTraderLongShortRatioAccountsResponseInner.longShortRatio)
                && Objects.equals(
                        this.longAccount, topTraderLongShortRatioAccountsResponseInner.longAccount)
                && Objects.equals(
                        this.shortAccount,
                        topTraderLongShortRatioAccountsResponseInner.shortAccount)
                && Objects.equals(
                        this.timestamp, topTraderLongShortRatioAccountsResponseInner.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pair, longShortRatio, longAccount, shortAccount, timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TopTraderLongShortRatioAccountsResponseInner {\n");
        sb.append("		pair: ").append(toIndentedString(pair)).append("\n");
        sb.append("		longShortRatio: ").append(toIndentedString(longShortRatio)).append("\n");
        sb.append("		longAccount: ").append(toIndentedString(longAccount)).append("\n");
        sb.append("		shortAccount: ").append(toIndentedString(shortAccount)).append("\n");
        sb.append("		timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object pairValue = getPair();
        String pairValueAsString = "";
        pairValueAsString = pairValue.toString();
        sb.append("pair=").append(urlEncode(pairValueAsString)).append("");
        Object longShortRatioValue = getLongShortRatio();
        String longShortRatioValueAsString = "";
        longShortRatioValueAsString = longShortRatioValue.toString();
        sb.append("longShortRatio=").append(urlEncode(longShortRatioValueAsString)).append("");
        Object longAccountValue = getLongAccount();
        String longAccountValueAsString = "";
        longAccountValueAsString = longAccountValue.toString();
        sb.append("longAccount=").append(urlEncode(longAccountValueAsString)).append("");
        Object shortAccountValue = getShortAccount();
        String shortAccountValueAsString = "";
        shortAccountValueAsString = shortAccountValue.toString();
        sb.append("shortAccount=").append(urlEncode(shortAccountValueAsString)).append("");
        Object timestampValue = getTimestamp();
        String timestampValueAsString = "";
        timestampValueAsString = timestampValue.toString();
        sb.append("timestamp=").append(urlEncode(timestampValueAsString)).append("");
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
        openapiFields.add("pair");
        openapiFields.add("longShortRatio");
        openapiFields.add("longAccount");
        openapiFields.add("shortAccount");
        openapiFields.add("timestamp");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     TopTraderLongShortRatioAccountsResponseInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!TopTraderLongShortRatioAccountsResponseInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " TopTraderLongShortRatioAccountsResponseInner is not found"
                                    + " in the empty JSON string",
                                TopTraderLongShortRatioAccountsResponseInner.openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("pair") != null && !jsonObj.get("pair").isJsonNull())
                && !jsonObj.get("pair").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `pair` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("pair").toString()));
        }
        if ((jsonObj.get("longShortRatio") != null && !jsonObj.get("longShortRatio").isJsonNull())
                && !jsonObj.get("longShortRatio").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `longShortRatio` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("longShortRatio").toString()));
        }
        if ((jsonObj.get("longAccount") != null && !jsonObj.get("longAccount").isJsonNull())
                && !jsonObj.get("longAccount").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `longAccount` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("longAccount").toString()));
        }
        if ((jsonObj.get("shortAccount") != null && !jsonObj.get("shortAccount").isJsonNull())
                && !jsonObj.get("shortAccount").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `shortAccount` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("shortAccount").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!TopTraderLongShortRatioAccountsResponseInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'TopTraderLongShortRatioAccountsResponseInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<TopTraderLongShortRatioAccountsResponseInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(TopTraderLongShortRatioAccountsResponseInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<TopTraderLongShortRatioAccountsResponseInner>() {
                        @Override
                        public void write(
                                JsonWriter out, TopTraderLongShortRatioAccountsResponseInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public TopTraderLongShortRatioAccountsResponseInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of TopTraderLongShortRatioAccountsResponseInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of TopTraderLongShortRatioAccountsResponseInner
     * @throws IOException if the JSON string is invalid with respect to
     *     TopTraderLongShortRatioAccountsResponseInner
     */
    public static TopTraderLongShortRatioAccountsResponseInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, TopTraderLongShortRatioAccountsResponseInner.class);
    }

    /**
     * Convert an instance of TopTraderLongShortRatioAccountsResponseInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
