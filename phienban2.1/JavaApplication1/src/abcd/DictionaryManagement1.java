/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abcd;

/**
 *
 * @author HP
 */

import java.io.*;
import java.util.Scanner;
public class DictionaryManagement1 {
    
    Dictionary1 f = new Dictionary1();
    // Tạo hàm insertFromCommandline để trả về 1 dictionary chứa các từ dã thêm vào
    public Dictionary1 insertFromCommandline() throws FileNotFoundException {

        Dictionary1 d = new Dictionary1();
        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap vao so luong tu vung");
        int number = sc.nextInt();
        while (i < number) {
            Word1 newword = new Word1();
            System.out.println("Nhap tu: ");
            Scanner scann = new Scanner(System.in);
            newword.setWord_target(scann.nextLine());
            System.out.println("Nhap nghia: ");
            newword.setWord_explain(scann.nextLine());
           
            i++;
        }
        return d;
    }


    //Hàm lấy dữ liệu từ file text từ điển
    public void insertFromFile() throws FileNotFoundException {
        File fil = new File("as.txt");
        Scanner sc = new Scanner(fil);
        while (sc.hasNext()) {
            //String str = sc.nextLine();
            //Scanner a = new Scanner(str);
            Word1 b = new Word1();
            b.setWord_target(sc.nextLine());
            b.setWord_explain(sc.nextLine());
            f.list.add(b);
        }

    }

    //Hàm tìm kiếm từ
    public void dictionaryLookup() throws IOException {
        System.out.println("Nhap tu can tra");
        Scanner s = new Scanner(System.in);
        String x = s.nextLine();
        for (Word1 i : f.list)
        {
            if(i.getWord_target().equals(x)) {
                System.out.println(i.getWord_explain());
            }
            }
        }
        public void addword() throws IOException {
        System.out.println("Hay nhap tu can them vao tu dien");
        Scanner sc = new Scanner(System.in);
         String str = sc.nextLine();

               System.out.println("Nhap nghia cua tu");

                String meaning = sc.nextLine();
                Word1 n = new Word1();
                n.setWord_target(str);
                n.setWord_explain(meaning);
                f.list.add(n);

            }



        public void deleteword() throws IOException{
          System.out.println("Nhap tu muon xoa");
          Scanner sc = new Scanner(System.in);
          String wordremove = sc.nextLine();
          boolean isindictionary = false;
          for( int i = 0;i<f.list.size();i++ )
          {
              if (f.list.elementAt(i).getWord_target().equals(wordremove)) {
                  f.list.removeElementAt(i);
                  isindictionary = true;
              }
          }
              if(!isindictionary) {
                  System.out.println("Tu dien khong ton tai tu nay");

          }
        }
        public void editword() throws IOException{
            System.out.println("Nhap tu muon sua");
            Scanner sc = new Scanner(System.in);
            String wordedit = sc.nextLine();
            boolean isindictionary = false;
            for( Word1 i : f.list )
            {
                if (i.getWord_target().equals(wordedit)) {
                    System.out.println("Nhap tu sua");
                    Scanner edit = new Scanner(System.in);
                    String target = edit.nextLine();

                    System.out.println("NHap nghia tu can sua");
                    String meaning = edit.nextLine();
                    i.setWord_target(target);
                    i.setWord_explain(meaning);
                    isindictionary = true;
                }

            }
            if(!isindictionary) {
                System.out.println("Tu dien khong ton tai tu nay");
            }

        }
        public void dictionaryExportToFile() throws IOException{

               FileOutputStream fout = new FileOutputStream("as.txt");
               try(BufferedOutputStream bout = new BufferedOutputStream(fout)) {
               for(Word1 i : f.list) {
                   String line = i.getWord_target()+"\n" + i.getWord_explain();
                   bout.write(line.getBytes());
                   bout.write(System.lineSeparator().getBytes()) ;
               }
           }

        }
}
