# SpaceSchemaApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listEvents**](SpaceSchemaApi.md#listEvents) | **GET** /spaces/{spaceId}/events | List Events |
| [**listPropertiesFromEvent**](SpaceSchemaApi.md#listPropertiesFromEvent) | **GET** /spaces/{spaceId}/events/{eventName}/properties | List Properties from Event |
| [**listSampleValuesFromEventProperty**](SpaceSchemaApi.md#listSampleValuesFromEventProperty) | **GET** /spaces/{spaceId}/events/{eventName}/properties/{propertyName}/sample-values | List Sample Values from Event Property |



## Operation: listEvents

> ListEvents200Response listEvents(spaceId, pagination, sortBy, sortDir, search)

List Events

Returns a list of Events for a Space.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.    The rate limit for this endpoint is 25 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SpaceSchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SpaceSchemaApi apiInstance = new SpaceSchemaApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination params. Defaults to count 200.  This parameter exists in alpha.
        String sortBy = "lastSeenAt"; // String | Field to sort by. Defaults to 'lastSeenAt'.  This parameter exists in alpha.
        String sortDir = "asc"; // String | Sort direction. Defaults to 'desc'.  This parameter exists in alpha.
        String search = "search_example"; // String | Filter events by name substring.  This parameter exists in alpha.
        try {
            ListEvents200Response result = apiInstance.listEvents(spaceId, pagination, sortBy, sortDir, search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpaceSchemaApi#listEvents");
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
| **pagination** | [**PaginationInput**](.md)| Pagination params. Defaults to count 200.  This parameter exists in alpha. | [optional] |
| **sortBy** | **String**| Field to sort by. Defaults to &#39;lastSeenAt&#39;.  This parameter exists in alpha. | [optional] [enum: lastSeenAt, name] |
| **sortDir** | **String**| Sort direction. Defaults to &#39;desc&#39;.  This parameter exists in alpha. | [optional] [enum: asc, desc] |
| **search** | **String**| Filter events by name substring.  This parameter exists in alpha. | [optional] |

### Return type

[**ListEvents200Response**](ListEvents200Response.md)

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


## Operation: listPropertiesFromEvent

> ListPropertiesFromEvent200Response listPropertiesFromEvent(spaceId, eventName, pagination, sortBy, sortDir, search, includeSampleValues, samplesCount)

List Properties from Event

Returns a list of Properties for an Event in a Space.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.    The rate limit for this endpoint is 25 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SpaceSchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SpaceSchemaApi apiInstance = new SpaceSchemaApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        String eventName = "Order Completed"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination params. Defaults to count 200.  This parameter exists in alpha.
        String sortBy = "lastSeenAt"; // String | Field to sort by. Defaults to 'lastSeenAt'.  This parameter exists in alpha.
        String sortDir = "asc"; // String | Sort direction. Defaults to 'desc'.  This parameter exists in alpha.
        String search = "search_example"; // String | Filter properties by name substring.  This parameter exists in alpha.
        Boolean includeSampleValues = true; // Boolean | When true, include sample values for each property. Defaults to false.  This parameter exists in alpha.
        BigDecimal samplesCount = new BigDecimal(78); // BigDecimal | Max number of sample values to return per property. Defaults to 20, min 1, max 100.  This parameter exists in alpha.
        try {
            ListPropertiesFromEvent200Response result = apiInstance.listPropertiesFromEvent(spaceId, eventName, pagination, sortBy, sortDir, search, includeSampleValues, samplesCount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpaceSchemaApi#listPropertiesFromEvent");
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
| **eventName** | **String**|  | |
| **pagination** | [**PaginationInput**](.md)| Pagination params. Defaults to count 200.  This parameter exists in alpha. | [optional] |
| **sortBy** | **String**| Field to sort by. Defaults to &#39;lastSeenAt&#39;.  This parameter exists in alpha. | [optional] [enum: lastSeenAt, name] |
| **sortDir** | **String**| Sort direction. Defaults to &#39;desc&#39;.  This parameter exists in alpha. | [optional] [enum: asc, desc] |
| **search** | **String**| Filter properties by name substring.  This parameter exists in alpha. | [optional] |
| **includeSampleValues** | **Boolean**| When true, include sample values for each property. Defaults to false.  This parameter exists in alpha. | [optional] |
| **samplesCount** | **BigDecimal**| Max number of sample values to return per property. Defaults to 20, min 1, max 100.  This parameter exists in alpha. | [optional] |

### Return type

[**ListPropertiesFromEvent200Response**](ListPropertiesFromEvent200Response.md)

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


## Operation: listSampleValuesFromEventProperty

> ListSampleValuesFromEventProperty200Response listSampleValuesFromEventProperty(spaceId, eventName, propertyName, propertyType)

List Sample Values from Event Property

Returns sample values for an Event Property in a Space.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.    The rate limit for this endpoint is 25 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SpaceSchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        SpaceSchemaApi apiInstance = new SpaceSchemaApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        String eventName = "Order Completed"; // String | 
        String propertyName = "revenue"; // String | 
        EventPropertyType propertyType = EventPropertyType.fromValue("CONTEXT"); // EventPropertyType | The property type.  This parameter exists in alpha.
        try {
            ListSampleValuesFromEventProperty200Response result = apiInstance.listSampleValuesFromEventProperty(spaceId, eventName, propertyName, propertyType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpaceSchemaApi#listSampleValuesFromEventProperty");
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
| **eventName** | **String**|  | |
| **propertyName** | **String**|  | |
| **propertyType** | [**EventPropertyType**](.md)| The property type.  This parameter exists in alpha. | [enum: CONTEXT, PROPERTY] |

### Return type

[**ListSampleValuesFromEventProperty200Response**](ListSampleValuesFromEventProperty200Response.md)

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

