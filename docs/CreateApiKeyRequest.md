

# CreateApiKeyRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The API key name. |  |
|**permission** | [**PermissionEnum**](#PermissionEnum) | The API key can have full access to Resend’s API or be only restricted to send emails. * full_access - Can create, delete, get, and update any resource. * sending_access - Can only send emails. |  [optional] |
|**domainId** | **String** | Restrict an API key to send emails only from a specific domain. Only used when the permission is sending_acces. |  [optional] |



## Enum: PermissionEnum

| Name | Value |
|---- | -----|
| FULL_ACCESS | &quot;full_access&quot; |
| SENDING_ACCESS | &quot;sending_access&quot; |



