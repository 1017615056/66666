public class 22222 { public int[] twoSum(int[] nums, int target) {
    int[] result=new int[2];
    for(int a=0;a<nums.length;a++){

        for(int next=a+1;next<nums.length;next++){
            if((nums[a] + nums[next]) == target) {
                result[0] = a;
                result[1] = next;
                break;
            }
        }
    }
    return result;
}
}
