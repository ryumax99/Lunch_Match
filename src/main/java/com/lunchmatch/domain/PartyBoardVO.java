package com.lunchmatch.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Data
public class PartyBoardVO {
    private Long id;
    private Long writerId;
    private String title;
    private String content;
    private String locationName;
    private Double latitude;
    private Double longitude;
    private String foodCategory;
    private String genderLimit;
    private String status; // OPEN / CLOSED
    private LocalDateTime createdAt;
    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm") // ← datetime-local input에 맞는 포맷
    private LocalDateTime partyTime;
}
