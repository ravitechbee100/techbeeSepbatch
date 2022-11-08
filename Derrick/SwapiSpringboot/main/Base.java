import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Base {
    RestTemplate rest;
    PeopleDAO characters = new PeopleDAO();

    public Base(RestTemplateBuilder restTemplateBuilder){
        rest = restTemplateBuilder.build();
    }

    public String getPostsPlainJSON()
    {
        String url = "https://swapi.dev/api/";
        return rest.getForObject(url, String.class);
    }

    public void getTenPeople()
    {
        String base = "https://swapi.dev/api/people/";
        for(int i = 1; i <= 10; ++i)
        {
            People newPerson = rest.getForObject(base+i, People.class);

            characters.addPerson(newPerson);
        }
    }

    public void getAll()
    {
        String base = "https://swapi.dev/api/people/";

        for(int i = 1; i <= 83; ++i)
        {
            if(i == 17){}
            else {
                //System.out.println(i);
                People newPerson = rest.getForObject(base+i, People.class);
                characters.addPerson(newPerson);
            }

        }
    }

    public RestTemplate getRestTemplate(){return rest;}
}
