package string;

public class PalindromeStr125 {
	
	public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(vaildChar(ch)){
                sb.append(ch);
            }
        }

        return check(sb.toString());

    }

    private static boolean vaildChar(char ch){
        return (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
    }

    private static boolean check(String str){
        int l = 0;
        int r = str.length()-1;
        while(l < r){
            if(str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
	

}
