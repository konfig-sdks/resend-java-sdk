# EmailsApi

All URIs are relative to *https://api.resend.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSingleEmail**](EmailsApi.md#getSingleEmail) | **GET** /emails/{email_id} | Retrieve a single email |
| [**sendEmail**](EmailsApi.md#sendEmail) | **POST** /emails | Send an email |
| [**triggerBatchEmails**](EmailsApi.md#triggerBatchEmails) | **POST** /emails/batch | Trigger up to 100 batch emails at once. |


<a name="getSingleEmail"></a>
# **getSingleEmail**
> Email getSingleEmail(emailId).execute();

Retrieve a single email

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Resend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmailsApi;
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
    String emailId = "emailId_example";
    try {
      Email result = client
              .emails
              .getSingleEmail(emailId)
              .execute();
      System.out.println(result);
      System.out.println(result.getObject());
      System.out.println(result.getId());
      System.out.println(result.getTo());
      System.out.println(result.getFrom());
      System.out.println(result.getCreatedAt());
      System.out.println(result.getSubject());
      System.out.println(result.getHtml());
      System.out.println(result.getText());
      System.out.println(result.getBcc());
      System.out.println(result.getCc());
      System.out.println(result.getReplyTo());
      System.out.println(result.getLastEvent());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailsApi#getSingleEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Email> response = client
              .emails
              .getSingleEmail(emailId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailsApi#getSingleEmail");
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
| **emailId** | **String**|  | |

### Return type

[**Email**](Email.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="sendEmail"></a>
# **sendEmail**
> SendEmailResponse sendEmail().sendEmailRequest(sendEmailRequest).execute();

Send an email

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Resend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmailsApi;
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
    String from = "from_example"; // Sender email address. To include a friendly name, use the format \\\"Your Name <sender@domain.com>\\\".
    List<String> to = Arrays.asList();
    String subject = "subject_example"; // Email subject.
    List<Tag> tags = Arrays.asList();
    String bcc = "bcc_example"; // Bcc recipient email address. For multiple addresses, send as an array of strings.
    String cc = "cc_example"; // Cc recipient email address. For multiple addresses, send as an array of strings.
    String replyTo = "replyTo_example"; // Reply-to email address. For multiple addresses, send as an array of strings.
    String html = "html_example"; // The HTML version of the message.
    String text = "text_example"; // The plain text version of the message.
    Object headers = null; // Custom headers to add to the email.
    List<Attachment> attachments = Arrays.asList();
    try {
      SendEmailResponse result = client
              .emails
              .sendEmail(from, to, subject)
              .tags(tags)
              .bcc(bcc)
              .cc(cc)
              .replyTo(replyTo)
              .html(html)
              .text(text)
              .headers(headers)
              .attachments(attachments)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailsApi#sendEmail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SendEmailResponse> response = client
              .emails
              .sendEmail(from, to, subject)
              .tags(tags)
              .bcc(bcc)
              .cc(cc)
              .replyTo(replyTo)
              .html(html)
              .text(text)
              .headers(headers)
              .attachments(attachments)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailsApi#sendEmail");
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
| **sendEmailRequest** | [**SendEmailRequest**](SendEmailRequest.md)|  | [optional] |

### Return type

[**SendEmailResponse**](SendEmailResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

<a name="triggerBatchEmails"></a>
# **triggerBatchEmails**
> CreateBatchEmailsResponse triggerBatchEmails().sendEmailRequest(sendEmailRequest).execute();

Trigger up to 100 batch emails at once.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Resend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.EmailsApi;
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
    try {
      CreateBatchEmailsResponse result = client
              .emails
              .triggerBatchEmails()
              .execute();
      System.out.println(result);
      System.out.println(result.getData());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailsApi#triggerBatchEmails");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateBatchEmailsResponse> response = client
              .emails
              .triggerBatchEmails()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling EmailsApi#triggerBatchEmails");
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
| **sendEmailRequest** | [**List&lt;SendEmailRequest&gt;**](SendEmailRequest.md)|  | [optional] |

### Return type

[**CreateBatchEmailsResponse**](CreateBatchEmailsResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

