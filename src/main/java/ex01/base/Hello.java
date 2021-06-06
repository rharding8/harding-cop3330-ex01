package ex01.base;

import java.util.Scanner;

public class Hello {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    Hello greeting = new Hello();
    String name = greeting.input();
    System.out.println(greeting.output(name));
  }

  public String input() {
    System.out.print("What is your name? ");
    return input.nextLine();
  }

  public String output(String name) {
    return String.format("Hello, %s, nice to meet you!", name);
  }
}
