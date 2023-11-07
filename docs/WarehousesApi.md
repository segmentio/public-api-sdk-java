# WarehousesApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addConnectionFromSourceToWarehouse**](WarehousesApi.md#addConnectionFromSourceToWarehouse) | **POST** /warehouses/{warehouseId}/connected-sources/{sourceId} | Add Connection from Source to Warehouse |
| [**createValidationInWarehouse**](WarehousesApi.md#createValidationInWarehouse) | **POST** /warehouses/validation | Create Validation in Warehouse |
| [**createWarehouse**](WarehousesApi.md#createWarehouse) | **POST** /warehouses | Create Warehouse |
| [**deleteWarehouse**](WarehousesApi.md#deleteWarehouse) | **DELETE** /warehouses/{warehouseId} | Delete Warehouse |
| [**getConnectionStateFromWarehouse**](WarehousesApi.md#getConnectionStateFromWarehouse) | **GET** /warehouses/{warehouseId}/connection-state | Get Connection State from Warehouse |
| [**getWarehouse**](WarehousesApi.md#getWarehouse) | **GET** /warehouses/{warehouseId} | Get Warehouse |
| [**listConnectedSourcesFromWarehouse**](WarehousesApi.md#listConnectedSourcesFromWarehouse) | **GET** /warehouses/{warehouseId}/connected-sources | List Connected Sources from Warehouse |
| [**listWarehouses**](WarehousesApi.md#listWarehouses) | **GET** /warehouses | List Warehouses |
| [**removeSourceConnectionFromWarehouse**](WarehousesApi.md#removeSourceConnectionFromWarehouse) | **DELETE** /warehouses/{warehouseId}/connected-sources/{sourceId} | Remove Source Connection from Warehouse |
| [**updateWarehouse**](WarehousesApi.md#updateWarehouse) | **PATCH** /warehouses/{warehouseId} | Update Warehouse |



## Operation: addConnectionFromSourceToWarehouse

> AddConnectionFromSourceToWarehouse200Response addConnectionFromSourceToWarehouse(warehouseId, sourceId)

Add Connection from Source to Warehouse

Connects a Source to a Warehouse.    • When called, this endpoint may generate the &#x60;Storage Destination Modified&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.WarehousesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        WarehousesApi apiInstance = new WarehousesApi(defaultClient);
        String warehouseId = "kjU72LCJexvrqL7G4TMHHN"; // String | 
        String sourceId = "rh5BDZp6QDHvXFCkibm1pR"; // String | 
        try {
            AddConnectionFromSourceToWarehouse200Response result = apiInstance.addConnectionFromSourceToWarehouse(warehouseId, sourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WarehousesApi#addConnectionFromSourceToWarehouse");
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

### Return type

[**AddConnectionFromSourceToWarehouse200Response**](AddConnectionFromSourceToWarehouse200Response.md)

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


## Operation: createValidationInWarehouse

> CreateValidationInWarehouse200Response createValidationInWarehouse(createValidationInWarehouseV1Input)

Create Validation in Warehouse

Validates input settings against a Warehouse.    • When called, this endpoint may generate the &#x60;Storage Destination Settings Validation&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.WarehousesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        WarehousesApi apiInstance = new WarehousesApi(defaultClient);
        CreateValidationInWarehouseV1Input createValidationInWarehouseV1Input = new CreateValidationInWarehouseV1Input(); // CreateValidationInWarehouseV1Input | 
        try {
            CreateValidationInWarehouse200Response result = apiInstance.createValidationInWarehouse(createValidationInWarehouseV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WarehousesApi#createValidationInWarehouse");
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
| **createValidationInWarehouseV1Input** | [**CreateValidationInWarehouseV1Input**](CreateValidationInWarehouseV1Input.md)|  | |

### Return type

[**CreateValidationInWarehouse200Response**](CreateValidationInWarehouse200Response.md)

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


## Operation: createWarehouse

> CreateWarehouse200Response createWarehouse(createWarehouseV1Input)

Create Warehouse

Creates a new Warehouse.    • When called, this endpoint may generate the &#x60;Storage Destination Created&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.WarehousesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        WarehousesApi apiInstance = new WarehousesApi(defaultClient);
        CreateWarehouseV1Input createWarehouseV1Input = new CreateWarehouseV1Input(); // CreateWarehouseV1Input | 
        try {
            CreateWarehouse200Response result = apiInstance.createWarehouse(createWarehouseV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WarehousesApi#createWarehouse");
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
| **createWarehouseV1Input** | [**CreateWarehouseV1Input**](CreateWarehouseV1Input.md)|  | |

### Return type

[**CreateWarehouse200Response**](CreateWarehouse200Response.md)

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


## Operation: deleteWarehouse

> DeleteWarehouse200Response deleteWarehouse(warehouseId)

Delete Warehouse

Deletes an existing Warehouse.    • When called, this endpoint may generate the &#x60;Storage Destination Deleted&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.WarehousesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        WarehousesApi apiInstance = new WarehousesApi(defaultClient);
        String warehouseId = "8VW6ytH4hKYCoTtfQ7Xbkd"; // String | 
        try {
            DeleteWarehouse200Response result = apiInstance.deleteWarehouse(warehouseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WarehousesApi#deleteWarehouse");
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

[**DeleteWarehouse200Response**](DeleteWarehouse200Response.md)

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


## Operation: getConnectionStateFromWarehouse

> GetConnectionStateFromWarehouse200Response getConnectionStateFromWarehouse(warehouseId)

Get Connection State from Warehouse

Verifies the state of Warehouse connection settings.   The rate limit for this endpoint is 200 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.WarehousesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        WarehousesApi apiInstance = new WarehousesApi(defaultClient);
        String warehouseId = "kjU72LCJexvrqL7G4TMHHN"; // String | 
        try {
            GetConnectionStateFromWarehouse200Response result = apiInstance.getConnectionStateFromWarehouse(warehouseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WarehousesApi#getConnectionStateFromWarehouse");
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

[**GetConnectionStateFromWarehouse200Response**](GetConnectionStateFromWarehouse200Response.md)

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


## Operation: getWarehouse

> GetWarehouse200Response getWarehouse(warehouseId)

Get Warehouse

Returns a Warehouse by its id.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.WarehousesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        WarehousesApi apiInstance = new WarehousesApi(defaultClient);
        String warehouseId = "kjU72LCJexvrqL7G4TMHHN"; // String | 
        try {
            GetWarehouse200Response result = apiInstance.getWarehouse(warehouseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WarehousesApi#getWarehouse");
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

[**GetWarehouse200Response**](GetWarehouse200Response.md)

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


## Operation: listConnectedSourcesFromWarehouse

> ListConnectedSourcesFromWarehouse200Response listConnectedSourcesFromWarehouse(warehouseId, pagination)

List Connected Sources from Warehouse

Returns the list of Sources that are connected to a Warehouse.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.WarehousesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        WarehousesApi apiInstance = new WarehousesApi(defaultClient);
        String warehouseId = "kjU72LCJexvrqL7G4TMHHN"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Defines the pagination parameters.  This parameter exists in v1.
        try {
            ListConnectedSourcesFromWarehouse200Response result = apiInstance.listConnectedSourcesFromWarehouse(warehouseId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WarehousesApi#listConnectedSourcesFromWarehouse");
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

[**ListConnectedSourcesFromWarehouse200Response**](ListConnectedSourcesFromWarehouse200Response.md)

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


## Operation: listWarehouses

> ListWarehouses200Response listWarehouses(pagination)

List Warehouses

Returns a list of Warehouses.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.WarehousesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        WarehousesApi apiInstance = new WarehousesApi(defaultClient);
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Defines the pagination parameters.  This parameter exists in v1.
        try {
            ListWarehouses200Response result = apiInstance.listWarehouses(pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WarehousesApi#listWarehouses");
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
| **pagination** | [**PaginationInput**](.md)| Defines the pagination parameters.  This parameter exists in v1. | |

### Return type

[**ListWarehouses200Response**](ListWarehouses200Response.md)

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


## Operation: removeSourceConnectionFromWarehouse

> RemoveSourceConnectionFromWarehouse200Response removeSourceConnectionFromWarehouse(warehouseId, sourceId)

Remove Source Connection from Warehouse

Disconnects a Source from a Warehouse.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.WarehousesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        WarehousesApi apiInstance = new WarehousesApi(defaultClient);
        String warehouseId = "kjU72LCJexvrqL7G4TMHHN"; // String | 
        String sourceId = "rh5BDZp6QDHvXFCkibm1pR"; // String | 
        try {
            RemoveSourceConnectionFromWarehouse200Response result = apiInstance.removeSourceConnectionFromWarehouse(warehouseId, sourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WarehousesApi#removeSourceConnectionFromWarehouse");
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

### Return type

[**RemoveSourceConnectionFromWarehouse200Response**](RemoveSourceConnectionFromWarehouse200Response.md)

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


## Operation: updateWarehouse

> UpdateWarehouse200Response updateWarehouse(warehouseId, updateWarehouseV1Input)

Update Warehouse

Updates an existing Warehouse.    • When called, this endpoint may generate one or more of the following [audit trail](/tag/Audit-Trail) events:* Storage Destination Modified * Storage Destination Enabled       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.WarehousesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        WarehousesApi apiInstance = new WarehousesApi(defaultClient);
        String warehouseId = "kjU72LCJexvrqL7G4TMHHN"; // String | 
        UpdateWarehouseV1Input updateWarehouseV1Input = new UpdateWarehouseV1Input(); // UpdateWarehouseV1Input | 
        try {
            UpdateWarehouse200Response result = apiInstance.updateWarehouse(warehouseId, updateWarehouseV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WarehousesApi#updateWarehouse");
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
| **updateWarehouseV1Input** | [**UpdateWarehouseV1Input**](UpdateWarehouseV1Input.md)|  | |

### Return type

[**UpdateWarehouse200Response**](UpdateWarehouse200Response.md)

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

