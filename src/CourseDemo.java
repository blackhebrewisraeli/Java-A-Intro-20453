/**
 * Demonstrates the integration between the main classes developed
 * during course 20453 - Introduction to Computer Science and Java A.
 *
 * This class is not part of the original course assignments.
 * It was added to show how the separate assignment classes can work
 * together as one coherent Java project.
 */
public class CourseDemo {
    public static void main(String[] args) {
        demonstratePointsAndDates();
        demonstrateCitiesAndCountry();
        demonstrateMatrixOperations();
    }

    private static void demonstratePointsAndDates() {
        System.out.println("=== Point and Date Demo ===");

        Point p1 = new Point(2, 3);
        Point p2 = new Point(8, 11);

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);
        System.out.println("Middle point: " + p1.middle(p2));
        System.out.println("Distance: " + p1.distance(p2));

        Date d1 = new Date(1, 1, 2020);
        Date d2 = new Date(15, 6, 2023);

        System.out.println("Date 1: " + d1);
        System.out.println("Date 2: " + d2);
        System.out.println("Date difference: " + d1.difference(d2));
        System.out.println();
    }

    private static void demonstrateCitiesAndCountry() {
        System.out.println("=== City and Country Demo ===");

        Country country = new Country("PortfolioLand");

        country.addCity("Alpha", 1, 1, 1990, 10, 20, 12, 25, 120000, 8);
        country.addCity("Beta", 15, 5, 1980, 30, 50, 28, 48, 250000, 12);
        country.addCity("Gamma", 10, 10, 2005, 5, 8, 7, 9, 75000, 4);

        System.out.println(country);
        System.out.println("Total residents: " + country.getNumOfResidents());
        System.out.println("Longest distance between cities: " + country.longestDistance());
        System.out.println("Southernmost city: " + country.southernmostCity());
        System.out.println("Cities north of Alpha: " + country.citiesNorthOf("Alpha"));

        City unified = country.unifyCities("Alpha", "Gamma");
        System.out.println("Unified city: " + unified);
        System.out.println("Country after unification:");
        System.out.println(country);
        System.out.println();
    }

    private static void demonstrateMatrixOperations() {
        System.out.println("=== Matrix Demo ===");

        int[][] pixels = {
            {0, 50, 100},
            {150, 200, 255}
        };

        Matrix image = new Matrix(pixels);

        System.out.println("Original matrix:");
        System.out.println(image);

        System.out.println("Vertically flipped:");
        System.out.println(image.flipVertically());

        System.out.println("Horizontally flipped:");
        System.out.println(image.flipHorizontally());

        System.out.println("Rotated clockwise:");
        System.out.println(image.rotateClockwise());

        System.out.println("Rotated counter-clockwise:");
        System.out.println(image.rotateCounterClockwise());
    }
}
