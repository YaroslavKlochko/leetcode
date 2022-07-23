import spock.lang.Specification

class ShuffleStringTest extends Specification {

    def "should return shuffled string"() {
        setup:
        def shuffleString = new ShuffleString()

        expect:
        shuffleString.restoreString(s as String, indices as int[]) == result as String

        where:
        s          | indices                  | result
        "codeleet" | [4, 5, 6, 7, 0, 2, 1, 3] | "leetcode"
        "abc"      | [0, 1, 2]                | "abc"
        "aiohn"    | [3, 1, 4, 2, 0]          | "nihao"
        "aaiougrt" | [4, 0, 2, 6, 7, 3, 1, 5] | "arigatou"
        "art"      | [1, 0, 2]                | "rat"
    }
}
