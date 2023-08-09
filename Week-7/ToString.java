class ToString
  {
    int id;
    String name;
    String address;
    public String toString()
    {
      return id+" "+name+" "+address;
    }
    public static void main(String args[])
    {
      ToString s=new ToString();
      s.id=123;
      s.name="priya";
      s.address="vijayawada";
      System.out.println(s);
    }   
    
  }