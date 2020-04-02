public class InsertionSort {
  public static void main(String[] args) {
    int val ;

    int j ;
    int arr[] = {30, 10, 50, 20, 40, 40};
    for(int i =1;i<arr.length;i++)
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
