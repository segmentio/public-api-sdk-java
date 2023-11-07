# SelectiveSyncApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAdvancedSyncScheduleFromWarehouse**](SelectiveSyncApi.md#getAdvancedSyncScheduleFromWarehouse) | **GET** /warehouses/{warehouseId}/advanced-sync-schedule | Get Advanced Sync Schedule from Warehouse |
| [**listSelectiveSyncsFromWarehouseAndSource**](SelectiveSyncApi.md#listSelectiveSyncsFromWarehouseAndSource) | **GET** /warehouses/{warehouseId}/connected-sources/{sourceId}/selective-syncs | List Selective Syncs from Warehouse And Source |
| [**listSyncsFromWarehouse**](SelectiveSyncApi.md#listSyncsFromWarehouse) | **GET** /warehouses/{warehouseId}/syncs | List Syncs from Warehouse |
| [**listSyncsFromWarehouseAndSource**](SelectiveSyncApi.md#listSyncsFromWarehouseAndSource) | **GET** /warehouses/{warehouseId}/connected-sources/{sourceId}/syncs | List Syncs from Warehouse And Source |
| [**replaceAdvancedSyncScheduleForWarehouse**](SelectiveSyncApi.md#replaceAdvancedSyncScheduleForWarehouse) | **PUT** /warehouses/{warehouseId}/advanced-sync-schedule | Replace Advanced Sync Schedule for Warehouse |
| [**updateSelectiveSyncForWarehouse**](SelectiveSyncApi.md#updateSelectiveSyncForWarehouse) | **PATCH** /warehouses/{warehouseId}/selective-sync | Update Selective Sync for Warehouse |



## Operation: getAdvancedSyncScheduleFromWarehouse

> GetAdvancedSyncScheduleFromWarehouse200Response getAdvancedSyncScheduleFromWarehouse(warehouseId)

Get Advanced Sync Schedule from Warehouse

Returns the advanced sync schedule for a Warehouse.   The rate limit for this endpoint is 2 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SelectiveSyncApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SelectiveSyncApi apiInstance = new SelectiveSyncApi(defaultClient);
        String warehouseId = "kjU72LCJexvrqL7G4TMHHN"; // String | 
        try {
            GetAdvancedSyncScheduleFromWarehouse200Response result = apiInstance.getAdvancedSyncScheduleFromWarehouse(warehouseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelectiveSyncApi#getAdvancedSyncScheduleFromWarehouse");
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
| **warehouseId** | **String**|  | |

### Return type

[**GetAdvancedSyncScheduleFromWarehouse200Response**](GetAdvancedSyncScheduleFromWarehouse200Response.md)

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


## Operation: listSelectiveSyncsFromWarehouseAndSource

> ListSelectiveSyncsFromWarehouseAndSource200Response listSelectiveSyncsFromWarehouseAndSource(warehouseId, sourceId, pagination)

List Selective Syncs from Warehouse And Source

Returns the schema for a Warehouse, including Sources, Collections, and Properties.   The rate limit for this endpoint is 2 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SelectiveSyncApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SelectiveSyncApi apiInstance = new SelectiveSyncApi(defaultClient);
        String warehouseId = "kjU72LCJexvrqL7G4TMHHN"; // String | 
        String sourceId = "rh5BDZp6QDHvXFCkibm1pR"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Defines the pagination parameters.  This parameter exists in v1.
        try {
            ListSelectiveSyncsFromWarehouseAndSource200Response result = apiInstance.listSelectiveSyncsFromWarehouseAndSource(warehouseId, sourceId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelectiveSyncApi#listSelectiveSyncsFromWarehouseAndSource");
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
| **warehouseId** | **String**|  | |
| **sourceId** | **String**|  | |
| **pagination** | [**PaginationInput**](.md)| Defines the pagination parameters.  This parameter exists in v1. | |

### Return type

[**ListSelectiveSyncsFromWarehouseAndSource200Response**](ListSelectiveSyncsFromWarehouseAndSource200Response.md)

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


## Operation: listSyncsFromWarehouse

> ListSyncsFromWarehouse200Response listSyncsFromWarehouse(warehouseId, pagination)

List Syncs from Warehouse

Returns the overview of syncs for every Source connected to a Warehouse.   The rate limit for this endpoint is 2 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SelectiveSyncApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SelectiveSyncApi apiInstance = new SelectiveSyncApi(defaultClient);
        String warehouseId = "kjU72LCJexvrqL7G4TMHHN"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Defines the pagination parameters.  This parameter exists in v1.
        try {
            ListSyncsFromWarehouse200Response result = apiInstance.listSyncsFromWarehouse(warehouseId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelectiveSyncApi#listSyncsFromWarehouse");
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
| **warehouseId** | **String**|  | |
| **pagination** | [**PaginationInput**](.md)| Defines the pagination parameters.  This parameter exists in v1. | |

### Return type

[**ListSyncsFromWarehouse200Response**](ListSyncsFromWarehouse200Response.md)

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


## Operation: listSyncsFromWarehouseAndSource

> ListSyncsFromWarehouseAndSource200Response listSyncsFromWarehouseAndSource(warehouseId, sourceId, pagination)

List Syncs from Warehouse And Source

Returns the overview of syncs for a Source connected to a Warehouse.   The rate limit for this endpoint is 2 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SelectiveSyncApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SelectiveSyncApi apiInstance = new SelectiveSyncApi(defaultClient);
        String warehouseId = "kjU72LCJexvrqL7G4TMHHN"; // String | 
        String sourceId = "rh5BDZp6QDHvXFCkibm1pR"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Defines the pagination parameters.  This parameter exists in v1.
        try {
            ListSyncsFromWarehouseAndSource200Response result = apiInstance.listSyncsFromWarehouseAndSource(warehouseId, sourceId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelectiveSyncApi#listSyncsFromWarehouseAndSource");
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
| **warehouseId** | **String**|  | |
| **sourceId** | **String**|  | |
| **pagination** | [**PaginationInput**](.md)| Defines the pagination parameters.  This parameter exists in v1. | |

### Return type

[**ListSyncsFromWarehouseAndSource200Response**](ListSyncsFromWarehouseAndSource200Response.md)

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


## Operation: replaceAdvancedSyncScheduleForWarehouse

> ReplaceAdvancedSyncScheduleForWarehouse200Response replaceAdvancedSyncScheduleForWarehouse(warehouseId, replaceAdvancedSyncScheduleForWarehouseV1Input)

Replace Advanced Sync Schedule for Warehouse

Updates the advanced sync schedule for a Warehouse, replacing the sync schedule with a new schedule.   The rate limit for this endpoint is 2 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SelectiveSyncApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SelectiveSyncApi apiInstance = new SelectiveSyncApi(defaultClient);
        String warehouseId = "kjU72LCJexvrqL7G4TMHHN"; // String | 
        ReplaceAdvancedSyncScheduleForWarehouseV1Input replaceAdvancedSyncScheduleForWarehouseV1Input = new ReplaceAdvancedSyncScheduleForWarehouseV1Input(); // ReplaceAdvancedSyncScheduleForWarehouseV1Input | 
        try {
            ReplaceAdvancedSyncScheduleForWarehouse200Response result = apiInstance.replaceAdvancedSyncScheduleForWarehouse(warehouseId, replaceAdvancedSyncScheduleForWarehouseV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelectiveSyncApi#replaceAdvancedSyncScheduleForWarehouse");
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
| **warehouseId** | **String**|  | |
| **replaceAdvancedSyncScheduleForWarehouseV1Input** | [**ReplaceAdvancedSyncScheduleForWarehouseV1Input**](ReplaceAdvancedSyncScheduleForWarehouseV1Input.md)|  | |

### Return type

[**ReplaceAdvancedSyncScheduleForWarehouse200Response**](ReplaceAdvancedSyncScheduleForWarehouse200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1+json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: updateSelectiveSyncForWarehouse

> UpdateSelectiveSyncForWarehouse200Response updateSelectiveSyncForWarehouse(warehouseId, updateSelectiveSyncForWarehouseV1Input)

Update Selective Sync for Warehouse

Configures the schema for a Warehouse, including Sources, Collections, and Properties.    • When called, this endpoint may generate the &#x60;Storage Destination Modified&#x60; event in the [audit trail](/tag/Audit-Trail).          The rate limit for this endpoint is 2 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SelectiveSyncApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SelectiveSyncApi apiInstance = new SelectiveSyncApi(defaultClient);
        String warehouseId = "kjU72LCJexvrqL7G4TMHHN"; // String | 
        UpdateSelectiveSyncForWarehouseV1Input updateSelectiveSyncForWarehouseV1Input = new UpdateSelectiveSyncForWarehouseV1Input(); // UpdateSelectiveSyncForWarehouseV1Input | 
        try {
            UpdateSelectiveSyncForWarehouse200Response result = apiInstance.updateSelectiveSyncForWarehouse(warehouseId, updateSelectiveSyncForWarehouseV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SelectiveSyncApi#updateSelectiveSyncForWarehouse");
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
| **warehouseId** | **String**|  | |
| **updateSelectiveSyncForWarehouseV1Input** | [**UpdateSelectiveSyncForWarehouseV1Input**](UpdateSelectiveSyncForWarehouseV1Input.md)|  | |

### Return type

[**UpdateSelectiveSyncForWarehouse200Response**](UpdateSelectiveSyncForWarehouse200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1+json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |

