# ProfilesSyncApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProfilesWarehouse**](ProfilesSyncApi.md#createProfilesWarehouse) | **POST** /spaces/{spaceId}/profiles-warehouses | Create Profiles Warehouse |
| [**listProfilesWarehouseInSpace**](ProfilesSyncApi.md#listProfilesWarehouseInSpace) | **GET** /spaces/{spaceId}/profiles-warehouses | List Profiles Warehouse in Space |
| [**listSelectiveSyncsFromWarehouseAndSpace**](ProfilesSyncApi.md#listSelectiveSyncsFromWarehouseAndSpace) | **GET** /spaces/{spaceId}/profiles-warehouses/{warehouseId}/selective-syncs | List Selective Syncs from Warehouse And Space |
| [**removeProfilesWarehouseFromSpace**](ProfilesSyncApi.md#removeProfilesWarehouseFromSpace) | **DELETE** /spaces/{spaceId}/profiles-warehouses/{warehouseId} | Remove Profiles Warehouse from Space |
| [**updateProfilesWarehouseForSpaceWarehouse**](ProfilesSyncApi.md#updateProfilesWarehouseForSpaceWarehouse) | **PATCH** /spaces/{spaceId}/profiles-warehouses/{warehouseId} | Update Profiles Warehouse for Space Warehouse |
| [**updateSelectiveSyncForWarehouseAndSpace**](ProfilesSyncApi.md#updateSelectiveSyncForWarehouseAndSpace) | **PATCH** /spaces/{spaceId}/profiles-warehouses/{warehouseId}/selective-syncs | Update Selective Sync for Warehouse And Space |



## Operation: createProfilesWarehouse

> CreateProfilesWarehouse200Response createProfilesWarehouse(spaceId, createProfilesWarehouseAlphaInput)

Create Profiles Warehouse

Creates a new Profiles Warehouse.    • When called, this endpoint may generate the &#x60;Profiles Sync Warehouse Created&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ProfilesSyncApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ProfilesSyncApi apiInstance = new ProfilesSyncApi(defaultClient);
        String spaceId = "9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        CreateProfilesWarehouseAlphaInput createProfilesWarehouseAlphaInput = new CreateProfilesWarehouseAlphaInput(); // CreateProfilesWarehouseAlphaInput | 
        try {
            CreateProfilesWarehouse200Response result = apiInstance.createProfilesWarehouse(spaceId, createProfilesWarehouseAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesSyncApi#createProfilesWarehouse");
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
| **spaceId** | **String**|  | |
| **createProfilesWarehouseAlphaInput** | [**CreateProfilesWarehouseAlphaInput**](CreateProfilesWarehouseAlphaInput.md)|  | |

### Return type

[**CreateProfilesWarehouse200Response**](CreateProfilesWarehouse200Response.md)

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


## Operation: listProfilesWarehouseInSpace

> ListProfilesWarehouseInSpace200Response listProfilesWarehouseInSpace(spaceId, pagination)

List Profiles Warehouse in Space

Lists all Profile Warehouses for a given space id.    • When called, this endpoint may generate the &#x60;Profiles Sync Warehouse Retrieved&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ProfilesSyncApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ProfilesSyncApi apiInstance = new ProfilesSyncApi(defaultClient);
        String spaceId = "9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Defines the pagination parameters.  This parameter exists in alpha.
        try {
            ListProfilesWarehouseInSpace200Response result = apiInstance.listProfilesWarehouseInSpace(spaceId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesSyncApi#listProfilesWarehouseInSpace");
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
| **spaceId** | **String**|  | |
| **pagination** | [**PaginationInput**](.md)| Defines the pagination parameters.  This parameter exists in alpha. | [optional] |

### Return type

[**ListProfilesWarehouseInSpace200Response**](ListProfilesWarehouseInSpace200Response.md)

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


## Operation: listSelectiveSyncsFromWarehouseAndSpace

> ListSelectiveSyncsFromWarehouseAndSpace200Response listSelectiveSyncsFromWarehouseAndSpace(spaceId, warehouseId, pagination)

List Selective Syncs from Warehouse And Space

Returns the schema for a Space Warehouse connection, including Collections and Properties.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ProfilesSyncApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ProfilesSyncApi apiInstance = new ProfilesSyncApi(defaultClient);
        String spaceId = "9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        String warehouseId = "fQyLbqjfwaqg9mr3hDQ7We"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Defines the pagination parameters.  This parameter exists in alpha.
        try {
            ListSelectiveSyncsFromWarehouseAndSpace200Response result = apiInstance.listSelectiveSyncsFromWarehouseAndSpace(spaceId, warehouseId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesSyncApi#listSelectiveSyncsFromWarehouseAndSpace");
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
| **spaceId** | **String**|  | |
| **warehouseId** | **String**|  | |
| **pagination** | [**PaginationInput**](.md)| Defines the pagination parameters.  This parameter exists in alpha. | |

### Return type

[**ListSelectiveSyncsFromWarehouseAndSpace200Response**](ListSelectiveSyncsFromWarehouseAndSpace200Response.md)

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


## Operation: removeProfilesWarehouseFromSpace

> RemoveProfilesWarehouseFromSpace200Response removeProfilesWarehouseFromSpace(spaceId, warehouseId)

Remove Profiles Warehouse from Space

Deletes an existing Profiles Warehouse.    • When called, this endpoint may generate the &#x60;Profiles Sync Warehouse Deleted&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ProfilesSyncApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ProfilesSyncApi apiInstance = new ProfilesSyncApi(defaultClient);
        String spaceId = "9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        String warehouseId = "kjU72LCJexvrqL7G4TMHHN"; // String | 
        try {
            RemoveProfilesWarehouseFromSpace200Response result = apiInstance.removeProfilesWarehouseFromSpace(spaceId, warehouseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesSyncApi#removeProfilesWarehouseFromSpace");
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
| **spaceId** | **String**|  | |
| **warehouseId** | **String**|  | |

### Return type

[**RemoveProfilesWarehouseFromSpace200Response**](RemoveProfilesWarehouseFromSpace200Response.md)

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


## Operation: updateProfilesWarehouseForSpaceWarehouse

> UpdateProfilesWarehouseForSpaceWarehouse200Response updateProfilesWarehouseForSpaceWarehouse(spaceId, warehouseId, updateProfilesWarehouseForSpaceWarehouseAlphaInput)

Update Profiles Warehouse for Space Warehouse

Updates an existing Profiles Warehouse.    • When called, this endpoint may generate the &#x60;Profiles Sync Warehouse Updated&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ProfilesSyncApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ProfilesSyncApi apiInstance = new ProfilesSyncApi(defaultClient);
        String spaceId = "9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        String warehouseId = "eSrwSWY9u6JisZvHhZeK8o"; // String | 
        UpdateProfilesWarehouseForSpaceWarehouseAlphaInput updateProfilesWarehouseForSpaceWarehouseAlphaInput = new UpdateProfilesWarehouseForSpaceWarehouseAlphaInput(); // UpdateProfilesWarehouseForSpaceWarehouseAlphaInput | 
        try {
            UpdateProfilesWarehouseForSpaceWarehouse200Response result = apiInstance.updateProfilesWarehouseForSpaceWarehouse(spaceId, warehouseId, updateProfilesWarehouseForSpaceWarehouseAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesSyncApi#updateProfilesWarehouseForSpaceWarehouse");
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
| **spaceId** | **String**|  | |
| **warehouseId** | **String**|  | |
| **updateProfilesWarehouseForSpaceWarehouseAlphaInput** | [**UpdateProfilesWarehouseForSpaceWarehouseAlphaInput**](UpdateProfilesWarehouseForSpaceWarehouseAlphaInput.md)|  | |

### Return type

[**UpdateProfilesWarehouseForSpaceWarehouse200Response**](UpdateProfilesWarehouseForSpaceWarehouse200Response.md)

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


## Operation: updateSelectiveSyncForWarehouseAndSpace

> UpdateSelectiveSyncForWarehouseAndSpace200Response updateSelectiveSyncForWarehouseAndSpace(spaceId, warehouseId, updateSelectiveSyncForWarehouseAndSpaceAlphaInput)

Update Selective Sync for Warehouse And Space

Updates the schema for a Space Warehouse connection, including Collections and Properties.    • When called, this endpoint may generate the &#x60;Profiles Sync Warehouse Modified&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ProfilesSyncApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ProfilesSyncApi apiInstance = new ProfilesSyncApi(defaultClient);
        String spaceId = "space_123"; // String | 
        String warehouseId = "kjU72LCJexvrqL7G4TMHHN"; // String | 
        UpdateSelectiveSyncForWarehouseAndSpaceAlphaInput updateSelectiveSyncForWarehouseAndSpaceAlphaInput = new UpdateSelectiveSyncForWarehouseAndSpaceAlphaInput(); // UpdateSelectiveSyncForWarehouseAndSpaceAlphaInput | 
        try {
            UpdateSelectiveSyncForWarehouseAndSpace200Response result = apiInstance.updateSelectiveSyncForWarehouseAndSpace(spaceId, warehouseId, updateSelectiveSyncForWarehouseAndSpaceAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProfilesSyncApi#updateSelectiveSyncForWarehouseAndSpace");
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
| **spaceId** | **String**|  | |
| **warehouseId** | **String**|  | |
| **updateSelectiveSyncForWarehouseAndSpaceAlphaInput** | [**UpdateSelectiveSyncForWarehouseAndSpaceAlphaInput**](UpdateSelectiveSyncForWarehouseAndSpaceAlphaInput.md)|  | |

### Return type

[**UpdateSelectiveSyncForWarehouseAndSpace200Response**](UpdateSelectiveSyncForWarehouseAndSpace200Response.md)

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

