/*
 * Binance Sub Account REST API
 * OpenAPI Specification for the Binance Sub Account REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.sub_account.rest.model;

import com.binance.connector.client.sub_account.rest.JSON;
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

/** AddIpRestrictionForSubAccountApiKeyRequest */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class AddIpRestrictionForSubAccountApiKeyRequest {
    public static final String SERIALIZED_NAME_EMAIL = "email";

    @SerializedName(SERIALIZED_NAME_EMAIL)
    @jakarta.annotation.Nonnull
    private String email;

    public static final String SERIALIZED_NAME_SUB_ACCOUNT_API_KEY = "subAccountApiKey";

    @SerializedName(SERIALIZED_NAME_SUB_ACCOUNT_API_KEY)
    @jakarta.annotation.Nonnull
    private String subAccountApiKey;

    public static final String SERIALIZED_NAME_STATUS = "status";

    @SerializedName(SERIALIZED_NAME_STATUS)
    @jakarta.annotation.Nonnull
    private Long status;

    public static final String SERIALIZED_NAME_IP_ADDRESS = "ipAddress";

    @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
    @jakarta.annotation.Nullable
    private String ipAddress;

    public static final String SERIALIZED_NAME_RECV_WINDOW = "recvWindow";

    @SerializedName(SERIALIZED_NAME_RECV_WINDOW)
    @jakarta.annotation.Nullable
    private Long recvWindow;

    public AddIpRestrictionForSubAccountApiKeyRequest() {}

    public AddIpRestrictionForSubAccountApiKeyRequest email(
            @jakarta.annotation.Nonnull String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     *
     * @return email
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@jakarta.annotation.Nonnull String email) {
        this.email = email;
    }

    public AddIpRestrictionForSubAccountApiKeyRequest subAccountApiKey(
            @jakarta.annotation.Nonnull String subAccountApiKey) {
        this.subAccountApiKey = subAccountApiKey;
        return this;
    }

    /**
     * Get subAccountApiKey
     *
     * @return subAccountApiKey
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public String getSubAccountApiKey() {
        return subAccountApiKey;
    }

    public void setSubAccountApiKey(@jakarta.annotation.Nonnull String subAccountApiKey) {
        this.subAccountApiKey = subAccountApiKey;
    }

    public AddIpRestrictionForSubAccountApiKeyRequest status(
            @jakarta.annotation.Nonnull Long status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @jakarta.annotation.Nonnull
    @NotNull
    public Long getStatus() {
        return status;
    }

    public void setStatus(@jakarta.annotation.Nonnull Long status) {
        this.status = status;
    }

    public AddIpRestrictionForSubAccountApiKeyRequest ipAddress(
            @jakarta.annotation.Nullable String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * Get ipAddress
     *
     * @return ipAddress
     */
    @jakarta.annotation.Nullable
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(@jakarta.annotation.Nullable String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public AddIpRestrictionForSubAccountApiKeyRequest recvWindow(
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
        AddIpRestrictionForSubAccountApiKeyRequest addIpRestrictionForSubAccountApiKeyRequest =
                (AddIpRestrictionForSubAccountApiKeyRequest) o;
        return Objects.equals(this.email, addIpRestrictionForSubAccountApiKeyRequest.email)
                && Objects.equals(
                        this.subAccountApiKey,
                        addIpRestrictionForSubAccountApiKeyRequest.subAccountApiKey)
                && Objects.equals(this.status, addIpRestrictionForSubAccountApiKeyRequest.status)
                && Objects.equals(
                        this.ipAddress, addIpRestrictionForSubAccountApiKeyRequest.ipAddress)
                && Objects.equals(
                        this.recvWindow, addIpRestrictionForSubAccountApiKeyRequest.recvWindow);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, subAccountApiKey, status, ipAddress, recvWindow);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddIpRestrictionForSubAccountApiKeyRequest {\n");
        sb.append("		email: ").append(toIndentedString(email)).append("\n");
        sb.append("		subAccountApiKey: ").append(toIndentedString(subAccountApiKey)).append("\n");
        sb.append("		status: ").append(toIndentedString(status)).append("\n");
        sb.append("		ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("		recvWindow: ").append(toIndentedString(recvWindow)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object emailValue = getEmail();
        String emailValueAsString = "";
        emailValueAsString = emailValue.toString();
        sb.append("email=").append(urlEncode(emailValueAsString)).append("");
        Object subAccountApiKeyValue = getSubAccountApiKey();
        String subAccountApiKeyValueAsString = "";
        subAccountApiKeyValueAsString = subAccountApiKeyValue.toString();
        sb.append("subAccountApiKey=").append(urlEncode(subAccountApiKeyValueAsString)).append("");
        Object statusValue = getStatus();
        String statusValueAsString = "";
        statusValueAsString = statusValue.toString();
        sb.append("status=").append(urlEncode(statusValueAsString)).append("");
        Object ipAddressValue = getIpAddress();
        String ipAddressValueAsString = "";
        ipAddressValueAsString = ipAddressValue.toString();
        sb.append("ipAddress=").append(urlEncode(ipAddressValueAsString)).append("");
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
        openapiFields.add("email");
        openapiFields.add("subAccountApiKey");
        openapiFields.add("status");
        openapiFields.add("ipAddress");
        openapiFields.add("recvWindow");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
        openapiRequiredFields.add("email");
        openapiRequiredFields.add("subAccountApiKey");
        openapiRequiredFields.add("status");
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     AddIpRestrictionForSubAccountApiKeyRequest
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!AddIpRestrictionForSubAccountApiKeyRequest.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " AddIpRestrictionForSubAccountApiKeyRequest is not found in"
                                    + " the empty JSON string",
                                AddIpRestrictionForSubAccountApiKeyRequest.openapiRequiredFields
                                        .toString()));
            }
        }

        // check to make sure all required properties/fields are present in the JSON string
        for (String requiredField :
                AddIpRestrictionForSubAccountApiKeyRequest.openapiRequiredFields) {
            if (jsonElement.getAsJsonObject().get(requiredField) == null) {
                throw new IllegalArgumentException(
                        String.format(
                                "The required field `%s` is not found in the JSON string: %s",
                                requiredField, jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (!jsonObj.get("email").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `email` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("email").toString()));
        }
        if (!jsonObj.get("subAccountApiKey").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `subAccountApiKey` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("subAccountApiKey").toString()));
        }
        if ((jsonObj.get("ipAddress") != null && !jsonObj.get("ipAddress").isJsonNull())
                && !jsonObj.get("ipAddress").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `ipAddress` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("ipAddress").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AddIpRestrictionForSubAccountApiKeyRequest.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'AddIpRestrictionForSubAccountApiKeyRequest' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AddIpRestrictionForSubAccountApiKeyRequest> thisAdapter =
                    gson.getDelegateAdapter(
                            this, TypeToken.get(AddIpRestrictionForSubAccountApiKeyRequest.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<AddIpRestrictionForSubAccountApiKeyRequest>() {
                        @Override
                        public void write(
                                JsonWriter out, AddIpRestrictionForSubAccountApiKeyRequest value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public AddIpRestrictionForSubAccountApiKeyRequest read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of AddIpRestrictionForSubAccountApiKeyRequest given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of AddIpRestrictionForSubAccountApiKeyRequest
     * @throws IOException if the JSON string is invalid with respect to
     *     AddIpRestrictionForSubAccountApiKeyRequest
     */
    public static AddIpRestrictionForSubAccountApiKeyRequest fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, AddIpRestrictionForSubAccountApiKeyRequest.class);
    }

    /**
     * Convert an instance of AddIpRestrictionForSubAccountApiKeyRequest to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
