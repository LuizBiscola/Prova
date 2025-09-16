public class Cliente {
    public static void main(String[] args) {
        Substancia agua = new Substancia("Água", false);
        Substancia alcool = new Substancia("Álcool", true);

        Recipiente r1 = new Recipiente(100, agua);
        Recipiente r2 = new Recipiente(50, alcool);

        r1.adicionar(60);
        r2.adicionar(30);

        System.out.println(r1);
        System.out.println(r2);

        r1.remover(20);
        r2.remover(40);

        System.out.println(r1);
        System.out.println(r2);
    }
}