# SpaceFiltersApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFilter**](SpaceFiltersApi.md#createFilter) | **POST** /filters | Create Filter |
| [**deleteFilterById**](SpaceFiltersApi.md#deleteFilterById) | **DELETE** /filters/{id} | Delete Filter By Id |
| [**getFilterById**](SpaceFiltersApi.md#getFilterById) | **GET** /filters/{id} | Get Filter By Id |
| [**listFiltersByIntegrationId**](SpaceFiltersApi.md#listFiltersByIntegrationId) | **GET** /filters | List Filters By Integration Id |
| [**updateFilterById**](SpaceFiltersApi.md#updateFilterById) | **PATCH** /filters/{id} | Update Filter By Id |



## Operation: createFilter

> CreateFilter200Response createFilter(createFilterInput)

Create Filter

Creates a filter.    • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.    • In order to successfully call this endpoint, the specified Workspace needs to have the Space Filters feature enabled. Please reach out to your customer success manager for more information.   • When called, this endpoint may generate the &#x60;Filter Created&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SpaceFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SpaceFiltersApi apiInstance = new SpaceFiltersApi(defaultClient);
        CreateFilterInput createFilterInput = new CreateFilterInput(); // CreateFilterInput | 
        try {
            CreateFilter200Response result = apiInstance.createFilter(createFilterInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpaceFiltersApi#createFilter");
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

[**CreateFilter200Response**](CreateFilter200Response.md)

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


## Operation: deleteFilterById

> DeleteFilterById200Response deleteFilterById(id)

Delete Filter By Id

Deletes a filter by id.    • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.    • In order to successfully call this endpoint, the specified Workspace needs to have the Space Filters feature enabled. Please reach out to your customer success manager for more information.   • When called, this endpoint may generate the &#x60;Filter Deleted&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SpaceFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SpaceFiltersApi apiInstance = new SpaceFiltersApi(defaultClient);
        String id = "<id>"; // String | 
        try {
            DeleteFilterById200Response result = apiInstance.deleteFilterById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpaceFiltersApi#deleteFilterById");
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

### Return type

[**DeleteFilterById200Response**](DeleteFilterById200Response.md)

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


## Operation: getFilterById

> GetFilterById200Response getFilterById(id)

Get Filter By Id

Gets a filter by id.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Space Filters feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SpaceFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SpaceFiltersApi apiInstance = new SpaceFiltersApi(defaultClient);
        String id = "<id>"; // String | 
        try {
            GetFilterById200Response result = apiInstance.getFilterById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpaceFiltersApi#getFilterById");
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

### Return type

[**GetFilterById200Response**](GetFilterById200Response.md)

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


## Operation: listFiltersByIntegrationId

> ListFiltersByIntegrationId200Response listFiltersByIntegrationId(integrationId, pagination)

List Filters By Integration Id

Lists filters by Integration id.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Space Filters feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SpaceFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SpaceFiltersApi apiInstance = new SpaceFiltersApi(defaultClient);
        String integrationId = "<id>"; // String | The integration id used to fetch filters.  This parameter exists in alpha.
        ListFiltersPaginationInput pagination = new ListFiltersPaginationInput(); // ListFiltersPaginationInput | Pagination parameters.  This parameter exists in alpha.
        try {
            ListFiltersByIntegrationId200Response result = apiInstance.listFiltersByIntegrationId(integrationId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpaceFiltersApi#listFiltersByIntegrationId");
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
| **pagination** | [**ListFiltersPaginationInput**](.md)| Pagination parameters.  This parameter exists in alpha. | [optional] |

### Return type

[**ListFiltersByIntegrationId200Response**](ListFiltersByIntegrationId200Response.md)

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


## Operation: updateFilterById

> UpdateFilterById200Response updateFilterById(id, updateFilterByIdInput)

Update Filter By Id

Updates a filter by id and replaces the existing filter.    • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.    • In order to successfully call this endpoint, the specified Workspace needs to have the Space Filters feature enabled. Please reach out to your customer success manager for more information.   • When called, this endpoint may generate the &#x60;Filter Updated&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SpaceFiltersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SpaceFiltersApi apiInstance = new SpaceFiltersApi(defaultClient);
        String id = "<id>"; // String | 
        UpdateFilterByIdInput updateFilterByIdInput = new UpdateFilterByIdInput(); // UpdateFilterByIdInput | 
        try {
            UpdateFilterById200Response result = apiInstance.updateFilterById(id, updateFilterByIdInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpaceFiltersApi#updateFilterById");
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

[**UpdateFilterById200Response**](UpdateFilterById200Response.md)

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

