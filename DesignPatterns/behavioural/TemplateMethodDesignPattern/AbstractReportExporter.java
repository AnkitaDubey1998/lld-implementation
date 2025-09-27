package DesignPatterns.behavioural.TemplateMethodDesignPattern;

public abstract class AbstractReportExporter {

    // template method
    public final void exportReport(ReportData reportData, String filePath) {
        prepareData(reportData);
        openFile(filePath);
        writeHeader(reportData);
        writeDataRows(reportData);
        writeFooter(reportData);
        closeFile(filePath);
        System.out.println("Report exported to " + filePath);
    }

    // Hook method – optional for subclasses to override
    protected void prepareData(ReportData reportData) {
        System.out.println("Preparing report data...");
    }

    // Hook method
    protected void openFile(String filePath) {
        System.out.println("Opening file : " + filePath);
    }

    protected abstract void writeHeader(ReportData reportData);

    protected abstract void writeDataRows(ReportData reportData);

    // Hook method
    protected void writeFooter(ReportData reportData) {
        System.out.println("Writing footer...");
    }

    // Hook method
    protected void closeFile(String filePath) {
        System.out.println("Closing file : " + filePath);
    }
}
