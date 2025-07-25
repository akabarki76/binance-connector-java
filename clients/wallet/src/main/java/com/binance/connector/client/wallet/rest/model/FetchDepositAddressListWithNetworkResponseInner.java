/*
 * Binance Wallet REST API
 * OpenAPI Specification for the Binance Wallet REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.wallet.rest.model;

import com.binance.connector.client.wallet.rest.JSON;
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

/** FetchDepositAddressListWithNetworkResponseInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class FetchDepositAddressListWithNetworkResponseInner {
    public static final String SERIALIZED_NAME_COIN = "coin";

    @SerializedName(SERIALIZED_NAME_COIN)
    @jakarta.annotation.Nullable
    private String coin;

    public static final String SERIALIZED_NAME_ADDRESS = "address";

    @SerializedName(SERIALIZED_NAME_ADDRESS)
    @jakarta.annotation.Nullable
    private String address;

    public static final String SERIALIZED_NAME_TAG = "tag";

    @SerializedName(SERIALIZED_NAME_TAG)
    @jakarta.annotation.Nullable
    private String tag;

    public static final String SERIALIZED_NAME_IS_DEFAULT = "isDefault";

    @SerializedName(SERIALIZED_NAME_IS_DEFAULT)
    @jakarta.annotation.Nullable
    private Long isDefault;

    public FetchDepositAddressListWithNetworkResponseInner() {}

    public FetchDepositAddressListWithNetworkResponseInner coin(
            @jakarta.annotation.Nullable String coin) {
        this.coin = coin;
        return this;
    }

    /**
     * Get coin
     *
     * @return coin
     */
    @jakarta.annotation.Nullable
    public String getCoin() {
        return coin;
    }

    public void setCoin(@jakarta.annotation.Nullable String coin) {
        this.coin = coin;
    }

    public FetchDepositAddressListWithNetworkResponseInner address(
            @jakarta.annotation.Nullable String address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     */
    @jakarta.annotation.Nullable
    public String getAddress() {
        return address;
    }

    public void setAddress(@jakarta.annotation.Nullable String address) {
        this.address = address;
    }

    public FetchDepositAddressListWithNetworkResponseInner tag(
            @jakarta.annotation.Nullable String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get tag
     *
     * @return tag
     */
    @jakarta.annotation.Nullable
    public String getTag() {
        return tag;
    }

    public void setTag(@jakarta.annotation.Nullable String tag) {
        this.tag = tag;
    }

    public FetchDepositAddressListWithNetworkResponseInner isDefault(
            @jakarta.annotation.Nullable Long isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    /**
     * Get isDefault
     *
     * @return isDefault
     */
    @jakarta.annotation.Nullable
    public Long getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(@jakarta.annotation.Nullable Long isDefault) {
        this.isDefault = isDefault;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FetchDepositAddressListWithNetworkResponseInner
                fetchDepositAddressListWithNetworkResponseInner =
                        (FetchDepositAddressListWithNetworkResponseInner) o;
        return Objects.equals(this.coin, fetchDepositAddressListWithNetworkResponseInner.coin)
                && Objects.equals(
                        this.address, fetchDepositAddressListWithNetworkResponseInner.address)
                && Objects.equals(this.tag, fetchDepositAddressListWithNetworkResponseInner.tag)
                && Objects.equals(
                        this.isDefault, fetchDepositAddressListWithNetworkResponseInner.isDefault);
    }

    @Override
    public int hashCode() {
        return Objects.hash(coin, address, tag, isDefault);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FetchDepositAddressListWithNetworkResponseInner {\n");
        sb.append("		coin: ").append(toIndentedString(coin)).append("\n");
        sb.append("		address: ").append(toIndentedString(address)).append("\n");
        sb.append("		tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("		isDefault: ").append(toIndentedString(isDefault)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object coinValue = getCoin();
        String coinValueAsString = "";
        coinValueAsString = coinValue.toString();
        sb.append("coin=").append(urlEncode(coinValueAsString)).append("");
        Object addressValue = getAddress();
        String addressValueAsString = "";
        addressValueAsString = addressValue.toString();
        sb.append("address=").append(urlEncode(addressValueAsString)).append("");
        Object tagValue = getTag();
        String tagValueAsString = "";
        tagValueAsString = tagValue.toString();
        sb.append("tag=").append(urlEncode(tagValueAsString)).append("");
        Object isDefaultValue = getIsDefault();
        String isDefaultValueAsString = "";
        isDefaultValueAsString = isDefaultValue.toString();
        sb.append("isDefault=").append(urlEncode(isDefaultValueAsString)).append("");
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
        openapiFields.add("coin");
        openapiFields.add("address");
        openapiFields.add("tag");
        openapiFields.add("isDefault");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     FetchDepositAddressListWithNetworkResponseInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!FetchDepositAddressListWithNetworkResponseInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                        + " FetchDepositAddressListWithNetworkResponseInner is not"
                                        + " found in the empty JSON string",
                                FetchDepositAddressListWithNetworkResponseInner
                                        .openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("coin") != null && !jsonObj.get("coin").isJsonNull())
                && !jsonObj.get("coin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `coin` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("coin").toString()));
        }
        if ((jsonObj.get("address") != null && !jsonObj.get("address").isJsonNull())
                && !jsonObj.get("address").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `address` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("address").toString()));
        }
        if ((jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonNull())
                && !jsonObj.get("tag").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `tag` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("tag").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!FetchDepositAddressListWithNetworkResponseInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'FetchDepositAddressListWithNetworkResponseInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<FetchDepositAddressListWithNetworkResponseInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(FetchDepositAddressListWithNetworkResponseInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<FetchDepositAddressListWithNetworkResponseInner>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                FetchDepositAddressListWithNetworkResponseInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public FetchDepositAddressListWithNetworkResponseInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of FetchDepositAddressListWithNetworkResponseInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of FetchDepositAddressListWithNetworkResponseInner
     * @throws IOException if the JSON string is invalid with respect to
     *     FetchDepositAddressListWithNetworkResponseInner
     */
    public static FetchDepositAddressListWithNetworkResponseInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, FetchDepositAddressListWithNetworkResponseInner.class);
    }

    /**
     * Convert an instance of FetchDepositAddressListWithNetworkResponseInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
