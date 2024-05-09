# ApiCallsApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDailyPerSourceAPICallsUsage**](ApiCallsApi.md#getDailyPerSourceAPICallsUsage) | **GET** /usage/api-calls/sources/daily | Get Daily Per Source API Calls Usage |
| [**getDailyWorkspaceAPICallsUsage**](ApiCallsApi.md#getDailyWorkspaceAPICallsUsage) | **GET** /usage/api-calls/daily | Get Daily Workspace API Calls Usage |



## Operation: getDailyPerSourceAPICallsUsage

> GetDailyPerSourceAPICallsUsage200Response getDailyPerSourceAPICallsUsage(period, pagination)

Get Daily Per Source API Calls Usage

Provides daily cumulative per-source API call counts for a usage period.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ApiCallsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ApiCallsApi apiInstance = new ApiCallsApi(defaultClient);
        String period = "2021-02-01"; // String | The start of the usage month in the ISO-8601 format.  This parameter exists in v1.
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination input for per Source API calls counts.  This parameter exists in v1.
        try {
            GetDailyPerSourceAPICallsUsage200Response result = apiInstance.getDailyPerSourceAPICallsUsage(period, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiCallsApi#getDailyPerSourceAPICallsUsage");
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
| **period** | **String**| The start of the usage month in the ISO-8601 format.  This parameter exists in v1. | |
| **pagination** | [**PaginationInput**](.md)| Pagination input for per Source API calls counts.  This parameter exists in v1. | [optional] |

### Return type

[**GetDailyPerSourceAPICallsUsage200Response**](GetDailyPerSourceAPICallsUsage200Response.md)

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


## Operation: getDailyWorkspaceAPICallsUsage

> GetDailyWorkspaceAPICallsUsage200Response getDailyWorkspaceAPICallsUsage(period, pagination)

Get Daily Workspace API Calls Usage

Provides daily cumulative API call counts for a usage period.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ApiCallsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ApiCallsApi apiInstance = new ApiCallsApi(defaultClient);
        String period = "2021-02-01"; // String | The start of the usage month in the ISO-8601 format.  This parameter exists in v1.
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination input for Workspace API call counts.  This parameter exists in v1.
        try {
            GetDailyWorkspaceAPICallsUsage200Response result = apiInstance.getDailyWorkspaceAPICallsUsage(period, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiCallsApi#getDailyWorkspaceAPICallsUsage");
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
| **period** | **String**| The start of the usage month in the ISO-8601 format.  This parameter exists in v1. | |
| **pagination** | [**PaginationInput**](.md)| Pagination input for Workspace API call counts.  This parameter exists in v1. | [optional] |

### Return type

[**GetDailyWorkspaceAPICallsUsage200Response**](GetDailyWorkspaceAPICallsUsage200Response.md)

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

