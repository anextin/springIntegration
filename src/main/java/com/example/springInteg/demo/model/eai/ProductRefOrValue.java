/*
 * FastDiscount
 * This is Swagger UI environment generated for the TMF Product Ordering Management specification
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.example.springInteg.demo.model.eai;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A product to be created defined by value or existing defined by reference. The polymorphic attributes @type, @schemaLocation &amp; @referredType are related to the product entity and not the RelatedProductRefOrValue class itself
 */
@ApiModel(description = "A product to be created defined by value or existing defined by reference. The polymorphic attributes @type, @schemaLocation & @referredType are related to the product entity and not the RelatedProductRefOrValue class itself")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-08T07:10:30.175Z")
public class ProductRefOrValue {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("isBundle")
  private Boolean isBundle = null;

  @JsonProperty("isCustomerVisible")
  private Boolean isCustomerVisible = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("orderDate")
  private String orderDate = null;

  @JsonProperty("productSerialNumber")
  private String productSerialNumber = null;

  @JsonProperty("startDate")
  private String startDate = null;

  @JsonProperty("terminationDate")
  private String terminationDate = null;

  @JsonProperty("agreement")
  private List<AgreementItemRef> agreement = null;

  @JsonProperty("billingAccount")
  private BillingAccountRef billingAccount = null;

  @JsonProperty("place")
  private List<RelatedPlaceRefOrValue> place = null;

  @JsonProperty("product")
  private List<ProductRefOrValue> product = null;

  @JsonProperty("productCharacteristic")
  private List<Characteristic> productCharacteristic = null;

  @JsonProperty("productOffering")
  private ProductOfferingRef productOffering = null;

  @JsonProperty("productOrderItem")
  private List<RelatedProductOrderItem> productOrderItem = null;

  @JsonProperty("productPrice")
  private List<ProductPrice> productPrice = null;

  @JsonProperty("productRelationship")
  private List<ProductRelationship> productRelationship = null;

  @JsonProperty("productSpecification")
  private ProductSpecificationRef productSpecification = null;

  @JsonProperty("productTerm")
  private List<ProductTerm> productTerm = null;

  @JsonProperty("realizingResource")
  private List<ResourceRef> realizingResource = null;

  @JsonProperty("realizingService")
  private List<ServiceRef> realizingService = null;

  @JsonProperty("relatedParty")
  private List<RelatedParty> relatedParty = null;

  @JsonProperty("status")
  private ProductStatusType status = null;

  @JsonProperty("@baseType")
  private String baseType = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@referredType")
  private String referredType = null;

  public ProductRefOrValue id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the product
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the product")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductRefOrValue href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Reference of the product
   * @return href
  **/
  @ApiModelProperty(value = "Reference of the product")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ProductRefOrValue description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Is the description of the product. It could be copied from the description of the Product Offering.
   * @return description
  **/
  @ApiModelProperty(value = "Is the description of the product. It could be copied from the description of the Product Offering.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ProductRefOrValue isBundle(Boolean isBundle) {
    this.isBundle = isBundle;
    return this;
  }

   /**
   * If true, the product is a ProductBundle which is an instantiation of a BundledProductOffering. If false, the product is a ProductComponent which is an instantiation of a SimpleProductOffering.
   * @return isBundle
  **/
  @ApiModelProperty(value = "If true, the product is a ProductBundle which is an instantiation of a BundledProductOffering. If false, the product is a ProductComponent which is an instantiation of a SimpleProductOffering.")
  public Boolean isIsBundle() {
    return isBundle;
  }

  public void setIsBundle(Boolean isBundle) {
    this.isBundle = isBundle;
  }

  public ProductRefOrValue isCustomerVisible(Boolean isCustomerVisible) {
    this.isCustomerVisible = isCustomerVisible;
    return this;
  }

   /**
   * If true, the product is visible by the customer.
   * @return isCustomerVisible
  **/
  @ApiModelProperty(value = "If true, the product is visible by the customer.")
  public Boolean isIsCustomerVisible() {
    return isCustomerVisible;
  }

