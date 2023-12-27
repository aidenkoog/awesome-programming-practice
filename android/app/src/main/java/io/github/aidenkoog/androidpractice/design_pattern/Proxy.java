package io.github.aidenkoog.androidpractice.design_pattern;

/*
 * 객체에 대한 접근을 제어하기 위해 대리자를 둠
 */
public class Proxy {
}

interface Printable {
    String getPrinterName();
}

class PrinterProxy {

}

class Printer {
    String name;

    public Printer() {

    }

    public Printer(String name) {
        this.name = name;
    }
}
