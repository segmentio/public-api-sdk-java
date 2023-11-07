# IamRolesApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listRoles**](IamRolesApi.md#listRoles) | **GET** /roles | List Roles |



## Operation: listRoles

> ListRoles200Response listRoles(pagination)

List Roles

Returns a list of Roles available to apply to permissions for users and/or groups.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamRolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamRolesApi apiInstance = new IamRolesApi(defaultClient);
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination for roles.  This parameter exists in v1.
        try {
            ListRoles200Response result = apiInstance.listRoles(pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamRolesApi#listRoles");
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
| **pagination** | [**PaginationInput**](.md)| Pagination for roles.  This parameter exists in v1. | |

### Return type

[**ListRoles200Response**](ListRoles200Response.md)

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

