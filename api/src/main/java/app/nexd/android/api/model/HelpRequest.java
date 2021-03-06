/*
 * Nexd API
 * Swagger API description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package app.nexd.android.api.model;

import java.util.Objects;
import java.util.Arrays;
import app.nexd.android.api.model.Call;
import app.nexd.android.api.model.HelpList;
import app.nexd.android.api.model.HelpRequestArticle;
import app.nexd.android.api.model.User;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * HelpRequest
 */

public class HelpRequest {
  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_STREET = "street";
  @SerializedName(SERIALIZED_NAME_STREET)
  private String street;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private String number;

  public static final String SERIALIZED_NAME_ZIP_CODE = "zipCode";
  @SerializedName(SERIALIZED_NAME_ZIP_CODE)
  private String zipCode;

  public static final String SERIALIZED_NAME_CITY = "city";
  @SerializedName(SERIALIZED_NAME_CITY)
  private String city;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id;

  public static final String SERIALIZED_NAME_HELP_LIST_ID = "helpListId";
  @SerializedName(SERIALIZED_NAME_HELP_LIST_ID)
  private Long helpListId;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Date createdAt;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private String priority;

  public static final String SERIALIZED_NAME_ADDITIONAL_REQUEST = "additionalRequest";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_REQUEST)
  private String additionalRequest;

  public static final String SERIALIZED_NAME_DELIVERY_COMMENT = "deliveryComment";
  @SerializedName(SERIALIZED_NAME_DELIVERY_COMMENT)
  private String deliveryComment;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    PENDING("pending"),
    
    ONGOING("ongoing"),
    
    COMPLETED("completed"),
    
    DEACTIVATED("deactivated");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StatusEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StatusEnum status;

  public static final String SERIALIZED_NAME_ARTICLES = "articles";
  @SerializedName(SERIALIZED_NAME_ARTICLES)
  private List<HelpRequestArticle> articles = null;

  public static final String SERIALIZED_NAME_REQUESTER_ID = "requesterId";
  @SerializedName(SERIALIZED_NAME_REQUESTER_ID)
  private String requesterId;

  public static final String SERIALIZED_NAME_REQUESTER = "requester";
  @SerializedName(SERIALIZED_NAME_REQUESTER)
  private User requester;

  public static final String SERIALIZED_NAME_HELP_LIST = "helpList";
  @SerializedName(SERIALIZED_NAME_HELP_LIST)
  private HelpList helpList;

  public static final String SERIALIZED_NAME_CALL = "call";
  @SerializedName(SERIALIZED_NAME_CALL)
  private Call call;


  public HelpRequest firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFirstName() {
    return firstName;
  }


  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public HelpRequest lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLastName() {
    return lastName;
  }


  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public HelpRequest street(String street) {
    
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStreet() {
    return street;
  }


  public void setStreet(String street) {
    this.street = street;
  }


  public HelpRequest number(String number) {
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNumber() {
    return number;
  }


  public void setNumber(String number) {
    this.number = number;
  }


  public HelpRequest zipCode(String zipCode) {
    
    this.zipCode = zipCode;
    return this;
  }

   /**
   * Get zipCode
   * @return zipCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getZipCode() {
    return zipCode;
  }


  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }


  public HelpRequest city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public HelpRequest id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public HelpRequest helpListId(Long helpListId) {
    
    this.helpListId = helpListId;
    return this;
  }

   /**
   * Get helpListId
   * @return helpListId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getHelpListId() {
    return helpListId;
  }


  public void setHelpListId(Long helpListId) {
    this.helpListId = helpListId;
  }


  public HelpRequest createdAt(Date createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Date getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }


  public HelpRequest priority(String priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPriority() {
    return priority;
  }


  public void setPriority(String priority) {
    this.priority = priority;
  }


  public HelpRequest additionalRequest(String additionalRequest) {
    
    this.additionalRequest = additionalRequest;
    return this;
  }

   /**
   * Get additionalRequest
   * @return additionalRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAdditionalRequest() {
    return additionalRequest;
  }


  public void setAdditionalRequest(String additionalRequest) {
    this.additionalRequest = additionalRequest;
  }


  public HelpRequest deliveryComment(String deliveryComment) {
    
    this.deliveryComment = deliveryComment;
    return this;
  }

   /**
   * Get deliveryComment
   * @return deliveryComment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDeliveryComment() {
    return deliveryComment;
  }


  public void setDeliveryComment(String deliveryComment) {
    this.deliveryComment = deliveryComment;
  }


  public HelpRequest phoneNumber(String phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * Get phoneNumber
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }


  public HelpRequest status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public StatusEnum getStatus() {
    return status;
  }


  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public HelpRequest articles(List<HelpRequestArticle> articles) {
    
    this.articles = articles;
    return this;
  }

  public HelpRequest addArticlesItem(HelpRequestArticle articlesItem) {
    if (this.articles == null) {
      this.articles = new ArrayList<HelpRequestArticle>();
    }
    this.articles.add(articlesItem);
    return this;
  }

   /**
   * Get articles
   * @return articles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<HelpRequestArticle> getArticles() {
    return articles;
  }


  public void setArticles(List<HelpRequestArticle> articles) {
    this.articles = articles;
  }


  public HelpRequest requesterId(String requesterId) {
    
    this.requesterId = requesterId;
    return this;
  }

   /**
   * Get requesterId
   * @return requesterId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRequesterId() {
    return requesterId;
  }


  public void setRequesterId(String requesterId) {
    this.requesterId = requesterId;
  }


  public HelpRequest requester(User requester) {
    
    this.requester = requester;
    return this;
  }

   /**
   * Get requester
   * @return requester
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public User getRequester() {
    return requester;
  }


  public void setRequester(User requester) {
    this.requester = requester;
  }


  public HelpRequest helpList(HelpList helpList) {
    
    this.helpList = helpList;
    return this;
  }

   /**
   * Get helpList
   * @return helpList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public HelpList getHelpList() {
    return helpList;
  }


  public void setHelpList(HelpList helpList) {
    this.helpList = helpList;
  }


  public HelpRequest call(Call call) {
    
    this.call = call;
    return this;
  }

   /**
   * Get call
   * @return call
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Call getCall() {
    return call;
  }


  public void setCall(Call call) {
    this.call = call;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HelpRequest helpRequest = (HelpRequest) o;
    return Objects.equals(this.firstName, helpRequest.firstName) &&
        Objects.equals(this.lastName, helpRequest.lastName) &&
        Objects.equals(this.street, helpRequest.street) &&
        Objects.equals(this.number, helpRequest.number) &&
        Objects.equals(this.zipCode, helpRequest.zipCode) &&
        Objects.equals(this.city, helpRequest.city) &&
        Objects.equals(this.id, helpRequest.id) &&
        Objects.equals(this.helpListId, helpRequest.helpListId) &&
        Objects.equals(this.createdAt, helpRequest.createdAt) &&
        Objects.equals(this.priority, helpRequest.priority) &&
        Objects.equals(this.additionalRequest, helpRequest.additionalRequest) &&
        Objects.equals(this.deliveryComment, helpRequest.deliveryComment) &&
        Objects.equals(this.phoneNumber, helpRequest.phoneNumber) &&
        Objects.equals(this.status, helpRequest.status) &&
        Objects.equals(this.articles, helpRequest.articles) &&
        Objects.equals(this.requesterId, helpRequest.requesterId) &&
        Objects.equals(this.requester, helpRequest.requester) &&
        Objects.equals(this.helpList, helpRequest.helpList) &&
        Objects.equals(this.call, helpRequest.call);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, street, number, zipCode, city, id, helpListId, createdAt, priority, additionalRequest, deliveryComment, phoneNumber, status, articles, requesterId, requester, helpList, call);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HelpRequest {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    helpListId: ").append(toIndentedString(helpListId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    additionalRequest: ").append(toIndentedString(additionalRequest)).append("\n");
    sb.append("    deliveryComment: ").append(toIndentedString(deliveryComment)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    articles: ").append(toIndentedString(articles)).append("\n");
    sb.append("    requesterId: ").append(toIndentedString(requesterId)).append("\n");
    sb.append("    requester: ").append(toIndentedString(requester)).append("\n");
    sb.append("    helpList: ").append(toIndentedString(helpList)).append("\n");
    sb.append("    call: ").append(toIndentedString(call)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

