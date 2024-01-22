

public class Main {
    public static void main(String[] args){
        System.out.println("Hola Mundo");

        Saludo saludo = new Saludo();
        saludo.saludar("Sandra");

        OtroSaludo otroSaludo = new OtroSaludo();
        otroSaludo.saludar("Pacho");
    }
}
