package demo;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.testng.annotations.Test;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import pojo.Country;


public class RestAPITesting {


	@Test
	public void verifyThatWeCanFindUnitedStatesOfAmericaUsingTheCodes(){

		Response res =
		when().get("http://services.groupkt.com/country/get/all").
		then().assertThat().statusCode(200).extract().response();
		
		JsonPath json = res.jsonPath();
		
		/*List<Country> country = json.getList("RestResponse.result",Country.class);
		
		//System.out.println(country);
		
		for(Country cntry:country)
		{
			//System.out.println(cntry.name);
			System.out.println("Country: " + cntry.getName());
			System.out.println("Country: " + cntry.getAlpha2_code());
			System.out.println("Country: " + cntry.getAlpha3_code());
			System.out.println("Country as String " + cntry.toString());
		}*/
		
		Country[] country = json.getObject("RestResponse.result",Country[].class);
		for(Country cntry:country)
		{
			System.out.println("Country as String " + cntry.getName());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//@Test
	public void verifyThatWeCanFindUnitedStatesOfAmericaUsingTheCodeUS(){

		when().get("http://services.groupkt.com/country/get/iso2code/US").
		then().assertThat().statusCode(200).
		and().body("RestResponse.result.name", equalTo("United States of America"));
	}

	//@Test
	public void verifyThatWeCanFindUnitedStatesOfAmericaUsingTheCodeINdia(){

		Response res = when().get("http://services.groupkt.com/country/get/iso2code/IN").
		then().extract().response();
		String rsStr = res.asString();
		JsonPath json = new JsonPath(rsStr);
		
		String str = json.get("RestResponse.result.name");
		System.out.println(str);
		//System.out.println(json.get("RestResponse.result.name"));
		
		
		HashMap<String,String> map = json.get("RestResponse.result");
		
		Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<String, String> mp = itr.next();
			System.out.print(mp.getKey()+" :  ");
			System.out.println(mp.getValue());
			
		}
		
		
		
		
		System.out.println(map);
		
	}
}
