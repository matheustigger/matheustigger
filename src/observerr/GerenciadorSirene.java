package observerr;

public class GerenciadorSirene {

    public static void main(String[] args) {

        SireneConcreta sirene = new SireneConcreta();

        OperarioConcreto obs1 = new OperarioConcreto(sirene);
        OperarioConcreto obs2 = new OperarioConcreto(sirene);
        OperarioConcreto obs3 = new OperarioConcreto(sirene);

        sirene.alterarAlerta();
        sirene.alterarAlerta();
    }
}
