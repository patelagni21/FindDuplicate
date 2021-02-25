import java.util.*;

public class FindDuplicate
{

public static void main(String args[])
{
int i=0,j;
int arr[]=new int[args.length];
for(i=0;i<args.length;i++)
{
arr[i]=Integer.parseInt(args[i]);
}

boolean ans=false;

for(i=0;i<args.length;i++)
{
for(j=i+1;j<args.length;j++)
{
if(arr[i]==arr[j]){
ans=true;
break;
}
}
}
System.out.println(ans);
}
}