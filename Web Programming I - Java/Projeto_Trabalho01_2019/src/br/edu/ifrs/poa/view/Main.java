/*
package br.edu.ifrs.poa.view;

import br.edu.ifrs.poa.pessoa.Cliente;
import br.edu.ifrs.poa.pessoa.Pessoa;
import br.edu.ifrs.poa.pessoa.Usuario;
import br.edu.ifrs.poa.veiculo.Apolice;
import br.edu.ifrs.poa.veiculo.VeiculoSegurado;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Menu layoutMenu = new Menu();
    public Main(){
        opcao();
    }

    private void opcao() {
        switch(layoutMenu.DesenharMenu()){
            case 1:
                JOptionPane.showMessageDialog(null,"Escolheu a opção cadastrar usuário");
                layoutMenu.cadastroUsuario();
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Escolheu menu 2");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"Escolheu menu 3");
                break;
            default: JOptionPane.showMessageDialog(null,"opção invalida");
        }
    }


    public static void main(String[] args) {

        //Main principal = new Main();
        //Menu usu = new Menu();

        Scanner scanner = new Scanner(System.in);
        ArrayList<Usuario> listaDeUsuarios = new ArrayList<Usuario>();
        Usuario usuario = new Usuario();
        int op = 0;

        //System.out.println("Digite 1 para cadastrar usuários ou 0 para sair !");
        String desenha = "1 - Fazer cadastro\n"
                + "2 - Voltar Menu Principal\n\n"
                + "Escolha uma opção: ";
        int i = Integer.parseInt(JOptionPane.showInputDialog(desenha));
        op = i;
        while(op != 0){
            //System.out.println("Bem vindo ao sistema de cadastros de usuários");
            //System.out.println("Digite o nome do usuário");
            JOptionPane.showMessageDialog(null, "Bem vindo ao sistema de cadastros de usuários");
            JOptionPane.showInputDialog(null, "Digite o nome do usuário");
            usuario.setNome(scanner.nextLine());
            JOptionPane.showInputDialog(null, "Digite a dt. nascimento do usuário");
            usuario.setDataNascimento(scanner.nextLine());
            JOptionPane.showInputDialog(null ,"Digite o identificador");
            usuario.setIdentificador(scanner.nextLine());
            JOptionPane.showInputDialog(null ,"Digite a senha");
            usuario.setSenha(scanner.nextLine());
            listaDeUsuarios.add(usuario);
            usuario = new Usuario();
            JOptionPane.showMessageDialog(null, "Digite 1 para cadastrar outro usuário ou 0 para sair !");
            op = scanner.nextInt();
        }



        System.out.println("Hello World!");
        //Usuario pedro = new Usuario("Pedro", "21/01/1989", "0001", "qwert");
        usuario.toString();




    }
}

/*
*private static String solicitarNomeDoUsuario(){
		String nome = JOptionPane.showInputDialog(null, "Nome do titular: ");
		return nome;
	}

	private static String solicitarNomeDaAgencia(){
		String agencia = JOptionPane.showInputDialog(null, "Nome da Agencia: ");
		return agencia;
	}


	private static Integer solicitarNumeroDaConta(){
		String strNumero = JOptionPane.showInputDialog(null, "Numero da Conta: ");

		return Integer.parseInt(strNumero);
	}
*
* */
