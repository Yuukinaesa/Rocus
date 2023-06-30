package arfan.hidayat.rocus;

public class answerclass {

    private int pilihanA,pilihanB,pilihanC,pilihanD,soalid,answerid;

    public answerclass(int soalide, int pilihana, int pilihanb, int pilihanc, int pilihand, int answeride)
    {
        soalid=soalide;
        pilihanA=pilihana;
        pilihanB=pilihanb;
        pilihanC=pilihanc;
        pilihanD=pilihand;
        answerid=answeride;


    }


    public int getPilihanA() {
        return pilihanA;
    }

    public int getPilihanB() {
        return pilihanB;
    }

    public int getPilihanC() {
        return pilihanC;
    }

    public int getPilihanD() {
        return pilihanD;
    }

    public int getsoalid() {
        return soalid;
    }

    public int getAnswerid() {
        return answerid;
    }
}