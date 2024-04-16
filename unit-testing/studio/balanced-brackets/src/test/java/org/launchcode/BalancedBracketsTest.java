package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void containsProperBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }
    @Test
    public void mayContainBracketsIn() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }
    @Test
     public void mayContainBracketsAtFront() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }
    @Test
    public  void mayContainEmpty() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void mayContainEmptyBrakcets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    @Test
    public void falseOneBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }
    @Test
    public void falseWrongBracketPlacement() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }
    @Test
    public void falseOddBracket () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void falseOppBrackets () {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
}