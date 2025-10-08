# EdgeFunctionsApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createEdgeFunction**](EdgeFunctionsApi.md#createEdgeFunction) | **POST** /sources/{sourceId}/edge-functions/create | Create Edge Function |
| [**deleteEdgeFunctionCode**](EdgeFunctionsApi.md#deleteEdgeFunctionCode) | **DELETE** /sources/{sourceId}/edge-functions/delete-code | Delete Edge Function Code |
| [**disableEdgeFunctions**](EdgeFunctionsApi.md#disableEdgeFunctions) | **PATCH** /sources/{sourceId}/edge-functions/disable | Disable Edge Functions |
| [**generateUploadURLForEdgeFunctions**](EdgeFunctionsApi.md#generateUploadURLForEdgeFunctions) | **POST** /sources/{sourceId}/edge-functions/upload-url | Generate Upload URL for Edge Functions |
| [**getLatestFromEdgeFunctions**](EdgeFunctionsApi.md#getLatestFromEdgeFunctions) | **GET** /sources/{sourceId}/edge-functions/latest | Get Latest from Edge Functions |



## Operation: createEdgeFunction

> CreateEdgeFunction200Response createEdgeFunction(sourceId, createEdgeFunctionAlphaInput)

Create Edge Function

Creates or updates an Edge Function for your Source with given code.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Edge Functions feature enabled. Please reach out to your customer success manager for more information.

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
        CreateEdgeFunctionAlphaInput createEdgeFunctionAlphaInput = new CreateEdgeFunctionAlphaInput(); // CreateEdgeFunctionAlphaInput | 
        try {
            CreateEdgeFunction200Response result = apiInstance.createEdgeFunction(sourceId, createEdgeFunctionAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EdgeFunctionsApi#createEdgeFunction");
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
| **createEdgeFunctionAlphaInput** | [**CreateEdgeFunctionAlphaInput**](CreateEdgeFunctionAlphaInput.md)|  | |

### Return type

[**CreateEdgeFunction200Response**](CreateEdgeFunction200Response.md)

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


## Operation: deleteEdgeFunctionCode

> DeleteEdgeFunctionCode200Response deleteEdgeFunctionCode(sourceId)

Delete Edge Function Code

Delete the Edge Function code for a Source. This will not disable Edge Functions for the Source, but will remove any existing code.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Edge Functions feature enabled. Please reach out to your customer success manager for more information.

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
            DeleteEdgeFunctionCode200Response result = apiInstance.deleteEdgeFunctionCode(sourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EdgeFunctionsApi#deleteEdgeFunctionCode");
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

[**DeleteEdgeFunctionCode200Response**](DeleteEdgeFunctionCode200Response.md)

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

