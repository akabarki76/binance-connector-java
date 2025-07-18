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
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Objects;
import org.hibernate.validator.constraints.*;

/** ModifyIsolatedPositionMarginResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ModifyIsolatedPositionMarginResponse {
    public static final String SERIALIZED_NAME_AMOUNT = "amount";

    @SerializedName(SERIALIZED_NAME_AMOUNT)
    @jakarta.annotation.Nullable
    private Double amount;

    public static final String SERIALIZED_NAME_CODE = "code";

    @SerializedName(SERIALIZED_NAME_CODE)
    @jakarta.annotation.Nullable
    private Long code;

    public static final String SERIALIZED_NAME_MSG = "msg";

    @SerializedName(SERIALIZED_NAME_MSG)
    @jakarta.annotation.Nullable
    private String msg;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @jakarta.annotation.Nullable
    private Long type;

    public ModifyIsolatedPositionMarginResponse() {}

    public ModifyIsolatedPositionMarginResponse amount(@jakarta.annotation.Nullable Double amount) {
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

    public ModifyIsolatedPositionMarginResponse code(@jakarta.annotation.Nullable Long code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     *
     * @return code
     */
    @jakarta.annotation.Nullable
    public Long getCode() {
        return code;
    }

    public void setCode(@jakarta.annotation.Nullable Long code) {
        this.code = code;
    }

    public ModifyIsolatedPositionMarginResponse msg(@jakarta.annotation.Nullable String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * Get msg
     *
     * @return msg
     */
    @jakarta.annotation.Nullable
    public String getMsg() {
        return msg;
    }

    public void setMsg(@jakarta.annotation.Nullable String msg) {
        this.msg = msg;
    }

    public ModifyIsolatedPositionMarginResponse type(@jakarta.annotation.Nullable Long type) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ModifyIsolatedPositionMarginResponse modifyIsolatedPositionMarginResponse =
                (ModifyIsolatedPositionMarginResponse) o;
        return Objects.equals(this.amount, modifyIsolatedPositionMarginResponse.amount)
                && Objects.equals(this.code, modifyIsolatedPositionMarginResponse.code)
                && Objects.equals(this.msg, modifyIsolatedPositionMarginResponse.msg)
                && Objects.equals(this.type, modifyIsolatedPositionMarginResponse.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, code, msg, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyIsolatedPositionMarginResponse {\n");
        sb.append("		amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("		code: ").append(toIndentedString(code)).append("\n");
        sb.append("		msg: ").append(toIndentedString(msg)).append("\n");
        sb.append("		type: ").append(toIndentedString(type)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object amountValue = getAmount();
        String amountValueAsString = "";
        amountValueAsString = amountValue.toString();
        sb.append("amount=").append(urlEncode(amountValueAsString)).append("");
        Object codeValue = getCode();
        String codeValueAsString = "";
        codeValueAsString = codeValue.toString();
        sb.append("code=").append(urlEncode(codeValueAsString)).append("");
        Object msgValue = getMsg();
        String msgValueAsString = "";
        msgValueAsString = msgValue.toString();
        sb.append("msg=").append(urlEncode(msgValueAsString)).append("");
        Object typeValue = getType();
        String typeValueAsString = "";
        typeValueAsString = typeValue.toString();
        sb.append("type=").append(urlEncode(typeValueAsString)).append("");
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
        openapiFields.add("amount");
        openapiFields.add("code");
        openapiFields.add("msg");
        openapiFields.add("type");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     ModifyIsolatedPositionMarginResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ModifyIsolatedPositionMarginResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ModifyIsolatedPositionMarginResponse"
                                        + " is not found in the empty JSON string",
                                ModifyIsolatedPositionMarginResponse.openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("msg") != null && !jsonObj.get("msg").isJsonNull())
                && !jsonObj.get("msg").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `msg` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("msg").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ModifyIsolatedPositionMarginResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ModifyIsolatedPositionMarginResponse'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ModifyIsolatedPositionMarginResponse> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(ModifyIsolatedPositionMarginResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ModifyIsolatedPositionMarginResponse>() {
                        @Override
                        public void write(
                                JsonWriter out, ModifyIsolatedPositionMarginResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ModifyIsolatedPositionMarginResponse read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ModifyIsolatedPositionMarginResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ModifyIsolatedPositionMarginResponse
     * @throws IOException if the JSON string is invalid with respect to
     *     ModifyIsolatedPositionMarginResponse
     */
    public static ModifyIsolatedPositionMarginResponse fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, ModifyIsolatedPositionMarginResponse.class);
    }

    /**
     * Convert an instance of ModifyIsolatedPositionMarginResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
