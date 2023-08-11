public class Greed{
  
    public static int greedy(int[] dice){
      int[] nums = new int[7];
      int res = 0;
      for (int i = 0; i < 5; i++) {
        nums[dice[i]] += 1;
      }
      
      if(nums[1] >= 3) res += 1000 + 100 * (nums[1] - 3);
      else res += 100 * nums[1];
      if(nums[2] >= 3) res += 200;
      if(nums[3] >= 3) res += 300;
      if(nums[4] >= 3) res += 400;
      if(nums[5] >= 3) res += 500 + 50 * (nums[5] - 3);
      else res += 50 * nums[5];
      if(nums[6] >= 3) res += 600;
      return res;
    }
  }