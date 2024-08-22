package WallpaperGenerator;

public class WallpaperGenerator {
  public static void main(String[] args) {
      int numRows = 4;
      int numColumns = 20;

      generateWallpaper(numRows, numColumns);
  }

  public static void generateWallpaper(int numRows, int numColumns) {
      String pattern1 = "010101";
      String pattern2 = "101010";

      for (int i = 0; i < numRows; i++) {
          if (i % 2 == 0) {
              System.out.println(pattern1.substring(0, numColumns));
          } else {
              System.out.println(pattern2.substring(0, numColumns));
          }
      }
  }
}
