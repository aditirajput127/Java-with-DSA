public class User_defined {
    public static void Name(){
        System.out.println("Aditi");
    }
    public static void main(String[] args) {
    Nitu();
    System.out.println("Vinita");
    Name();  // it doestnt matter the postion of where you've made the fuction the main fuction work would happen first 
    System.out.println("Tarun");    
    }

    public static void tarun(){
        System.out.println("Shiva");
        Vinita();
    }

    public static void Vinita(){
        System.out.println("Vipin");
    }
    
    public static void Nitu(){
        tarun();
        System.out.println("Pankaj");
    }
}  