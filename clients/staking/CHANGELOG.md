# Changelog

## 2.1.0 - 2025-07-08

- Update `binance/common` module to version `1.3.0`.
- Added `customHeaders` configuration.

## 2.0.0 - 2025-07-01

### Added (12)

- `getOnChainYieldsLockedPersonalLeftQuota()` (`GET /sapi/v1/onchain-yields/locked/personalLeftQuota`)
- `getOnChainYieldsLockedProductList()` (`GET /sapi/v1/onchain-yields/locked/list`)
- `getOnChainYieldsLockedProductPosition()` (`GET /sapi/v1/onchain-yields/locked/position`)
- `getOnChainYieldsLockedRedemptionRecord()` (`GET /sapi/v1/onchain-yields/locked/history/redemptionRecord`)
- `getOnChainYieldsLockedRewardsHistory()` (`GET /sapi/v1/onchain-yields/locked/history/rewardsRecord`)
- `getOnChainYieldsLockedSubscriptionPreview()` (`GET /sapi/v1/onchain-yields/locked/subscriptionPreview`)
- `getOnChainYieldsLockedSubscriptionRecord()` (`GET /sapi/v1/onchain-yields/locked/history/subscriptionRecord`)
- `onChainYieldsAccount()` (`GET /sapi/v1/onchain-yields/account`)
- `redeemOnChainYieldsLockedProduct()` (`POST /sapi/v1/onchain-yields/locked/redeem`)
- `setOnChainYieldsLockedAutoSubscribe()` (`POST /sapi/v1/onchain-yields/locked/setAutoSubscribe`)
- `setOnChainYieldsLockedProductRedeemOption()` (`POST /sapi/v1/onchain-yields/locked/setRedeemOption`)
- `subscribeOnChainYieldsLockedProduct()` (`POST /sapi/v1/onchain-yields/locked/subscribe`)

## 1.1.0 - 2025-05-02

- Update `binance/common` module to version `1.1.0`.
- Adding `proxyAuthenticator` support.
- URL Encode query params.

## 1.0.0 - 2025-04-24

- Initial release
