package map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {
	
	//Implement a method which can add data into a Map
	public void addElementByMap(String data){
		Map<String,Integer> map = new HashMap();
		map.put("a", 1);
		//map.put("Aa", 2);
		//map.put("Cc", 3);
		//map.put("Dd", 4);
		System.out.println();
		
	}
	
	/*Implement a method that can retrieve data from a Map and it will return data containing in a Map
	 * Use while loop to iterate through
	 */
	
	public Map<String, String> getDataByMap(Map<String,String> map){
		Map<String, String> mapData = new HashMap<String,String>();

           mapData.put("BMW","Red"); 
           mapData.put("Mercedes"," Red"); 

           mapData.put("Audi","Silver"); 
        mapData.put("Ford","Black"); 

         for(String key: mapData.keySet()) 
       System.out.println(key + " - " + mapData.get(key)); 
       System.out.println(); 
       String searchKey = "Audi"; 
      if(mapData.containsKey(searchKey)) 

     System.out.println("Found total " + mapData.get(searchKey) + " "  + searchKey + " cars!\n"); 

                   return mapData;
	}
	
	/*Implement a method that can retrieve data from a Map contains List and it will return data containing in a Map
	 * Use for loop to iterate through
	 */
		
		public Map<String, List<String>> getDataByMapList(Map<String,List<String>> list){
			Map<String, List<String>> listData = new HashMap<String,List<String>>();
			
			return listData;
		}

}
