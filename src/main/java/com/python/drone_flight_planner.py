class Solution:
    def find_drone_fuel_needed(self, route):
        start_z = route[0][2]
        max_z = route[0][2]

        for i in range(1, len(route)):
            current = route[i][2]
            if current > max_z:
                max_z = current

        return max_z - start_z