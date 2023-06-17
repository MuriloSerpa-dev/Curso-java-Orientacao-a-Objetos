public class SwitchCaseComString {
    public static void main(String[] args) {
        String carro = "honda";

     /*   if (carro.equals("Audi")) {
            System.out.println("Alemão");
        } else if (carro.equals("Ferrari")) {
            System.out.println("Italiano");
        }
    }*/
        switch (carro){
            case "Audi":
                System.out.println("Alemão");
                break;
            case "Ferrari":
                System.out.println("Italiano");
                break;
            case "honda":
                System.out.println("Japones");
                break;
            default:
                System.out.println("Não informou nenhum carro");
        }
    }
}