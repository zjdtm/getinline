package com.project.getinline.domain;

import com.project.getinline.constant.EventStatus;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Event {

    private Long id;

    private Long placeId;
    private String eventName;
    private EventStatus eventStatus;
    private LocalDateTime eventStartDateTime;
    private LocalDateTime eventEndDateTime;
    private Integer currentNumberOfPeople;
    private Integer capacity;
    private String name;

    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

}
