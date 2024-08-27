# ReverseEtlApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReverseETLManualSync**](ReverseEtlApi.md#createReverseETLManualSync) | **POST** /reverse-etl-syncs | Create Reverse ETL Manual Sync |
| [**createReverseEtlModel**](ReverseEtlApi.md#createReverseEtlModel) | **POST** /reverse-etl-models | Create Reverse Etl Model |
| [**deleteReverseEtlModel**](ReverseEtlApi.md#deleteReverseEtlModel) | **DELETE** /reverse-etl-models/{modelId} | Delete Reverse Etl Model |
| [**getReverseETLSyncStatus**](ReverseEtlApi.md#getReverseETLSyncStatus) | **GET** /reverse-etl-models/{modelId}/syncs/{syncId} | Get Reverse ETL Sync Status |
| [**getReverseEtlModel**](ReverseEtlApi.md#getReverseEtlModel) | **GET** /reverse-etl-models/{modelId} | Get Reverse Etl Model |
| [**listReverseETLSyncStatusesFromModelAndSubscriptionId**](ReverseEtlApi.md#listReverseETLSyncStatusesFromModelAndSubscriptionId) | **GET** /reverse-etl-models/{modelId}/subscriptionId/{subscriptionId}/syncs | List Reverse ETL Sync Statuses from Model And Subscription Id |
| [**listReverseEtlModels**](ReverseEtlApi.md#listReverseEtlModels) | **GET** /reverse-etl-models | List Reverse Etl Models |
| [**updateReverseEtlModel**](ReverseEtlApi.md#updateReverseEtlModel) | **PATCH** /reverse-etl-models/{modelId} | Update Reverse Etl Model |



## Operation: createReverseETLManualSync

> CreateReverseETLManualSync200Response createReverseETLManualSync(createReverseETLManualSyncInput)

Create Reverse ETL Manual Sync

Triggers a manual sync for a Reverse ETL Connection.   In the request body, the &#x60;subscriptionId&#x60; is the id that follows after &#x60;/mappings/&#x60; portion in the URL of the sync.   For example, the &#x60;subscriptionId&#x60; would be &#x60;2&#x60; for this sync: https://app.Segment.com/example-workspace/reverse-etl/destinations/example-destination/sources/example-source/instances/1/mappings/2/source-id/3/model-id/4/sync-details   The rate limit for this endpoint is 20 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ReverseEtlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ReverseEtlApi apiInstance = new ReverseEtlApi(defaultClient);
        CreateReverseETLManualSyncInput createReverseETLManualSyncInput = new CreateReverseETLManualSyncInput(); // CreateReverseETLManualSyncInput | 
        try {
            CreateReverseETLManualSync200Response result = apiInstance.createReverseETLManualSync(createReverseETLManualSyncInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseEtlApi#createReverseETLManualSync");
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
| **createReverseETLManualSyncInput** | [**CreateReverseETLManualSyncInput**](CreateReverseETLManualSyncInput.md)|  | |

### Return type

[**CreateReverseETLManualSync200Response**](CreateReverseETLManualSync200Response.md)

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


## Operation: createReverseEtlModel

> CreateReverseEtlModel201Response createReverseEtlModel(createReverseEtlModelInput)

Create Reverse Etl Model

Creates a new Reverse ETL Model.          • When called, this endpoint may generate the &#x60;Model Created&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ReverseEtlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ReverseEtlApi apiInstance = new ReverseEtlApi(defaultClient);
        CreateReverseEtlModelInput createReverseEtlModelInput = new CreateReverseEtlModelInput(); // CreateReverseEtlModelInput | 
        try {
            CreateReverseEtlModel201Response result = apiInstance.createReverseEtlModel(createReverseEtlModelInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseEtlApi#createReverseEtlModel");
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
| **createReverseEtlModelInput** | [**CreateReverseEtlModelInput**](CreateReverseEtlModelInput.md)|  | |

### Return type

[**CreateReverseEtlModel201Response**](CreateReverseEtlModel201Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1alpha+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: deleteReverseEtlModel

> DeleteReverseEtlModel200Response deleteReverseEtlModel(modelId)

Delete Reverse Etl Model

Deletes an existing Model.          • When called, this endpoint may generate the &#x60;Model Deleted&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ReverseEtlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ReverseEtlApi apiInstance = new ReverseEtlApi(defaultClient);
        String modelId = "fxXMc5bLdKnDfEgBpDbV11"; // String | 
        try {
            DeleteReverseEtlModel200Response result = apiInstance.deleteReverseEtlModel(modelId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseEtlApi#deleteReverseEtlModel");
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
| **modelId** | **String**|  | |

### Return type

[**DeleteReverseEtlModel200Response**](DeleteReverseEtlModel200Response.md)

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


## Operation: getReverseETLSyncStatus

> GetReverseETLSyncStatus200Response getReverseETLSyncStatus(modelId, syncId)

Get Reverse ETL Sync Status

Get the sync status for a Reverse ETL sync.  The sync status includes all detailed information about the sync - sync status, duration, details about the extract and load phase if applicable, etc.   The rate limit for this endpoint is 250 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ReverseEtlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ReverseEtlApi apiInstance = new ReverseEtlApi(defaultClient);
        String modelId = "modelId"; // String | 
        String syncId = "syncId"; // String | 
        try {
            GetReverseETLSyncStatus200Response result = apiInstance.getReverseETLSyncStatus(modelId, syncId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseEtlApi#getReverseETLSyncStatus");
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
| **modelId** | **String**|  | |
| **syncId** | **String**|  | |

### Return type

[**GetReverseETLSyncStatus200Response**](GetReverseETLSyncStatus200Response.md)

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


## Operation: getReverseEtlModel

> GetReverseEtlModel200Response getReverseEtlModel(modelId)

Get Reverse Etl Model

Returns a Reverse ETL Model by its id.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ReverseEtlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ReverseEtlApi apiInstance = new ReverseEtlApi(defaultClient);
        String modelId = "dY1JLx4HgWHKUNsB76tEU"; // String | 
        try {
            GetReverseEtlModel200Response result = apiInstance.getReverseEtlModel(modelId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseEtlApi#getReverseEtlModel");
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
| **modelId** | **String**|  | |

### Return type

[**GetReverseEtlModel200Response**](GetReverseEtlModel200Response.md)

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


## Operation: listReverseETLSyncStatusesFromModelAndSubscriptionId

> ListReverseETLSyncStatusesFromModelAndSubscriptionId200Response listReverseETLSyncStatusesFromModelAndSubscriptionId(modelId, subscriptionId, pagination)

List Reverse ETL Sync Statuses from Model And Subscription Id

Get the sync statuses for a Reverse ETL mapping subscription.  The sync status includes all detailed information about the sync - sync status, duration, details about the extract and load phase if applicable, etc.  The default page count is 10, and then the next page can be fetched by passing the &#x60;cursor&#x60; query parameter.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ReverseEtlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ReverseEtlApi apiInstance = new ReverseEtlApi(defaultClient);
        String modelId = "modelId"; // String | 
        String subscriptionId = "subscriptionId"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Optional pagination params.  This parameter exists in alpha.
        try {
            ListReverseETLSyncStatusesFromModelAndSubscriptionId200Response result = apiInstance.listReverseETLSyncStatusesFromModelAndSubscriptionId(modelId, subscriptionId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseEtlApi#listReverseETLSyncStatusesFromModelAndSubscriptionId");
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
| **modelId** | **String**|  | |
| **subscriptionId** | **String**|  | |
| **pagination** | [**PaginationInput**](.md)| Optional pagination params.  This parameter exists in alpha. | [optional] |

### Return type

[**ListReverseETLSyncStatusesFromModelAndSubscriptionId200Response**](ListReverseETLSyncStatusesFromModelAndSubscriptionId200Response.md)

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


## Operation: listReverseEtlModels

> ListReverseEtlModels200Response listReverseEtlModels(pagination)

List Reverse Etl Models

Returns a list of Reverse ETL Models.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ReverseEtlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ReverseEtlApi apiInstance = new ReverseEtlApi(defaultClient);
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Defines the pagination parameters.  This parameter exists in alpha.
        try {
            ListReverseEtlModels200Response result = apiInstance.listReverseEtlModels(pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseEtlApi#listReverseEtlModels");
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
| **pagination** | [**PaginationInput**](.md)| Defines the pagination parameters.  This parameter exists in alpha. | [optional] |

### Return type

[**ListReverseEtlModels200Response**](ListReverseEtlModels200Response.md)

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


## Operation: updateReverseEtlModel

> UpdateReverseEtlModel200Response updateReverseEtlModel(modelId, updateReverseEtlModelInput)

Update Reverse Etl Model

Updates an existing Reverse ETL Model.          • When called, this endpoint may generate one or more of the following [audit trail](/tag/Audit-Trail) events:* Model Settings Saved * Model State Change Toggled       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ReverseEtlApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ReverseEtlApi apiInstance = new ReverseEtlApi(defaultClient);
        String modelId = "gFBTkmP2ENiu6BQRmdHBkr"; // String | 
        UpdateReverseEtlModelInput updateReverseEtlModelInput = new UpdateReverseEtlModelInput(); // UpdateReverseEtlModelInput | 
        try {
            UpdateReverseEtlModel200Response result = apiInstance.updateReverseEtlModel(modelId, updateReverseEtlModelInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReverseEtlApi#updateReverseEtlModel");
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
| **modelId** | **String**|  | |
| **updateReverseEtlModelInput** | [**UpdateReverseEtlModelInput**](UpdateReverseEtlModelInput.md)|  | |

### Return type

[**UpdateReverseEtlModel200Response**](UpdateReverseEtlModel200Response.md)

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

