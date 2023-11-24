package mx.edu.utez.RickAndMortyAPI.service;

import lombok.RequiredArgsConstructor;
import mx.edu.utez.RickAndMortyAPI.dto.CharacterDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class CharacterService {

    @Value("${spring.external.service.base-url}")
    private String baseUrl;
    private final RestTemplate restTemplate;

    public CharacterDTO getCharacter(Integer id) {
        try {
            return restTemplate.getForObject("https://rickandmortyapi.com/api/character/" + id.toString(), CharacterDTO.class); // obetner al personaje con id 1 (Rick)
        } catch (Exception e) {
            System.out.println("oh shit!");
        }
        return null;

    }
}
