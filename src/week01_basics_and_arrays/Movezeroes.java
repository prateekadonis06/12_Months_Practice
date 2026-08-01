package week01_basics_and_arrays;

public class Movezeroes {
    public static void main(String[]args) {
        int []arr={32,0,54,4,0,0,65,239,0,3};

        int y =0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=0){
               arr[y]=arr[i];
               y++;
            }
        }
        while(y<arr.length){
            arr[y]=0;
            y++;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
