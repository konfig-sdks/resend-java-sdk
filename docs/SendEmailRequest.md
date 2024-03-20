

# SendEmailRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional] |
|**from** | **String** | Sender email address. To include a friendly name, use the format \&quot;Your Name &lt;sender@domain.com&gt;\&quot;. |  |
|**to** | **List&lt;String&gt;** |  |  |
|**subject** | **String** | Email subject. |  |
|**bcc** | **String** | Bcc recipient email address. For multiple addresses, send as an array of strings. |  [optional] |
|**cc** | **String** | Cc recipient email address. For multiple addresses, send as an array of strings. |  [optional] |
|**replyTo** | **String** | Reply-to email address. For multiple addresses, send as an array of strings. |  [optional] |
|**html** | **String** | The HTML version of the message. |  [optional] |
|**text** | **String** | The plain text version of the message. |  [optional] |
|**headers** | **Object** | Custom headers to add to the email. |  [optional] |
|**attachments** | [**List&lt;Attachment&gt;**](Attachment.md) |  |  [optional] |



