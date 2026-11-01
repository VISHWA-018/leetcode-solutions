class Solution {
    public int countPrimes(int n) {
    boolean []prime=new boolean[n];
    
    for(int i=2;i<n;i++){
        prime[i]=true;
    }
    for(int i=2;i*i<n;i++){
        if(prime[i]){
            for(int mul=i*i;mul<n;mul+=i){
                prime[mul]=false;
            }
        }
    }
    int count=0;
    for(int i=2;i<n;i++){
        if(prime[i]){
            count++;
        }
    }

        return count;
    }
}