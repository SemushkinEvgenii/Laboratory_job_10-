package com.company;
import java.util.Scanner;
import java.io.*;

public class lab10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a;
        System.out.println("enter your ip address. numbers must be written in dots");
        String input = in.nextLine();
        boolean result=input.matches("([0-9]\\.|[0-9][0-9]\\.|1[0-9][0-9]\\.|2[0-4][0-9]\\.|25[0-5]\\.){3}([0-9]|[0-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])");
        if(result) {
            a = "you entered the correct ip address";
            System.out.println("you entered the correct ip address");
        }
        else{
            a = "you entered an incorrect ip address! try again.";
            System.out.println("you entered an incorrect ip address! try again.");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("IP.txt"))){
            bw.write(input);
            bw.write(a);
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        String g = in.nextLine();
        if (g.equals("log")){
            try(BufferedReader br = new BufferedReader(new FileReader("IP.txt"))){
                String I;
                while ((I = br.readLine())!= null){
                    System.out.println(I);
                }}
            catch (IOException ex){
                System.out.println(ex.getMessage());
            }}}}