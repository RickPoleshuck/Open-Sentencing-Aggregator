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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Sentence;
import java.util.ArrayList;
import java.util.List;
import javax.validation.constraints.*;

/**
 * Charge
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-10-05T20:11:58.952Z")
public class Charge   {
  @JsonProperty("_id")
  private String _id = null;

  @JsonProperty("_rev")
  private String _rev = null;

  /**
   * Gets or Sets trialType
   */
  public enum TrialTypeEnum {
    GUILTY_PLEA("Guilty plea"),
    
    TRIAL_BY_JUDGE("Trial by judge"),
    
    TRIAL_BY_JURY("Trial by jury");

    private String value;

    TrialTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TrialTypeEnum fromValue(String text) {
      for (TrialTypeEnum b : TrialTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("trial_type")
  private TrialTypeEnum trialType = null;

  @JsonProperty("disposition_charged_class")
  private String dispositionChargedClass = null;

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

  @JsonProperty("attempted")
  private Boolean attempted = null;

  @JsonProperty("primary")
  private Boolean primary = null;

  @JsonProperty("controlled_substance_quantity_level")
  private Integer controlledSubstanceQuantityLevel = null;

  @JsonProperty("possible_sentences")
  private List<Sentence> possibleSentences = null;

  public Charge id(String id) {
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

  public Charge rev(String rev) {
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

  public Charge trialType(TrialTypeEnum trialType) {
    this.trialType = trialType;
    return this;
  }

  /**
   * Get trialType
   * @return trialType
   **/
  @JsonProperty("trial_type")
  @ApiModelProperty(value = "")
  public TrialTypeEnum getTrialType() {
    return trialType;
  }

  public void setTrialType(TrialTypeEnum trialType) {
    this.trialType = trialType;
  }

  public Charge dispositionChargedClass(String dispositionChargedClass) {
    this.dispositionChargedClass = dispositionChargedClass;
    return this;
  }

  /**
   * Get dispositionChargedClass
   * @return dispositionChargedClass
   **/
  @JsonProperty("disposition_charged_class")
  @ApiModelProperty(value = "")
  public String getDispositionChargedClass() {
    return dispositionChargedClass;
  }

  public void setDispositionChargedClass(String dispositionChargedClass) {
    this.dispositionChargedClass = dispositionChargedClass;
  }

  public Charge chargeCode(ChargeCodeEnum chargeCode) {
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

  public Charge attempted(Boolean attempted) {
    this.attempted = attempted;
    return this;
  }

  /**
   * Get attempted
   * @return attempted
   **/
  @JsonProperty("attempted")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Boolean isAttempted() {
    return attempted;
  }

  public void setAttempted(Boolean attempted) {
    this.attempted = attempted;
  }

  public Charge primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

  /**
   * Get primary
   * @return primary
   **/
  @JsonProperty("primary")
  @ApiModelProperty(required = true, value = "")
  @NotNull
  public Boolean isPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public Charge controlledSubstanceQuantityLevel(Integer controlledSubstanceQuantityLevel) {
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
  @ApiModelProperty(value = "")
 @Min(0) @Max(17)  public Integer getControlledSubstanceQuantityLevel() {
    return controlledSubstanceQuantityLevel;
  }

  public void setControlledSubstanceQuantityLevel(Integer controlledSubstanceQuantityLevel) {
    this.controlledSubstanceQuantityLevel = controlledSubstanceQuantityLevel;
  }

  public Charge possibleSentences(List<Sentence> possibleSentences) {
    this.possibleSentences = possibleSentences;
    return this;
  }

  public Charge addPossibleSentencesItem(Sentence possibleSentencesItem) {
    if (this.possibleSentences == null) {
      this.possibleSentences = new ArrayList<Sentence>();
    }
    this.possibleSentences.add(possibleSentencesItem);
    return this;
  }

  /**
   * Get possibleSentences
   * @return possibleSentences
   **/
  @JsonProperty("possible_sentences")
  @ApiModelProperty(value = "")
  public List<Sentence> getPossibleSentences() {
    return possibleSentences;
  }

  public void setPossibleSentences(List<Sentence> possibleSentences) {
    this.possibleSentences = possibleSentences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Charge charge = (Charge) o;
    return Objects.equals(this._id, charge._id) &&
        Objects.equals(this._rev, charge._rev) &&
        Objects.equals(this.trialType, charge.trialType) &&
        Objects.equals(this.dispositionChargedClass, charge.dispositionChargedClass) &&
        Objects.equals(this.chargeCode, charge.chargeCode) &&
        Objects.equals(this.attempted, charge.attempted) &&
        Objects.equals(this.primary, charge.primary) &&
        Objects.equals(this.controlledSubstanceQuantityLevel, charge.controlledSubstanceQuantityLevel) &&
        Objects.equals(this.possibleSentences, charge.possibleSentences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_id, _rev, trialType, dispositionChargedClass, chargeCode, attempted, primary, controlledSubstanceQuantityLevel, possibleSentences);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Charge {\n");
    
    sb.append("    _id: ").append(toIndentedString(_id)).append("\n");
    sb.append("    _rev: ").append(toIndentedString(_rev)).append("\n");
    sb.append("    trialType: ").append(toIndentedString(trialType)).append("\n");
    sb.append("    dispositionChargedClass: ").append(toIndentedString(dispositionChargedClass)).append("\n");
    sb.append("    chargeCode: ").append(toIndentedString(chargeCode)).append("\n");
    sb.append("    attempted: ").append(toIndentedString(attempted)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    controlledSubstanceQuantityLevel: ").append(toIndentedString(controlledSubstanceQuantityLevel)).append("\n");
    sb.append("    possibleSentences: ").append(toIndentedString(possibleSentences)).append("\n");
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

