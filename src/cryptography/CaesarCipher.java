package cryptography;

import java.util.Arrays;

/**
 * Caesar Cipher is also known as shift cipher. It is one of the simplest and most widely known
 * encryption techniques. It is a substitution cipher in which each letter in the inputText is
 * replaced by a letter some fixed number of positions down the alphabet. The default shift value in
 * our class is 3. It is named after Julius Caesar who used it in his private correspondence.
 *
 * @author Athanasios Kontis
 */
public class CaesarCipher {

    protected static final int DEFAULT_SHIFT = 3;
    protected static final char[] latinCharset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    protected static final int TOTAL_ALPHABET_LETTERS = latinCharset.length;  // unique letters of latin alphabet (caseless)

    /** Encrypts current char according to set shift value
     * @param curChar the character to be encrypted
     * @param shift the number of positions in the charset array that this function will shift the curChar
     * @param rememberCase it opts to hold the case of current char which by default is lost in the encryption process
     * @return the encrypted (shifted) char in
     */
    public static char encryptChar (char curChar, int shift, boolean rememberCase) {
        boolean lower = (rememberCase ? (Character.isLowerCase(curChar)) : false);
        int charPosition = Arrays.binarySearch(latinCharset, Character.toUpperCase(curChar));
        if (charPosition < 0) return curChar;
        int newCharPosition = (charPosition + shift) % TOTAL_ALPHABET_LETTERS;
        assert (newCharPosition >= 0 && newCharPosition < TOTAL_ALPHABET_LETTERS) : "Char position is out of bounds";
        char shiftedChar = latinCharset[newCharPosition];
        return (lower ? Character.toLowerCase(shiftedChar) : shiftedChar );
    }

    /** Encrypts current string according to set shift value
     * @param s the string to be encrypted
     * @param shift the custom shift that will be used for this encryption
     * @param rememberCase makes the string encryption case sensitive storing the case of its constituent chars
     * @return the encrypted string
     */
    public static String encryptString (String s, int shift, boolean rememberCase) {
        StringBuilder sb = new StringBuilder(s.length());
        for (char c : s.toCharArray())
            sb.append(encryptChar(c, shift, rememberCase));
        return sb.toString();
    }
    public static String encryptString (String s, int shift) {
        return encryptString(s, shift, false);
    }
    public static String encryptString (String s) {
        return encryptString(s, DEFAULT_SHIFT, false);
    }

    public static void main (String args[])
    {
        String unencrypted = ".!The quick brown fox jumped over the dog.";
        String encrypted = CaesarCipher.encryptString(unencrypted, 1, true);
        System.out.printf("Shift is %d chars%n",CaesarCipher.DEFAULT_SHIFT);
        System.out.printf("%-13s\"%s\"%n%-13s\"%s\"", "Unencrypted:", unencrypted, "Encrypted:", encrypted);
    }
}
