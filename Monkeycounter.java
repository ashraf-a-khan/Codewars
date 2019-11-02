public class MonkeyCounter
{
  public static int[] monkeyCount(final int n){
      int arr[] = new int[n];
      for(int i=1;i<=n;i++){
        arr[i-1] += i;
      }
      return arr;
  }
}
