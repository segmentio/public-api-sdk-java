# ComputedTraitsApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createComputedTrait**](ComputedTraitsApi.md#createComputedTrait) | **POST** /spaces/{spaceId}/computed-traits | Create Computed Trait |
| [**getComputedTrait**](ComputedTraitsApi.md#getComputedTrait) | **GET** /spaces/{spaceId}/computed-traits/{id} | Get Computed Trait |
| [**listComputedTraits**](ComputedTraitsApi.md#listComputedTraits) | **GET** /spaces/{spaceId}/computed-traits | List Computed Traits |
| [**removeComputedTraitFromSpace**](ComputedTraitsApi.md#removeComputedTraitFromSpace) | **DELETE** /spaces/{spaceId}/computed-traits/{id} | Remove Computed Trait from Space |
| [**updateComputedTraitForSpace**](ComputedTraitsApi.md#updateComputedTraitForSpace) | **PATCH** /spaces/{spaceId}/computed-traits/{id} | Update Computed Trait for Space |



## Operation: createComputedTrait

> CreateComputedTrait200Response createComputedTrait(spaceId, createComputedTraitAlphaInput)

Create Computed Trait

Creates a Computed Trait  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Computed Trait feature enabled. Please reach out to your customer success manager for more information.  • When called, this endpoint may generate the &#x60;Computed Trait Created&#x60; event in the [audit trail](/tag/Audit-Trail).  Note: The definition for a Computed Trait created using the API is not editable through the Segment App.   The rate limit for this endpoint is 10 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ComputedTraitsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ComputedTraitsApi apiInstance = new ComputedTraitsApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        CreateComputedTraitAlphaInput createComputedTraitAlphaInput = new CreateComputedTraitAlphaInput(); // CreateComputedTraitAlphaInput | 
        try {
            CreateComputedTrait200Response result = apiInstance.createComputedTrait(spaceId, createComputedTraitAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComputedTraitsApi#createComputedTrait");
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
| **createComputedTraitAlphaInput** | [**CreateComputedTraitAlphaInput**](CreateComputedTraitAlphaInput.md)|  | |

### Return type

[**CreateComputedTrait200Response**](CreateComputedTrait200Response.md)

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


## Operation: getComputedTrait

> GetComputedTrait200Response getComputedTrait(spaceId, id)

Get Computed Trait

Returns the Computed Trait by id and spaceId  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Computed Trait feature enabled. Please reach out to your customer success manager for more information.   The rate limit for this endpoint is 100 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ComputedTraitsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ComputedTraitsApi apiInstance = new ComputedTraitsApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        String id = "id"; // String | 
        try {
            GetComputedTrait200Response result = apiInstance.getComputedTrait(spaceId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComputedTraitsApi#getComputedTrait");
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
| **id** | **String**|  | |

### Return type

[**GetComputedTrait200Response**](GetComputedTrait200Response.md)

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


## Operation: listComputedTraits

> ListComputedTraits200Response listComputedTraits(spaceId, pagination)

List Computed Traits

Returns Computed Traits by spaceId.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Computed Trait feature enabled. Please reach out to your customer success manager for more information.   The rate limit for this endpoint is 25 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ComputedTraitsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ComputedTraitsApi apiInstance = new ComputedTraitsApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Information about the pagination of this response.  [See pagination](https://docs.segmentapis.com/tag/Pagination/#section/Pagination-parameters) for more info.  This parameter exists in alpha.
        try {
            ListComputedTraits200Response result = apiInstance.listComputedTraits(spaceId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComputedTraitsApi#listComputedTraits");
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
| **pagination** | [**PaginationInput**](.md)| Information about the pagination of this response.  [See pagination](https://docs.segmentapis.com/tag/Pagination/#section/Pagination-parameters) for more info.  This parameter exists in alpha. | [optional] |

### Return type

[**ListComputedTraits200Response**](ListComputedTraits200Response.md)

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


## Operation: removeComputedTraitFromSpace

> RemoveComputedTraitFromSpace200Response removeComputedTraitFromSpace(spaceId, id)

Remove Computed Trait from Space

Deletes a Computed Trait by id and spaceId.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Computed Trait feature enabled. Please reach out to your customer success manager for more information.  • When called, this endpoint may generate the &#x60;Computed Trait Deleted&#x60; event in the [audit trail](/tag/Audit-Trail).   The rate limit for this endpoint is 20 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ComputedTraitsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ComputedTraitsApi apiInstance = new ComputedTraitsApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        String id = "id"; // String | 
        try {
            RemoveComputedTraitFromSpace200Response result = apiInstance.removeComputedTraitFromSpace(spaceId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComputedTraitsApi#removeComputedTraitFromSpace");
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
| **id** | **String**|  | |

### Return type

[**RemoveComputedTraitFromSpace200Response**](RemoveComputedTraitFromSpace200Response.md)

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


## Operation: updateComputedTraitForSpace

> UpdateComputedTraitForSpace200Response updateComputedTraitForSpace(spaceId, id, updateComputedTraitForSpaceAlphaInput)

Update Computed Trait for Space

Updates the Computed Trait.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Computed Trait feature enabled. Please reach out to your customer success manager for more information.  • When called, this endpoint may generate the &#x60;Computed Trait Modified&#x60; event in the [audit trail](/tag/Audit-Trail).  • Note that when a Computed Trait is updated, the Computed Trait will be locked from future edits until the changes have been incorporated. You can find more information [in the Segment docs](https://segment-docs.netlify.app/docs/unify/traits/computed-traits/#editing-realtime-traits).  Note: The definition for a Computed Trait updated using the API is not editable through the Segment App.   The rate limit for this endpoint is 10 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.ComputedTraitsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        ComputedTraitsApi apiInstance = new ComputedTraitsApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        String id = "id"; // String | 
        UpdateComputedTraitForSpaceAlphaInput updateComputedTraitForSpaceAlphaInput = new UpdateComputedTraitForSpaceAlphaInput(); // UpdateComputedTraitForSpaceAlphaInput | 
        try {
            UpdateComputedTraitForSpace200Response result = apiInstance.updateComputedTraitForSpace(spaceId, id, updateComputedTraitForSpaceAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ComputedTraitsApi#updateComputedTraitForSpace");
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
| **id** | **String**|  | |
| **updateComputedTraitForSpaceAlphaInput** | [**UpdateComputedTraitForSpaceAlphaInput**](UpdateComputedTraitForSpaceAlphaInput.md)|  | |

### Return type

[**UpdateComputedTraitForSpace200Response**](UpdateComputedTraitForSpace200Response.md)

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

