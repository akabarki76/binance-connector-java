/*
 * Binance Derivatives Trading Options WebSocket Market Streams
 * OpenAPI Specification for the Binance Derivatives Trading Options WebSocket Market Streams
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_options.websocket.stream.model;

import com.binance.connector.client.common.websocket.dtos.BaseDTO;
import com.binance.connector.client.derivatives_trading_options.websocket.stream.JSON;
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
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import org.hibernate.validator.constraints.*;

/** OrderTradeUpdateOInnerFiInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class OrderTradeUpdateOInnerFiInner extends BaseDTO {
    public static final String SERIALIZED_NAME_T_LOWER_CASE = "t";

    @SerializedName(SERIALIZED_NAME_T_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String tLowerCase;

    public static final String SERIALIZED_NAME_P_LOWER_CASE = "p";

    @SerializedName(SERIALIZED_NAME_P_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String pLowerCase;

    public static final String SERIALIZED_NAME_Q_LOWER_CASE = "q";

    @SerializedName(SERIALIZED_NAME_Q_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String qLowerCase;

    public static final String SERIALIZED_NAME_T = "T";

    @SerializedName(SERIALIZED_NAME_T)
    @jakarta.annotation.Nullable
    private Long T;

    public static final String SERIALIZED_NAME_M_LOWER_CASE = "m";

    @SerializedName(SERIALIZED_NAME_M_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String mLowerCase;

    public static final String SERIALIZED_NAME_F_LOWER_CASE = "f";

    @SerializedName(SERIALIZED_NAME_F_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String fLowerCase;

    public OrderTradeUpdateOInnerFiInner() {}

    public OrderTradeUpdateOInnerFiInner tLowerCase(
            @jakarta.annotation.Nullable String tLowerCase) {
        this.tLowerCase = tLowerCase;
        return this;
    }

    /**
     * Get tLowerCase
     *
     * @return tLowerCase
     */
    @jakarta.annotation.Nullable
    public String gettLowerCase() {
        return tLowerCase;
    }

    public void settLowerCase(@jakarta.annotation.Nullable String tLowerCase) {
        this.tLowerCase = tLowerCase;
    }

    public OrderTradeUpdateOInnerFiInner pLowerCase(
            @jakarta.annotation.Nullable String pLowerCase) {
        this.pLowerCase = pLowerCase;
        return this;
    }

    /**
     * Get pLowerCase
     *
     * @return pLowerCase
     */
    @jakarta.annotation.Nullable
    public String getpLowerCase() {
        return pLowerCase;
    }

    public void setpLowerCase(@jakarta.annotation.Nullable String pLowerCase) {
        this.pLowerCase = pLowerCase;
    }

    public OrderTradeUpdateOInnerFiInner qLowerCase(
            @jakarta.annotation.Nullable String qLowerCase) {
        this.qLowerCase = qLowerCase;
        return this;
    }

    /**
     * Get qLowerCase
     *
     * @return qLowerCase
     */
    @jakarta.annotation.Nullable
    public String getqLowerCase() {
        return qLowerCase;
    }

    public void setqLowerCase(@jakarta.annotation.Nullable String qLowerCase) {
        this.qLowerCase = qLowerCase;
    }

    public OrderTradeUpdateOInnerFiInner T(@jakarta.annotation.Nullable Long T) {
        this.T = T;
        return this;
    }

    /**
     * Get T
     *
     * @return T
     */
    @jakarta.annotation.Nullable
    public Long getT() {
        return T;
    }

    public void setT(@jakarta.annotation.Nullable Long T) {
        this.T = T;
    }

    public OrderTradeUpdateOInnerFiInner mLowerCase(
            @jakarta.annotation.Nullable String mLowerCase) {
        this.mLowerCase = mLowerCase;
        return this;
    }

    /**
     * Get mLowerCase
     *
     * @return mLowerCase
     */
    @jakarta.annotation.Nullable
    public String getmLowerCase() {
        return mLowerCase;
    }

    public void setmLowerCase(@jakarta.annotation.Nullable String mLowerCase) {
        this.mLowerCase = mLowerCase;
    }

    public OrderTradeUpdateOInnerFiInner fLowerCase(
            @jakarta.annotation.Nullable String fLowerCase) {
        this.fLowerCase = fLowerCase;
        return this;
    }

    /**
     * Get fLowerCase
     *
     * @return fLowerCase
     */
    @jakarta.annotation.Nullable
    public String getfLowerCase() {
        return fLowerCase;
    }

    public void setfLowerCase(@jakarta.annotation.Nullable String fLowerCase) {
        this.fLowerCase = fLowerCase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderTradeUpdateOInnerFiInner orderTradeUpdateOInnerFiInner =
                (OrderTradeUpdateOInnerFiInner) o;
        return Objects.equals(this.tLowerCase, orderTradeUpdateOInnerFiInner.tLowerCase)
                && Objects.equals(this.pLowerCase, orderTradeUpdateOInnerFiInner.pLowerCase)
                && Objects.equals(this.qLowerCase, orderTradeUpdateOInnerFiInner.qLowerCase)
                && Objects.equals(this.T, orderTradeUpdateOInnerFiInner.T)
                && Objects.equals(this.mLowerCase, orderTradeUpdateOInnerFiInner.mLowerCase)
                && Objects.equals(this.fLowerCase, orderTradeUpdateOInnerFiInner.fLowerCase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tLowerCase, pLowerCase, qLowerCase, T, mLowerCase, fLowerCase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderTradeUpdateOInnerFiInner {\n");
        sb.append("		tLowerCase: ").append(toIndentedString(tLowerCase)).append("\n");
        sb.append("		pLowerCase: ").append(toIndentedString(pLowerCase)).append("\n");
        sb.append("		qLowerCase: ").append(toIndentedString(qLowerCase)).append("\n");
        sb.append("		T: ").append(toIndentedString(T)).append("\n");
        sb.append("		mLowerCase: ").append(toIndentedString(mLowerCase)).append("\n");
        sb.append("		fLowerCase: ").append(toIndentedString(fLowerCase)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> valMap = new TreeMap<String, String>();
        valMap.put("apiKey", getApiKey());
        String tLowerCaseValue = gettLowerCase();
        if (tLowerCaseValue != null) {
            String tLowerCaseValueAsString = tLowerCaseValue.toString();
            valMap.put("tLowerCase", tLowerCaseValueAsString);
        }
        String pLowerCaseValue = getpLowerCase();
        if (pLowerCaseValue != null) {
            String pLowerCaseValueAsString = pLowerCaseValue.toString();
            valMap.put("pLowerCase", pLowerCaseValueAsString);
        }
        String qLowerCaseValue = getqLowerCase();
        if (qLowerCaseValue != null) {
            String qLowerCaseValueAsString = qLowerCaseValue.toString();
            valMap.put("qLowerCase", qLowerCaseValueAsString);
        }
        Long TValue = getT();
        if (TValue != null) {
            String TValueAsString = TValue.toString();
            valMap.put("T", TValueAsString);
        }
        String mLowerCaseValue = getmLowerCase();
        if (mLowerCaseValue != null) {
            String mLowerCaseValueAsString = mLowerCaseValue.toString();
            valMap.put("mLowerCase", mLowerCaseValueAsString);
        }
        String fLowerCaseValue = getfLowerCase();
        if (fLowerCaseValue != null) {
            String fLowerCaseValueAsString = fLowerCaseValue.toString();
            valMap.put("fLowerCase", fLowerCaseValueAsString);
        }

        valMap.put("timestamp", getTimestamp());
        return asciiEncode(
                valMap.keySet().stream()
                        .map(key -> key + "=" + valMap.get(key))
                        .collect(Collectors.joining("&")));
    }

    public Map<String, Object> toMap() {
        Map<String, Object> valMap = new TreeMap<String, Object>();
        valMap.put("apiKey", getApiKey());
        Object tLowerCaseValue = gettLowerCase();
        if (tLowerCaseValue != null) {
            valMap.put("tLowerCase", tLowerCaseValue);
        }
        Object pLowerCaseValue = getpLowerCase();
        if (pLowerCaseValue != null) {
            valMap.put("pLowerCase", pLowerCaseValue);
        }
        Object qLowerCaseValue = getqLowerCase();
        if (qLowerCaseValue != null) {
            valMap.put("qLowerCase", qLowerCaseValue);
        }
        Object TValue = getT();
        if (TValue != null) {
            valMap.put("T", TValue);
        }
        Object mLowerCaseValue = getmLowerCase();
        if (mLowerCaseValue != null) {
            valMap.put("mLowerCase", mLowerCaseValue);
        }
        Object fLowerCaseValue = getfLowerCase();
        if (fLowerCaseValue != null) {
            valMap.put("fLowerCase", fLowerCaseValue);
        }

        valMap.put("timestamp", getTimestamp());
        return valMap;
    }

    public static String asciiEncode(String s) {
        return new String(s.getBytes(), StandardCharsets.US_ASCII);
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
        openapiFields.add("t");
        openapiFields.add("p");
        openapiFields.add("q");
        openapiFields.add("T");
        openapiFields.add("m");
        openapiFields.add("f");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     OrderTradeUpdateOInnerFiInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!OrderTradeUpdateOInnerFiInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in OrderTradeUpdateOInnerFiInner is not"
                                        + " found in the empty JSON string",
                                OrderTradeUpdateOInnerFiInner.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!OrderTradeUpdateOInnerFiInner.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `OrderTradeUpdateOInnerFiInner` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("t") != null && !jsonObj.get("t").isJsonNull())
                && !jsonObj.get("t").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `t` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("t").toString()));
        }
        if ((jsonObj.get("p") != null && !jsonObj.get("p").isJsonNull())
                && !jsonObj.get("p").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `p` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("p").toString()));
        }
        if ((jsonObj.get("q") != null && !jsonObj.get("q").isJsonNull())
                && !jsonObj.get("q").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `q` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("q").toString()));
        }
        if ((jsonObj.get("m") != null && !jsonObj.get("m").isJsonNull())
                && !jsonObj.get("m").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `m` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("m").toString()));
        }
        if ((jsonObj.get("f") != null && !jsonObj.get("f").isJsonNull())
                && !jsonObj.get("f").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `f` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("f").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!OrderTradeUpdateOInnerFiInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'OrderTradeUpdateOInnerFiInner' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<OrderTradeUpdateOInnerFiInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(OrderTradeUpdateOInnerFiInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<OrderTradeUpdateOInnerFiInner>() {
                        @Override
                        public void write(JsonWriter out, OrderTradeUpdateOInnerFiInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public OrderTradeUpdateOInnerFiInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of OrderTradeUpdateOInnerFiInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of OrderTradeUpdateOInnerFiInner
     * @throws IOException if the JSON string is invalid with respect to
     *     OrderTradeUpdateOInnerFiInner
     */
    public static OrderTradeUpdateOInnerFiInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, OrderTradeUpdateOInnerFiInner.class);
    }

    /**
     * Convert an instance of OrderTradeUpdateOInnerFiInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