  public void setIsCustomerVisible(Boolean isCustomerVisible) {
    this.isCustomerVisible = isCustomerVisible;
  }

  public ProductRefOrValue name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the product. It could be the same as the name of the product offering
   * @return name
  **/
  @ApiModelProperty(value = "Name of the product. It could be the same as the name of the product offering")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductRefOrValue orderDate(String orderDate) {
    this.orderDate = orderDate;
    return this;
  }

   /**
   * Is the date when the product was ordered
   * @return orderDate
  **/
  @ApiModelProperty(value = "Is the date when the product was ordered")
  public String getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(String orderDate) {
    this.orderDate = orderDate;
  }

  public ProductRefOrValue productSerialNumber(String productSerialNumber) {
    this.productSerialNumber = productSerialNumber;
    return this;
  }

   /**
   * Is the serial number for the product. This is typically applicable to tangible products e.g. Broadband Router.
   * @return productSerialNumber
  **/
  @ApiModelProperty(value = "Is the serial number for the product. This is typically applicable to tangible products e.g. Broadband Router.")
  public String getProductSerialNumber() {
    return productSerialNumber;
  }

  public void setProductSerialNumber(String productSerialNumber) {
    this.productSerialNumber = productSerialNumber;
  }

  public ProductRefOrValue startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Is the date from which the product starts
   * @return startDate
  **/
  @ApiModelProperty(value = "Is the date from which the product starts")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public ProductRefOrValue terminationDate(String terminationDate) {
    this.terminationDate = terminationDate;
    return this;
  }

   /**
   * Is the date when the product was terminated
   * @return terminationDate
  **/
  @ApiModelProperty(value = "Is the date when the product was terminated")
  public String getTerminationDate() {
    return terminationDate;
  }

  public void setTerminationDate(String terminationDate) {
    this.terminationDate = terminationDate;
  }

  public ProductRefOrValue agreement(List<AgreementItemRef> agreement) {
    this.agreement = agreement;
    return this;
  }

  public ProductRefOrValue addAgreementItem(AgreementItemRef agreementItem) {
    if (this.agreement == null) {
      this.agreement = new ArrayList<AgreementItemRef>();
    }
    this.agreement.add(agreementItem);
    return this;
  }

   /**
   * Get agreement
   * @return agreement
  **/
  @ApiModelProperty(value = "")
  public List<AgreementItemRef> getAgreement() {
    return agreement;
  }

  public void setAgreement(List<AgreementItemRef> agreement) {
    this.agreement = agreement;
  }

  public ProductRefOrValue billingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

