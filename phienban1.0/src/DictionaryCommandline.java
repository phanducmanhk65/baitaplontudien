import java.util.Scanner;

public class DictionaryCommandline {
   public void showAllWords(Dictionary t) {
       System.out.println("No    |English    |Vietnamese");
       int number = 0;
       Scanner sc = new Scanner(System.in);
       for(int i = 0;i < t.list.size();i++)
       {
           System.out.println(i+1 +"    |"+ t.list.elementAt(i).getWord_target()+"      |"+ t.list.elementAt(i).getWord_explain());

       }
   }
   public void dictionaryBasic() {
       DictionaryManagement a = new DictionaryManagement();
       DictionaryCommandline b = new DictionaryCommandline();
       Dictionary c =a.insertFromCommandline();
       b.showAllWords(c);
   }
}

