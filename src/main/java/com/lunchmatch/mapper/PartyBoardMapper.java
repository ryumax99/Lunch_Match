package com.lunchmatch.mapper;

import com.lunchmatch.domain.PartyBoardVO;
import com.lunchmatch.dto.PageRequestDTO;

import java.util.List;

public interface PartyBoardMapper {
    void insert(PartyBoardVO vo);
    List<PartyBoardVO> selectAll();
    PartyBoardVO selectOne(Long id);
    void delete(Long id);
    void update(PartyBoardVO vo);

    List<PartyBoardVO> selectList(PageRequestDTO pageRequestDTO);
    int getCountWithFilter(PageRequestDTO pageRequestDTO);
}
