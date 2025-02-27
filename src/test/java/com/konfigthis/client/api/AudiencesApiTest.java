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
import com.konfigthis.client.model.CreateAudienceOptions;
import com.konfigthis.client.model.CreateAudienceResponseSuccess;
import com.konfigthis.client.model.GetAudienceResponseSuccess;
import com.konfigthis.client.model.ListAudiencesResponseSuccess;
import com.konfigthis.client.model.RemoveAudienceResponseSuccess;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AudiencesApi
 */
@Disabled
public class AudiencesApiTest {

    private static AudiencesApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new AudiencesApi(apiClient);
    }

    /**
     * Create a list of contacts
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createContactListTest() throws ApiException {
        String name = null;
        CreateAudienceResponseSuccess response = api.createContactList(name)
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a list of audiences
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getListTest() throws ApiException {
        ListAudiencesResponseSuccess response = api.getList()
                .execute();
        // TODO: test validations
    }

    /**
     * Retrieve a single audience
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSingleAudienceTest() throws ApiException {
        String id = null;
        GetAudienceResponseSuccess response = api.getSingleAudience(id)
                .execute();
        // TODO: test validations
    }

    /**
     * Remove an existing audience
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void removeExistingAudienceTest() throws ApiException {
        String id = null;
        RemoveAudienceResponseSuccess response = api.removeExistingAudience(id)
                .execute();
        // TODO: test validations
    }

}
