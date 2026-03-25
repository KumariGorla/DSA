public class Permutation {
    public static void PrintPermutations(String s,String perm, int idx){
        if(s.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i = 0;i<s.length();i++){
            char currChar = s.charAt(i);
            String newString = s.substring(0,i)+s.substring(i+1);
            //perm = perm + currChar;
            PrintPermutations(newString, perm+currChar, idx+1);
        }
    }public static void main(String[] args) {
        String s = "ABC";
        PrintPermutations(s,"", 0);
    }
}

//Time complexity O(n*n!)