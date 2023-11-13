# EventsApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEventsVolumeFromWorkspace**](EventsApi.md#getEventsVolumeFromWorkspace) | **GET** /events/volume | Get Events Volume from Workspace |



## Operation: getEventsVolumeFromWorkspace

> GetEventsVolumeFromWorkspace200Response getEventsVolumeFromWorkspace(granularity, startTime, endTime, groupBy, sourceId, eventName, eventType, appVersion, pagination)

Get Events Volume from Workspace

Enumerates the Workspace event volumes over time in minute increments.   The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.EventsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        EventsApi apiInstance = new EventsApi(defaultClient);
        String granularity = "DAY"; // String | The size of each bucket in the requested window.  This parameter exists in v1.
        String startTime = "2021-10-28T00:00:00Z"; // String | The ISO8601 formatted timestamp that corresponds to the beginning of the requested time frame, inclusive.  This parameter exists in v1.
        String endTime = "2021-10-29T16:40:00Z"; // String | The ISO8601 formatted timestamp that corresponds to the end of the requested time frame, noninclusive. Segment recommends that you lag queries 1 minute behind clock time to reduce the risk for latency to impact the counts.  This parameter exists in v1.
        List<String> groupBy = Arrays.asList(); // List<String> | A comma-delimited list of strings that represents the dimensions to group the result by. The options are: `eventName`, `eventType` and `source`.  This parameter exists in v1.
        List<String> sourceId = Arrays.asList(); // List<String> | A list of strings which filters the results to the given SourceIds.  This parameter exists in v1.
        List<String> eventName = Arrays.asList(); // List<String> | A list of strings which filters the results to the given EventNames.  This parameter exists in v1.
        List<String> eventType = Arrays.asList(); // List<String> | A list of strings which filters the results to the given EventTypes.  This parameter exists in v1.
        List<String> appVersion = Arrays.asList(); // List<String> | A list of strings which filters the results to the given AppVersions.  This parameter exists in v1.
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination input for event volume by Workspace.  This parameter exists in v1.
        try {
            GetEventsVolumeFromWorkspace200Response result = apiInstance.getEventsVolumeFromWorkspace(granularity, startTime, endTime, groupBy, sourceId, eventName, eventType, appVersion, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#getEventsVolumeFromWorkspace");
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
| **granularity** | **String**| The size of each bucket in the requested window.  This parameter exists in v1. | [enum: DAY, HOUR, MINUTE] |
| **startTime** | **String**| The ISO8601 formatted timestamp that corresponds to the beginning of the requested time frame, inclusive.  This parameter exists in v1. | |
| **endTime** | **String**| The ISO8601 formatted timestamp that corresponds to the end of the requested time frame, noninclusive. Segment recommends that you lag queries 1 minute behind clock time to reduce the risk for latency to impact the counts.  This parameter exists in v1. | |
| **groupBy** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of strings that represents the dimensions to group the result by. The options are: &#x60;eventName&#x60;, &#x60;eventType&#x60; and &#x60;source&#x60;.  This parameter exists in v1. | [optional] |
| **sourceId** | [**List&lt;String&gt;**](String.md)| A list of strings which filters the results to the given SourceIds.  This parameter exists in v1. | [optional] |
| **eventName** | [**List&lt;String&gt;**](String.md)| A list of strings which filters the results to the given EventNames.  This parameter exists in v1. | [optional] |
| **eventType** | [**List&lt;String&gt;**](String.md)| A list of strings which filters the results to the given EventTypes.  This parameter exists in v1. | [optional] |
| **appVersion** | [**List&lt;String&gt;**](String.md)| A list of strings which filters the results to the given AppVersions.  This parameter exists in v1. | [optional] |
| **pagination** | [**PaginationInput**](.md)| Pagination input for event volume by Workspace.  This parameter exists in v1. | [optional] |

### Return type

[**GetEventsVolumeFromWorkspace200Response**](GetEventsVolumeFromWorkspace200Response.md)

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

