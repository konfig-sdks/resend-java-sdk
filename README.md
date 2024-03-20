<div align="center">

[![Visit Resend](./header.png)](https://resend.com)

# [Resend](https://resend.com)

Resend is the email platform for developers.

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Resend&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>resend-java-sdk</artifactId>
  <version>1.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:resend-java-sdk:1.1.0"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/resend-java-sdk-1.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Resend;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.ApiKeysApi;
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
    String name = "name_example"; // The API key name.
    String permission = "full_access"; // The API key can have full access to Resend’s API or be only restricted to send emails. * full_access - Can create, delete, get, and update any resource. * sending_access - Can only send emails.
    String domainId = "domainId_example"; // Restrict an API key to send emails only from a specific domain. Only used when the permission is sending_acces.
    try {
      CreateApiKeyResponse result = client
              .apiKeys
              .createNewKey(name)
              .permission(permission)
              .domainId(domainId)
              .execute();
      System.out.println(result);
      System.out.println(result.getId());
      System.out.println(result.getToken());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiKeysApi#createNewKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<CreateApiKeyResponse> response = client
              .apiKeys
              .createNewKey(name)
              .permission(permission)
              .domainId(domainId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiKeysApi#createNewKey");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.resend.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiKeysApi* | [**createNewKey**](docs/ApiKeysApi.md#createNewKey) | **POST** /api-keys | Create a new API key
*ApiKeysApi* | [**getList**](docs/ApiKeysApi.md#getList) | **GET** /api-keys | Retrieve a list of API keys
*ApiKeysApi* | [**removeExistingKey**](docs/ApiKeysApi.md#removeExistingKey) | **DELETE** /api-keys/{api_key_id} | Remove an existing API key
*AudiencesApi* | [**createContactList**](docs/AudiencesApi.md#createContactList) | **POST** /audiences | Create a list of contacts
*AudiencesApi* | [**getList**](docs/AudiencesApi.md#getList) | **GET** /audiences | Retrieve a list of audiences
*AudiencesApi* | [**getSingleAudience**](docs/AudiencesApi.md#getSingleAudience) | **GET** /audiences/{id} | Retrieve a single audience
*AudiencesApi* | [**removeExistingAudience**](docs/AudiencesApi.md#removeExistingAudience) | **DELETE** /audiences/{id} | Remove an existing audience
*ContactsApi* | [**createNewContact**](docs/ContactsApi.md#createNewContact) | **POST** /audiences/{audience_id}/contacts | Create a new contact
*ContactsApi* | [**getList**](docs/ContactsApi.md#getList) | **GET** /audiences/{audience_id}/contacts | Retrieve a list of contacts
*ContactsApi* | [**getSingle**](docs/ContactsApi.md#getSingle) | **GET** /audiences/{audience_id}/contacts/{id} | Retrieve a single contact
*ContactsApi* | [**removeByEmail**](docs/ContactsApi.md#removeByEmail) | **DELETE** /audiences/{audience_id}/contacts/{email} | Remove an existing contact by email
*ContactsApi* | [**removeById**](docs/ContactsApi.md#removeById) | **DELETE** /audiences/{audience_id}/contacts/{id} | Remove an existing contact by id
*ContactsApi* | [**updateSingleContact**](docs/ContactsApi.md#updateSingleContact) | **PATCH** /audiences/{audience_id}/contacts/{id} | Update a single contact
*DomainsApi* | [**createNewDomain**](docs/DomainsApi.md#createNewDomain) | **POST** /domains | Create a new domain
*DomainsApi* | [**getList**](docs/DomainsApi.md#getList) | **GET** /domains | Retrieve a list of domains
*DomainsApi* | [**getSingleDomain**](docs/DomainsApi.md#getSingleDomain) | **GET** /domains/{domain_id} | Retrieve a single domain
*DomainsApi* | [**removeDomain**](docs/DomainsApi.md#removeDomain) | **DELETE** /domains/{domain_id} | Remove an existing domain
*DomainsApi* | [**updateExistingDomain**](docs/DomainsApi.md#updateExistingDomain) | **PATCH** /domains/{domain_id} | Update an existing domain
*DomainsApi* | [**verifyDomain**](docs/DomainsApi.md#verifyDomain) | **POST** /domains/{domain_id}/verify | Verify an existing domain
*EmailsApi* | [**getSingleEmail**](docs/EmailsApi.md#getSingleEmail) | **GET** /emails/{email_id} | Retrieve a single email
*EmailsApi* | [**sendEmail**](docs/EmailsApi.md#sendEmail) | **POST** /emails | Send an email
*EmailsApi* | [**triggerBatchEmails**](docs/EmailsApi.md#triggerBatchEmails) | **POST** /emails/batch | Trigger up to 100 batch emails at once.


## Documentation for Models

 - [ApiKey](docs/ApiKey.md)
 - [Attachment](docs/Attachment.md)
 - [CreateApiKeyRequest](docs/CreateApiKeyRequest.md)
 - [CreateApiKeyResponse](docs/CreateApiKeyResponse.md)
 - [CreateAudienceOptions](docs/CreateAudienceOptions.md)
 - [CreateAudienceResponseSuccess](docs/CreateAudienceResponseSuccess.md)
 - [CreateBatchEmailsResponse](docs/CreateBatchEmailsResponse.md)
 - [CreateBatchEmailsResponseDataInner](docs/CreateBatchEmailsResponseDataInner.md)
 - [CreateContactOptions](docs/CreateContactOptions.md)
 - [CreateContactResponseSuccess](docs/CreateContactResponseSuccess.md)
 - [CreateDomainRequest](docs/CreateDomainRequest.md)
 - [CreateDomainResponse](docs/CreateDomainResponse.md)
 - [DeleteDomainResponse](docs/DeleteDomainResponse.md)
 - [Domain](docs/Domain.md)
 - [DomainRecord](docs/DomainRecord.md)
 - [Email](docs/Email.md)
 - [GetAudienceResponseSuccess](docs/GetAudienceResponseSuccess.md)
 - [GetContactResponseSuccess](docs/GetContactResponseSuccess.md)
 - [ListApiKeysResponse](docs/ListApiKeysResponse.md)
 - [ListAudiencesResponseSuccess](docs/ListAudiencesResponseSuccess.md)
 - [ListAudiencesResponseSuccessDataInner](docs/ListAudiencesResponseSuccessDataInner.md)
 - [ListContactsResponseSuccess](docs/ListContactsResponseSuccess.md)
 - [ListContactsResponseSuccessDataInner](docs/ListContactsResponseSuccessDataInner.md)
 - [ListDomainsItem](docs/ListDomainsItem.md)
 - [ListDomainsResponse](docs/ListDomainsResponse.md)
 - [RemoveAudienceResponseSuccess](docs/RemoveAudienceResponseSuccess.md)
 - [RemoveContactResponseSuccess](docs/RemoveContactResponseSuccess.md)
 - [SendEmailRequest](docs/SendEmailRequest.md)
 - [SendEmailResponse](docs/SendEmailResponse.md)
 - [Tag](docs/Tag.md)
 - [UpdateContactOptions](docs/UpdateContactOptions.md)
 - [UpdateContactResponseSuccess](docs/UpdateContactResponseSuccess.md)
 - [UpdateDomainOptions](docs/UpdateDomainOptions.md)
 - [UpdateDomainResponseSuccess](docs/UpdateDomainResponseSuccess.md)
 - [VerifyDomainResponse](docs/VerifyDomainResponse.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
