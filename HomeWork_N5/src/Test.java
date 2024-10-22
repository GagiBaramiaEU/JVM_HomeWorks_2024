public class Test {
    public static void main(String[] args) {
        Prizma p1=new Prizma(2,3);
        Prizma p2=new Prizma(4,2);
        float f1=p1.fartobi();
        float f2=p2.fartobi();
        if (f1>f2) System.out.println(f1+" p1");
        if (f1<f2) System.out.println(f2+" p2");

        System.out.println("==========================================================");

        //martkutxa paralelepipedi
        MartkutxaParalelepipedi martkutxaParalelepipedi1 = new MartkutxaParalelepipedi(1,2,3);
        MartkutxaParalelepipedi martkutxaParalelepipedi2 = new MartkutxaParalelepipedi(3,5,3);
        float martkutxaParalelepipedisFartobi1 = martkutxaParalelepipedi1.getarea();
        float martkutxaParalelepipedisFartobi2 = martkutxaParalelepipedi2.getarea();
        System.out.println("Martkutxa paralelepipedis fartobi1: " + martkutxaParalelepipedisFartobi1);
        System.out.println("Martkutxa paralelepipedis fartobi2: " + martkutxaParalelepipedisFartobi2);

        System.out.println("==========================================================");

        //dereqtori
        Director director1 = new Director("Jora", 1200, 30);
        Director director2 = new Director("Aqvsenti", 1731, 33);

        System.out.println("Joras xelfasi: " + director1.getsalary());
        System.out.println("Aqvsentis xelfasi: " + director2.getsalary());

        //institute
    }
}