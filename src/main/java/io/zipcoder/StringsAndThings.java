package io.zipcoder;

/**
 * @author tariq
 */
public class StringsAndThings {


    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case-sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     * countYZ("day fez"); // Should return 2
     * countYZ("day fyyyz"); // Should return 2
     */
    public String countYZ(String input) {

        int len = input.length();
        int countYZ = 0;
        input = (input + "").toLowerCase();

        for (int i = 0; i < len; i++) {

            if (input.charAt(i) == 'y' || input.charAt(i) == 'z') {
                //&& !Character.isLetter(input.charAt(i+1))) countYZ++;
                if (i < len - 1 && !Character.isLetter(input.charAt(i + 1))) countYZ++;
                else if (i == len - 1) countYZ++;
            }
        }
        return String.valueOf(countYZ);


    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case-sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     * <p>
     * example : removeString("Hello there", "llo") // Should return "He there"
     * removeString("Hello there", "e") //  Should return "Hllo thr"
     * removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String String base;
        base, String remove) {

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < base.length() - remove.length(); i++) {
            if (!(base.substring(i, i + remove.length()).equalsIgnoreCase(remove))) {
                result.append(base.charAt(i));
            } else {
                i = i + remove.length();
            }
        }
        return result.toString();
    }


    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case-sensitive)
     * <p>
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     * containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     * containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */

    public Boolean containsEqualNumberOfIsAndNot(String input) {

        String inputNotMissing = input.replaceAll("not", "");
        String inputIsMissing = input.replaceAll("is", "");
        int notCount = (input.length() - inputNotMissing.length()) / 3;
        int isCount = (input.length()) - inputIsMissing.length() / 2;

        return isCount == notCount;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     * gHappy("xxgxx") // Should return  false
     * gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input) {
        int inputLength = input.length();
        if(inputLength == 1 && input.charAt(0) == 'g') {
            return false;
        }
        if(inputLength > 1 && input.charAt(inputLength-1) == 'g' && input.charAt(inputLength-2) != 'g') {
            return false;
        }
        for(int i=1; i<inputLength-1; i++) {
            if(input.charAt(i) == 'g' && input.charAt(i + 1) != 'g' && input.charAt(i - 1) != 'g') {
            return false;
            }
        }
        return true;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     * countTriple("xxxabyyyycd") // Should return 3
     * countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        int len =  input.length();
        int count = 0;
    for (int i = 0; i < len-2; i++) {
        char tmp = input.charAt(i);
        if (tmp == input.charAt (i+1) && tmp == input.charAt(i+2))
            count++;
    }
    return count;
    }

    }
