public class Cliente {
    public static void main(String[] args) {
        Substancia lava = new Substancia("lava", true);
        Substancia suco = new Substancia("Suco", false);

        Recipiente r1 = new Recipiente(100, lava);
        Recipiente r2 = new Recipiente(50, suco);

        r1.adicionar(50);
        r2.adicionar(40);

        System.out.println(r1);
        System.out.println(r2);

        r1.remover(30);
        r2.remover(10);

        System.out.println(r1);
        System.out.println(r2);

    }
}