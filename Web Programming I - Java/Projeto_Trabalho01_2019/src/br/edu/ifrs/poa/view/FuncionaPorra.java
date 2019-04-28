package br.edu.ifrs.poa.view;

import br.edu.ifrs.poa.pessoa.*;

import javax.swing.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class FuncionaPorra {
    private Scanner l;
    private boolean execute;
    private List<Usuario> usuarios;


    public static void main(String[] args) {
        new FuncionaPorra();
    }

    private FuncionaPorra() {
        l = new Scanner(System.in);
        execute = true;
        usuarios = new ArrayList<Usuario>();

        while (execute){
            int opcao = menu();

            switch (opcao) {
                case 1:
                    //JOptionPane.showMessageDialog(null, "Você escolheu Cadastrar um usuário");
                    cadastrarUsuario();
                    break;
                case 2:
                    //JOptionPane.showMessageDialog(null, "Você escolheu Cadastrar um veículo");
                    //cadastrarCliente();
                    break;
                case 3:
                    //JOptionPane.showMessageDialog(null, "Você escolheu Cadastrar um Cliente");
                    //cadastrarVeiculo();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Você escolheu Listar todos os Clientes");
                    //cadastrarVeiculo();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Listar todos os Veículos");
                    //cadastrarVeiculo();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Listar todos os Usuários");
                    //listarUsuarios();
                    listar();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Obrigado, volte sempre.");
                    execute = false;
                    break;
                default:
                    System.out.println("Valor Invalido");
                    break;


            }

        }

        System.exit(0);
    }

    //    private String menu() {
//        System.out.println("Selecione a opção:");
//        System.out.println("N - Novo cadastro");
//        System.out.println("L - Listar cadastros");
//        System.out.println("X - Sair");
//        return l.nextLine();
//    }
    private int menu() {
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


    private void cadastrarUsuario() {
        boolean cadastrando = true;
        while (cadastrando) {
            Usuario usuario = new Usuario();
            String nome = JOptionPane.showInputDialog("Qual o seu nome?", "Digite seu nome aqui.");
            usuario.setNome(nome);
            int ano = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a sua data de nascimento (Ano)", "ANO"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a sua data de nascimento (Mês)", "MÊS"));
            int dia = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a sua data de nascimento (Dia)", "DIA"));
            LocalDate data = LocalDate.of(ano, mes, dia);
            String identificador = JOptionPane.showInputDialog("Qual o identificador?", "Digite sua identificação.");
            usuario.setIdentificador(identificador);
            String senha = JOptionPane.showInputDialog("Digite a senha", "senha.");
            usuario.setSenha(senha);
            String cadastrar = JOptionPane.showInputDialog(null, "Adicionar cadastro (S/N) ?");
            if (cadastrar.equalsIgnoreCase("s")) {
                JOptionPane.showMessageDialog(null, "Cadastro adicionado !!!");
                usuarios.add(new Usuario(nome, data, identificador, senha));
            } else if (cadastrar.equalsIgnoreCase("n")) {
                JOptionPane.showMessageDialog(null, "Cadastro ignorado !!!");
            } else {
                JOptionPane.showMessageDialog(null, "\nOpção inválida. Digite novamente.\n");
            }
            String continua = JOptionPane.showInputDialog(null,"Continuar cadastrando (S/N) ?");
            if (continua.equalsIgnoreCase("N")) {
                cadastrando = false;
            } else if (continua.equalsIgnoreCase("s")) {
                // se for s sai do if e volta para o inicio do while
            } else {
                System.out.println("\nOpção inválida, tente novamente !!! \n");
                cadastrando = true;
            }
        }
    }


    private void listarCadastros() {
        if (usuarios.size() == 0) {
            System.out.println("\nNão existem cadastros !!!\n");
        } else {
            System.out.println("\nLista de Cadastros\n");
            for (int i = 0; i < usuarios.size(); i++) {
                Usuario d = usuarios.get(i);
                System.out.println("Cadastro número: " + i);
                System.out.println("\tNome: " + d.getNome());
                System.out.println("\tSize: " + usuarios.size());
                System.out.println("\tlista: " + d.toString());

            }
            System.out.println("\nFim da lista\n");
        }
    }

    private void listar() {
        if (usuarios.size() == 0) {
            JOptionPane.showMessageDialog(null, "\nNão existem usuários cadastrados !!!\n");
            } else {
            String message = " ";
            for (Usuario usuario : usuarios) {
                message += usuario + "\n";
            }
            JOptionPane.showMessageDialog(null, ":: Lista de Usuários ::\n\n" + message);


        }
    }

    private String textInput(String label) {
        System.out.println(label);
        return l.nextLine();
    }

}
