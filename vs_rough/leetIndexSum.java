class leetIndexSum {

    public static void main(String[] args) {
        leetIndexSum sl = new leetIndexSum();
        int[] arr = {2,7,11,15};
        for(int i: sl.twoSum(arr, 9)){
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i=0;i < nums.length-1; i++){
            int sum = nums[i];
            for(int j=i+1 ; j< nums.length; j++){
                sum+=nums[j];
                if(sum==target){
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
                sum-=nums[j];
            }
            sum=0;
        }
        
        return arr;
    }
}