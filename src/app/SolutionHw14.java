package app;

import app.printers.ConsolePrinter;
import app.printers.Printer;

public class SolutionHw14 {
    public static void main(String[] args) {
        Printer printer = new ConsolePrinter();

        ConsolePrinter.Message message1 = new ConsolePrinter.Message("Привіт всім!", "Ірина");
        printer.print(message1);

        ConsolePrinter.Message message2 = new ConsolePrinter.Message("Анонімне повідомлення", null);
        printer.print(message2);

        ConsolePrinter.Message emptyMessage = new ConsolePrinter.Message(null, null);
        printer.print(emptyMessage);
    }
}