/*
 * Resend
 * Resend is the email platform for developers.
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.CreateContactOptions;
import com.konfigthis.client.model.CreateContactResponseSuccess;
import com.konfigthis.client.model.GetContactResponseSuccess;
import com.konfigthis.client.model.ListContactsResponseSuccess;
import com.konfigthis.client.model.RemoveContactResponseSuccess;
import com.konfigthis.client.model.UpdateContactOptions;
import com.konfigthis.client.model.UpdateContactResponseSuccess;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactsApi
 */
@Disabled
public class ContactsApiTest {

    private static ContactsApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ContactsApi(apiClient);
    }

    /**
     * Create a new contact
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewContactTest() throws ApiException {
        String email = null;
        String audienceId = null;
        String firstName = null;
        String lastName = null;
        Boolean unsubscribed = null;
        String audienceId = null;
        CreateContactResponseSuccess response = api.createNewContact(email, audienceId)
                .firstName(firstName)
                .lastName(lastName)
                .unsubscribed(unsubscribed)
                .audienceId(audienceId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a list of contacts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListTest() throws ApiException {
        String audienceId = null;
        ListContactsResponseSuccess response = api.getList(audienceId)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a single contact
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleTest() throws ApiException {
        String id = null;
        String audienceId = null;
        GetContactResponseSuccess response = api.getSingle(id, audienceId)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove an existing contact by email
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeByEmailTest() throws ApiException {
        String email = null;
        String audienceId = null;
        RemoveContactResponseSuccess response = api.removeByEmail(email, audienceId)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove an existing contact by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeByIdTest() throws ApiException {
        String id = null;
        String audienceId = null;
        RemoveContactResponseSuccess response = api.removeById(id, audienceId)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a single contact
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateSingleContactTest() throws ApiException {
        String id = null;
        String audienceId = null;
        String email = null;
        String firstName = null;
        String lastName = null;
        Boolean unsubscribed = null;
        UpdateContactResponseSuccess response = api.updateSingleContact(id, audienceId)
                .email(email)
                .firstName(firstName)
                .lastName(lastName)
                .unsubscribed(unsubscribed)
                .execute();
        // TODO: test validations
    }

}
