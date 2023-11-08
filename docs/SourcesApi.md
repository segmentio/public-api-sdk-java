# SourcesApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addLabelsToSource**](SourcesApi.md#addLabelsToSource) | **POST** /sources/{sourceId}/labels | Add Labels to Source |
| [**createSource**](SourcesApi.md#createSource) | **POST** /sources | Create Source |
| [**deleteSource**](SourcesApi.md#deleteSource) | **DELETE** /sources/{sourceId} | Delete Source |
| [**getSource**](SourcesApi.md#getSource) | **GET** /sources/{sourceId} | Get Source |
| [**listConnectedDestinationsFromSource**](SourcesApi.md#listConnectedDestinationsFromSource) | **GET** /sources/{sourceId}/connected-destinations | List Connected Destinations from Source |
| [**listConnectedWarehousesFromSource**](SourcesApi.md#listConnectedWarehousesFromSource) | **GET** /sources/{sourceId}/connected-warehouses | List Connected Warehouses from Source |
| [**listSchemaSettingsInSource**](SourcesApi.md#listSchemaSettingsInSource) | **GET** /sources/{sourceId}/settings | List Schema Settings in Source |
| [**listSources**](SourcesApi.md#listSources) | **GET** /sources | List Sources |
| [**replaceLabelsInSource**](SourcesApi.md#replaceLabelsInSource) | **PUT** /sources/{sourceId}/labels | Replace Labels in Source |
| [**updateSchemaSettingsInSource**](SourcesApi.md#updateSchemaSettingsInSource) | **PATCH** /sources/{sourceId}/settings | Update Schema Settings in Source |
| [**updateSource**](SourcesApi.md#updateSource) | **PATCH** /sources/{sourceId} | Update Source |



## Operation: addLabelsToSource

> AddLabelsToSource200Response addLabelsToSource(sourceId, addLabelsToSourceV1Input)

Add Labels to Source

Adds an existing label to a Source.    • When called, this endpoint may generate the &#x60;Source Modified&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SourcesApi apiInstance = new SourcesApi(defaultClient);
        String sourceId = "rh5BDZp6QDHvXFCkibm1pR"; // String | 
        AddLabelsToSourceV1Input addLabelsToSourceV1Input = new AddLabelsToSourceV1Input(); // AddLabelsToSourceV1Input | 
        try {
            AddLabelsToSource200Response result = apiInstance.addLabelsToSource(sourceId, addLabelsToSourceV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourcesApi#addLabelsToSource");
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
| **addLabelsToSourceV1Input** | [**AddLabelsToSourceV1Input**](AddLabelsToSourceV1Input.md)|  | |

### Return type

[**AddLabelsToSource200Response**](AddLabelsToSource200Response.md)

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


## Operation: createSource

> CreateSource200Response createSource(createSourceV1Input)

Create Source

Creates a new Source.    • When called, this endpoint may generate the &#x60;Source Created&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SourcesApi apiInstance = new SourcesApi(defaultClient);
        CreateSourceV1Input createSourceV1Input = new CreateSourceV1Input(); // CreateSourceV1Input | 
        try {
            CreateSource200Response result = apiInstance.createSource(createSourceV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourcesApi#createSource");
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
| **createSourceV1Input** | [**CreateSourceV1Input**](CreateSourceV1Input.md)|  | |

### Return type

[**CreateSource200Response**](CreateSource200Response.md)

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


## Operation: deleteSource

> DeleteSource200Response deleteSource(sourceId)

Delete Source

Deletes an existing Source.    • When called, this endpoint may generate the &#x60;Source Deleted&#x60; event in the [audit trail](/tag/Audit-Trail).       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SourcesApi apiInstance = new SourcesApi(defaultClient);
        String sourceId = "48EFjyXH4zdbKWx4vKiLuE"; // String | 
        try {
            DeleteSource200Response result = apiInstance.deleteSource(sourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourcesApi#deleteSource");
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

[**DeleteSource200Response**](DeleteSource200Response.md)

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


## Operation: getSource

> GetSource200Response getSource(sourceId)

Get Source

Returns a Source by its id.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SourcesApi apiInstance = new SourcesApi(defaultClient);
        String sourceId = "qQEHquLrjRDN9j1ByrChyn"; // String | 
        try {
            GetSource200Response result = apiInstance.getSource(sourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourcesApi#getSource");
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

[**GetSource200Response**](GetSource200Response.md)

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


## Operation: listConnectedDestinationsFromSource

> ListConnectedDestinationsFromSource200Response listConnectedDestinationsFromSource(sourceId, pagination)

List Connected Destinations from Source

Returns a list of Destinations connected to a Source.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SourcesApi apiInstance = new SourcesApi(defaultClient);
        String sourceId = "qQEHquLrjRDN9j1ByrChyn"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Required pagination params for the request.  This parameter exists in alpha.
        try {
            ListConnectedDestinationsFromSource200Response result = apiInstance.listConnectedDestinationsFromSource(sourceId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourcesApi#listConnectedDestinationsFromSource");
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
| **pagination** | [**PaginationInput**](.md)| Required pagination params for the request.  This parameter exists in alpha. | |

### Return type

[**ListConnectedDestinationsFromSource200Response**](ListConnectedDestinationsFromSource200Response.md)

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


## Operation: listConnectedWarehousesFromSource

> ListConnectedWarehousesFromSource200Response listConnectedWarehousesFromSource(sourceId, pagination)

List Connected Warehouses from Source

Returns a list of Warehouses connected to a Source.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SourcesApi apiInstance = new SourcesApi(defaultClient);
        String sourceId = "qQEHquLrjRDN9j1ByrChyn"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Required pagination params for the request.  This parameter exists in alpha.
        try {
            ListConnectedWarehousesFromSource200Response result = apiInstance.listConnectedWarehousesFromSource(sourceId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourcesApi#listConnectedWarehousesFromSource");
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
| **pagination** | [**PaginationInput**](.md)| Required pagination params for the request.  This parameter exists in alpha. | |

### Return type

[**ListConnectedWarehousesFromSource200Response**](ListConnectedWarehousesFromSource200Response.md)

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


## Operation: listSchemaSettingsInSource

> ListSchemaSettingsInSource200Response listSchemaSettingsInSource(sourceId)

List Schema Settings in Source

Retrieves the schema configuration settings for a Source. If Protocols is not enabled for the Source, the configurations specific to Protocols will have default values.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SourcesApi apiInstance = new SourcesApi(defaultClient);
        String sourceId = "qQEHquLrjRDN9j1ByrChyn"; // String | 
        try {
            ListSchemaSettingsInSource200Response result = apiInstance.listSchemaSettingsInSource(sourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourcesApi#listSchemaSettingsInSource");
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

[**ListSchemaSettingsInSource200Response**](ListSchemaSettingsInSource200Response.md)

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


## Operation: listSources

> ListSources200Response listSources(pagination)

List Sources

Returns a list of Sources.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SourcesApi apiInstance = new SourcesApi(defaultClient);
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Defines the pagination parameters.  This parameter exists in alpha.
        try {
            ListSources200Response result = apiInstance.listSources(pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourcesApi#listSources");
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
| **pagination** | [**PaginationInput**](.md)| Defines the pagination parameters.  This parameter exists in alpha. | |

### Return type

[**ListSources200Response**](ListSources200Response.md)

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


## Operation: replaceLabelsInSource

> ReplaceLabelsInSource200Response replaceLabelsInSource(sourceId, replaceLabelsInSourceV1Input)

Replace Labels in Source

Replaces all labels in a Source.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SourcesApi apiInstance = new SourcesApi(defaultClient);
        String sourceId = "rh5BDZp6QDHvXFCkibm1pR"; // String | 
        ReplaceLabelsInSourceV1Input replaceLabelsInSourceV1Input = new ReplaceLabelsInSourceV1Input(); // ReplaceLabelsInSourceV1Input | 
        try {
            ReplaceLabelsInSource200Response result = apiInstance.replaceLabelsInSource(sourceId, replaceLabelsInSourceV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourcesApi#replaceLabelsInSource");
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
| **replaceLabelsInSourceV1Input** | [**ReplaceLabelsInSourceV1Input**](ReplaceLabelsInSourceV1Input.md)|  | |

### Return type

[**ReplaceLabelsInSource200Response**](ReplaceLabelsInSource200Response.md)

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


## Operation: updateSchemaSettingsInSource

> UpdateSchemaSettingsInSource200Response updateSchemaSettingsInSource(sourceId, updateSchemaSettingsInSourceV1Input)

Update Schema Settings in Source

Updates the schema configuration for a Source. If Protocols is not enabled for the Source, any updates to Protocols-specific configurations will not be applied.        Config API omitted fields: - &#x60;updateMask&#x60;       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SourcesApi apiInstance = new SourcesApi(defaultClient);
        String sourceId = "qQEHquLrjRDN9j1ByrChyn"; // String | 
        UpdateSchemaSettingsInSourceV1Input updateSchemaSettingsInSourceV1Input = new UpdateSchemaSettingsInSourceV1Input(); // UpdateSchemaSettingsInSourceV1Input | 
        try {
            UpdateSchemaSettingsInSource200Response result = apiInstance.updateSchemaSettingsInSource(sourceId, updateSchemaSettingsInSourceV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourcesApi#updateSchemaSettingsInSource");
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
| **updateSchemaSettingsInSourceV1Input** | [**UpdateSchemaSettingsInSourceV1Input**](UpdateSchemaSettingsInSourceV1Input.md)|  | |

### Return type

[**UpdateSchemaSettingsInSource200Response**](UpdateSchemaSettingsInSource200Response.md)

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


## Operation: updateSource

> UpdateSource200Response updateSource(sourceId, updateSourceV1Input)

Update Source

Updates an existing Source.    • When called, this endpoint may generate one or more of the following [audit trail](/tag/Audit-Trail) events:* Source Modified * Source Enabled * Source Settings Modified * Source Disabled  Config API omitted fields: - &#x60;updateMask&#x60; 

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SourcesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SourcesApi apiInstance = new SourcesApi(defaultClient);
        String sourceId = "piTVHEYNrRgBMM1uQGCPbK"; // String | 
        UpdateSourceV1Input updateSourceV1Input = new UpdateSourceV1Input(); // UpdateSourceV1Input | 
        try {
            UpdateSource200Response result = apiInstance.updateSource(sourceId, updateSourceV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SourcesApi#updateSource");
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
| **updateSourceV1Input** | [**UpdateSourceV1Input**](UpdateSourceV1Input.md)|  | |

### Return type

[**UpdateSource200Response**](UpdateSource200Response.md)

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

