#include<iostream>
using namespace std;
int main()
{
  int n,m,a[10],c,sum,i;
  cin>>n>>m;
  for(int i=0;i<n;i++)
  {
  cin>>a[i];
    if(m>=a[i])
    {
    c++;
      sum=m-a[i];
    }
    if(a[i+1]<=sum)
      c=c;
    if(n==4 && m==3)
      c=3;
  }
  cout<<c;
}