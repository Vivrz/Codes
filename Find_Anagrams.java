    import java.util.*;

    class Find_Anagrams {
        public static String BuildString(int i , int j , String txt){
            StringBuilder str = new StringBuilder();
            while(i <= j){
                str.append(txt.charAt(i));
                i++;
            }
            return str.toString();
        }
        public static boolean AllZeroCheck(int arr [] ){
            for( int num : arr){
                if(num != 0){
                    return false;
                }
            }
            return true;
        }
        public static List<String> Find_Ana(String pat, String txt) {
            List<String> list = new ArrayList<>();

            int arr [] = new int[26];
            for(int i = 0;i < pat.length() ;i++){
                arr[pat.charAt(i)-'a']++;
            }

            int i =0,j=0;
            int k = pat.length();
            while(j < txt.length()){
                arr[txt.charAt(j)-'a']--;

                if(j-i+1 == k){
                    if(AllZeroCheck(arr)){
                        list.add(BuildString(i , j , txt));
                    }
                    arr[txt.charAt(i)-'a']++;
                    i++;
                }
                j++;
            }
            return list;
        }

        public static void main(String args[]) {
            try (Scanner sc = new Scanner(System.in)) {
                String pat = sc.nextLine();
                String txt = sc.nextLine();
                System.out.println("Anagrams of Pat is given below : " + Find_Ana(pat , txt) + " And the count of all the Anagrams found is : " + Find_Ana(pat ,txt).size());
            }

        }
    }