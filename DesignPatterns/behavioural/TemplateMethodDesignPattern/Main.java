package DesignPatterns.behavioural.TemplateMethodDesignPattern;

import DesignPatterns.behavioural.TemplateMethodDesignPattern.ConcreteReportExporter.CsvReportExporter;
import DesignPatterns.behavioural.TemplateMethodDesignPattern.ConcreteReportExporter.PdfReportExporter;

public class Main {
    public static void main(String[] args) {
        ReportData reportData = new ReportData();

        AbstractReportExporter csvExporter = new CsvReportExporter();
        csvExporter.exportReport(reportData, "sales_report_csv");

        System.out.println();

        AbstractReportExporter pdfExporter = new PdfReportExporter();
        pdfExporter.exportReport(reportData, "financial_summary_pdf");
    }
}
