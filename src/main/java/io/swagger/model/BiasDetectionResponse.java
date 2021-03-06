/*
 * Outcarcerate
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.2
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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Deviation;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * BiasDetectionResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-10-13T17:17:47.836Z")
public class BiasDetectionResponse   {
  @JsonProperty("code")
  private Integer code = null;

  @JsonProperty("success")
  private Boolean success = null;

  @JsonProperty("error")
  private String error = null;

  @JsonProperty("warning")
  private String warning = null;

  /**
   * Gets or Sets chargeCode
   */
  public enum ChargeCodeEnum {
    ADMINISTRATION_OF_JUSTICE("Administration of Justice"),
    
    AGGRAVATED_ASSAULT_POLICE_OFFICER("Aggravated Assault Police Officer"),
    
    AGGRAVATED_BATTERY_POLICE_OFFICER("Aggravated Battery Police Officer"),
    
    AGGRAVATED_BATTERY_WITH_A_FIREARM("Aggravated Battery With A Firearm"),
    
    AGGRAVATED_BATTERY("Aggravated Battery"),
    
    AGGRAVATED_DISCHARGE_FIREARM("Aggravated Discharge Firearm"),
    
    AGGRAVATED_DUI("Aggravated DUI"),
    
    AGGRAVATED_FLEEING_AND_ELUDING("Aggravated Fleeing and Eluding"),
    
    AGGRAVATED_IDENTITY_THEFT("Aggravated Identity Theft"),
    
    AGGRAVATED_ROBBERY("Aggravated Robbery"),
    
    ANTITRUST("Antitrust"),
    
    ARMED_ROBBERY("Armed Robbery"),
    
    ARMED_VIOLENCE("Armed Violence"),
    
    ARSON_AND_ATTEMPT_ARSON("Arson and Attempt Arson"),
    
    ARSON("Arson"),
    
    ATTEMPT_ARMED_ROBBERY("Attempt Armed Robbery"),
    
    ATTEMPT_ARSON("Attempt Arson"),
    
    ATTEMPT_FIRST_DEGREE_MURDER("Attempt First Degree Murder"),
    
    ATTEMPT_HOMICIDE("Attempt Homicide"),
    
    ATTEMPT_SEX_CRIMES("Attempt Sex Crimes"),
    
    ATTEMPT_VEHICULAR_HIJACKING("Attempt Vehicular Hijacking"),
    
    BATTERY("Battery"),
    
    BOMB_THREAT("Bomb Threat"),
    
    BRIBERY("Bribery"),
    
    BRIBERY_CORRUPTION("Bribery/Corruption"),
    
    BURGLARY("Burglary"),
    
    BURGLARY_TRESPASS("Burglary/Trespass"),
    
    CHILD_ABDUCTION("Child Abduction"),
    
    CHILD_PORNOGRAPHY("Child Pornography"),
    
    COMMERCIALIZED_VICE("Commercialized Vice"),
    
    COMMUNICATING_WITH_WITNESS("Communicating With Witness"),
    
    CREDIT_CARD_CASES("Credit Card Cases"),
    
    CRIMINAL_DAMAGE_TO_PROPERTY("Criminal Damage to Property"),
    
    CRIMINAL_TRESPASS_TO_RESIDENCE("Criminal Trespass To Residence"),
    
    DECEPTIVE_PRACTICE("Deceptive Practice"),
    
    DISARMING_POLICE_OFFICER("Disarming Police Officer"),
    
    DOG_FIGHTING("Dog Fighting"),
    
    DOMESTIC_BATTERY("Domestic Battery"),
    
    DRIVING_WITH_SUSPENDED_OR_REVOKED_LICENSE("Driving With Suspended Or Revoked License"),
    
    DRUG_POSSESSION("Drug Possession"),
    
    DRUG_TRAFFICKING("Drug Trafficking"),
    
    DUI("DUI"),
    
    ENVIRONMENTAL("Environmental"),
    
    ESCAPE_FAILURE_TO_RETURN("Escape - Failure to Return"),
    
    EXTORTION_RACKETEERING("Extortion/Racketeering"),
    
    FALSIFICATION_OF_ACCOUNTS("FALSIFICATION OF ACCOUNTS"),
    
    FAILURE_TO_REGISTER_AS_A_SEX_OFFENDER("Failure to Register as a Sex Offender"),
    
    FIREARMS("Firearms"),
    
    FOOD_AND_DRUG("Food and Drug"),
    
    FORGERY("Forgery"),
    
    FORGERY_COUNTER_COPYRIGHT("Forgery/Counter/Copyright"),
    
    FRAUD("Fraud"),
    
    FRAUD_THEFT_EMBEZZLEMENT("Fraud/Theft/Embezzlement"),
    
    FRAUDULENT_ID("Fraudulent ID"),
    
    GAMBLING("Gambling"),
    
    GUN_NON_UUW("Gun - Non UUW"),
    
    GUN_RUNNING("Gun Running"),
    
    HATE_CRIMES("Hate Crimes"),
    
    HOME_INVASION("Home Invasion"),
    
    HOMICIDE("Homicide"),
    
    HUMAN_TRAFFICKING("Human Trafficking"),
    
    IDENTITY_THEFT("Identity Theft"),
    
    IMMIGRATION("Immigration"),
    
    IMPERSONATING_POLICE_OFFICER("Impersonating Police Officer"),
    
    INTIMIDATION("Intimidation"),
    
    INVIDUAL_RIGHTS("Invidual Rights"),
    
    KIDNAPPING("Kidnapping"),
    
    MAJOR_ACCIDENTS("Major Accidents"),
    
    MANSLAUGHTER("Manslaughter"),
    
    MONEY_LAUNDERING("Money Laundering"),
    
    MURDER("Murder"),
    
    NARCOTICS("Narcotics"),
    
    NATIONAL_DEFENSE("National Defense"),
    
    OBSCENITY_OTHER_SEX_OFFENSES("Obscenity/Other Sex Offenses"),
    
    OBSTRUCTING_JUSTICE("Obstructing Justice"),
    
    OFFICIAL_MISCONDUCT("Official Misconduct"),
    
    OTHER_OFFENSE("Other Offense"),
    
    OTHER("Other"),
    
    PANDERING("Pandering"),
    
    PERJURY("Perjury"),
    
    POSSESSION_OF_BURGLARY_TOOLS("Possession Of Burglary Tools"),
    
    POSSESSION_OF_CONTRABAND_IN_PENAL_INSTITUTION("Possession of Contraband in Penal Institution"),
    
    POSSESSION_OF_EXPLOSIVES("Possession of Explosives"),
    
    POSSESSION_OF_STOLEN_MOTOR_VEHICLE("Possession of Stolen Motor Vehicle"),
    
    PRISON_OFFENSES("Prison Offenses"),
    
    PROMIS_CONVERSION("PROMIS Conversion"),
    
    PROSTITUTION("Prostitution"),
    
    RECKLESS_DISCHARGE_OF_FIREARM("Reckless Discharge of Firearm"),
    
    RECKLESS_HOMICIDE("Reckless Homicide"),
    
    RESIDENTIAL_BURGLARY("Residential Burglary"),
    
    RETAIL_THEFT("Retail Theft"),
    
    REVOKED_SUSPENDED_2ND_DUI("REVOKED/SUSPENDED 2ND+ DUI"),
    
    ROBBERY("Robbery"),
    
    SEX_CRIMES("Sex Crimes"),
    
    SEX_WITH_ANIMAL_18_PRESENT("SEX WITH ANIMAL/<18 PRESENT"),
    
    SEXUAL_ABUSE("Sexual Abuse"),
    
    STALKING("Stalking"),
    
    STALKING_HARASSING("Stalking/Harassing"),
    
    TAMPERING("Tampering"),
    
    TAX("Tax"),
    
    THEFT_BY_DECEPTION("Theft by Deception"),
    
    THEFT("Theft"),
    
    UNLAWFUL_RESTRAINT("Unlawful Restraint"),
    
    UUW_UNLAWFUL_USE_OF_WEAPON("UUW - Unlawful Use of Weapon"),
    
    VEHICULAR_HIJACKING("Vehicular Hijacking"),
    
    VEHICULAR_INVASION("Vehicular Invasion"),
    
    VIOLATE_BAIL_BOND("Violate Bail Bond"),
    
    VIO_BAIL_BOND_CLASS_X_CONVIC("VIO BAIL BOND/CLASS X CONVIC"),
    
    VIOLATION_OF_SEX_OFFENDER_REGISTRATION("Violation of Sex Offender Registration"),
    
    VIOLATION_ORDER_OF_PROTECTION("Violation Order Of Protection");

    private String value;

    ChargeCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ChargeCodeEnum fromValue(String text) {
      for (ChargeCodeEnum b : ChargeCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("charge_code")
  private ChargeCodeEnum chargeCode = null;

  /**
   * Gets or Sets race
   */
  public enum RaceEnum {
    WHITE("White"),
    
    BLACK("Black"),
    
    HISPANIC("Hispanic"),
    
    OTHER("Other"),
    
    ASIAN("Asian"),
    
    AMERICAN_INDIAN("American Indian"),
    
    BIRACIAL("Biracial"),
    
    WHITE_HISPANIC_OR_LATINO_("White [Hispanic or Latino]"),
    
    WHITE_BLACK_HISPANIC_OR_LATINO_("White/Black [Hispanic or Latino]"),
    
    UNKNOWN("Unknown");

    private String value;

    RaceEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RaceEnum fromValue(String text) {
      for (RaceEnum b : RaceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("race")
  private RaceEnum race = null;

  /**
   * Gets or Sets gender
   */
  public enum GenderEnum {
    FEMALE("Female"),
    
    MALE("Male"),
    
    OTHER("Other"),
    
    UNKNOWN("Unknown");

    private String value;

    GenderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static GenderEnum fromValue(String text) {
      for (GenderEnum b : GenderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("gender")
  private GenderEnum gender = null;

  @JsonProperty("controlled_substance_quantity_level")
  private Integer controlledSubstanceQuantityLevel = null;

  @JsonProperty("deviations")
  private List<Deviation> deviations = new ArrayList<Deviation>();

  public BiasDetectionResponse code(Integer code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   **/
  @JsonProperty("code")
  @ApiModelProperty(value = "")
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public BiasDetectionResponse success(Boolean success) {
    this.success = success;
    return this;
  }

  /**
   * Get success
   * @return success
   **/
  @JsonProperty("success")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Boolean isSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public BiasDetectionResponse error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   **/
  @JsonProperty("error")
  @ApiModelProperty(value = "")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public BiasDetectionResponse warning(String warning) {
    this.warning = warning;
    return this;
  }

  /**
   * Get warning
   * @return warning
   **/
  @JsonProperty("warning")
  @ApiModelProperty(value = "")
  public String getWarning() {
    return warning;
  }

  public void setWarning(String warning) {
    this.warning = warning;
  }

  public BiasDetectionResponse chargeCode(ChargeCodeEnum chargeCode) {
    this.chargeCode = chargeCode;
    return this;
  }

  /**
   * Get chargeCode
   * @return chargeCode
   **/
  @JsonProperty("charge_code")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public ChargeCodeEnum getChargeCode() {
    return chargeCode;
  }

  public void setChargeCode(ChargeCodeEnum chargeCode) {
    this.chargeCode = chargeCode;
  }

  public BiasDetectionResponse race(RaceEnum race) {
    this.race = race;
    return this;
  }

  /**
   * Get race
   * @return race
   **/
  @JsonProperty("race")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public RaceEnum getRace() {
    return race;
  }

  public void setRace(RaceEnum race) {
    this.race = race;
  }

  public BiasDetectionResponse gender(GenderEnum gender) {
    this.gender = gender;
    return this;
  }

  /**
   * Get gender
   * @return gender
   **/
  @JsonProperty("gender")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public GenderEnum getGender() {
    return gender;
  }

  public void setGender(GenderEnum gender) {
    this.gender = gender;
  }

  public BiasDetectionResponse controlledSubstanceQuantityLevel(Integer controlledSubstanceQuantityLevel) {
    this.controlledSubstanceQuantityLevel = controlledSubstanceQuantityLevel;
    return this;
  }

  /**
   * Get controlledSubstanceQuantityLevel
   * minimum: 0
   * maximum: 17
   * @return controlledSubstanceQuantityLevel
   **/
  @JsonProperty("controlled_substance_quantity_level")
  @ApiModelProperty(required = true, value = "")
  @NotNull
 @Min(0) @Max(17)  public Integer getControlledSubstanceQuantityLevel() {
    return controlledSubstanceQuantityLevel;
  }

  public void setControlledSubstanceQuantityLevel(Integer controlledSubstanceQuantityLevel) {
    this.controlledSubstanceQuantityLevel = controlledSubstanceQuantityLevel;
  }

  public BiasDetectionResponse deviations(List<Deviation> deviations) {
    this.deviations = deviations;
    return this;
  }

  public BiasDetectionResponse addDeviationsItem(Deviation deviationsItem) {
    this.deviations.add(deviationsItem);
    return this;
  }

  /**
   * Get deviations
   * @return deviations
   **/
  @JsonProperty("deviations")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public List<Deviation> getDeviations() {
    return deviations;
  }

  public void setDeviations(List<Deviation> deviations) {
    this.deviations = deviations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BiasDetectionResponse biasDetectionResponse = (BiasDetectionResponse) o;
    return Objects.equals(this.code, biasDetectionResponse.code) &&
        Objects.equals(this.success, biasDetectionResponse.success) &&
        Objects.equals(this.error, biasDetectionResponse.error) &&
        Objects.equals(this.warning, biasDetectionResponse.warning) &&
        Objects.equals(this.chargeCode, biasDetectionResponse.chargeCode) &&
        Objects.equals(this.race, biasDetectionResponse.race) &&
        Objects.equals(this.gender, biasDetectionResponse.gender) &&
        Objects.equals(this.controlledSubstanceQuantityLevel, biasDetectionResponse.controlledSubstanceQuantityLevel) &&
        Objects.equals(this.deviations, biasDetectionResponse.deviations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, success, error, warning, chargeCode, race, gender, controlledSubstanceQuantityLevel, deviations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BiasDetectionResponse {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
    sb.append("    chargeCode: ").append(toIndentedString(chargeCode)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    controlledSubstanceQuantityLevel: ").append(toIndentedString(controlledSubstanceQuantityLevel)).append("\n");
    sb.append("    deviations: ").append(toIndentedString(deviations)).append("\n");
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

