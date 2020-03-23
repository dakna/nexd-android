/*
 * Simple API
 * Simple API Description
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package de.andrestefanov.android.nearbuy.api.model;

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

/**
 * CreateRequestArticleDto
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-03-23T23:32:44.981584+01:00[Europe/Berlin]")
public class CreateRequestArticleDto {
  public static final String SERIALIZED_NAME_ARTICLE_ID = "articleId";
  @SerializedName(SERIALIZED_NAME_ARTICLE_ID)
  private Integer articleId;

  public static final String SERIALIZED_NAME_ARTICLE_COUNT = "articleCount";
  @SerializedName(SERIALIZED_NAME_ARTICLE_COUNT)
  private Integer articleCount;


  public CreateRequestArticleDto articleId(Integer articleId) {
    
    this.articleId = articleId;
    return this;
  }

   /**
   * Article ID received from the article list
   * @return articleId
  **/
  @ApiModelProperty(required = true, value = "Article ID received from the article list")

  public Integer getArticleId() {
    return articleId;
  }


  public void setArticleId(Integer articleId) {
    this.articleId = articleId;
  }


  public CreateRequestArticleDto articleCount(Integer articleCount) {
    
    this.articleCount = articleCount;
    return this;
  }

   /**
   * Number of items
   * @return articleCount
  **/
  @ApiModelProperty(required = true, value = "Number of items")

  public Integer getArticleCount() {
    return articleCount;
  }


  public void setArticleCount(Integer articleCount) {
    this.articleCount = articleCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateRequestArticleDto createRequestArticleDto = (CreateRequestArticleDto) o;
    return Objects.equals(this.articleId, createRequestArticleDto.articleId) &&
        Objects.equals(this.articleCount, createRequestArticleDto.articleCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(articleId, articleCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateRequestArticleDto {\n");
    sb.append("    articleId: ").append(toIndentedString(articleId)).append("\n");
    sb.append("    articleCount: ").append(toIndentedString(articleCount)).append("\n");
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

