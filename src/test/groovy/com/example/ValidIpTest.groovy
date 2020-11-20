package com.example

import spock.lang.Specification

class ValidIpTest extends Specification {

    def "should return modified String"() {
        setup:
        def validIp = new ValidIp()

        expect:
        validIp.changeIpFormat(address as String) == result as String

        where:
        address         | result
        "255.100.50.0"  | "255[.]100[.]50[.]0"
        "255.100.52.01" | "255[.]100[.]52[.]01"
        "255.100.0.9"   | "shou255[.]100[.]0[.]9"
        "255.123.0.9"   | "255[.]123[.]0[.]9"



    }
}
