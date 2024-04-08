package company;

public class ObjectSample2 {

    public static void main(String[] args) {
        String a =new String("Hello");
        String b =new String("Hello");
        String c = a;
        
        System.out.println(a==b);
        System.out.println(a==c);
        
        System.out.println(a.equals(b));
        
        Double d = 3.14;
        System.out.println(d.toString());
        
        System.out.println(d.hashCode());

        String str = " Hello World! ";
        System.out.println(str.length());
        
        System.out.println(str.substring(1,4));
        
        System.out.println(str.contains("llo"));
        
        System.out.println(str.replace('l', 'L'));

        System.out.println(str.trim());
        
        String name ="Alice";
        int age =25;
        double height=1.7;
        
        String formattedString = "Name: %s, Age: %d, Height: %.2f".formatted(name,age,height);
        System.out.println(formattedString);
        
    }

}
