package Controll;

import PasswordClass.Senhas;
import java.util.ArrayList;

public class Controle {

    private ArrayList<Senhas> senhas = new ArrayList<>();

    public boolean salvar(Senhas s) {
        if (s != null) {
            senhas.add(s);
            return true;

        } else {
            return false;
        }

    }

    public ArrayList<Senhas> retornarTudo() {
        return senhas;
    }

}
