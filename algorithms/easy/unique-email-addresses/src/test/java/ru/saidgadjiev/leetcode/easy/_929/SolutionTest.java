package ru.saidgadjiev.leetcode.easy._929;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void numUniqueEmails() {
        int result = new Solution().numUniqueEmails(new String[] { "test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com" });

        Assertions.assertEquals(result, 2);
    }
}