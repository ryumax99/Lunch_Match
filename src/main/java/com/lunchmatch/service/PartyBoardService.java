package com.lunchmatch.service;

import com.lunchmatch.domain.PartyBoardVO;
import com.lunchmatch.dto.PageRequestDTO;
import com.lunchmatch.dto.PageResponseDTO;

import java.util.List;

public interface PartyBoardService {
    void register(PartyBoardVO vo);
    List<PartyBoardVO> getList();
    PartyBoardVO get(Long id);
    void delete(Long id);
    void update(PartyBoardVO vo);
    PageResponseDTO<PartyBoardVO> getList(PageRequestDTO requestDTO);


}
