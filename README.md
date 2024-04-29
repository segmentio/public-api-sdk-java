# Segment Public API Java SDK

:warning: This SDK is currently released as [Public Beta](https://segment.com/legal/first-access-beta-preview/). Its use in critical systems is discouraged, but [feedback is welcome](#contributing).

## Overview

The Segment Public API helps you manage your Segment Workspaces and its resources. You can use the API to perform CRUD (create, read, update, delete) operations at no extra charge. This includes working with resources such as Sources, Destinations, Warehouses, Tracking Plans, and the Segment Destinations and Sources Catalogs. The full documentation is available at [https://docs.segmentapis.com](https://docs.segmentapis.com).

All endpoints in the API follow REST conventions and use standard HTTP methods. Different URL endpoints represent different resources in a Workspace.

See the next sections for more information on how to use the Segment Public API Java SDK.

Latest API and SDK version: 49.1.0

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.segment.publicapi</groupId>
  <artifactId>segment-publicapi</artifactId>
  <version>49.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'segment-publicapi' jar has been published to maven central.
    mavenLocal()       // Needed if the 'segment-publicapi' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "com.segment.publicapi:segment-publicapi:49.1.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/segment-publicapi-49.1.0.jar`
* `target/lib/*.jar`

You are now ready to start making calls to Public API!

## Example

```java

import com.segment.publicapi.ApiClient;
import com.segment.publicapi.ApiException;
import com.segment.publicapi.Configuration;
import com.segment.publicapi.auth.*;
import com.segment.publicapi.models.*;
import com.segment.publicapi.api.SourcesApi;
import com.segment.publicapi.api.WorkspacesApi;
import java.math.BigDecimal;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.segmentapis.com");
    
    // Configure HTTP bearer authorization: token
    HttpBearerAuth token = (HttpBearerAuth) defaultClient.getAuthentication("token");
    token.setBearerToken("<TOKEN>");

    ApiCallsApi apiInstance = new ApiCallsApi(defaultClient);
    String period = "2021-02-01"; // String | The start of the usage month in the ISO-8601 format.  This parameter exists in v1.
    PaginationInput pagination = new PaginationInput(); // PaginationInput | Pagination input for per Source API calls counts.  This parameter exists in v1.

    // Make an API call without Pagination
    try {
        WorkspacesApi apiInstance = new WorkspacesApi(defaultClient);
        GetWorkspace200Response workspaceResponse = apiInstance.getWorkspace();
    } catch (ApiException e) {
        System.err.println("Exception when calling WorkspacesApi#getWorkspace");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }

    // Make an API call with Pagination
    try {
        SourcesApi sourceApiInstance = new SourcesApi(defaultClient);
        PaginationInput paginationInput = new PaginationInput();
        paginationInput.count(BigDecimal.valueOf(20));
        String current = null;
        do {
            paginationInput.setCursor(current);
            ListSources200Response sourcesResponse = sourceApiInstance.listSources(paginationInput);
            current = sourcesResponse.getData().getPagination().getNext();
        } while(current != null);
    } catch (ApiException e) {
        System.err.println("Exception when calling SourcesApi#sourceApiInstance");
        System.err.println("Status code: " + e.getCode());
        System.err.println("Reason: " + e.getResponseBody());
        System.err.println("Response headers: " + e.getResponseHeaders());
        e.printStackTrace();
    }
  }
}

```

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Contributing

The contents of this repository are automatically generated, so we can't take contributions from external developers. If you have any issues with this SDK, please raise an issue or reach out to friends@segment.com instead of opening a pull request. Pull requests will not be reviewed.
