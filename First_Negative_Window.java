import java.util.*;

class First_Negative_Window {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the Size of the Array please : ");
            int sz = sc.nextInt();
            System.out.println("Enter the elements of the Array as well : ");
            int arr[] = new int[sz];
            for (int i = 0; i < sz; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Also enter the size of the window please : ");
            int k = sc.nextInt();
            Queue<Integer> q = new LinkedList<>();
            int i = 0,j=0;
            List<Integer> list = new ArrayList<>();
            while(j < arr.length){
                if(arr[j] < 0){
                    q.add(arr[j]);
                }
                if(j-i+1 == k){
                    if(!q.isEmpty()){
                        list.add(q.peek());
                    }
                    else{
                        list.add(0);
                    }
                    if(arr[i] < 0){
                        q.poll();
                    }
                    i++;
                }
                j++;
            }
            for(int num : list){
                System.out.print(num + " ");
            }
        } 
    }
}