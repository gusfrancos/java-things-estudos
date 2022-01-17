package br.com.estudos.VCRUD.test;

import java.util.Scanner;

import br.com.estudos.VCRUD.service.ProducerService;

public class CrudTest01 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int op;
        while (true) {
            producerMenu();
            op = Integer.parseInt(scanner.nextLine());
            if (op == 0) break;
            ProducerService.buildMenu(op);
        }
    }

    private static void producerMenu() {
        System.out.println("Type the number of your operation");
        System.out.println("1. Search for producer");
        System.out.println("0. Exit");
    }
}
