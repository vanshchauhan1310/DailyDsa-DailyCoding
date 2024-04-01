#include<iostream>
using namespace std;
int main(){
    pair<int,int>a = {1,3};
    cout<<a.second<<" "<<a.first<<endl;
    
    // nested pair property 
    pair<int,pair<int,int>>b = {4,{5,6}};
    cout<<b.first<<" "<<b.second.second<< " "<<b.second.first<<endl;

    // pairs in array
    // Indexing in array     0     1     2
    pair<int,int> arr[] = {{1,2},{3,4},{5,6}};
    cout<<arr[0].first<<" "<<arr[0].second<<" "<<arr[1].first<<" "<<arr[1].second<<endl;
}