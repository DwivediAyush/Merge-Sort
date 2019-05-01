public class QUICKSORT {

    public static void quicksort(int[] a,int start,int end)
    {
        if(start<end) {

            int pindex = part(a, start, end);
            quicksort(a, start, pindex - 1);
            quicksort(a, pindex + 1, end);
        }
        return;
    }
    public static int part(int[] a,int start,int end)
    {
        int pivot=a[end];
       int pindex=start;
  for(int i=0;i<end;i++)
      if (a[i] <= pivot) {
          int temp;
          temp = a[pindex];
          a[pindex] = a[i];
          a[i] = temp;
          pindex++;
      }
        int temp;
        temp=a[pindex];
        a[pindex]=a[end];
a[end]=temp;
        return pindex;
    }

    public static void main(String[] args) {
        int a[]={2,4,5,1,7,3,6};
        quicksort(a,0,a.length-1);
        for(int i =0;i<a.length;i++)
            System.out.print(a[i]);
    }


}
