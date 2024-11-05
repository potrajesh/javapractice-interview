package com.cloning;

public class DeepCopyExample implements Cloneable {
    int x;               // primitive field
    int[] arr;           // reference field (array)

    public DeepCopyExample(int x, int[] arr) {
        this.x = x;
        this.arr = arr;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCopyExample cloned = (DeepCopyExample) super.clone(); // Perform shallow copy
        
        // Deep copy the array
        cloned.arr = arr.clone(); // Creates a new array that is a copy of the original
        
        return cloned;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        int[] arr = {1, 2, 3};
        DeepCopyExample original = new DeepCopyExample(10, arr);
        DeepCopyExample deepCopy = (DeepCopyExample) original.clone(); // Perform deep cloning

        // Modify the array in the cloned object
        deepCopy.arr[0] = 99;

        // Check the original array - change is NOT reflected in the original
        System.out.println("Original array first element: " + original.arr[0]); // Outputs 1
        System.out.println("Deep copy array first element: " + deepCopy.arr[0]); // Outputs 99
    }
}
