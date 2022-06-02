public class waterContainer {
    public static void main(String[] args) {
        waterContainer wc =new waterContainer();
        int area = wc.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println(area);
    }
//    public int maxArea(int[] height) {
//        int width=1, area=0,maxArea=0;
//        //1,8,6,2,5,4,8,3,7
//        for(int left=0; left<height.length; left++){
//            for(int right=left+1; right<height.length; right++){
//                area= Math.min(height[left], height[right]) * width;
//                if(area>maxArea){
//                    maxArea=area;
//                }
//                width++;
//            }
//            width=1;
//        }
//
//        return maxArea;
//    }

    //modified method
    public int maxArea(int[] height) {
        int width=height.length, area=0,maxArea=0;
        //1,8,6,2,5,4,8,3,7
        
    return
    }
}
