public class Mahabharata {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Kaurav duryodhan = new Kaurav();
        Vikarn vikarn = new Vikarn();
      
        arjun.display();
        arjun.fight();
        arjun.obey();
        arjun.kind();
        System.out.println();
        bheem.display();
        bheem.fight();
        bheem.obey();
        bheem.kind();
        System.out.println();
        System.out.println("Duryodhan's characteristics:");
        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();
        System.out.println();
        vikarn.display();
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}