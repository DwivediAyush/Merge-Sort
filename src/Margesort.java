import java.util.Arrays;

public class Margesort {

    public static void mergesort(int[] a)
    {
        int l=a.length/2;
        int r=a.length-a.length/2;
        int[] left=new int[l];
        int[] right=new int[r];
        int i=0;
        if(a.length<2)
            return ;
        left= Arrays.copyOf(a,l);
        right=Arrays.copyOfRange(a,l,a.length);
       /* for(i=0;i<l;i++)
            System.out.print(left[i]);
        System.out.println();
        for(i=0;i<r;i++)
            System.out.print(right[i]);
*/
       Margesort.mergesort(left);
       Margesort.mergesort(right);
       merge(left,right,a);
    }
public static void merge(int[] left,int[] r,int[] a)
{
    int nl=left.length;
    int nr=r.length;
    int i=0,j=0,k=0;
    while(i<nl&&j<nr)
    {
        if(left[i]<=r[j])
        {
            a[k]=left[i];
            k++;
            i++;
        }
        else
        {
            a[k]=r[j];
            j++;
            k++;
        }

    }
    while(i<nl)
    {
        a[k]=left[i];
        i++;

        k++;

    }
    while(j<nr)
    {
        a[k]=r[j];
        j++;
        k++;

    }

}
    public static void main(String[] args) {
        int[] a={1,2,8,7,9,6,4,3,5};
        Margesort.mergesort(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
    }




}
