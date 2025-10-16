# DeletionAndSuppressionApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCloudSourceRegulation**](DeletionAndSuppressionApi.md#createCloudSourceRegulation) | **POST** /regulations/cloudsources/{sourceId} | Create Cloud Source Regulation |
| [**createSourceRegulation**](DeletionAndSuppressionApi.md#createSourceRegulation) | **POST** /regulations/sources/{sourceId} | Create Source Regulation |
| [**createWorkspaceRegulation**](DeletionAndSuppressionApi.md#createWorkspaceRegulation) | **POST** /regulations | Create Workspace Regulation |
| [**deleteRegulation**](DeletionAndSuppressionApi.md#deleteRegulation) | **DELETE** /regulations/{regulateId} | Delete Regulation |
| [**getRegulation**](DeletionAndSuppressionApi.md#getRegulation) | **GET** /regulations/{regulateId} | Get Regulation |
| [**listRegulationsFromSource**](DeletionAndSuppressionApi.md#listRegulationsFromSource) | **GET** /regulations/sources/{sourceId} | List Regulations from Source |
| [**listSuppressions**](DeletionAndSuppressionApi.md#listSuppressions) | **GET** /suppressions | List Suppressions |
| [**listWorkspaceRegulations**](DeletionAndSuppressionApi.md#listWorkspaceRegulations) | **GET** /regulations | List Workspace Regulations |



## Operation: createCloudSourceRegulation

> CreateCloudSourceRegulation200Response createCloudSourceRegulation(sourceId, createCloudSourceRegulationV1Input)

Create Cloud Source Regulation

Creates a Source-scoped regulation.    Please Note: Suppression rules at the Workspace level take precedence over those at the Source level. If a user has been suppressed at the Workspace level, any attempt to un-suppress at the Source level is not supported and the processing of the request will fail in Segment    Config API omitted fields: - &#x60;attributes&#x60;, - &#x60;userAgent&#x60;  Rate limit headers (tracked separately for internal vs external regulation types): - X-Regulation-RateLimit-Remaining: Remaining requests for the regulation type category (stringified integer)   - Internal types: DELETE_INTERNAL, SUPPRESS_WITH_DELETE_INTERNAL, SUPPRESS_ONLY, UNSUPPRESS, DELETE_ARCHIVE_ONLY   - External types: DELETE_ONLY, SUPPRESS_WITH_DELETE - X-Regulation-RateLimit-Quota-Reset: ISO 8601 timestamp for when the quota resets (e.g., 2024-12-31T23:59:59.000Z)   

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DeletionAndSuppressionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DeletionAndSuppressionApi apiInstance = new DeletionAndSuppressionApi(defaultClient);
        String sourceId = "qQEHquLrjRDN9j1ByrChyn"; // String | 
        CreateCloudSourceRegulationV1Input createCloudSourceRegulationV1Input = new CreateCloudSourceRegulationV1Input(); // CreateCloudSourceRegulationV1Input | 
        try {
            CreateCloudSourceRegulation200Response result = apiInstance.createCloudSourceRegulation(sourceId, createCloudSourceRegulationV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeletionAndSuppressionApi#createCloudSourceRegulation");
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
| **createCloudSourceRegulationV1Input** | [**CreateCloudSourceRegulationV1Input**](CreateCloudSourceRegulationV1Input.md)|  | |

### Return type

[**CreateCloudSourceRegulation200Response**](CreateCloudSourceRegulation200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.segment.v1+json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Regulation-RateLimit-Remaining - Remaining requests in the current period <br>  * X-Regulation-RateLimit-Quota-Reset - ISO 8601 timestamp for when the quota resets <br>  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: createSourceRegulation

> CreateSourceRegulation200Response createSourceRegulation(sourceId, createSourceRegulationV1Input)

Create Source Regulation

Creates a Source-scoped regulation.    Please Note: Suppression rules at the Workspace level take precedence over those at the Source level. If a user has been suppressed at the Workspace level, any attempt to un-suppress at the Source level is not supported and the processing of the request will fail in Segment    • When called, this endpoint may generate the &#x60;Source Regulation Created&#x60; event in the [audit trail](/tag/Audit-Trail).  Config API omitted fields: - &#x60;attributes&#x60;, - &#x60;userAgent&#x60;  Rate limit headers (tracked separately for internal vs external regulation types): - X-Regulation-RateLimit-Remaining: Remaining requests for the regulation type category (stringified integer)   - Internal types: DELETE_INTERNAL, SUPPRESS_WITH_DELETE_INTERNAL, SUPPRESS_ONLY, UNSUPPRESS, DELETE_ARCHIVE_ONLY   - External types: DELETE_ONLY, SUPPRESS_WITH_DELETE - X-Regulation-RateLimit-Quota-Reset: ISO 8601 timestamp for when the quota resets (e.g., 2024-12-31T23:59:59.000Z)   

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DeletionAndSuppressionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DeletionAndSuppressionApi apiInstance = new DeletionAndSuppressionApi(defaultClient);
        String sourceId = "qQEHquLrjRDN9j1ByrChyn"; // String | 
        CreateSourceRegulationV1Input createSourceRegulationV1Input = new CreateSourceRegulationV1Input(); // CreateSourceRegulationV1Input | 
        try {
            CreateSourceRegulation200Response result = apiInstance.createSourceRegulation(sourceId, createSourceRegulationV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeletionAndSuppressionApi#createSourceRegulation");
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
| **createSourceRegulationV1Input** | [**CreateSourceRegulationV1Input**](CreateSourceRegulationV1Input.md)|  | |

### Return type

[**CreateSourceRegulation200Response**](CreateSourceRegulation200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.segment.v1+json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Regulation-RateLimit-Remaining - Remaining requests in the current period <br>  * X-Regulation-RateLimit-Quota-Reset - ISO 8601 timestamp for when the quota resets <br>  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: createWorkspaceRegulation

> CreateWorkspaceRegulation200Response createWorkspaceRegulation(createWorkspaceRegulationV1Input)

Create Workspace Regulation

Creates a Workspace-scoped regulation.    • When called, this endpoint may generate the &#x60;Workspace Regulation Created&#x60; event in the [audit trail](/tag/Audit-Trail).  Config API omitted fields: - &#x60;attributes&#x60;, - &#x60;userAgent&#x60;  Rate limit headers (tracked separately for internal vs external regulation types): - X-Regulation-RateLimit-Remaining: Remaining requests for the regulation type category (stringified integer)   - Internal types: DELETE_INTERNAL, SUPPRESS_WITH_DELETE_INTERNAL, SUPPRESS_ONLY, UNSUPPRESS, DELETE_ARCHIVE_ONLY   - External types: DELETE_ONLY, SUPPRESS_WITH_DELETE - X-Regulation-RateLimit-Quota-Reset: ISO 8601 timestamp for when the quota resets (e.g., 2024-12-31T23:59:59.000Z)   

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DeletionAndSuppressionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DeletionAndSuppressionApi apiInstance = new DeletionAndSuppressionApi(defaultClient);
        CreateWorkspaceRegulationV1Input createWorkspaceRegulationV1Input = new CreateWorkspaceRegulationV1Input(); // CreateWorkspaceRegulationV1Input | 
        try {
            CreateWorkspaceRegulation200Response result = apiInstance.createWorkspaceRegulation(createWorkspaceRegulationV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeletionAndSuppressionApi#createWorkspaceRegulation");
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
| **createWorkspaceRegulationV1Input** | [**CreateWorkspaceRegulationV1Input**](CreateWorkspaceRegulationV1Input.md)|  | |

### Return type

[**CreateWorkspaceRegulation200Response**](CreateWorkspaceRegulation200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.segment.v1+json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-Regulation-RateLimit-Remaining - Remaining requests in the current period <br>  * X-Regulation-RateLimit-Quota-Reset - ISO 8601 timestamp for when the quota resets <br>  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: deleteRegulation

> DeleteRegulation200Response deleteRegulation(regulateId)

Delete Regulation

Deletes a regulation from the Workspace. The regulation must be in the initialized state to be deleted.    • When called, this endpoint may generate the &#x60;Regulation Deleted&#x60; event in the [audit trail](/tag/Audit-Trail).         **DEPRECATED**: this endpoint has been deprecated according to the guidelines, and may experience reduced SLA guarantees.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DeletionAndSuppressionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DeletionAndSuppressionApi apiInstance = new DeletionAndSuppressionApi(defaultClient);
        String regulateId = "1qJkfE1tpwvQcklImGksLN629wn"; // String | 
        try {
            DeleteRegulation200Response result = apiInstance.deleteRegulation(regulateId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeletionAndSuppressionApi#deleteRegulation");
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
| **regulateId** | **String**|  | |

### Return type

[**DeleteRegulation200Response**](DeleteRegulation200Response.md)

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


## Operation: getRegulation

> GetRegulation200Response getRegulation(regulateId)

Get Regulation

Gets a regulation from the Workspace.        Config API omitted fields: - &#x60;parent&#x60;       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DeletionAndSuppressionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DeletionAndSuppressionApi apiInstance = new DeletionAndSuppressionApi(defaultClient);
        String regulateId = "1qJkfE1tpwvQcklImGksLN629wn"; // String | 
        try {
            GetRegulation200Response result = apiInstance.getRegulation(regulateId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeletionAndSuppressionApi#getRegulation");
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
| **regulateId** | **String**|  | |

### Return type

[**GetRegulation200Response**](GetRegulation200Response.md)

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


## Operation: listRegulationsFromSource

> ListRegulationsFromSource200Response listRegulationsFromSource(sourceId, status, regulationTypes, pagination)

List Regulations from Source

Lists all Source-scoped regulations.    Please note: List regulations for Source only returns deletion requests from the past 90 days. Deletion requests older than 90 days are not retained and will result in 404 resource not found.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DeletionAndSuppressionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DeletionAndSuppressionApi apiInstance = new DeletionAndSuppressionApi(defaultClient);
        String sourceId = "qQEHquLrjRDN9j1ByrChyn"; // String | 
        String status = "FAILED"; // String | The status on which to filter returned regulations.  This parameter exists in v1.
        List<String> regulationTypes = Arrays.asList(); // List<String> | The regulation types on which to filter returned regulations.  This parameter exists in v1.
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination parameters.  This parameter exists in v1.
        try {
            ListRegulationsFromSource200Response result = apiInstance.listRegulationsFromSource(sourceId, status, regulationTypes, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeletionAndSuppressionApi#listRegulationsFromSource");
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
| **status** | **String**| The status on which to filter returned regulations.  This parameter exists in v1. | [optional] [enum: FAILED, FINISHED, INITIALIZED, INVALID, NOT_SUPPORTED, PARTIAL_SUCCESS, RUNNING] |
| **regulationTypes** | [**List&lt;String&gt;**](String.md)| The regulation types on which to filter returned regulations.  This parameter exists in v1. | [optional] [enum: DELETE_ARCHIVE_ONLY, DELETE_INTERNAL, DELETE_ONLY, SUPPRESS_ONLY, SUPPRESS_WITH_DELETE, SUPPRESS_WITH_DELETE_INTERNAL, UNSUPPRESS] |
| **pagination** | [**PaginationInput**](.md)| Pagination parameters.  This parameter exists in v1. | [optional] |

### Return type

[**ListRegulationsFromSource200Response**](ListRegulationsFromSource200Response.md)

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


## Operation: listSuppressions

> ListSuppressions200Response listSuppressions(pagination)

List Suppressions

Lists all suppressions in a given Workspace.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DeletionAndSuppressionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DeletionAndSuppressionApi apiInstance = new DeletionAndSuppressionApi(defaultClient);
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination parameters.  This parameter exists in v1.
        try {
            ListSuppressions200Response result = apiInstance.listSuppressions(pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeletionAndSuppressionApi#listSuppressions");
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
| **pagination** | [**PaginationInput**](.md)| Pagination parameters.  This parameter exists in v1. | [optional] |

### Return type

[**ListSuppressions200Response**](ListSuppressions200Response.md)

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


## Operation: listWorkspaceRegulations

> ListWorkspaceRegulations200Response listWorkspaceRegulations(status, regulationTypes, pagination)

List Workspace Regulations

Lists all Workspace-scoped regulations.    Please note: List Workspace regulations only returns deletion requests from the past 90 days. Deletion requests older than 90 days are not retained and will result in 404 resource not found.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DeletionAndSuppressionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DeletionAndSuppressionApi apiInstance = new DeletionAndSuppressionApi(defaultClient);
        String status = "FAILED"; // String | The status on which to filter the returned regulations.  This parameter exists in v1.
        List<String> regulationTypes = Arrays.asList(); // List<String> | The regulation types on which to filter returned regulations.  This parameter exists in v1.
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination parameters.  This parameter exists in v1.
        try {
            ListWorkspaceRegulations200Response result = apiInstance.listWorkspaceRegulations(status, regulationTypes, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeletionAndSuppressionApi#listWorkspaceRegulations");
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
| **status** | **String**| The status on which to filter the returned regulations.  This parameter exists in v1. | [optional] [enum: FAILED, FINISHED, INITIALIZED, INVALID, NOT_SUPPORTED, PARTIAL_SUCCESS, RUNNING] |
| **regulationTypes** | [**List&lt;String&gt;**](String.md)| The regulation types on which to filter returned regulations.  This parameter exists in v1. | [optional] [enum: DELETE_INTERNAL, DELETE_ONLY, SUPPRESS_ONLY, SUPPRESS_WITH_DELETE, SUPPRESS_WITH_DELETE_INTERNAL, UNSUPPRESS] |
| **pagination** | [**PaginationInput**](.md)| Pagination parameters.  This parameter exists in v1. | [optional] |

### Return type

[**ListWorkspaceRegulations200Response**](ListWorkspaceRegulations200Response.md)

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

