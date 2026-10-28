import java.util.*;

class Sliding_Window_Print{
    public static void print_elements_Window(int arr [] , int i , int j ){
        while(i <= j){
            System.out.print(arr[i] + " ");
            i++;
        }
        System.out.println();
    }
    public static void main(String args [] ){
        try(Scanner sc = new Scanner(System.in))
        {

            System.out.println("Enter the size and the elements of the array please : ");
            int sz = sc.nextInt();
            int arr [] = new int[sz];
            for(int i = 0;i < sz ;i++){
                arr[i] = sc.nextInt();
            }
            System.out.println("Also enter the size of the window please : ");
            int widow_sz = sc.nextInt();
            int i =0,j=0;
            while(j < arr.length){
                if(j-i+1 == widow_sz){
                    print_elements_Window(arr , i , j );
                    i++;   
                }
                j++;
            }
            
        }
    }
}