# TestingApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**echo**](TestingApi.md#echo) | **GET** /echo | Echo |



## Operation: echo

> Echo200Response echo(message, delay, triggerError, triggerMultipleErrors, triggerUnexpectedError, statusCode)

Echo

Public Echo endpoint.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.TestingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        TestingApi apiInstance = new TestingApi(defaultClient);
        String message = "Hello, World!"; // String | Sets the response `message` field. The response contains this field's entry.  This parameter exists in alpha.
        BigDecimal delay = new BigDecimal(78); // BigDecimal | The desired response delay, in milliseconds.  This parameter exists in alpha.
        Boolean triggerError = true; // Boolean | If `true`, returns an HTTP `4xx` error that contains the string in `message`.  This parameter exists in alpha.
        Boolean triggerMultipleErrors = true; // Boolean | If `true`, returns an HTTP `4xx` error that contains the value of the `message` field in the error message array.  This has no effect if the request sets `triggerError`.  This parameter exists in alpha.
        Boolean triggerUnexpectedError = true; // Boolean | If `true`, triggers a `500` error.  This has no effect if the request sets either `triggerError` or `triggerMultipleErrors`.  This parameter exists in alpha.
        BigDecimal statusCode = new BigDecimal(78); // BigDecimal | Sets the HTTP status code to return.  This parameter exists in alpha.
        try {
            Echo200Response result = apiInstance.echo(message, delay, triggerError, triggerMultipleErrors, triggerUnexpectedError, statusCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TestingApi#echo");
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
| **message** | **String**| Sets the response &#x60;message&#x60; field. The response contains this field&#39;s entry.  This parameter exists in alpha. | |
| **delay** | **BigDecimal**| The desired response delay, in milliseconds.  This parameter exists in alpha. | [optional] |
| **triggerError** | **Boolean**| If &#x60;true&#x60;, returns an HTTP &#x60;4xx&#x60; error that contains the string in &#x60;message&#x60;.  This parameter exists in alpha. | [optional] |
| **triggerMultipleErrors** | **Boolean**| If &#x60;true&#x60;, returns an HTTP &#x60;4xx&#x60; error that contains the value of the &#x60;message&#x60; field in the error message array.  This has no effect if the request sets &#x60;triggerError&#x60;.  This parameter exists in alpha. | [optional] |
| **triggerUnexpectedError** | **Boolean**| If &#x60;true&#x60;, triggers a &#x60;500&#x60; error.  This has no effect if the request sets either &#x60;triggerError&#x60; or &#x60;triggerMultipleErrors&#x60;.  This parameter exists in alpha. | [optional] |
| **statusCode** | **BigDecimal**| Sets the HTTP status code to return.  This parameter exists in alpha. | [optional] |

### Return type

[**Echo200Response**](Echo200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |

