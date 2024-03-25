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

> GetEgressFailedMetricsFromDeliveryOverview200Response getEgressFailedMetricsFromDeliveryOverview(metrics)

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
        GetDeliveryOverviewDestMetricsBetaInput metrics = new GetDeliveryOverviewDestMetricsBetaInput(); // GetDeliveryOverviewDestMetricsBetaInput | Metrics for this Destination pipeline step.  This parameter exists in beta.
        try {
            GetEgressFailedMetricsFromDeliveryOverview200Response result = apiInstance.getEgressFailedMetricsFromDeliveryOverview(metrics);
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
| **metrics** | [**GetDeliveryOverviewDestMetricsBetaInput**](.md)| Metrics for this Destination pipeline step.  This parameter exists in beta. | |

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

> GetEgressFailedMetricsFromDeliveryOverview200Response getEgressSuccessMetricsFromDeliveryOverview(metrics)

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
        GetDeliveryOverviewDestMetricsBetaInput metrics = new GetDeliveryOverviewDestMetricsBetaInput(); // GetDeliveryOverviewDestMetricsBetaInput | Metrics for this Destination pipeline step.  This parameter exists in beta.
        try {
            GetEgressFailedMetricsFromDeliveryOverview200Response result = apiInstance.getEgressSuccessMetricsFromDeliveryOverview(metrics);
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
| **metrics** | [**GetDeliveryOverviewDestMetricsBetaInput**](.md)| Metrics for this Destination pipeline step.  This parameter exists in beta. | |

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

> GetEgressFailedMetricsFromDeliveryOverview200Response getFilteredAtDestinationMetricsFromDeliveryOverview(metrics)

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
        GetDeliveryOverviewDestMetricsBetaInput metrics = new GetDeliveryOverviewDestMetricsBetaInput(); // GetDeliveryOverviewDestMetricsBetaInput | Metrics for this Destination pipeline step.  This parameter exists in beta.
        try {
            GetEgressFailedMetricsFromDeliveryOverview200Response result = apiInstance.getFilteredAtDestinationMetricsFromDeliveryOverview(metrics);
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
| **metrics** | [**GetDeliveryOverviewDestMetricsBetaInput**](.md)| Metrics for this Destination pipeline step.  This parameter exists in beta. | |

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

> GetEgressFailedMetricsFromDeliveryOverview200Response getFilteredAtSourceMetricsFromDeliveryOverview(metrics)

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
        GetDeliveryOverviewSourceMetricsBetaInput metrics = new GetDeliveryOverviewSourceMetricsBetaInput(); // GetDeliveryOverviewSourceMetricsBetaInput | Metrics for this Source pipeline step.  This parameter exists in beta.
        try {
            GetEgressFailedMetricsFromDeliveryOverview200Response result = apiInstance.getFilteredAtSourceMetricsFromDeliveryOverview(metrics);
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
| **metrics** | [**GetDeliveryOverviewSourceMetricsBetaInput**](.md)| Metrics for this Source pipeline step.  This parameter exists in beta. | |

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

> GetEgressFailedMetricsFromDeliveryOverview200Response getIngressFailedMetricsFromDeliveryOverview(metrics)

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
        GetDeliveryOverviewSourceMetricsBetaInput metrics = new GetDeliveryOverviewSourceMetricsBetaInput(); // GetDeliveryOverviewSourceMetricsBetaInput | Metrics for this Source pipeline step.  This parameter exists in beta.
        try {
            GetEgressFailedMetricsFromDeliveryOverview200Response result = apiInstance.getIngressFailedMetricsFromDeliveryOverview(metrics);
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
| **metrics** | [**GetDeliveryOverviewSourceMetricsBetaInput**](.md)| Metrics for this Source pipeline step.  This parameter exists in beta. | |

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

> GetEgressFailedMetricsFromDeliveryOverview200Response getIngressSuccessMetricsFromDeliveryOverview(metrics)

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
        GetDeliveryOverviewSourceMetricsBetaInput metrics = new GetDeliveryOverviewSourceMetricsBetaInput(); // GetDeliveryOverviewSourceMetricsBetaInput | Metrics for this Source pipeline step.  This parameter exists in beta.
        try {
            GetEgressFailedMetricsFromDeliveryOverview200Response result = apiInstance.getIngressSuccessMetricsFromDeliveryOverview(metrics);
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
| **metrics** | [**GetDeliveryOverviewSourceMetricsBetaInput**](.md)| Metrics for this Source pipeline step.  This parameter exists in beta. | |

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

