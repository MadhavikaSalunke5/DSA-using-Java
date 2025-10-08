public class variables {
  public static void main(String[] args) {
    //Printing a variable
    int a=100;
    System.out.println(a);

    //Sum of two variables
    int b=200;
    int sum=a+b;
    System.out.println(sum);

    //Swapping two variables
    int x=10;
    int y=20;
    int temp;
    temp=x;
    x=y;
    y=temp;
    System.out.println("After swapping x="+x);
    System.out.println("After swapping y="+y);

    //Swapping without third variable
    int p=30;
    int q=40;
    p=p+q; //p=70 
    q=p-q; //q=30
    p=p-q; //p=40
    System.out.println("After swapping p="+p);
    System.out.println("After swapping q="+q);  

    //Constant variable
    final float pi=3.14f;
    System.out.println(pi);
    //pi=3.15f; //we cannot change the value of constant variable

    //Variable naming conventions
    int _num=10;
    int $num=20;
    int num1=30;
    //int 1num=40; //invalid
    //int num@=50; //invalid
    int num_=60;
    System.out.println(_num);
    System.out.println($num);

    System.out.println(num1);
    System.out.println(num_);

    //Data types and memory allocation
    int age=25; //4 bytes
    float height=5.9f; //4 bytes
    double weight=70.5; //8 bytes
    char grade='A'; //2 bytes
    boolean isStudent=true; //1 byte
    String name="John"; //depends on the length of the string
    System.out.println("Age: "+age);
    System.out.println("Height: "+height);

    System.out.println("Weight: "+weight);

    System.out.println("Grade: "+grade);

    System.out.println("Is Student: "+isStudent);
    
    System.out.println("Name: "+name);

    //Type casting
    int i=100;
    float f=i; //implicit casting
    System.out.println(f);
    float g=10.5f;
    int j=(int)g; //explicit casting
    System.out.println(j);

    //Type conversion
    String str="123";
    int num=Integer.parseInt(str);
    System.out.println(num);
    int num2=456;
    String str2=String.valueOf(num2);
    System.out.println(str2);
    




  }
  
}
