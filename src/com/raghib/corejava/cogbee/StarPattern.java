package com.raghib.corejava.cogbee;


/*

https://www.youtube.com/watch?v=xzstcj3Cuso

COMPANY - cogbee

Write a program to print the pattern given below (Right Triangle Star Pattern)
        *�
      * *�
    * * *�
  * * * *�
* * * * *

*/

public class StarPattern {
/* 1
starPattern_Box - START
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 
starPattern_Box - END
 */
	public static void starPatter_Box(int size) {
		System.out.println("starPattern_Box - START");
		for (int i = 1; i <= size; i++) { // ROW
			for (int j = 1; j <= size; j++) { // COLUMN
				System.out.print("* ");
			}
			System.out.println(""); // Cursor move to next line, ending of inner for loop.
		}
		System.out.println("starPattern_Box - END");
	}
	
/* 2
	starPattern_RightSideTriangle_Increasing - START
	* 
	* * 
	* * * 
	* * * * 
	* * * * * 
	starPattern_RightSideTriangle_Increasing - END
*/
	public static void starPatter_RightSideTriangle_Increasing(int size) {
		System.out.println("starPattern_RightSideTriangle_Increasing - START");
		for (int i = 1; i <= size; i++) { // ROW
			for (int j = 1; j <= i; j++) { // COLUMN
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("starPattern_RightSideTriangle_Increasing - END");
	}
	
/* 3
starPattern_RightSideTriangle_Decreasing - START
* * * * * 
* * * * 
* * * 
* * 
* 
starPattern_RightSideTriangle_Decreasing - END
 */
	public static void starPatter_RightSideTriangle_Decreasing(int size) {
		System.out.println("starPattern_RightSideTriangle_Decreasing - START");
		for (int i = 1; i <= size; i++) { // ROW
			for (int j = i; j <= size; j++) { // COLUMN
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("starPattern_RightSideTriangle_Decreasing - END");
	}
	
/* 4 => 3 and 2
starPattern_LeftSideTriangle_Increasing - START
          * 
        * * 
      * * * 
    * * * * 
  * * * * * 
starPattern_LeftSideTriangle_Increasing - END
 */
	public static void starPatter_LeftSideTriangle_Increasing(int size) {
		System.out.println("starPattern_LeftSideTriangle_Increasing - START");
		for (int i = 1; i <= size; i++) { // ROW
			for (int j = i; j <= size; j++) { // COLUMN - Print spaces [DECREASING SPACE]
				System.out.print("  "); // PRINT TWO SPACES
			}
			for (int j = 1; j <= i; j++) { // COLUMN - Print Star [INCREASING STAR]
				System.out.print("* "); // PRINT ONE STAR AND ONE SPACE
			}
			System.out.println("");
		}
		System.out.println("starPattern_LeftSideTriangle_Increasing - END");
	}

/* 5 => 2 and 3
starPattern_LeftSideTriangle_Decreasing - START
  * * * * * 
    * * * * 
      * * * 
        * * 
          * 
starPattern_LeftSideTriangle_Decreasing - END
 */
	public static void starPatter_LeftSideTriangle_Decreasing(int size) {
		System.out.println("starPattern_LeftSideTriangle_Decreasing - START");
		for (int i = 1; i <= size; i++) { // ROW
			for (int j = 1; j <= i; j++) { // COLUMN - Print spaces [INCREASING SPACE]
				System.out.print("  "); // PRINT TWO SPACES
			}
			for (int j = i; j <= size; j++) { // COLUMN - Print Star [DECREASING STAR]
				System.out.print("* "); // PRINT ONE STAR AND ONE SPACE
			}
			System.out.println("");
		}
		System.out.println("starPattern_LeftSideTriangle_Decreasing - END");
	}

/* 6
starPattern_Pyramid - START
          * 
        * * * 
      * * * * * 
    * * * * * * * 
  * * * * * * * * * 
starPattern_Pyramid - END
 */
	public static void starPatter_Pyramid(int size) {
		System.out.println("starPattern_Pyramid - START");
		for (int i = 1; i <= size; i++) { // ROW
			for (int j = i; j <= size; j++) { // COLUMN - Print spaces [DECREASING SPACE]
				System.out.print("  "); // PRINT TWO SPACES
			}
			for (int j = 1; j < i; j++) { // COLUMN - Print Star one less time [INCREASING STAR]
				System.out.print("* "); // PRINT ONE STAR AND ONE SPACE
			}
			for (int j = 1; j <= i; j++) { // COLUMN - Print Star [INCREASING STAR]
				System.out.print("* "); // PRINT ONE STAR AND ONE SPACE
			}
			System.out.println("");
		}
		System.out.println("starPattern_Pyramid - END");
	}

/* 7
starPattern_ReversePyramid - START
  * * * * * * * * * 
    * * * * * * * 
      * * * * * 
        * * * 
          * 
starPattern_ReversePyramid - END
 */
	public static void starPatter_ReversePyramid(int size) {
		System.out.println("starPattern_ReversePyramid - START");
		for (int i = 1; i <= size; i++) { // ROW
			for (int j = 1; j <= i; j++) { // COLUMN - Print spaces [INCREASING SPACE]
				System.out.print("  "); // PRINT TWO SPACES
			}
			for (int j = i; j < size; j++) { // COLUMN - Print Star one less time [DECREASING STAR]
				System.out.print("* "); // PRINT ONE STAR AND ONE SPACE
			}
			for (int j = i; j <= size; j++) { // COLUMN - Print Star [DECREASING STAR]
				System.out.print("* "); // PRINT ONE STAR AND ONE SPACE
			}
			System.out.println("");
		}
		System.out.println("starPattern_ReversePyramid - END");
	}
	
/* 8
starPattern_Diamond - START
          * 
        * * * 
      * * * * * 
    * * * * * * * 
  * * * * * * * * * 
    * * * * * * * 
      * * * * * 
        * * * 
          * 
starPattern_Diamond - END
 */
	public static void starPatter_Diamond(int size) {
		System.out.println("starPattern_Diamond - START");
		for (int i = 1; i < size; i++) { // ROW [HERE WE ARE PRINTING ONE LESS ROW]
			for (int j = i; j <= size; j++) { // COLUMN - Print spaces [DECREASING SPACE]
				System.out.print("  "); // PRINT TWO SPACES
			}
			for (int j = 1; j < i; j++) { // COLUMN - Print Star one less time [INCREASING STAR]
				System.out.print("* "); // PRINT ONE STAR AND ONE SPACE
			}
			for (int j = 1; j <= i; j++) { // COLUMN - Print Star [INCREASING STAR]
				System.out.print("* "); // PRINT ONE STAR AND ONE SPACE
			}
			System.out.println("");
		}
		for (int i = 1; i <= size; i++) { // ROW
			for (int j = 1; j <= i; j++) { // COLUMN - Print spaces [INCREASING SPACE]
				System.out.print("  "); // PRINT TWO SPACES
			}
			for (int j = i; j < size; j++) { // COLUMN - Print Star one less time [DECREASING STAR]
				System.out.print("* "); // PRINT ONE STAR AND ONE SPACE
			}
			for (int j = i; j <= size; j++) { // COLUMN - Print Star [DECREASING STAR]
				System.out.print("* "); // PRINT ONE STAR AND ONE SPACE
			}
			System.out.println("");
		}
		System.out.println("starPattern_Diamond - END");
	}

	public static void main(String[] args) {

//		Scanner scannerObj = new Scanner(System.in);
//		System.out.print("Enter Size : ");
//		int starSize = scannerObj.nextInt();
		int starSize = 5;
		starPatter_Box(starSize);
		System.out.println("");
		starPatter_RightSideTriangle_Increasing(starSize);
		System.out.println("");
		starPatter_RightSideTriangle_Decreasing(starSize);
		System.out.println("");
		starPatter_LeftSideTriangle_Increasing(starSize);
		System.out.println("");
		starPatter_LeftSideTriangle_Decreasing(starSize);
		System.out.println("");
		starPatter_Pyramid(starSize);
		System.out.println("");
		starPatter_ReversePyramid(starSize);
		System.out.println("");
		starPatter_Diamond(starSize);

	}
}
