class backtrack
{
public static void main(String args[])
{
int a[]={1,2,3,4,5};
int n=5,t;
perm p=new perm();
p.allperm(a,5,5);
}
}
class perm
{
void allperm(int a[],int n,int l)
{
int t,j;
if(n==1)
{
for(int i=0;i<l;i++)
System.out.print(a[i]);
System.out.println(" ");
}
else
{
allperm(a,n-1,l);
for(int i=0; i<n-1;i++)
{

t=a[i];
a[i]=a[n-1];
a[n-1]=t;
allperm(a,n-1,l);
t=a[i];
a[i]=a[n-1];
a[n-1]=t;

}
}
}
}