   /**
   * Get billingAccount
   * @return billingAccount
  **/
  @ApiModelProperty(value = "")
  public BillingAccountRef getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
  }

  public ProductRefOrValue place(List<RelatedPlaceRefOrValue> place) {
    this.place = place;
    return this;
  }

  public ProductRefOrValue addPlaceItem(RelatedPlaceRefOrValue placeItem) {
    if (this.place == null) {
      this.place = new ArrayList<RelatedPlaceRefOrValue>();
    }
    this.place.add(placeItem);
    return this;
  }

   /**
   * Get place
   * @return place
  **/
  @ApiModelProperty(value = "")
  public List<RelatedPlaceRefOrValue> getPlace() {
    return place;
  }

  public void setPlace(List<RelatedPlaceRefOrValue> place) {
    this.place = place;
  }

  public ProductRefOrValue product(List<ProductRefOrValue> product) {
    this.product = product;
    return this;
  }

  public ProductRefOrValue addProductItem(ProductRefOrValue productItem) {
    if (this.product == null) {
      this.product = new ArrayList<ProductRefOrValue>();
    }
    this.product.add(productItem);
    return this;
  }

   /**
   * Get product
   * @return product
  **/
  @ApiModelProperty(value = "")
  public List<ProductRefOrValue> getProduct() {
    return product;
  }

  public void setProduct(List<ProductRefOrValue> product) {
    this.product = product;
  }

  public ProductRefOrValue productCharacteristic(List<Characteristic> productCharacteristic) {
    this.productCharacteristic = productCharacteristic;
    return this;
  }

  public ProductRefOrValue addProductCharacteristicItem(Characteristic productCharacteristicItem) {
    if (this.productCharacteristic == null) {
      this.productCharacteristic = new ArrayList<Characteristic>();
    }
    this.productCharacteristic.add(productCharacteristicItem);
    return this;
  }

   /**
   * Get productCharacteristic
   * @return productCharacteristic
  **/
  @ApiModelProperty(value = "")
  public List<Characteristic> getProductCharacteristic() {
    return productCharacteristic;
  }

  public void setProductCharacteristic(List<Characteristic> productCharacteristic) {
    this.productCharacteristic = productCharacteristic;
  }

  public ProductRefOrValue productOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
    return this;
  }

   /**
   * Get productOffering
   * @return productOffering
  **/
  @ApiModelProperty(value = "")
  public ProductOfferingRef getProductOffering() {
    return productOffering;
  }

  public void setProductOffering(ProductOfferingRef productOffering) {
    this.productOffering = productOffering;
  }

  public ProductRefOrValue productOrderItem(List<RelatedProductOrderItem> productOrderItem) {
    this.productOrderItem = productOrderItem;
    return this;
  }

  public ProductRefOrValue addProductOrderItemItem(RelatedProductOrderItem productOrderItemItem) {
    if (this.productOrderItem == null) {
      this.productOrderItem = new ArrayList<RelatedProductOrderItem>();
    }
    this.productOrderItem.add(productOrderItemItem);
    return this;
  }

   /**
   * Get productOrderItem
   * @return productOrderItem
  **/
  @ApiModelProperty(value = "")
  public List<RelatedProductOrderItem> getProductOrderItem() {
    return productOrderItem;
  }

  public void setProductOrderItem(List<RelatedProductOrderItem> productOrderItem) {
    this.productOrderItem = productOrderItem;
  }

  public ProductRefOrValue productPrice(List<ProductPrice> productPrice) {
    this.productPrice = productPrice;
    return this;
  }

  public ProductRefOrValue addProductPriceItem(ProductPrice productPriceItem) {
    if (this.productPrice == null) {
      this.productPrice = new ArrayList<ProductPrice>();
    }
    this.productPrice.add(productPriceItem);
    return this;
  }

   /**
   * Get productPrice
   * @return productPrice
  **/
  @ApiModelProperty(value = "")
  public List<ProductPrice> getProductPrice() {
    return productPrice;
  }

  public void setProductPrice(List<ProductPrice> productPrice) {
    this.productPrice = productPrice;
  }

  public ProductRefOrValue productRelationship(List<ProductRelationship> productRelationship) {
    this.productRelationship = productRelationship;
    return this;
  }

  public ProductRefOrValue addProductRelationshipItem(ProductRelationship productRelationshipItem) {
    if (this.productRelationship == null) {
      this.productRelationship = new ArrayList<ProductRelationship>();
    }
    this.productRelationship.add(productRelationshipItem);
    return this;
  }

   /**
   * Get productRelationship
   * @return productRelationship
  **/
  @ApiModelProperty(value = "")
  public List<ProductRelationship> getProductRelationship() {
    return productRelationship;
  }

  public void setProductRelationship(List<ProductRelationship> productRelationship) {
    this.productRelationship = productRelationship;
  }

  public ProductRefOrValue productSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
    return this;
  }

   /**
   * Get productSpecification
   * @return productSpecification
  **/
  @ApiModelProperty(value = "")
  public ProductSpecificationRef getProductSpecification() {
    return productSpecification;
  }

  public void setProductSpecification(ProductSpecificationRef productSpecification) {
    this.productSpecification = productSpecification;
  }

  public ProductRefOrValue productTerm(List<ProductTerm> productTerm) {
    this.productTerm = productTerm;
    return this;
  }

  public ProductRefOrValue addProductTermItem(ProductTerm productTermItem) {
    if (this.productTerm == null) {
      this.productTerm = new ArrayList<ProductTerm>();
    }
    this.productTerm.add(productTermItem);
    return this;
  }

   /**
   * Get productTerm
   * @return productTerm
  **/
  @ApiModelProperty(value = "")
  public List<ProductTerm> getProductTerm() {
    return productTerm;
  }

  public void setProductTerm(List<ProductTerm> productTerm) {
    this.productTerm = productTerm;
  }

  public ProductRefOrValue realizingResource(List<ResourceRef> realizingResource) {
    this.realizingResource = realizingResource;
    return this;
  }

  public ProductRefOrValue addRealizingResourceItem(ResourceRef realizingResourceItem) {
    if (this.realizingResource == null) {
      this.realizingResource = new ArrayList<ResourceRef>();
    }
    this.realizingResource.add(realizingResourceItem);
    return this;
  }

   /**
   * Get realizingResource
   * @return realizingResource
  **/
  @ApiModelProperty(value = "")
  public List<ResourceRef> getRealizingResource() {
    return realizingResource;
  }

  public void setRealizingResource(List<ResourceRef> realizingResource) {
    this.realizingResource = realizingResource;
  }

  public ProductRefOrValue realizingService(List<ServiceRef> realizingService) {
    this.realizingService = realizingService;
    return this;
  }

  public ProductRefOrValue addRealizingServiceItem(ServiceRef realizingServiceItem) {
    if (this.realizingService == null) {
      this.realizingService = new ArrayList<ServiceRef>();
    }
    this.realizingService.add(realizingServiceItem);
    return this;
  }

   /**
   * Get realizingService
   * @return realizingService
  **/
  @ApiModelProperty(value = "")
  public List<ServiceRef> getRealizingService() {
    return realizingService;
  }

  public void setRealizingService(List<ServiceRef> realizingService) {
    this.realizingService = realizingService;
  }

  public ProductRefOrValue relatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
    return this;
  }

  public ProductRefOrValue addRelatedPartyItem(RelatedParty relatedPartyItem) {
    if (this.relatedParty == null) {
      this.relatedParty = new ArrayList<RelatedParty>();
    }
    this.relatedParty.add(relatedPartyItem);
    return this;
  }

   /**
   * Get relatedParty
   * @return relatedParty
  **/
  @ApiModelProperty(value = "")
  public List<RelatedParty> getRelatedParty() {
    return relatedParty;
  }

  public void setRelatedParty(List<RelatedParty> relatedParty) {
    this.relatedParty = relatedParty;
  }

  public ProductRefOrValue status(ProductStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Is the lifecycle status of the product.
   * @return status
  **/
  @ApiModelProperty(value = "Is the lifecycle status of the product.")
  public ProductStatusType getStatus() {
    return status;
  }

  public void setStatus(ProductStatusType status) {
    this.status = status;
  }

  public ProductRefOrValue baseType(String baseType) {
    this.baseType = baseType;
    return this;
  }

   /**
   * When sub-classing, this defines the super-class
   * @return baseType
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the super-class")
  public String getBaseType() {
    return baseType;
  }

  public void setBaseType(String baseType) {
    this.baseType = baseType;
  }

  public ProductRefOrValue schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

   /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "A URI to a JSON-Schema file that defines additional attributes and relationships")
  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public ProductRefOrValue type(String type) {
    this.type = type;
    return this;
  }

   /**
   * When sub-classing, this defines the sub-class entity name
   * @return type
  **/
  @ApiModelProperty(value = "When sub-classing, this defines the sub-class entity name")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProductRefOrValue referredType(String referredType) {
    this.referredType = referredType;
    return this;
  }

   /**
   * The actual type of the target instance when needed for disambiguation.
   * @return referredType
  **/
  @ApiModelProperty(value = "The actual type of the target instance when needed for disambiguation.")
  public String getReferredType() {
    return referredType;
  }

  public void setReferredType(String referredType) {
    this.referredType = referredType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductRefOrValue productRefOrValue = (ProductRefOrValue) o;
    return Objects.equals(this.id, productRefOrValue.id) &&
        Objects.equals(this.href, productRefOrValue.href) &&
        Objects.equals(this.description, productRefOrValue.description) &&
        Objects.equals(this.isBundle, productRefOrValue.isBundle) &&
        Objects.equals(this.isCustomerVisible, productRefOrValue.isCustomerVisible) &&
        Objects.equals(this.name, productRefOrValue.name) &&
        Objects.equals(this.orderDate, productRefOrValue.orderDate) &&
        Objects.equals(this.productSerialNumber, productRefOrValue.productSerialNumber) &&
        Objects.equals(this.startDate, productRefOrValue.startDate) &&
        Objects.equals(this.terminationDate, productRefOrValue.terminationDate) &&
        Objects.equals(this.agreement, productRefOrValue.agreement) &&
        Objects.equals(this.billingAccount, productRefOrValue.billingAccount) &&
        Objects.equals(this.place, productRefOrValue.place) &&
        Objects.equals(this.product, productRefOrValue.product) &&
        Objects.equals(this.productCharacteristic, productRefOrValue.productCharacteristic) &&
        Objects.equals(this.productOffering, productRefOrValue.productOffering) &&
        Objects.equals(this.productOrderItem, productRefOrValue.productOrderItem) &&
        Objects.equals(this.productPrice, productRefOrValue.productPrice) &&
        Objects.equals(this.productRelationship, productRefOrValue.productRelationship) &&
        Objects.equals(this.productSpecification, productRefOrValue.productSpecification) &&
        Objects.equals(this.productTerm, productRefOrValue.productTerm) &&
        Objects.equals(this.realizingResource, productRefOrValue.realizingResource) &&
        Objects.equals(this.realizingService, productRefOrValue.realizingService) &&
        Objects.equals(this.relatedParty, productRefOrValue.relatedParty) &&
        Objects.equals(this.status, productRefOrValue.status) &&
        Objects.equals(this.baseType, productRefOrValue.baseType) &&
        Objects.equals(this.schemaLocation, productRefOrValue.schemaLocation) &&
        Objects.equals(this.type, productRefOrValue.type) &&
        Objects.equals(this.referredType, productRefOrValue.referredType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, isBundle, isCustomerVisible, name, orderDate, productSerialNumber, startDate, terminationDate, agreement, billingAccount, place, product, productCharacteristic, productOffering, productOrderItem, productPrice, productRelationship, productSpecification, productTerm, realizingResource, realizingService, relatedParty, status, baseType, schemaLocation, type, referredType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductRefOrValue {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isBundle: ").append(toIndentedString(isBundle)).append("\n");
    sb.append("    isCustomerVisible: ").append(toIndentedString(isCustomerVisible)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
    sb.append("    productSerialNumber: ").append(toIndentedString(productSerialNumber)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    terminationDate: ").append(toIndentedString(terminationDate)).append("\n");
    sb.append("    agreement: ").append(toIndentedString(agreement)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productCharacteristic: ").append(toIndentedString(productCharacteristic)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    productOrderItem: ").append(toIndentedString(productOrderItem)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    productRelationship: ").append(toIndentedString(productRelationship)).append("\n");
    sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
    sb.append("    productTerm: ").append(toIndentedString(productTerm)).append("\n");
    sb.append("    realizingResource: ").append(toIndentedString(realizingResource)).append("\n");
    sb.append("    realizingService: ").append(toIndentedString(realizingService)).append("\n");
    sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    referredType: ").append(toIndentedString(referredType)).append("\n");
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

