package br.edu.ifrs.poa.view;

import br.edu.ifrs.poa.pessoa.*;
import br.edu.ifrs.poa.veiculo.VeiculoSegurado;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class View {

    private VeiculoSegurado veiculoSegurado;
    private List<Usuario> usuarios;
    private List<Cliente> clientes;
    private Usuario usuario;
    int opc = 0;
    Menu menu = new Menu();
    Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        new View();
    }


    private View() {
        do {
            opc = menuPrincipal();
            usuarios = new ArrayList<Usuario>();
            usuario = new Usuario();


            switch (opc) {

                case 1:
                    JOptionPane.showMessageDialog(null, "Você escolheu Cadastrar um usuário");
                    //cadastrarUsuario();
                    cadastrar();
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Você escolheu Cadastrar um veículo");
                    cadastrarCliente();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Você escolheu Cadastrar um Cliente");
                    cadastrarVeiculo();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Você escolheu Listar todos os Clientes");
                    cadastrarVeiculo();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Listar todos os Veículos");
                    cadastrarVeiculo();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Listar todos os Usuários");
                    //listarUsuarios();
                    listar();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Obrigado, volte sempre.");
                    break;
                default:
                    System.out.println("Valor Invalido");
                    break;


            }
        } while (opc != 7);



        JOptionPane.showMessageDialog(null, "GREAT job Main");
        System.exit(0);


    }

    private int menuPrincipal() {
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
            System.out.println("Cadastro de Usuário");
            Usuario d = new Usuario();
            String nome = JOptionPane.showInputDialog("Qual o seu nome?", "Digite seu nome aqui.");
            d.setNome(nome);
            int ano = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a sua data de nascimento (Ano)", "ANO"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a sua data de nascimento (Mês)", "MÊS"));
            int dia = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a sua data de nascimento (Dia)", "DIA"));
            LocalDate data = LocalDate.of(ano, mes, dia);
            usuarios.add(new Usuario(nome, data));
            String continua = JOptionPane.showInputDialog(null, "Continuar cadastrando (S/N) ?");
            if (continua.equalsIgnoreCase("N")) {
                cadastrando = false;
            } else if (continua.equalsIgnoreCase("s")) {
                // se for s sai do if e volta para o inicio do while
            } else {
                JOptionPane.showMessageDialog(null, "\nOpção inválida. saindo!!! \n");
                cadastrando = false;
            }
        }
    }


    private void cadastrar() {
        boolean cadastrando = true;
        while (cadastrando) {
            System.out.println("Cadastro de Usuário");
            Usuario d = new Usuario();
            String nome = JOptionPane.showInputDialog("Qual o seu nome?", "Digite seu nome aqui.");
            d.setNome(nome);
            int ano = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a sua data de nascimento (Ano)", "ANO"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a sua data de nascimento (Mês)", "MÊS"));
            int dia = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a sua data de nascimento (Dia)", "DIA"));
            LocalDate data = LocalDate.of(ano, mes, dia);
            String cadastrar = JOptionPane.showInputDialog("Adicionar cadastro (S/N) ?");
            if (cadastrar.equalsIgnoreCase("s")) {
                System.out.println("Cadastro adicionado !!!");
                usuarios.add(new Usuario(nome, data));
            } else if (cadastrar.equalsIgnoreCase("n")) {
                System.out.println("Cadastro ignorado !!!");
            } else {
                System.out.println("\nOpção inválida seu noob, vou ignorar o cadastro só pra você ter que digitar denovo !!! \n");
            }
            String continua = JOptionPane.showInputDialog("Continuar cadastrando (S/N) ?");
            if (continua.equalsIgnoreCase("N")) {
                cadastrando = false;
            } else if (continua.equalsIgnoreCase("s")) {
                // se for s sai do if e volta para o inicio do while
            } else {
                System.out.println("\nOpção inválida seu noob, eu vou sair só porque você não colabora !!! \n");
                cadastrando = false;
            }
        }
    }

    private static void cadastrarCliente() {

    }

    private static void cadastrarVeiculo() {
        System.out.println("Cadastra o Veiculo, de boas");
    }

    private void listarUsuarios() {
        if (usuarios.size() == 0) {
            System.out.println("\nNão existem cadastros !!!\n");
        } else {
            System.out.println("\n::: Lista de Usuários :::\n");
            for (Usuario usuario : usuarios) {
                System.out.println("U:" + usuario.getNome());
            }
        }

    }


    private void listar() {
        if (usuarios.size() == 0) {
            System.out.println("\nNão existem cadastros !!!\n");
        } else {
            System.out.println("\nLista de Cadastros\n");
            for (int i = 0; i < usuarios.size(); i++) {
                Usuario d = usuarios.get(i);
                System.out.println("Cadastro número: " + i);
                System.out.println("\tNome: " + d.getNome());
                System.out.println("\tSize: " + usuarios.size());

            }
            System.out.println("\nFim da lista\n");
        }
    }

}


