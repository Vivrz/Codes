import java.util.*;

class Count_Occurences{
    public static boolean  AllZeroCount(int arr []){
        for(int num : arr){
            if(num > 0){
                return false;
            }
        }
        return true;
    }
    // Let create a separate functions here for calculating the occurrences of the anagrams here : 
    public static int Count_Occ(String pat , String txt){
        // Let first of all calculate the frequencies of each character here : 
        int arr [] = new int[26];
        for(int i = 0;i < pat.length() ;i++)
        {
            arr[pat.charAt(i)-'a']++;
        }
        
        // Here we are going to use the sliding window approach here : 
        int k = pat.length();
        int i = 0,j=0;
        int result =0;
        while(j < txt.length()){
            arr[txt.charAt(j)-'a']--;

            if(j-i+1 == k){
                if(AllZeroCount(arr)){
                    result++;
                }
                arr[txt.charAt(i)-'a']++;
                i++;
            }
            j++;
        }
        return result;
    }
    public static void main(String args [] ){
        //  OKay so here lets solve the Count occurences problem here : 
        //  So basically there are two strings here one is : pat and the another string is txt 
        // so here we need to find the occurrences of the pat anagrams in string txt which is given in the problem here 
        try(Scanner sc = new Scanner(System.in);)
        {

            System.out.println("Please Enter both the Strings Pleas : ");
            String pat = sc.nextLine();
            String txt = sc.nextLine();
            System.out.println("Number of Occurrences here are : " + Count_Occ(pat , txt) );
        }
    }
}