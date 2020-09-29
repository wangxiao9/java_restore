public class TestComputations {
     public static void main(String[] args) {
          float score = 89.0f;
          String type = score > 60.0 ? "及格" : "不及格";
          int x = -100;
          int flag = x > 0 ? 1 : (x == 0 ? 0:-1);
          System.out.println(type);
          System.out.println(flag);
     }
}