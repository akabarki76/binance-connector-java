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
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Objects;
import org.hibernate.validator.constraints.*;

/** SubscribeOnChainYieldsLockedProductRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class SubscribeOnChainYieldsLockedProductRequest {
    public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";

    @SerializedName(SERIALIZED_NAME_PROJECT_ID)
    @jakarta.annotation.Nonnull
    private String projectId;

    public static final String SERIALIZED_NAME_AMOUNT = "amount";

    @SerializedName(SERIALIZED_NAME_AMOUNT)
    @jakarta.annotation.Nonnull
    private Double amount;

    public static final String SERIALIZED_NAME_AUTO_SUBSCRIBE = "autoSubscribe";

    @SerializedName(SERIALIZED_NAME_AUTO_SUBSCRIBE)
    @jakarta.annotation.Nullable
    private Boolean autoSubscribe;

    public static final String SERIALIZED_NAME_SOURCE_ACCOUNT = "sourceAccount";

    @SerializedName(SERIALIZED_NAME_SOURCE_ACCOUNT)
    @jakarta.annotation.Nullable
    private String sourceAccount;

    public static final String SERIALIZED_NAME_REDEEM_TO = "redeemTo";

    @SerializedName(SERIALIZED_NAME_REDEEM_TO)
    @jakarta.annotation.Nullable
    private String redeemTo;

    public static final String SERIALIZED_NAME_CHANNEL_ID = "channelId";

    @SerializedName(SERIALIZED_NAME_CHANNEL_ID)
    @jakarta.annotation.Nullable
    private String channelId;

    public static final String SERIALIZED_NAME_CLIENT_ID = "clientId";

    @SerializedName(SERIALIZED_NAME_CLIENT_ID)
    @jakarta.annotation.Nullable
    private String clientId;

    public static final String SERIALIZED_NAME_RECV_WINDOW = "recvWindow";

    @SerializedName(SERIALIZED_NAME_RECV_WINDOW)
    @jakarta.annotation.Nullable
    private Long recvWindow;

    public SubscribeOnChainYieldsLockedProductRequest() {}

    public SubscribeOnChainYieldsLockedProductRequest projectId(
            @jakarta.annotation.Nonnull String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * Get projectId
     *
     * @return projectId
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(@jakarta.annotation.Nonnull String projectId) {
        this.projectId = projectId;
    }

    public SubscribeOnChainYieldsLockedProductRequest amount(
            @jakarta.annotation.Nonnull Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * Get amount
     *
     * @return amount
     */
    @jakarta.annotation.Nonnull
    @NotNull
    @Valid
    public Double getAmount() {
        return amount;
    }

    public void setAmount(@jakarta.annotation.Nonnull Double amount) {
        this.amount = amount;
    }

    public SubscribeOnChainYieldsLockedProductRequest autoSubscribe(
            @jakarta.annotation.Nullable Boolean autoSubscribe) {
        this.autoSubscribe = autoSubscribe;
        return this;
    }

    /**
     * Get autoSubscribe
     *
     * @return autoSubscribe
     */
    @jakarta.annotation.Nullable
    public Boolean getAutoSubscribe() {
        return autoSubscribe;
    }

    public void setAutoSubscribe(@jakarta.annotation.Nullable Boolean autoSubscribe) {
        this.autoSubscribe = autoSubscribe;
    }

    public SubscribeOnChainYieldsLockedProductRequest sourceAccount(
            @jakarta.annotation.Nullable String sourceAccount) {
        this.sourceAccount = sourceAccount;
        return this;
    }

    /**
     * Get sourceAccount
     *
     * @return sourceAccount
     */
    @jakarta.annotation.Nullable
    public String getSourceAccount() {
        return sourceAccount;
    }

    public void setSourceAccount(@jakarta.annotation.Nullable String sourceAccount) {
        this.sourceAccount = sourceAccount;
    }

    public SubscribeOnChainYieldsLockedProductRequest redeemTo(
            @jakarta.annotation.Nullable String redeemTo) {
        this.redeemTo = redeemTo;
        return this;
    }

    /**
     * Get redeemTo
     *
     * @return redeemTo
     */
    @jakarta.annotation.Nullable
    public String getRedeemTo() {
        return redeemTo;
    }

    public void setRedeemTo(@jakarta.annotation.Nullable String redeemTo) {
        this.redeemTo = redeemTo;
    }

    public SubscribeOnChainYieldsLockedProductRequest channelId(
            @jakarta.annotation.Nullable String channelId) {
        this.channelId = channelId;
        return this;
    }

    /**
     * Get channelId
     *
     * @return channelId
     */
    @jakarta.annotation.Nullable
    public String getChannelId() {
        return channelId;
    }

    public void setChannelId(@jakarta.annotation.Nullable String channelId) {
        this.channelId = channelId;
    }

    public SubscribeOnChainYieldsLockedProductRequest clientId(
            @jakarta.annotation.Nullable String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * Get clientId
     *
     * @return clientId
     */
    @jakarta.annotation.Nullable
    public String getClientId() {
        return clientId;
    }

    public void setClientId(@jakarta.annotation.Nullable String clientId) {
        this.clientId = clientId;
    }

    public SubscribeOnChainYieldsLockedProductRequest recvWindow(
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
        SubscribeOnChainYieldsLockedProductRequest subscribeOnChainYieldsLockedProductRequest =
                (SubscribeOnChainYieldsLockedProductRequest) o;
        return Objects.equals(this.projectId, subscribeOnChainYieldsLockedProductRequest.projectId)
                && Objects.equals(this.amount, subscribeOnChainYieldsLockedProductRequest.amount)
                && Objects.equals(
                        this.autoSubscribe,
                        subscribeOnChainYieldsLockedProductRequest.autoSubscribe)
                && Objects.equals(
                        this.sourceAccount,
                        subscribeOnChainYieldsLockedProductRequest.sourceAccount)
                && Objects.equals(
                        this.redeemTo, subscribeOnChainYieldsLockedProductRequest.redeemTo)
                && Objects.equals(
                        this.channelId, subscribeOnChainYieldsLockedProductRequest.channelId)
                && Objects.equals(
                        this.clientId, subscribeOnChainYieldsLockedProductRequest.clientId)
                && Objects.equals(
                        this.recvWindow, subscribeOnChainYieldsLockedProductRequest.recvWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                projectId,
                amount,
                autoSubscribe,
                sourceAccount,
                redeemTo,
                channelId,
                clientId,
                recvWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscribeOnChainYieldsLockedProductRequest {\n");
        sb.append("		projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("		amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("		autoSubscribe: ").append(toIndentedString(autoSubscribe)).append("\n");
        sb.append("		sourceAccount: ").append(toIndentedString(sourceAccount)).append("\n");
        sb.append("		redeemTo: ").append(toIndentedString(redeemTo)).append("\n");
        sb.append("		channelId: ").append(toIndentedString(channelId)).append("\n");
        sb.append("		clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("		recvWindow: ").append(toIndentedString(recvWindow)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object projectIdValue = getProjectId();
        String projectIdValueAsString = "";
        projectIdValueAsString = projectIdValue.toString();
        sb.append("projectId=").append(urlEncode(projectIdValueAsString)).append("");
        Object amountValue = getAmount();
        String amountValueAsString = "";
        amountValueAsString = amountValue.toString();
        sb.append("amount=").append(urlEncode(amountValueAsString)).append("");
        Object autoSubscribeValue = getAutoSubscribe();
        String autoSubscribeValueAsString = "";
        autoSubscribeValueAsString = autoSubscribeValue.toString();
        sb.append("autoSubscribe=").append(urlEncode(autoSubscribeValueAsString)).append("");
        Object sourceAccountValue = getSourceAccount();
        String sourceAccountValueAsString = "";
        sourceAccountValueAsString = sourceAccountValue.toString();
        sb.append("sourceAccount=").append(urlEncode(sourceAccountValueAsString)).append("");
        Object redeemToValue = getRedeemTo();
        String redeemToValueAsString = "";
        redeemToValueAsString = redeemToValue.toString();
        sb.append("redeemTo=").append(urlEncode(redeemToValueAsString)).append("");
        Object channelIdValue = getChannelId();
        String channelIdValueAsString = "";
        channelIdValueAsString = channelIdValue.toString();
        sb.append("channelId=").append(urlEncode(channelIdValueAsString)).append("");
        Object clientIdValue = getClientId();
        String clientIdValueAsString = "";
        clientIdValueAsString = clientIdValue.toString();
        sb.append("clientId=").append(urlEncode(clientIdValueAsString)).append("");
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
        openapiFields.add("projectId");
        openapiFields.add("amount");
        openapiFields.add("autoSubscribe");
        openapiFields.add("sourceAccount");
        openapiFields.add("redeemTo");
        openapiFields.add("channelId");
        openapiFields.add("clientId");
        openapiFields.add("recvWindow");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("projectId");
        openapiRequiredFields.add("amount");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     SubscribeOnChainYieldsLockedProductRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!SubscribeOnChainYieldsLockedProductRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " SubscribeOnChainYieldsLockedProductRequest is not found in"
                                    + " the empty JSON string",
                                SubscribeOnChainYieldsLockedProductRequest.openapiRequiredFields
                                        .toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField :
                SubscribeOnChainYieldsLockedProductRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("projectId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `projectId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("projectId").toString()));
        }
        if ((jsonObj.get("sourceAccount") != null && !jsonObj.get("sourceAccount").isJsonNull())
                && !jsonObj.get("sourceAccount").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `sourceAccount` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("sourceAccount").toString()));
        }
        if ((jsonObj.get("redeemTo") != null && !jsonObj.get("redeemTo").isJsonNull())
                && !jsonObj.get("redeemTo").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `redeemTo` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("redeemTo").toString()));
        }
        if ((jsonObj.get("channelId") != null && !jsonObj.get("channelId").isJsonNull())
                && !jsonObj.get("channelId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `channelId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("channelId").toString()));
        }
        if ((jsonObj.get("clientId") != null && !jsonObj.get("clientId").isJsonNull())
                && !jsonObj.get("clientId").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `clientId` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("clientId").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!SubscribeOnChainYieldsLockedProductRequest.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'SubscribeOnChainYieldsLockedProductRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<SubscribeOnChainYieldsLockedProductRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(SubscribeOnChainYieldsLockedProductRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<SubscribeOnChainYieldsLockedProductRequest>() {
                        @Override
                        public void write(
                                JsonWriter out, SubscribeOnChainYieldsLockedProductRequest value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public SubscribeOnChainYieldsLockedProductRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of SubscribeOnChainYieldsLockedProductRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of SubscribeOnChainYieldsLockedProductRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     SubscribeOnChainYieldsLockedProductRequest
     */
    public static SubscribeOnChainYieldsLockedProductRequest fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, SubscribeOnChainYieldsLockedProductRequest.class);
    }

    /**
     * Convert an instance of SubscribeOnChainYieldsLockedProductRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
