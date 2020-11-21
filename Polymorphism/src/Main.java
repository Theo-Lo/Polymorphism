import model.BlackAndWhitePrinter;
import model.ColorPrinter;
import model.CommonPrinter;

public class Main {
    public static void main(String[] args) {
        CommonPrinter blackwhite = new BlackAndWhitePrinter();
        blackwhite.print();
        CommonPrinter color = new ColorPrinter();
        color.print();
    }
}
