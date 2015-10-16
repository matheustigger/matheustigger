package observerr;

import java.util.ArrayList;
import java.util.Iterator;

public class SireneConcreta implements Sirene {

    private Boolean alertaSonoro = false;
    private ArrayList observadores = new ArrayList();

    public void alterarAlerta() {
        alertaSonoro = !alertaSonoro;
        notificarObservadores();

    }

    public Boolean getAlerta() {
        return alertaSonoro;
    }

    @Override
    public void adicionarObservador(Operario o) {
        observadores.add(o);
    }

    @Override
    public void removerObservador(Operario o) {
        observadores.remove(o);
    }

    private void notificarObservadores() {
        Iterator i = observadores.iterator();
        while (i.hasNext()) {
            Operario o = (Operario) i.next();
            o.atualizar(this);
        }
    }
}
