//In insertion sort we take the array and divide it into two parts  i.e sorted  or unsorted

// then we go to the unsorted array and take the first element from it and then we find the exact position  of the

// element in the sorted array and we place it in the sorted array

// after completing this step we  continue doing the same steps till unsorted array is not empty


//after completing all the above steps we will get the sorted array






public class InsertionSort {
  public static void main(String[] args) {
    int val ;

    int j ;
    int arr[] = {30, 10, 50, 20, 90, 40};
    for(int i =0;i<arr.length;i++)
    {
      val = arr[i];
      j = i-1;

        while(j>=0 && arr[j]>val)
        {
          arr[j+1]= arr[j];
          j = j-1;
        }
      arr[j+1] = val;

    }

    for(int i = 0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }
  }
}
