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

package com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.marketdata;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.DerivativesTradingUsdsFuturesWebSocketApiUtil;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.api.DerivativesTradingUsdsFuturesWebSocketApi;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.SymbolOrderBookTickerRequest;
import com.binance.connector.client.derivatives_trading_usds_futures.websocket.api.model.SymbolOrderBookTickerResponse;
import java.util.concurrent.CompletableFuture;

/** API examples for MarketDataApi */
public class SymbolOrderBookTickerExample {
    private DerivativesTradingUsdsFuturesWebSocketApi api;

    public DerivativesTradingUsdsFuturesWebSocketApi getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    DerivativesTradingUsdsFuturesWebSocketApiUtil.getClientConfiguration();
            // if you want the connection to be auto logged on:
            // https://developers.binance.com/docs/binance-spot-api-docs/websocket-api/authentication-requests
            clientConfiguration.setAutoLogon(true);
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("/path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new DerivativesTradingUsdsFuturesWebSocketApi(clientConfiguration);
        }
        return api;
    }

    /**
     * Symbol Order Book Ticker
     *
     * <p>Best price/qty on the order book for a symbol or symbols. * If the symbol is not sent,
     * bookTickers for all symbols will be returned in an array. * The field
     * &#x60;X-MBX-USED-WEIGHT-1M&#x60; in response header is not accurate from this endpoint,
     * please ignore. Weight: 2 for a single symbol; 5 when the symbol parameter is omitted
     */
    public void symbolOrderBookTickerExampleAsync() {
        SymbolOrderBookTickerRequest symbolOrderBookTickerRequest =
                new SymbolOrderBookTickerRequest();
        CompletableFuture<SymbolOrderBookTickerResponse> future =
                getApi().symbolOrderBookTicker(symbolOrderBookTickerRequest);
        future.handle(
                (response, error) -> {
                    if (error != null) {
                        System.err.println(error);
                    }
                    System.out.println(response);
                    return response;
                });
    }

    /**
     * Symbol Order Book Ticker
     *
     * <p>Best price/qty on the order book for a symbol or symbols. * If the symbol is not sent,
     * bookTickers for all symbols will be returned in an array. * The field
     * &#x60;X-MBX-USED-WEIGHT-1M&#x60; in response header is not accurate from this endpoint,
     * please ignore. Weight: 2 for a single symbol; 5 when the symbol parameter is omitted
     */
    public void symbolOrderBookTickerExampleSync() {
        SymbolOrderBookTickerRequest symbolOrderBookTickerRequest =
                new SymbolOrderBookTickerRequest();
        CompletableFuture<SymbolOrderBookTickerResponse> future =
                getApi().symbolOrderBookTicker(symbolOrderBookTickerRequest);
        SymbolOrderBookTickerResponse response = future.join();
        System.out.println(response);
    }
}
