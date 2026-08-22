class Solution {
    public boolean checkDivisibility(int n) {
        int x = n;
        int digitSum = 0;
        int digitProduct = 1;
        while(x!=0){
            digitSum += x%10;
            digitProduct *= x%10;
            x = x/10;
        }


        return (n%(digitProduct+digitSum)==0);

    }
}