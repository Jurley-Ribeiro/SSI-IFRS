package br.edu.ifrs.poa.view;

import javax.swing.*;

public class Menu {

    public int DesenharMenu() {
        String desenha = "1 – Cadastrar Usuário\n"
                + "2 – Cadastrar Veículo Segurado\n"
                + "3 – Cadastrar Cliente\n"
                + "4 – Listar todos os Clientes\n"
                + "5 – Listar todos os Veículos\n"
                + "6 – Listar todos os Usuários\n"
                + "7 – Sair\n\n"
                + "Escolha uma opção: ";
        int escolha = Integer.parseInt(JOptionPane.showInputDialog(desenha));
        return escolha; //retorna o menu escolhido
    }

    public int cadastroUsuario(){
        String desenha = "1 - Fazer cadastro\n"
                + "2 - Voltar Menu Principal\n\n"
                + "Escolha uma opção: ";
        int escolheCadastroUsuario = Integer.parseInt(JOptionPane.showInputDialog(desenha));
        return escolheCadastroUsuario;
    }
}
