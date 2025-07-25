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
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Objects;
import org.hibernate.validator.constraints.*;

/** DailyAccountSnapshotResponseSnapshotVosInner */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class DailyAccountSnapshotResponseSnapshotVosInner {
    public static final String SERIALIZED_NAME_DATA = "data";

    @SerializedName(SERIALIZED_NAME_DATA)
    @jakarta.annotation.Nullable
    private DailyAccountSnapshotResponseSnapshotVosInnerData data;

    public static final String SERIALIZED_NAME_TYPE = "type";

    @SerializedName(SERIALIZED_NAME_TYPE)
    @jakarta.annotation.Nullable
    private String type;

    public static final String SERIALIZED_NAME_UPDATE_TIME = "updateTime";

    @SerializedName(SERIALIZED_NAME_UPDATE_TIME)
    @jakarta.annotation.Nullable
    private Long updateTime;

    public DailyAccountSnapshotResponseSnapshotVosInner() {}

    public DailyAccountSnapshotResponseSnapshotVosInner data(
            @jakarta.annotation.Nullable DailyAccountSnapshotResponseSnapshotVosInnerData data) {
        this.data = data;
        return this;
    }

    /**
     * Get data
     *
     * @return data
     */
    @jakarta.annotation.Nullable
    @Valid
    public DailyAccountSnapshotResponseSnapshotVosInnerData getData() {
        return data;
    }

    public void setData(
            @jakarta.annotation.Nullable DailyAccountSnapshotResponseSnapshotVosInnerData data) {
        this.data = data;
    }

    public DailyAccountSnapshotResponseSnapshotVosInner type(
            @jakarta.annotation.Nullable String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     *
     * @return type
     */
    @jakarta.annotation.Nullable
    public String getType() {
        return type;
    }

    public void setType(@jakarta.annotation.Nullable String type) {
        this.type = type;
    }

    public DailyAccountSnapshotResponseSnapshotVosInner updateTime(
            @jakarta.annotation.Nullable Long updateTime) {
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
        DailyAccountSnapshotResponseSnapshotVosInner dailyAccountSnapshotResponseSnapshotVosInner =
                (DailyAccountSnapshotResponseSnapshotVosInner) o;
        return Objects.equals(this.data, dailyAccountSnapshotResponseSnapshotVosInner.data)
                && Objects.equals(this.type, dailyAccountSnapshotResponseSnapshotVosInner.type)
                && Objects.equals(
                        this.updateTime, dailyAccountSnapshotResponseSnapshotVosInner.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, type, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DailyAccountSnapshotResponseSnapshotVosInner {\n");
        sb.append("		data: ").append(toIndentedString(data)).append("\n");
        sb.append("		type: ").append(toIndentedString(type)).append("\n");
        sb.append("		updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object dataValue = getData();
        String dataValueAsString = "";
        dataValueAsString = dataValue.toString();
        sb.append("data=").append(urlEncode(dataValueAsString)).append("");
        Object typeValue = getType();
        String typeValueAsString = "";
        typeValueAsString = typeValue.toString();
        sb.append("type=").append(urlEncode(typeValueAsString)).append("");
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
        openapiFields.add("data");
        openapiFields.add("type");
        openapiFields.add("updateTime");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to
     *     DailyAccountSnapshotResponseSnapshotVosInner
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!DailyAccountSnapshotResponseSnapshotVosInner.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in"
                                    + " DailyAccountSnapshotResponseSnapshotVosInner is not found"
                                    + " in the empty JSON string",
                                DailyAccountSnapshotResponseSnapshotVosInner.openapiRequiredFields
                                        .toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // validate the optional field `data`
        if (jsonObj.get("data") != null && !jsonObj.get("data").isJsonNull()) {
            DailyAccountSnapshotResponseSnapshotVosInnerData.validateJsonElement(
                    jsonObj.get("data"));
        }
        if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull())
                && !jsonObj.get("type").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `type` to be a primitive type in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("type").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!DailyAccountSnapshotResponseSnapshotVosInner.class.isAssignableFrom(
                    type.getRawType())) {
                return null; // this class only serializes
                // 'DailyAccountSnapshotResponseSnapshotVosInner' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<DailyAccountSnapshotResponseSnapshotVosInner> thisAdapter =
                    gson.getDelegateAdapter(
                            this,
                            TypeToken.get(DailyAccountSnapshotResponseSnapshotVosInner.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<DailyAccountSnapshotResponseSnapshotVosInner>() {
                        @Override
                        public void write(
                                JsonWriter out, DailyAccountSnapshotResponseSnapshotVosInner value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public DailyAccountSnapshotResponseSnapshotVosInner read(JsonReader in)
                                throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of DailyAccountSnapshotResponseSnapshotVosInner given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of DailyAccountSnapshotResponseSnapshotVosInner
     * @throws IOException if the JSON string is invalid with respect to
     *     DailyAccountSnapshotResponseSnapshotVosInner
     */
    public static DailyAccountSnapshotResponseSnapshotVosInner fromJson(String jsonString)
            throws IOException {
        return JSON.getGson()
                .fromJson(jsonString, DailyAccountSnapshotResponseSnapshotVosInner.class);
    }

    /**
     * Convert an instance of DailyAccountSnapshotResponseSnapshotVosInner to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
