package br.edu.ifrs.poa.view;

import br.edu.ifrs.poa.pessoa.*;
import br.edu.ifrs.poa.veiculo.Apolice;
import br.edu.ifrs.poa.veiculo.Modelo;
import br.edu.ifrs.poa.veiculo.VeiculoSegurado;

import javax.swing.*;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class FuncionaPorra {
    private Scanner l;
    private boolean execute;
    private List<Usuario> usuarios;
    private List<Cliente> clientes;
    private LinkedList<VeiculoSegurado> veiculosSegurados;


    public static void main(String[] args) {
        new FuncionaPorra();
    }

    private FuncionaPorra() {
        l = new Scanner(System.in);
        execute = true;
        usuarios = new ArrayList<Usuario>();
        clientes = new ArrayList<Cliente>();
        veiculosSegurados = new LinkedList<>();

        while (execute){
            int opcao = menu();

            switch (opcao) {
                case 1:
                    //JOptionPane.showMessageDialog(null, "Você escolheu Cadastrar um usuário");
                    cadastrarUsuario();
                    break;
                case 2:
                    //JOptionPane.showMessageDialog(null, "Você escolheu Cadastrar um veículo");
                    cadastrarVeiculo();
                    break;
                case 3:
                    //JOptionPane.showMessageDialog(null, "Você escolheu Cadastrar um Cliente");
                    cadastrarCliente();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Você escolheu Listar todos os Clientes");
                    listarClientesCadastrados();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Listar todos os Veículos");
                    listarVeiculosCadastrados();
                    break;
                case 6:
                    JOptionPane.showMessageDialog(null, "Listar todos os Usuários");
                    //listarUsuarios();
                    listarUsuariosCadastrados();
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

    private void cadastrarCliente(){
        boolean cadastrando = true;
        while (cadastrando) {
            Cliente cliente = new Cliente();
            String nome = JOptionPane.showInputDialog(null,
                    "Informe o seu nome:",
                    "Cliente",
                    JOptionPane.INFORMATION_MESSAGE);
            cliente.setNome(nome);
            int ano = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a sua data de nascimento (Ano)", "ANO"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a sua data de nascimento (Mês)", "MÊS"));
            int dia = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a sua data de nascimento (Dia)", "DIA"));
            LocalDate data = LocalDate.of(ano, mes, dia);
            String endereco = JOptionPane.showInputDialog("Qual o seu endereço?", "Digite seu endereço aqui.");
            cliente.setEndereco(endereco);
            String telefone = JOptionPane.showInputDialog("Qual o seu telefone?", "Digite seu telefone aqui.");
            cliente.setTelefone(telefone);
            String cadastrar = JOptionPane.showInputDialog(null, "Adicionar cadastro (S/N) ?");
            if (cadastrar.equalsIgnoreCase("s")) {
                JOptionPane.showMessageDialog(null, "Cadastro adicionado !!!");
                clientes.add(new Cliente(nome, data, endereco, telefone));
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

    private void cadastrarVeiculo(){
        boolean cadastrando = true;
        while (cadastrando) {
            VeiculoSegurado veiculoSegurado = new VeiculoSegurado();
            Modelo modelo = new Modelo();
            Apolice apolice = new Apolice();

            Double km = Double.valueOf(JOptionPane.showInputDialog("Informe a Quilometragem", "Km."));
            veiculoSegurado.setKilometragem(km);

            String placa = JOptionPane.showInputDialog("Qual a placa?", "Digite sua placa aqui.");
            veiculoSegurado.setPlaca(placa);

            String descricao = JOptionPane.showInputDialog("Qual o modelo do Veículo?", "Digite seu modelo aqui.");
            modelo.setDescricao(descricao);
            veiculoSegurado.setModelo(modelo);

            Long numeroApolice = Long.valueOf(JOptionPane.showInputDialog("Qual o número da apolice?", "Nº apolice"));
            apolice.setNumero(numeroApolice);
            LocalDate dataApolice = LocalDate.now();
            apolice.setData(dataApolice);
            int anoValidadeApolice = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a data de validade da apolice (Ano)", "ANO"));
            int mesValideApolice = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a data de validade da apolice (Mês)", "MÊS"));
            int diaValidadeApolice = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a data de validade da apolice (Dia)", "DIA"));
            LocalDate dataValidadeApolice = LocalDate.of(anoValidadeApolice, mesValideApolice, diaValidadeApolice);
            apolice.setDataValidade(dataValidadeApolice);
            String seguradora = JOptionPane.showInputDialog("Informe a seguradora", "Nome seguradora.");
            apolice.setSeguradora(seguradora);
            String cadastrar = JOptionPane.showInputDialog(null, "Adicionar cadastro (S/N) ?");
            if (cadastrar.equalsIgnoreCase("s")) {
                JOptionPane.showMessageDialog(null, "Cadastro adicionado !!!");
                veiculosSegurados.add(new VeiculoSegurado(km, placa, apolice, modelo));
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

    private void listarClientesCadastrados() {
        if (clientes.size() == 0) {
            JOptionPane.showMessageDialog(null, "\nNão existem clientes cadastrados !!!\n");
        } else {
            String message = " ";
            for (Cliente cliente : clientes) {
                message += cliente + "\n";
            }
            JOptionPane.showMessageDialog(null, ":: Lista de Clientes ::\n\n" + message + "\n:: Fim da lista ::\n");
        }
    }

    private void listarUsuariosCadastrados() {
        if (usuarios.size() == 0) {
            JOptionPane.showMessageDialog(null, "\nNão existem usuários cadastrados !!!\n");
            } else {
            String message = " ";
            for (Usuario usuario : usuarios) {
                message += usuario + "\n";
            }
            JOptionPane.showMessageDialog(null, ":: Lista de Usuários ::\n\n" + message + "\nFim da lista\n");
        }
    }

    private void listarVeiculosCadastrados() {
        if (veiculosSegurados.size() == 0) {
            JOptionPane.showMessageDialog(null, "\nNão existem veículos cadastrados !!!\n");
        } else {
            String message = " ";
            for (VeiculoSegurado veiculoSegurado : veiculosSegurados) {
                message += veiculoSegurado + "\n";
            }
            JOptionPane.showMessageDialog(null, ":: Lista de Veículos ::\n\n" + message + "\nFim da lista\n");
        }
    }


    private String textInput(String label) {
        System.out.println(label);
        return l.nextLine();
    }

}
