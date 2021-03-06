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
import app.nexd.android.api.model.CreateHelpRequestArticleDto;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * HelpRequestCreateDto
 */

public class HelpRequestCreateDto {
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

  public static final String SERIALIZED_NAME_ARTICLES = "articles";
  @SerializedName(SERIALIZED_NAME_ARTICLES)
  private List<CreateHelpRequestArticleDto> articles = null;

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
  private StatusEnum status = StatusEnum.PENDING;

  public static final String SERIALIZED_NAME_ADDITIONAL_REQUEST = "additionalRequest";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_REQUEST)
  private String additionalRequest;

  public static final String SERIALIZED_NAME_DELIVERY_COMMENT = "deliveryComment";
  @SerializedName(SERIALIZED_NAME_DELIVERY_COMMENT)
  private String deliveryComment;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phoneNumber";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private String phoneNumber;


  public HelpRequestCreateDto firstName(String firstName) {
    
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


  public HelpRequestCreateDto lastName(String lastName) {
    
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


  public HelpRequestCreateDto street(String street) {
    
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


  public HelpRequestCreateDto number(String number) {
    
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


  public HelpRequestCreateDto zipCode(String zipCode) {
    
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


  public HelpRequestCreateDto city(String city) {
    
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


  public HelpRequestCreateDto articles(List<CreateHelpRequestArticleDto> articles) {
    
    this.articles = articles;
    return this;
  }

  public HelpRequestCreateDto addArticlesItem(CreateHelpRequestArticleDto articlesItem) {
    if (this.articles == null) {
      this.articles = new ArrayList<CreateHelpRequestArticleDto>();
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

  public List<CreateHelpRequestArticleDto> getArticles() {
    return articles;
  }


  public void setArticles(List<CreateHelpRequestArticleDto> articles) {
    this.articles = articles;
  }


  public HelpRequestCreateDto status(StatusEnum status) {
    
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


  public HelpRequestCreateDto additionalRequest(String additionalRequest) {
    
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


  public HelpRequestCreateDto deliveryComment(String deliveryComment) {
    
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


  public HelpRequestCreateDto phoneNumber(String phoneNumber) {
    
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HelpRequestCreateDto helpRequestCreateDto = (HelpRequestCreateDto) o;
    return Objects.equals(this.firstName, helpRequestCreateDto.firstName) &&
        Objects.equals(this.lastName, helpRequestCreateDto.lastName) &&
        Objects.equals(this.street, helpRequestCreateDto.street) &&
        Objects.equals(this.number, helpRequestCreateDto.number) &&
        Objects.equals(this.zipCode, helpRequestCreateDto.zipCode) &&
        Objects.equals(this.city, helpRequestCreateDto.city) &&
        Objects.equals(this.articles, helpRequestCreateDto.articles) &&
        Objects.equals(this.status, helpRequestCreateDto.status) &&
        Objects.equals(this.additionalRequest, helpRequestCreateDto.additionalRequest) &&
        Objects.equals(this.deliveryComment, helpRequestCreateDto.deliveryComment) &&
        Objects.equals(this.phoneNumber, helpRequestCreateDto.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, street, number, zipCode, city, articles, status, additionalRequest, deliveryComment, phoneNumber);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HelpRequestCreateDto {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    articles: ").append(toIndentedString(articles)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    additionalRequest: ").append(toIndentedString(additionalRequest)).append("\n");
    sb.append("    deliveryComment: ").append(toIndentedString(deliveryComment)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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

