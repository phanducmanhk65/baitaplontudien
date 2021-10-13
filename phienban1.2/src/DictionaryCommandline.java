import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DictionaryCommandline {
    // in ra tất cả các từ và nghĩa của nó có trong 1 cái dictionary
    public void showAllWords(Dictionary t) {
        System.out.println("No    |English    |Vietnamese");
        int number = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < t.list.size();i++)
        {
            System.out.println(i+1 +"    |"+ t.list.elementAt(i).getWord_target()+"      |"+ t.list.elementAt(i).getWord_explain());

        }
    }
    //Hàm gọi insertFromCommandline, showAllWords
    public void dictionaryBasic() throws FileNotFoundException {
        DictionaryManagement a = new DictionaryManagement();
        DictionaryCommandline b = new DictionaryCommandline();
        Dictionary c =a.insertFromCommandline();
        b.showAllWords(c);
    }
    //Hàm gọi các hàm insertFromFile, showAllWords, dictionaryLookup
    public void dictionaryAdvance() throws IOException {
        DictionaryManagement a = new DictionaryManagement();
        DictionaryCommandline b = new DictionaryCommandline();
        a.insertFromFile();
        b.showAllWords(a.f);
        a.dictionaryLookup();
        a.addword();
        a.deleteword();
        a.editword();
        b.showAllWords(a.f);
        a.dictionaryExportToFile();
    }
}

