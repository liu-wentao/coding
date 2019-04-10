package data_structure;

import java.util.Arrays;


public class MyArray {


    //声明数组
    private int[] arr;


    //初始化默认长度为0；
    public  MyArray(){
        this.arr = new int[0];
    }

    //获取数组的长度
    public int size(){
        return arr.length;
    }

    //显示当前数组元素
    public void show(){
        System.out.println(Arrays.toString(arr));
    }

    //默认在数组末尾添加一个元素,返回添加之后的数组
    public int[] add(int element){
        int[] newArr = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];

        }
        newArr[arr.length]=element;
        arr = newArr;
        return arr;
    }

    //删除给定索引数组元素，返回被删除元素
    public int remove(int index){
        if(index<0 || index>arr.length-1){

            throw  new RuntimeException("数组索引下标越界");
        }

        int result = arr[index];

        int[] newArr = new int[arr.length-1];
        for (int i = 0; i < newArr.length; i++) {
                if(i<index){
                    newArr[i] = arr[i];
                }else {
                    newArr[i] = arr[i+1];

                }
        }
        System.out.println(Arrays.toString(newArr));
        arr = newArr;
        return result;
    }

    //得到指定索引位置元素
    public int get(int index){
        return arr[index];
    }

    //插入一个元素到指定位置
    public int[] insert(int index){

    }
}
