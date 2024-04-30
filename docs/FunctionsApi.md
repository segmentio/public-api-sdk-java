# FunctionsApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFunction**](FunctionsApi.md#createFunction) | **POST** /functions | Create Function |
| [**createFunctionDeployment**](FunctionsApi.md#createFunctionDeployment) | **POST** /functions/{functionId}/deploy | Create Function Deployment |
| [**createInsertFunctionInstance**](FunctionsApi.md#createInsertFunctionInstance) | **POST** /insert-function-instances | Create Insert Function Instance |
| [**deleteFunction**](FunctionsApi.md#deleteFunction) | **DELETE** /functions/{functionId} | Delete Function |
| [**deleteInsertFunctionInstance**](FunctionsApi.md#deleteInsertFunctionInstance) | **DELETE** /insert-function-instances/{instanceId} | Delete Insert Function Instance |
| [**getFunction**](FunctionsApi.md#getFunction) | **GET** /functions/{functionId} | Get Function |
| [**getFunctionVersion**](FunctionsApi.md#getFunctionVersion) | **GET** /functions/{functionId}/versions/{versionId} | Get Function Version |
| [**getInsertFunctionInstance**](FunctionsApi.md#getInsertFunctionInstance) | **GET** /insert-function-instances/{instanceId} | Get Insert Function Instance |
| [**listFunctionVersions**](FunctionsApi.md#listFunctionVersions) | **GET** /functions/{functionId}/versions | List Function Versions |
| [**listFunctions**](FunctionsApi.md#listFunctions) | **GET** /functions | List Functions |
| [**listInsertFunctionInstances**](FunctionsApi.md#listInsertFunctionInstances) | **GET** /insert-function-instances | List Insert Function Instances |
| [**restoreFunctionVersion**](FunctionsApi.md#restoreFunctionVersion) | **POST** /functions/{functionId}/versions | Restore Function Version |
| [**updateFunction**](FunctionsApi.md#updateFunction) | **PATCH** /functions/{functionId} | Update Function |
| [**updateInsertFunctionInstance**](FunctionsApi.md#updateInsertFunctionInstance) | **PATCH** /insert-function-instances/{instanceId} | Update Insert Function Instance |



## Operation: createFunction

> CreateFunction200Response createFunction(createFunctionV1Input)

Create Function

Creates a Function.    • In order to successfully call this endpoint, the specified Workspace needs to have the Functions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FunctionsApi apiInstance = new FunctionsApi(defaultClient);
        CreateFunctionV1Input createFunctionV1Input = new CreateFunctionV1Input(); // CreateFunctionV1Input | 
        try {
            CreateFunction200Response result = apiInstance.createFunction(createFunctionV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunctionsApi#createFunction");
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
| **createFunctionV1Input** | [**CreateFunctionV1Input**](CreateFunctionV1Input.md)|  | |

### Return type

[**CreateFunction200Response**](CreateFunction200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.segment.v1+json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: createFunctionDeployment

> CreateFunctionDeployment200Response createFunctionDeployment(functionId)

Create Function Deployment

Deploys a Function. Only applicable to Source Function instances.    • In order to successfully call this endpoint, the specified Workspace needs to have the Functions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FunctionsApi apiInstance = new FunctionsApi(defaultClient);
        String functionId = "sfn_rh5BDZp6QDHvXFCkibm1pR"; // String | 
        try {
            CreateFunctionDeployment200Response result = apiInstance.createFunctionDeployment(functionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunctionsApi#createFunctionDeployment");
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
| **functionId** | **String**|  | |

### Return type

[**CreateFunctionDeployment200Response**](CreateFunctionDeployment200Response.md)

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


## Operation: createInsertFunctionInstance

> CreateInsertFunctionInstance200Response createInsertFunctionInstance(createInsertFunctionInstanceAlphaInput)

Create Insert Function Instance

Creates an insert Function instance connected to the given Destination.    • In order to successfully call this endpoint, the specified Workspace needs to have the Functions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FunctionsApi apiInstance = new FunctionsApi(defaultClient);
        CreateInsertFunctionInstanceAlphaInput createInsertFunctionInstanceAlphaInput = new CreateInsertFunctionInstanceAlphaInput(); // CreateInsertFunctionInstanceAlphaInput | 
        try {
            CreateInsertFunctionInstance200Response result = apiInstance.createInsertFunctionInstance(createInsertFunctionInstanceAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunctionsApi#createInsertFunctionInstance");
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
| **createInsertFunctionInstanceAlphaInput** | [**CreateInsertFunctionInstanceAlphaInput**](CreateInsertFunctionInstanceAlphaInput.md)|  | |

### Return type

[**CreateInsertFunctionInstance200Response**](CreateInsertFunctionInstance200Response.md)

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


## Operation: deleteFunction

> DeleteFunction200Response deleteFunction(functionId)

Delete Function

Deletes a Function.    • In order to successfully call this endpoint, the specified Workspace needs to have the Functions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FunctionsApi apiInstance = new FunctionsApi(defaultClient);
        String functionId = "sfnc_wXzcDGFR3KmjLDrtSawNHf"; // String | 
        try {
            DeleteFunction200Response result = apiInstance.deleteFunction(functionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunctionsApi#deleteFunction");
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
| **functionId** | **String**|  | |

### Return type

[**DeleteFunction200Response**](DeleteFunction200Response.md)

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


## Operation: deleteInsertFunctionInstance

> DeleteInsertFunctionInstance200Response deleteInsertFunctionInstance(instanceId)

Delete Insert Function Instance

Deletes an insert Function instance.    • In order to successfully call this endpoint, the specified Workspace needs to have the Functions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FunctionsApi apiInstance = new FunctionsApi(defaultClient);
        String instanceId = "65c2bdbdde6f2d8297f943da"; // String | 
        try {
            DeleteInsertFunctionInstance200Response result = apiInstance.deleteInsertFunctionInstance(instanceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunctionsApi#deleteInsertFunctionInstance");
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
| **instanceId** | **String**|  | |

### Return type

[**DeleteInsertFunctionInstance200Response**](DeleteInsertFunctionInstance200Response.md)

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


## Operation: getFunction

> GetFunction200Response getFunction(functionId)

Get Function

Gets a Function.    • In order to successfully call this endpoint, the specified Workspace needs to have the Functions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FunctionsApi apiInstance = new FunctionsApi(defaultClient);
        String functionId = "sfnc_wXzcDGFR3KmjLDrtSawNHf"; // String | 
        try {
            GetFunction200Response result = apiInstance.getFunction(functionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunctionsApi#getFunction");
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
| **functionId** | **String**|  | |

### Return type

[**GetFunction200Response**](GetFunction200Response.md)

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


## Operation: getFunctionVersion

> GetFunctionVersion200Response getFunctionVersion(functionId, versionId)

Get Function Version

Gets a Function version.    • In order to successfully call this endpoint, the specified Workspace needs to have the Functions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FunctionsApi apiInstance = new FunctionsApi(defaultClient);
        String functionId = "sfnc_wXzcDGFR3KmjLDrtSawNHf"; // String | 
        String versionId = "2Ma03fahSqLoEzQfV5o2aSfVEHs"; // String | 
        try {
            GetFunctionVersion200Response result = apiInstance.getFunctionVersion(functionId, versionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunctionsApi#getFunctionVersion");
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
| **functionId** | **String**|  | |
| **versionId** | **String**|  | |

### Return type

[**GetFunctionVersion200Response**](GetFunctionVersion200Response.md)

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


## Operation: getInsertFunctionInstance

> GetInsertFunctionInstance200Response getInsertFunctionInstance(instanceId)

Get Insert Function Instance

Gets an insert Function instance.    • In order to successfully call this endpoint, the specified Workspace needs to have the Functions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FunctionsApi apiInstance = new FunctionsApi(defaultClient);
        String instanceId = "65c2bdbcde6f2d8297f943d7"; // String | 
        try {
            GetInsertFunctionInstance200Response result = apiInstance.getInsertFunctionInstance(instanceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunctionsApi#getInsertFunctionInstance");
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
| **instanceId** | **String**|  | |

### Return type

[**GetInsertFunctionInstance200Response**](GetInsertFunctionInstance200Response.md)

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


## Operation: listFunctionVersions

> ListFunctionVersions200Response listFunctionVersions(functionId, pagination)

List Function Versions

Lists versions for a Function in a Workspace.    • In order to successfully call this endpoint, the specified Workspace needs to have the Functions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FunctionsApi apiInstance = new FunctionsApi(defaultClient);
        String functionId = "sfnc_wXzcDGFR3KmjLDrtSawNHf"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination parameters.  This parameter exists in alpha.
        try {
            ListFunctionVersions200Response result = apiInstance.listFunctionVersions(functionId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunctionsApi#listFunctionVersions");
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
| **functionId** | **String**|  | |
| **pagination** | [**PaginationInput**](.md)| Pagination parameters.  This parameter exists in alpha. | |

### Return type

[**ListFunctionVersions200Response**](ListFunctionVersions200Response.md)

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


## Operation: listFunctions

> ListFunctions200Response listFunctions(pagination, resourceType)

List Functions

Lists all Functions in a Workspace.    • In order to successfully call this endpoint, the specified Workspace needs to have the Functions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FunctionsApi apiInstance = new FunctionsApi(defaultClient);
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination parameters.  This parameter exists in v1.
        String resourceType = "DESTINATION"; // String | The Function type.  Config API note: equal to `type`.  This parameter exists in v1.
        try {
            ListFunctions200Response result = apiInstance.listFunctions(pagination, resourceType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunctionsApi#listFunctions");
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
| **pagination** | [**PaginationInput**](.md)| Pagination parameters.  This parameter exists in v1. | |
| **resourceType** | **String**| The Function type.  Config API note: equal to &#x60;type&#x60;.  This parameter exists in v1. | [enum: DESTINATION, INSERT_DESTINATION, INSERT_SOURCE, SOURCE] |

### Return type

[**ListFunctions200Response**](ListFunctions200Response.md)

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


## Operation: listInsertFunctionInstances

> ListInsertFunctionInstances200Response listInsertFunctionInstances(pagination, functionId)

List Insert Function Instances

Lists all insert Function instances connected to the given insert Function.    • In order to successfully call this endpoint, the specified Workspace needs to have the Functions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FunctionsApi apiInstance = new FunctionsApi(defaultClient);
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination parameters.  This parameter exists in alpha.
        String functionId = "76365637324e715a67535831"; // String | The insert Function class id to lookup.  This parameter exists in alpha.
        try {
            ListInsertFunctionInstances200Response result = apiInstance.listInsertFunctionInstances(pagination, functionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunctionsApi#listInsertFunctionInstances");
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
| **pagination** | [**PaginationInput**](.md)| Pagination parameters.  This parameter exists in alpha. | |
| **functionId** | **String**| The insert Function class id to lookup.  This parameter exists in alpha. | |

### Return type

[**ListInsertFunctionInstances200Response**](ListInsertFunctionInstances200Response.md)

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


## Operation: restoreFunctionVersion

> RestoreFunctionVersion200Response restoreFunctionVersion(functionId, restoreFunctionVersionAlphaInput)

Restore Function Version

Restore an old Function version as the latest version.    • In order to successfully call this endpoint, the specified Workspace needs to have the Functions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FunctionsApi apiInstance = new FunctionsApi(defaultClient);
        String functionId = "sfnc_wXzcDGFR3KmjLDrtSawNHf"; // String | 
        RestoreFunctionVersionAlphaInput restoreFunctionVersionAlphaInput = new RestoreFunctionVersionAlphaInput(); // RestoreFunctionVersionAlphaInput | 
        try {
            RestoreFunctionVersion200Response result = apiInstance.restoreFunctionVersion(functionId, restoreFunctionVersionAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunctionsApi#restoreFunctionVersion");
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
| **functionId** | **String**|  | |
| **restoreFunctionVersionAlphaInput** | [**RestoreFunctionVersionAlphaInput**](RestoreFunctionVersionAlphaInput.md)|  | |

### Return type

[**RestoreFunctionVersion200Response**](RestoreFunctionVersion200Response.md)

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


## Operation: updateFunction

> UpdateFunction200Response updateFunction(functionId, updateFunctionV1Input)

Update Function

Updates a Function.    • In order to successfully call this endpoint, the specified Workspace needs to have the Functions feature enabled. Please reach out to your customer success manager for more information.  Config API omitted fields: - &#x60;updateMask&#x60; 

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FunctionsApi apiInstance = new FunctionsApi(defaultClient);
        String functionId = "sfnc_wXzcDGFR3KmjLDrtSawNHf"; // String | 
        UpdateFunctionV1Input updateFunctionV1Input = new UpdateFunctionV1Input(); // UpdateFunctionV1Input | 
        try {
            UpdateFunction200Response result = apiInstance.updateFunction(functionId, updateFunctionV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunctionsApi#updateFunction");
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
| **functionId** | **String**|  | |
| **updateFunctionV1Input** | [**UpdateFunctionV1Input**](UpdateFunctionV1Input.md)|  | |

### Return type

[**UpdateFunction200Response**](UpdateFunction200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.segment.v1+json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: updateInsertFunctionInstance

> UpdateInsertFunctionInstance200Response updateInsertFunctionInstance(instanceId, updateInsertFunctionInstanceAlphaInput)

Update Insert Function Instance

Updates an insert Function instance connected to the given Destination.    • In order to successfully call this endpoint, the specified Workspace needs to have the Functions feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.FunctionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        FunctionsApi apiInstance = new FunctionsApi(defaultClient);
        String instanceId = "65c2bdbcde6f2d8297f943d8"; // String | 
        UpdateInsertFunctionInstanceAlphaInput updateInsertFunctionInstanceAlphaInput = new UpdateInsertFunctionInstanceAlphaInput(); // UpdateInsertFunctionInstanceAlphaInput | 
        try {
            UpdateInsertFunctionInstance200Response result = apiInstance.updateInsertFunctionInstance(instanceId, updateInsertFunctionInstanceAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FunctionsApi#updateInsertFunctionInstance");
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
| **instanceId** | **String**|  | |
| **updateInsertFunctionInstanceAlphaInput** | [**UpdateInsertFunctionInstanceAlphaInput**](UpdateInsertFunctionInstanceAlphaInput.md)|  | |

### Return type

[**UpdateInsertFunctionInstance200Response**](UpdateInsertFunctionInstance200Response.md)

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

