package fr.unilorraine.idmc.gamescatalog.controllers;

import fr.unilorraine.idmc.gamescatalog.entities.Game;
import fr.unilorraine.idmc.gamescatalog.services.GamesService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("games")
@RequiredArgsConstructor
public class GamesController {

    private final GamesService gamesService;

    @GetMapping
    public Iterable<Game> findAll(){
        return gamesService.findAll();
    }

    @PostMapping
    public Game create(@RequestBody Game gg){
        return gamesService.create(gg);
    }

}
