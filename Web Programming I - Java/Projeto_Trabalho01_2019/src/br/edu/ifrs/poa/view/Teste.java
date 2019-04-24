package br.edu.ifrs.poa.view;

import br.edu.ifrs.poa.pessoa.Pessoa;
import br.edu.ifrs.poa.pessoa.Usuario;

import javax.swing.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.*;

public class Teste {

    public static void main(String[] args) {
        LocalDate data = LocalDate.now();

        LocalDate data2 = LocalDate.of(1999, 3, 25);
        LocalDate data3 = LocalDate.of(2002, 4, 30);


        Usuario p = new Usuario("PEdro", data2);
        Usuario p2 = new Usuario("Maria", data3);

        Scanner scanner = new Scanner(System.in);
        int opc=0;
        cadastraUsuario cadastroUser = new cadastraUsuario();



        opc = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para cadastrar usuários ou 0 para sair ! "));
        while(opc != 0) {
            JOptionPane.showMessageDialog(null, "Bem vindo ao sistema de cadastros de usuários");
            JOptionPane.showInputDialog(null, "Digite o nome do usuário");
            String r = scanner.nextLine();
            JOptionPane.showMessageDialog(null, "Nome: " + r);
            JOptionPane.showInputDialog(null, "Digite a data de nasicmento do usuário yyyy, mm, dd");
            LocalDate data4 = LocalDate.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
            p.setDataNascimento(data4);
            cadastroUser.addUsuario(p);
            JOptionPane.showMessageDialog(null, "Digite 1 para cadastrar outro usuário ou 0 para sair !");
            opc = scanner.nextInt();

        }

        cadastroUser.mostraUsuarios();
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
