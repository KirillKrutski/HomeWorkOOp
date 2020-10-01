package Figure;



public class Main {
    public static void main(String[] args) {
        Triangle triangleOne = new Triangle(5.0, 4.0, 3.0);
        System.out.println(triangleOne);
        System.out.println(triangleOne.squareOfTriangle() + " is square of triangle");
        System.out.println(triangleOne.perimeterOfTriangle() + " is perimeter of triangle");
//        System.out.println(triangleOne.pifagore());
    }

}
