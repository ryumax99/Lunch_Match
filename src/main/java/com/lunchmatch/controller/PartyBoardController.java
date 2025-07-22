package com.lunchmatch.controller;

import com.lunchmatch.domain.PartyBoardVO;
import com.lunchmatch.service.PartyBoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/party")
public class PartyBoardController {

    private final PartyBoardService partyBoardService;

    @Autowired
    public PartyBoardController(PartyBoardService partyBoardService) {
        this.partyBoardService = partyBoardService;
    }

    @GetMapping("/write")
    public String writeForm() {
        return "party_write";
    }

    @PostMapping("/write")
    public String writeSubmit(PartyBoardVO vo) {
        vo.setWriterId(1L); // 나중에 로그인 세션에서 꺼낼 것
        partyBoardService.register(vo);
        return "redirect:/party/list";
    }

}

