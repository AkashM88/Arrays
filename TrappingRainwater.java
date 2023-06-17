//import java.util.*;
public class TrappingRainwater {
        public static int trappedwater(int height[]) {
          int leftMax[] = new int[height.length];
          leftMax[0] = height[0];
          for(int i = 1;i<height.length;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
          }
          int rightmax[] = new int[height.length];
          rightmax[height.length-1] = height[height.length-1];
          for(int i= height.length-2;i>=0;i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
          }
          int trapped_water = 0;

          
          for(int i =0;i<height.length;i++){
            int waterlevel = Math.min(leftMax[i],rightmax[i]);
            trapped_water += waterlevel-height[i];
          }
          return trapped_water;
        }
    public static void main(String[] args) {
      int height[] = {4,2,0,6,3,2,5};
      System.out.println(trappedwater(height));
    }
}
