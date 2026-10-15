# SpacesApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSpace**](SpacesApi.md#getSpace) | **GET** /spaces/{spaceId} | Get Space |
| [**listSpaces**](SpacesApi.md#listSpaces) | **GET** /spaces | List Spaces |



## Operation: getSpace

> GetSpace200Response getSpace(spaceId)

Get Space

Returns the Space by id.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Spaces feature enabled. Please reach out to your customer success manager for more information.

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
| **429** | Too many requests |  * Retry-After - Number of whole seconds to wait before retrying. Sent when the request was rejected because the authentication token is rate limited. Prefer this over your own backoff schedule when present. <br>  |


## Operation: listSpaces

> ListSpaces200Response listSpaces(pagination)

List Spaces

List Spaces.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Spaces feature enabled. Please reach out to your customer success manager for more information.

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
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination params  This parameter exists in alpha.
        try {
            ListSpaces200Response result = apiInstance.listSpaces(pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpacesApi#listSpaces");
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
| **pagination** | [**PaginationInput**](.md)| Pagination params  This parameter exists in alpha. | [optional] |

### Return type

[**ListSpaces200Response**](ListSpaces200Response.md)

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
| **429** | Too many requests |  * Retry-After - Number of whole seconds to wait before retrying. Sent when the request was rejected because the authentication token is rate limited. Prefer this over your own backoff schedule when present. <br>  |

