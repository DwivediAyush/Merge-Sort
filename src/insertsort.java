public class insertsort {
    public static int[] InsertSort(int[] a)
    {
            for(int i=1;i<a.length;i++)
            {
                int value=a[i];
                int place=i;
                while(place>0  &&  a[place-1]>value)
                {
                    a[place]=a[place-1];
                    place--;
                }
                a[place]=value;
            }
return a;
    }

    public static void main(String[] args) {
        int[] a={100,50,89,25,5,54,62,156};
        a=insertsort.InsertSort(a);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
