/*
 * Binance Spot REST API
 * OpenAPI Specifications for the Binance Spot REST API  API documents:   - [Github rest-api documentation file](https://github.com/binance/binance-spot-api-docs/blob/master/rest-api.md)   - [General API information for rest-api on website](https://developers.binance.com/docs/binance-spot-api-docs/rest-api/general-api-information)
 *
 * The version of the OpenAPI document: 1.0.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.binance.connector.client.staking.rest.onchainyields;

import com.binance.connector.client.common.ApiException;
import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.staking.rest.StakingRestApiUtil;
import com.binance.connector.client.staking.rest.api.StakingRestApi;
import com.binance.connector.client.staking.rest.model.GetOnChainYieldsLockedRedemptionRecordResponse;

/** API examples for OnChainYieldsApi */
public class GetOnChainYieldsLockedRedemptionRecordExample {
    private StakingRestApi api;

    public StakingRestApi getApi() {
        if (api == null) {
            ClientConfiguration clientConfiguration = StakingRestApiUtil.getClientConfiguration();
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new StakingRestApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Get On-chain Yields Locked Redemption Record (USER_DATA)
     *
     * <p>Get On-chain Yields Locked Redemption Record * The time between &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; cannot be longer than 3 months. * If &#x60;startTime&#x60; and
     * &#x60;endTime&#x60; are both not sent, then the last 30 days&#39; data will be returned. * If
     * &#x60;startTime&#x60; is sent but &#x60;endTime&#x60; is not sent, the next 30 days&#39; data
     * beginning from &#x60;startTime&#x60; will be returned. * If &#x60;endTime&#x60; is sent but
     * &#x60;startTime&#x60; is not sent, the 30 days&#39; data before &#x60;endTime&#x60; will be
     * returned. Weight: 50
     *
     * @throws ApiException if the Api call fails
     */
    public void getOnChainYieldsLockedRedemptionRecordExample() throws ApiException {
        String positionId = "1";
        String redeemId = "1";
        String asset = "";
        Long startTime = 1623319461670L;
        Long endTime = 1641782889000L;
        Long current = 1L;
        Long size = 10L;
        Long recvWindow = 5000L;
        ApiResponse<GetOnChainYieldsLockedRedemptionRecordResponse> response =
                getApi().getOnChainYieldsLockedRedemptionRecord(
                                positionId,
                                redeemId,
                                asset,
                                startTime,
                                endTime,
                                current,
                                size,
                                recvWindow);
        System.out.println(response.getData());
    }
}
