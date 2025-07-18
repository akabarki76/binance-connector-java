/*
 * Binance VIP Loan REST API
 * OpenAPI Specification for the Binance VIP Loan REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.vip_loan.rest.model;

import com.binance.connector.client.vip_loan.rest.JSON;
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

/** VipLoanBorrowRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class VipLoanBorrowRequest {
    public static final String SERIALIZED_NAME_LOAN_ACCOUNT_ID = "loanAccountId";

    @SerializedName(SERIALIZED_NAME_LOAN_ACCOUNT_ID)
    @jakarta.annotation.Nonnull
    private Long loanAccountId;

    public static final String SERIALIZED_NAME_LOAN_COIN = "loanCoin";

    @SerializedName(SERIALIZED_NAME_LOAN_COIN)
    @jakarta.annotation.Nonnull
    private String loanCoin;

    public static final String SERIALIZED_NAME_LOAN_AMOUNT = "loanAmount";

    @SerializedName(SERIALIZED_NAME_LOAN_AMOUNT)
    @jakarta.annotation.Nonnull
    private Double loanAmount;

    public static final String SERIALIZED_NAME_COLLATERAL_ACCOUNT_ID = "collateralAccountId";

    @SerializedName(SERIALIZED_NAME_COLLATERAL_ACCOUNT_ID)
    @jakarta.annotation.Nonnull
    private Long collateralAccountId;

    public static final String SERIALIZED_NAME_COLLATERAL_COIN = "collateralCoin";

    @SerializedName(SERIALIZED_NAME_COLLATERAL_COIN)
    @jakarta.annotation.Nonnull
    private String collateralCoin;

    public static final String SERIALIZED_NAME_IS_FLEXIBLE_RATE = "isFlexibleRate";

    @SerializedName(SERIALIZED_NAME_IS_FLEXIBLE_RATE)
    @jakarta.annotation.Nonnull
    private Boolean isFlexibleRate;

    public static final String SERIALIZED_NAME_RECV_WINDOW = "recvWindow";

    @SerializedName(SERIALIZED_NAME_RECV_WINDOW)
    @jakarta.annotation.Nullable
    private Long recvWindow;

    public VipLoanBorrowRequest() {}

    public VipLoanBorrowRequest loanAccountId(@jakarta.annotation.Nonnull Long loanAccountId) {
        this.loanAccountId = loanAccountId;
        return this;
    }

    /**
     * Get loanAccountId
     *
     * @return loanAccountId
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public Long getLoanAccountId() {
        return loanAccountId;
    }

    public void setLoanAccountId(@jakarta.annotation.Nonnull Long loanAccountId) {
        this.loanAccountId = loanAccountId;
    }

    public VipLoanBorrowRequest loanCoin(@jakarta.annotation.Nonnull String loanCoin) {
        this.loanCoin = loanCoin;
        return this;
    }

    /**
     * Get loanCoin
     *
     * @return loanCoin
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getLoanCoin() {
        return loanCoin;
    }

    public void setLoanCoin(@jakarta.annotation.Nonnull String loanCoin) {
        this.loanCoin = loanCoin;
    }

    public VipLoanBorrowRequest loanAmount(@jakarta.annotation.Nonnull Double loanAmount) {
        this.loanAmount = loanAmount;
        return this;
    }

    /**
     * Get loanAmount
     *
     * @return loanAmount
     */
    @jakarta.annotation.Nonnull
    @NotNull
    @Valid
    public Double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(@jakarta.annotation.Nonnull Double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public VipLoanBorrowRequest collateralAccountId(
            @jakarta.annotation.Nonnull Long collateralAccountId) {
        this.collateralAccountId = collateralAccountId;
        return this;
    }

    /**
     * Get collateralAccountId
     *
     * @return collateralAccountId
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public Long getCollateralAccountId() {
        return collateralAccountId;
    }

    public void setCollateralAccountId(@jakarta.annotation.Nonnull Long collateralAccountId) {
        this.collateralAccountId = collateralAccountId;
    }

    public VipLoanBorrowRequest collateralCoin(@jakarta.annotation.Nonnull String collateralCoin) {
        this.collateralCoin = collateralCoin;
        return this;
    }

    /**
     * Get collateralCoin
     *
     * @return collateralCoin
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getCollateralCoin() {
        return collateralCoin;
    }

    public void setCollateralCoin(@jakarta.annotation.Nonnull String collateralCoin) {
        this.collateralCoin = collateralCoin;
    }

    public VipLoanBorrowRequest isFlexibleRate(@jakarta.annotation.Nonnull Boolean isFlexibleRate) {
        this.isFlexibleRate = isFlexibleRate;
        return this;
    }

    /**
     * Get isFlexibleRate
     *
     * @return isFlexibleRate
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public Boolean getIsFlexibleRate() {
        return isFlexibleRate;
    }

    public void setIsFlexibleRate(@jakarta.annotation.Nonnull Boolean isFlexibleRate) {
        this.isFlexibleRate = isFlexibleRate;
    }

    public VipLoanBorrowRequest recvWindow(@jakarta.annotation.Nullable Long recvWindow) {
        this.recvWindow = recvWindow;
        return this;
    }

    /**
     * Get recvWindow
     *
     * @return recvWindow
     */
    @jakarta.annotation.Nullable
    public Long getRecvWindow() {
        return recvWindow;
    }

    public void setRecvWindow(@jakarta.annotation.Nullable Long recvWindow) {
        this.recvWindow = recvWindow;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VipLoanBorrowRequest vipLoanBorrowRequest = (VipLoanBorrowRequest) o;
        return Objects.equals(this.loanAccountId, vipLoanBorrowRequest.loanAccountId)
                && Objects.equals(this.loanCoin, vipLoanBorrowRequest.loanCoin)
                && Objects.equals(this.loanAmount, vipLoanBorrowRequest.loanAmount)
                && Objects.equals(
                        this.collateralAccountId, vipLoanBorrowRequest.collateralAccountId)
                && Objects.equals(this.collateralCoin, vipLoanBorrowRequest.collateralCoin)
                && Objects.equals(this.isFlexibleRate, vipLoanBorrowRequest.isFlexibleRate)
                && Objects.equals(this.recvWindow, vipLoanBorrowRequest.recvWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                loanAccountId,
                loanCoin,
                loanAmount,
                collateralAccountId,
                collateralCoin,
                isFlexibleRate,
                recvWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VipLoanBorrowRequest {\n");
        sb.append("		loanAccountId: ").append(toIndentedString(loanAccountId)).append("\n");
        sb.append("		loanCoin: ").append(toIndentedString(loanCoin)).append("\n");
        sb.append("		loanAmount: ").append(toIndentedString(loanAmount)).append("\n");
        sb.append("		collateralAccountId: ")
                .append(toIndentedString(collateralAccountId))
                .append("\n");
        sb.append("		collateralCoin: ").append(toIndentedString(collateralCoin)).append("\n");
        sb.append("		isFlexibleRate: ").append(toIndentedString(isFlexibleRate)).append("\n");
        sb.append("		recvWindow: ").append(toIndentedString(recvWindow)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object loanAccountIdValue = getLoanAccountId();
        String loanAccountIdValueAsString = "";
        loanAccountIdValueAsString = loanAccountIdValue.toString();
        sb.append("loanAccountId=").append(urlEncode(loanAccountIdValueAsString)).append("");
        Object loanCoinValue = getLoanCoin();
        String loanCoinValueAsString = "";
        loanCoinValueAsString = loanCoinValue.toString();
        sb.append("loanCoin=").append(urlEncode(loanCoinValueAsString)).append("");
        Object loanAmountValue = getLoanAmount();
        String loanAmountValueAsString = "";
        loanAmountValueAsString = loanAmountValue.toString();
        sb.append("loanAmount=").append(urlEncode(loanAmountValueAsString)).append("");
        Object collateralAccountIdValue = getCollateralAccountId();
        String collateralAccountIdValueAsString = "";
        collateralAccountIdValueAsString = collateralAccountIdValue.toString();
        sb.append("collateralAccountId=")
                .append(urlEncode(collateralAccountIdValueAsString))
                .append("");
        Object collateralCoinValue = getCollateralCoin();
        String collateralCoinValueAsString = "";
        collateralCoinValueAsString = collateralCoinValue.toString();
        sb.append("collateralCoin=").append(urlEncode(collateralCoinValueAsString)).append("");
        Object isFlexibleRateValue = getIsFlexibleRate();
        String isFlexibleRateValueAsString = "";
        isFlexibleRateValueAsString = isFlexibleRateValue.toString();
        sb.append("isFlexibleRate=").append(urlEncode(isFlexibleRateValueAsString)).append("");
        Object recvWindowValue = getRecvWindow();
        String recvWindowValueAsString = "";
        recvWindowValueAsString = recvWindowValue.toString();
        sb.append("recvWindow=").append(urlEncode(recvWindowValueAsString)).append("");
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
        openapiFields.add("loanAccountId");
        openapiFields.add("loanCoin");
        openapiFields.add("loanAmount");
        openapiFields.add("collateralAccountId");
        openapiFields.add("collateralCoin");
        openapiFields.add("isFlexibleRate");
        openapiFields.add("recvWindow");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("loanAccountId");
        openapiRequiredFields.add("loanCoin");
        openapiRequiredFields.add("loanAmount");
        openapiRequiredFields.add("collateralAccountId");
        openapiRequiredFields.add("collateralCoin");
        openapiRequiredFields.add("isFlexibleRate");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to VipLoanBorrowRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!VipLoanBorrowRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in VipLoanBorrowRequest is not found in"
                                        + " the empty JSON string",
                                VipLoanBorrowRequest.openapiRequiredFields.toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : VipLoanBorrowRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("loanCoin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `loanCoin` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("loanCoin").toString()));
        }
        if (!jsonObj.get("collateralCoin").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `collateralCoin` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("collateralCoin").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!VipLoanBorrowRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'VipLoanBorrowRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<VipLoanBorrowRequest> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(VipLoanBorrowRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<VipLoanBorrowRequest>() {
                        @Override
                        public void write(JsonWriter out, VipLoanBorrowRequest value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public VipLoanBorrowRequest read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of VipLoanBorrowRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of VipLoanBorrowRequest
     * @throws IOException if the JSON string is invalid with respect to VipLoanBorrowRequest
     */
    public static VipLoanBorrowRequest fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, VipLoanBorrowRequest.class);
    }

    /**
     * Convert an instance of VipLoanBorrowRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
