# TrackingPlansApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSourceToTrackingPlan**](TrackingPlansApi.md#addSourceToTrackingPlan) | **POST** /tracking-plans/{trackingPlanId}/sources | Add Source to Tracking Plan |
| [**createTrackingPlan**](TrackingPlansApi.md#createTrackingPlan) | **POST** /tracking-plans | Create Tracking Plan |
| [**deleteTrackingPlan**](TrackingPlansApi.md#deleteTrackingPlan) | **DELETE** /tracking-plans/{trackingPlanId} | Delete Tracking Plan |
| [**getTrackingPlan**](TrackingPlansApi.md#getTrackingPlan) | **GET** /tracking-plans/{trackingPlanId} | Get Tracking Plan |
| [**listRulesFromTrackingPlan**](TrackingPlansApi.md#listRulesFromTrackingPlan) | **GET** /tracking-plans/{trackingPlanId}/rules | List Rules from Tracking Plan |
| [**listSourcesFromTrackingPlan**](TrackingPlansApi.md#listSourcesFromTrackingPlan) | **GET** /tracking-plans/{trackingPlanId}/sources | List Sources from Tracking Plan |
| [**listTrackingPlans**](TrackingPlansApi.md#listTrackingPlans) | **GET** /tracking-plans | List Tracking Plans |
| [**removeRulesFromTrackingPlan**](TrackingPlansApi.md#removeRulesFromTrackingPlan) | **DELETE** /tracking-plans/{trackingPlanId}/rules | Remove Rules from Tracking Plan |
| [**removeSourceFromTrackingPlan**](TrackingPlansApi.md#removeSourceFromTrackingPlan) | **DELETE** /tracking-plans/{trackingPlanId}/sources | Remove Source from Tracking Plan |
| [**replaceRulesInTrackingPlan**](TrackingPlansApi.md#replaceRulesInTrackingPlan) | **PUT** /tracking-plans/{trackingPlanId}/rules | Replace Rules in Tracking Plan |
| [**updateRulesInTrackingPlan**](TrackingPlansApi.md#updateRulesInTrackingPlan) | **PATCH** /tracking-plans/{trackingPlanId}/rules | Update Rules in Tracking Plan |
| [**updateTrackingPlan**](TrackingPlansApi.md#updateTrackingPlan) | **PATCH** /tracking-plans/{trackingPlanId} | Update Tracking Plan |



## Operation: addSourceToTrackingPlan

> AddSourceToTrackingPlan200Response addSourceToTrackingPlan(trackingPlanId, addSourceToTrackingPlanV1Input)

Add Source to Tracking Plan

Connects a Source to a Tracking Plan.    • When called, this endpoint may generate the &#x60;Source Modified&#x60; event in the [audit trail](/tag/Audit-Trail).   • In order to successfully call this endpoint, the specified Workspace needs to have the Protocols feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.TrackingPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        TrackingPlansApi apiInstance = new TrackingPlansApi(defaultClient);
        String trackingPlanId = "tp_sprout_rVGCC6WdrNxjCf6JpCHP"; // String | 
        AddSourceToTrackingPlanV1Input addSourceToTrackingPlanV1Input = new AddSourceToTrackingPlanV1Input(); // AddSourceToTrackingPlanV1Input | 
        try {
            AddSourceToTrackingPlan200Response result = apiInstance.addSourceToTrackingPlan(trackingPlanId, addSourceToTrackingPlanV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackingPlansApi#addSourceToTrackingPlan");
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
| **trackingPlanId** | **String**|  | |
| **addSourceToTrackingPlanV1Input** | [**AddSourceToTrackingPlanV1Input**](AddSourceToTrackingPlanV1Input.md)|  | |

### Return type

[**AddSourceToTrackingPlan200Response**](AddSourceToTrackingPlan200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: createTrackingPlan

> CreateTrackingPlan200Response createTrackingPlan(createTrackingPlanV1Input)

Create Tracking Plan

Creates a Tracking Plan.    • In order to successfully call this endpoint, the specified Workspace needs to have the Protocols feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.TrackingPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        TrackingPlansApi apiInstance = new TrackingPlansApi(defaultClient);
        CreateTrackingPlanV1Input createTrackingPlanV1Input = new CreateTrackingPlanV1Input(); // CreateTrackingPlanV1Input | 
        try {
            CreateTrackingPlan200Response result = apiInstance.createTrackingPlan(createTrackingPlanV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackingPlansApi#createTrackingPlan");
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
| **createTrackingPlanV1Input** | [**CreateTrackingPlanV1Input**](CreateTrackingPlanV1Input.md)|  | |

### Return type

[**CreateTrackingPlan200Response**](CreateTrackingPlan200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: deleteTrackingPlan

> DeleteTrackingPlan200Response deleteTrackingPlan(trackingPlanId)

Delete Tracking Plan

Deletes a Tracking Plan.    • In order to successfully call this endpoint, the specified Workspace needs to have the Protocols feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.TrackingPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        TrackingPlansApi apiInstance = new TrackingPlansApi(defaultClient);
        String trackingPlanId = "tp_sprout_rVGCC6WdrNxjCf6JpCHP"; // String | 
        try {
            DeleteTrackingPlan200Response result = apiInstance.deleteTrackingPlan(trackingPlanId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackingPlansApi#deleteTrackingPlan");
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
| **trackingPlanId** | **String**|  | |

### Return type

[**DeleteTrackingPlan200Response**](DeleteTrackingPlan200Response.md)

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


## Operation: getTrackingPlan

> GetTrackingPlan200Response getTrackingPlan(trackingPlanId)

Get Tracking Plan

Returns a Tracking Plan.    • In order to successfully call this endpoint, the specified Workspace needs to have the Protocols feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.TrackingPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        TrackingPlansApi apiInstance = new TrackingPlansApi(defaultClient);
        String trackingPlanId = "tp_sprout_rVGCC6WdrNxjCf6JpCHP"; // String | 
        try {
            GetTrackingPlan200Response result = apiInstance.getTrackingPlan(trackingPlanId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackingPlansApi#getTrackingPlan");
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
| **trackingPlanId** | **String**|  | |

### Return type

[**GetTrackingPlan200Response**](GetTrackingPlan200Response.md)

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


## Operation: listRulesFromTrackingPlan

> ListRulesFromTrackingPlan200Response listRulesFromTrackingPlan(trackingPlanId, pagination)

List Rules from Tracking Plan

Lists Tracking Plan rules.    • In order to successfully call this endpoint, the specified Workspace needs to have the Protocols feature enabled. Please reach out to your customer success manager for more information.   The rate limit for this endpoint is 200 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.TrackingPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        TrackingPlansApi apiInstance = new TrackingPlansApi(defaultClient);
        String trackingPlanId = "tp_sprout_rVGCC6WdrNxjCf6JpCHP"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination options.  This parameter exists in v1.
        try {
            ListRulesFromTrackingPlan200Response result = apiInstance.listRulesFromTrackingPlan(trackingPlanId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackingPlansApi#listRulesFromTrackingPlan");
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
| **trackingPlanId** | **String**|  | |
| **pagination** | [**PaginationInput**](.md)| Pagination options.  This parameter exists in v1. | |

### Return type

[**ListRulesFromTrackingPlan200Response**](ListRulesFromTrackingPlan200Response.md)

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


## Operation: listSourcesFromTrackingPlan

> ListSourcesFromTrackingPlan200Response listSourcesFromTrackingPlan(trackingPlanId, pagination)

List Sources from Tracking Plan

Lists Sources connected to a Tracking Plan.    • In order to successfully call this endpoint, the specified Workspace needs to have the Protocols feature enabled. Please reach out to your customer success manager for more information.   This endpoint requires the user to have at least the following permission(s):   * Source Read-only  * Tracking Plan Read-only

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.TrackingPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        TrackingPlansApi apiInstance = new TrackingPlansApi(defaultClient);
        String trackingPlanId = "tp_sprout_rVGCC6WdrNxjCf6JpCHP"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination options.  This parameter exists in v1.
        try {
            ListSourcesFromTrackingPlan200Response result = apiInstance.listSourcesFromTrackingPlan(trackingPlanId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackingPlansApi#listSourcesFromTrackingPlan");
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
| **trackingPlanId** | **String**|  | |
| **pagination** | [**PaginationInput**](.md)| Pagination options.  This parameter exists in v1. | |

### Return type

[**ListSourcesFromTrackingPlan200Response**](ListSourcesFromTrackingPlan200Response.md)

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


## Operation: listTrackingPlans

> ListTrackingPlans200Response listTrackingPlans(type, pagination)

List Tracking Plans

Returns a list of Tracking Plans.    • In order to successfully call this endpoint, the specified Workspace needs to have the Protocols feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.TrackingPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        TrackingPlansApi apiInstance = new TrackingPlansApi(defaultClient);
        String type = "ENGAGE"; // String | Requests Tracking Plans of a certain type. If omitted, lists all types.  This parameter exists in v1.
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination options.  This parameter exists in v1.
        try {
            ListTrackingPlans200Response result = apiInstance.listTrackingPlans(type, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackingPlansApi#listTrackingPlans");
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
| **type** | **String**| Requests Tracking Plans of a certain type. If omitted, lists all types.  This parameter exists in v1. | [optional] [enum: ENGAGE, LIVE, PROPERTY_LIBRARY, RULE_LIBRARY, TEMPLATE] |
| **pagination** | [**PaginationInput**](.md)| Pagination options.  This parameter exists in v1. | |

### Return type

[**ListTrackingPlans200Response**](ListTrackingPlans200Response.md)

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


## Operation: removeRulesFromTrackingPlan

> RemoveRulesFromTrackingPlan200Response removeRulesFromTrackingPlan(trackingPlanId, rules)

Remove Rules from Tracking Plan

Deletes Tracking Plan rules.    • In order to successfully call this endpoint, the specified Workspace needs to have the Protocols feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.TrackingPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        TrackingPlansApi apiInstance = new TrackingPlansApi(defaultClient);
        String trackingPlanId = "tp_sprout_rVGCC6WdrNxjCf6JpCHP"; // String | 
        List<RemoveRuleV1> rules = Arrays.asList(); // List<RemoveRuleV1> | Rules to delete.  This parameter exists in v1.
        try {
            RemoveRulesFromTrackingPlan200Response result = apiInstance.removeRulesFromTrackingPlan(trackingPlanId, rules);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackingPlansApi#removeRulesFromTrackingPlan");
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
| **trackingPlanId** | **String**|  | |
| **rules** | [**List&lt;RemoveRuleV1&gt;**](RemoveRuleV1.md)| Rules to delete.  This parameter exists in v1. | |

### Return type

[**RemoveRulesFromTrackingPlan200Response**](RemoveRulesFromTrackingPlan200Response.md)

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


## Operation: removeSourceFromTrackingPlan

> RemoveSourceFromTrackingPlan200Response removeSourceFromTrackingPlan(trackingPlanId, sourceId)

Remove Source from Tracking Plan

Disconnects a Source from a Tracking Plan.    • When called, this endpoint may generate the &#x60;Source Modified&#x60; event in the [audit trail](/tag/Audit-Trail).   • In order to successfully call this endpoint, the specified Workspace needs to have the Protocols feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.TrackingPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        TrackingPlansApi apiInstance = new TrackingPlansApi(defaultClient);
        String trackingPlanId = "tp_sprout_rVGCC6WdrNxjCf6JpCHP"; // String | 
        String sourceId = "qQEHquLrjRDN9j1ByrChyn"; // String | The id of the Source associated with the Tracking Plan.  Config API note: analogous to `sourceName`.  This parameter exists in v1.
        try {
            RemoveSourceFromTrackingPlan200Response result = apiInstance.removeSourceFromTrackingPlan(trackingPlanId, sourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackingPlansApi#removeSourceFromTrackingPlan");
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
| **trackingPlanId** | **String**|  | |
| **sourceId** | **String**| The id of the Source associated with the Tracking Plan.  Config API note: analogous to &#x60;sourceName&#x60;.  This parameter exists in v1. | |

### Return type

[**RemoveSourceFromTrackingPlan200Response**](RemoveSourceFromTrackingPlan200Response.md)

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


## Operation: replaceRulesInTrackingPlan

> ReplaceRulesInTrackingPlan200Response replaceRulesInTrackingPlan(trackingPlanId, replaceRulesInTrackingPlanV1Input)

Replace Rules in Tracking Plan

Replaces Tracking Plan rules.    • In order to successfully call this endpoint, the specified Workspace needs to have the Protocols feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.TrackingPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        TrackingPlansApi apiInstance = new TrackingPlansApi(defaultClient);
        String trackingPlanId = "tp_sprout_rVGCC6WdrNxjCf6JpCHP"; // String | 
        ReplaceRulesInTrackingPlanV1Input replaceRulesInTrackingPlanV1Input = new ReplaceRulesInTrackingPlanV1Input(); // ReplaceRulesInTrackingPlanV1Input | 
        try {
            ReplaceRulesInTrackingPlan200Response result = apiInstance.replaceRulesInTrackingPlan(trackingPlanId, replaceRulesInTrackingPlanV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackingPlansApi#replaceRulesInTrackingPlan");
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
| **trackingPlanId** | **String**|  | |
| **replaceRulesInTrackingPlanV1Input** | [**ReplaceRulesInTrackingPlanV1Input**](ReplaceRulesInTrackingPlanV1Input.md)|  | |

### Return type

[**ReplaceRulesInTrackingPlan200Response**](ReplaceRulesInTrackingPlan200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: updateRulesInTrackingPlan

> UpdateRulesInTrackingPlan200Response updateRulesInTrackingPlan(trackingPlanId, updateRulesInTrackingPlanV1Input)

Update Rules in Tracking Plan

Updates Tracking Plan rules.    • In order to successfully call this endpoint, the specified Workspace needs to have the Protocols feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.TrackingPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        TrackingPlansApi apiInstance = new TrackingPlansApi(defaultClient);
        String trackingPlanId = "tp_sprout_rVGCC6WdrNxjCf6JpCHP"; // String | 
        UpdateRulesInTrackingPlanV1Input updateRulesInTrackingPlanV1Input = new UpdateRulesInTrackingPlanV1Input(); // UpdateRulesInTrackingPlanV1Input | 
        try {
            UpdateRulesInTrackingPlan200Response result = apiInstance.updateRulesInTrackingPlan(trackingPlanId, updateRulesInTrackingPlanV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackingPlansApi#updateRulesInTrackingPlan");
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
| **trackingPlanId** | **String**|  | |
| **updateRulesInTrackingPlanV1Input** | [**UpdateRulesInTrackingPlanV1Input**](UpdateRulesInTrackingPlanV1Input.md)|  | |

### Return type

[**UpdateRulesInTrackingPlan200Response**](UpdateRulesInTrackingPlan200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: updateTrackingPlan

> UpdateTrackingPlan200Response updateTrackingPlan(trackingPlanId, updateTrackingPlanV1Input)

Update Tracking Plan

Updates a Tracking Plan.    • In order to successfully call this endpoint, the specified Workspace needs to have the Protocols feature enabled. Please reach out to your customer success manager for more information.  Config API omitted fields: - &#x60;updateMask&#x60;       

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.TrackingPlansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        TrackingPlansApi apiInstance = new TrackingPlansApi(defaultClient);
        String trackingPlanId = "tp_sprout_rVGCC6WdrNxjCf6JpCHP"; // String | 
        UpdateTrackingPlanV1Input updateTrackingPlanV1Input = new UpdateTrackingPlanV1Input(); // UpdateTrackingPlanV1Input | 
        try {
            UpdateTrackingPlan200Response result = apiInstance.updateTrackingPlan(trackingPlanId, updateTrackingPlanV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackingPlansApi#updateTrackingPlan");
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
| **trackingPlanId** | **String**|  | |
| **updateTrackingPlanV1Input** | [**UpdateTrackingPlanV1Input**](UpdateTrackingPlanV1Input.md)|  | |

### Return type

[**UpdateTrackingPlan200Response**](UpdateTrackingPlan200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |

