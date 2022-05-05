public class Insertion{

static void sort(int[] ar){
int length=ar.length
int elementoinsert=ar.[length-1];
for(int i=length-2;i>=0;i--)
{
if(ar[i]>elementoinsert){
ar[i+1]=ar[i];
printarray(ar);
  }
  else
    {
	ar[i+1]=elementoinsert;
	printarray(ar);
     break;
	 }
	 if((i==0)&& (ar[i]>elementoinsert)){
	 ar[i]=elementoinsert;
	 printarray(ar);
	 }
	 
	 }
	 
}	 
public static void main(String[] args)
{
Scanner in=new Scanner (System.in);
int s=in.nextInt();
int[] ar=new int[s];
for(int i=0;i<s;i++)
{
ar[i]=in.nextInt();
}
elementoinsert(ar);
in.close();
}
for(int n:ar)
{
System.out.print(n+ * *);
}
System.out.println("");
}
}