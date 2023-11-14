# SpacesApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchQueryMessagingSubscriptionsForSpace**](SpacesApi.md#batchQueryMessagingSubscriptionsForSpace) | **POST** /spaces/{spaceId}/messaging-subscriptions/batch | Batch Query Messaging Subscriptions for Space |
| [**getSpace**](SpacesApi.md#getSpace) | **GET** /spaces/{spaceId} | Get Space |
| [**replaceMessagingSubscriptionsInSpaces**](SpacesApi.md#replaceMessagingSubscriptionsInSpaces) | **PUT** /spaces/{spaceId}/messaging-subscriptions | Replace Messaging Subscriptions in Spaces |



## Operation: batchQueryMessagingSubscriptionsForSpace

> BatchQueryMessagingSubscriptionsForSpace200Response batchQueryMessagingSubscriptionsForSpace(spaceId, batchQueryMessagingSubscriptionsForSpaceAlphaInput)

Batch Query Messaging Subscriptions for Space

Get Messaging Subscriptions for space.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Spaces feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SpacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SpacesApi apiInstance = new SpacesApi(defaultClient);
        String spaceId = "9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        BatchQueryMessagingSubscriptionsForSpaceAlphaInput batchQueryMessagingSubscriptionsForSpaceAlphaInput = new BatchQueryMessagingSubscriptionsForSpaceAlphaInput(); // BatchQueryMessagingSubscriptionsForSpaceAlphaInput | 
        try {
            BatchQueryMessagingSubscriptionsForSpace200Response result = apiInstance.batchQueryMessagingSubscriptionsForSpace(spaceId, batchQueryMessagingSubscriptionsForSpaceAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpacesApi#batchQueryMessagingSubscriptionsForSpace");
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
| **spaceId** | **String**|  | |
| **batchQueryMessagingSubscriptionsForSpaceAlphaInput** | [**BatchQueryMessagingSubscriptionsForSpaceAlphaInput**](BatchQueryMessagingSubscriptionsForSpaceAlphaInput.md)|  | |

### Return type

[**BatchQueryMessagingSubscriptionsForSpace200Response**](BatchQueryMessagingSubscriptionsForSpace200Response.md)

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


## Operation: getSpace

> GetSpace200Response getSpace(spaceId)

Get Space

Returns the Space by id.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Spaces feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SpacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SpacesApi apiInstance = new SpacesApi(defaultClient);
        String spaceId = "9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        try {
            GetSpace200Response result = apiInstance.getSpace(spaceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpacesApi#getSpace");
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
| **spaceId** | **String**|  | |

### Return type

[**GetSpace200Response**](GetSpace200Response.md)

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


## Operation: replaceMessagingSubscriptionsInSpaces

> ReplaceMessagingSubscriptionsInSpaces200Response replaceMessagingSubscriptionsInSpaces(spaceId, replaceMessagingSubscriptionsInSpacesAlphaInput)

Replace Messaging Subscriptions in Spaces

Replace Messaging Subscriptions in Spaces.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Spaces feature enabled. Please reach out to your customer success manager for more information.   The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SpacesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SpacesApi apiInstance = new SpacesApi(defaultClient);
        String spaceId = "9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        ReplaceMessagingSubscriptionsInSpacesAlphaInput replaceMessagingSubscriptionsInSpacesAlphaInput = new ReplaceMessagingSubscriptionsInSpacesAlphaInput(); // ReplaceMessagingSubscriptionsInSpacesAlphaInput | 
        try {
            ReplaceMessagingSubscriptionsInSpaces200Response result = apiInstance.replaceMessagingSubscriptionsInSpaces(spaceId, replaceMessagingSubscriptionsInSpacesAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpacesApi#replaceMessagingSubscriptionsInSpaces");
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
| **spaceId** | **String**|  | |
| **replaceMessagingSubscriptionsInSpacesAlphaInput** | [**ReplaceMessagingSubscriptionsInSpacesAlphaInput**](ReplaceMessagingSubscriptionsInSpacesAlphaInput.md)|  | |

### Return type

[**ReplaceMessagingSubscriptionsInSpaces200Response**](ReplaceMessagingSubscriptionsInSpaces200Response.md)

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

