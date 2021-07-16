package Observer;

public class Main {
    
    public static void main(String[] args) {
        Subject s1,s2,s3,s4;
        s1 = new Subject(10);
        s2 = new Subject(22);
        s3 = new Subject(23);
        s4 = new Subject(245);
        Subscriber sb,sb1,sb2,sb3;
        sb = new Subscriber();
        sb1 = new Subscriber();
        sb2 = new Subscriber();
        sb3 = new Subscriber();
        // Subject s1 pretplacujemo na korisnika sb itd...
        s1.pretplatiSe(sb);
        s1.pretplatiSe(sb1);
        s2.pretplatiSe(sb2);
      // Da bi se poruka ispisala potreban je update bar jednog Subject-a.
      s1.setN(100);
    }
}
