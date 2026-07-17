# DataGraphSchemaApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listEntityPaths**](DataGraphSchemaApi.md#listEntityPaths) | **GET** /spaces/{spaceId}/entity-paths | List Entity Paths |
| [**listEvents**](DataGraphSchemaApi.md#listEvents) | **GET** /spaces/{spaceId}/events | List Events |
| [**listPropertiesFromEntity**](DataGraphSchemaApi.md#listPropertiesFromEntity) | **GET** /spaces/{spaceId}/entities/{entitySlug}/properties | List Properties from Entity |
| [**listPropertiesFromEvent**](DataGraphSchemaApi.md#listPropertiesFromEvent) | **GET** /spaces/{spaceId}/events/{eventName}/properties | List Properties from Event |
| [**listSampleValuesFromEntityProperty**](DataGraphSchemaApi.md#listSampleValuesFromEntityProperty) | **GET** /spaces/{spaceId}/entities/{entitySlug}/properties/{propertyName}/sample-values | List Sample Values from Entity Property |
| [**listSampleValuesFromEventProperty**](DataGraphSchemaApi.md#listSampleValuesFromEventProperty) | **GET** /spaces/{spaceId}/events/{eventName}/properties/{propertyName}/sample-values | List Sample Values from Event Property |
| [**listSampleValuesFromTrait**](DataGraphSchemaApi.md#listSampleValuesFromTrait) | **GET** /spaces/{spaceId}/traits/{traitKey}/sample-values | List Sample Values from Trait |
| [**listTraits**](DataGraphSchemaApi.md#listTraits) | **GET** /spaces/{spaceId}/traits | List Traits |



## Operation: listEntityPaths

> ListEntityPaths200Response listEntityPaths(spaceId, pagination, search)

List Entity Paths

Returns a list of Entity Paths for a Space.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.    The rate limit for this endpoint is 25 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DataGraphSchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DataGraphSchemaApi apiInstance = new DataGraphSchemaApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination params. Defaults to count 200.  This parameter exists in alpha.
        String search = "search_example"; // String | Filter paths by entity name or path name.  This parameter exists in alpha.
        try {
            ListEntityPaths200Response result = apiInstance.listEntityPaths(spaceId, pagination, search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataGraphSchemaApi#listEntityPaths");
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
| **search** | **String**| Filter paths by entity name or path name.  This parameter exists in alpha. | [optional] |

### Return type

[**ListEntityPaths200Response**](ListEntityPaths200Response.md)

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
import com.segment.publicapi.api.DataGraphSchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DataGraphSchemaApi apiInstance = new DataGraphSchemaApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination params. Defaults to count 200.  This parameter exists in alpha.
        String sortBy = "lastSeenAt"; // String | Field to sort by. Defaults to 'lastSeenAt'.  This parameter exists in alpha.
        String sortDir = "asc"; // String | Sort direction. Defaults to 'desc'.  This parameter exists in alpha.
        String search = "search_example"; // String | Filter events by name substring.  This parameter exists in alpha.
        try {
            ListEvents200Response result = apiInstance.listEvents(spaceId, pagination, sortBy, sortDir, search);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataGraphSchemaApi#listEvents");
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


## Operation: listPropertiesFromEntity

> ListPropertiesFromEntity200Response listPropertiesFromEntity(spaceId, entitySlug, pagination, includeSampleValues, samplesCount)

List Properties from Entity

Returns a list of Properties for an Entity in a Space.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.  &lt;div style&#x3D;\&quot;background-color: #e8f4fd; border: 1px solid #90caf9; border-radius: 6px; padding: 16px; margin: 16px 0; color: #0d47a1; line-height: 1.5;\&quot;&gt;   &lt;ul style&#x3D;\&quot;margin: 0; padding-left: 20px; font-size: 13px;\&quot;&gt;     &lt;li style&#x3D;\&quot;margin-bottom: 6px;\&quot;&gt;&lt;strong&gt;Forward-only pagination&lt;/strong&gt;: this endpoint does not support backward traversal. The &lt;code&gt;pagination.previous&lt;/code&gt; field is always absent; use &lt;code&gt;pagination.next&lt;/code&gt; to advance through pages.&lt;/li&gt;   &lt;/ul&gt; &lt;/div&gt;    The rate limit for this endpoint is 25 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DataGraphSchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DataGraphSchemaApi apiInstance = new DataGraphSchemaApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        String entitySlug = "my-entity"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination params. Defaults to count 200.  This parameter exists in alpha.
        Boolean includeSampleValues = true; // Boolean | When true, include sample values for each property. Defaults to false.  This parameter exists in alpha.
        BigDecimal samplesCount = new BigDecimal(78); // BigDecimal | Max number of sample values to return per property. Defaults to 20, min 1, max 100.  This parameter exists in alpha.
        try {
            ListPropertiesFromEntity200Response result = apiInstance.listPropertiesFromEntity(spaceId, entitySlug, pagination, includeSampleValues, samplesCount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataGraphSchemaApi#listPropertiesFromEntity");
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
| **entitySlug** | **String**|  | |
| **pagination** | [**PaginationInput**](.md)| Pagination params. Defaults to count 200.  This parameter exists in alpha. | [optional] |
| **includeSampleValues** | **Boolean**| When true, include sample values for each property. Defaults to false.  This parameter exists in alpha. | [optional] |
| **samplesCount** | **BigDecimal**| Max number of sample values to return per property. Defaults to 20, min 1, max 100.  This parameter exists in alpha. | [optional] |

### Return type

[**ListPropertiesFromEntity200Response**](ListPropertiesFromEntity200Response.md)

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
import com.segment.publicapi.api.DataGraphSchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DataGraphSchemaApi apiInstance = new DataGraphSchemaApi(defaultClient);
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
            System.err.println("Exception when calling DataGraphSchemaApi#listPropertiesFromEvent");
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


## Operation: listSampleValuesFromEntityProperty

> ListSampleValuesFromEntityProperty200Response listSampleValuesFromEntityProperty(spaceId, entitySlug, propertyName)

List Sample Values from Entity Property

Returns sample values for an Entity Property in a Space.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.    The rate limit for this endpoint is 25 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DataGraphSchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DataGraphSchemaApi apiInstance = new DataGraphSchemaApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        String entitySlug = "my-entity"; // String | 
        String propertyName = "email"; // String | 
        try {
            ListSampleValuesFromEntityProperty200Response result = apiInstance.listSampleValuesFromEntityProperty(spaceId, entitySlug, propertyName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataGraphSchemaApi#listSampleValuesFromEntityProperty");
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
| **entitySlug** | **String**|  | |
| **propertyName** | **String**|  | |

### Return type

[**ListSampleValuesFromEntityProperty200Response**](ListSampleValuesFromEntityProperty200Response.md)

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
import com.segment.publicapi.api.DataGraphSchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DataGraphSchemaApi apiInstance = new DataGraphSchemaApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        String eventName = "Order Completed"; // String | 
        String propertyName = "revenue"; // String | 
        EventPropertyType propertyType = EventPropertyType.fromValue("CONTEXT"); // EventPropertyType | The property type.  This parameter exists in alpha.
        try {
            ListSampleValuesFromEventProperty200Response result = apiInstance.listSampleValuesFromEventProperty(spaceId, eventName, propertyName, propertyType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataGraphSchemaApi#listSampleValuesFromEventProperty");
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


## Operation: listSampleValuesFromTrait

> ListSampleValuesFromTrait200Response listSampleValuesFromTrait(spaceId, traitKey, collection)

List Sample Values from Trait

Returns sample values for a Trait in a Space.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.    The rate limit for this endpoint is 25 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DataGraphSchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DataGraphSchemaApi apiInstance = new DataGraphSchemaApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        String traitKey = "email"; // String | 
        String collection = "accounts"; // String | Collection to get trait values for. Defaults to 'users'.  This parameter exists in alpha.
        try {
            ListSampleValuesFromTrait200Response result = apiInstance.listSampleValuesFromTrait(spaceId, traitKey, collection);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataGraphSchemaApi#listSampleValuesFromTrait");
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
| **traitKey** | **String**|  | |
| **collection** | **String**| Collection to get trait values for. Defaults to &#39;users&#39;.  This parameter exists in alpha. | [optional] [enum: accounts, users] |

### Return type

[**ListSampleValuesFromTrait200Response**](ListSampleValuesFromTrait200Response.md)

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


## Operation: listTraits

> ListTraits200Response listTraits(spaceId, pagination, sortBy, sortDir, search, collection, includeSampleValues, samplesCount)

List Traits

Returns a list of Traits for a Space.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.  &lt;div style&#x3D;\&quot;background-color: #e8f4fd; border: 1px solid #90caf9; border-radius: 6px; padding: 16px; margin: 16px 0; color: #0d47a1; line-height: 1.5;\&quot;&gt;   &lt;ul style&#x3D;\&quot;margin: 0; padding-left: 20px; font-size: 13px;\&quot;&gt;     &lt;li style&#x3D;\&quot;margin-bottom: 6px;\&quot;&gt;&lt;strong&gt;Forward-only pagination&lt;/strong&gt;: this endpoint does not support backward traversal. The &lt;code&gt;pagination.previous&lt;/code&gt; field is always absent; use &lt;code&gt;pagination.next&lt;/code&gt; to advance through pages.&lt;/li&gt;     &lt;li style&#x3D;\&quot;margin-bottom: 6px;\&quot;&gt;&lt;strong&gt;Approximate total count&lt;/strong&gt;: &lt;code&gt;pagination.totalEntries&lt;/code&gt; is an upper bound that decreases as you paginate — the final page reflects the exact deduplicated count.&lt;/li&gt;     &lt;li style&#x3D;\&quot;margin-bottom: 6px;\&quot;&gt;&lt;strong&gt;Duplicate entries&lt;/strong&gt;: when sorting by &lt;code&gt;lastSeenAt&lt;/code&gt;, duplicate trait entries may appear across pages for Spaces with more than 2,500 traits. Sorting by &lt;code&gt;trait&lt;/code&gt; is not affected.&lt;/li&gt;   &lt;/ul&gt; &lt;/div&gt;    The rate limit for this endpoint is 25 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DataGraphSchemaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DataGraphSchemaApi apiInstance = new DataGraphSchemaApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination params. Defaults to count 200.  This parameter exists in alpha.
        String sortBy = "lastSeenAt"; // String | Field to sort by. Defaults to 'trait'.  This parameter exists in alpha.
        String sortDir = "asc"; // String | Sort direction. Defaults to 'asc'.  This parameter exists in alpha.
        String search = "search_example"; // String | Filter traits by key substring.  This parameter exists in alpha.
        String collection = "accounts"; // String | Collection to list traits for. Defaults to 'users'.  This parameter exists in alpha.
        Boolean includeSampleValues = true; // Boolean | When true, include sample values for each trait. Defaults to false.  This parameter exists in alpha.
        BigDecimal samplesCount = new BigDecimal(78); // BigDecimal | Max number of sample values to return per trait. Defaults to 20, min 1, max 100.  This parameter exists in alpha.
        try {
            ListTraits200Response result = apiInstance.listTraits(spaceId, pagination, sortBy, sortDir, search, collection, includeSampleValues, samplesCount);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataGraphSchemaApi#listTraits");
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
| **sortBy** | **String**| Field to sort by. Defaults to &#39;trait&#39;.  This parameter exists in alpha. | [optional] [enum: lastSeenAt, trait] |
| **sortDir** | **String**| Sort direction. Defaults to &#39;asc&#39;.  This parameter exists in alpha. | [optional] [enum: asc, desc] |
| **search** | **String**| Filter traits by key substring.  This parameter exists in alpha. | [optional] |
| **collection** | **String**| Collection to list traits for. Defaults to &#39;users&#39;.  This parameter exists in alpha. | [optional] [enum: accounts, users] |
| **includeSampleValues** | **Boolean**| When true, include sample values for each trait. Defaults to false.  This parameter exists in alpha. | [optional] |
| **samplesCount** | **BigDecimal**| Max number of sample values to return per trait. Defaults to 20, min 1, max 100.  This parameter exists in alpha. | [optional] |

### Return type

[**ListTraits200Response**](ListTraits200Response.md)

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

