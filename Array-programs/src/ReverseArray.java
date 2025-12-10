public class ReverseArray {

    static void rev(String[] a){

        int left = 0, right = a.length-1;
        for(String g:a){
            System.out.print(g+" ");
        }
        while(left<right){
            String temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        for(String g:a){
            System.out.print(g+" ");
        }
    }

    public static void main(String[] args){

        int[] arr1 = {2,4,8,6,1,9};
        String[] arr2 = {"Ram", "Shyam", "Abhishek"};
        Object[] arr3 = {true, "Shantanu", 89, false};

        System.out.println("Hello "+ arr3[1]);
        rev(arr2);
    }
}
