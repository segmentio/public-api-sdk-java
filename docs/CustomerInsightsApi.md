# CustomerInsightsApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDownload**](CustomerInsightsApi.md#createDownload) | **POST** /customer-insights/download | Create Download |



## Operation: createDownload

> CreateDownload200Response createDownload(createDownloadAlphaInput)

Create Download

Create Customer Insights Presigned URLsThe rate limit for this endpoint is 120 requests per day per workspaceId, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.CustomerInsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        CustomerInsightsApi apiInstance = new CustomerInsightsApi(defaultClient);
        CreateDownloadAlphaInput createDownloadAlphaInput = new CreateDownloadAlphaInput(); // CreateDownloadAlphaInput | 
        try {
            CreateDownload200Response result = apiInstance.createDownload(createDownloadAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomerInsightsApi#createDownload");
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
| **createDownloadAlphaInput** | [**CreateDownloadAlphaInput**](CreateDownloadAlphaInput.md)|  | |

### Return type

[**CreateDownload200Response**](CreateDownload200Response.md)

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

