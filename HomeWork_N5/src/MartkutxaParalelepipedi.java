public class MartkutxaParalelepipedi extends Martkutxedi{
    float simagle;
    MartkutxaParalelepipedi(float s, float g, float h) {
        super(s, g);
        simagle = h;
    }

    @Override
    float getarea(){
        return sigane*sigrze*simagle;
    }
}
