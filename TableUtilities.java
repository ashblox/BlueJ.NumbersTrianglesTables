 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String smallTable = "";
        for (int i = 1; i <=5; i++){
            for (int j = 1; j<=5; j++) {
                int newValue = i * j;
                smallTable += String.format("%3d |", newValue);
            }
            smallTable += "\n";
        }
        return smallTable;
    }

    public static String getLargeMultiplicationTable() {
        String smallTable = "";
        for (int i = 1; i <=10; i++){
            for (int j = 1; j<=10; j++) {
                int newValue = i * j;
                smallTable += String.format("%3d |", newValue);
            }
            smallTable += "\n";
        }
        return smallTable;
    }

    public static String getMultiplicationTable(int tableSize) {
        String smallTable = "";
        for (int i = 1; i <=tableSize; i++){
            for (int j = 1; j<=tableSize; j++) {
                int newValue = i * j;
                smallTable += String.format("%3d |", newValue);
            }
            smallTable += "\n";
        }
        return smallTable;
    }
}
