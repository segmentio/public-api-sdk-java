# AudiencesApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAudience**](AudiencesApi.md#createAudience) | **POST** /spaces/{spaceId}/audiences | Create Audience |
| [**getAudience**](AudiencesApi.md#getAudience) | **GET** /spaces/{spaceId}/audiences/{id} | Get Audience |
| [**listAudienceConsumersFromSpaceAndAudience**](AudiencesApi.md#listAudienceConsumersFromSpaceAndAudience) | **GET** /spaces/{spaceId}/audiences/{id}/audience-references | List Audience Consumers from Space And Audience |
| [**listAudiences**](AudiencesApi.md#listAudiences) | **GET** /spaces/{spaceId}/audiences | List Audiences |
| [**previewAudience**](AudiencesApi.md#previewAudience) | **POST** /spaces/{spaceId}/audiences/previews | Preview Audience |
| [**removeAudienceFromSpace**](AudiencesApi.md#removeAudienceFromSpace) | **DELETE** /spaces/{spaceId}/audiences/{id} | Remove Audience from Space |
| [**updateAudienceForSpace**](AudiencesApi.md#updateAudienceForSpace) | **PATCH** /spaces/{spaceId}/audiences/{id} | Update Audience for Space |



## Operation: createAudience

> CreateAudience200Response createAudience(spaceId, createAudienceAlphaInput)

Create Audience

Creates Audience.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.  • When called, this endpoint may generate the &#x60;Audience Created&#x60; event in the [audit trail](/tag/Audit-Trail).  Note: The definition for an Audience created using the API is not editable through the Segment App.   The rate limit for this endpoint is 10 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.AudiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        AudiencesApi apiInstance = new AudiencesApi(defaultClient);
        String spaceId = "9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        CreateAudienceAlphaInput createAudienceAlphaInput = new CreateAudienceAlphaInput(); // CreateAudienceAlphaInput | 
        try {
            CreateAudience200Response result = apiInstance.createAudience(spaceId, createAudienceAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudiencesApi#createAudience");
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
| **createAudienceAlphaInput** | [**CreateAudienceAlphaInput**](CreateAudienceAlphaInput.md)|  | |

### Return type

[**CreateAudience200Response**](CreateAudience200Response.md)

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


## Operation: getAudience

> GetAudience200Response getAudience(spaceId, id)

Get Audience

Returns the Audience by id and spaceId.  • This endpoint is in **Beta** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.   The rate limit for this endpoint is 100 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.AudiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        AudiencesApi apiInstance = new AudiencesApi(defaultClient);
        String spaceId = "9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        String id = "id"; // String | 
        try {
            GetAudience200Response result = apiInstance.getAudience(spaceId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudiencesApi#getAudience");
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

[**GetAudience200Response**](GetAudience200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: listAudienceConsumersFromSpaceAndAudience

> ListAudienceConsumersFromSpaceAndAudience200Response listAudienceConsumersFromSpaceAndAudience(spaceId, id, pagination, search, sort)

List Audience Consumers from Space And Audience

Returns the list of consumers for the given audience.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.   The rate limit for this endpoint is 25 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.AudiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        AudiencesApi apiInstance = new AudiencesApi(defaultClient);
        String spaceId = "9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        String id = "aud_0ujsswThIGTUYm2K8FjOOfXtY1K"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Information about the pagination of this response.  [See pagination](https://docs.segmentapis.com/tag/Pagination/#section/Pagination-parameters) for more info.  This parameter exists in alpha.
        ListAudienceConsumersSearchInput search = new ListAudienceConsumersSearchInput(); // ListAudienceConsumersSearchInput | Optional search criteria  This parameter exists in alpha.
        ListAudienceConsumersSortInput sort = new ListAudienceConsumersSortInput(); // ListAudienceConsumersSortInput | Optional sort criteria  This parameter exists in alpha.
        try {
            ListAudienceConsumersFromSpaceAndAudience200Response result = apiInstance.listAudienceConsumersFromSpaceAndAudience(spaceId, id, pagination, search, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudiencesApi#listAudienceConsumersFromSpaceAndAudience");
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
| **pagination** | [**PaginationInput**](.md)| Information about the pagination of this response.  [See pagination](https://docs.segmentapis.com/tag/Pagination/#section/Pagination-parameters) for more info.  This parameter exists in alpha. | [optional] |
| **search** | [**ListAudienceConsumersSearchInput**](.md)| Optional search criteria  This parameter exists in alpha. | [optional] |
| **sort** | [**ListAudienceConsumersSortInput**](.md)| Optional sort criteria  This parameter exists in alpha. | [optional] |

### Return type

[**ListAudienceConsumersFromSpaceAndAudience200Response**](ListAudienceConsumersFromSpaceAndAudience200Response.md)

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


## Operation: listAudiences

> ListAudiences200Response listAudiences(spaceId, pagination)

List Audiences

Returns Audiences by spaceId.  • This endpoint is in **Beta** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.   The rate limit for this endpoint is 25 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.AudiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        AudiencesApi apiInstance = new AudiencesApi(defaultClient);
        String spaceId = "9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        ListAudiencesPaginationInput pagination = new ListAudiencesPaginationInput(); // ListAudiencesPaginationInput | Information about the pagination of this response.  [See pagination](https://docs.segmentapis.com/tag/Pagination/#section/Pagination-parameters) for more info.  This parameter exists in alpha.
        try {
            ListAudiences200Response result = apiInstance.listAudiences(spaceId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudiencesApi#listAudiences");
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
| **pagination** | [**ListAudiencesPaginationInput**](.md)| Information about the pagination of this response.  [See pagination](https://docs.segmentapis.com/tag/Pagination/#section/Pagination-parameters) for more info.  This parameter exists in alpha. | [optional] |

### Return type

[**ListAudiences200Response**](ListAudiences200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: previewAudience

> PreviewAudience200Response previewAudience(spaceId, previewAudienceInput)

Preview Audience

Previews Audience.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.  • When called, this endpoint may generate the &#x60;Audience Preview Created&#x60; event in the [audit trail](/tag/Audit-Trail).   The rate limit for this endpoint is 5 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information. The rate limit for this endpoint is 700 requests per month per spaceId, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.AudiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        AudiencesApi apiInstance = new AudiencesApi(defaultClient);
        String spaceId = "9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        PreviewAudienceInput previewAudienceInput = new PreviewAudienceInput(); // PreviewAudienceInput | 
        try {
            PreviewAudience200Response result = apiInstance.previewAudience(spaceId, previewAudienceInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudiencesApi#previewAudience");
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
| **previewAudienceInput** | [**PreviewAudienceInput**](PreviewAudienceInput.md)|  | |

### Return type

[**PreviewAudience200Response**](PreviewAudience200Response.md)

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


## Operation: removeAudienceFromSpace

> RemoveAudienceFromSpace200Response removeAudienceFromSpace(spaceId, id)

Remove Audience from Space

Deletes an Audience by id and spaceId.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.  • When called, this endpoint may generate the &#x60;Audience Deleted&#x60; event in the [audit trail](/tag/Audit-Trail).   The rate limit for this endpoint is 20 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.AudiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        AudiencesApi apiInstance = new AudiencesApi(defaultClient);
        String spaceId = "9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        String id = "aud_0ujsswThIGTUYm2K8FjOOfXtY1K"; // String | 
        try {
            RemoveAudienceFromSpace200Response result = apiInstance.removeAudienceFromSpace(spaceId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudiencesApi#removeAudienceFromSpace");
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

[**RemoveAudienceFromSpace200Response**](RemoveAudienceFromSpace200Response.md)

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


## Operation: updateAudienceForSpace

> UpdateAudienceForSpace200Response updateAudienceForSpace(spaceId, id, updateAudienceForSpaceAlphaInput)

Update Audience for Space

Updates the Audience.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.  • When called, this endpoint may generate the &#x60;Audience Modified&#x60; event in the [audit trail](/tag/Audit-Trail).  • Note that when an Audience is updated, the Audience will be locked from future edits until the changes have been incorporated. You can find more information [in the Segment docs](https://segment-docs.netlify.app/docs/engage/audiences/#editing-realtime-audiences-and-traits).  Note: The definition for an Audience updated using the API is not editable through the Segment App.   The rate limit for this endpoint is 10 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.AudiencesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        AudiencesApi apiInstance = new AudiencesApi(defaultClient);
        String spaceId = "9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        String id = "aud_0ujsswThIGTUYm2K8FjOOfXtY1K"; // String | 
        UpdateAudienceForSpaceAlphaInput updateAudienceForSpaceAlphaInput = new UpdateAudienceForSpaceAlphaInput(); // UpdateAudienceForSpaceAlphaInput | 
        try {
            UpdateAudienceForSpace200Response result = apiInstance.updateAudienceForSpace(spaceId, id, updateAudienceForSpaceAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudiencesApi#updateAudienceForSpace");
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
| **updateAudienceForSpaceAlphaInput** | [**UpdateAudienceForSpaceAlphaInput**](UpdateAudienceForSpaceAlphaInput.md)|  | |

### Return type

[**UpdateAudienceForSpace200Response**](UpdateAudienceForSpace200Response.md)

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

