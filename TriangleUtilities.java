 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String stars = "";
        for (int i = 1; i <= numberOfStars; i++){
            stars += "*";
        }
        return stars;
    }
    
    public static String getTriangle(int numberOfRows) {
        String stars = "";
        for (int i = 1; i <= numberOfRows; i++) {
            stars += getRow(i) + "\n";
        }
        return stars;
    }


    public static String getSmallTriangle() {
        String stars = getTriangle(4);
        return stars;
    }

    public static String getLargeTriangle() {
        String stars = getTriangle(9);
        return stars;
    }
}
