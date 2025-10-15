# LivePluginsApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLivePlugin**](LivePluginsApi.md#createLivePlugin) | **POST** /sources/{sourceId}/live-plugins/create | Create Live Plugin |
| [**deleteLivePluginCode**](LivePluginsApi.md#deleteLivePluginCode) | **DELETE** /sources/{sourceId}/live-plugins/delete-code | Delete Live Plugin Code |
| [**getLatestFromLivePlugins**](LivePluginsApi.md#getLatestFromLivePlugins) | **GET** /sources/{sourceId}/live-plugins/latest | Get Latest from Live Plugins |



## Operation: createLivePlugin

> CreateLivePlugin200Response createLivePlugin(sourceId, createLivePluginAlphaInput)

Create Live Plugin

Creates or updates a Live Plugin for your Source with given code.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Live Plugins feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.LivePluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        LivePluginsApi apiInstance = new LivePluginsApi(defaultClient);
        String sourceId = "qQEHquLrjRDN9j1ByrChyn"; // String | 
        CreateLivePluginAlphaInput createLivePluginAlphaInput = new CreateLivePluginAlphaInput(); // CreateLivePluginAlphaInput | 
        try {
            CreateLivePlugin200Response result = apiInstance.createLivePlugin(sourceId, createLivePluginAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LivePluginsApi#createLivePlugin");
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
| **createLivePluginAlphaInput** | [**CreateLivePluginAlphaInput**](CreateLivePluginAlphaInput.md)|  | |

### Return type

[**CreateLivePlugin200Response**](CreateLivePlugin200Response.md)

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


## Operation: deleteLivePluginCode

> DeleteLivePluginCode200Response deleteLivePluginCode(sourceId)

Delete Live Plugin Code

Delete the Live Plugin code for a Source. This will not disable Live Plugins for the Source, but will remove any existing code.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Live Plugins feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.LivePluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        LivePluginsApi apiInstance = new LivePluginsApi(defaultClient);
        String sourceId = "qQEHquLrjRDN9j1ByrChyn"; // String | 
        try {
            DeleteLivePluginCode200Response result = apiInstance.deleteLivePluginCode(sourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LivePluginsApi#deleteLivePluginCode");
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

[**DeleteLivePluginCode200Response**](DeleteLivePluginCode200Response.md)

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


## Operation: getLatestFromLivePlugins

> GetLatestFromLivePlugins200Response getLatestFromLivePlugins(sourceId)

Get Latest from Live Plugins

Get the latest Live Plugins for your Source.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Live Plugins feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.LivePluginsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        LivePluginsApi apiInstance = new LivePluginsApi(defaultClient);
        String sourceId = "qQEHquLrjRDN9j1ByrChyn"; // String | 
        try {
            GetLatestFromLivePlugins200Response result = apiInstance.getLatestFromLivePlugins(sourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LivePluginsApi#getLatestFromLivePlugins");
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

[**GetLatestFromLivePlugins200Response**](GetLatestFromLivePlugins200Response.md)

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

