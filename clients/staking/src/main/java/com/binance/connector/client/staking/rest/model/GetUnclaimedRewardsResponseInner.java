/*
 * Binance Staking REST API
 * OpenAPI Specification for the Binance Staking REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.staking.rest.model;

import com.binance.connector.client.staking.rest.JSON;
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

/** GetUnclaimedRewardsResponseInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GetUnclaimedRewardsResponseInner {
    public static final String SERIALIZED_NAME_AMOUNT = "amount";

    @SerializedName(SERIALIZED_NAME_AMOUNT)
    @jakarta.annotation.Nullable
    private String amount;

    public static final String SERIALIZED_NAME_REWARDS_ASSET = "rewardsAsset";

    @SerializedName(SERIALIZED_NAME_REWARDS_ASSET)
    @jakarta.annotation.Nullable
    private String rewardsAsset;

    public GetUnclaimedRewardsResponseInner() {}

    public GetUnclaimedRewardsResponseInner amount(@jakarta.annotation.Nullable String amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @jakarta.annotation.Nullable
    public String getAmount() {
        return amount;
    }

    public void setAmount(@jakarta.annotation.Nullable String amount) {
        this.amount = amount;
    }

    public GetUnclaimedRewardsResponseInner rewardsAsset(
            @jakarta.annotation.Nullable String rewardsAsset) {
        this.rewardsAsset = rewardsAsset;
        return this;
    }

    /**
     * Get rewardsAsset
     *
     * @return rewardsAsset
     */
    @jakarta.annotation.Nullable
    public String getRewardsAsset() {
        return rewardsAsset;
    }

    public void setRewardsAsset(@jakarta.annotation.Nullable String rewardsAsset) {
        this.rewardsAsset = rewardsAsset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetUnclaimedRewardsResponseInner getUnclaimedRewardsResponseInner =
                (GetUnclaimedRewardsResponseInner) o;
        return Objects.equals(this.amount, getUnclaimedRewardsResponseInner.amount)
                && Objects.equals(this.rewardsAsset, getUnclaimedRewardsResponseInner.rewardsAsset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, rewardsAsset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetUnclaimedRewardsResponseInner {\n");
        sb.append("		amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("		rewardsAsset: ").append(toIndentedString(rewardsAsset)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object amountValue = getAmount();
        String amountValueAsString = "";
        amountValueAsString = amountValue.toString();
        sb.append("amount=").append(urlEncode(amountValueAsString)).append("");
        Object rewardsAssetValue = getRewardsAsset();
        String rewardsAssetValueAsString = "";
        rewardsAssetValueAsString = rewardsAssetValue.toString();
        sb.append("rewardsAsset=").append(urlEncode(rewardsAssetValueAsString)).append("");
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
        openapiFields.add("rewardsAsset");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     GetUnclaimedRewardsResponseInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetUnclaimedRewardsResponseInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in GetUnclaimedRewardsResponseInner is"
                                        + " not found in the empty JSON string",
                                GetUnclaimedRewardsResponseInner.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonNull())
                && !jsonObj.get("amount").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `amount` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("amount").toString()));
        }
        if ((jsonObj.get("rewardsAsset") != null && !jsonObj.get("rewardsAsset").isJsonNull())
                && !jsonObj.get("rewardsAsset").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `rewardsAsset` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("rewardsAsset").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetUnclaimedRewardsResponseInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'GetUnclaimedRewardsResponseInner' and
                // its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetUnclaimedRewardsResponseInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(GetUnclaimedRewardsResponseInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GetUnclaimedRewardsResponseInner>() {
                        @Override
                        public void write(JsonWriter out, GetUnclaimedRewardsResponseInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GetUnclaimedRewardsResponseInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GetUnclaimedRewardsResponseInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetUnclaimedRewardsResponseInner
     * @throws IOException if the JSON string is invalid with respect to
     *     GetUnclaimedRewardsResponseInner
     */
    public static GetUnclaimedRewardsResponseInner fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, GetUnclaimedRewardsResponseInner.class);
    }

    /**
     * Convert an instance of GetUnclaimedRewardsResponseInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
