package oop00;

public class Binary {
	
	static int FOURBytes1, FOURBytes2, FOURBytes3, FOURBytes;

    public static void main(String[] args)
            throws Exception {


    	FOURBytes1 = 00000000000000000000000000000001;
        System.out.println(FOURBytes1);
        FOURBytes2 = FOURBytes1 << 1;
        System.out.println(FOURBytes2);  
        FOURBytes3 = FOURBytes2 << 2;
        System.out.println(FOURBytes3);   
        
        FOURBytes = FOURBytes1 | FOURBytes2;
        System.out.println(FOURBytes);     
        FOURBytes = FOURBytes | FOURBytes3;
        System.out.println(FOURBytes);  
        
        FOURBytes = FOURBytes1 & FOURBytes2;
        System.out.println(FOURBytes);  
        

    }
}