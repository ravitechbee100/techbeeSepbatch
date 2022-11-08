import org.junit.*;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;

public class SeleniumAspirationSpringbootApplicationTests {

	String baseUrl = "https://swapi.dev/api/";
	RestTemplateBuilder restBuild;
	RestTemplate rest;
	ArrayList<People> chars = new ArrayList<>();
	Base temp;

	@Before
	public void init()
	{
		restBuild = new RestTemplateBuilder();
		temp = new Base(restBuild);
		rest = temp.getRestTemplate();
	}

	@Test
	public void firstTen()
	{
		String correct = "'Luke Skywalker' 'C-3PO' 'R2-D2' 'Darth Vader' 'Leia Organa' 'Owen Lars' " +
				"'Beru Whitesun lars' 'R5-D4' 'Biggs Darklighter' 'Obi-Wan Kenobi'";

		Base temp = new Base(restBuild);
		temp.getTenPeople();
		Assert.assertEquals(correct, temp.characters.toString());
	}

	@Test
	public void successfulEndpoint()
	{
		ResponseEntity<People> response = rest.getForEntity(baseUrl+"people/", People.class, 1);
		if(response.getStatusCode().is2xxSuccessful()){
			Assert.assertTrue(true);
		}
		else{
			Assert.assertTrue(false);
		}
	}

	@Test
	public void heightOver200()
	{
		int count = 0;
		temp.getAll();
		for(People person : temp.characters.displayAll())
		{
			if(person.getHeight().equals("unknown")){}
			else if(Integer.parseInt(person.getHeight()) > 200)
			{
				//System.out.println(person.getName() + " OVER 200");
				++count;
			}
			//System.out.println(person.getName() + " " + person.getHeight());
		}

		Assert.assertEquals(10, count);
	}

	@Test
	public void countPeople()
	{
		ResponseEntity<String> test = rest.getForEntity(baseUrl+"people/", String.class, 1);
		String response = test.getBody();
		String stringInt = response.substring(response.indexOf(":")+1, response.indexOf(','));//Gets whatever the number is
		int count = Integer.parseInt(stringInt);

		if(count == 82){assert true;}
		else{assert false;}
	}

}
