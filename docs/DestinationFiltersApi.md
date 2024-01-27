# DestinationFiltersApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFilterForDestination**](DestinationFiltersApi.md#createFilterForDestination) | **POST** /destination/{destinationId}/filters | Create Filter for Destination |
| [**getFilterInDestination**](DestinationFiltersApi.md#getFilterInDestination) | **GET** /destination/{destinationId}/filters/{filterId} | Get Filter in Destination |
| [**listFiltersFromDestination**](DestinationFiltersApi.md#listFiltersFromDestination) | **GET** /destination/{destinationId}/filters | List Filters from Destination |
| [**previewDestinationFilter**](DestinationFiltersApi.md#previewDestinationFilter) | **POST** /destination/filters/preview | Preview Destination Filter |
| [**removeFilterFromDestination**](DestinationFiltersApi.md#removeFilterFromDestination) | **DELETE** /destination/{destinationId}/filters/{filterId} | Remove Filter from Destination |
| [**updateFilterForDestination**](DestinationFiltersApi.md#updateFilterForDestination) | **PATCH** /destination/{destinationId}/filters/{filterId} | Update Filter for Destination |



## Operation: createFilterForDestination

> CreateFilterForDestination200Response createFilterForDestination(destinationId, createFilterForDestinationV1Input)

Create Filter for Destination

Creates a filter in a Destination.    • When called, this endpoint may generate the &#x60;Destination Filter Created&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DestinationFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DestinationFiltersApi apiInstance = new DestinationFiltersApi(defaultClient);
        String destinationId = "fP7qoQw2HTWt9WdMr718gn"; // String | 
        CreateFilterForDestinationV1Input createFilterForDestinationV1Input = new CreateFilterForDestinationV1Input(); // CreateFilterForDestinationV1Input | 
        try {
            CreateFilterForDestination200Response result = apiInstance.createFilterForDestination(destinationId, createFilterForDestinationV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DestinationFiltersApi#createFilterForDestination");
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
| **createFilterForDestinationV1Input** | [**CreateFilterForDestinationV1Input**](CreateFilterForDestinationV1Input.md)|  | |

### Return type

[**CreateFilterForDestination200Response**](CreateFilterForDestination200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: getFilterInDestination

> GetFilterInDestination200Response getFilterInDestination(destinationId, filterId)

Get Filter in Destination

Gets a Destination filter by id.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DestinationFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DestinationFiltersApi apiInstance = new DestinationFiltersApi(defaultClient);
        String destinationId = "fP7qoQw2HTWt9WdMr718gn"; // String | 
        String filterId = "xx6AySGeFExzdv2Gw2EuhV"; // String | 
        try {
            GetFilterInDestination200Response result = apiInstance.getFilterInDestination(destinationId, filterId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DestinationFiltersApi#getFilterInDestination");
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
| **filterId** | **String**|  | |

### Return type

[**GetFilterInDestination200Response**](GetFilterInDestination200Response.md)

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


## Operation: listFiltersFromDestination

> ListFiltersFromDestination200Response listFiltersFromDestination(destinationId, pagination)

List Filters from Destination

Lists filters for a Destination.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DestinationFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DestinationFiltersApi apiInstance = new DestinationFiltersApi(defaultClient);
        String destinationId = "fP7qoQw2HTWt9WdMr718gn"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination options.  This parameter exists in v1.
        try {
            ListFiltersFromDestination200Response result = apiInstance.listFiltersFromDestination(destinationId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DestinationFiltersApi#listFiltersFromDestination");
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
| **pagination** | [**PaginationInput**](.md)| Pagination options.  This parameter exists in v1. | |

### Return type

[**ListFiltersFromDestination200Response**](ListFiltersFromDestination200Response.md)

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


## Operation: previewDestinationFilter

> PreviewDestinationFilter200Response previewDestinationFilter(previewDestinationFilterV1Input)

Preview Destination Filter

Simulates the application of a Destination filter to a provided JSON payload.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DestinationFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DestinationFiltersApi apiInstance = new DestinationFiltersApi(defaultClient);
        PreviewDestinationFilterV1Input previewDestinationFilterV1Input = new PreviewDestinationFilterV1Input(); // PreviewDestinationFilterV1Input | 
        try {
            PreviewDestinationFilter200Response result = apiInstance.previewDestinationFilter(previewDestinationFilterV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DestinationFiltersApi#previewDestinationFilter");
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
| **previewDestinationFilterV1Input** | [**PreviewDestinationFilterV1Input**](PreviewDestinationFilterV1Input.md)|  | |

### Return type

[**PreviewDestinationFilter200Response**](PreviewDestinationFilter200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: removeFilterFromDestination

> RemoveFilterFromDestination200Response removeFilterFromDestination(destinationId, filterId)

Remove Filter from Destination

Deletes a Destination filter.    • When called, this endpoint may generate the &#x60;Destination Filter Deleted&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DestinationFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DestinationFiltersApi apiInstance = new DestinationFiltersApi(defaultClient);
        String destinationId = "fP7qoQw2HTWt9WdMr718gn"; // String | 
        String filterId = "2DrXi3N7S85LobhzPphZz0uFzJ4"; // String | 
        try {
            RemoveFilterFromDestination200Response result = apiInstance.removeFilterFromDestination(destinationId, filterId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DestinationFiltersApi#removeFilterFromDestination");
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
| **filterId** | **String**|  | |

### Return type

[**RemoveFilterFromDestination200Response**](RemoveFilterFromDestination200Response.md)

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


## Operation: updateFilterForDestination

> UpdateFilterForDestination200Response updateFilterForDestination(destinationId, filterId, updateFilterForDestinationV1Input)

Update Filter for Destination

Updates a filter in a Destination.    • When called, this endpoint may generate one or more of the following [audit trail](/tag/Audit-Trail) events:* Destination Filter Enabled * Destination Filter Disabled       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DestinationFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DestinationFiltersApi apiInstance = new DestinationFiltersApi(defaultClient);
        String destinationId = "fP7qoQw2HTWt9WdMr718gn"; // String | 
        String filterId = "xx6AySGeFExzdv2Gw2EuhV"; // String | 
        UpdateFilterForDestinationV1Input updateFilterForDestinationV1Input = new UpdateFilterForDestinationV1Input(); // UpdateFilterForDestinationV1Input | 
        try {
            UpdateFilterForDestination200Response result = apiInstance.updateFilterForDestination(destinationId, filterId, updateFilterForDestinationV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DestinationFiltersApi#updateFilterForDestination");
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
| **filterId** | **String**|  | |
| **updateFilterForDestinationV1Input** | [**UpdateFilterForDestinationV1Input**](UpdateFilterForDestinationV1Input.md)|  | |

### Return type

[**UpdateFilterForDestination200Response**](UpdateFilterForDestination200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |

