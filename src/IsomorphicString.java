package src;

import java.util.HashMap;

public class IsomorphicString {

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> hashMap=new HashMap<>();

        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){

          if(!hashMap.containsKey(s.charAt(i)) && !(hashMap.containsValue(t.charAt(i)))){
              hashMap.put(s.charAt(i),t.charAt(i));
            }
        }

        for(int i=0;i<t.length();i++){

            if(hashMap.get(s.charAt(i)) ==null ||t.charAt(i)!=hashMap.get(s.charAt(i))  ){
                return false;
            }

        }
        return true;

    }
}


class IsomorphicStringStarter {
    public static void main(String[] args) {
        IsomorphicString isomorphicString=new IsomorphicString();
        isomorphicString.isIsomorphic("egg","add");

    }
}