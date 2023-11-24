package mx.edu.utez.RickAndMortyAPI.dto;

import lombok.Data;

@Data
public class CharacterDTO {

    private Integer id;	    // The id of the character.
    private String name;	// The name of the character.
    private String status;	// The status of the character ('Alive', 'Dead' or 'unknown').
    private String species;	// The species of the character.
    private String type;	// The type or subspecies of the character.
    private String gender;	// The gender of the character ('Female', 'Male', 'Genderless' or 'unknown').
    private String image;	// The string (url)	Link to the character's image. Images are 300 x 300px.
    private String url;	    // The string (url)	Link to the character's own URL endpoint.
    private String created;	// The string	Time at which the character was created in the database.

    //origin	object	Name and link to the character's origin location.
    //location	object	Name and link to the character's last known location endpoint.
    //episode	array (urls)	List of episodes in which this character appeared.

}
