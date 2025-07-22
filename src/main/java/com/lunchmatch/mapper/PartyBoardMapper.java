package com.lunchmatch.mapper;

import com.lunchmatch.domain.PartyBoardVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PartyBoardMapper {
    void insert(PartyBoardVO vo);
}
