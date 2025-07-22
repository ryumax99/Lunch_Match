package com.lunchmatch.service;

import com.lunchmatch.domain.PartyBoardVO;
import com.lunchmatch.mapper.PartyBoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PartyBoardServiceImpl implements PartyBoardService {

    private final PartyBoardMapper mapper;

    @Autowired
    public PartyBoardServiceImpl(PartyBoardMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public void register(PartyBoardVO vo) {
        mapper.insert(vo);
    }
}
