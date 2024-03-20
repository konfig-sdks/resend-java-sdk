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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * Email
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Email {
  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private String _object;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<String> to = null;

  public static final String SERIALIZED_NAME_FROM = "from";
  @SerializedName(SERIALIZED_NAME_FROM)
  private String from;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public static final String SERIALIZED_NAME_HTML = "html";
  @SerializedName(SERIALIZED_NAME_HTML)
  private String html;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_BCC = "bcc";
  @SerializedName(SERIALIZED_NAME_BCC)
  private List<String> bcc = null;

  public static final String SERIALIZED_NAME_CC = "cc";
  @SerializedName(SERIALIZED_NAME_CC)
  private List<String> cc = null;

  public static final String SERIALIZED_NAME_REPLY_TO = "reply_to";
  @SerializedName(SERIALIZED_NAME_REPLY_TO)
  private List<String> replyTo = null;

  public static final String SERIALIZED_NAME_LAST_EVENT = "last_event";
  @SerializedName(SERIALIZED_NAME_LAST_EVENT)
  private String lastEvent;

  public Email() {
  }

  public Email _object(String _object) {
    
    
    
    
    this._object = _object;
    return this;
  }

   /**
   * The type of object.
   * @return _object
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "email", value = "The type of object.")

  public String getObject() {
    return _object;
  }


  public void setObject(String _object) {
    
    
    
    this._object = _object;
  }


  public Email id(String id) {
    
    
    
    
    this.id = id;
    return this;
  }

   /**
   * The ID of the email.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4ef9a417-02e9-4d39-ad75-9611e0fcc33c", value = "The ID of the email.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    
    
    
    this.id = id;
  }


  public Email to(List<String> to) {
    
    
    
    
    this.to = to;
    return this;
  }

  public Email addToItem(String toItem) {
    if (this.to == null) {
      this.to = new ArrayList<>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"delivered@resend.dev\"]", value = "")

  public List<String> getTo() {
    return to;
  }


  public void setTo(List<String> to) {
    
    
    
    this.to = to;
  }


  public Email from(String from) {
    
    
    
    
    this.from = from;
    return this;
  }

   /**
   * The email address of the sender.
   * @return from
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Acme <onboarding@resend.dev>", value = "The email address of the sender.")

  public String getFrom() {
    return from;
  }


  public void setFrom(String from) {
    
    
    
    this.from = from;
  }


  public Email createdAt(OffsetDateTime createdAt) {
    
    
    
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The date and time the email was created.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2023-04-03T22:13:42.674981Z", value = "The date and time the email was created.")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    
    
    
    this.createdAt = createdAt;
  }


  public Email subject(String subject) {
    
    
    
    
    this.subject = subject;
    return this;
  }

   /**
   * The subject line of the email.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hello World", value = "The subject line of the email.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    
    
    
    this.subject = subject;
  }


  public Email html(String html) {
    
    
    
    
    this.html = html;
    return this;
  }

   /**
   * The HTML body of the email.
   * @return html
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Congrats on sending your <strong>first email</strong>!", value = "The HTML body of the email.")

  public String getHtml() {
    return html;
  }


  public void setHtml(String html) {
    
    
    
    this.html = html;
  }


  public Email text(String text) {
    
    
    
    
    this.text = text;
    return this;
  }

   /**
   * The plain text body of the email.
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The plain text body of the email.")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    
    
    
    this.text = text;
  }


  public Email bcc(List<String> bcc) {
    
    
    
    
    this.bcc = bcc;
    return this;
  }

  public Email addBccItem(String bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * The email addresses of the blind carbon copy recipients.
   * @return bcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email addresses of the blind carbon copy recipients.")

  public List<String> getBcc() {
    return bcc;
  }


  public void setBcc(List<String> bcc) {
    
    
    
    this.bcc = bcc;
  }


  public Email cc(List<String> cc) {
    
    
    
    
    this.cc = cc;
    return this;
  }

  public Email addCcItem(String ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * The email addresses of the carbon copy recipients.
   * @return cc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email addresses of the carbon copy recipients.")

  public List<String> getCc() {
    return cc;
  }


  public void setCc(List<String> cc) {
    
    
    
    this.cc = cc;
  }


  public Email replyTo(List<String> replyTo) {
    
    
    
    
    this.replyTo = replyTo;
    return this;
  }

  public Email addReplyToItem(String replyToItem) {
    if (this.replyTo == null) {
      this.replyTo = new ArrayList<>();
    }
    this.replyTo.add(replyToItem);
    return this;
  }

   /**
   * The email addresses to which replies should be sent.
   * @return replyTo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The email addresses to which replies should be sent.")

  public List<String> getReplyTo() {
    return replyTo;
  }


  public void setReplyTo(List<String> replyTo) {
    
    
    
    this.replyTo = replyTo;
  }


  public Email lastEvent(String lastEvent) {
    
    
    
    
    this.lastEvent = lastEvent;
    return this;
  }

   /**
   * The status of the email.
   * @return lastEvent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "delivered", value = "The status of the email.")

  public String getLastEvent() {
    return lastEvent;
  }


  public void setLastEvent(String lastEvent) {
    
    
    
    this.lastEvent = lastEvent;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the Email instance itself
   */
  public Email putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Email email = (Email) o;
    return Objects.equals(this._object, email._object) &&
        Objects.equals(this.id, email.id) &&
        Objects.equals(this.to, email.to) &&
        Objects.equals(this.from, email.from) &&
        Objects.equals(this.createdAt, email.createdAt) &&
        Objects.equals(this.subject, email.subject) &&
        Objects.equals(this.html, email.html) &&
        Objects.equals(this.text, email.text) &&
        Objects.equals(this.bcc, email.bcc) &&
        Objects.equals(this.cc, email.cc) &&
        Objects.equals(this.replyTo, email.replyTo) &&
        Objects.equals(this.lastEvent, email.lastEvent)&&
        Objects.equals(this.additionalProperties, email.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_object, id, to, from, createdAt, subject, html, text, bcc, cc, replyTo, lastEvent, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Email {\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    html: ").append(toIndentedString(html)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    lastEvent: ").append(toIndentedString(lastEvent)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("object");
    openapiFields.add("id");
    openapiFields.add("to");
    openapiFields.add("from");
    openapiFields.add("created_at");
    openapiFields.add("subject");
    openapiFields.add("html");
    openapiFields.add("text");
    openapiFields.add("bcc");
    openapiFields.add("cc");
    openapiFields.add("reply_to");
    openapiFields.add("last_event");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Email
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Email.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Email is not found in the empty JSON string", Email.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("object") != null && !jsonObj.get("object").isJsonNull()) && !jsonObj.get("object").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `object` to be a primitive type in the JSON string but got `%s`", jsonObj.get("object").toString()));
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("to") != null && !jsonObj.get("to").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `to` to be an array in the JSON string but got `%s`", jsonObj.get("to").toString()));
      }
      if ((jsonObj.get("from") != null && !jsonObj.get("from").isJsonNull()) && !jsonObj.get("from").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `from` to be a primitive type in the JSON string but got `%s`", jsonObj.get("from").toString()));
      }
      if ((jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonNull()) && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
      if ((jsonObj.get("html") != null && !jsonObj.get("html").isJsonNull()) && !jsonObj.get("html").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `html` to be a primitive type in the JSON string but got `%s`", jsonObj.get("html").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("bcc") != null && !jsonObj.get("bcc").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `bcc` to be an array in the JSON string but got `%s`", jsonObj.get("bcc").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("cc") != null && !jsonObj.get("cc").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `cc` to be an array in the JSON string but got `%s`", jsonObj.get("cc").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("reply_to") != null && !jsonObj.get("reply_to").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `reply_to` to be an array in the JSON string but got `%s`", jsonObj.get("reply_to").toString()));
      }
      if ((jsonObj.get("last_event") != null && !jsonObj.get("last_event").isJsonNull()) && !jsonObj.get("last_event").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `last_event` to be a primitive type in the JSON string but got `%s`", jsonObj.get("last_event").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Email.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Email' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Email> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Email.class));

       return (TypeAdapter<T>) new TypeAdapter<Email>() {
           @Override
           public void write(JsonWriter out, Email value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public Email read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Email instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Email given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Email
  * @throws IOException if the JSON string is invalid with respect to Email
  */
  public static Email fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Email.class);
  }

 /**
  * Convert an instance of Email to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
