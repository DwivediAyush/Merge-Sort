public class selectionsort {
     public static void selectionsort(int[] a)
     {
         for(int i=0;i<a.length;i++)
         {   int index=i;
             int min=a[i];
             for(int j=i;j<a.length;j++)
             {
                 if(min>a[j]) {
                     min = a[j];
                  index=j;
                 }
                 }
             int temp=a[i];
             a[i]=a[index];
             a[index]=temp;
         }
     }
     public static void main(String[] args)
     {
         int[] a={5,7,6,4,3,9,1,2};
         selectionsort.selectionsort(a);
         for(int i=0;i<a.length;i++)
         System.out.print(a[i]);
     }



}
