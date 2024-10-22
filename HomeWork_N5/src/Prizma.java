public class Prizma extends Kvadrati {
    float simagle;
    Prizma(float gv,float sm){
        super(gv);
        simagle=sm;
    }
    float fartobi(){
        return 2*getarea()+4*gverdi*simagle;
    }
}
