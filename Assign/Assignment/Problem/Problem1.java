package com.Assignment.Problem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Problem1 {
public static void main(String[] args) {
	String str="[{id : 1, name : \"JAVA\"},{id:2,name : \"C\"},{id:5,name:\"C++\"},{id:3,name:\"JS\"},{id:4,name:\"Angular\"}]";
ObjectMapper objectMapper=new ObjectMapper();
objectMapper.configure(org.codehaus.jackson.JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
List<User> aList=new ArrayList<>();
try {
	User[]	userArr = objectMapper.readValue(str, User[].class);
	for(User user:userArr)
		aList.add(user);
} 
 catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
aList.sort(new Comparator<User>(){

	@Override
	public int compare(User user1, User user2) {
		
		return user1.getName().length()-user2.getName().length();
	}});
	
	System.out.println(aList);
	
	//For 2nd Problem
		 User u=new User();
		 for(int i=0;i<aList.size();i++) {
				//System.out.println(aList.get(i));
		 u.getSpecialExpression(aList.get(i).getName());
		 }
	}


}
