public class TestGeoObjects {
	
	public static void main(String[] args) {
		
		GeometricObject[] geoObjects = {
				new Rectangle(1, 2), 
				new Rectangle(2, 1), 
				new Square(1), 
				new Square(2)
			};
		
		int compareRects = ((Rectangle) geoObjects[0]).compareTo(((Rectangle) geoObjects[1]));
		int compareSquares = ((Square) geoObjects[2]).compareTo(((Square) geoObjects[3]));
		
		System.out.println("Rectangle 1 " + geoCompareToString(compareRects) + " Rectangle 2.");
		System.out.println("Square 1 " + geoCompareToString(compareSquares) + " Square 2.");
	}
	
	public static String geoCompareToString(int comparisonValue) {
		String result = "is smaller than";
		
		if(0 == comparisonValue) {
			result = "is the same size as";
		} else if (0 < comparisonValue) {
			result = "is larger than";
		}
		
		return result;
	}

}
