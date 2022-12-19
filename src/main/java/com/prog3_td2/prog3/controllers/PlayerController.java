package com.prog3_td2.prog3.controllers;

import com.prog3_td2.prog3.Mapper.PlayerMapper;
import com.prog3_td2.prog3.controllers.response.PlayerResponse;
import com.prog3_td2.prog3.model.PlayerEntity;
import com.prog3_td2.prog3.service.PlayerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController {
    private final PlayerService service;

    @GetMapping("/allPlayer")
    public List<PlayerResponse> getAllPlayer(){
        return service.playerEntityList().stream().map(PlayerMapper::toRest).toList();
    }
}
