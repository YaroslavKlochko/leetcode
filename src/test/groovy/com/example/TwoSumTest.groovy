import spock.lang.Specification

class TwoSumTest extends Specification {

    def "should return array with indexes"() {
        setup:
        def twoSum = new TwoSum()

        expect:
        twoSum.twoSum(nums as int[], target) == result as int[]

        where:
        nums           | target | result
        [2, 7, 11, 15] | 9      | [0, 1]
        [3, 2, 4]      | 6      | [1, 2]
        [3, 3]         | 6      | [0, 1]
        [3, 2, 3]      | 6      | [0, 2]
    }
}