public class PrincipalWrapper {
    public static void main(String[] args) {
        
    
    Integer i = new Integer(10);
    int x = i;
    Integer y = 10;
    int f = y;

    Integer i1 = 127;
    Integer i2 = 127;

    Integer i3 = 128;
    Integer i4 = 128;

    //System.out.println(i1 == i2);
    System.out.println(  i1.equals(i2)); // maneira correta de testar uma igualdade
    
    System.out.println(i3.equals(i4));


    
}
}
