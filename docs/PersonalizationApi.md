# PersonalizationApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPersonalizationData**](PersonalizationApi.md#getPersonalizationData) | **GET** /personalization/v1/spaces/{spaceId}/{entityType}/{entityIdentifier} | Get Personalization Data |



## Operation: getPersonalizationData

> GetPersonalizationData200Response getPersonalizationData(spaceId, entityType, entityIdentifier, childrenEntityType)

Get Personalization Data

Get Personalization Data.  • This endpoint is in **Alpha** testing.  Please submit any feedback by sending an email to friends@segment.com.   • In order to successfully call this endpoint, the specified Workspace needs to have the Entities feature enabled. Please reach out to your customer success manager for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.PersonalizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        PersonalizationApi apiInstance = new PersonalizationApi(defaultClient);
        String spaceId = "spaceId"; // String | 
        String entityType = "profile"; // String | 
        String entityIdentifier = "identifier"; // String | 
        String childrenEntityType = "childrenEntityType_example"; // String | Child entity type.  This parameter exists in alpha.
        try {
            GetPersonalizationData200Response result = apiInstance.getPersonalizationData(spaceId, entityType, entityIdentifier, childrenEntityType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PersonalizationApi#getPersonalizationData");
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
| **entityType** | **String**|  | |
| **entityIdentifier** | **String**|  | |
| **childrenEntityType** | **String**| Child entity type.  This parameter exists in alpha. | [optional] |

### Return type

[**GetPersonalizationData200Response**](GetPersonalizationData200Response.md)

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

