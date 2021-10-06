import java.io.File;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DictionaryManagement {
   // Tạo hàm insertFromCommandline để trả về 1 dictionary chứa các từ dã thêm vào
    public Dictionary insertFromCommandline() throws FileNotFoundException {

        Dictionary d = new Dictionary();
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap vao so luong tu vung");
        int number = sc.nextInt();
        while (i < number) {
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
    Dictionary f = new Dictionary();

    //Hàm lấy dữ liệu từ file text từ điển
    public void insertFromFile() throws FileNotFoundException {
        File fil = new File("tud.txt");
        Scanner sc = new Scanner(fil);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            Scanner a = new Scanner(str);
            Word b = new Word();
            b.setWord_target(a.next());
            b.setWord_explain(a.next());
            f.list.add(b);
        }

    }
    public void sf() {
        for(int i = 0;i<f.list.size();i++)
            System.out.println(f.list.elementAt(i).getWord_target());
    }
    //Hàm tìm kiếm từ
    public void dictionaryLookup() {
        System.out.println("Nhap tu can tra");
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        for (Word i : f.list)
        {
            if(i.getWord_target().equals(x)) {
                System.out.println(i.getWord_explain());
            }
            }
        }
    }



