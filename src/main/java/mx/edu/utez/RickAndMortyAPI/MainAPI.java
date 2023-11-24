package mx.edu.utez.RickAndMortyAPI;

import lombok.*;
import mx.edu.utez.RickAndMortyAPI.dto.CharacterDTO;
import mx.edu.utez.RickAndMortyAPI.service.CharacterService;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class MainAPI {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        CharacterService characterService = new CharacterService(restTemplate);
        System.out.println(toJson(characterService.getCharacter(827)));
    }

    public static String toJson(CharacterDTO characterDTO) {
        try {
            ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
            return ow.writeValueAsString(characterDTO);
        } catch (Exception e) {
            System.out.println("oh shit! a rat!");
        }
        return null;
    }

}
