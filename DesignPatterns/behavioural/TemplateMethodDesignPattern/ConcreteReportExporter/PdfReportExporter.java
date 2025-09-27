package DesignPatterns.behavioural.TemplateMethodDesignPattern.ConcreteReportExporter;

import DesignPatterns.behavioural.TemplateMethodDesignPattern.ReportExporter;
import DesignPatterns.behavioural.TemplateMethodDesignPattern.ReportData;

import java.util.Map;

public class PdfReportExporter extends ReportExporter {
    //prepareData() not overridden - default will be used
    //openFile() not overridden - default will be used

    @Override
    protected void writeHeader(ReportData reportData) {
        // use library for creating PDF header
        System.out.println("PDF : Writing header : " + String.join(",", reportData.getHeaders()));
    }

    @Override
    protected void writeDataRows(ReportData reportData) {
        System.out.println("PDF : Writing data rows ...");
        for(Map<String, Object> row : reportData.getRows()) {
            System.out.println("PDF : " + row.values());
        }
        // use library for creating PDF data row
    }

    // writeFooter() not overridden - default will be used
    // closeFile() not overridden - default will be used
}
