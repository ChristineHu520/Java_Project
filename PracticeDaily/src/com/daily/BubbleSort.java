package com.daily;

/**
 * @author ChristineHu
 * @date 2021-03-11 10:07
 */
public class BubbleSort {
    //冒泡排序：将数据进行两两比较，，时间复杂度是n的平方，空间复杂度是1
    public static void BubbleSort(int[] array){
        int m = array.length;
        int flag = 1;
        while (m>0 && flag==1){
            flag=0;
            for(int j = 1;j < m;j++){
                if(array[j] < array[j-1]){
                    flag=1;
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
            m--;
        }
    }

    public static void main(String[] args) {
        int [] array = new int[] {32,1,14,5,23,24,66,4};
        BubbleSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

}
