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
import com.google.gson.JsonArray;
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import org.hibernate.validator.constraints.*;

/** AccountInformationResponse */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AccountInformationResponse {
    public static final String SERIALIZED_NAME_ASSETS = "assets";

    @SerializedName(SERIALIZED_NAME_ASSETS)
    @jakarta.annotation.Nullable
    private List<@Valid AccountInformationResponseAssetsInner> assets;

    public static final String SERIALIZED_NAME_POSITIONS = "positions";

    @SerializedName(SERIALIZED_NAME_POSITIONS)
    @jakarta.annotation.Nullable
    private List<@Valid AccountInformationResponsePositionsInner> positions;

    public static final String SERIALIZED_NAME_CAN_DEPOSIT = "canDeposit";

    @SerializedName(SERIALIZED_NAME_CAN_DEPOSIT)
    @jakarta.annotation.Nullable
    private Boolean canDeposit;

    public static final String SERIALIZED_NAME_CAN_TRADE = "canTrade";

    @SerializedName(SERIALIZED_NAME_CAN_TRADE)
    @jakarta.annotation.Nullable
    private Boolean canTrade;

    public static final String SERIALIZED_NAME_CAN_WITHDRAW = "canWithdraw";

    @SerializedName(SERIALIZED_NAME_CAN_WITHDRAW)
    @jakarta.annotation.Nullable
    private Boolean canWithdraw;

    public static final String SERIALIZED_NAME_FEE_TIER = "feeTier";

    @SerializedName(SERIALIZED_NAME_FEE_TIER)
    @jakarta.annotation.Nullable
    private Long feeTier;

    public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
    @jakarta.annotation.Nullable
    private Long updateTime;

    public AccountInformationResponse() {}

    public AccountInformationResponse assets(
            @jakarta.annotation.Nullable
                    List<@Valid AccountInformationResponseAssetsInner> assets) {
        this.assets = assets;
        return this;
    }

    public AccountInformationResponse addAssetsItem(
            AccountInformationResponseAssetsInner assetsItem) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(assetsItem);
        return this;
    }

    /**
     * Get assets
     *
     * @return assets
     */
    @jakarta.annotation.Nullable
    @Valid
    public List<@Valid AccountInformationResponseAssetsInner> getAssets() {
        return assets;
    }

    public void setAssets(
            @jakarta.annotation.Nullable
                    List<@Valid AccountInformationResponseAssetsInner> assets) {
        this.assets = assets;
    }

    public AccountInformationResponse positions(
            @jakarta.annotation.Nullable
                    List<@Valid AccountInformationResponsePositionsInner> positions) {
        this.positions = positions;
        return this;
    }

    public AccountInformationResponse addPositionsItem(
            AccountInformationResponsePositionsInner positionsItem) {
        if (this.positions == null) {
            this.positions = new ArrayList<>();
        }
        this.positions.add(positionsItem);
        return this;
    }

    /**
     * Get positions
     *
     * @return positions
     */
    @jakarta.annotation.Nullable
    @Valid
    public List<@Valid AccountInformationResponsePositionsInner> getPositions() {
        return positions;
    }

    public void setPositions(
            @jakarta.annotation.Nullable
                    List<@Valid AccountInformationResponsePositionsInner> positions) {
        this.positions = positions;
    }

    public AccountInformationResponse canDeposit(@jakarta.annotation.Nullable Boolean canDeposit) {
        this.canDeposit = canDeposit;
        return this;
    }

    /**
     * Get canDeposit
     *
     * @return canDeposit
     */
    @jakarta.annotation.Nullable
    public Boolean getCanDeposit() {
        return canDeposit;
    }

    public void setCanDeposit(@jakarta.annotation.Nullable Boolean canDeposit) {
        this.canDeposit = canDeposit;
    }

    public AccountInformationResponse canTrade(@jakarta.annotation.Nullable Boolean canTrade) {
        this.canTrade = canTrade;
        return this;
    }

    /**
     * Get canTrade
     *
     * @return canTrade
     */
    @jakarta.annotation.Nullable
    public Boolean getCanTrade() {
        return canTrade;
    }

    public void setCanTrade(@jakarta.annotation.Nullable Boolean canTrade) {
        this.canTrade = canTrade;
    }

    public AccountInformationResponse canWithdraw(
            @jakarta.annotation.Nullable Boolean canWithdraw) {
        this.canWithdraw = canWithdraw;
        return this;
    }

    /**
     * Get canWithdraw
     *
     * @return canWithdraw
     */
    @jakarta.annotation.Nullable
    public Boolean getCanWithdraw() {
        return canWithdraw;
    }

    public void setCanWithdraw(@jakarta.annotation.Nullable Boolean canWithdraw) {
        this.canWithdraw = canWithdraw;
    }

    public AccountInformationResponse feeTier(@jakarta.annotation.Nullable Long feeTier) {
        this.feeTier = feeTier;
        return this;
    }

    /**
     * Get feeTier
     *
     * @return feeTier
     */
    @jakarta.annotation.Nullable
    public Long getFeeTier() {
        return feeTier;
    }

    public void setFeeTier(@jakarta.annotation.Nullable Long feeTier) {
        this.feeTier = feeTier;
    }

    public AccountInformationResponse updateTime(@jakarta.annotation.Nullable Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * Get updateTime
     *
     * @return updateTime
     */
    @jakarta.annotation.Nullable
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(@jakarta.annotation.Nullable Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccountInformationResponse accountInformationResponse = (AccountInformationResponse) o;
        return Objects.equals(this.assets, accountInformationResponse.assets)
                && Objects.equals(this.positions, accountInformationResponse.positions)
                && Objects.equals(this.canDeposit, accountInformationResponse.canDeposit)
                && Objects.equals(this.canTrade, accountInformationResponse.canTrade)
                && Objects.equals(this.canWithdraw, accountInformationResponse.canWithdraw)
                && Objects.equals(this.feeTier, accountInformationResponse.feeTier)
                && Objects.equals(this.updateTime, accountInformationResponse.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                assets, positions, canDeposit, canTrade, canWithdraw, feeTier, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountInformationResponse {\n");
        sb.append("		assets: ").append(toIndentedString(assets)).append("\n");
        sb.append("		positions: ").append(toIndentedString(positions)).append("\n");
        sb.append("		canDeposit: ").append(toIndentedString(canDeposit)).append("\n");
        sb.append("		canTrade: ").append(toIndentedString(canTrade)).append("\n");
        sb.append("		canWithdraw: ").append(toIndentedString(canWithdraw)).append("\n");
        sb.append("		feeTier: ").append(toIndentedString(feeTier)).append("\n");
        sb.append("		updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object assetsValue = getAssets();
        String assetsValueAsString = "";
        assetsValueAsString =
                (String)
                        ((Collection) assetsValue)
                                .stream().map(Object::toString).collect(Collectors.joining(","));
        sb.append("assets=").append(urlEncode(assetsValueAsString)).append("");
        Object positionsValue = getPositions();
        String positionsValueAsString = "";
        positionsValueAsString =
                (String)
                        ((Collection) positionsValue)
                                .stream().map(Object::toString).collect(Collectors.joining(","));
        sb.append("positions=").append(urlEncode(positionsValueAsString)).append("");
        Object canDepositValue = getCanDeposit();
        String canDepositValueAsString = "";
        canDepositValueAsString = canDepositValue.toString();
        sb.append("canDeposit=").append(urlEncode(canDepositValueAsString)).append("");
        Object canTradeValue = getCanTrade();
        String canTradeValueAsString = "";
        canTradeValueAsString = canTradeValue.toString();
        sb.append("canTrade=").append(urlEncode(canTradeValueAsString)).append("");
        Object canWithdrawValue = getCanWithdraw();
        String canWithdrawValueAsString = "";
        canWithdrawValueAsString = canWithdrawValue.toString();
        sb.append("canWithdraw=").append(urlEncode(canWithdrawValueAsString)).append("");
        Object feeTierValue = getFeeTier();
        String feeTierValueAsString = "";
        feeTierValueAsString = feeTierValue.toString();
        sb.append("feeTier=").append(urlEncode(feeTierValueAsString)).append("");
        Object updateTimeValue = getUpdateTime();
        String updateTimeValueAsString = "";
        updateTimeValueAsString = updateTimeValue.toString();
        sb.append("updateTime=").append(urlEncode(updateTimeValueAsString)).append("");
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
        openapiFields.add("assets");
        openapiFields.add("positions");
        openapiFields.add("canDeposit");
        openapiFields.add("canTrade");
        openapiFields.add("canWithdraw");
        openapiFields.add("feeTier");
        openapiFields.add("updateTime");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to AccountInformationResponse
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AccountInformationResponse.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in AccountInformationResponse is not"
                                        + " found in the empty JSON string",
                                AccountInformationResponse.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (jsonObj.get("assets") != null && !jsonObj.get("assets").isJsonNull()) {
            JsonArray jsonArrayassets = jsonObj.getAsJsonArray("assets");
            if (jsonArrayassets != null) {
                // ensure the json data is an array
                if (!jsonObj.get("assets").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `assets` to be an array in the JSON string"
                                            + " but got `%s`",
                                    jsonObj.get("assets").toString()));
                }

                // validate the optional field `assets` (array)
                for (int i = 0; i < jsonArrayassets.size(); i++) {
                    AccountInformationResponseAssetsInner.validateJsonElement(
                            jsonArrayassets.get(i));
                }
                ;
            }
        }
        if (jsonObj.get("positions") != null && !jsonObj.get("positions").isJsonNull()) {
            JsonArray jsonArraypositions = jsonObj.getAsJsonArray("positions");
            if (jsonArraypositions != null) {
                // ensure the json data is an array
                if (!jsonObj.get("positions").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `positions` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("positions").toString()));
                }

                // validate the optional field `positions` (array)
                for (int i = 0; i < jsonArraypositions.size(); i++) {
                    AccountInformationResponsePositionsInner.validateJsonElement(
                            jsonArraypositions.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AccountInformationResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AccountInformationResponse' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AccountInformationResponse> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(AccountInformationResponse.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AccountInformationResponse>() {
                        @Override
                        public void write(JsonWriter out, AccountInformationResponse value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AccountInformationResponse read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AccountInformationResponse given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AccountInformationResponse
     * @throws IOException if the JSON string is invalid with respect to AccountInformationResponse
     */
    public static AccountInformationResponse fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, AccountInformationResponse.class);
    }

    /**
     * Convert an instance of AccountInformationResponse to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
