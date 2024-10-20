/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hekimcanaktas
 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bir yıl giriniz");
        Scanner scanner = new Scanner(System.in);
        int yil = scanner.nextInt();
        
        if((yil%4==0 && yil%100 !=0) || yil%400 ==0){
            System.out.println("Artık yıldır !");
        }
        
        else
            System.out.println("Artık yıl değildir !!");
    }
}
