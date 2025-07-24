package com.lunchmatch.mapper;

import com.lunchmatch.domain.CommentVO;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface CommentMapper {

    void insertComment(CommentVO comment);

    List<CommentVO> getCommentsByPartyId(Long partyId);

    void deleteByPartyId(Long partyId);  // ← 파티 ID로 댓글 전체 삭제
    void deleteById(Long id);  // ← 댓글 ID로 한 개만 삭제 (추가로 쓸 수 있음)
    // 댓글 수정
    void updateComment(CommentVO comment);
}


