# ContactsApi

All URIs are relative to *https://api.resend.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewContact**](ContactsApi.md#createNewContact) | **POST** /audiences/{audience_id}/contacts | Create a new contact |
| [**getList**](ContactsApi.md#getList) | **GET** /audiences/{audience_id}/contacts | Retrieve a list of contacts |
| [**getSingle**](ContactsApi.md#getSingle) | **GET** /audiences/{audience_id}/contacts/{id} | Retrieve a single contact |
| [**removeByEmail**](ContactsApi.md#removeByEmail) | **DELETE** /audiences/{audience_id}/contacts/{email} | Remove an existing contact by email |
| [**removeById**](ContactsApi.md#removeById) | **DELETE** /audiences/{audience_id}/contacts/{id} | Remove an existing contact by id |
| [**updateSingleContact**](ContactsApi.md#updateSingleContact) | **PATCH** /audiences/{audience_id}/contacts/{id} | Update a single contact |


<a name="createNewContact"></a>
# **createNewContact**
> CreateContactResponseSuccess createNewContact(audienceId).createContactOptions(createContactOptions).execute();

Create a new contact

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Resend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.resend.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Resend client = new Resend(configuration);
    String email = "email_example"; // Email address of the contact.
    String audienceId = "audienceId_example";
    String firstName = "firstName_example"; // First name of the contact.
    String lastName = "lastName_example"; // Last name of the contact.
    Boolean unsubscribed = true; // Indicates if the contact is unsubscribed.
    String audienceId = "audienceId_example"; // Unique identifier of the audience to which the contact belongs.
    try {
      CreateContactResponseSuccess result = client
              .contacts
              .createNewContact(email, audienceId)
              .firstName(firstName)
              .lastName(lastName)
              .unsubscribed(unsubscribed)
              .audienceId(audienceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#createNewContact");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateContactResponseSuccess> response = client
              .contacts
              .createNewContact(email, audienceId)
              .firstName(firstName)
              .lastName(lastName)
              .unsubscribed(unsubscribed)
              .audienceId(audienceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#createNewContact");
      System.err.println("Status code: " + e.getStatusCode());
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
| **audienceId** | **String**|  | |
| **createContactOptions** | [**CreateContactOptions**](CreateContactOptions.md)|  | [optional] |

### Return type

[**CreateContactResponseSuccess**](CreateContactResponseSuccess.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | OK |  -  |

<a name="getList"></a>
# **getList**
> ListContactsResponseSuccess getList(audienceId).execute();

Retrieve a list of contacts

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Resend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.resend.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Resend client = new Resend(configuration);
    String audienceId = "audienceId_example";
    try {
      ListContactsResponseSuccess result = client
              .contacts
              .getList(audienceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ListContactsResponseSuccess> response = client
              .contacts
              .getList(audienceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getList");
      System.err.println("Status code: " + e.getStatusCode());
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
| **audienceId** | **String**|  | |

### Return type

[**ListContactsResponseSuccess**](ListContactsResponseSuccess.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="getSingle"></a>
# **getSingle**
> GetContactResponseSuccess getSingle(id, audienceId).execute();

Retrieve a single contact

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Resend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.resend.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Resend client = new Resend(configuration);
    String id = "id_example";
    String audienceId = "audienceId_example";
    try {
      GetContactResponseSuccess result = client
              .contacts
              .getSingle(id, audienceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getEmail());
      System.out.println(result.getFirstName());
      System.out.println(result.getLastName());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getUnsubscribed());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetContactResponseSuccess> response = client
              .contacts
              .getSingle(id, audienceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#getSingle");
      System.err.println("Status code: " + e.getStatusCode());
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
| **id** | **String**|  | |
| **audienceId** | **String**|  | |

### Return type

[**GetContactResponseSuccess**](GetContactResponseSuccess.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeByEmail"></a>
# **removeByEmail**
> RemoveContactResponseSuccess removeByEmail(email, audienceId).execute();

Remove an existing contact by email

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Resend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.resend.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Resend client = new Resend(configuration);
    String email = "email_example";
    String audienceId = "audienceId_example";
    try {
      RemoveContactResponseSuccess result = client
              .contacts
              .removeByEmail(email, audienceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#removeByEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RemoveContactResponseSuccess> response = client
              .contacts
              .removeByEmail(email, audienceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#removeByEmail");
      System.err.println("Status code: " + e.getStatusCode());
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
| **email** | **String**|  | |
| **audienceId** | **String**|  | |

### Return type

[**RemoveContactResponseSuccess**](RemoveContactResponseSuccess.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="removeById"></a>
# **removeById**
> RemoveContactResponseSuccess removeById(id, audienceId).execute();

Remove an existing contact by id

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Resend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.resend.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Resend client = new Resend(configuration);
    String id = "id_example";
    String audienceId = "audienceId_example";
    try {
      RemoveContactResponseSuccess result = client
              .contacts
              .removeById(id, audienceId)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getDeleted());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<RemoveContactResponseSuccess> response = client
              .contacts
              .removeById(id, audienceId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#removeById");
      System.err.println("Status code: " + e.getStatusCode());
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
| **id** | **String**|  | |
| **audienceId** | **String**|  | |

### Return type

[**RemoveContactResponseSuccess**](RemoveContactResponseSuccess.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="updateSingleContact"></a>
# **updateSingleContact**
> UpdateContactResponseSuccess updateSingleContact(id, audienceId).updateContactOptions(updateContactOptions).execute();

Update a single contact

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Resend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ContactsApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://api.resend.com";
    
    // Configure HTTP bearer authorization: bearerAuth
    configuration.token = "BEARER TOKEN";
    Resend client = new Resend(configuration);
    String id = "id_example";
    String audienceId = "audienceId_example";
    String email = "email_example"; // Email address of the contact.
    String firstName = "firstName_example"; // First name of the contact.
    String lastName = "lastName_example"; // Last name of the contact.
    Boolean unsubscribed = true; // Indicates the subscription status of the contact.
    try {
      UpdateContactResponseSuccess result = client
              .contacts
              .updateSingleContact(id, audienceId)
              .email(email)
              .firstName(firstName)
              .lastName(lastName)
              .unsubscribed(unsubscribed)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#updateSingleContact");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UpdateContactResponseSuccess> response = client
              .contacts
              .updateSingleContact(id, audienceId)
              .email(email)
              .firstName(firstName)
              .lastName(lastName)
              .unsubscribed(unsubscribed)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactsApi#updateSingleContact");
      System.err.println("Status code: " + e.getStatusCode());
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
| **id** | **String**|  | |
| **audienceId** | **String**|  | |
| **updateContactOptions** | [**UpdateContactOptions**](UpdateContactOptions.md)|  | [optional] |

### Return type

[**UpdateContactResponseSuccess**](UpdateContactResponseSuccess.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

