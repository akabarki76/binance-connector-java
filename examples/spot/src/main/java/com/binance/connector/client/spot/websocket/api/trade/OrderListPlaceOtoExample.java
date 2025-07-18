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

package com.binance.connector.client.spot.websocket.api.trade;

import com.binance.connector.client.common.configuration.SignatureConfiguration;
import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.spot.websocket.api.SpotWebSocketApiUtil;
import com.binance.connector.client.spot.websocket.api.api.SpotWebSocketApi;
import com.binance.connector.client.spot.websocket.api.model.OrderListPlaceOtoRequest;
import com.binance.connector.client.spot.websocket.api.model.OrderListPlaceOtoResponse;
import com.binance.connector.client.spot.websocket.api.model.PendingSide;
import com.binance.connector.client.spot.websocket.api.model.PendingType;
import com.binance.connector.client.spot.websocket.api.model.WorkingSide;
import com.binance.connector.client.spot.websocket.api.model.WorkingType;
import java.util.concurrent.CompletableFuture;

/** API examples for TradeApi */
public class OrderListPlaceOtoExample {
    private SpotWebSocketApi api;

    public SpotWebSocketApi getApi() {
        if (api == null) {
            WebSocketClientConfiguration clientConfiguration =
                    SpotWebSocketApiUtil.getClientConfiguration();
            // if you want the connection to be auto logged on:
            // https://developers.binance.com/docs/binance-spot-api-docs/websocket-api/authentication-requests
            clientConfiguration.setAutoLogon(true);
            SignatureConfiguration signatureConfiguration = new SignatureConfiguration();
            signatureConfiguration.setApiKey("apiKey");
            signatureConfiguration.setPrivateKey("/path/to/private.key");
            clientConfiguration.setSignatureConfiguration(signatureConfiguration);
            api = new SpotWebSocketApi(clientConfiguration);
        }
        return api;
    }

    /**
     * WebSocket Place new Order list - OTO
     *
     * <p>Places an OTO. * An OTO (One-Triggers-the-Other) is an order list comprised of 2 orders. *
     * The first order is called the **working order** and must be &#x60;LIMIT&#x60; or
     * &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book. * The
     * second order is called the **pending order**. It can be any order type except for
     * &#x60;MARKET&#x60; orders using parameter &#x60;quoteOrderQty&#x60;. The pending order is
     * only placed on the order book when the working order gets **fully filled**. * If either the
     * working order or the pending order is cancelled individually, the other order in the order
     * list will also be canceled or expired. * When the order list is placed, if the working order
     * gets **immediately fully filled**, the placement response will show the working order as
     * &#x60;FILLED&#x60; but the pending order will still appear as &#x60;PENDING_NEW&#x60;. You
     * need to query the status of the pending order again to see its updated status. * OTOs add **2
     * orders** to the &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60;
     * filter. Weight: 1 Unfilled Order Count: 2
     */
    public void orderListPlaceOtoExampleAsync() {
        OrderListPlaceOtoRequest orderListPlaceOtoRequest = new OrderListPlaceOtoRequest();
        orderListPlaceOtoRequest.symbol("BNBUSDT");
        orderListPlaceOtoRequest.workingType(WorkingType.LIMIT);
        orderListPlaceOtoRequest.workingSide(WorkingSide.BUY);
        orderListPlaceOtoRequest.workingPrice(1.0d);
        orderListPlaceOtoRequest.workingQuantity(1.0d);
        orderListPlaceOtoRequest.pendingType(PendingType.LIMIT);
        orderListPlaceOtoRequest.pendingSide(PendingSide.BUY);
        orderListPlaceOtoRequest.pendingQuantity(1.0d);
        CompletableFuture<OrderListPlaceOtoResponse> future =
                getApi().orderListPlaceOto(orderListPlaceOtoRequest);
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
     * WebSocket Place new Order list - OTO
     *
     * <p>Places an OTO. * An OTO (One-Triggers-the-Other) is an order list comprised of 2 orders. *
     * The first order is called the **working order** and must be &#x60;LIMIT&#x60; or
     * &#x60;LIMIT_MAKER&#x60;. Initially, only the working order goes on the order book. * The
     * second order is called the **pending order**. It can be any order type except for
     * &#x60;MARKET&#x60; orders using parameter &#x60;quoteOrderQty&#x60;. The pending order is
     * only placed on the order book when the working order gets **fully filled**. * If either the
     * working order or the pending order is cancelled individually, the other order in the order
     * list will also be canceled or expired. * When the order list is placed, if the working order
     * gets **immediately fully filled**, the placement response will show the working order as
     * &#x60;FILLED&#x60; but the pending order will still appear as &#x60;PENDING_NEW&#x60;. You
     * need to query the status of the pending order again to see its updated status. * OTOs add **2
     * orders** to the &#x60;EXCHANGE_MAX_NUM_ORDERS&#x60; filter and &#x60;MAX_NUM_ORDERS&#x60;
     * filter. Weight: 1 Unfilled Order Count: 2
     */
    public void orderListPlaceOtoExampleSync() {
        OrderListPlaceOtoRequest orderListPlaceOtoRequest = new OrderListPlaceOtoRequest();
        orderListPlaceOtoRequest.symbol("BNBUSDT");
        orderListPlaceOtoRequest.workingType(WorkingType.LIMIT);
        orderListPlaceOtoRequest.workingSide(WorkingSide.BUY);
        orderListPlaceOtoRequest.workingPrice(1.0d);
        orderListPlaceOtoRequest.workingQuantity(1.0d);
        orderListPlaceOtoRequest.pendingType(PendingType.LIMIT);
        orderListPlaceOtoRequest.pendingSide(PendingSide.BUY);
        orderListPlaceOtoRequest.pendingQuantity(1.0d);
        CompletableFuture<OrderListPlaceOtoResponse> future =
                getApi().orderListPlaceOto(orderListPlaceOtoRequest);
        OrderListPlaceOtoResponse response = future.join();
        System.out.println(response);
    }
}
