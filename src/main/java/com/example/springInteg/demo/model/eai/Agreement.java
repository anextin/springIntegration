package com.example.springInteg.demo.model.eai;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * An agreement represents a contract or arrangement, either written or verbal and sometimes enforceable by law, such as a service level agreement or a customer price agreement. An agreement involves a number of other business entities, such as products, services, and resources and/or their specifications.
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-19T08:51:48.657Z")
public class Agreement {
    @JsonProperty("id")
    private String id = null;

    @JsonProperty("href")
    private String href = null;

    @JsonProperty("agreementType")
    private String agreementType = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("documentNumber")
    private Integer documentNumber = null;

    @JsonProperty("initialDate")
    private OffsetDateTime initialDate = null;

    @JsonProperty("name")
    private String name = null;

    @JsonProperty("statementOfIntent")
    private String statementOfIntent = null;

    @JsonProperty("status")
    private String status = null;

    @JsonProperty("version")
    private String version = null;

    @JsonProperty("agreementAuthorization")
    private List<AgreementAuthorization> agreementAuthorization = null;

    @JsonProperty("agreementItem")
    private List<AgreementItem> agreementItem = new ArrayList<AgreementItem>();

    @JsonProperty("agreementPeriod")
    private TimePeriod agreementPeriod = null;

    @JsonProperty("agreementSpecification")
    private AgreementSpecificationRef agreementSpecification = null;

    @JsonProperty("associatedAgreement")
    private List<AgreementRef> associatedAgreement = null;

    @JsonProperty("characteristic")
    private List<Characteristic> characteristic = null;

    @JsonProperty("completionDate")
    private TimePeriod completionDate = null;

    @JsonProperty("engagedParty")
    private List<RelatedParty> engagedParty = new ArrayList<RelatedParty>();

    @JsonProperty("@baseType")
    private String baseType = null;

    @JsonProperty("@schemaLocation")
    private String schemaLocation = null;

    @JsonProperty("@type")
    private String type = null;

    public Agreement id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier for the agreement
     *
     * @return id
     **/
    @ApiModelProperty(value = "Unique identifier for the agreement")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Agreement href(String href) {
        this.href = href;
        return this;
    }

    /**
     * Unique url identifying the agreement as a resource
     *
     * @return href
     **/
    @ApiModelProperty(value = "Unique url identifying the agreement as a resource")
    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Agreement agreementType(String agreementType) {
        this.agreementType = agreementType;
        return this;
    }

    /**
     * The type of the agreement. For example commercial
     *
     * @return agreementType
     **/
    @ApiModelProperty(required = true, value = "The type of the agreement. For example commercial")
    public String getAgreementType() {
        return agreementType;
    }

    public void setAgreementType(String agreementType) {
        this.agreementType = agreementType;
    }

    public Agreement description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Narrative that explains the agreement and details about the it , such as why the agreement is taking place.
     *
     * @return description
     **/
    @ApiModelProperty(value = "Narrative that explains the agreement and details about the it , such as why the agreement is taking place.")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Agreement documentNumber(Integer documentNumber) {
        this.documentNumber = documentNumber;
        return this;
    }

    /**
     * A reference number assigned to an Agreement that follows a prescribed numbering system.
     *
     * @return documentNumber
     **/
    @ApiModelProperty(value = "A reference number assigned to an Agreement that follows a prescribed numbering system.")
    public Integer getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(Integer documentNumber) {
        this.documentNumber = documentNumber;
    }

    public Agreement initialDate(OffsetDateTime initialDate) {
        this.initialDate = initialDate;
        return this;
    }

    /**
     * Date at which the agreement was initialized
     *
     * @return initialDate
     **/
    @ApiModelProperty(value = "Date at which the agreement was initialized")
    public OffsetDateTime getInitialDate() {
        return initialDate;
    }

    public void setInitialDate(OffsetDateTime initialDate) {
        this.initialDate = initialDate;
    }

    public Agreement name(String name) {
        this.name = name;
        return this;
    }

    /**
     * A human-readable name for the agreement
     *
     * @return name
     **/
    @ApiModelProperty(required = true, value = "A human-readable name for the agreement")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Agreement statementOfIntent(String statementOfIntent) {
        this.statementOfIntent = statementOfIntent;
        return this;
    }

    /**
     * An overview and goals of the Agreement
     *
     * @return statementOfIntent
     **/
    @ApiModelProperty(value = "An overview and goals of the Agreement")
    public String getStatementOfIntent() {
        return statementOfIntent;
    }

