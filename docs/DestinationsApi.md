# DestinationsApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDestination**](DestinationsApi.md#createDestination) | **POST** /destinations | Create Destination |
| [**createDestinationSubscription**](DestinationsApi.md#createDestinationSubscription) | **POST** /destinations/{destinationId}/subscriptions | Create Destination Subscription |
| [**deleteDestination**](DestinationsApi.md#deleteDestination) | **DELETE** /destinations/{destinationId} | Delete Destination |
| [**getDestination**](DestinationsApi.md#getDestination) | **GET** /destinations/{destinationId} | Get Destination |
| [**getSubscriptionFromDestination**](DestinationsApi.md#getSubscriptionFromDestination) | **GET** /destinations/{destinationId}/subscriptions/{id} | Get Subscription from Destination |
| [**listDeliveryMetricsSummaryFromDestination**](DestinationsApi.md#listDeliveryMetricsSummaryFromDestination) | **GET** /destinations/{destinationId}/delivery-metrics | List Delivery Metrics Summary from Destination |
| [**listDestinations**](DestinationsApi.md#listDestinations) | **GET** /destinations | List Destinations |
| [**listSubscriptionsFromDestination**](DestinationsApi.md#listSubscriptionsFromDestination) | **GET** /destinations/{destinationId}/subscriptions | List Subscriptions from Destination |
| [**removeSubscriptionFromDestination**](DestinationsApi.md#removeSubscriptionFromDestination) | **DELETE** /destinations/{destinationId}/subscriptions/{id} | Remove Subscription from Destination |
| [**updateDestination**](DestinationsApi.md#updateDestination) | **PATCH** /destinations/{destinationId} | Update Destination |
| [**updateSubscriptionForDestination**](DestinationsApi.md#updateSubscriptionForDestination) | **PATCH** /destinations/{destinationId}/subscriptions/{id} | Update Subscription for Destination |



## Operation: createDestination

> CreateDestination200Response createDestination(createDestinationV1Input)

Create Destination

Creates a new Destination.    • When called, this endpoint may generate the &#x60;Integration Created&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DestinationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DestinationsApi apiInstance = new DestinationsApi(defaultClient);
        CreateDestinationV1Input createDestinationV1Input = new CreateDestinationV1Input(); // CreateDestinationV1Input | 
        try {
            CreateDestination200Response result = apiInstance.createDestination(createDestinationV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DestinationsApi#createDestination");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createDestinationV1Input** | [**CreateDestinationV1Input**](CreateDestinationV1Input.md)|  | |

### Return type

[**CreateDestination200Response**](CreateDestination200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.segment.v1+json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: createDestinationSubscription

> CreateDestinationSubscription200Response createDestinationSubscription(destinationId, createDestinationSubscriptionAlphaInput)

Create Destination Subscription

Creates a new Destination subscription.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Destination Subscriptions feature enabled. Please reach out to your customer success manager for more information.   The rate limit for this endpoint is 50 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DestinationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DestinationsApi apiInstance = new DestinationsApi(defaultClient);
        String destinationId = "fP7qoQw2HTWt9WdMr718gn"; // String | 
        CreateDestinationSubscriptionAlphaInput createDestinationSubscriptionAlphaInput = new CreateDestinationSubscriptionAlphaInput(); // CreateDestinationSubscriptionAlphaInput | 
        try {
            CreateDestinationSubscription200Response result = apiInstance.createDestinationSubscription(destinationId, createDestinationSubscriptionAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DestinationsApi#createDestinationSubscription");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **destinationId** | **String**|  | |
| **createDestinationSubscriptionAlphaInput** | [**CreateDestinationSubscriptionAlphaInput**](CreateDestinationSubscriptionAlphaInput.md)|  | |

### Return type

[**CreateDestinationSubscription200Response**](CreateDestinationSubscription200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1alpha+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: deleteDestination

> DeleteDestination200Response deleteDestination(destinationId)

Delete Destination

Deletes an existing Destination.    • When called, this endpoint may generate the &#x60;Integration Deleted&#x60; event in the [audit trail](/tag/Audit-Trail).  Config API omitted fields: - &#x60;catalogId&#x60;       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DestinationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DestinationsApi apiInstance = new DestinationsApi(defaultClient);
        String destinationId = "65c2bdbede6f2d8297f943db"; // String | 
        try {
            DeleteDestination200Response result = apiInstance.deleteDestination(destinationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DestinationsApi#deleteDestination");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **destinationId** | **String**|  | |

### Return type

[**DeleteDestination200Response**](DeleteDestination200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: getDestination

> GetDestination200Response getDestination(destinationId)

Get Destination

Returns a Destination by its id.        Config API omitted fields: - &#x60;catalogId&#x60; 

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DestinationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DestinationsApi apiInstance = new DestinationsApi(defaultClient);
        String destinationId = "qtiZHLLqqsHmpvLXNtP5du"; // String | 
        try {
            GetDestination200Response result = apiInstance.getDestination(destinationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DestinationsApi#getDestination");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **destinationId** | **String**|  | |

### Return type

[**GetDestination200Response**](GetDestination200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: getSubscriptionFromDestination

> GetSubscriptionFromDestination200Response getSubscriptionFromDestination(destinationId, id)

Get Subscription from Destination

Gets a Destination subscription by id.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Destination Subscriptions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DestinationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DestinationsApi apiInstance = new DestinationsApi(defaultClient);
        String destinationId = "fP7qoQw2HTWt9WdMr718gn"; // String | 
        String id = "kyMKN6LUgMvF8dwRMEz3cX"; // String | 
        try {
            GetSubscriptionFromDestination200Response result = apiInstance.getSubscriptionFromDestination(destinationId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DestinationsApi#getSubscriptionFromDestination");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **destinationId** | **String**|  | |
| **id** | **String**|  | |

### Return type

[**GetSubscriptionFromDestination200Response**](GetSubscriptionFromDestination200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1alpha+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: listDeliveryMetricsSummaryFromDestination

> ListDeliveryMetricsSummaryFromDestination200Response listDeliveryMetricsSummaryFromDestination(destinationId, sourceId, startTime, endTime, granularity)

List Delivery Metrics Summary from Destination

Get an event delivery metrics summary from a Destination.  Based on the granularity chosen, there are restrictions on the time range you can query:  **Minute**: - Max time range: 4 hours - Oldest possible start time: 48 hours in the past  **Hour**: - Max Time range: 7 days - Oldest possible start time: 7 days in the past  **Day**: - Max time range: 14 days - Oldest possible start time: 14 days in the past

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DestinationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DestinationsApi apiInstance = new DestinationsApi(defaultClient);
        String destinationId = "fP7qoQw2HTWt9WdMr718gn"; // String | 
        String sourceId = "rh5BDZp6QDHvXFCkibm1pR"; // String | The id of the Source linked to the Destination.  Config API note: analogous to `parent`.  This parameter exists in beta.
        String startTime = "2006-01-02T15:04:05.000Z"; // String | Filter events that happened after this time.  Defaults to: - 1 hour ago if granularity is `MINUTE`. - 7 days ago if granularity is `HOUR`. - 30 days ago if granularity is `DAY`.  This parameter exists in beta.
        String endTime = "2006-01-02T15:04:05.000Z"; // String | Filter events that happened before this time. Defaults to now if not set.  This parameter exists in beta.
        String granularity = "DAY"; // String | The granularity to filter metrics to. Either `MINUTE`, `HOUR` or `DAY`.  Defaults to `MINUTE` if not set.  This parameter exists in beta.
        try {
            ListDeliveryMetricsSummaryFromDestination200Response result = apiInstance.listDeliveryMetricsSummaryFromDestination(destinationId, sourceId, startTime, endTime, granularity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DestinationsApi#listDeliveryMetricsSummaryFromDestination");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **destinationId** | **String**|  | |
| **sourceId** | **String**| The id of the Source linked to the Destination.  Config API note: analogous to &#x60;parent&#x60;.  This parameter exists in beta. | |
| **startTime** | **String**| Filter events that happened after this time.  Defaults to: - 1 hour ago if granularity is &#x60;MINUTE&#x60;. - 7 days ago if granularity is &#x60;HOUR&#x60;. - 30 days ago if granularity is &#x60;DAY&#x60;.  This parameter exists in beta. | [optional] |
| **endTime** | **String**| Filter events that happened before this time. Defaults to now if not set.  This parameter exists in beta. | [optional] |
| **granularity** | **String**| The granularity to filter metrics to. Either &#x60;MINUTE&#x60;, &#x60;HOUR&#x60; or &#x60;DAY&#x60;.  Defaults to &#x60;MINUTE&#x60; if not set.  This parameter exists in beta. | [optional] [enum: DAY, HOUR, MINUTE] |

### Return type

[**ListDeliveryMetricsSummaryFromDestination200Response**](ListDeliveryMetricsSummaryFromDestination200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: listDestinations

> ListDestinations200Response listDestinations(pagination)

List Destinations

Returns a list of Destinations.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DestinationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DestinationsApi apiInstance = new DestinationsApi(defaultClient);
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Required pagination params for the request.  This parameter exists in v1.
        try {
            ListDestinations200Response result = apiInstance.listDestinations(pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DestinationsApi#listDestinations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pagination** | [**PaginationInput**](.md)| Required pagination params for the request.  This parameter exists in v1. | [optional] |

### Return type

[**ListDestinations200Response**](ListDestinations200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: listSubscriptionsFromDestination

> ListSubscriptionsFromDestination200Response listSubscriptionsFromDestination(destinationId, pagination)

List Subscriptions from Destination

Lists subscriptions for a Destination.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Destination Subscriptions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DestinationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DestinationsApi apiInstance = new DestinationsApi(defaultClient);
        String destinationId = "fP7qoQw2HTWt9WdMr718gn"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination options.  This parameter exists in alpha.
        try {
            ListSubscriptionsFromDestination200Response result = apiInstance.listSubscriptionsFromDestination(destinationId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DestinationsApi#listSubscriptionsFromDestination");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **destinationId** | **String**|  | |
| **pagination** | [**PaginationInput**](.md)| Pagination options.  This parameter exists in alpha. | [optional] |

### Return type

[**ListSubscriptionsFromDestination200Response**](ListSubscriptionsFromDestination200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1alpha+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: removeSubscriptionFromDestination

> RemoveSubscriptionFromDestination200Response removeSubscriptionFromDestination(destinationId, id)

Remove Subscription from Destination

Deletes an existing Destination subscription.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Destination Subscriptions feature enabled. Please reach out to your customer success manager for more information.   The rate limit for this endpoint is 50 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DestinationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DestinationsApi apiInstance = new DestinationsApi(defaultClient);
        String destinationId = "fP7qoQw2HTWt9WdMr718gn"; // String | 
        String id = "zXCqmEMHJojkD45GcBAPt"; // String | 
        try {
            RemoveSubscriptionFromDestination200Response result = apiInstance.removeSubscriptionFromDestination(destinationId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DestinationsApi#removeSubscriptionFromDestination");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **destinationId** | **String**|  | |
| **id** | **String**|  | |

### Return type

[**RemoveSubscriptionFromDestination200Response**](RemoveSubscriptionFromDestination200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1alpha+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: updateDestination

> UpdateDestination200Response updateDestination(destinationId, updateDestinationV1Input)

Update Destination

Updates an existing Destination.  **Note**: if you attempt to update read-only settings for your destination you&#39;ll encounter the following behavior:    * If only read-only properties are being updated, the endpoint will return an HTTP 400 error.   * If there&#39;s a mix of writable and read-only properties in the payload, the request will be accepted, the writable properties will be updated and the read-only properties ignored.     • When called, this endpoint may generate the &#x60;Integration Disabled&#x60; event in the [audit trail](/tag/Audit-Trail).  Config API omitted fields: - &#x60;updateMask&#x60;          

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DestinationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DestinationsApi apiInstance = new DestinationsApi(defaultClient);
        String destinationId = "qtiZHLLqqsHmpvLXNtP5du"; // String | 
        UpdateDestinationV1Input updateDestinationV1Input = new UpdateDestinationV1Input(); // UpdateDestinationV1Input | 
        try {
            UpdateDestination200Response result = apiInstance.updateDestination(destinationId, updateDestinationV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DestinationsApi#updateDestination");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **destinationId** | **String**|  | |
| **updateDestinationV1Input** | [**UpdateDestinationV1Input**](UpdateDestinationV1Input.md)|  | |

### Return type

[**UpdateDestination200Response**](UpdateDestination200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.segment.v1+json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: updateSubscriptionForDestination

> UpdateSubscriptionForDestination200Response updateSubscriptionForDestination(destinationId, id, updateSubscriptionForDestinationAlphaInput)

Update Subscription for Destination

Updates an existing Destination subscription.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Destination Subscriptions feature enabled. Please reach out to your customer success manager for more information.   The rate limit for this endpoint is 50 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DestinationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DestinationsApi apiInstance = new DestinationsApi(defaultClient);
        String destinationId = "qtiZHLLqqsHmpvLXNtP5du"; // String | 
        String id = "pJtn52LjrcD1TrQcm2ZSwp"; // String | 
        UpdateSubscriptionForDestinationAlphaInput updateSubscriptionForDestinationAlphaInput = new UpdateSubscriptionForDestinationAlphaInput(); // UpdateSubscriptionForDestinationAlphaInput | 
        try {
            UpdateSubscriptionForDestination200Response result = apiInstance.updateSubscriptionForDestination(destinationId, id, updateSubscriptionForDestinationAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DestinationsApi#updateSubscriptionForDestination");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **destinationId** | **String**|  | |
| **id** | **String**|  | |
| **updateSubscriptionForDestinationAlphaInput** | [**UpdateSubscriptionForDestinationAlphaInput**](UpdateSubscriptionForDestinationAlphaInput.md)|  | |

### Return type

[**UpdateSubscriptionForDestination200Response**](UpdateSubscriptionForDestination200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1alpha+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |

