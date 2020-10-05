/*
 * Outcarcerate
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ModelCase;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * Attorney
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-10-05T20:11:58.952Z")
public class Attorney   {
  @JsonProperty("_id")
  private String _id = null;

  @JsonProperty("_rev")
  private String _rev = null;

  @JsonProperty("username")
  private String username = null;

  @JsonProperty("cases")
  private List<ModelCase> cases = null;

  public Attorney id(String id) {
    this._id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @JsonProperty("_id")
  @ApiModelProperty(value = "")
  public String getId() {
    return _id;
  }

  public void setId(String id) {
    this._id = id;
  }

  public Attorney rev(String rev) {
    this._rev = rev;
    return this;
  }

  /**
   * Get rev
   * @return rev
   **/
  @JsonProperty("_rev")
  @ApiModelProperty(value = "")
  public String getRev() {
    return _rev;
  }

  public void setRev(String rev) {
    this._rev = rev;
  }

  public Attorney username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @JsonProperty("username")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Attorney cases(List<ModelCase> cases) {
    this.cases = cases;
    return this;
  }

  public Attorney addCasesItem(ModelCase casesItem) {
    if (this.cases == null) {
      this.cases = new ArrayList<ModelCase>();
    }
    this.cases.add(casesItem);
    return this;
  }

  /**
   * Get cases
   * @return cases
   **/
  @JsonProperty("cases")
  @ApiModelProperty(value = "")
  public List<ModelCase> getCases() {
    return cases;
  }

  public void setCases(List<ModelCase> cases) {
    this.cases = cases;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Attorney attorney = (Attorney) o;
    return Objects.equals(this._id, attorney._id) &&
        Objects.equals(this._rev, attorney._rev) &&
        Objects.equals(this.username, attorney.username) &&
        Objects.equals(this.cases, attorney.cases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_id, _rev, username, cases);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Attorney {\n");
    
    sb.append("    _id: ").append(toIndentedString(_id)).append("\n");
    sb.append("    _rev: ").append(toIndentedString(_rev)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
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

