class Studentmethod
  {
    int srollno;
    String sname;
    char grade;
    public void student()
    {
      System.out.println("the student roll no is "+srollno);
      System.out.println("the student name is "+sname);
      System.out.println("the student grade is "+grade);
    }
    public static void main(String args[])
    {
      Studentmethod s=new Studentmethod();
      Studentmethod s1=new Studentmethod();
      Studentmethod s2=new Studentmethod();
      s.srollno=103;
      s.sname="jayasri";
      s.grade='a';
      s1.srollno=107;
      s1.sname="priya";
      s1.grade='a';
      s2.srollno=73;
      s2.sname="prashanthi";
      s2.grade='a';
      s.student();
      s1.student();
      s2.student();
    }
  }