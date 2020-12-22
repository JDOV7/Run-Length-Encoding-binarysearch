package binarysearch;

public class RunLengthEncoding {

    public void RunLengthEncoding() {
        String s = "aaaabbbccdaa";
        s+=" ";
        StringBuffer sReturnValue = new StringBuffer();
        int iContCharacter = 0;
        char cValue = s.charAt(0);
        for (char c : s.toCharArray()) {
            if (c == cValue) {
                iContCharacter++;
            } else {
                sReturnValue.append(Integer.toString(iContCharacter));
                sReturnValue.append(cValue);
                iContCharacter = 1;
                cValue = c;
            }
        }
        System.out.println(sReturnValue.toString());
    }
}
