/*
 * Binance Crypto Loan REST API
 * OpenAPI Specification for the Binance Crypto Loan REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.crypto_loan.rest.model;

import com.binance.connector.client.crypto_loan.rest.JSON;
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

/** GetFlexibleLoanLiquidationHistoryResponseRowsInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class GetFlexibleLoanLiquidationHistoryResponseRowsInner {
    public static final String SERIALIZED_NAME_LOAN_COIN = "loanCoin";

    @SerializedName(SERIALIZED_NAME_LOAN_COIN)
    @jakarta.annotation.Nullable
    private String loanCoin;

    public static final String SERIALIZED_NAME_LIQUIDATION_DEBT = "liquidationDebt";

    @SerializedName(SERIALIZED_NAME_LIQUIDATION_DEBT)
    @jakarta.annotation.Nullable
    private String liquidationDebt;

    public static final String SERIALIZED_NAME_COLLATERAL_COIN = "collateralCoin";

    @SerializedName(SERIALIZED_NAME_COLLATERAL_COIN)
    @jakarta.annotation.Nullable
    private String collateralCoin;

    public static final String SERIALIZED_NAME_LIQUIDATION_COLLATERAL_AMOUNT =
            "liquidationCollateralAmount";

    @SerializedName(SERIALIZED_NAME_LIQUIDATION_COLLATERAL_AMOUNT)
    @jakarta.annotation.Nullable
    private String liquidationCollateralAmount;

    public static final String SERIALIZED_NAME_RETURN_COLLATERAL_AMOUNT = "returnCollateralAmount";

    @SerializedName(SERIALIZED_NAME_RETURN_COLLATERAL_AMOUNT)
    @jakarta.annotation.Nullable
    private String returnCollateralAmount;

    public static final String SERIALIZED_NAME_LIQUIDATION_FEE = "liquidationFee";

    @SerializedName(SERIALIZED_NAME_LIQUIDATION_FEE)
    @jakarta.annotation.Nullable
    private String liquidationFee;

    public static final String SERIALIZED_NAME_LIQUIDATION_STARTING_PRICE =
            "liquidationStartingPrice";

    @SerializedName(SERIALIZED_NAME_LIQUIDATION_STARTING_PRICE)
    @jakarta.annotation.Nullable
    private String liquidationStartingPrice;

    public static final String SERIALIZED_NAME_LIQUIDATION_STARTING_TIME =
            "liquidationStartingTime";

    @SerializedName(SERIALIZED_NAME_LIQUIDATION_STARTING_TIME)
    @jakarta.annotation.Nullable
    private Long liquidationStartingTime;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    @jakarta.annotation.Nullable
    private String status;

    public GetFlexibleLoanLiquidationHistoryResponseRowsInner() {}

    public GetFlexibleLoanLiquidationHistoryResponseRowsInner loanCoin(
            @jakarta.annotation.Nullable String loanCoin) {
        this.loanCoin = loanCoin;
        return this;
    }

    /**
     * Get loanCoin
     *
     * @return loanCoin
     */
    @jakarta.annotation.Nullable
    public String getLoanCoin() {
        return loanCoin;
    }

    public void setLoanCoin(@jakarta.annotation.Nullable String loanCoin) {
        this.loanCoin = loanCoin;
    }

    public GetFlexibleLoanLiquidationHistoryResponseRowsInner liquidationDebt(
            @jakarta.annotation.Nullable String liquidationDebt) {
        this.liquidationDebt = liquidationDebt;
        return this;
    }

    /**
     * Get liquidationDebt
     *
     * @return liquidationDebt
     */
    @jakarta.annotation.Nullable
    public String getLiquidationDebt() {
        return liquidationDebt;
    }

    public void setLiquidationDebt(@jakarta.annotation.Nullable String liquidationDebt) {
        this.liquidationDebt = liquidationDebt;
    }

    public GetFlexibleLoanLiquidationHistoryResponseRowsInner collateralCoin(
            @jakarta.annotation.Nullable String collateralCoin) {
        this.collateralCoin = collateralCoin;
        return this;
    }

    /**
     * Get collateralCoin
     *
     * @return collateralCoin
     */
    @jakarta.annotation.Nullable
    public String getCollateralCoin() {
        return collateralCoin;
    }

    public void setCollateralCoin(@jakarta.annotation.Nullable String collateralCoin) {
        this.collateralCoin = collateralCoin;
    }

    public GetFlexibleLoanLiquidationHistoryResponseRowsInner liquidationCollateralAmount(
            @jakarta.annotation.Nullable String liquidationCollateralAmount) {
        this.liquidationCollateralAmount = liquidationCollateralAmount;
        return this;
    }

    /**
     * Get liquidationCollateralAmount
     *
     * @return liquidationCollateralAmount
     */
    @jakarta.annotation.Nullable
    public String getLiquidationCollateralAmount() {
        return liquidationCollateralAmount;
    }

    public void setLiquidationCollateralAmount(
            @jakarta.annotation.Nullable String liquidationCollateralAmount) {
        this.liquidationCollateralAmount = liquidationCollateralAmount;
    }

    public GetFlexibleLoanLiquidationHistoryResponseRowsInner returnCollateralAmount(
            @jakarta.annotation.Nullable String returnCollateralAmount) {
        this.returnCollateralAmount = returnCollateralAmount;
        return this;
    }

    /**
     * Get returnCollateralAmount
     *
     * @return returnCollateralAmount
     */
    @jakarta.annotation.Nullable
    public String getReturnCollateralAmount() {
        return returnCollateralAmount;
    }

    public void setReturnCollateralAmount(
            @jakarta.annotation.Nullable String returnCollateralAmount) {
        this.returnCollateralAmount = returnCollateralAmount;
    }

    public GetFlexibleLoanLiquidationHistoryResponseRowsInner liquidationFee(
            @jakarta.annotation.Nullable String liquidationFee) {
        this.liquidationFee = liquidationFee;
        return this;
    }

    /**
     * Get liquidationFee
     *
     * @return liquidationFee
     */
    @jakarta.annotation.Nullable
    public String getLiquidationFee() {
        return liquidationFee;
    }

    public void setLiquidationFee(@jakarta.annotation.Nullable String liquidationFee) {
        this.liquidationFee = liquidationFee;
    }

    public GetFlexibleLoanLiquidationHistoryResponseRowsInner liquidationStartingPrice(
            @jakarta.annotation.Nullable String liquidationStartingPrice) {
        this.liquidationStartingPrice = liquidationStartingPrice;
        return this;
    }

    /**
     * Get liquidationStartingPrice
     *
     * @return liquidationStartingPrice
     */
    @jakarta.annotation.Nullable
    public String getLiquidationStartingPrice() {
        return liquidationStartingPrice;
    }

    public void setLiquidationStartingPrice(
            @jakarta.annotation.Nullable String liquidationStartingPrice) {
        this.liquidationStartingPrice = liquidationStartingPrice;
    }

    public GetFlexibleLoanLiquidationHistoryResponseRowsInner liquidationStartingTime(
            @jakarta.annotation.Nullable Long liquidationStartingTime) {
        this.liquidationStartingTime = liquidationStartingTime;
        return this;
    }

    /**
     * Get liquidationStartingTime
     *
     * @return liquidationStartingTime
     */
    @jakarta.annotation.Nullable
    public Long getLiquidationStartingTime() {
        return liquidationStartingTime;
    }

    public void setLiquidationStartingTime(
            @jakarta.annotation.Nullable Long liquidationStartingTime) {
        this.liquidationStartingTime = liquidationStartingTime;
    }

    public GetFlexibleLoanLiquidationHistoryResponseRowsInner status(
            @jakarta.annotation.Nullable String status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @jakarta.annotation.Nullable
    public String getStatus() {
        return status;
    }

    public void setStatus(@jakarta.annotation.Nullable String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GetFlexibleLoanLiquidationHistoryResponseRowsInner
                getFlexibleLoanLiquidationHistoryResponseRowsInner =
                        (GetFlexibleLoanLiquidationHistoryResponseRowsInner) o;
        return Objects.equals(
                        this.loanCoin, getFlexibleLoanLiquidationHistoryResponseRowsInner.loanCoin)
                && Objects.equals(
                        this.liquidationDebt,
                        getFlexibleLoanLiquidationHistoryResponseRowsInner.liquidationDebt)
                && Objects.equals(
                        this.collateralCoin,
                        getFlexibleLoanLiquidationHistoryResponseRowsInner.collateralCoin)
                && Objects.equals(
                        this.liquidationCollateralAmount,
                        getFlexibleLoanLiquidationHistoryResponseRowsInner
                                .liquidationCollateralAmount)
                && Objects.equals(
                        this.returnCollateralAmount,
                        getFlexibleLoanLiquidationHistoryResponseRowsInner.returnCollateralAmount)
                && Objects.equals(
                        this.liquidationFee,
                        getFlexibleLoanLiquidationHistoryResponseRowsInner.liquidationFee)
                && Objects.equals(
                        this.liquidationStartingPrice,
                        getFlexibleLoanLiquidationHistoryResponseRowsInner.liquidationStartingPrice)
                && Objects.equals(
                        this.liquidationStartingTime,
                        getFlexibleLoanLiquidationHistoryResponseRowsInner.liquidationStartingTime)
                && Objects.equals(
                        this.status, getFlexibleLoanLiquidationHistoryResponseRowsInner.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                loanCoin,
                liquidationDebt,
                collateralCoin,
                liquidationCollateralAmount,
                returnCollateralAmount,
                liquidationFee,
                liquidationStartingPrice,
                liquidationStartingTime,
                status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetFlexibleLoanLiquidationHistoryResponseRowsInner {\n");
        sb.append("		loanCoin: ").append(toIndentedString(loanCoin)).append("\n");
        sb.append("		liquidationDebt: ").append(toIndentedString(liquidationDebt)).append("\n");
        sb.append("		collateralCoin: ").append(toIndentedString(collateralCoin)).append("\n");
        sb.append("		liquidationCollateralAmount: ")
                .append(toIndentedString(liquidationCollateralAmount))
                .append("\n");
        sb.append("		returnCollateralAmount: ")
                .append(toIndentedString(returnCollateralAmount))
                .append("\n");
        sb.append("		liquidationFee: ").append(toIndentedString(liquidationFee)).append("\n");
        sb.append("		liquidationStartingPrice: ")
                .append(toIndentedString(liquidationStartingPrice))
                .append("\n");
        sb.append("		liquidationStartingTime: ")
                .append(toIndentedString(liquidationStartingTime))
                .append("\n");
        sb.append("		status: ").append(toIndentedString(status)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object loanCoinValue = getLoanCoin();
        String loanCoinValueAsString = "";
        loanCoinValueAsString = loanCoinValue.toString();
        sb.append("loanCoin=").append(urlEncode(loanCoinValueAsString)).append("");
        Object liquidationDebtValue = getLiquidationDebt();
        String liquidationDebtValueAsString = "";
        liquidationDebtValueAsString = liquidationDebtValue.toString();
        sb.append("liquidationDebt=").append(urlEncode(liquidationDebtValueAsString)).append("");
        Object collateralCoinValue = getCollateralCoin();
        String collateralCoinValueAsString = "";
        collateralCoinValueAsString = collateralCoinValue.toString();
        sb.append("collateralCoin=").append(urlEncode(collateralCoinValueAsString)).append("");
        Object liquidationCollateralAmountValue = getLiquidationCollateralAmount();
        String liquidationCollateralAmountValueAsString = "";
        liquidationCollateralAmountValueAsString = liquidationCollateralAmountValue.toString();
        sb.append("liquidationCollateralAmount=")
                .append(urlEncode(liquidationCollateralAmountValueAsString))
                .append("");
        Object returnCollateralAmountValue = getReturnCollateralAmount();
        String returnCollateralAmountValueAsString = "";
        returnCollateralAmountValueAsString = returnCollateralAmountValue.toString();
        sb.append("returnCollateralAmount=")
                .append(urlEncode(returnCollateralAmountValueAsString))
                .append("");
        Object liquidationFeeValue = getLiquidationFee();
        String liquidationFeeValueAsString = "";
        liquidationFeeValueAsString = liquidationFeeValue.toString();
        sb.append("liquidationFee=").append(urlEncode(liquidationFeeValueAsString)).append("");
        Object liquidationStartingPriceValue = getLiquidationStartingPrice();
        String liquidationStartingPriceValueAsString = "";
        liquidationStartingPriceValueAsString = liquidationStartingPriceValue.toString();
        sb.append("liquidationStartingPrice=")
                .append(urlEncode(liquidationStartingPriceValueAsString))
                .append("");
        Object liquidationStartingTimeValue = getLiquidationStartingTime();
        String liquidationStartingTimeValueAsString = "";
        liquidationStartingTimeValueAsString = liquidationStartingTimeValue.toString();
        sb.append("liquidationStartingTime=")
                .append(urlEncode(liquidationStartingTimeValueAsString))
                .append("");
        Object statusValue = getStatus();
        String statusValueAsString = "";
        statusValueAsString = statusValue.toString();
        sb.append("status=").append(urlEncode(statusValueAsString)).append("");
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
        openapiFields.add("loanCoin");
        openapiFields.add("liquidationDebt");
        openapiFields.add("collateralCoin");
        openapiFields.add("liquidationCollateralAmount");
        openapiFields.add("returnCollateralAmount");
        openapiFields.add("liquidationFee");
        openapiFields.add("liquidationStartingPrice");
        openapiFields.add("liquidationStartingTime");
        openapiFields.add("status");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     GetFlexibleLoanLiquidationHistoryResponseRowsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!GetFlexibleLoanLiquidationHistoryResponseRowsInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " GetFlexibleLoanLiquidationHistoryResponseRowsInner is not"
                                    + " found in the empty JSON string",
                                GetFlexibleLoanLiquidationHistoryResponseRowsInner
                                        .openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("loanCoin") != null && !jsonObj.get("loanCoin").isJsonNull())
                && !jsonObj.get("loanCoin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `loanCoin` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("loanCoin").toString()));
        }
        if ((jsonObj.get("liquidationDebt") != null && !jsonObj.get("liquidationDebt").isJsonNull())
                && !jsonObj.get("liquidationDebt").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `liquidationDebt` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("liquidationDebt").toString()));
        }
        if ((jsonObj.get("collateralCoin") != null && !jsonObj.get("collateralCoin").isJsonNull())
                && !jsonObj.get("collateralCoin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `collateralCoin` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("collateralCoin").toString()));
        }
        if ((jsonObj.get("liquidationCollateralAmount") != null
                        && !jsonObj.get("liquidationCollateralAmount").isJsonNull())
                && !jsonObj.get("liquidationCollateralAmount").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `liquidationCollateralAmount` to be a primitive"
                                    + " type in the JSON string but got `%s`",
                            jsonObj.get("liquidationCollateralAmount").toString()));
        }
        if ((jsonObj.get("returnCollateralAmount") != null
                        && !jsonObj.get("returnCollateralAmount").isJsonNull())
                && !jsonObj.get("returnCollateralAmount").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `returnCollateralAmount` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("returnCollateralAmount").toString()));
        }
        if ((jsonObj.get("liquidationFee") != null && !jsonObj.get("liquidationFee").isJsonNull())
                && !jsonObj.get("liquidationFee").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `liquidationFee` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("liquidationFee").toString()));
        }
        if ((jsonObj.get("liquidationStartingPrice") != null
                        && !jsonObj.get("liquidationStartingPrice").isJsonNull())
                && !jsonObj.get("liquidationStartingPrice").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `liquidationStartingPrice` to be a primitive type"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("liquidationStartingPrice").toString()));
        }
        if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull())
                && !jsonObj.get("status").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `status` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("status").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!GetFlexibleLoanLiquidationHistoryResponseRowsInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'GetFlexibleLoanLiquidationHistoryResponseRowsInner' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<GetFlexibleLoanLiquidationHistoryResponseRowsInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(
                                    GetFlexibleLoanLiquidationHistoryResponseRowsInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<GetFlexibleLoanLiquidationHistoryResponseRowsInner>() {
                        @Override
                        public void write(
                                JsonWriter out,
                                GetFlexibleLoanLiquidationHistoryResponseRowsInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public GetFlexibleLoanLiquidationHistoryResponseRowsInner read(
                                JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of GetFlexibleLoanLiquidationHistoryResponseRowsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of GetFlexibleLoanLiquidationHistoryResponseRowsInner
     * @throws IOException if the JSON string is invalid with respect to
     *     GetFlexibleLoanLiquidationHistoryResponseRowsInner
     */
    public static GetFlexibleLoanLiquidationHistoryResponseRowsInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, GetFlexibleLoanLiquidationHistoryResponseRowsInner.class);
    }

    /**
     * Convert an instance of GetFlexibleLoanLiquidationHistoryResponseRowsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
