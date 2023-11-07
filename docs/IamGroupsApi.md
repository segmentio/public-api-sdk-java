# IamGroupsApi

All URIs are relative to *https://api.segmentapis.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPermissionsToUserGroup**](IamGroupsApi.md#addPermissionsToUserGroup) | **POST** /groups/{userGroupId}/permissions | Add Permissions to User Group |
| [**addUsersToUserGroup**](IamGroupsApi.md#addUsersToUserGroup) | **POST** /groups/{userGroupId}/users | Add Users to User Group |
| [**createUserGroup**](IamGroupsApi.md#createUserGroup) | **POST** /groups | Create User Group |
| [**deleteUserGroup**](IamGroupsApi.md#deleteUserGroup) | **DELETE** /groups/{userGroupId} | Delete User Group |
| [**getUserGroup**](IamGroupsApi.md#getUserGroup) | **GET** /groups/{userGroupId} | Get User Group |
| [**listInvitesFromUserGroup**](IamGroupsApi.md#listInvitesFromUserGroup) | **GET** /groups/{userGroupId}/invites | List Invites from User Group |
| [**listUserGroups**](IamGroupsApi.md#listUserGroups) | **GET** /groups | List User Groups |
| [**listUsersFromUserGroup**](IamGroupsApi.md#listUsersFromUserGroup) | **GET** /groups/{userGroupId}/users | List Users from User Group |
| [**removeUsersFromUserGroup**](IamGroupsApi.md#removeUsersFromUserGroup) | **DELETE** /group/{userGroupId}/users | Remove Users from User Group |
| [**replacePermissionsForUserGroup**](IamGroupsApi.md#replacePermissionsForUserGroup) | **PUT** /groups/{userGroupId}/permissions | Replace Permissions for User Group |
| [**replaceUsersInUserGroup**](IamGroupsApi.md#replaceUsersInUserGroup) | **PUT** /group/{userGroupId}/users | Replace Users in User Group |
| [**updateUserGroup**](IamGroupsApi.md#updateUserGroup) | **PATCH** /groups/{userGroupId} | Update User Group |



## Operation: addPermissionsToUserGroup

> AddPermissionsToUserGroup200Response addPermissionsToUserGroup(userGroupId, addPermissionsToUserGroupV1Input)

Add Permissions to User Group

Adds a list of access permissions to a user group.    • When called, this endpoint may generate one or more of the following [audit trail](/tag/Audit-Trail) events:* Policy Created * User Group Policy Updated          The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamGroupsApi apiInstance = new IamGroupsApi(defaultClient);
        String userGroupId = "bBABwqbaDf2QdwTbW8bNEm"; // String | 
        AddPermissionsToUserGroupV1Input addPermissionsToUserGroupV1Input = new AddPermissionsToUserGroupV1Input(); // AddPermissionsToUserGroupV1Input | 
        try {
            AddPermissionsToUserGroup200Response result = apiInstance.addPermissionsToUserGroup(userGroupId, addPermissionsToUserGroupV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamGroupsApi#addPermissionsToUserGroup");
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
| **userGroupId** | **String**|  | |
| **addPermissionsToUserGroupV1Input** | [**AddPermissionsToUserGroupV1Input**](AddPermissionsToUserGroupV1Input.md)|  | |

### Return type

[**AddPermissionsToUserGroup200Response**](AddPermissionsToUserGroup200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1+json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: addUsersToUserGroup

> AddUsersToUserGroup200Response addUsersToUserGroup(userGroupId, addUsersToUserGroupV1Input)

Add Users to User Group

Adds a list of users or invites to a user group.    • When called, this endpoint may generate one or more of the following [audit trail](/tag/Audit-Trail) events:* Subjects Added to Group * User Added To User Group          The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamGroupsApi apiInstance = new IamGroupsApi(defaultClient);
        String userGroupId = "bBABwqbaDf2QdwTbW8bNEm"; // String | 
        AddUsersToUserGroupV1Input addUsersToUserGroupV1Input = new AddUsersToUserGroupV1Input(); // AddUsersToUserGroupV1Input | 
        try {
            AddUsersToUserGroup200Response result = apiInstance.addUsersToUserGroup(userGroupId, addUsersToUserGroupV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamGroupsApi#addUsersToUserGroup");
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
| **userGroupId** | **String**|  | |
| **addUsersToUserGroupV1Input** | [**AddUsersToUserGroupV1Input**](AddUsersToUserGroupV1Input.md)|  | |

### Return type

[**AddUsersToUserGroup200Response**](AddUsersToUserGroup200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1+json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: createUserGroup

> CreateUserGroup200Response createUserGroup(createUserGroupV1Input)

Create User Group

Creates a user group.    • When called, this endpoint may generate one or more of the following [audit trail](/tag/Audit-Trail) events:* User Group Created * Policy Created          The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamGroupsApi apiInstance = new IamGroupsApi(defaultClient);
        CreateUserGroupV1Input createUserGroupV1Input = new CreateUserGroupV1Input(); // CreateUserGroupV1Input | 
        try {
            CreateUserGroup200Response result = apiInstance.createUserGroup(createUserGroupV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamGroupsApi#createUserGroup");
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
| **createUserGroupV1Input** | [**CreateUserGroupV1Input**](CreateUserGroupV1Input.md)|  | |

### Return type

[**CreateUserGroup200Response**](CreateUserGroup200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1+json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: deleteUserGroup

> DeleteUserGroup200Response deleteUserGroup(userGroupId)

Delete User Group

Removes a user group from a Workspace.    • When called, this endpoint may generate the &#x60;User Group Deleted&#x60; event in the [audit trail](/tag/Audit-Trail).          The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamGroupsApi apiInstance = new IamGroupsApi(defaultClient);
        String userGroupId = "2Nhj3GVumKbR0cjDly4nCdGo6cT"; // String | 
        try {
            DeleteUserGroup200Response result = apiInstance.deleteUserGroup(userGroupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamGroupsApi#deleteUserGroup");
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
| **userGroupId** | **String**|  | |

### Return type

[**DeleteUserGroup200Response**](DeleteUserGroup200Response.md)

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


## Operation: getUserGroup

> GetUserGroup200Response getUserGroup(userGroupId)

Get User Group

Returns a user group.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamGroupsApi apiInstance = new IamGroupsApi(defaultClient);
        String userGroupId = "bBABwqbaDf2QdwTbW8bNEm"; // String | 
        try {
            GetUserGroup200Response result = apiInstance.getUserGroup(userGroupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamGroupsApi#getUserGroup");
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
| **userGroupId** | **String**|  | |

### Return type

[**GetUserGroup200Response**](GetUserGroup200Response.md)

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


## Operation: listInvitesFromUserGroup

> ListInvitesFromUserGroup200Response listInvitesFromUserGroup(userGroupId, pagination)

List Invites from User Group

Returns the emails of invitees to a user group.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamGroupsApi apiInstance = new IamGroupsApi(defaultClient);
        String userGroupId = "bBABwqbaDf2QdwTbW8bNEm"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination for invites to the group.  This parameter exists in v1.
        try {
            ListInvitesFromUserGroup200Response result = apiInstance.listInvitesFromUserGroup(userGroupId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamGroupsApi#listInvitesFromUserGroup");
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
| **userGroupId** | **String**|  | |
| **pagination** | [**PaginationInput**](.md)| Pagination for invites to the group.  This parameter exists in v1. | |

### Return type

[**ListInvitesFromUserGroup200Response**](ListInvitesFromUserGroup200Response.md)

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


## Operation: listUserGroups

> ListUserGroups200Response listUserGroups(pagination)

List User Groups

Returns all user groups.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamGroupsApi apiInstance = new IamGroupsApi(defaultClient);
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination for user groups.  This parameter exists in v1.
        try {
            ListUserGroups200Response result = apiInstance.listUserGroups(pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamGroupsApi#listUserGroups");
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
| **pagination** | [**PaginationInput**](.md)| Pagination for user groups.  This parameter exists in v1. | |

### Return type

[**ListUserGroups200Response**](ListUserGroups200Response.md)

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


## Operation: listUsersFromUserGroup

> ListUsersFromUserGroup200Response listUsersFromUserGroup(userGroupId, pagination)

List Users from User Group

Returns users belonging to a user group.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamGroupsApi apiInstance = new IamGroupsApi(defaultClient);
        String userGroupId = "bBABwqbaDf2QdwTbW8bNEm"; // String | 
        PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination for members of a group.  This parameter exists in v1.
        try {
            ListUsersFromUserGroup200Response result = apiInstance.listUsersFromUserGroup(userGroupId, pagination);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamGroupsApi#listUsersFromUserGroup");
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
| **userGroupId** | **String**|  | |
| **pagination** | [**PaginationInput**](.md)| Pagination for members of a group.  This parameter exists in v1. | |

### Return type

[**ListUsersFromUserGroup200Response**](ListUsersFromUserGroup200Response.md)

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


## Operation: removeUsersFromUserGroup

> RemoveUsersFromUserGroup200Response removeUsersFromUserGroup(userGroupId, emails)

Remove Users from User Group

Removes one or multiple users or invites from a user group by email.    • When called, this endpoint may generate one or more of the following [audit trail](/tag/Audit-Trail) events:* Group Memberships Deleted * User Removed From User Group          The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamGroupsApi apiInstance = new IamGroupsApi(defaultClient);
        String userGroupId = "bBABwqbaDf2QdwTbW8bNEm"; // String | 
        List<String> emails = Arrays.asList(); // List<String> | The list of emails to remove from the user group.  This parameter exists in v1.
        try {
            RemoveUsersFromUserGroup200Response result = apiInstance.removeUsersFromUserGroup(userGroupId, emails);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamGroupsApi#removeUsersFromUserGroup");
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
| **userGroupId** | **String**|  | |
| **emails** | [**List&lt;String&gt;**](String.md)| The list of emails to remove from the user group.  This parameter exists in v1. | |

### Return type

[**RemoveUsersFromUserGroup200Response**](RemoveUsersFromUserGroup200Response.md)

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


## Operation: replacePermissionsForUserGroup

> ReplacePermissionsForUserGroup200Response replacePermissionsForUserGroup(userGroupId, replacePermissionsForUserGroupV1Input)

Replace Permissions for User Group

Updates the list of access permissions for a user group.    • When called, this endpoint may generate the &#x60;Policy Deleted&#x60; event in the [audit trail](/tag/Audit-Trail).          The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamGroupsApi apiInstance = new IamGroupsApi(defaultClient);
        String userGroupId = "bBABwqbaDf2QdwTbW8bNEm"; // String | 
        ReplacePermissionsForUserGroupV1Input replacePermissionsForUserGroupV1Input = new ReplacePermissionsForUserGroupV1Input(); // ReplacePermissionsForUserGroupV1Input | 
        try {
            ReplacePermissionsForUserGroup200Response result = apiInstance.replacePermissionsForUserGroup(userGroupId, replacePermissionsForUserGroupV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamGroupsApi#replacePermissionsForUserGroup");
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
| **userGroupId** | **String**|  | |
| **replacePermissionsForUserGroupV1Input** | [**ReplacePermissionsForUserGroupV1Input**](ReplacePermissionsForUserGroupV1Input.md)|  | |

### Return type

[**ReplacePermissionsForUserGroup200Response**](ReplacePermissionsForUserGroup200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1+json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: replaceUsersInUserGroup

> ReplaceUsersInUserGroup200Response replaceUsersInUserGroup(userGroupId, replaceUsersInUserGroupV1Input)

Replace Users in User Group

Replaces the members of a user group by email.    • When called, this endpoint may generate one or more of the following [audit trail](/tag/Audit-Trail) events:* Subjects Added to Group * User Added To User Group * Group Memberships Deleted          The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamGroupsApi apiInstance = new IamGroupsApi(defaultClient);
        String userGroupId = "bBABwqbaDf2QdwTbW8bNEm"; // String | 
        ReplaceUsersInUserGroupV1Input replaceUsersInUserGroupV1Input = new ReplaceUsersInUserGroupV1Input(); // ReplaceUsersInUserGroupV1Input | 
        try {
            ReplaceUsersInUserGroup200Response result = apiInstance.replaceUsersInUserGroup(userGroupId, replaceUsersInUserGroupV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamGroupsApi#replaceUsersInUserGroup");
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
| **userGroupId** | **String**|  | |
| **replaceUsersInUserGroupV1Input** | [**ReplaceUsersInUserGroupV1Input**](ReplaceUsersInUserGroupV1Input.md)|  | |

### Return type

[**ReplaceUsersInUserGroup200Response**](ReplaceUsersInUserGroup200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1+json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |


## Operation: updateUserGroup

> UpdateUserGroup200Response updateUserGroup(userGroupId, updateUserGroupV1Input)

Update User Group

Updates a user group for a Workspace.    • When called, this endpoint may generate the &#x60;User Group Updated&#x60; event in the [audit trail](/tag/Audit-Trail).          The rate limit for this endpoint is 60 requests per minute, which is lower than the default due to access pattern restrictions. Once reached, this endpoint will respond with the 429 HTTP status code with headers indicating the limit parameters. See [Rate Limiting](/#tag/Rate-Limits) for more information.

### Example

```java
// Import classes:
import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.IamGroupsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.segmentapis.com");
        
        // Configure HTTP bearer authorization: token
        HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
        token.setBearerToken("BEARER TOKEN");

        IamGroupsApi apiInstance = new IamGroupsApi(defaultClient);
        String userGroupId = "bBABwqbaDf2QdwTbW8bNEm"; // String | 
        UpdateUserGroupV1Input updateUserGroupV1Input = new UpdateUserGroupV1Input(); // UpdateUserGroupV1Input | 
        try {
            UpdateUserGroup200Response result = apiInstance.updateUserGroup(userGroupId, updateUserGroupV1Input);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IamGroupsApi#updateUserGroup");
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
| **userGroupId** | **String**|  | |
| **updateUserGroupV1Input** | [**UpdateUserGroupV1Input**](UpdateUserGroupV1Input.md)|  | |

### Return type

[**UpdateUserGroup200Response**](UpdateUserGroup200Response.md)

### Authorization

[token](../README.md#token)

### HTTP request headers

- **Content-Type**: application/vnd.segment.v1+json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json
- **Accept**: application/vnd.segment.v1+json, application/json, application/vnd.segment.v1beta+json, application/vnd.segment.v1alpha+json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Resource not found |  -  |
| **422** | Validation failure |  -  |
| **429** | Too many requests |  -  |

