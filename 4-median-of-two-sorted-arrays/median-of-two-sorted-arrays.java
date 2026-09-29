class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[]arr3=new int[nums1.length+nums2.length];
        for(int i=0;i<nums1.length;i++){
            arr3[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            arr3[nums1.length+j]=nums2[j];

        }
        Arrays.sort(arr3);
        int n=arr3.length;
        if(n%2==1){
            return arr3[n/2];
        }else{
            return (arr3[n/2-1]+arr3[n/2])/2.0;
        }
        
        
    }
}