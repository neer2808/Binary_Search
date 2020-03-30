import java.util.Scanner;

public class Searching_program {
  public static int BinarySearch(int search_data)
  {

    // you can also take the input from user to initialize the array
    int arr[] = {10,20,30,40,50,60,70};
    int left = 0;
    System.out.println("array length = " + arr.length);
    int right = arr.length-1;
    int mid;
    while(left<=right)
    {
      mid = (left + right)/2;
      System.out.println("mid value is = "+ mid);
      if(search_data == arr[mid]) {
        return mid;
      }
      else if(search_data <arr[mid]) {
        right = mid-1;
      }
      else {
        left = mid+1;
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter value which you want to search");
    int result = BinarySearch(s.nextInt());
    if(result == -1)
    {
      System.out.println("Elemment not found");
    }
    else {
      System.out.println("element found at index = " + result);
    }
  }
}
