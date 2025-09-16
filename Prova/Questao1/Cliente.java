public class Cliente {
    public static void main(String[] args) {
        Substancia agua = new Substancia("Água", false);
        Substancia alcool = new Substancia("Álcool", true);

        Recipiente r1 = new Recipiente(100, agua);
        Recipiente r2 = new Recipiente(50, alcool);

        r1.encher(60);
        r2.encher(30);

        System.out.println(r1);
        System.out.println(r2);

        r1.esvaziar(20);
        r2.esvaziar(40);

        System.out.println(r1);
        System.out.println(r2);
    }
}