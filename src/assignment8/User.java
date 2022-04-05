package assignment8;

import java.util.HashMap;
import java.util.Map;

public class User {
    Map<String, String> users;
    Map<String,String> cities;
    public User(){
        users = new HashMap<>();
        users.put("Sailesh" , "Mbnr");
        users.put("Ram", "Hyd");
        users.put("mahesh", "Gdwl");
        users.put("Goli", "Paris");
        users.put("Vinay", "Texas");

        cities = new HashMap<>();
        cities.put("509001", "Mbnr");
        cities.put("500001","Hyd");
        cities.put("123456","Gdwl");
        cities.put("345678","Paris");
        cities.put("456789", "Texas");

    }
    public String findUserByUserName(String userName) throws UserNotFoundException {
        if(users.containsKey(userName)){
            return  userName+" Found";
        }
        throw new UserNotFoundException("User not found");
    }
    public String findUserByCity(String city) throws CityNotFoundException {
        if(users.containsValue(city)){
            for(Map.Entry<String,String> entry : users.entrySet()){
                if(entry.getValue().equals(city)){
                    return  "User with city found";
                }
            }
        }
        throw new CityNotFoundException("City not found");
    }

    public String findCityByZipCode(String zipCode) throws ZipCodeNotFoundException {
        if(cities.containsKey(zipCode)) return cities.get(zipCode) +" Found";
        throw new ZipCodeNotFoundException("city with zipcode not found");
    }
}
