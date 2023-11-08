# MonthlyTrackedUsersApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDailyPerSourceMTUUsage**](MonthlyTrackedUsersApi.md#getDailyPerSourceMTUUsage) | **GET** /usage/mtu/sources/daily | Get Daily Per Source MTU Usage |
| [**getDailyWorkspaceMTUUsage**](MonthlyTrackedUsersApi.md#getDailyWorkspaceMTUUsage) | **GET** /usage/mtu/daily | Get Daily Workspace MTU Usage |



## Operation: getDailyPerSourceMTUUsage

> GetDailyPerSourceMTUUsage200Response getDailyPerSourceMTUUsage(period, pagination)

Get Daily Per Source MTU Usage

Provides daily cumulative per-source MTU counts for a usage period.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.MonthlyTrackedUsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        MonthlyTrackedUsersApi apiInstance = new MonthlyTrackedUsersApi(defaultClient);
        String period = "2021-02-01"; // String | The start of the usage month, in the ISO-8601 format.  This parameter exists in v1.
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination input for per Source MTU counts.  This parameter exists in v1.
        try {
            GetDailyPerSourceMTUUsage200Response result = apiInstance.getDailyPerSourceMTUUsage(period, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MonthlyTrackedUsersApi#getDailyPerSourceMTUUsage");
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
| **period** | **String**| The start of the usage month, in the ISO-8601 format.  This parameter exists in v1. | |
| **pagination** | [**PaginationInput**](.md)| Pagination input for per Source MTU counts.  This parameter exists in v1. | |

### Return type

[**GetDailyPerSourceMTUUsage200Response**](GetDailyPerSourceMTUUsage200Response.md)

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


## Operation: getDailyWorkspaceMTUUsage

> GetDailyWorkspaceMTUUsage200Response getDailyWorkspaceMTUUsage(period, pagination)

Get Daily Workspace MTU Usage

Provides daily cumulative MTU counts for a usage period.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.MonthlyTrackedUsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        MonthlyTrackedUsersApi apiInstance = new MonthlyTrackedUsersApi(defaultClient);
        String period = "2021-02-01"; // String | The start of the usage month, in the ISO-8601 format.  This parameter exists in v1.
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination input for Workspace MTU counts.  This parameter exists in v1.
        try {
            GetDailyWorkspaceMTUUsage200Response result = apiInstance.getDailyWorkspaceMTUUsage(period, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MonthlyTrackedUsersApi#getDailyWorkspaceMTUUsage");
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
| **period** | **String**| The start of the usage month, in the ISO-8601 format.  This parameter exists in v1. | |
| **pagination** | [**PaginationInput**](.md)| Pagination input for Workspace MTU counts.  This parameter exists in v1. | |

### Return type

[**GetDailyWorkspaceMTUUsage200Response**](GetDailyWorkspaceMTUUsage200Response.md)

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

