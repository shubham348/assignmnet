package aasignmen2;
import java.util.HashMap;
import java.util.Map;

public class a11keyvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> hm=new HashMap<Integer, String>();
		hm.put(1, "shubham");
		hm.put(2, "amit");
		hm.put(3, "abishek");
		hm.put(4,"aditya");
		hm.put(5,"rahul");
		System.out.println("size: "+hm.size());
		System.out.println("values in hashmap: "+hm.values());
		System.out.println("does hashmap has value'anmol': "+hm.containsKey("anmol"));
		hm.replace(3, "amit", "anmol");
		System.out.println("new values after replacement "+hm.values());

	}

}
