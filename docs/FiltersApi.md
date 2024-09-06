# FiltersApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFilter**](FiltersApi.md#createFilter) | **POST** /filters | Create Filter |
| [**deleteFilterById**](FiltersApi.md#deleteFilterById) | **DELETE** /filters/{id} | Delete Filter By Id |
| [**getFilterById**](FiltersApi.md#getFilterById) | **GET** /filters/{id} | Get Filter By Id |
| [**listFiltersByIntegrationId**](FiltersApi.md#listFiltersByIntegrationId) | **GET** /filters | List Filters By Integration Id |
| [**updateFilterById**](FiltersApi.md#updateFilterById) | **PATCH** /filters/{id} | Update Filter By Id |



## Operation: createFilter

> createFilter(createFilterInput)

Create Filter

Creates a filter.    • When called, this endpoint may generate the &#x60;Filter Created&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FiltersApi apiInstance = new FiltersApi(defaultClient);
        CreateFilterInput createFilterInput = new CreateFilterInput(); // CreateFilterInput | 
        try {
            apiInstance.createFilter(createFilterInput);
        } catch (ApiException e) {
            System.err.println("Exception when calling FiltersApi#createFilter");
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
| **createFilterInput** | [**CreateFilterInput**](CreateFilterInput.md)|  | |

### Return type

null (empty response body)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1alpha+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: deleteFilterById

> deleteFilterById(id, productArea)

Delete Filter By Id

Deletes a filter by id.    • When called, this endpoint may generate the &#x60;Filter Deleted&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FiltersApi apiInstance = new FiltersApi(defaultClient);
        String id = "<id>"; // String | 
        String productArea = "spaces"; // String | The product area of the filter.  This parameter exists in alpha.
        try {
            apiInstance.deleteFilterById(id, productArea);
        } catch (ApiException e) {
            System.err.println("Exception when calling FiltersApi#deleteFilterById");
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
| **id** | **String**|  | |
| **productArea** | **String**| The product area of the filter.  This parameter exists in alpha. | |

### Return type

null (empty response body)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: getFilterById

> getFilterById(id, productArea)

Get Filter By Id

Gets a filter by id.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FiltersApi apiInstance = new FiltersApi(defaultClient);
        String id = "<id>"; // String | 
        String productArea = "spaces"; // String | The product area of the filter, which should be spaces (endpoint table should be able to determine the resource).  This parameter exists in alpha.
        try {
            apiInstance.getFilterById(id, productArea);
        } catch (ApiException e) {
            System.err.println("Exception when calling FiltersApi#getFilterById");
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
| **id** | **String**|  | |
| **productArea** | **String**| The product area of the filter, which should be spaces (endpoint table should be able to determine the resource).  This parameter exists in alpha. | |

### Return type

null (empty response body)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: listFiltersByIntegrationId

> listFiltersByIntegrationId(integrationId, productArea, pagination)

List Filters By Integration Id

Lists filters by integration id.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FiltersApi apiInstance = new FiltersApi(defaultClient);
        String integrationId = "<id>"; // String | The integration id used to fetch filters.  This parameter exists in alpha.
        String productArea = "spaces"; // String | The product area of the filter, which should be spaces (endpoint table should be able to determine the resource).  This parameter exists in alpha.
        ListFiltersPaginationInput pagination = new ListFiltersPaginationInput(); // ListFiltersPaginationInput | Pagination parameters.  This parameter exists in alpha.
        try {
            apiInstance.listFiltersByIntegrationId(integrationId, productArea, pagination);
        } catch (ApiException e) {
            System.err.println("Exception when calling FiltersApi#listFiltersByIntegrationId");
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
| **integrationId** | **String**| The integration id used to fetch filters.  This parameter exists in alpha. | |
| **productArea** | **String**| The product area of the filter, which should be spaces (endpoint table should be able to determine the resource).  This parameter exists in alpha. | |
| **pagination** | [**ListFiltersPaginationInput**](.md)| Pagination parameters.  This parameter exists in alpha. | [optional] |

### Return type

null (empty response body)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: updateFilterById

> updateFilterById(id, updateFilterByIdInput)

Update Filter By Id

Updates a filter by id.    • When called, this endpoint may generate the &#x60;Filter Updated&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FiltersApi apiInstance = new FiltersApi(defaultClient);
        String id = "<id>"; // String | 
        UpdateFilterByIdInput updateFilterByIdInput = new UpdateFilterByIdInput(); // UpdateFilterByIdInput | 
        try {
            apiInstance.updateFilterById(id, updateFilterByIdInput);
        } catch (ApiException e) {
            System.err.println("Exception when calling FiltersApi#updateFilterById");
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
| **id** | **String**|  | |
| **updateFilterByIdInput** | [**UpdateFilterByIdInput**](UpdateFilterByIdInput.md)|  | |

### Return type

null (empty response body)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1alpha+json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |

