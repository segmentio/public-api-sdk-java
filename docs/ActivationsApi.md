# ActivationsApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addActivationToAudience**](ActivationsApi.md#addActivationToAudience) | **POST** /spaces/{spaceId}/audiences/{audienceId}/destination-connections/{connectionId}/activations | Add Activation to Audience |
| [**addDestinationToAudience**](ActivationsApi.md#addDestinationToAudience) | **POST** /spaces/{spaceId}/audiences/{audienceId}/destination-connections | Add Destination to Audience |
| [**getActivationFromAudience**](ActivationsApi.md#getActivationFromAudience) | **GET** /spaces/{spaceId}/audiences/{audienceId}/activations/{id} | Get Activation from Audience |
| [**listActivationsFromAudience**](ActivationsApi.md#listActivationsFromAudience) | **GET** /spaces/{spaceId}/audiences/{audienceId}/activations | List Activations from Audience |
| [**listDestinationsFromAudience**](ActivationsApi.md#listDestinationsFromAudience) | **GET** /spaces/{spaceId}/audiences/{audienceId}/destination-connections | List Destinations from Audience |
| [**listSupportedDestinationsFromAudience**](ActivationsApi.md#listSupportedDestinationsFromAudience) | **GET** /spaces/{spaceId}/audienceType/{audienceType}/supported-destinations | List Supported Destinations from Audience |
| [**removeActivationFromAudience**](ActivationsApi.md#removeActivationFromAudience) | **DELETE** /spaces/{spaceId}/audiences/{audienceId}/activations/{id} | Remove Activation from Audience |
| [**removeDestinationFromAudience**](ActivationsApi.md#removeDestinationFromAudience) | **DELETE** /spaces/{spaceId}/audiences/{audienceId}/destination-connections/{destinationId} | Remove Destination from Audience |
| [**updateActivationForAudience**](ActivationsApi.md#updateActivationForAudience) | **PATCH** /spaces/{spaceId}/audiences/{audienceId}/activations/{id} | Update Activation for Audience |



## Operation: addActivationToAudience

> AddActivationToAudience200Response addActivationToAudience(spaceId, audienceId, connectionId, addActivationToAudienceAlphaInput)

Add Activation to Audience

Creates Activation.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.  • When called, this endpoint may generate the &#x60;Activation Created&#x60; event in the [audit trail](/tag/Audit-Trail).   The rate limit for this endpoint is 50 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ActivationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ActivationsApi apiInstance = new ActivationsApi(defaultClient);
        String spaceId = "spa_9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        String audienceId = "aud_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        String connectionId = "ii_123456789"; // String | 
        AddActivationToAudienceAlphaInput addActivationToAudienceAlphaInput = new AddActivationToAudienceAlphaInput(); // AddActivationToAudienceAlphaInput | 
        try {
            AddActivationToAudience200Response result = apiInstance.addActivationToAudience(spaceId, audienceId, connectionId, addActivationToAudienceAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivationsApi#addActivationToAudience");
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
| **audienceId** | **String**|  | |
| **connectionId** | **String**|  | |
| **addActivationToAudienceAlphaInput** | [**AddActivationToAudienceAlphaInput**](AddActivationToAudienceAlphaInput.md)|  | |

### Return type

[**AddActivationToAudience200Response**](AddActivationToAudience200Response.md)

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


## Operation: addDestinationToAudience

> AddDestinationToAudience200Response addDestinationToAudience(spaceId, audienceId, addDestinationToAudienceAlphaInput)

Add Destination to Audience

Adds a Destination to an Audience.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.  • When called, this endpoint may generate the &#x60;Destination Added into Audience&#x60; event in the [audit trail](/tag/Audit-Trail).   The rate limit for this endpoint is 50 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ActivationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ActivationsApi apiInstance = new ActivationsApi(defaultClient);
        String spaceId = "spa_9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        String audienceId = "aud_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        AddDestinationToAudienceAlphaInput addDestinationToAudienceAlphaInput = new AddDestinationToAudienceAlphaInput(); // AddDestinationToAudienceAlphaInput | 
        try {
            AddDestinationToAudience200Response result = apiInstance.addDestinationToAudience(spaceId, audienceId, addDestinationToAudienceAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivationsApi#addDestinationToAudience");
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
| **audienceId** | **String**|  | |
| **addDestinationToAudienceAlphaInput** | [**AddDestinationToAudienceAlphaInput**](AddDestinationToAudienceAlphaInput.md)|  | |

### Return type

[**AddDestinationToAudience200Response**](AddDestinationToAudience200Response.md)

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


## Operation: getActivationFromAudience

> GetActivationFromAudience200Response getActivationFromAudience(spaceId, audienceId, id)

Get Activation from Audience

Gets a single Activation by id.   The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ActivationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ActivationsApi apiInstance = new ActivationsApi(defaultClient);
        String spaceId = "spa_9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        String audienceId = "aud_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        String id = "act_987654321"; // String | 
        try {
            GetActivationFromAudience200Response result = apiInstance.getActivationFromAudience(spaceId, audienceId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivationsApi#getActivationFromAudience");
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
| **audienceId** | **String**|  | |
| **id** | **String**|  | |

### Return type

[**GetActivationFromAudience200Response**](GetActivationFromAudience200Response.md)

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


## Operation: listActivationsFromAudience

> ListActivationsFromAudience200Response listActivationsFromAudience(spaceId, audienceId, pagination)

List Activations from Audience

Lists all Activations.   The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ActivationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ActivationsApi apiInstance = new ActivationsApi(defaultClient);
        String spaceId = "spa_9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        String audienceId = "aud_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Optional pagination.  This parameter exists in alpha.
        try {
            ListActivationsFromAudience200Response result = apiInstance.listActivationsFromAudience(spaceId, audienceId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivationsApi#listActivationsFromAudience");
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
| **audienceId** | **String**|  | |
| **pagination** | [**PaginationInput**](.md)| Optional pagination.  This parameter exists in alpha. | [optional] |

### Return type

[**ListActivationsFromAudience200Response**](ListActivationsFromAudience200Response.md)

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


## Operation: listDestinationsFromAudience

> ListDestinationsFromAudience200Response listDestinationsFromAudience(spaceId, audienceId, pagination)

List Destinations from Audience

Lists all Destinations from an Audience.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.  • When called, this endpoint may generate the &#x60;Destinations Listed from Audience&#x60; event in the [audit trail](/tag/Audit-Trail).   The rate limit for this endpoint is 50 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ActivationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ActivationsApi apiInstance = new ActivationsApi(defaultClient);
        String spaceId = "spa_9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        String audienceId = "aud_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Optional pagination.  This parameter exists in alpha.
        try {
            ListDestinationsFromAudience200Response result = apiInstance.listDestinationsFromAudience(spaceId, audienceId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivationsApi#listDestinationsFromAudience");
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
| **audienceId** | **String**|  | |
| **pagination** | [**PaginationInput**](.md)| Optional pagination.  This parameter exists in alpha. | [optional] |

### Return type

[**ListDestinationsFromAudience200Response**](ListDestinationsFromAudience200Response.md)

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


## Operation: listSupportedDestinationsFromAudience

> ListSupportedDestinationsFromAudience200Response listSupportedDestinationsFromAudience(spaceId, audienceType, slug, actionId)

List Supported Destinations from Audience

Lists all Supported Destinations for this audience type that can be activated.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.  • When called, this endpoint may generate the &#x60;Supported Destinations Listed For Audience&#x60; event in the [audit trail](/tag/Audit-Trail).   The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ActivationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ActivationsApi apiInstance = new ActivationsApi(defaultClient);
        String spaceId = "spa_9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        String audienceType = "USERS"; // String | 
        String slug = "slug_example"; // String | Optional destination slug to filter results.  This parameter exists in alpha.
        String actionId = "actionId_example"; // String | Optional destination action id to filter results.  This parameter exists in alpha.
        try {
            ListSupportedDestinationsFromAudience200Response result = apiInstance.listSupportedDestinationsFromAudience(spaceId, audienceType, slug, actionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivationsApi#listSupportedDestinationsFromAudience");
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
| **audienceType** | **String**|  | |
| **slug** | **String**| Optional destination slug to filter results.  This parameter exists in alpha. | [optional] |
| **actionId** | **String**| Optional destination action id to filter results.  This parameter exists in alpha. | [optional] |

### Return type

[**ListSupportedDestinationsFromAudience200Response**](ListSupportedDestinationsFromAudience200Response.md)

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


## Operation: removeActivationFromAudience

> RemoveActivationFromAudience200Response removeActivationFromAudience(spaceId, audienceId, id)

Remove Activation from Audience

Deletes an Activation.   The rate limit for this endpoint is 50 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ActivationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ActivationsApi apiInstance = new ActivationsApi(defaultClient);
        String spaceId = "spa_9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        String audienceId = "aud_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        String id = "act_987654321"; // String | 
        try {
            RemoveActivationFromAudience200Response result = apiInstance.removeActivationFromAudience(spaceId, audienceId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivationsApi#removeActivationFromAudience");
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
| **audienceId** | **String**|  | |
| **id** | **String**|  | |

### Return type

[**RemoveActivationFromAudience200Response**](RemoveActivationFromAudience200Response.md)

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


## Operation: removeDestinationFromAudience

> RemoveDestinationFromAudience200Response removeDestinationFromAudience(spaceId, audienceId, destinationId)

Remove Destination from Audience

Removes a Destination from an Audience. The Destination can only be removed if there are no activations associated with it.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.  • When called, this endpoint may generate the &#x60;Destination Removed from Audience&#x60; event in the [audit trail](/tag/Audit-Trail).

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ActivationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ActivationsApi apiInstance = new ActivationsApi(defaultClient);
        String spaceId = "spa_9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        String audienceId = "aud_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        String destinationId = "ii_123456789"; // String | 
        try {
            RemoveDestinationFromAudience200Response result = apiInstance.removeDestinationFromAudience(spaceId, audienceId, destinationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivationsApi#removeDestinationFromAudience");
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
| **audienceId** | **String**|  | |
| **destinationId** | **String**|  | |

### Return type

[**RemoveDestinationFromAudience200Response**](RemoveDestinationFromAudience200Response.md)

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


## Operation: updateActivationForAudience

> UpdateActivationForAudience200Response updateActivationForAudience(spaceId, audienceId, id, updateActivationForAudienceAlphaInput)

Update Activation for Audience

Updates an Activation.   The rate limit for this endpoint is 50 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ActivationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ActivationsApi apiInstance = new ActivationsApi(defaultClient);
        String spaceId = "spa_9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        String audienceId = "aud_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        String id = "act_987654321"; // String | 
        UpdateActivationForAudienceAlphaInput updateActivationForAudienceAlphaInput = new UpdateActivationForAudienceAlphaInput(); // UpdateActivationForAudienceAlphaInput | 
        try {
            UpdateActivationForAudience200Response result = apiInstance.updateActivationForAudience(spaceId, audienceId, id, updateActivationForAudienceAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ActivationsApi#updateActivationForAudience");
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
| **audienceId** | **String**|  | |
| **id** | **String**|  | |
| **updateActivationForAudienceAlphaInput** | [**UpdateActivationForAudienceAlphaInput**](UpdateActivationForAudienceAlphaInput.md)|  | |

### Return type

[**UpdateActivationForAudience200Response**](UpdateActivationForAudience200Response.md)

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

