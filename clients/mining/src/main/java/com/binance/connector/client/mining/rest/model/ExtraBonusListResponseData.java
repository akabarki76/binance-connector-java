/*
 * Binance Mining REST API
 * OpenAPI Specification for the Binance Mining REST API
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.mining.rest.model;

import com.binance.connector.client.mining.rest.JSON;
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

/** ExtraBonusListResponseData */
@jakarta.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        comments = "Generator version: 7.12.0")
public class ExtraBonusListResponseData {
    public static final String SERIALIZED_NAME_OTHER_PROFITS = "otherProfits";

    @SerializedName(SERIALIZED_NAME_OTHER_PROFITS)
    @jakarta.annotation.Nullable
    private List<@Valid ExtraBonusListResponseDataOtherProfitsInner> otherProfits;

    public static final String SERIALIZED_NAME_TOTAL_NUM = "totalNum";

    @SerializedName(SERIALIZED_NAME_TOTAL_NUM)
    @jakarta.annotation.Nullable
    private Long totalNum;

    public static final String SERIALIZED_NAME_PAGE_SIZE = "pageSize";

    @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
    @jakarta.annotation.Nullable
    private Long pageSize;

    public ExtraBonusListResponseData() {}

    public ExtraBonusListResponseData otherProfits(
            @jakarta.annotation.Nullable
                    List<@Valid ExtraBonusListResponseDataOtherProfitsInner> otherProfits) {
        this.otherProfits = otherProfits;
        return this;
    }

    public ExtraBonusListResponseData addOtherProfitsItem(
            ExtraBonusListResponseDataOtherProfitsInner otherProfitsItem) {
        if (this.otherProfits == null) {
            this.otherProfits = new ArrayList<>();
        }
        this.otherProfits.add(otherProfitsItem);
        return this;
    }

    /**
     * Get otherProfits
     *
     * @return otherProfits
     */
    @jakarta.annotation.Nullable
    @Valid
    public List<@Valid ExtraBonusListResponseDataOtherProfitsInner> getOtherProfits() {
        return otherProfits;
    }

    public void setOtherProfits(
            @jakarta.annotation.Nullable
                    List<@Valid ExtraBonusListResponseDataOtherProfitsInner> otherProfits) {
        this.otherProfits = otherProfits;
    }

    public ExtraBonusListResponseData totalNum(@jakarta.annotation.Nullable Long totalNum) {
        this.totalNum = totalNum;
        return this;
    }

    /**
     * Get totalNum
     *
     * @return totalNum
     */
    @jakarta.annotation.Nullable
    public Long getTotalNum() {
        return totalNum;
    }

    public void setTotalNum(@jakarta.annotation.Nullable Long totalNum) {
        this.totalNum = totalNum;
    }

    public ExtraBonusListResponseData pageSize(@jakarta.annotation.Nullable Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * Get pageSize
     *
     * @return pageSize
     */
    @jakarta.annotation.Nullable
    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(@jakarta.annotation.Nullable Long pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExtraBonusListResponseData extraBonusListResponseData = (ExtraBonusListResponseData) o;
        return Objects.equals(this.otherProfits, extraBonusListResponseData.otherProfits)
                && Objects.equals(this.totalNum, extraBonusListResponseData.totalNum)
                && Objects.equals(this.pageSize, extraBonusListResponseData.pageSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(otherProfits, totalNum, pageSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtraBonusListResponseData {\n");
        sb.append("		otherProfits: ").append(toIndentedString(otherProfits)).append("\n");
        sb.append("		totalNum: ").append(toIndentedString(totalNum)).append("\n");
        sb.append("		pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    public String toUrlQueryString() {
        StringBuilder sb = new StringBuilder();

        Object otherProfitsValue = getOtherProfits();
        String otherProfitsValueAsString = "";
        otherProfitsValueAsString =
                (String)
                        ((Collection) otherProfitsValue)
                                .stream().map(Object::toString).collect(Collectors.joining(","));
        sb.append("otherProfits=").append(urlEncode(otherProfitsValueAsString)).append("");
        Object totalNumValue = getTotalNum();
        String totalNumValueAsString = "";
        totalNumValueAsString = totalNumValue.toString();
        sb.append("totalNum=").append(urlEncode(totalNumValueAsString)).append("");
        Object pageSizeValue = getPageSize();
        String pageSizeValueAsString = "";
        pageSizeValueAsString = pageSizeValue.toString();
        sb.append("pageSize=").append(urlEncode(pageSizeValueAsString)).append("");
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
        openapiFields.add("otherProfits");
        openapiFields.add("totalNum");
        openapiFields.add("pageSize");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ExtraBonusListResponseData
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ExtraBonusListResponseData.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ExtraBonusListResponseData is not"
                                        + " found in the empty JSON string",
                                ExtraBonusListResponseData.openapiRequiredFields.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if (jsonObj.get("otherProfits") != null && !jsonObj.get("otherProfits").isJsonNull()) {
            JsonArray jsonArrayotherProfits = jsonObj.getAsJsonArray("otherProfits");
            if (jsonArrayotherProfits != null) {
                // ensure the json data is an array
                if (!jsonObj.get("otherProfits").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `otherProfits` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("otherProfits").toString()));
                }

                // validate the optional field `otherProfits` (array)
                for (int i = 0; i < jsonArrayotherProfits.size(); i++) {
                    ExtraBonusListResponseDataOtherProfitsInner.validateJsonElement(
                            jsonArrayotherProfits.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ExtraBonusListResponseData.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ExtraBonusListResponseData' and its
                // subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ExtraBonusListResponseData> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ExtraBonusListResponseData.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ExtraBonusListResponseData>() {
                        @Override
                        public void write(JsonWriter out, ExtraBonusListResponseData value)
                                throws IOException {
                            JsonElement obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ExtraBonusListResponseData read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            // validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ExtraBonusListResponseData given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ExtraBonusListResponseData
     * @throws IOException if the JSON string is invalid with respect to ExtraBonusListResponseData
     */
    public static ExtraBonusListResponseData fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ExtraBonusListResponseData.class);
    }

    /**
     * Convert an instance of ExtraBonusListResponseData to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}
