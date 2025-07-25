/*
 * Binance Derivatives Trading COIN Futures WebSocket Market Streams
 * OpenAPI Specification for the Binance Derivatives Trading COIN Futures WebSocket Market Streams
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.model;

import com.binance.connector.client.common.websocket.dtos.BaseDTO;
import com.binance.connector.client.derivatives_trading_coin_futures.websocket.stream.JSON;
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

/** MarkPriceOfAllSymbolsOfAPairResponseInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class MarkPriceOfAllSymbolsOfAPairResponseInner extends BaseDTO {
    public static final String SERIALIZED_NAME_E_LOWER_CASE = "e";

    @SerializedName(SERIALIZED_NAME_E_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String eLowerCase;

    public static final String SERIALIZED_NAME_E = "E";

    @SerializedName(SERIALIZED_NAME_E)
    @jakarta.annotation.Nullable
    private Long E;

    public static final String SERIALIZED_NAME_S_LOWER_CASE = "s";

    @SerializedName(SERIALIZED_NAME_S_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String sLowerCase;

    public static final String SERIALIZED_NAME_P_LOWER_CASE = "p";

    @SerializedName(SERIALIZED_NAME_P_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String pLowerCase;

    public static final String SERIALIZED_NAME_P = "P";

    @SerializedName(SERIALIZED_NAME_P)
    @jakarta.annotation.Nullable
    private String P;

    public static final String SERIALIZED_NAME_I_LOWER_CASE = "i";

    @SerializedName(SERIALIZED_NAME_I_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String iLowerCase;

    public static final String SERIALIZED_NAME_R_LOWER_CASE = "r";

    @SerializedName(SERIALIZED_NAME_R_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String rLowerCase;

    public static final String SERIALIZED_NAME_T = "T";

    @SerializedName(SERIALIZED_NAME_T)
    @jakarta.annotation.Nullable
    private Long T;

    public MarkPriceOfAllSymbolsOfAPairResponseInner() {}

    public MarkPriceOfAllSymbolsOfAPairResponseInner eLowerCase(
            @jakarta.annotation.Nullable String eLowerCase) {
        this.eLowerCase = eLowerCase;
        return this;
    }

    /**
     * Get eLowerCase
     *
     * @return eLowerCase
     */
    @jakarta.annotation.Nullable
    public String geteLowerCase() {
        return eLowerCase;
    }

    public void seteLowerCase(@jakarta.annotation.Nullable String eLowerCase) {
        this.eLowerCase = eLowerCase;
    }

    public MarkPriceOfAllSymbolsOfAPairResponseInner E(@jakarta.annotation.Nullable Long E) {
        this.E = E;
        return this;
    }

    /**
     * Get E
     *
     * @return E
     */
    @jakarta.annotation.Nullable
    public Long getE() {
        return E;
    }

    public void setE(@jakarta.annotation.Nullable Long E) {
        this.E = E;
    }

    public MarkPriceOfAllSymbolsOfAPairResponseInner sLowerCase(
            @jakarta.annotation.Nullable String sLowerCase) {
        this.sLowerCase = sLowerCase;
        return this;
    }

    /**
     * Get sLowerCase
     *
     * @return sLowerCase
     */
    @jakarta.annotation.Nullable
    public String getsLowerCase() {
        return sLowerCase;
    }

    public void setsLowerCase(@jakarta.annotation.Nullable String sLowerCase) {
        this.sLowerCase = sLowerCase;
    }

    public MarkPriceOfAllSymbolsOfAPairResponseInner pLowerCase(
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

    public MarkPriceOfAllSymbolsOfAPairResponseInner P(@jakarta.annotation.Nullable String P) {
        this.P = P;
        return this;
    }

    /**
     * Get P
     *
     * @return P
     */
    @jakarta.annotation.Nullable
    public String getP() {
        return P;
    }

    public void setP(@jakarta.annotation.Nullable String P) {
        this.P = P;
    }

    public MarkPriceOfAllSymbolsOfAPairResponseInner iLowerCase(
            @jakarta.annotation.Nullable String iLowerCase) {
        this.iLowerCase = iLowerCase;
        return this;
    }

    /**
     * Get iLowerCase
     *
     * @return iLowerCase
     */
    @jakarta.annotation.Nullable
    public String getiLowerCase() {
        return iLowerCase;
    }

    public void setiLowerCase(@jakarta.annotation.Nullable String iLowerCase) {
        this.iLowerCase = iLowerCase;
    }

    public MarkPriceOfAllSymbolsOfAPairResponseInner rLowerCase(
            @jakarta.annotation.Nullable String rLowerCase) {
        this.rLowerCase = rLowerCase;
        return this;
    }

    /**
     * Get rLowerCase
     *
     * @return rLowerCase
     */
    @jakarta.annotation.Nullable
    public String getrLowerCase() {
        return rLowerCase;
    }

    public void setrLowerCase(@jakarta.annotation.Nullable String rLowerCase) {
        this.rLowerCase = rLowerCase;
    }

    public MarkPriceOfAllSymbolsOfAPairResponseInner T(@jakarta.annotation.Nullable Long T) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarkPriceOfAllSymbolsOfAPairResponseInner markPriceOfAllSymbolsOfAPairResponseInner =
                (MarkPriceOfAllSymbolsOfAPairResponseInner) o;
        return Objects.equals(this.eLowerCase, markPriceOfAllSymbolsOfAPairResponseInner.eLowerCase)
                && Objects.equals(this.E, markPriceOfAllSymbolsOfAPairResponseInner.E)
                && Objects.equals(
                        this.sLowerCase, markPriceOfAllSymbolsOfAPairResponseInner.sLowerCase)
                && Objects.equals(
                        this.pLowerCase, markPriceOfAllSymbolsOfAPairResponseInner.pLowerCase)
                && Objects.equals(this.P, markPriceOfAllSymbolsOfAPairResponseInner.P)
                && Objects.equals(
                        this.iLowerCase, markPriceOfAllSymbolsOfAPairResponseInner.iLowerCase)
                && Objects.equals(
                        this.rLowerCase, markPriceOfAllSymbolsOfAPairResponseInner.rLowerCase)
                && Objects.equals(this.T, markPriceOfAllSymbolsOfAPairResponseInner.T);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eLowerCase, E, sLowerCase, pLowerCase, P, iLowerCase, rLowerCase, T);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarkPriceOfAllSymbolsOfAPairResponseInner {\n");
        sb.append("		eLowerCase: ").append(toIndentedString(eLowerCase)).append("\n");
        sb.append("		E: ").append(toIndentedString(E)).append("\n");
        sb.append("		sLowerCase: ").append(toIndentedString(sLowerCase)).append("\n");
        sb.append("		pLowerCase: ").append(toIndentedString(pLowerCase)).append("\n");
        sb.append("		P: ").append(toIndentedString(P)).append("\n");
        sb.append("		iLowerCase: ").append(toIndentedString(iLowerCase)).append("\n");
        sb.append("		rLowerCase: ").append(toIndentedString(rLowerCase)).append("\n");
        sb.append("		T: ").append(toIndentedString(T)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> valMap = new TreeMap<String, String>();
        valMap.put("apiKey", getApiKey());
        String eLowerCaseValue = geteLowerCase();
        if (eLowerCaseValue != null) {
            String eLowerCaseValueAsString = eLowerCaseValue.toString();
            valMap.put("eLowerCase", eLowerCaseValueAsString);
        }
        Long EValue = getE();
        if (EValue != null) {
            String EValueAsString = EValue.toString();
            valMap.put("E", EValueAsString);
        }
        String sLowerCaseValue = getsLowerCase();
        if (sLowerCaseValue != null) {
            String sLowerCaseValueAsString = sLowerCaseValue.toString();
            valMap.put("sLowerCase", sLowerCaseValueAsString);
        }
        String pLowerCaseValue = getpLowerCase();
        if (pLowerCaseValue != null) {
            String pLowerCaseValueAsString = pLowerCaseValue.toString();
            valMap.put("pLowerCase", pLowerCaseValueAsString);
        }
        String PValue = getP();
        if (PValue != null) {
            String PValueAsString = PValue.toString();
            valMap.put("P", PValueAsString);
        }
        String iLowerCaseValue = getiLowerCase();
        if (iLowerCaseValue != null) {
            String iLowerCaseValueAsString = iLowerCaseValue.toString();
            valMap.put("iLowerCase", iLowerCaseValueAsString);
        }
        String rLowerCaseValue = getrLowerCase();
        if (rLowerCaseValue != null) {
            String rLowerCaseValueAsString = rLowerCaseValue.toString();
            valMap.put("rLowerCase", rLowerCaseValueAsString);
        }
        Long TValue = getT();
        if (TValue != null) {
            String TValueAsString = TValue.toString();
            valMap.put("T", TValueAsString);
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
        Object eLowerCaseValue = geteLowerCase();
        if (eLowerCaseValue != null) {
            valMap.put("eLowerCase", eLowerCaseValue);
        }
        Object EValue = getE();
        if (EValue != null) {
            valMap.put("E", EValue);
        }
        Object sLowerCaseValue = getsLowerCase();
        if (sLowerCaseValue != null) {
            valMap.put("sLowerCase", sLowerCaseValue);
        }
        Object pLowerCaseValue = getpLowerCase();
        if (pLowerCaseValue != null) {
            valMap.put("pLowerCase", pLowerCaseValue);
        }
        Object PValue = getP();
        if (PValue != null) {
            valMap.put("P", PValue);
        }
        Object iLowerCaseValue = getiLowerCase();
        if (iLowerCaseValue != null) {
            valMap.put("iLowerCase", iLowerCaseValue);
        }
        Object rLowerCaseValue = getrLowerCase();
        if (rLowerCaseValue != null) {
            valMap.put("rLowerCase", rLowerCaseValue);
        }
        Object TValue = getT();
        if (TValue != null) {
            valMap.put("T", TValue);
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
        openapiFields.add("e");
        openapiFields.add("E");
        openapiFields.add("s");
        openapiFields.add("p");
        openapiFields.add("P");
        openapiFields.add("i");
        openapiFields.add("r");
        openapiFields.add("T");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     MarkPriceOfAllSymbolsOfAPairResponseInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!MarkPriceOfAllSymbolsOfAPairResponseInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " MarkPriceOfAllSymbolsOfAPairResponseInner is not found in"
                                    + " the empty JSON string",
                                MarkPriceOfAllSymbolsOfAPairResponseInner.openapiRequiredFields
                                        .toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!MarkPriceOfAllSymbolsOfAPairResponseInner.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `MarkPriceOfAllSymbolsOfAPairResponseInner` properties."
                                        + " JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("e") != null && !jsonObj.get("e").isJsonNull())
                && !jsonObj.get("e").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `e` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("e").toString()));
        }
        if ((jsonObj.get("s") != null && !jsonObj.get("s").isJsonNull())
                && !jsonObj.get("s").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `s` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("s").toString()));
        }
        if ((jsonObj.get("p") != null && !jsonObj.get("p").isJsonNull())
                && !jsonObj.get("p").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `p` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("p").toString()));
        }
        if ((jsonObj.get("P") != null && !jsonObj.get("P").isJsonNull())
                && !jsonObj.get("P").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `P` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("P").toString()));
        }
        if ((jsonObj.get("i") != null && !jsonObj.get("i").isJsonNull())
                && !jsonObj.get("i").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `i` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("i").toString()));
        }
        if ((jsonObj.get("r") != null && !jsonObj.get("r").isJsonNull())
                && !jsonObj.get("r").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `r` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("r").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!MarkPriceOfAllSymbolsOfAPairResponseInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'MarkPriceOfAllSymbolsOfAPairResponseInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<MarkPriceOfAllSymbolsOfAPairResponseInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(MarkPriceOfAllSymbolsOfAPairResponseInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<MarkPriceOfAllSymbolsOfAPairResponseInner>() {
                        @Override
                        public void write(
                                JsonWriter out, MarkPriceOfAllSymbolsOfAPairResponseInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public MarkPriceOfAllSymbolsOfAPairResponseInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of MarkPriceOfAllSymbolsOfAPairResponseInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of MarkPriceOfAllSymbolsOfAPairResponseInner
     * @throws IOException if the JSON string is invalid with respect to
     *     MarkPriceOfAllSymbolsOfAPairResponseInner
     */
    public static MarkPriceOfAllSymbolsOfAPairResponseInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, MarkPriceOfAllSymbolsOfAPairResponseInner.class);
    }

    /**
     * Convert an instance of MarkPriceOfAllSymbolsOfAPairResponseInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
