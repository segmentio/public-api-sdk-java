# DeliveryOverviewApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEgressFailedMetricsFromDeliveryOverview**](DeliveryOverviewApi.md#getEgressFailedMetricsFromDeliveryOverview) | **GET** /delivery-overview/failed-delivery | Get Egress Failed Metrics from Delivery Overview |
| [**getEgressSuccessMetricsFromDeliveryOverview**](DeliveryOverviewApi.md#getEgressSuccessMetricsFromDeliveryOverview) | **GET** /delivery-overview/successful-delivery | Get Egress Success Metrics from Delivery Overview |
| [**getFilteredAtDestinationMetricsFromDeliveryOverview**](DeliveryOverviewApi.md#getFilteredAtDestinationMetricsFromDeliveryOverview) | **GET** /delivery-overview/filtered-at-destination | Get Filtered At Destination Metrics from Delivery Overview |
| [**getFilteredAtSourceMetricsFromDeliveryOverview**](DeliveryOverviewApi.md#getFilteredAtSourceMetricsFromDeliveryOverview) | **GET** /delivery-overview/filtered-at-source | Get Filtered At Source Metrics from Delivery Overview |
| [**getIngressFailedMetricsFromDeliveryOverview**](DeliveryOverviewApi.md#getIngressFailedMetricsFromDeliveryOverview) | **GET** /delivery-overview/failed-on-ingest | Get Ingress Failed Metrics from Delivery Overview |
| [**getIngressSuccessMetricsFromDeliveryOverview**](DeliveryOverviewApi.md#getIngressSuccessMetricsFromDeliveryOverview) | **GET** /delivery-overview/successfully-received | Get Ingress Success Metrics from Delivery Overview |



## Operation: getEgressFailedMetricsFromDeliveryOverview

> GetEgressFailedMetricsFromDeliveryOverview200Response getEgressFailedMetricsFromDeliveryOverview(sourceId, destinationConfigId, startTime, endTime, groupBy, granularity, filter, pagination, subscriptionId)

Get Egress Failed Metrics from Delivery Overview

Get events that failed to be delivered to Destination.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DeliveryOverviewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DeliveryOverviewApi apiInstance = new DeliveryOverviewApi(defaultClient);
        String sourceId = "rh5BDZp6QDHvXFCkibm1pR"; // String | The sourceId for the Workspace.  This parameter exists in beta.
        String destinationConfigId = "fP7qoQw2HTWt9WdMr718gn"; // String | The id tied to a Workspace Destination.  This parameter exists in beta.
        String startTime = "2024-01-01T00:00:00Z"; // String | The ISO8601 formatted timestamp corresponding to the beginning of the requested timeframe, inclusive.  This parameter exists in beta.
        String endTime = "2024-01-03T00:00:00Z"; // String | The ISO8601 formatted timestamp corresponding to the end of the requested timeframe, noninclusive.  This parameter exists in beta.
        List<String> groupBy = Arrays.asList(); // List<String> | A comma-delimited list of strings representing one or more dimensions to group the result by.  Valid options are: `eventName`, `eventType`, `discardReason`, and `appVersion`.  This parameter exists in beta.
        String granularity = "day"; // String | The size of each bucket in the requested window.  Based on the granularity chosen, there are restrictions on the time range you can query:  **Minute**: - Max time range: 4 hours - Oldest possible start time: 48 hours in the past  **Hour**: - Max Time range: 14 days - Oldest possible start time: 30 days in the past  **Day**: - Max time range: 30 days - Oldest possible start time: 30 days in the past  This parameter exists in beta.
        DeliveryOverviewFilterBy filter = new DeliveryOverviewFilterBy(); // DeliveryOverviewFilterBy | An optional filter for `eventName`, `eventType`, `discardReason`, and/or `appVersion` that can be applied in addition to a `groupBy`. Example: `filter: {discardReason: ['discard1'], eventName: ['name1', 'name2'], eventType: ['type1']}`.  This parameter exists in beta.
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Params to specify the page cursor and count.  This parameter exists in beta.
        String subscriptionId = "subscriptionId_example"; // String | An optional filter for actions destinations, to filter by a specific action.  This parameter exists in beta.
        try {
            GetEgressFailedMetricsFromDeliveryOverview200Response result = apiInstance.getEgressFailedMetricsFromDeliveryOverview(sourceId, destinationConfigId, startTime, endTime, groupBy, granularity, filter, pagination, subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryOverviewApi#getEgressFailedMetricsFromDeliveryOverview");
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
| **sourceId** | **String**| The sourceId for the Workspace.  This parameter exists in beta. | |
| **destinationConfigId** | **String**| The id tied to a Workspace Destination.  This parameter exists in beta. | |
| **startTime** | **String**| The ISO8601 formatted timestamp corresponding to the beginning of the requested timeframe, inclusive.  This parameter exists in beta. | |
| **endTime** | **String**| The ISO8601 formatted timestamp corresponding to the end of the requested timeframe, noninclusive.  This parameter exists in beta. | |
| **groupBy** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of strings representing one or more dimensions to group the result by.  Valid options are: &#x60;eventName&#x60;, &#x60;eventType&#x60;, &#x60;discardReason&#x60;, and &#x60;appVersion&#x60;.  This parameter exists in beta. | [optional] |
| **granularity** | **String**| The size of each bucket in the requested window.  Based on the granularity chosen, there are restrictions on the time range you can query:  **Minute**: - Max time range: 4 hours - Oldest possible start time: 48 hours in the past  **Hour**: - Max Time range: 14 days - Oldest possible start time: 30 days in the past  **Day**: - Max time range: 30 days - Oldest possible start time: 30 days in the past  This parameter exists in beta. | [enum: day, hour, minute] |
| **filter** | [**DeliveryOverviewFilterBy**](.md)| An optional filter for &#x60;eventName&#x60;, &#x60;eventType&#x60;, &#x60;discardReason&#x60;, and/or &#x60;appVersion&#x60; that can be applied in addition to a &#x60;groupBy&#x60;. Example: &#x60;filter: {discardReason: [&#39;discard1&#39;], eventName: [&#39;name1&#39;, &#39;name2&#39;], eventType: [&#39;type1&#39;]}&#x60;.  This parameter exists in beta. | [optional] |
| **pagination** | [**PaginationInput**](.md)| Params to specify the page cursor and count.  This parameter exists in beta. | |
| **subscriptionId** | **String**| An optional filter for actions destinations, to filter by a specific action.  This parameter exists in beta. | [optional] |

### Return type

[**GetEgressFailedMetricsFromDeliveryOverview200Response**](GetEgressFailedMetricsFromDeliveryOverview200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1beta+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: getEgressSuccessMetricsFromDeliveryOverview

> GetEgressFailedMetricsFromDeliveryOverview200Response getEgressSuccessMetricsFromDeliveryOverview(sourceId, destinationConfigId, startTime, endTime, groupBy, granularity, filter, pagination, subscriptionId)

Get Egress Success Metrics from Delivery Overview

Get events successfully delivered to Destination.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DeliveryOverviewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DeliveryOverviewApi apiInstance = new DeliveryOverviewApi(defaultClient);
        String sourceId = "rh5BDZp6QDHvXFCkibm1pR"; // String | The sourceId for the Workspace.  This parameter exists in beta.
        String destinationConfigId = "fP7qoQw2HTWt9WdMr718gn"; // String | The id tied to a Workspace Destination.  This parameter exists in beta.
        String startTime = "2024-01-01T00:00:00Z"; // String | The ISO8601 formatted timestamp corresponding to the beginning of the requested timeframe, inclusive.  This parameter exists in beta.
        String endTime = "2024-01-03T00:00:00Z"; // String | The ISO8601 formatted timestamp corresponding to the end of the requested timeframe, noninclusive.  This parameter exists in beta.
        List<String> groupBy = Arrays.asList(); // List<String> | A comma-delimited list of strings representing one or more dimensions to group the result by.  Valid options are: `eventName`, `eventType`, `discardReason`, and `appVersion`.  This parameter exists in beta.
        String granularity = "day"; // String | The size of each bucket in the requested window.  Based on the granularity chosen, there are restrictions on the time range you can query:  **Minute**: - Max time range: 4 hours - Oldest possible start time: 48 hours in the past  **Hour**: - Max Time range: 14 days - Oldest possible start time: 30 days in the past  **Day**: - Max time range: 30 days - Oldest possible start time: 30 days in the past  This parameter exists in beta.
        DeliveryOverviewFilterBy filter = new DeliveryOverviewFilterBy(); // DeliveryOverviewFilterBy | An optional filter for `eventName`, `eventType`, `discardReason`, and/or `appVersion` that can be applied in addition to a `groupBy`. Example: `filter: {discardReason: ['discard1'], eventName: ['name1', 'name2'], eventType: ['type1']}`.  This parameter exists in beta.
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Params to specify the page cursor and count.  This parameter exists in beta.
        String subscriptionId = "subscriptionId_example"; // String | An optional filter for actions destinations, to filter by a specific action.  This parameter exists in beta.
        try {
            GetEgressFailedMetricsFromDeliveryOverview200Response result = apiInstance.getEgressSuccessMetricsFromDeliveryOverview(sourceId, destinationConfigId, startTime, endTime, groupBy, granularity, filter, pagination, subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryOverviewApi#getEgressSuccessMetricsFromDeliveryOverview");
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
| **sourceId** | **String**| The sourceId for the Workspace.  This parameter exists in beta. | |
| **destinationConfigId** | **String**| The id tied to a Workspace Destination.  This parameter exists in beta. | |
| **startTime** | **String**| The ISO8601 formatted timestamp corresponding to the beginning of the requested timeframe, inclusive.  This parameter exists in beta. | |
| **endTime** | **String**| The ISO8601 formatted timestamp corresponding to the end of the requested timeframe, noninclusive.  This parameter exists in beta. | |
| **groupBy** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of strings representing one or more dimensions to group the result by.  Valid options are: &#x60;eventName&#x60;, &#x60;eventType&#x60;, &#x60;discardReason&#x60;, and &#x60;appVersion&#x60;.  This parameter exists in beta. | [optional] |
| **granularity** | **String**| The size of each bucket in the requested window.  Based on the granularity chosen, there are restrictions on the time range you can query:  **Minute**: - Max time range: 4 hours - Oldest possible start time: 48 hours in the past  **Hour**: - Max Time range: 14 days - Oldest possible start time: 30 days in the past  **Day**: - Max time range: 30 days - Oldest possible start time: 30 days in the past  This parameter exists in beta. | [enum: day, hour, minute] |
| **filter** | [**DeliveryOverviewFilterBy**](.md)| An optional filter for &#x60;eventName&#x60;, &#x60;eventType&#x60;, &#x60;discardReason&#x60;, and/or &#x60;appVersion&#x60; that can be applied in addition to a &#x60;groupBy&#x60;. Example: &#x60;filter: {discardReason: [&#39;discard1&#39;], eventName: [&#39;name1&#39;, &#39;name2&#39;], eventType: [&#39;type1&#39;]}&#x60;.  This parameter exists in beta. | [optional] |
| **pagination** | [**PaginationInput**](.md)| Params to specify the page cursor and count.  This parameter exists in beta. | |
| **subscriptionId** | **String**| An optional filter for actions destinations, to filter by a specific action.  This parameter exists in beta. | [optional] |

### Return type

[**GetEgressFailedMetricsFromDeliveryOverview200Response**](GetEgressFailedMetricsFromDeliveryOverview200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1beta+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: getFilteredAtDestinationMetricsFromDeliveryOverview

> GetEgressFailedMetricsFromDeliveryOverview200Response getFilteredAtDestinationMetricsFromDeliveryOverview(sourceId, destinationConfigId, startTime, endTime, groupBy, granularity, filter, pagination, subscriptionId)

Get Filtered At Destination Metrics from Delivery Overview

Get events that were filtered at Destination.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DeliveryOverviewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DeliveryOverviewApi apiInstance = new DeliveryOverviewApi(defaultClient);
        String sourceId = "rh5BDZp6QDHvXFCkibm1pR"; // String | The sourceId for the Workspace.  This parameter exists in beta.
        String destinationConfigId = "fP7qoQw2HTWt9WdMr718gn"; // String | The id tied to a Workspace Destination.  This parameter exists in beta.
        String startTime = "2024-01-01T00:00:00Z"; // String | The ISO8601 formatted timestamp corresponding to the beginning of the requested timeframe, inclusive.  This parameter exists in beta.
        String endTime = "2024-01-03T00:00:00Z"; // String | The ISO8601 formatted timestamp corresponding to the end of the requested timeframe, noninclusive.  This parameter exists in beta.
        List<String> groupBy = Arrays.asList(); // List<String> | A comma-delimited list of strings representing one or more dimensions to group the result by.  Valid options are: `eventName`, `eventType`, `discardReason`, and `appVersion`.  This parameter exists in beta.
        String granularity = "day"; // String | The size of each bucket in the requested window.  Based on the granularity chosen, there are restrictions on the time range you can query:  **Minute**: - Max time range: 4 hours - Oldest possible start time: 48 hours in the past  **Hour**: - Max Time range: 14 days - Oldest possible start time: 30 days in the past  **Day**: - Max time range: 30 days - Oldest possible start time: 30 days in the past  This parameter exists in beta.
        DeliveryOverviewFilterBy filter = new DeliveryOverviewFilterBy(); // DeliveryOverviewFilterBy | An optional filter for `eventName`, `eventType`, `discardReason`, and/or `appVersion` that can be applied in addition to a `groupBy`. Example: `filter: {discardReason: ['discard1'], eventName: ['name1', 'name2'], eventType: ['type1']}`.  This parameter exists in beta.
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Params to specify the page cursor and count.  This parameter exists in beta.
        String subscriptionId = "subscriptionId_example"; // String | An optional filter for actions destinations, to filter by a specific action.  This parameter exists in beta.
        try {
            GetEgressFailedMetricsFromDeliveryOverview200Response result = apiInstance.getFilteredAtDestinationMetricsFromDeliveryOverview(sourceId, destinationConfigId, startTime, endTime, groupBy, granularity, filter, pagination, subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryOverviewApi#getFilteredAtDestinationMetricsFromDeliveryOverview");
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
| **sourceId** | **String**| The sourceId for the Workspace.  This parameter exists in beta. | |
| **destinationConfigId** | **String**| The id tied to a Workspace Destination.  This parameter exists in beta. | |
| **startTime** | **String**| The ISO8601 formatted timestamp corresponding to the beginning of the requested timeframe, inclusive.  This parameter exists in beta. | |
| **endTime** | **String**| The ISO8601 formatted timestamp corresponding to the end of the requested timeframe, noninclusive.  This parameter exists in beta. | |
| **groupBy** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of strings representing one or more dimensions to group the result by.  Valid options are: &#x60;eventName&#x60;, &#x60;eventType&#x60;, &#x60;discardReason&#x60;, and &#x60;appVersion&#x60;.  This parameter exists in beta. | [optional] |
| **granularity** | **String**| The size of each bucket in the requested window.  Based on the granularity chosen, there are restrictions on the time range you can query:  **Minute**: - Max time range: 4 hours - Oldest possible start time: 48 hours in the past  **Hour**: - Max Time range: 14 days - Oldest possible start time: 30 days in the past  **Day**: - Max time range: 30 days - Oldest possible start time: 30 days in the past  This parameter exists in beta. | [enum: day, hour, minute] |
| **filter** | [**DeliveryOverviewFilterBy**](.md)| An optional filter for &#x60;eventName&#x60;, &#x60;eventType&#x60;, &#x60;discardReason&#x60;, and/or &#x60;appVersion&#x60; that can be applied in addition to a &#x60;groupBy&#x60;. Example: &#x60;filter: {discardReason: [&#39;discard1&#39;], eventName: [&#39;name1&#39;, &#39;name2&#39;], eventType: [&#39;type1&#39;]}&#x60;.  This parameter exists in beta. | [optional] |
| **pagination** | [**PaginationInput**](.md)| Params to specify the page cursor and count.  This parameter exists in beta. | |
| **subscriptionId** | **String**| An optional filter for actions destinations, to filter by a specific action.  This parameter exists in beta. | [optional] |

### Return type

[**GetEgressFailedMetricsFromDeliveryOverview200Response**](GetEgressFailedMetricsFromDeliveryOverview200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1beta+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: getFilteredAtSourceMetricsFromDeliveryOverview

> GetEgressFailedMetricsFromDeliveryOverview200Response getFilteredAtSourceMetricsFromDeliveryOverview(sourceId, destinationConfigId, startTime, endTime, groupBy, granularity, filter, pagination, subscriptionId)

Get Filtered At Source Metrics from Delivery Overview

Get events that were filtered at Source.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DeliveryOverviewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DeliveryOverviewApi apiInstance = new DeliveryOverviewApi(defaultClient);
        String sourceId = "rh5BDZp6QDHvXFCkibm1pR"; // String | The sourceId for the Workspace.  This parameter exists in beta.
        String destinationConfigId = "destinationConfigId_example"; // String | The id tied to a Workspace Destination.  This parameter exists in beta.
        String startTime = "2024-01-01T00:00:00Z"; // String | The ISO8601 formatted timestamp corresponding to the beginning of the requested timeframe, inclusive.  This parameter exists in beta.
        String endTime = "2024-01-03T00:00:00Z"; // String | The ISO8601 formatted timestamp corresponding to the end of the requested timeframe, noninclusive.  This parameter exists in beta.
        List<String> groupBy = Arrays.asList(); // List<String> | A comma-delimited list of strings representing one or more dimensions to group the result by.  Valid options are: `eventName`, `eventType`, `discardReason`, and `appVersion`.  This parameter exists in beta.
        String granularity = "day"; // String | The size of each bucket in the requested window.  Based on the granularity chosen, there are restrictions on the time range you can query:  **Minute**: - Max time range: 4 hours - Oldest possible start time: 48 hours in the past  **Hour**: - Max Time range: 14 days - Oldest possible start time: 30 days in the past  **Day**: - Max time range: 30 days - Oldest possible start time: 30 days in the past  This parameter exists in beta.
        DeliveryOverviewFilterBy filter = new DeliveryOverviewFilterBy(); // DeliveryOverviewFilterBy | An optional filter for `eventName`, `eventType`, `discardReason`, and/or `appVersion` that can be applied in addition to a `groupBy`. Example: `filter: {discardReason: ['discard1'], eventName: ['name1', 'name2'], eventType: ['type1']}`.  This parameter exists in beta.
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Optional params to specify the page cursor and count.  This parameter exists in beta.
        String subscriptionId = "subscriptionId_example"; // String | An optional filter for actions destinations, to filter by a specific action.  This parameter exists in beta.
        try {
            GetEgressFailedMetricsFromDeliveryOverview200Response result = apiInstance.getFilteredAtSourceMetricsFromDeliveryOverview(sourceId, destinationConfigId, startTime, endTime, groupBy, granularity, filter, pagination, subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryOverviewApi#getFilteredAtSourceMetricsFromDeliveryOverview");
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
| **sourceId** | **String**| The sourceId for the Workspace.  This parameter exists in beta. | |
| **destinationConfigId** | **String**| The id tied to a Workspace Destination.  This parameter exists in beta. | [optional] |
| **startTime** | **String**| The ISO8601 formatted timestamp corresponding to the beginning of the requested timeframe, inclusive.  This parameter exists in beta. | |
| **endTime** | **String**| The ISO8601 formatted timestamp corresponding to the end of the requested timeframe, noninclusive.  This parameter exists in beta. | |
| **groupBy** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of strings representing one or more dimensions to group the result by.  Valid options are: &#x60;eventName&#x60;, &#x60;eventType&#x60;, &#x60;discardReason&#x60;, and &#x60;appVersion&#x60;.  This parameter exists in beta. | [optional] |
| **granularity** | **String**| The size of each bucket in the requested window.  Based on the granularity chosen, there are restrictions on the time range you can query:  **Minute**: - Max time range: 4 hours - Oldest possible start time: 48 hours in the past  **Hour**: - Max Time range: 14 days - Oldest possible start time: 30 days in the past  **Day**: - Max time range: 30 days - Oldest possible start time: 30 days in the past  This parameter exists in beta. | [enum: day, hour, minute] |
| **filter** | [**DeliveryOverviewFilterBy**](.md)| An optional filter for &#x60;eventName&#x60;, &#x60;eventType&#x60;, &#x60;discardReason&#x60;, and/or &#x60;appVersion&#x60; that can be applied in addition to a &#x60;groupBy&#x60;. Example: &#x60;filter: {discardReason: [&#39;discard1&#39;], eventName: [&#39;name1&#39;, &#39;name2&#39;], eventType: [&#39;type1&#39;]}&#x60;.  This parameter exists in beta. | [optional] |
| **pagination** | [**PaginationInput**](.md)| Optional params to specify the page cursor and count.  This parameter exists in beta. | |
| **subscriptionId** | **String**| An optional filter for actions destinations, to filter by a specific action.  This parameter exists in beta. | [optional] |

### Return type

[**GetEgressFailedMetricsFromDeliveryOverview200Response**](GetEgressFailedMetricsFromDeliveryOverview200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1beta+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: getIngressFailedMetricsFromDeliveryOverview

> GetEgressFailedMetricsFromDeliveryOverview200Response getIngressFailedMetricsFromDeliveryOverview(sourceId, destinationConfigId, startTime, endTime, groupBy, granularity, filter, pagination, subscriptionId)

Get Ingress Failed Metrics from Delivery Overview

Get events that failed on ingest.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DeliveryOverviewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DeliveryOverviewApi apiInstance = new DeliveryOverviewApi(defaultClient);
        String sourceId = "rh5BDZp6QDHvXFCkibm1pR"; // String | The sourceId for the Workspace.  This parameter exists in beta.
        String destinationConfigId = "destinationConfigId_example"; // String | The id tied to a Workspace Destination.  This parameter exists in beta.
        String startTime = "2024-01-01T00:00:00Z"; // String | The ISO8601 formatted timestamp corresponding to the beginning of the requested timeframe, inclusive.  This parameter exists in beta.
        String endTime = "2024-01-03T00:00:00Z"; // String | The ISO8601 formatted timestamp corresponding to the end of the requested timeframe, noninclusive.  This parameter exists in beta.
        List<String> groupBy = Arrays.asList(); // List<String> | A comma-delimited list of strings representing one or more dimensions to group the result by.  Valid options are: `eventName`, `eventType`, `discardReason`, and `appVersion`.  This parameter exists in beta.
        String granularity = "day"; // String | The size of each bucket in the requested window.  Based on the granularity chosen, there are restrictions on the time range you can query:  **Minute**: - Max time range: 4 hours - Oldest possible start time: 48 hours in the past  **Hour**: - Max Time range: 14 days - Oldest possible start time: 30 days in the past  **Day**: - Max time range: 30 days - Oldest possible start time: 30 days in the past  This parameter exists in beta.
        DeliveryOverviewFilterBy filter = new DeliveryOverviewFilterBy(); // DeliveryOverviewFilterBy | An optional filter for `eventName`, `eventType`, `discardReason`, and/or `appVersion` that can be applied in addition to a `groupBy`. Example: `filter: {discardReason: ['discard1'], eventName: ['name1', 'name2'], eventType: ['type1']}`.  This parameter exists in beta.
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Optional params to specify the page cursor and count.  This parameter exists in beta.
        String subscriptionId = "subscriptionId_example"; // String | An optional filter for actions destinations, to filter by a specific action.  This parameter exists in beta.
        try {
            GetEgressFailedMetricsFromDeliveryOverview200Response result = apiInstance.getIngressFailedMetricsFromDeliveryOverview(sourceId, destinationConfigId, startTime, endTime, groupBy, granularity, filter, pagination, subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryOverviewApi#getIngressFailedMetricsFromDeliveryOverview");
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
| **sourceId** | **String**| The sourceId for the Workspace.  This parameter exists in beta. | |
| **destinationConfigId** | **String**| The id tied to a Workspace Destination.  This parameter exists in beta. | [optional] |
| **startTime** | **String**| The ISO8601 formatted timestamp corresponding to the beginning of the requested timeframe, inclusive.  This parameter exists in beta. | |
| **endTime** | **String**| The ISO8601 formatted timestamp corresponding to the end of the requested timeframe, noninclusive.  This parameter exists in beta. | |
| **groupBy** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of strings representing one or more dimensions to group the result by.  Valid options are: &#x60;eventName&#x60;, &#x60;eventType&#x60;, &#x60;discardReason&#x60;, and &#x60;appVersion&#x60;.  This parameter exists in beta. | [optional] |
| **granularity** | **String**| The size of each bucket in the requested window.  Based on the granularity chosen, there are restrictions on the time range you can query:  **Minute**: - Max time range: 4 hours - Oldest possible start time: 48 hours in the past  **Hour**: - Max Time range: 14 days - Oldest possible start time: 30 days in the past  **Day**: - Max time range: 30 days - Oldest possible start time: 30 days in the past  This parameter exists in beta. | [enum: day, hour, minute] |
| **filter** | [**DeliveryOverviewFilterBy**](.md)| An optional filter for &#x60;eventName&#x60;, &#x60;eventType&#x60;, &#x60;discardReason&#x60;, and/or &#x60;appVersion&#x60; that can be applied in addition to a &#x60;groupBy&#x60;. Example: &#x60;filter: {discardReason: [&#39;discard1&#39;], eventName: [&#39;name1&#39;, &#39;name2&#39;], eventType: [&#39;type1&#39;]}&#x60;.  This parameter exists in beta. | [optional] |
| **pagination** | [**PaginationInput**](.md)| Optional params to specify the page cursor and count.  This parameter exists in beta. | |
| **subscriptionId** | **String**| An optional filter for actions destinations, to filter by a specific action.  This parameter exists in beta. | [optional] |

### Return type

[**GetEgressFailedMetricsFromDeliveryOverview200Response**](GetEgressFailedMetricsFromDeliveryOverview200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1beta+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: getIngressSuccessMetricsFromDeliveryOverview

> GetEgressFailedMetricsFromDeliveryOverview200Response getIngressSuccessMetricsFromDeliveryOverview(sourceId, destinationConfigId, startTime, endTime, groupBy, granularity, filter, pagination, subscriptionId)

Get Ingress Success Metrics from Delivery Overview

Get events that were successfully received by Segment.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DeliveryOverviewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DeliveryOverviewApi apiInstance = new DeliveryOverviewApi(defaultClient);
        String sourceId = "rh5BDZp6QDHvXFCkibm1pR"; // String | The sourceId for the Workspace.  This parameter exists in beta.
        String destinationConfigId = "destinationConfigId_example"; // String | The id tied to a Workspace Destination.  This parameter exists in beta.
        String startTime = "2024-01-01T00:00:00Z"; // String | The ISO8601 formatted timestamp corresponding to the beginning of the requested timeframe, inclusive.  This parameter exists in beta.
        String endTime = "2024-01-03T00:00:00Z"; // String | The ISO8601 formatted timestamp corresponding to the end of the requested timeframe, noninclusive.  This parameter exists in beta.
        List<String> groupBy = Arrays.asList(); // List<String> | A comma-delimited list of strings representing one or more dimensions to group the result by.  Valid options are: `eventName`, `eventType`, `discardReason`, and `appVersion`.  This parameter exists in beta.
        String granularity = "day"; // String | The size of each bucket in the requested window.  Based on the granularity chosen, there are restrictions on the time range you can query:  **Minute**: - Max time range: 4 hours - Oldest possible start time: 48 hours in the past  **Hour**: - Max Time range: 14 days - Oldest possible start time: 30 days in the past  **Day**: - Max time range: 30 days - Oldest possible start time: 30 days in the past  This parameter exists in beta.
        DeliveryOverviewFilterBy filter = new DeliveryOverviewFilterBy(); // DeliveryOverviewFilterBy | An optional filter for `eventName`, `eventType`, `discardReason`, and/or `appVersion` that can be applied in addition to a `groupBy`. Example: `filter: {discardReason: ['discard1'], eventName: ['name1', 'name2'], eventType: ['type1']}`.  This parameter exists in beta.
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Optional params to specify the page cursor and count.  This parameter exists in beta.
        String subscriptionId = "subscriptionId_example"; // String | An optional filter for actions destinations, to filter by a specific action.  This parameter exists in beta.
        try {
            GetEgressFailedMetricsFromDeliveryOverview200Response result = apiInstance.getIngressSuccessMetricsFromDeliveryOverview(sourceId, destinationConfigId, startTime, endTime, groupBy, granularity, filter, pagination, subscriptionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeliveryOverviewApi#getIngressSuccessMetricsFromDeliveryOverview");
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
| **sourceId** | **String**| The sourceId for the Workspace.  This parameter exists in beta. | |
| **destinationConfigId** | **String**| The id tied to a Workspace Destination.  This parameter exists in beta. | [optional] |
| **startTime** | **String**| The ISO8601 formatted timestamp corresponding to the beginning of the requested timeframe, inclusive.  This parameter exists in beta. | |
| **endTime** | **String**| The ISO8601 formatted timestamp corresponding to the end of the requested timeframe, noninclusive.  This parameter exists in beta. | |
| **groupBy** | [**List&lt;String&gt;**](String.md)| A comma-delimited list of strings representing one or more dimensions to group the result by.  Valid options are: &#x60;eventName&#x60;, &#x60;eventType&#x60;, &#x60;discardReason&#x60;, and &#x60;appVersion&#x60;.  This parameter exists in beta. | [optional] |
| **granularity** | **String**| The size of each bucket in the requested window.  Based on the granularity chosen, there are restrictions on the time range you can query:  **Minute**: - Max time range: 4 hours - Oldest possible start time: 48 hours in the past  **Hour**: - Max Time range: 14 days - Oldest possible start time: 30 days in the past  **Day**: - Max time range: 30 days - Oldest possible start time: 30 days in the past  This parameter exists in beta. | [enum: day, hour, minute] |
| **filter** | [**DeliveryOverviewFilterBy**](.md)| An optional filter for &#x60;eventName&#x60;, &#x60;eventType&#x60;, &#x60;discardReason&#x60;, and/or &#x60;appVersion&#x60; that can be applied in addition to a &#x60;groupBy&#x60;. Example: &#x60;filter: {discardReason: [&#39;discard1&#39;], eventName: [&#39;name1&#39;, &#39;name2&#39;], eventType: [&#39;type1&#39;]}&#x60;.  This parameter exists in beta. | [optional] |
| **pagination** | [**PaginationInput**](.md)| Optional params to specify the page cursor and count.  This parameter exists in beta. | |
| **subscriptionId** | **String**| An optional filter for actions destinations, to filter by a specific action.  This parameter exists in beta. | [optional] |

### Return type

[**GetEgressFailedMetricsFromDeliveryOverview200Response**](GetEgressFailedMetricsFromDeliveryOverview200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1beta+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |

