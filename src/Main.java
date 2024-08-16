//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        String pageTitleFormat="TitleName";

        switch (pageTitleFormat)
        {
            case "TitleName":
                System.out.println("Hello and welcome!");


            case "NameTitle":
                System.out.println("Hello and welcome! 1");


            case "Title":
                System.out.println("Hello and welcome!");


            default:
                System.out.println("Hello and welcome!");

        }

    }
}