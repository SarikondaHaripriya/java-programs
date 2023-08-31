import java.util.*;
class HashMapEx
  {
    public static void main(String args[])
    {
      HashMap<String,String> map=new HashMap<String,String>();
      map.put("java","programming language");
      map.put("c","procedural language");
      map.put("ooad","design and analysis of uml diagrams");
      map.put("softwaretesting","testing the project");
      map.put("networks","studies on computer networks");
      for(Map.Entry m:map.entrySet())
        {
        System.out.println(m.getKey());
        System.out.println(m.getValue());
        System.out.println("=====================");
        }
      map.remove("networks");
      map.put("java","platform independent");
      System.out.println(map);
      System.out.println(map.containsKey("java"));
      System.out.println(map.containsValue("procedural language"));
       System.out.println(map.containsKey("networks"));
    }
  }