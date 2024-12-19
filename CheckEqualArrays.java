import java.util.Arrays;
public class CheckEqualArrays {
    public static void main(String args[])
    {
        int[] arr1={1,2,3,4,6};
        int[] arr2={1,3,2,6,4};
        boolean b=true;
        if(arr1.length!=arr2.length)
        {
            b=false;
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i]!=arr2[i])
            {
                b=false;
            }
        }
        
        System.out.println(b);

    }
}
