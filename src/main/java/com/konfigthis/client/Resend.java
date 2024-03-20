package com.konfigthis.client;

import com.konfigthis.client.api.ApiKeysApi;
import com.konfigthis.client.api.AudiencesApi;
import com.konfigthis.client.api.ContactsApi;
import com.konfigthis.client.api.DomainsApi;
import com.konfigthis.client.api.EmailsApi;

public class Resend {
    private ApiClient apiClient;
    public final ApiKeysApi apiKeys;
    public final AudiencesApi audiences;
    public final ContactsApi contacts;
    public final DomainsApi domains;
    public final EmailsApi emails;

    public Resend() {
        this(null);
    }

    public Resend(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.apiKeys = new ApiKeysApi(this.apiClient);
        this.audiences = new AudiencesApi(this.apiClient);
        this.contacts = new ContactsApi(this.apiClient);
        this.domains = new DomainsApi(this.apiClient);
        this.emails = new EmailsApi(this.apiClient);
    }

}