    public void setStatementOfIntent(String statementOfIntent) {
        this.statementOfIntent = statementOfIntent;
    }

    public Agreement status(String status) {
        this.status = status;
        return this;
    }

    /**
     * The current status of the agreement. Typical values are: in process, approved and rejected
     *
     * @return status
     **/
    @ApiModelProperty(value = "The current status of the agreement. Typical values are: in process, approved and rejected")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Agreement version(String version) {
        this.version = version;
        return this;
    }

    /**
     * A string identifying the version of the agreement
     *
     * @return version
     **/
    @ApiModelProperty(value = "A string identifying the version of the agreement")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Agreement agreementAuthorization(List<AgreementAuthorization> agreementAuthorization) {
        this.agreementAuthorization = agreementAuthorization;
        return this;
    }

    public Agreement addAgreementAuthorizationItem(AgreementAuthorization agreementAuthorizationItem) {
        if (this.agreementAuthorization == null) {
            this.agreementAuthorization = new ArrayList<AgreementAuthorization>();
        }
        this.agreementAuthorization.add(agreementAuthorizationItem);
        return this;
    }

    /**
     * Get agreementAuthorization
     *
     * @return agreementAuthorization
     **/
    @ApiModelProperty(value = "")
    public List<AgreementAuthorization> getAgreementAuthorization() {
        return agreementAuthorization;
    }

    public void setAgreementAuthorization(List<AgreementAuthorization> agreementAuthorization) {
        this.agreementAuthorization = agreementAuthorization;
    }

    public Agreement agreementItem(List<AgreementItem> agreementItem) {
        this.agreementItem = agreementItem;
        return this;
    }

    public Agreement addAgreementItemItem(AgreementItem agreementItemItem) {
        this.agreementItem.add(agreementItemItem);
        return this;
    }

    /**
     * Get agreementItem
     *
     * @return agreementItem
     **/
    @ApiModelProperty(required = true, value = "")
    public List<AgreementItem> getAgreementItem() {
        return agreementItem;
    }

    public void setAgreementItem(List<AgreementItem> agreementItem) {
        this.agreementItem = agreementItem;
    }

    public Agreement agreementPeriod(TimePeriod agreementPeriod) {
        this.agreementPeriod = agreementPeriod;
        return this;
    }

    /**
     * The time period during which the Agreement is in effect.
     *
     * @return agreementPeriod
     **/
    @ApiModelProperty(value = "The time period during which the Agreement is in effect.")
    public TimePeriod getAgreementPeriod() {
        return agreementPeriod;
    }

    public void setAgreementPeriod(TimePeriod agreementPeriod) {
        this.agreementPeriod = agreementPeriod;
    }

    public Agreement agreementSpecification(AgreementSpecificationRef agreementSpecification) {
        this.agreementSpecification = agreementSpecification;
        return this;
    }

    /**
     * Get agreementSpecification
     *
     * @return agreementSpecification
     **/
    @ApiModelProperty(value = "")
    public AgreementSpecificationRef getAgreementSpecification() {
        return agreementSpecification;
    }

    public void setAgreementSpecification(AgreementSpecificationRef agreementSpecification) {
        this.agreementSpecification = agreementSpecification;
    }

    public Agreement associatedAgreement(List<AgreementRef> associatedAgreement) {
        this.associatedAgreement = associatedAgreement;
        return this;
    }

    public Agreement addAssociatedAgreementItem(AgreementRef associatedAgreementItem) {
        if (this.associatedAgreement == null) {
            this.associatedAgreement = new ArrayList<AgreementRef>();
        }
        this.associatedAgreement.add(associatedAgreementItem);
        return this;
    }

    /**
     * Get associatedAgreement
     *
     * @return associatedAgreement
     **/
    @ApiModelProperty(value = "")
    public List<AgreementRef> getAssociatedAgreement() {
        return associatedAgreement;
    }

    public void setAssociatedAgreement(List<AgreementRef> associatedAgreement) {
        this.associatedAgreement = associatedAgreement;
    }

    public Agreement characteristic(List<Characteristic> characteristic) {
        this.characteristic = characteristic;
        return this;
    }

    public Agreement addCharacteristicItem(Characteristic characteristicItem) {
        if (this.characteristic == null) {
            this.characteristic = new ArrayList<Characteristic>();
        }
        this.characteristic.add(characteristicItem);
        return this;
    }

