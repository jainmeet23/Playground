#include<iostream>
using namespace std;
int main()
{
 int n,a[10],b=1;
  cin>>n;
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<1<<endl;
  for(int i=0;i<n-1;i++)
  {
  if(a[i]>a[i+1])
    cout<<1<<endl;
    else
    {
    cout<<2*b<<endl;
      b++;
    }
  }
}