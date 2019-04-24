package br.edu.ifrs.poa.view;

import br.edu.ifrs.poa.pessoa.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class cadastraUsuario {
    private List<Usuario> usuarios = new ArrayList<Usuario>();
    private LocalDate dtNasc;

    public void addDtNasc(int ano, int mes, int dia){
        LocalDate addData = LocalDate.of(ano, mes, dia);
        dtNasc = addData;
    }

    public LocalDate getDtNasc() {
        return dtNasc;
    }

    public void addUsuario(Usuario us){
        this.usuarios.add(us);

    }
    public void mostraUsuarios(){
        for (Usuario usuario: usuarios) {
            System.out.println("Usuarios cadastrados:" + usuario);
            System.out.println("Data scanner: " );
        }
    }

}
