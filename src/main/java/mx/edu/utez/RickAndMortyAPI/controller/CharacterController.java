package mx.edu.utez.RickAndMortyAPI.controller;

import lombok.RequiredArgsConstructor;
import mx.edu.utez.RickAndMortyAPI.dto.CharacterDTO;
import mx.edu.utez.RickAndMortyAPI.service.CharacterService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/character/")
@RequiredArgsConstructor
public class CharacterController {

    private final CharacterService characterService;
    @GetMapping("/{id}")
    public CharacterDTO getCharacterById(@PathVariable Integer id){
        return characterService.getCharacter(id);
    }
}
