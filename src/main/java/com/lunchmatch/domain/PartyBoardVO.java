package com.lunchmatch.domain;

import lombok.Data;
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
    private LocalDateTime partyTime;
    private String status; // OPEN / CLOSED
    private LocalDateTime createdAt;
}
