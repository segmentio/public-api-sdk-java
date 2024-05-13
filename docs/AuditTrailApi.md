# AuditTrailApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listAuditEvents**](AuditTrailApi.md#listAuditEvents) | **GET** /audit-events | List Audit Events |



## Operation: listAuditEvents

> ListAuditEvents200Response listAuditEvents(startTime, endTime, resourceId, resourceType, pagination)

List Audit Events

Returns a list of Audit Trail events.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.AuditTrailApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        AuditTrailApi apiInstance = new AuditTrailApi(defaultClient);
        String startTime = "startTime_example"; // String | Filter response to events that happened after this time.  This parameter exists in v1.
        String endTime = "endTime_example"; // String | Filter response to events that happened before this time. Defaults to the current time, or the end time from the pagination cursor.  This parameter exists in v1.
        String resourceId = "9aQ1Lj62S4bomZKLF4DPqW"; // String | Filter response to events that affect a specific resource, for example, a single Source.  This parameter exists in v1.
        String resourceType = "resourceType_example"; // String | Filter response to events that affect a specific type, for example, Sources, Warehouses, and Tracking Plans.  This parameter exists in v1.
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Defines the pagination parameters.  This parameter exists in v1.
        try {
            ListAuditEvents200Response result = apiInstance.listAuditEvents(startTime, endTime, resourceId, resourceType, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuditTrailApi#listAuditEvents");
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
| **startTime** | **String**| Filter response to events that happened after this time.  This parameter exists in v1. | [optional] |
| **endTime** | **String**| Filter response to events that happened before this time. Defaults to the current time, or the end time from the pagination cursor.  This parameter exists in v1. | [optional] |
| **resourceId** | **String**| Filter response to events that affect a specific resource, for example, a single Source.  This parameter exists in v1. | [optional] |
| **resourceType** | **String**| Filter response to events that affect a specific type, for example, Sources, Warehouses, and Tracking Plans.  This parameter exists in v1. | [optional] |
| **pagination** | [**PaginationInput**](.md)| Defines the pagination parameters.  This parameter exists in v1. | [optional] |

### Return type

[**ListAuditEvents200Response**](ListAuditEvents200Response.md)

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

