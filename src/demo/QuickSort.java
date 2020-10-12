package demo;

import java.util.Arrays;

public class QuickSort {
    public int partition(int [] nums,int start,int end){
        //5,3,6,2,1,7
        int num=nums[start];
        int left=start;
        int right=end;
        while(left<right){
            while (left<=end && nums[left]<=num) left++;
            while (right>=start && nums[right]>num) right--;
            if (left<right){
                swap(nums,left,right);
            }
        }
        swap(nums,start,right);
        return right;

    }
    public void sort(int[] nums,int start,int end){
        if (end-start<1){
            return;
        }
        int index=partition(nums,start,end);
        sort(nums,start,index-1);
        sort(nums,index+1,end);


    }

    public void swap(int[] nums,int i,int j){
        int tmp=nums[i];
        nums[i]=nums[j];
        nums[j]=tmp;
    }

    public static void main(String[] args) {
        int [] nums=new int[] {5,3,6,2,1,7};
        new QuickSort().sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}
