package com.lunchmatch.domain;

import lombok.Data;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString
public class CommentVO {
    private Long id;
    private Long partyId;
    private String writerId;
    private String content;
    private String gender;
    private LocalDateTime createdAt;
}
