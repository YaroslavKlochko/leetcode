package com.example;

/**
 * Given a valid (IPv4) IP address, return a modified version of that IP address.
 * <p>
 * A modified IP address replaces every period "." with "[.]".
 * <p>
 * Example 1:
 * Input: address = "1.1.1.1"
 * Output: "1[.]1[.]1[.]1"
 * Example 2:
 * <p>
 * Input: address = "255.100.50.0"
 * Output: "255[.]100[.]50[.]0"
 * <p>
 * Constraints:
 * The given address is a valid IPv4 address.
 */
public class ValidIp {

    /**
     * @param address address before modification
     * @return formatted address after modification
     */
    public String changeIpFormat(final String address) {
        return address.replace(".", "[.]");
    }
}
