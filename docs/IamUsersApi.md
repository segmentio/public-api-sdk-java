# IamUsersApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPermissionsToUser**](IamUsersApi.md#addPermissionsToUser) | **POST** /users/{userId}/permissions | Add Permissions to User |
| [**createInvites**](IamUsersApi.md#createInvites) | **POST** /invites | Create Invites |
| [**deleteInvites**](IamUsersApi.md#deleteInvites) | **DELETE** /invites | Delete Invites |
| [**deleteUsers**](IamUsersApi.md#deleteUsers) | **DELETE** /users | Delete Users |
| [**getUser**](IamUsersApi.md#getUser) | **GET** /users/{userId} | Get User |
| [**listInvites**](IamUsersApi.md#listInvites) | **GET** /invites | List Invites |
| [**listUserGroupsFromUser**](IamUsersApi.md#listUserGroupsFromUser) | **GET** /users/{userId}/groups | List User Groups from User |
| [**listUsers**](IamUsersApi.md#listUsers) | **GET** /users | List Users |
| [**replacePermissionsForUser**](IamUsersApi.md#replacePermissionsForUser) | **PUT** /users/{userId}/permissions | Replace Permissions for User |



## Operation: addPermissionsToUser

> AddPermissionsToUser200Response addPermissionsToUser(userId, addPermissionsToUserV1Input)

Add Permissions to User

Adds a list of access permissions to a user.    • When called, this endpoint may generate one or more of the following [audit trail](/tag/Audit-Trail) events:* Policy Created * User Policy Updated          The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamUsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamUsersApi apiInstance = new IamUsersApi(defaultClient);
        String userId = "sgJDWk3K21k6LE3tLU9nRK"; // String | 
        AddPermissionsToUserV1Input addPermissionsToUserV1Input = new AddPermissionsToUserV1Input(); // AddPermissionsToUserV1Input | 
        try {
            AddPermissionsToUser200Response result = apiInstance.addPermissionsToUser(userId, addPermissionsToUserV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamUsersApi#addPermissionsToUser");
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
| **userId** | **String**|  | |
| **addPermissionsToUserV1Input** | [**AddPermissionsToUserV1Input**](AddPermissionsToUserV1Input.md)|  | |

### Return type

[**AddPermissionsToUser200Response**](AddPermissionsToUser200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.segment.v1+json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: createInvites

> CreateInvites200Response createInvites(createInvitesV1Input)

Create Invites

Invites a list of users to join a Workspace.    • When called, this endpoint may generate one or more of the following [audit trail](/tag/Audit-Trail) events:* Non-Segment User Invited to Workspace * Policy Created * New Segment User Invited to Workspace  Config API omitted fields: - &#x60;parent&#x60;          The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamUsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamUsersApi apiInstance = new IamUsersApi(defaultClient);
        CreateInvitesV1Input createInvitesV1Input = new CreateInvitesV1Input(); // CreateInvitesV1Input | 
        try {
            CreateInvites200Response result = apiInstance.createInvites(createInvitesV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamUsersApi#createInvites");
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
| **createInvitesV1Input** | [**CreateInvitesV1Input**](CreateInvitesV1Input.md)|  | |

### Return type

[**CreateInvites200Response**](CreateInvites200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.segment.v1+json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: deleteInvites

> DeleteInvites200Response deleteInvites(emails)

Delete Invites

Removes a list of invitations to join a Workspace.    • When called, this endpoint may generate one or more of the following [audit trail](/tag/Audit-Trail) events:* Invite Deleted * Group Memberships Deleted          The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamUsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamUsersApi apiInstance = new IamUsersApi(defaultClient);
        List<String> emails = Arrays.asList(); // List<String> | The list of emails to delete invites for.  This parameter exists in v1.
        try {
            DeleteInvites200Response result = apiInstance.deleteInvites(emails);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamUsersApi#deleteInvites");
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
| **emails** | [**List&lt;String&gt;**](String.md)| The list of emails to delete invites for.  This parameter exists in v1. | |

### Return type

[**DeleteInvites200Response**](DeleteInvites200Response.md)

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


## Operation: deleteUsers

> DeleteUsers200Response deleteUsers(userIds)

Delete Users

Removes one or multiple users.    • When called, this endpoint may generate the &#x60;Group Memberships Deleted&#x60; event in the [audit trail](/tag/Audit-Trail).          The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamUsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamUsersApi apiInstance = new IamUsersApi(defaultClient);
        List<String> userIds = Arrays.asList(); // List<String> | The ids of the users to remove.  This parameter exists in v1.
        try {
            DeleteUsers200Response result = apiInstance.deleteUsers(userIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamUsersApi#deleteUsers");
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
| **userIds** | [**List&lt;String&gt;**](String.md)| The ids of the users to remove.  This parameter exists in v1. | |

### Return type

[**DeleteUsers200Response**](DeleteUsers200Response.md)

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


## Operation: getUser

> GetUser200Response getUser(userId)

Get User

Returns a user given their id.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamUsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamUsersApi apiInstance = new IamUsersApi(defaultClient);
        String userId = "sgJDWk3K21k6LE3tLU9nRK"; // String | 
        try {
            GetUser200Response result = apiInstance.getUser(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamUsersApi#getUser");
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
| **userId** | **String**|  | |

### Return type

[**GetUser200Response**](GetUser200Response.md)

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


## Operation: listInvites

> ListInvites200Response listInvites(pagination)

List Invites

Returns a list of invitations to join a Workspace.  Config API omitted fields: - &#x60;parent&#x60; 

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamUsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamUsersApi apiInstance = new IamUsersApi(defaultClient);
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Defines the pagination parameters.  This parameter exists in v1.
        try {
            ListInvites200Response result = apiInstance.listInvites(pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamUsersApi#listInvites");
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
| **pagination** | [**PaginationInput**](.md)| Defines the pagination parameters.  This parameter exists in v1. | |

### Return type

[**ListInvites200Response**](ListInvites200Response.md)

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


## Operation: listUserGroupsFromUser

> ListUserGroupsFromUser200Response listUserGroupsFromUser(userId, pagination)

List User Groups from User

Returns all groups a user belongs to.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamUsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamUsersApi apiInstance = new IamUsersApi(defaultClient);
        String userId = "sgJDWk3K21k6LE3tLU9nRK"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination for groups.  This parameter exists in v1.
        try {
            ListUserGroupsFromUser200Response result = apiInstance.listUserGroupsFromUser(userId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamUsersApi#listUserGroupsFromUser");
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
| **userId** | **String**|  | |
| **pagination** | [**PaginationInput**](.md)| Pagination for groups.  This parameter exists in v1. | |

### Return type

[**ListUserGroupsFromUser200Response**](ListUserGroupsFromUser200Response.md)

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


## Operation: listUsers

> ListUsers200Response listUsers(pagination)

List Users

Returns a list of users with access to the Workspace.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamUsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamUsersApi apiInstance = new IamUsersApi(defaultClient);
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination for users.  This parameter exists in v1.
        try {
            ListUsers200Response result = apiInstance.listUsers(pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamUsersApi#listUsers");
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
| **pagination** | [**PaginationInput**](.md)| Pagination for users.  This parameter exists in v1. | |

### Return type

[**ListUsers200Response**](ListUsers200Response.md)

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


## Operation: replacePermissionsForUser

> ReplacePermissionsForUser200Response replacePermissionsForUser(userId, replacePermissionsForUserV1Input)

Replace Permissions for User

Updates the list of access permissions for a user.    • When called, this endpoint may generate the &#x60;Policy Deleted&#x60; event in the [audit trail](/tag/Audit-Trail).          The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamUsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamUsersApi apiInstance = new IamUsersApi(defaultClient);
        String userId = "sgJDWk3K21k6LE3tLU9nRK"; // String | 
        ReplacePermissionsForUserV1Input replacePermissionsForUserV1Input = new ReplacePermissionsForUserV1Input(); // ReplacePermissionsForUserV1Input | 
        try {
            ReplacePermissionsForUser200Response result = apiInstance.replacePermissionsForUser(userId, replacePermissionsForUserV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamUsersApi#replacePermissionsForUser");
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
| **userId** | **String**|  | |
| **replacePermissionsForUserV1Input** | [**ReplacePermissionsForUserV1Input**](ReplacePermissionsForUserV1Input.md)|  | |

### Return type

[**ReplacePermissionsForUser200Response**](ReplacePermissionsForUser200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/json, application/vnd.segment.v1+json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |

