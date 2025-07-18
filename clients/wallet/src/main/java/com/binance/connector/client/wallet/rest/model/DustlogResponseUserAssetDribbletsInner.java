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

/** DustlogResponseUserAssetDribbletsInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DustlogResponseUserAssetDribbletsInner {
    public static final String SERIALIZED_NAME_OPERATE_TIME = "operateTime";

    @SerializedName(SERIALIZED_NAME_OPERATE_TIME)
    @jakarta.annotation.Nullable
    private Long operateTime;

    public static final String SERIALIZED_NAME_TOTAL_TRANSFERED_AMOUNT = "totalTransferedAmount";

    @SerializedName(SERIALIZED_NAME_TOTAL_TRANSFERED_AMOUNT)
    @jakarta.annotation.Nullable
    private String totalTransferedAmount;

    public static final String SERIALIZED_NAME_TOTAL_SERVICE_CHARGE_AMOUNT =
            "totalServiceChargeAmount";

    @SerializedName(SERIALIZED_NAME_TOTAL_SERVICE_CHARGE_AMOUNT)
    @jakarta.annotation.Nullable
    private String totalServiceChargeAmount;

    public static final String SERIALIZED_NAME_TRANS_ID = "transId";

    @SerializedName(SERIALIZED_NAME_TRANS_ID)
    @jakarta.annotation.Nullable
    private Long transId;

    public static final String SERIALIZED_NAME_USER_ASSET_DRIBBLET_DETAILS =
            "userAssetDribbletDetails";

    @SerializedName(SERIALIZED_NAME_USER_ASSET_DRIBBLET_DETAILS)
    @jakarta.annotation.Nullable
    private List<@Valid DustlogResponseUserAssetDribbletsInnerUserAssetDribbletDetailsInner>
            userAssetDribbletDetails;

    public DustlogResponseUserAssetDribbletsInner() {}

    public DustlogResponseUserAssetDribbletsInner operateTime(
            @jakarta.annotation.Nullable Long operateTime) {
        this.operateTime = operateTime;
        return this;
    }

    /**
     * Get operateTime
     *
     * @return operateTime
     */
    @jakarta.annotation.Nullable
    public Long getOperateTime() {
        return operateTime;
    }

    public void setOperateTime(@jakarta.annotation.Nullable Long operateTime) {
        this.operateTime = operateTime;
    }

    public DustlogResponseUserAssetDribbletsInner totalTransferedAmount(
            @jakarta.annotation.Nullable String totalTransferedAmount) {
        this.totalTransferedAmount = totalTransferedAmount;
        return this;
    }

    /**
     * Get totalTransferedAmount
     *
     * @return totalTransferedAmount
     */
    @jakarta.annotation.Nullable
    public String getTotalTransferedAmount() {
        return totalTransferedAmount;
    }

    public void setTotalTransferedAmount(
            @jakarta.annotation.Nullable String totalTransferedAmount) {
        this.totalTransferedAmount = totalTransferedAmount;
    }

    public DustlogResponseUserAssetDribbletsInner totalServiceChargeAmount(
            @jakarta.annotation.Nullable String totalServiceChargeAmount) {
        this.totalServiceChargeAmount = totalServiceChargeAmount;
        return this;
    }

    /**
     * Get totalServiceChargeAmount
     *
     * @return totalServiceChargeAmount
     */
    @jakarta.annotation.Nullable
    public String getTotalServiceChargeAmount() {
        return totalServiceChargeAmount;
    }

    public void setTotalServiceChargeAmount(
            @jakarta.annotation.Nullable String totalServiceChargeAmount) {
        this.totalServiceChargeAmount = totalServiceChargeAmount;
    }

    public DustlogResponseUserAssetDribbletsInner transId(
            @jakarta.annotation.Nullable Long transId) {
        this.transId = transId;
        return this;
    }

    /**
     * Get transId
     *
     * @return transId
     */
    @jakarta.annotation.Nullable
    public Long getTransId() {
        return transId;
    }

    public void setTransId(@jakarta.annotation.Nullable Long transId) {
        this.transId = transId;
    }

    public DustlogResponseUserAssetDribbletsInner userAssetDribbletDetails(
            @jakarta.annotation.Nullable
                    List<@Valid DustlogResponseUserAssetDribbletsInnerUserAssetDribbletDetailsInner>
                            userAssetDribbletDetails) {
        this.userAssetDribbletDetails = userAssetDribbletDetails;
        return this;
    }

    public DustlogResponseUserAssetDribbletsInner addUserAssetDribbletDetailsItem(
            DustlogResponseUserAssetDribbletsInnerUserAssetDribbletDetailsInner
                    userAssetDribbletDetailsItem) {
        if (this.userAssetDribbletDetails == null) {
            this.userAssetDribbletDetails = new ArrayList<>();
        }
        this.userAssetDribbletDetails.add(userAssetDribbletDetailsItem);
        return this;
    }

    /**
     * Get userAssetDribbletDetails
     *
     * @return userAssetDribbletDetails
     */
    @jakarta.annotation.Nullable
    @Valid
    public List<@Valid DustlogResponseUserAssetDribbletsInnerUserAssetDribbletDetailsInner>
            getUserAssetDribbletDetails() {
        return userAssetDribbletDetails;
    }

    public void setUserAssetDribbletDetails(
            @jakarta.annotation.Nullable
                    List<@Valid DustlogResponseUserAssetDribbletsInnerUserAssetDribbletDetailsInner>
                            userAssetDribbletDetails) {
        this.userAssetDribbletDetails = userAssetDribbletDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DustlogResponseUserAssetDribbletsInner dustlogResponseUserAssetDribbletsInner =
                (DustlogResponseUserAssetDribbletsInner) o;
        return Objects.equals(this.operateTime, dustlogResponseUserAssetDribbletsInner.operateTime)
                && Objects.equals(
                        this.totalTransferedAmount,
                        dustlogResponseUserAssetDribbletsInner.totalTransferedAmount)
                && Objects.equals(
                        this.totalServiceChargeAmount,
                        dustlogResponseUserAssetDribbletsInner.totalServiceChargeAmount)
                && Objects.equals(this.transId, dustlogResponseUserAssetDribbletsInner.transId)
                && Objects.equals(
                        this.userAssetDribbletDetails,
                        dustlogResponseUserAssetDribbletsInner.userAssetDribbletDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                operateTime,
                totalTransferedAmount,
                totalServiceChargeAmount,
                transId,
                userAssetDribbletDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DustlogResponseUserAssetDribbletsInner {\n");
        sb.append("		operateTime: ").append(toIndentedString(operateTime)).append("\n");
        sb.append("		totalTransferedAmount: ")
                .append(toIndentedString(totalTransferedAmount))
                .append("\n");
        sb.append("		totalServiceChargeAmount: ")
                .append(toIndentedString(totalServiceChargeAmount))
                .append("\n");
        sb.append("		transId: ").append(toIndentedString(transId)).append("\n");
        sb.append("		userAssetDribbletDetails: ")
                .append(toIndentedString(userAssetDribbletDetails))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object operateTimeValue = getOperateTime();
        String operateTimeValueAsString = "";
        operateTimeValueAsString = operateTimeValue.toString();
        sb.append("operateTime=").append(urlEncode(operateTimeValueAsString)).append("");
        Object totalTransferedAmountValue = getTotalTransferedAmount();
        String totalTransferedAmountValueAsString = "";
        totalTransferedAmountValueAsString = totalTransferedAmountValue.toString();
        sb.append("totalTransferedAmount=")
                .append(urlEncode(totalTransferedAmountValueAsString))
                .append("");
        Object totalServiceChargeAmountValue = getTotalServiceChargeAmount();
        String totalServiceChargeAmountValueAsString = "";
        totalServiceChargeAmountValueAsString = totalServiceChargeAmountValue.toString();
        sb.append("totalServiceChargeAmount=")
                .append(urlEncode(totalServiceChargeAmountValueAsString))
                .append("");
        Object transIdValue = getTransId();
        String transIdValueAsString = "";
        transIdValueAsString = transIdValue.toString();
        sb.append("transId=").append(urlEncode(transIdValueAsString)).append("");
        Object userAssetDribbletDetailsValue = getUserAssetDribbletDetails();
        String userAssetDribbletDetailsValueAsString = "";
        userAssetDribbletDetailsValueAsString =
                (String)
                        ((Collection) userAssetDribbletDetailsValue)
                                .stream().map(Object::toString).collect(Collectors.joining(","));
        sb.append("userAssetDribbletDetails=")
                .append(urlEncode(userAssetDribbletDetailsValueAsString))
                .append("");
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
        openapiFields.add("operateTime");
        openapiFields.add("totalTransferedAmount");
        openapiFields.add("totalServiceChargeAmount");
        openapiFields.add("transId");
        openapiFields.add("userAssetDribbletDetails");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     DustlogResponseUserAssetDribbletsInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DustlogResponseUserAssetDribbletsInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in DustlogResponseUserAssetDribbletsInner"
                                        + " is not found in the empty JSON string",
                                DustlogResponseUserAssetDribbletsInner.openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("totalTransferedAmount") != null
                        && !jsonObj.get("totalTransferedAmount").isJsonNull())
                && !jsonObj.get("totalTransferedAmount").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalTransferedAmount` to be a primitive type in"
                                    + " the JSON string but got `%s`",
                            jsonObj.get("totalTransferedAmount").toString()));
        }
        if ((jsonObj.get("totalServiceChargeAmount") != null
                        && !jsonObj.get("totalServiceChargeAmount").isJsonNull())
                && !jsonObj.get("totalServiceChargeAmount").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `totalServiceChargeAmount` to be a primitive type"
                                    + " in the JSON string but got `%s`",
                            jsonObj.get("totalServiceChargeAmount").toString()));
        }
        if (jsonObj.get("userAssetDribbletDetails") != null
                && !jsonObj.get("userAssetDribbletDetails").isJsonNull()) {
            JsonArray jsonArrayuserAssetDribbletDetails =
                    jsonObj.getAsJsonArray("userAssetDribbletDetails");
            if (jsonArrayuserAssetDribbletDetails != null) {
                // ensure the json data is an array
                if (!jsonObj.get("userAssetDribbletDetails").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `userAssetDribbletDetails` to be an array"
                                            + " in the JSON string but got `%s`",
                                    jsonObj.get("userAssetDribbletDetails").toString()));
                }

                // validate the optional field `userAssetDribbletDetails` (array)
                for (int i = 0; i < jsonArrayuserAssetDribbletDetails.size(); i++) {
                    DustlogResponseUserAssetDribbletsInnerUserAssetDribbletDetailsInner
                            .validateJsonElement(jsonArrayuserAssetDribbletDetails.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DustlogResponseUserAssetDribbletsInner.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'DustlogResponseUserAssetDribbletsInner'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DustlogResponseUserAssetDribbletsInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(DustlogResponseUserAssetDribbletsInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DustlogResponseUserAssetDribbletsInner>() {
                        @Override
                        public void write(
                                JsonWriter out, DustlogResponseUserAssetDribbletsInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DustlogResponseUserAssetDribbletsInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DustlogResponseUserAssetDribbletsInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DustlogResponseUserAssetDribbletsInner
     * @throws IOException if the JSON string is invalid with respect to
     *     DustlogResponseUserAssetDribbletsInner
     */
    public static DustlogResponseUserAssetDribbletsInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, DustlogResponseUserAssetDribbletsInner.class);
    }

    /**
     * Convert an instance of DustlogResponseUserAssetDribbletsInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