    /**
     * Get characteristic
     *
     * @return characteristic
     **/
    @ApiModelProperty(value = "")
    public List<Characteristic> getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(List<Characteristic> characteristic) {
        this.characteristic = characteristic;
    }

    public Agreement completionDate(TimePeriod completionDate) {
        this.completionDate = completionDate;
        return this;
    }

    /**
     * Date at which the agreement is completed
     *
     * @return completionDate
     **/
    @ApiModelProperty(value = "Date at which the agreement is completed")
    public TimePeriod getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(TimePeriod completionDate) {
        this.completionDate = completionDate;
    }

    public Agreement engagedParty(List<RelatedParty> engagedParty) {
        this.engagedParty = engagedParty;
        return this;
    }

    public Agreement addEngagedPartyItem(RelatedParty engagedPartyItem) {
        this.engagedParty.add(engagedPartyItem);
        return this;
    }

    /**
     * Get engagedParty
     *
     * @return engagedParty
     **/
    @ApiModelProperty(required = true, value = "")
    public List<RelatedParty> getEngagedParty() {
        return engagedParty;
    }

    public void setEngagedParty(List<RelatedParty> engagedParty) {
        this.engagedParty = engagedParty;
    }

    public Agreement baseType(String baseType) {
        this.baseType = baseType;
        return this;
    }

    /**
     * When sub-classing, this defines the super-class
     *
     * @return baseType
     **/
    @ApiModelProperty(value = "When sub-classing, this defines the super-class")
    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public Agreement schemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
        return this;
    }

    /**
     * A URI to a JSON-Schema file that defines additional attributes and relationships
     *
     * @return schemaLocation
     **/
    @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")
    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    public Agreement type(String type) {
        this.type = type;
        return this;
    }

    /**
     * When sub-classing, this defines the sub-class entity name
     *
     * @return type
     **/
    @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Agreement agreement = (Agreement) o;
        return Objects.equals(this.id, agreement.id) &&
                Objects.equals(this.href, agreement.href) &&
                Objects.equals(this.agreementType, agreement.agreementType) &&
                Objects.equals(this.description, agreement.description) &&
                Objects.equals(this.documentNumber, agreement.documentNumber) &&
                Objects.equals(this.initialDate, agreement.initialDate) &&
                Objects.equals(this.name, agreement.name) &&
                Objects.equals(this.statementOfIntent, agreement.statementOfIntent) &&
                Objects.equals(this.status, agreement.status) &&
                Objects.equals(this.version, agreement.version) &&
                Objects.equals(this.agreementAuthorization, agreement.agreementAuthorization) &&
                Objects.equals(this.agreementItem, agreement.agreementItem) &&
                Objects.equals(this.agreementPeriod, agreement.agreementPeriod) &&
                Objects.equals(this.agreementSpecification, agreement.agreementSpecification) &&
                Objects.equals(this.associatedAgreement, agreement.associatedAgreement) &&
                Objects.equals(this.characteristic, agreement.characteristic) &&
                Objects.equals(this.completionDate, agreement.completionDate) &&
                Objects.equals(this.engagedParty, agreement.engagedParty) &&
                Objects.equals(this.baseType, agreement.baseType) &&
                Objects.equals(this.schemaLocation, agreement.schemaLocation) &&
                Objects.equals(this.type, agreement.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, href, agreementType, description, documentNumber, initialDate, name, statementOfIntent, status, version, agreementAuthorization, agreementItem, agreementPeriod, agreementSpecification, associatedAgreement, characteristic, completionDate, engagedParty, baseType, schemaLocation, type);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Agreement {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    agreementType: ").append(toIndentedString(agreementType)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
        sb.append("    initialDate: ").append(toIndentedString(initialDate)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    statementOfIntent: ").append(toIndentedString(statementOfIntent)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    agreementAuthorization: ").append(toIndentedString(agreementAuthorization)).append("\n");
        sb.append("    agreementItem: ").append(toIndentedString(agreementItem)).append("\n");
        sb.append("    agreementPeriod: ").append(toIndentedString(agreementPeriod)).append("\n");
        sb.append("    agreementSpecification: ").append(toIndentedString(agreementSpecification)).append("\n");
        sb.append("    associatedAgreement: ").append(toIndentedString(associatedAgreement)).append("\n");
        sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
        sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
        sb.append("    engagedParty: ").append(toIndentedString(engagedParty)).append("\n");
        sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

}

