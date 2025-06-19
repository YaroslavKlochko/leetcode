
public class ExcelSheetColumnTitle168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            columnNumber--; // Adjust for 0-based index
            char currentChar = (char) ('A' + (columnNumber % 26));
            result.insert(0, currentChar);
            columnNumber /= 26; // Move to the next "digit"
        }
        return result.toString();
    }
}
