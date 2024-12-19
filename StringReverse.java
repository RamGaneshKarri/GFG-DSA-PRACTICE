import java.io.*;

class StringReverse
{
    public static void main(String args[])
    {
        String s="Ram Ganesh";
        StringBuilder sb=new StringBuilder();
       sb.append(s);
       sb.reverse();
       System.out.println(sb);
       
    }
}