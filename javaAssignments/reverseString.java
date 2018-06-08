package javaAssignments;
/*William Orgertrice*/
    import java.util.*;

public class reverseString {

  public static void main(String[] args) {
  // Write your code here
  Scanner sc = new Scanner(System.in);
  	 String str = sc.nextLine(); 
     char[] A = str.toCharArray();
	   int offset=3;
     int len = A.length;
     offset %= len;
     reverse(A, 0, len - offset - 1);
     reverse(A, len - offset, len - 1);
     reverse(A, 0, len - 1);
     System.out.println(Arrays.toString(A));
 }

    private static void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

}
