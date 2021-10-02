import java.util.Scanner;

public class DictionaryManagement {
    public Dictionary insertFromCommandline() {

        Dictionary d = new Dictionary();
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap vao so luong tu vung");
        int number = sc.nextInt();
        while (i < number)
        {
             Word newword = new Word();
        System.out.println("Nhap tu: ");
        Scanner scann = new Scanner(System.in);
        newword.setWord_target(scann.nextLine());
        System.out.println("Nhap nghia: ");
        newword.setWord_explain(scann.nextLine());
            d.list.add(newword);
            i++;
        }
        return d;
    }
}

