package com.lunchmatch.service;

import com.lunchmatch.domain.PartyBoardVO;
import com.lunchmatch.dto.PageRequestDTO;
import com.lunchmatch.dto.PageResponseDTO;
import com.lunchmatch.mapper.PartyBoardMapper;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PartyBoardServiceImpl implements PartyBoardService {

    private final PartyBoardMapper mapper;

    @Override
    public void register(PartyBoardVO vo) {
        mapper.insert(vo);
    }

    @Override
    public List<PartyBoardVO> getList() {
        return mapper.selectAll();
    }

    @Override
    public PartyBoardVO get(Long id) {
        return mapper.selectOne(id);
    }

    @Override
    public void delete(Long id) {
        mapper.delete(id);
    }

    @Override
    public void update(PartyBoardVO vo) {
        mapper.update(vo);
    }

    @Override
    public PageResponseDTO<PartyBoardVO> getList(PageRequestDTO requestDTO) {
        List<PartyBoardVO> list = mapper.selectList(requestDTO);
        int total = mapper.getCountWithFilter(requestDTO);
        int totalPage = (int) Math.ceil((double) total / requestDTO.getSize());

        return PageResponseDTO.<PartyBoardVO>builder()
                .dtoList(list)
                .total(total)
                .page(requestDTO.getPage())
                .size(requestDTO.getSize())
                .totalPage(totalPage)
                .build();
    }







}
