import java.util.*;

class SplitCount {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the string");
    String str = sc.nextLine();
    int splitcount = 0;
    String s[] = str.split(" ");
    for (int i = 0; i < s.length; i++) {
      splitcount = splitcount + 1;
    }
    System.out.println("the split words count is" + splitcount);
  }
}