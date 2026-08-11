# CredentialsApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCredential**](CredentialsApi.md#createCredential) | **POST** /credentials | Create Credential |
| [**deleteCredential**](CredentialsApi.md#deleteCredential) | **DELETE** /credentials/{credentialId} | Delete Credential |
| [**getCredential**](CredentialsApi.md#getCredential) | **GET** /credentials/{credentialId} | Get Credential |
| [**listCredentialConsumers**](CredentialsApi.md#listCredentialConsumers) | **GET** /credentials/{credentialId}/consumers | List Credential Consumers |
| [**listCredentials**](CredentialsApi.md#listCredentials) | **GET** /credentials | List Credentials |
| [**updateCredential**](CredentialsApi.md#updateCredential) | **PATCH** /credentials/{credentialId} | Update Credential |



## Operation: createCredential

> CreateCredential201Response createCredential(createCredentialV1Input)

Create Credential

Creates a new Credential.    • When called, this endpoint may generate the &#x60;Warehouse Credential Created&#x60; event in the [audit trail](/tag/Audit-Trail).    This endpoint requires the user to have at least the following permission(s):   * Workspace Owner  * Warehouse Admin  * Source Admin  * Entities Admin  * Unify and Engage Admin

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        CreateCredentialV1Input createCredentialV1Input = new CreateCredentialV1Input(); // CreateCredentialV1Input | 
        try {
            CreateCredential201Response result = apiInstance.createCredential(createCredentialV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#createCredential");
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
| **createCredentialV1Input** | [**CreateCredentialV1Input**](CreateCredentialV1Input.md)|  | |

### Return type

[**CreateCredential201Response**](CreateCredential201Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.segment.v1+json
- **Accept**: application/vnd.segment.v1+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  * Retry-After - Number of whole seconds to wait before retrying. Sent when the request was rejected because the authentication token is rate limited. Prefer this over your own backoff schedule when present. <br>  |


## Operation: deleteCredential

> DeleteCredential200Response deleteCredential(credentialId)

Delete Credential

Deletes an existing Credential. Fails with a &#x60;409 Conflict&#x60; if the Credential is still in use by a Warehouse or Source (including a disabled one). This check isn&#39;t atomic with the delete — a Warehouse or Source that attaches to this Credential in between would be orphaned rather than blocking the delete.    • When called, this endpoint may generate the &#x60;Warehouse Credential Deleted&#x60; event in the [audit trail](/tag/Audit-Trail).    This endpoint requires the user to have at least the following permission(s):   * Workspace Owner

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String credentialId = "cred_2JzKWb8FGhGVYZ3xVqQGc7NkYPl"; // String | 
        try {
            DeleteCredential200Response result = apiInstance.deleteCredential(credentialId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#deleteCredential");
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
| **credentialId** | **String**|  | |

### Return type

[**DeleteCredential200Response**](DeleteCredential200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  * Retry-After - Number of whole seconds to wait before retrying. Sent when the request was rejected because the authentication token is rate limited. Prefer this over your own backoff schedule when present. <br>  |


## Operation: getCredential

> GetCredential200Response getCredential(credentialId)

Get Credential

Returns a Credential by its id.    This endpoint requires the user to have at least the following permission(s):   * Workspace Owner  * Warehouse Admin  * Source Admin  * Entities Admin  * Unify and Engage Admin

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String credentialId = "cred_2JzKWb8FGhGVYZ3xVqQGc7NkYPl"; // String | 
        try {
            GetCredential200Response result = apiInstance.getCredential(credentialId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#getCredential");
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
| **credentialId** | **String**|  | |

### Return type

[**GetCredential200Response**](GetCredential200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  * Retry-After - Number of whole seconds to wait before retrying. Sent when the request was rejected because the authentication token is rate limited. Prefer this over your own backoff schedule when present. <br>  |


## Operation: listCredentialConsumers

> ListCredentialConsumers200Response listCredentialConsumers(credentialId, warehousesPagination, sourcesPagination)

List Credential Consumers

Returns the Warehouses and Sources that use a Credential.    This endpoint requires the user to have at least the following permission(s):   * Workspace Owner  * Warehouse Admin  * Source Admin  * Entities Admin  * Unify and Engage Admin

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String credentialId = "cred_2JzKWb8FGhGVYZ3xVqQGc7NkYPl"; // String | 
        PaginationInput warehousesPagination = new PaginationInput(); // PaginationInput | Defines the pagination parameters for the list of Warehouses.  This parameter exists in v1.
        PaginationInput sourcesPagination = new PaginationInput(); // PaginationInput | Defines the pagination parameters for the list of Sources.  This parameter exists in v1.
        try {
            ListCredentialConsumers200Response result = apiInstance.listCredentialConsumers(credentialId, warehousesPagination, sourcesPagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#listCredentialConsumers");
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
| **credentialId** | **String**|  | |
| **warehousesPagination** | [**PaginationInput**](.md)| Defines the pagination parameters for the list of Warehouses.  This parameter exists in v1. | [optional] |
| **sourcesPagination** | [**PaginationInput**](.md)| Defines the pagination parameters for the list of Sources.  This parameter exists in v1. | [optional] |

### Return type

[**ListCredentialConsumers200Response**](ListCredentialConsumers200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  * Retry-After - Number of whole seconds to wait before retrying. Sent when the request was rejected because the authentication token is rate limited. Prefer this over your own backoff schedule when present. <br>  |


## Operation: listCredentials

> ListCredentials200Response listCredentials(pagination)

List Credentials

Returns a list of Credentials.    This endpoint requires the user to have at least the following permission(s):   * Workspace Owner  * Warehouse Admin  * Source Admin  * Entities Admin  * Unify and Engage Admin

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Defines the pagination parameters.  This parameter exists in v1.
        try {
            ListCredentials200Response result = apiInstance.listCredentials(pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#listCredentials");
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

[**ListCredentials200Response**](ListCredentials200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  * Retry-After - Number of whole seconds to wait before retrying. Sent when the request was rejected because the authentication token is rate limited. Prefer this over your own backoff schedule when present. <br>  |


## Operation: updateCredential

> UpdateCredential200Response updateCredential(credentialId, updateCredentialV1Input)

Update Credential

Updates an existing Credential. All Warehouses using this Credential are affected immediately.    • When called, this endpoint may generate the &#x60;Warehouse Credential Modified&#x60; event in the [audit trail](/tag/Audit-Trail).    This endpoint requires the user to have at least the following permission(s):   * Workspace Owner

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.CredentialsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        CredentialsApi apiInstance = new CredentialsApi(defaultClient);
        String credentialId = "cred_2JzKWb8FGhGVYZ3xVqQGc7NkYPl"; // String | 
        UpdateCredentialV1Input updateCredentialV1Input = new UpdateCredentialV1Input(); // UpdateCredentialV1Input | 
        try {
            UpdateCredential200Response result = apiInstance.updateCredential(credentialId, updateCredentialV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CredentialsApi#updateCredential");
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
| **credentialId** | **String**|  | |
| **updateCredentialV1Input** | [**UpdateCredentialV1Input**](UpdateCredentialV1Input.md)|  | |

### Return type

[**UpdateCredential200Response**](UpdateCredential200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.segment.v1+json
- **Accept**: application/vnd.segment.v1+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  * Retry-After - Number of whole seconds to wait before retrying. Sent when the request was rejected because the authentication token is rate limited. Prefer this over your own backoff schedule when present. <br>  |

