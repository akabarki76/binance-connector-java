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
import com.binance.connector.client.staking.rest.model.RedeemOnChainYieldsLockedProductRequest;
import com.binance.connector.client.staking.rest.model.RedeemOnChainYieldsLockedProductResponse;

/** API examples for OnChainYieldsApi */
public class RedeemOnChainYieldsLockedProductExample {
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
     * Redeem On-chain Yields Locked Product (TRADE)
     *
     * <p>Redeem On-chain Yields Locked Product * You need to open &#x60;Enable Spot &amp; Margin
     * Trading&#x60; permission for the API Key which requests this endpoint. Weight: 1/3s per
     * account
     *
     * @throws ApiException if the Api call fails
     */
    public void redeemOnChainYieldsLockedProductExample() throws ApiException {
        RedeemOnChainYieldsLockedProductRequest redeemOnChainYieldsLockedProductRequest =
                new RedeemOnChainYieldsLockedProductRequest();
        redeemOnChainYieldsLockedProductRequest.positionId("1");
        ApiResponse<RedeemOnChainYieldsLockedProductResponse> response =
                getApi().redeemOnChainYieldsLockedProduct(redeemOnChainYieldsLockedProductRequest);
        System.out.println(response.getData());
    }
}
