# JourneysApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createJourney**](JourneysApi.md#createJourney) | **POST** /spaces/{spaceId}/journeys | Create Journey |



## Operation: createJourney

> CreateJourney200Response createJourney(spaceId, createJourneyAlphaInput)

Create Journey

Creates a Journey in the given Engage space. Accepts an XState journey definition and creates the journey in draft state.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com. 

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
        String spaceId = "9aQ1Lj62S4bomZKLF4DPqW"; // String | 
        CreateJourneyAlphaInput createJourneyAlphaInput = new CreateJourneyAlphaInput(); // CreateJourneyAlphaInput | 
        try {
            CreateJourney200Response result = apiInstance.createJourney(spaceId, createJourneyAlphaInput);
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

[**CreateJourney200Response**](CreateJourney200Response.md)

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

