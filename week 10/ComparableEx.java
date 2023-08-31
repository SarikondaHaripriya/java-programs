import java.util.ArrayList;
import java.util.Collections;
class Student implements Comparable<Student>
  {
    int id;
    String name;
    String address;
    Student(int id,String name,String address)
    {
      this.id=id;
      this.name=name;
      this.address=address;
    }
    /*public int compareTo(Student s)
    {
      if(address==s.address)
        return 0;
        //else if(id>s.id)
         // return 1;
      else
        return -1;
    }*/
    public int compareTo(Student s)
    {
      return this.name.compareTo(s.name);
    }
    public String toString()
    {
      return(id+" "+name+" "+address);
    }
  }
class ComparableEx
  {
    public static void main(String args[])
    {
      ArrayList<Student> al=new ArrayList<Student>();
      Student s=new Student(107,"priya","vijayawada");
      Student s1=new Student(103,"jayasri","kondapalli");
      Student s2=new Student(73,"prashanthi","gollapudi");
      al.add(s);
      al.add(s1);
      al.add(s2);
     al.add(new Student(90,"jeevani","hyd"));
      Collections.sort(al);
      for(Student std:al)
        {
          System.out.println(std);
        }
    }
  }