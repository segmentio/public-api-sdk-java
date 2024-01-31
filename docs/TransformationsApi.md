# TransformationsApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTransformation**](TransformationsApi.md#createTransformation) | **POST** /transformations | Create Transformation |
| [**deleteTransformation**](TransformationsApi.md#deleteTransformation) | **DELETE** /transformations/{transformationId} | Delete Transformation |
| [**getTransformation**](TransformationsApi.md#getTransformation) | **GET** /transformations/{transformationId} | Get Transformation |
| [**listTransformations**](TransformationsApi.md#listTransformations) | **GET** /transformations | List Transformations |
| [**updateTransformation**](TransformationsApi.md#updateTransformation) | **PATCH** /transformations/{transformationId} | Update Transformation |



## Operation: createTransformation

> CreateTransformation200Response createTransformation(createTransformationV1Input)

Create Transformation

Creates a new Transformation.    • When called, this endpoint may generate the &#x60;Transformation Created&#x60; event in the [audit trail](/tag/Audit-Trail).   • In order to successfully call this endpoint, the specified Workspace needs to have the Protocols feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.TransformationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        TransformationsApi apiInstance = new TransformationsApi(defaultClient);
        CreateTransformationV1Input createTransformationV1Input = new CreateTransformationV1Input(); // CreateTransformationV1Input | 
        try {
            CreateTransformation200Response result = apiInstance.createTransformation(createTransformationV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformationsApi#createTransformation");
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
| **createTransformationV1Input** | [**CreateTransformationV1Input**](CreateTransformationV1Input.md)|  | |

### Return type

[**CreateTransformation200Response**](CreateTransformation200Response.md)

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


## Operation: deleteTransformation

> DeleteTransformation200Response deleteTransformation(transformationId)

Delete Transformation

Deletes a Transformation.    • When called, this endpoint may generate the &#x60;Transformation Deleted&#x60; event in the [audit trail](/tag/Audit-Trail).   • In order to successfully call this endpoint, the specified Workspace needs to have the Protocols feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.TransformationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        TransformationsApi apiInstance = new TransformationsApi(defaultClient);
        String transformationId = "2NhipGGSZWdzI7YrXHELB7pVXqR"; // String | 
        try {
            DeleteTransformation200Response result = apiInstance.deleteTransformation(transformationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformationsApi#deleteTransformation");
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
| **transformationId** | **String**|  | |

### Return type

[**DeleteTransformation200Response**](DeleteTransformation200Response.md)

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


## Operation: getTransformation

> GetTransformation200Response getTransformation(transformationId)

Get Transformation

Gets a Transformation.    • In order to successfully call this endpoint, the specified Workspace needs to have the Protocols feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.TransformationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        TransformationsApi apiInstance = new TransformationsApi(defaultClient);
        String transformationId = "pHrD51Ds35Zjfka84yXQE6"; // String | 
        try {
            GetTransformation200Response result = apiInstance.getTransformation(transformationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformationsApi#getTransformation");
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
| **transformationId** | **String**|  | |

### Return type

[**GetTransformation200Response**](GetTransformation200Response.md)

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


## Operation: listTransformations

> ListTransformations200Response listTransformations(pagination)

List Transformations

Lists all Transformations in the Workspace.    • In order to successfully call this endpoint, the specified Workspace needs to have the Protocols feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.TransformationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        TransformationsApi apiInstance = new TransformationsApi(defaultClient);
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination options.  This parameter exists in v1.
        try {
            ListTransformations200Response result = apiInstance.listTransformations(pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformationsApi#listTransformations");
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
| **pagination** | [**PaginationInput**](.md)| Pagination options.  This parameter exists in v1. | |

### Return type

[**ListTransformations200Response**](ListTransformations200Response.md)

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


## Operation: updateTransformation

> UpdateTransformation200Response updateTransformation(transformationId, updateTransformationV1Input)

Update Transformation

Updates an existing Transformation.    • When called, this endpoint may generate the &#x60;Transformation Updated&#x60; event in the [audit trail](/tag/Audit-Trail).   • In order to successfully call this endpoint, the specified Workspace needs to have the Protocols feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.TransformationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        TransformationsApi apiInstance = new TransformationsApi(defaultClient);
        String transformationId = "pHrD51Ds35Zjfka84yXQE6"; // String | 
        UpdateTransformationV1Input updateTransformationV1Input = new UpdateTransformationV1Input(); // UpdateTransformationV1Input | 
        try {
            UpdateTransformation200Response result = apiInstance.updateTransformation(transformationId, updateTransformationV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TransformationsApi#updateTransformation");
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
| **transformationId** | **String**|  | |
| **updateTransformationV1Input** | [**UpdateTransformationV1Input**](UpdateTransformationV1Input.md)|  | |

### Return type

[**UpdateTransformation200Response**](UpdateTransformation200Response.md)

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

