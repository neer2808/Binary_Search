import java.util.Scanner;
// searching : = Im a group of data to search a particular data is known as searching
// Two types of searching : -  Linear Search and Binary Search

// Binary search is the fast searching algorithm with time complexity O(log n)
// Based on divide and conquer strategy

// Three rules

// For Binary search  array must be sorted

// then
// find the mid point   (left + right)/2
// left = given array first element
// right = given array last element

// then
// we perform comparision
// condition 1   if arr[mid] == search_value
// condition 2   if arr[mid] < search_value
// condition 3   if arr[mid] > search_value


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
