# EdgeFunctionsApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEdgeFunctions**](EdgeFunctionsApi.md#createEdgeFunctions) | **POST** /sources/{sourceId}/edge-functions | Create Edge Functions |
| [**disableEdgeFunctions**](EdgeFunctionsApi.md#disableEdgeFunctions) | **PATCH** /sources/{sourceId}/edge-functions/disable | Disable Edge Functions |
| [**generateUploadURLForEdgeFunctions**](EdgeFunctionsApi.md#generateUploadURLForEdgeFunctions) | **POST** /sources/{sourceId}/edge-functions/upload-url | Generate Upload URL for Edge Functions |
| [**getLatestFromEdgeFunctions**](EdgeFunctionsApi.md#getLatestFromEdgeFunctions) | **GET** /sources/{sourceId}/edge-functions/latest | Get Latest from Edge Functions |



## Operation: createEdgeFunctions

> CreateEdgeFunctions200Response createEdgeFunctions(sourceId, createEdgeFunctionsAlphaInput)

Create Edge Functions

Create EdgeFunctions for your Source given a valid upload URL for an Edge Functions bundle.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Edge Functions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.EdgeFunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        EdgeFunctionsApi apiInstance = new EdgeFunctionsApi(defaultClient);
        String sourceId = "qQEHquLrjRDN9j1ByrChyn"; // String | 
        CreateEdgeFunctionsAlphaInput createEdgeFunctionsAlphaInput = new CreateEdgeFunctionsAlphaInput(); // CreateEdgeFunctionsAlphaInput | 
        try {
            CreateEdgeFunctions200Response result = apiInstance.createEdgeFunctions(sourceId, createEdgeFunctionsAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EdgeFunctionsApi#createEdgeFunctions");
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
| **sourceId** | **String**|  | |
| **createEdgeFunctionsAlphaInput** | [**CreateEdgeFunctionsAlphaInput**](CreateEdgeFunctionsAlphaInput.md)|  | |

### Return type

[**CreateEdgeFunctions200Response**](CreateEdgeFunctions200Response.md)

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


## Operation: disableEdgeFunctions

> DisableEdgeFunctions200Response disableEdgeFunctions(sourceId)

Disable Edge Functions

Disable Edge Functions for your Source.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Edge Functions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.EdgeFunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        EdgeFunctionsApi apiInstance = new EdgeFunctionsApi(defaultClient);
        String sourceId = "qQEHquLrjRDN9j1ByrChyn"; // String | 
        try {
            DisableEdgeFunctions200Response result = apiInstance.disableEdgeFunctions(sourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EdgeFunctionsApi#disableEdgeFunctions");
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
| **sourceId** | **String**|  | |

### Return type

[**DisableEdgeFunctions200Response**](DisableEdgeFunctions200Response.md)

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


## Operation: generateUploadURLForEdgeFunctions

> GenerateUploadURLForEdgeFunctions200Response generateUploadURLForEdgeFunctions(sourceId)

Generate Upload URL for Edge Functions

Generate a temporary upload URL that can be used to upload an Edge Functions bundle.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Edge Functions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.EdgeFunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        EdgeFunctionsApi apiInstance = new EdgeFunctionsApi(defaultClient);
        String sourceId = "qQEHquLrjRDN9j1ByrChyn"; // String | 
        try {
            GenerateUploadURLForEdgeFunctions200Response result = apiInstance.generateUploadURLForEdgeFunctions(sourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EdgeFunctionsApi#generateUploadURLForEdgeFunctions");
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
| **sourceId** | **String**|  | |

### Return type

[**GenerateUploadURLForEdgeFunctions200Response**](GenerateUploadURLForEdgeFunctions200Response.md)

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


## Operation: getLatestFromEdgeFunctions

> GetLatestFromEdgeFunctions200Response getLatestFromEdgeFunctions(sourceId)

Get Latest from Edge Functions

Get the latest Edge Functions for your Source.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Edge Functions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.EdgeFunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        EdgeFunctionsApi apiInstance = new EdgeFunctionsApi(defaultClient);
        String sourceId = "qQEHquLrjRDN9j1ByrChyn"; // String | 
        try {
            GetLatestFromEdgeFunctions200Response result = apiInstance.getLatestFromEdgeFunctions(sourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EdgeFunctionsApi#getLatestFromEdgeFunctions");
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
| **sourceId** | **String**|  | |

### Return type

[**GetLatestFromEdgeFunctions200Response**](GetLatestFromEdgeFunctions200Response.md)

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

