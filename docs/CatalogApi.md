# CatalogApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getDestinationMetadata**](CatalogApi.md#getDestinationMetadata) | **GET** /catalog/destinations/{destinationMetadataId} | Get Destination Metadata |
| [**getDestinationsCatalog**](CatalogApi.md#getDestinationsCatalog) | **GET** /catalog/destinations | Get Destinations Catalog |
| [**getSourceMetadata**](CatalogApi.md#getSourceMetadata) | **GET** /catalog/sources/{sourceMetadataId} | Get Source Metadata |
| [**getSourcesCatalog**](CatalogApi.md#getSourcesCatalog) | **GET** /catalog/sources | Get Sources Catalog |
| [**getWarehouseMetadata**](CatalogApi.md#getWarehouseMetadata) | **GET** /catalog/warehouses/{warehouseMetadataId} | Get Warehouse Metadata |
| [**getWarehousesCatalog**](CatalogApi.md#getWarehousesCatalog) | **GET** /catalog/warehouses | Get Warehouses Catalog |



## Operation: getDestinationMetadata

> GetDestinationMetadata200Response getDestinationMetadata(destinationMetadataId)

Get Destination Metadata

Returns a Destination catalog item by its id.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.CatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        CatalogApi apiInstance = new CatalogApi(defaultClient);
        String destinationMetadataId = "54521fd525e721e32a72ee91"; // String | 
        try {
            GetDestinationMetadata200Response result = apiInstance.getDestinationMetadata(destinationMetadataId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogApi#getDestinationMetadata");
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
| **destinationMetadataId** | **String**|  | |

### Return type

[**GetDestinationMetadata200Response**](GetDestinationMetadata200Response.md)

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


## Operation: getDestinationsCatalog

> GetDestinationsCatalog200Response getDestinationsCatalog(pagination)

Get Destinations Catalog

Returns a list of all available Destinations in the Segment catalog.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.CatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        CatalogApi apiInstance = new CatalogApi(defaultClient);
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Required pagination parameters used to filter the Destinations catalog.  This parameter exists in v1.
        try {
            GetDestinationsCatalog200Response result = apiInstance.getDestinationsCatalog(pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogApi#getDestinationsCatalog");
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
| **pagination** | [**PaginationInput**](.md)| Required pagination parameters used to filter the Destinations catalog.  This parameter exists in v1. | [optional] |

### Return type

[**GetDestinationsCatalog200Response**](GetDestinationsCatalog200Response.md)

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


## Operation: getSourceMetadata

> GetSourceMetadata200Response getSourceMetadata(sourceMetadataId)

Get Source Metadata

Returns a Source catalog item by its id.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.CatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        CatalogApi apiInstance = new CatalogApi(defaultClient);
        String sourceMetadataId = "1bow82lmk"; // String | 
        try {
            GetSourceMetadata200Response result = apiInstance.getSourceMetadata(sourceMetadataId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogApi#getSourceMetadata");
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
| **sourceMetadataId** | **String**|  | |

### Return type

[**GetSourceMetadata200Response**](GetSourceMetadata200Response.md)

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


## Operation: getSourcesCatalog

> GetSourcesCatalog200Response getSourcesCatalog(pagination)

Get Sources Catalog

Returns a list of all available Sources in the Segment catalog.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.CatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        CatalogApi apiInstance = new CatalogApi(defaultClient);
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Defines the pagination parameters.  This parameter exists in v1.
        try {
            GetSourcesCatalog200Response result = apiInstance.getSourcesCatalog(pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogApi#getSourcesCatalog");
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
| **pagination** | [**PaginationInput**](.md)| Defines the pagination parameters.  This parameter exists in v1. | [optional] |

### Return type

[**GetSourcesCatalog200Response**](GetSourcesCatalog200Response.md)

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


## Operation: getWarehouseMetadata

> GetWarehouseMetadata200Response getWarehouseMetadata(warehouseMetadataId)

Get Warehouse Metadata

Returns a Warehouse catalog item by its id.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.CatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        CatalogApi apiInstance = new CatalogApi(defaultClient);
        String warehouseMetadataId = "55d3d3aea3c"; // String | 
        try {
            GetWarehouseMetadata200Response result = apiInstance.getWarehouseMetadata(warehouseMetadataId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogApi#getWarehouseMetadata");
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
| **warehouseMetadataId** | **String**|  | |

### Return type

[**GetWarehouseMetadata200Response**](GetWarehouseMetadata200Response.md)

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


## Operation: getWarehousesCatalog

> GetWarehousesCatalog200Response getWarehousesCatalog(pagination)

Get Warehouses Catalog

Returns a list of all available Warehouses in the Segment catalog.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.CatalogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        CatalogApi apiInstance = new CatalogApi(defaultClient);
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Optional pagination params used to filter the Warehouses catalog.  This parameter exists in v1.
        try {
            GetWarehousesCatalog200Response result = apiInstance.getWarehousesCatalog(pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogApi#getWarehousesCatalog");
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
| **pagination** | [**PaginationInput**](.md)| Optional pagination params used to filter the Warehouses catalog.  This parameter exists in v1. | [optional] |

### Return type

[**GetWarehousesCatalog200Response**](GetWarehousesCatalog200Response.md)

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

