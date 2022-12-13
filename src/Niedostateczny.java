public class Niedostateczny extends oceny{

    int Niedostateczny  = 1;

    public Niedostateczny(String ocena, int niedostateczny) {
        super(ocena);
        Niedostateczny = niedostateczny;
    }

    public String getName(){
        return "niedostateczny " + 1;
    }
}
