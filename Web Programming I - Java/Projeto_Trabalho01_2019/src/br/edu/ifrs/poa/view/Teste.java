package br.edu.ifrs.poa.view;

import br.edu.ifrs.poa.pessoa.Pessoa;
import br.edu.ifrs.poa.pessoa.Usuario;

import javax.swing.*;
import java.time.LocalDate;
import java.util.*;

public class Teste {

    public static void main(String[] args) {
        int opc = 0;
        Scanner input = new Scanner(System.in);

        Menu menu = new Menu();
        //opc = menu.menuPrincipal();
        JOptionPane.showMessageDialog(null, "Você escolheu Cadastrar um usuário");
        opc = menu.menuCadastraUsuario();

        Usuario usuario = new Usuario();
        List<Usuario> usuarios = new ArrayList<Usuario>();
        cadastraUsuario cadastraP1 = new cadastraUsuario();
        while (opc != 0){

            String nome = JOptionPane.showInputDialog("Qual o seu nome?", "Digite seu nome aqui.");
            usuario.setNome(nome);
            //JOptionPane.showMessageDialog(null, "Nome eh: " + usuario.getNome());
            int ano = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a sua data de nascimento (Ano)", "ANO"));
            int mes = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a sua data de nascimento (Mês)", "MÊS"));
            int dia = Integer.parseInt(JOptionPane.showInputDialog
                    ("Qual a sua data de nascimento (Dia)", "DIA"));
            LocalDate data = LocalDate.of(ano, mes, dia);
            usuarios.add(new Usuario(nome, data));
            opc = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Cadastrar outro usuário" + "\n" + "0 - Voltar"));
        }


            cadastraP1.mostraUsuarios();
            for(Usuario u : usuarios){
                System.out.println("U:" + u);
            }




        JOptionPane.showMessageDialog(null,"GREAT job");
        System.exit(0);

        //JOptionPane.showMessageDialog(null, "Opcao eh: " + opc);











//        int ano =0;
//        int mes = 0;
//        int dia = 0;
//
//        LocalDate data = LocalDate.now();
//
//        LocalDate data2 = LocalDate.of(1999, 3, 25);
//        LocalDate data3 = LocalDate.of(2002, 4, 30);
//
//
//        Usuario p = new Usuario("PEdro", data2);
//        Usuario p2 = new Usuario("Maria", data3);
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Informe data nasc: (ano)");
//        ano = scanner.nextInt();
//        System.out.println("Informe data nasc: (mes)");
//        mes = scanner.nextInt();
//        System.out.println("Informe data nasc: (dia)");
//        dia = scanner.nextInt();
//        System.out.println("Ano: " + ano + ", Mes: " + mes + ", Dia: " + dia);
//        LocalDate data5 = LocalDate.of(ano, mes, dia);
//        Usuario p5 = new Usuario("Tuta", data5);
//        System.out.println("Tuta: " + p5);
//
//        cadastraUsuario cadastroUser = new cadastraUsuario();
//        System.out.println("Informe data nasc: (ano, mes, dia)");
//        cadastroUser.addDtNasc(scanner.nextInt(),scanner.nextInt(), scanner.nextInt());
//        System.out.println(cadastroUser.getDtNasc());
//        cadastroUser.addUsuario(p);
//        cadastroUser.addUsuario(p2);
//        cadastroUser.mostraUsuarios();
//
//        for (Usuario usuario: usuarios) {
//            System.out.println("Usuarios cadastrados:" + usuario);
//        }

//
//        List<Double> lst = new ArrayList(Arrays.asList(3.5, 5.0, 4.2, 2.0, 3.0, 2.0, 1.2, 3.0)); //.asList é um método estático. que chamo pelo método da classe
//
//        Collections.addAll(lst, 6.0, 6.0, 2.1, 3.0, 8.0);
//        System.out.println("Lista: " + lst);
//        //
//        Collections.sort(lst);
//        System.out.println("Lista Sort: " + lst);
//
//        num = Double.parseDouble(JOptionPane.showInputDialog("Digite 1 para cadastrar usuários ou 0 para sair ! "));
//
//        double in = Collections.binarySearch(lst, num);
//        if(in >= 0.0)JOptionPane.showMessageDialog(null, "Existe");
//        else JOptionPane.showMessageDialog(null, "Numero não existe");
    }


}
