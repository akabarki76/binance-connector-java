/*
 * Binance Dual Investment REST API
 * OpenAPI Specification for the Binance Dual Investment REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.dual_investment.rest.model;

import com.binance.connector.client.dual_investment.rest.JSON;
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

/** SubscribeDualInvestmentProductsRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SubscribeDualInvestmentProductsRequest {
    public static final String SERIALIZED_NAME_ID = "id";

    @SerializedName(SERIALIZED_NAME_ID)
    @jakarta.annotation.Nonnull
    private String id;

    public static final String SERIALIZED_NAME_ORDER_ID = "orderId";

    @SerializedName(SERIALIZED_NAME_ORDER_ID)
    @jakarta.annotation.Nonnull
    private String orderId;

    public static final String SERIALIZED_NAME_DEPOSIT_AMOUNT = "depositAmount";

    @SerializedName(SERIALIZED_NAME_DEPOSIT_AMOUNT)
    @jakarta.annotation.Nonnull
    private Double depositAmount;

    public static final String SERIALIZED_NAME_AUTO_COMPOUND_PLAN = "autoCompoundPlan";

    @SerializedName(SERIALIZED_NAME_AUTO_COMPOUND_PLAN)
    @jakarta.annotation.Nonnull
    private String autoCompoundPlan;

    public static final String SERIALIZED_NAME_RECV_WINDOW = "recvWindow";

    @SerializedName(SERIALIZED_NAME_RECV_WINDOW)
    @jakarta.annotation.Nullable
    private Long recvWindow;

    public SubscribeDualInvestmentProductsRequest() {}

    public SubscribeDualInvestmentProductsRequest id(@jakarta.annotation.Nonnull String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getId() {
        return id;
    }

    public void setId(@jakarta.annotation.Nonnull String id) {
        this.id = id;
    }

    public SubscribeDualInvestmentProductsRequest orderId(
            @jakarta.annotation.Nonnull String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * Get orderId
     *
     * @return orderId
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(@jakarta.annotation.Nonnull String orderId) {
        this.orderId = orderId;
    }

    public SubscribeDualInvestmentProductsRequest depositAmount(
            @jakarta.annotation.Nonnull Double depositAmount) {
        this.depositAmount = depositAmount;
        return this;
    }

    /**
     * Get depositAmount
     *
     * @return depositAmount
     */
    @jakarta.annotation.Nonnull
    @NotNull
    @Valid
    public Double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(@jakarta.annotation.Nonnull Double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public SubscribeDualInvestmentProductsRequest autoCompoundPlan(
            @jakarta.annotation.Nonnull String autoCompoundPlan) {
        this.autoCompoundPlan = autoCompoundPlan;
        return this;
    }

    /**
     * Get autoCompoundPlan
     *
     * @return autoCompoundPlan
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getAutoCompoundPlan() {
        return autoCompoundPlan;
    }

    public void setAutoCompoundPlan(@jakarta.annotation.Nonnull String autoCompoundPlan) {
        this.autoCompoundPlan = autoCompoundPlan;
    }

    public SubscribeDualInvestmentProductsRequest recvWindow(
            @jakarta.annotation.Nullable Long recvWindow) {
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
        SubscribeDualInvestmentProductsRequest subscribeDualInvestmentProductsRequest =
                (SubscribeDualInvestmentProductsRequest) o;
        return Objects.equals(this.id, subscribeDualInvestmentProductsRequest.id)
                && Objects.equals(this.orderId, subscribeDualInvestmentProductsRequest.orderId)
                && Objects.equals(
                        this.depositAmount, subscribeDualInvestmentProductsRequest.depositAmount)
                && Objects.equals(
                        this.autoCompoundPlan,
                        subscribeDualInvestmentProductsRequest.autoCompoundPlan)
                && Objects.equals(
                        this.recvWindow, subscribeDualInvestmentProductsRequest.recvWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orderId, depositAmount, autoCompoundPlan, recvWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscribeDualInvestmentProductsRequest {\n");
        sb.append("		id: ").append(toIndentedString(id)).append("\n");
        sb.append("		orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("		depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
        sb.append("		autoCompoundPlan: ").append(toIndentedString(autoCompoundPlan)).append("\n");
        sb.append("		recvWindow: ").append(toIndentedString(recvWindow)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object idValue = getId();
        String idValueAsString = "";
        idValueAsString = idValue.toString();
        sb.append("id=").append(urlEncode(idValueAsString)).append("");
        Object orderIdValue = getOrderId();
        String orderIdValueAsString = "";
        orderIdValueAsString = orderIdValue.toString();
        sb.append("orderId=").append(urlEncode(orderIdValueAsString)).append("");
        Object depositAmountValue = getDepositAmount();
        String depositAmountValueAsString = "";
        depositAmountValueAsString = depositAmountValue.toString();
        sb.append("depositAmount=").append(urlEncode(depositAmountValueAsString)).append("");
        Object autoCompoundPlanValue = getAutoCompoundPlan();
        String autoCompoundPlanValueAsString = "";
        autoCompoundPlanValueAsString = autoCompoundPlanValue.toString();
        sb.append("autoCompoundPlan=").append(urlEncode(autoCompoundPlanValueAsString)).append("");
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
        openapiFields.add("id");
        openapiFields.add("orderId");
        openapiFields.add("depositAmount");
        openapiFields.add("autoCompoundPlan");
        openapiFields.add("recvWindow");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("id");
        openapiRequiredFields.add("orderId");
        openapiRequiredFields.add("depositAmount");
        openapiRequiredFields.add("autoCompoundPlan");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     SubscribeDualInvestmentProductsRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SubscribeDualInvestmentProductsRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in SubscribeDualInvestmentProductsRequest"
                                        + " is not found in the empty JSON string",
                                SubscribeDualInvestmentProductsRequest.openapiRequiredFields
                                        .toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField : SubscribeDualInvestmentProductsRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("id").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `id` to be a primitive type in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("id").toString()));
        }
        if (!jsonObj.get("orderId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `orderId` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("orderId").toString()));
        }
        if (!jsonObj.get("autoCompoundPlan").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `autoCompoundPlan` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("autoCompoundPlan").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SubscribeDualInvestmentProductsRequest.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'SubscribeDualInvestmentProductsRequest'
                // and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SubscribeDualInvestmentProductsRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(SubscribeDualInvestmentProductsRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SubscribeDualInvestmentProductsRequest>() {
                        @Override
                        public void write(
                                JsonWriter out, SubscribeDualInvestmentProductsRequest value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SubscribeDualInvestmentProductsRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SubscribeDualInvestmentProductsRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SubscribeDualInvestmentProductsRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     SubscribeDualInvestmentProductsRequest
     */
    public static SubscribeDualInvestmentProductsRequest fromJson(String jsonString)
            throws IOException {
        return JSON.getGson().fromJson(jsonString, SubscribeDualInvestmentProductsRequest.class);
    }

    /**
     * Convert an instance of SubscribeDualInvestmentProductsRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
