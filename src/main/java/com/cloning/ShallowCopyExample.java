package com.cloning;
//if we changed cloneddata ..original data also modified
public class ShallowCopyExample implements Cloneable{
    int i;
    int [] arr;
    public ShallowCopyExample(int i, int[] arr) {
        this.i=i;
        this.arr=arr;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,1};
        ShallowCopyExample original = new ShallowCopyExample(2,arr);//2,[3,2,1]
        ShallowCopyExample clonedObject = original.clone();
        clonedObject.arr[0]=12;//[12,2,1]

        System.out.println("Original array first element: " + original.arr[0]); // Outputs 12
//output:
//Original array first element: 12
    }


    @Override
    public ShallowCopyExample clone() {
        try {
            return (ShallowCopyExample) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
