class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList <Integer> arr1 = new ArrayList<>(); 
        ArrayList <Integer> arr2 = new ArrayList<>(); 

        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i = 2;i<nums.length;i++){
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)){
                arr1.add(nums[i]);
            }
            else{
                arr2.add(nums[i]);
            }
        }


        int k = 0;

        int [] arr = new int[nums.length];

        for(int x : arr1){
            arr[k++] = x;
        }

        for(int x : arr2){
            arr[k++] = x;
        }

        return arr;
    }
}