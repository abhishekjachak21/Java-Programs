public class ReverseArray {

    static void rev(Object[] a){

//        System.out.println(a);
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args){
        int[] arr1 = {2,4,8,6,1,9};
        String[] arr2 = {"Ram", "Shyam", "Abhishek"};
        Object[] arr3 = {true, "ram", 89, false};

        System.out.println("Hello!!");
        rev(arr3);
    }
}
