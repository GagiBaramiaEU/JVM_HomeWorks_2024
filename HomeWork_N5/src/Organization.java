public class Organization{
    String name;
    String addr;
    int numbstuff;
    Organization (String s, String a, int n){
        name=s;
        addr=a;
        numbstuff=n;
    }
    int getstuffnumber(){
        return numbstuff;
    }
}
