#include<iostream>
using namespace std;
int main()
{
  int n,s,a[10],sum;
  cin>>n>>s;
  for(int i=0;i<n;i++)
  {
    cin>>a[i];
    sum=sum+a[i];
  }
  if(sum<=s)
    cout<<"YES";
  else
    cout<<"NO";
}