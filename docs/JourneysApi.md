# JourneysApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createJourney**](JourneysApi.md#createJourney) | **POST** /spaces/{spaceId}/journeys | Create Journey |
| [**getJourney**](JourneysApi.md#getJourney) | **GET** /spaces/{spaceId}/journeys/{containerId} | Get Journey |
| [**getJourneyAnalytics**](JourneysApi.md#getJourneyAnalytics) | **GET** /spaces/{spaceId}/journeys/{containerId}/analytics | Get Journey Analytics |
| [**removeJourneyFromSpace**](JourneysApi.md#removeJourneyFromSpace) | **DELETE** /spaces/{spaceId}/journeys/{containerId} | Remove Journey from Space |
| [**replaceStepsForJourney**](JourneysApi.md#replaceStepsForJourney) | **PUT** /spaces/{spaceId}/journeys/{containerId}/steps | Replace Steps for Journey |
| [**updateDestinationsForJourney**](JourneysApi.md#updateDestinationsForJourney) | **PATCH** /spaces/{spaceId}/journeys/{containerId}/destinations | Update Destinations for Journey |
| [**updateStatusForJourney**](JourneysApi.md#updateStatusForJourney) | **PATCH** /spaces/{spaceId}/journeys/{containerId}/status | Update Status for Journey |



## Operation: createJourney

> CreateJourney201Response createJourney(spaceId, createJourneyAlphaInput)

Create Journey

Creates Journey.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Journeys feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.JourneysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        JourneysApi apiInstance = new JourneysApi(defaultClient);
        String spaceId = "space_id"; // String | 
        CreateJourneyAlphaInput createJourneyAlphaInput = new CreateJourneyAlphaInput(); // CreateJourneyAlphaInput | 
        try {
            CreateJourney201Response result = apiInstance.createJourney(spaceId, createJourneyAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JourneysApi#createJourney");
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
| **createJourneyAlphaInput** | [**CreateJourneyAlphaInput**](CreateJourneyAlphaInput.md)|  | |

### Return type

[**CreateJourney201Response**](CreateJourney201Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1alpha+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: getJourney

> GetJourney200Response getJourney(spaceId, containerId)

Get Journey

Returns the journey by containerId  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Journeys feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.JourneysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        JourneysApi apiInstance = new JourneysApi(defaultClient);
        String spaceId = "space_id"; // String | 
        String containerId = "jcon_2tG95HZh4oPsgHfcOlznyfcDDAg"; // String | 
        try {
            GetJourney200Response result = apiInstance.getJourney(spaceId, containerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JourneysApi#getJourney");
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
| **containerId** | **String**|  | |

### Return type

[**GetJourney200Response**](GetJourney200Response.md)

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


## Operation: getJourneyAnalytics

> GetJourneyAnalytics200Response getJourneyAnalytics(spaceId, containerId, version, fromDate, toDate)

Get Journey Analytics

Get Analytics for a journey  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Journeys feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.JourneysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        JourneysApi apiInstance = new JourneysApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        String containerId = "jcon_2tG95HZh4oPsgHfcOlznyfcDDAg"; // String | 
        BigDecimal version = new BigDecimal("1"); // BigDecimal | The journey version.  This parameter exists in alpha.
        String fromDate = "2006-01-02T15:04:05.000Z"; // String | This parameter exists in alpha.
        String toDate = "2006-01-02T15:04:05.000Z"; // String | This parameter exists in alpha.
        try {
            GetJourneyAnalytics200Response result = apiInstance.getJourneyAnalytics(spaceId, containerId, version, fromDate, toDate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JourneysApi#getJourneyAnalytics");
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
| **containerId** | **String**|  | |
| **version** | **BigDecimal**| The journey version.  This parameter exists in alpha. | |
| **fromDate** | **String**| This parameter exists in alpha. | |
| **toDate** | **String**| This parameter exists in alpha. | [optional] |

### Return type

[**GetJourneyAnalytics200Response**](GetJourneyAnalytics200Response.md)

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


## Operation: removeJourneyFromSpace

> RemoveJourneyFromSpace200Response removeJourneyFromSpace(spaceId, containerId, version)

Remove Journey from Space

Delete a journey  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Journeys feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.JourneysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        JourneysApi apiInstance = new JourneysApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        String containerId = "jcon_2tG95HZh4oPsgHfcOlznyfcDDAg"; // String | 
        BigDecimal version = new BigDecimal("1"); // BigDecimal | The journey version.  This parameter exists in alpha.
        try {
            RemoveJourneyFromSpace200Response result = apiInstance.removeJourneyFromSpace(spaceId, containerId, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JourneysApi#removeJourneyFromSpace");
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
| **containerId** | **String**|  | |
| **version** | **BigDecimal**| The journey version.  This parameter exists in alpha. | |

### Return type

[**RemoveJourneyFromSpace200Response**](RemoveJourneyFromSpace200Response.md)

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


## Operation: replaceStepsForJourney

> ReplaceStepsForJourney200Response replaceStepsForJourney(spaceId, containerId, replaceStepsForJourneyAlphaInput)

Replace Steps for Journey

Replace steps for a journey  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Journeys feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.JourneysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        JourneysApi apiInstance = new JourneysApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        String containerId = "jcon_2tG95HZh4oPsgHfcOlznyfcDDAg"; // String | 
        ReplaceStepsForJourneyAlphaInput replaceStepsForJourneyAlphaInput = new ReplaceStepsForJourneyAlphaInput(); // ReplaceStepsForJourneyAlphaInput | 
        try {
            ReplaceStepsForJourney200Response result = apiInstance.replaceStepsForJourney(spaceId, containerId, replaceStepsForJourneyAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JourneysApi#replaceStepsForJourney");
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
| **containerId** | **String**|  | |
| **replaceStepsForJourneyAlphaInput** | [**ReplaceStepsForJourneyAlphaInput**](ReplaceStepsForJourneyAlphaInput.md)|  | |

### Return type

[**ReplaceStepsForJourney200Response**](ReplaceStepsForJourney200Response.md)

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


## Operation: updateDestinationsForJourney

> UpdateDestinationsForJourney200Response updateDestinationsForJourney(spaceId, containerId, updateDestinationsForJourneyAlphaInput)

Update Destinations for Journey

Update DESTINATIONS for a journey  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Journeys feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.JourneysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        JourneysApi apiInstance = new JourneysApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        String containerId = "jcon_2tG95HZh4oPsgHfcOlznyfcDDAg"; // String | 
        UpdateDestinationsForJourneyAlphaInput updateDestinationsForJourneyAlphaInput = new UpdateDestinationsForJourneyAlphaInput(); // UpdateDestinationsForJourneyAlphaInput | 
        try {
            UpdateDestinationsForJourney200Response result = apiInstance.updateDestinationsForJourney(spaceId, containerId, updateDestinationsForJourneyAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JourneysApi#updateDestinationsForJourney");
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
| **containerId** | **String**|  | |
| **updateDestinationsForJourneyAlphaInput** | [**UpdateDestinationsForJourneyAlphaInput**](UpdateDestinationsForJourneyAlphaInput.md)|  | |

### Return type

[**UpdateDestinationsForJourney200Response**](UpdateDestinationsForJourney200Response.md)

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


## Operation: updateStatusForJourney

> UpdateStatusForJourney200Response updateStatusForJourney(spaceId, containerId, updateStatusForJourneyAlphaInput)

Update Status for Journey

Update status of the journey   • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Journeys feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.JourneysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        JourneysApi apiInstance = new JourneysApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        String containerId = "jcon_2tG95HZh4oPsgHfcOlznyfcDDAg"; // String | 
        UpdateStatusForJourneyAlphaInput updateStatusForJourneyAlphaInput = new UpdateStatusForJourneyAlphaInput(); // UpdateStatusForJourneyAlphaInput | 
        try {
            UpdateStatusForJourney200Response result = apiInstance.updateStatusForJourney(spaceId, containerId, updateStatusForJourneyAlphaInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling JourneysApi#updateStatusForJourney");
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
| **containerId** | **String**|  | |
| **updateStatusForJourneyAlphaInput** | [**UpdateStatusForJourneyAlphaInput**](UpdateStatusForJourneyAlphaInput.md)|  | |

### Return type

[**UpdateStatusForJourney200Response**](UpdateStatusForJourney200Response.md)

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

