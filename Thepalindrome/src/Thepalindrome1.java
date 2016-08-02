/**
 * Created by victor on 2016. 7. 6..
 */
public class Thepalindrome1 {

    public int find(String s){
        return s.length() + findPdm(s);
    }

    public int findPdm(String s){       //findPdm
        int psi = 0;                    // psi -> palindrome Start Index
        int lIndex = s.length()-1;  // lIndex - lastIndex

        while( !checkPdm(psi, s.length()-1, s) && lIndex > psi){
            psi++;
        }

        return psi;
    }

    public boolean checkPdm(int lPsi, int rPsi, String s){     //pdm -> palindrome
        if(lPsi >= rPsi) return true;
        if( s.charAt(lPsi) == s.charAt(rPsi) ) return checkPdm(lPsi+1, rPsi-1, s);
        return false;
    }

    public static void main(){
        String s = "abab";
//        String s = "abacaba";
//        String s = "qwerty";
//        String s = "abdfhdyrbdbsdfghjkllkjhgfds";
//        String s = "aaafaaabab";

        Thepalindrome1 tpdm = new Thepalindrome1();
        int result = tpdm.findPdm(s);
        System.out.println(result);
    }
}
