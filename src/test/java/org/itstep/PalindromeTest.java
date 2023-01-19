package org.itstep;

import org.junit.jupiter.api.Test;

import static org.itstep.Palindrome.isPalindrome;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeTest {

    @Test
    void isNullOrBlankIsPalindrome() {
        assertFalse(isPalindrome(null));
        assertFalse(isPalindrome(""));
        assertFalse(isPalindrome(" "));
    }

    @Test
    void isTruePalindrome() {
        assertTrue(isPalindrome("madam"));
        assertTrue(isPalindrome("m.adam"));
        assertTrue(isPalindrome("m.ad am"));
        assertTrue(isPalindrome("m.ad am;"));
        assertTrue(isPalindrome(" m.ad am;"));
        assertTrue(isPalindrome(" m.a,d am;"));
        assertTrue(isPalindrome(" M.a,d am;"));
        assertTrue(isPalindrome(" M.a,d Am;"));
    }

    @Test
    void isNotPalindrome() {
        assertFalse(isPalindrome("mama"));
        assertFalse(isPalindrome("m.ama"));
        assertFalse(isPalindrome("ma,ma"));
        assertFalse(isPalindrome("mam;a"));
        assertFalse(isPalindrome("mamA"));
        assertFalse(isPalindrome("mama "));
        assertFalse(isPalindrome("\tmama "));
    }
}