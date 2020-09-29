class Point {
     int x,y,z;
     Point(int x, int y ,int z) {
          this.x = x;
          this.y = y;
          this.z = z;
     }

     public void setX(int x) {
          this.x = x;
     }

     public void setY(int y) {
          this.y = y;
     }

     public void setZ() {
          this.y = y;
     }

     public int getDistance() {
          return this.x + this.y + this.z;
     }

}

public class TestPoint {
     public static void main(String[] args) {
          Point p = new Point(1,3,3);
          System.out.println(p.getDistance());
     }
}