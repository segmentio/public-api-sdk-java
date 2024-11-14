# DbtApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDbtModelSyncTrigger**](DbtApi.md#createDbtModelSyncTrigger) | **POST** /dbt-model-syncs/trigger | Create Dbt Model Sync Trigger |



## Operation: createDbtModelSyncTrigger

> CreateDbtModelSyncTrigger200Response createDbtModelSyncTrigger(createDbtModelSyncTriggerInput)

Create Dbt Model Sync Trigger

Creates a trigger for a new dbt model sync for a Source.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.DbtApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        DbtApi apiInstance = new DbtApi(defaultClient);
        CreateDbtModelSyncTriggerInput createDbtModelSyncTriggerInput = new CreateDbtModelSyncTriggerInput(); // CreateDbtModelSyncTriggerInput | 
        try {
            CreateDbtModelSyncTrigger200Response result = apiInstance.createDbtModelSyncTrigger(createDbtModelSyncTriggerInput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbtApi#createDbtModelSyncTrigger");
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
| **createDbtModelSyncTriggerInput** | [**CreateDbtModelSyncTriggerInput**](CreateDbtModelSyncTriggerInput.md)|  | |

### Return type

[**CreateDbtModelSyncTrigger200Response**](CreateDbtModelSyncTrigger200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.segment.v1+json
- **Accept**: application/vnd.segment.v1+json, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |

