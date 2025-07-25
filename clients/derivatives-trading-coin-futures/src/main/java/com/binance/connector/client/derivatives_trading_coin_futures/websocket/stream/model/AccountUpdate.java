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
import jakarta.validation.Valid;
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

/** AccountUpdate */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AccountUpdate extends BaseDTO {
    public static final String SERIALIZED_NAME_E = "E";

    @SerializedName(SERIALIZED_NAME_E)
    @jakarta.annotation.Nullable
    private Long E;

    public static final String SERIALIZED_NAME_T = "T";

    @SerializedName(SERIALIZED_NAME_T)
    @jakarta.annotation.Nullable
    private Long T;

    public static final String SERIALIZED_NAME_I_LOWER_CASE = "i";

    @SerializedName(SERIALIZED_NAME_I_LOWER_CASE)
    @jakarta.annotation.Nullable
    private String iLowerCase;

    public static final String SERIALIZED_NAME_A_LOWER_CASE = "a";

    @SerializedName(SERIALIZED_NAME_A_LOWER_CASE)
    @jakarta.annotation.Nullable
    private AccountUpdateA aLowerCase;

    public AccountUpdate() {}

    public AccountUpdate E(@jakarta.annotation.Nullable Long E) {
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

    public AccountUpdate T(@jakarta.annotation.Nullable Long T) {
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

    public AccountUpdate iLowerCase(@jakarta.annotation.Nullable String iLowerCase) {
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

    public AccountUpdate aLowerCase(@jakarta.annotation.Nullable AccountUpdateA aLowerCase) {
        this.aLowerCase = aLowerCase;
        return this;
    }

    /**
     * Get aLowerCase
     *
     * @return aLowerCase
     */
    @jakarta.annotation.Nullable
    @Valid
    public AccountUpdateA getaLowerCase() {
        return aLowerCase;
    }

    public void setaLowerCase(@jakarta.annotation.Nullable AccountUpdateA aLowerCase) {
        this.aLowerCase = aLowerCase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountUpdate accountUpdate = (AccountUpdate) o;
        return Objects.equals(this.E, accountUpdate.E)
                && Objects.equals(this.T, accountUpdate.T)
                && Objects.equals(this.iLowerCase, accountUpdate.iLowerCase)
                && Objects.equals(this.aLowerCase, accountUpdate.aLowerCase);
    }

    @Override
    public int hashCode() {
        return Objects.hash(E, T, iLowerCase, aLowerCase);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountUpdate {\n");
        sb.append("		E: ").append(toIndentedString(E)).append("\n");
        sb.append("		T: ").append(toIndentedString(T)).append("\n");
        sb.append("		iLowerCase: ").append(toIndentedString(iLowerCase)).append("\n");
        sb.append("		aLowerCase: ").append(toIndentedString(aLowerCase)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();
        Map<String, String> valMap = new TreeMap<String, String>();
        valMap.put("apiKey", getApiKey());
        Long EValue = getE();
        if (EValue != null) {
            String EValueAsString = EValue.toString();
            valMap.put("E", EValueAsString);
        }
        Long TValue = getT();
        if (TValue != null) {
            String TValueAsString = TValue.toString();
            valMap.put("T", TValueAsString);
        }
        String iLowerCaseValue = getiLowerCase();
        if (iLowerCaseValue != null) {
            String iLowerCaseValueAsString = iLowerCaseValue.toString();
            valMap.put("iLowerCase", iLowerCaseValueAsString);
        }
        AccountUpdateA aLowerCaseValue = getaLowerCase();
        if (aLowerCaseValue != null) {
            String aLowerCaseValueAsString = JSON.getGson().toJson(aLowerCaseValue);
            valMap.put("aLowerCase", aLowerCaseValueAsString);
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
        Object EValue = getE();
        if (EValue != null) {
            valMap.put("E", EValue);
        }
        Object TValue = getT();
        if (TValue != null) {
            valMap.put("T", TValue);
        }
        Object iLowerCaseValue = getiLowerCase();
        if (iLowerCaseValue != null) {
            valMap.put("iLowerCase", iLowerCaseValue);
        }
        Object aLowerCaseValue = getaLowerCase();
        if (aLowerCaseValue != null) {
            valMap.put("aLowerCase", aLowerCaseValue);
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
        openapiFields.add("E");
        openapiFields.add("T");
        openapiFields.add("i");
        openapiFields.add("a");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AccountUpdate
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AccountUpdate.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AccountUpdate is not found in the"
                                        + " empty JSON string",
                                AccountUpdate.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!AccountUpdate.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `AccountUpdate` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("i") != null && !jsonObj.get("i").isJsonNull())
                && !jsonObj.get("i").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `i` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("i").toString()));
        }
        // validate the optional field `a`
        if (jsonObj.get("a") != null && !jsonObj.get("a").isJsonNull()) {
            AccountUpdateA.validateJsonElement(jsonObj.get("a"));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AccountUpdate.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AccountUpdate' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AccountUpdate> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AccountUpdate.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AccountUpdate>() {
                        @Override
                        public void write(JsonWriter out, AccountUpdate value) throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AccountUpdate read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AccountUpdate given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AccountUpdate
     * @throws IOException if the JSON string is invalid with respect to AccountUpdate
     */
    public static AccountUpdate fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AccountUpdate.class);
    }

    /**
     * Convert an instance of AccountUpdate to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
