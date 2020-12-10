package com.example

import spock.lang.Specification

class PalindromicSubstringTest extends Specification {

    def "should return substring of the longest palindrome"(){
        setup:
        def palindromicSubstring = new PalindromicSubstring()

        expect:
        palindromicSubstring.longestPalindromic(s as String) == result as String

        where:
        s                              |  result
        "abcasvswracecarmvlmdfl"       |  "racecar"
        "abcasvswaaacaaamvlmdfl"       |  "aaacaaa"
        "abcasvswaaabbcbbaaamvlmdfl"   |  "aaabbcbbaaa"
        "abcasvswamamamamamaamvlmdfl"  |  "amamamamama"
        "mcvkdcivicmdfdv"              |  "civic"

    }
}
