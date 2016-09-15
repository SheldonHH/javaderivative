public class Calculator {
    private String message;
    private int a;
    private int b;
 public int add(int a, int b) {
     this.a = a;
     this.b = b;
     return a + b;
 }

 public int  substract(int a, int b) {
     this.a = a;
     this.b = b;
     return a - b;
 }

 public int multiply(int a, int b) {
     this.a = a;
     this.b = b;
     return a * b;
 }

 public int divide(int a, int b) {
     this.a = a;
     this.b = b;
     return a / b;
 }
 
 public String printMSG(){
     System.out.println(message);
     return message;
 }
 
}
