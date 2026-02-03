# AudiencesApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addAudienceScheduleToAudience**](AudiencesApi.md#addAudienceScheduleToAudience) | **POST** /spaces/{spaceId}/audiences/{id}/schedules | Add Audience Schedule to Audience |
| [**createAudience**](AudiencesApi.md#createAudience) | **POST** /spaces/{spaceId}/audiences | Create Audience |
| [**createAudiencePreview**](AudiencesApi.md#createAudiencePreview) | **POST** /spaces/{spaceId}/audiences/previews | Create Audience Preview |
| [**forceExecuteAudienceRun**](AudiencesApi.md#forceExecuteAudienceRun) | **POST** /spaces/{spaceId}/audiences/{audienceId}/runs | Force Execute Audience Run |
| [**getAudience**](AudiencesApi.md#getAudience) | **GET** /spaces/{spaceId}/audiences/{id} | Get Audience |
| [**getAudiencePreview**](AudiencesApi.md#getAudiencePreview) | **GET** /spaces/{spaceId}/audiences/previews/{id} | Get Audience Preview |
| [**getAudienceScheduleFromSpaceAndAudience**](AudiencesApi.md#getAudienceScheduleFromSpaceAndAudience) | **GET** /spaces/{spaceId}/audiences/{id}/schedules/{scheduleId} | Get Audience Schedule from Space And Audience |
| [**listAudienceConsumersFromSpaceAndAudience**](AudiencesApi.md#listAudienceConsumersFromSpaceAndAudience) | **GET** /spaces/{spaceId}/audiences/{id}/audience-references | List Audience Consumers from Space And Audience |
| [**listAudienceSchedulesFromSpaceAndAudience**](AudiencesApi.md#listAudienceSchedulesFromSpaceAndAudience) | **GET** /spaces/{spaceId}/audiences/{id}/schedules | List Audience Schedules from Space And Audience |
| [**listAudiences**](AudiencesApi.md#listAudiences) | **GET** /spaces/{spaceId}/audiences | List Audiences |
| [**removeAudienceFromSpace**](AudiencesApi.md#removeAudienceFromSpace) | **DELETE** /spaces/{spaceId}/audiences/{id} | Remove Audience from Space |
| [**removeAudienceScheduleFromAudience**](AudiencesApi.md#removeAudienceScheduleFromAudience) | **DELETE** /spaces/{spaceId}/audiences/{id}/schedules/{scheduleId} | Remove Audience Schedule from Audience |
| [**updateAudienceForSpace**](AudiencesApi.md#updateAudienceForSpace) | **PATCH** /spaces/{spaceId}/audiences/{id} | Update Audience for Space |
| [**updateAudienceScheduleForAudience**](AudiencesApi.md#updateAudienceScheduleForAudience) | **PATCH** /spaces/{spaceId}/audiences/{id}/schedules/{scheduleId} | Update Audience Schedule for Audience |



## Operation: addAudienceScheduleToAudience

> AddAudienceScheduleToAudience200Response addAudienceScheduleToAudience(spaceId, id, addAudienceScheduleToAudienceAlphaInput)

Add Audience Schedule to Audience

The ability to configure the run schedule for an Audience is limited to Linked Audiences (audienceType &#x3D; LINKED).  Note that if a Linked Audience remains disabled for 90 days Segment will delete the associated schedule and a new schedule will need to be created.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.   The rate limit for this endpoint is 50 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

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
        String id = "aud_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        AddAudienceScheduleToAudienceAlphaInput addAudienceScheduleToAudienceAlphaInput = new AddAudienceScheduleToAudienceAlphaInput(); // AddAudienceScheduleToAudienceAlphaInput | 
        try {
            AddAudienceScheduleToAudience200Response result = apiInstance.addAudienceScheduleToAudience(spaceId, id, addAudienceScheduleToAudienceAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudiencesApi#addAudienceScheduleToAudience");
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
| **addAudienceScheduleToAudienceAlphaInput** | [**AddAudienceScheduleToAudienceAlphaInput**](AddAudienceScheduleToAudienceAlphaInput.md)|  | |

### Return type

[**AddAudienceScheduleToAudience200Response**](AddAudienceScheduleToAudience200Response.md)

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


## Operation: createAudience

> CreateAudience200Response createAudience(spaceId, createAudienceInput)

Create Audience

Creates Audience.  • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.  • When called, this endpoint may generate the &#x60;Audience Created&#x60; event in the [audit trail](/tag/Audit-Trail).  Note: The definition for an Audience created using the API is not editable through the Segment App.   The rate limit for this endpoint is 50 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

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
        CreateAudienceInput createAudienceInput = new CreateAudienceInput(); // CreateAudienceInput | 
        try {
            CreateAudience200Response result = apiInstance.createAudience(spaceId, createAudienceInput);
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
| **createAudienceInput** | [**CreateAudienceInput**](CreateAudienceInput.md)|  | |

### Return type

[**CreateAudience200Response**](CreateAudience200Response.md)

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


## Operation: createAudiencePreview

> CreateAudiencePreview200Response createAudiencePreview(spaceId, createAudiencePreviewBetaInput)

Create Audience Preview

Previews Audience.  • This endpoint is in **Beta** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.  • When called, this endpoint may generate the &#x60;Audience Preview Created&#x60; event in the [audit trail](/tag/Audit-Trail).   The rate limit for this endpoint is 5 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information. This endpoint also has a rate limit of 700 requests per month per spaceId, which is lower than the default due to access pattern restrictions.

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
        CreateAudiencePreviewBetaInput createAudiencePreviewBetaInput = new CreateAudiencePreviewBetaInput(); // CreateAudiencePreviewBetaInput | 
        try {
            CreateAudiencePreview200Response result = apiInstance.createAudiencePreview(spaceId, createAudiencePreviewBetaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudiencesApi#createAudiencePreview");
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
| **createAudiencePreviewBetaInput** | [**CreateAudiencePreviewBetaInput**](CreateAudiencePreviewBetaInput.md)|  | |

### Return type

[**CreateAudiencePreview200Response**](CreateAudiencePreview200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: forceExecuteAudienceRun

> ForceExecuteAudienceRun200Response forceExecuteAudienceRun(spaceId, audienceId)

Force Execute Audience Run

The ability to force execute a run for an Audience is limited to Linked Audiences (audienceType &#x3D; &#x60;LINKED&#x60;).  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.  • When called, this endpoint may generate the &#x60;Audience Run Forced&#x60; event in the [audit trail](/tag/Audit-Trail).

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
        String audienceId = "aud_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        try {
            ForceExecuteAudienceRun200Response result = apiInstance.forceExecuteAudienceRun(spaceId, audienceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudiencesApi#forceExecuteAudienceRun");
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

### Return type

[**ForceExecuteAudienceRun200Response**](ForceExecuteAudienceRun200Response.md)

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


## Operation: getAudience

> GetAudience200Response getAudience(spaceId, id, include)

Get Audience

Returns the Audience by id and spaceId. Supports including audience schedules using &#x60;?include&#x3D;schedules&#x60;.  • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.   The rate limit for this endpoint is 100 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

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
        String id = "aud_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        String include = "schedules"; // String | Additional resource to include, support schedules only.  This parameter exists in alpha.
        try {
            GetAudience200Response result = apiInstance.getAudience(spaceId, id, include);
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
| **include** | **String**| Additional resource to include, support schedules only.  This parameter exists in alpha. | [optional] [enum: schedules] |

### Return type

[**GetAudience200Response**](GetAudience200Response.md)

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


## Operation: getAudiencePreview

> GetAudiencePreview200Response getAudiencePreview(spaceId, id)

Get Audience Preview

Reads the results of an audience preview.  • This endpoint is in **Beta** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.   The rate limit for this endpoint is 300 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

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
        String id = "31XR7mRsdw3vz3ZqvRa1623re0q-compute_preview_execution-9aQ1Lj62S4bomZKLF4DPqW-compute_preview_execution"; // String | 
        try {
            GetAudiencePreview200Response result = apiInstance.getAudiencePreview(spaceId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudiencesApi#getAudiencePreview");
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

[**GetAudiencePreview200Response**](GetAudiencePreview200Response.md)

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


## Operation: getAudienceScheduleFromSpaceAndAudience

> GetAudienceScheduleFromSpaceAndAudience200Response getAudienceScheduleFromSpaceAndAudience(spaceId, id, scheduleId)

Get Audience Schedule from Space And Audience

Returns the schedule for the given audience and scheduleId.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.

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
        String id = "aud_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        String scheduleId = "sch_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        try {
            GetAudienceScheduleFromSpaceAndAudience200Response result = apiInstance.getAudienceScheduleFromSpaceAndAudience(spaceId, id, scheduleId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudiencesApi#getAudienceScheduleFromSpaceAndAudience");
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
| **scheduleId** | **String**|  | |

### Return type

[**GetAudienceScheduleFromSpaceAndAudience200Response**](GetAudienceScheduleFromSpaceAndAudience200Response.md)

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
        ListAudienceSearchInput search = new ListAudienceSearchInput(); // ListAudienceSearchInput | Optional search criteria  This parameter exists in alpha.
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
| **search** | [**ListAudienceSearchInput**](.md)| Optional search criteria  This parameter exists in alpha. | [optional] |
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


## Operation: listAudienceSchedulesFromSpaceAndAudience

> ListAudienceSchedulesFromSpaceAndAudience200Response listAudienceSchedulesFromSpaceAndAudience(spaceId, id)

List Audience Schedules from Space And Audience

Returns the list of schedules for the given audience.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.

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
        String id = "aud_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        try {
            ListAudienceSchedulesFromSpaceAndAudience200Response result = apiInstance.listAudienceSchedulesFromSpaceAndAudience(spaceId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudiencesApi#listAudienceSchedulesFromSpaceAndAudience");
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

[**ListAudienceSchedulesFromSpaceAndAudience200Response**](ListAudienceSchedulesFromSpaceAndAudience200Response.md)

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

> ListAudiences200Response listAudiences(spaceId, search, pagination, include)

List Audiences

Returns Audiences by spaceId. Supports including audience schedules using &#x60;?include&#x3D;schedules&#x60;.  • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.   The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

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
        ListAudienceSearchInput search = new ListAudienceSearchInput(); // ListAudienceSearchInput | Optional search criteria  This parameter exists in alpha.
        ListAudiencesPaginationInput pagination = new ListAudiencesPaginationInput(); // ListAudiencesPaginationInput | Information about the pagination of this response.  [See pagination](https://docs.segmentapis.com/tag/Pagination/#section/Pagination-parameters) for more info.  This parameter exists in alpha.
        String include = "schedules"; // String | Additional resource to include, support schedules only.  This parameter exists in alpha.
        try {
            ListAudiences200Response result = apiInstance.listAudiences(spaceId, search, pagination, include);
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
| **search** | [**ListAudienceSearchInput**](.md)| Optional search criteria  This parameter exists in alpha. | [optional] |
| **pagination** | [**ListAudiencesPaginationInput**](.md)| Information about the pagination of this response.  [See pagination](https://docs.segmentapis.com/tag/Pagination/#section/Pagination-parameters) for more info.  This parameter exists in alpha. | [optional] |
| **include** | **String**| Additional resource to include, support schedules only.  This parameter exists in alpha. | [optional] [enum: schedules] |

### Return type

[**ListAudiences200Response**](ListAudiences200Response.md)

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


## Operation: removeAudienceFromSpace

> RemoveAudienceFromSpace200Response removeAudienceFromSpace(spaceId, id)

Remove Audience from Space

Deletes an Audience by id and spaceId.  • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.  • When called, this endpoint may generate the &#x60;Audience Deleted&#x60; event in the [audit trail](/tag/Audit-Trail).   The rate limit for this endpoint is 50 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

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
        String id = "aud_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
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
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: removeAudienceScheduleFromAudience

> RemoveAudienceScheduleFromAudience200Response removeAudienceScheduleFromAudience(spaceId, id, scheduleId)

Remove Audience Schedule from Audience

Deletes an audience schedule for a Linked Audience (audienceType &#x3D; LINKED).  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.   The rate limit for this endpoint is 50 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

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
        String id = "aud_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        String scheduleId = "sch_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        try {
            RemoveAudienceScheduleFromAudience200Response result = apiInstance.removeAudienceScheduleFromAudience(spaceId, id, scheduleId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudiencesApi#removeAudienceScheduleFromAudience");
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
| **scheduleId** | **String**|  | |

### Return type

[**RemoveAudienceScheduleFromAudience200Response**](RemoveAudienceScheduleFromAudience200Response.md)

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

> UpdateAudienceForSpace200Response updateAudienceForSpace(spaceId, id, updateAudienceForSpaceInput)

Update Audience for Space

Updates the Audience.  • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.  • When called, this endpoint may generate the &#x60;Audience Modified&#x60; event in the [audit trail](/tag/Audit-Trail).  • Note that when an Audience is updated, the Audience will be locked from future edits until the changes have been incorporated. You can find more information [in the Segment docs](https://segment-docs.netlify.app/docs/engage/audiences/#editing-realtime-audiences-and-traits).  Note: The definition for an Audience updated using the API is not editable through the Segment App.   The rate limit for this endpoint is 50 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

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
        String id = "aud_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        UpdateAudienceForSpaceInput updateAudienceForSpaceInput = new UpdateAudienceForSpaceInput(); // UpdateAudienceForSpaceInput | 
        try {
            UpdateAudienceForSpace200Response result = apiInstance.updateAudienceForSpace(spaceId, id, updateAudienceForSpaceInput);
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
| **updateAudienceForSpaceInput** | [**UpdateAudienceForSpaceInput**](UpdateAudienceForSpaceInput.md)|  | |

### Return type

[**UpdateAudienceForSpace200Response**](UpdateAudienceForSpace200Response.md)

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


## Operation: updateAudienceScheduleForAudience

> UpdateAudienceScheduleForAudience200Response updateAudienceScheduleForAudience(spaceId, id, scheduleId, updateAudienceScheduleForAudienceAlphaInput)

Update Audience Schedule for Audience

Updates an audience schedule for a Linked Audience (audienceType &#x3D; LINKED).  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Audience feature enabled. Please reach out to your customer success manager for more information.   The rate limit for this endpoint is 50 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

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
        String id = "aud_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        String scheduleId = "sch_0ujsszwN8NRY24YaXiTIE2VWDTS"; // String | 
        UpdateAudienceScheduleForAudienceAlphaInput updateAudienceScheduleForAudienceAlphaInput = new UpdateAudienceScheduleForAudienceAlphaInput(); // UpdateAudienceScheduleForAudienceAlphaInput | 
        try {
            UpdateAudienceScheduleForAudience200Response result = apiInstance.updateAudienceScheduleForAudience(spaceId, id, scheduleId, updateAudienceScheduleForAudienceAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AudiencesApi#updateAudienceScheduleForAudience");
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
| **scheduleId** | **String**|  | |
| **updateAudienceScheduleForAudienceAlphaInput** | [**UpdateAudienceScheduleForAudienceAlphaInput**](UpdateAudienceScheduleForAudienceAlphaInput.md)|  | |

### Return type

[**UpdateAudienceScheduleForAudience200Response**](UpdateAudienceScheduleForAudience200Response.md)

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

