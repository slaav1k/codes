//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Spreadsheet spreadsheet = new Spreadsheet(3); // Initializes a spreadsheet with 3 rows and 26 columns
        spreadsheet.getValue("=5+7"); // returns 12 (5+7)
        spreadsheet.setCell("A1", 10); // sets A1 to 10
        spreadsheet.getValue("=A1+6"); // returns 16 (10+6)
        spreadsheet.setCell("B2", 15); // sets B2 to 15
        spreadsheet.getValue("=A1+B2"); // returns 25 (10+15)
        spreadsheet.resetCell("A1"); // resets A1 to 0
        spreadsheet.getValue("=A1+B2"); // returns 15 (0+15)
    }
}