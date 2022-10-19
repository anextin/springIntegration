
package com.example.springInteg.demo.model.eai;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * The notification data structure
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-03-19T08:51:48.657Z")
public class AgreementSpecificationCreateEvent {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("eventId")
  private String eventId = null;

  @JsonProperty("eventTime")
  private OffsetDateTime eventTime = null;

  @JsonProperty("eventType")
  private String eventType = null;

  @JsonProperty("correlationId")
  private String correlationId = null;

  @JsonProperty("domain")
  private String domain = null;

  @JsonProperty("title")
  private String title = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("priority")
  private String priority = null;

  @JsonProperty("timeOcurred")
  private OffsetDateTime timeOcurred = null;

  @JsonProperty("event")
  private AgreementSpecificationCreateEventPayload event = null;

  public AgreementSpecificationCreateEvent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of the resource involved in the event
   * @return id
  **/
  @ApiModelProperty(value = "Identifier of the resource involved in the event")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AgreementSpecificationCreateEvent href(String href) {
    this.href = href;
    return this;
  }

   /**
   * Reference of the resource involved in the event
   * @return href
  **/
  @ApiModelProperty(value = "Reference of the resource involved in the event")
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public AgreementSpecificationCreateEvent eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

   /**
   * The identifier of the notification.
   * @return eventId
  **/
  @ApiModelProperty(value = "The identifier of the notification.")
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public AgreementSpecificationCreateEvent eventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
    return this;
  }

   /**
   * Time of the event occurrence.
   * @return eventTime
  **/
  @ApiModelProperty(value = "Time of the event occurrence.")
  public OffsetDateTime getEventTime() {
    return eventTime;
  }

  public void setEventTime(OffsetDateTime eventTime) {
    this.eventTime = eventTime;
  }

  public AgreementSpecificationCreateEvent eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * The type of the notification.
   * @return eventType
  **/
  @ApiModelProperty(value = "The type of the notification.")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public AgreementSpecificationCreateEvent correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }

   /**
   * The correlation id for this event.
   * @return correlationId
  **/
  @ApiModelProperty(value = "The correlation id for this event.")
  public String getCorrelationId() {
    return correlationId;
  }

  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  public AgreementSpecificationCreateEvent domain(String domain) {
    this.domain = domain;
    return this;
  }

   /**
   * The domain of the event.
   * @return domain
  **/
  @ApiModelProperty(value = "The domain of the event.")
  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }

  public AgreementSpecificationCreateEvent title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the event.
   * @return title
  **/
  @ApiModelProperty(value = "The title of the event.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public AgreementSpecificationCreateEvent description(String description) {
    this.description = description;
    return this;
  }

   /**
   * An explanatory of the event.
   * @return description
  **/
  @ApiModelProperty(value = "An explanatory of the event.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AgreementSpecificationCreateEvent priority(String priority) {
    this.priority = priority;
    return this;
  }

   /**
   * A priority.
   * @return priority
  **/
  @ApiModelProperty(value = "A priority.")
  public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }

  public AgreementSpecificationCreateEvent timeOcurred(OffsetDateTime timeOcurred) {
    this.timeOcurred = timeOcurred;
    return this;
  }

   /**
   * The time the event occured.
   * @return timeOcurred
  **/
  @ApiModelProperty(value = "The time the event occured.")
  public OffsetDateTime getTimeOcurred() {
    return timeOcurred;
  }

  public void setTimeOcurred(OffsetDateTime timeOcurred) {
    this.timeOcurred = timeOcurred;
  }

  public AgreementSpecificationCreateEvent event(AgreementSpecificationCreateEventPayload event) {
    this.event = event;
    return this;
  }

   /**
   * The event payload linked to the involved resource object
   * @return event
  **/
  @ApiModelProperty(value = "The event payload linked to the involved resource object")
  public AgreementSpecificationCreateEventPayload getEvent() {
    return event;
  }

  public void setEvent(AgreementSpecificationCreateEventPayload event) {
    this.event = event;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgreementSpecificationCreateEvent agreementSpecificationCreateEvent = (AgreementSpecificationCreateEvent) o;
    return Objects.equals(this.id, agreementSpecificationCreateEvent.id) &&
        Objects.equals(this.href, agreementSpecificationCreateEvent.href) &&
        Objects.equals(this.eventId, agreementSpecificationCreateEvent.eventId) &&
        Objects.equals(this.eventTime, agreementSpecificationCreateEvent.eventTime) &&
        Objects.equals(this.eventType, agreementSpecificationCreateEvent.eventType) &&
        Objects.equals(this.correlationId, agreementSpecificationCreateEvent.correlationId) &&
        Objects.equals(this.domain, agreementSpecificationCreateEvent.domain) &&
        Objects.equals(this.title, agreementSpecificationCreateEvent.title) &&
        Objects.equals(this.description, agreementSpecificationCreateEvent.description) &&
        Objects.equals(this.priority, agreementSpecificationCreateEvent.priority) &&
        Objects.equals(this.timeOcurred, agreementSpecificationCreateEvent.timeOcurred) &&
        Objects.equals(this.event, agreementSpecificationCreateEvent.event);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, eventId, eventTime, eventType, correlationId, domain, title, description, priority, timeOcurred, event);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgreementSpecificationCreateEvent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    timeOcurred: ").append(toIndentedString(timeOcurred)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
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

