package br.edu.ifrs.poa.view;

import br.edu.ifrs.poa.pessoa.Usuario;

import java.util.ArrayList;
import java.util.List;

public class cadastraUsuario {
    private List<Usuario> usuarios = new ArrayList<Usuario>();

    public void addUsuario(Usuario us){
        this.usuarios.add(us);

    }
    public void mostraUsuarios(){
        for (Usuario usuario: usuarios) {
            System.out.println("Usuarios cadastrados:" + usuario);
        }
    }

}
