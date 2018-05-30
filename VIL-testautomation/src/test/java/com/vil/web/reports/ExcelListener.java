package com.vil.web.reports;

import java.awt.Color;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.ClientAnchor;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFClientAnchor;
import org.apache.poi.xssf.usermodel.XSSFDrawing;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFPicture;
import org.apache.poi.xssf.usermodel.XSSFPrintSetup;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.testng.ITestNGMethod;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class ExcelListener
{
  public ExcelListener() {}
  
  private static FileOutputStream fos = null;
  private static XSSFWorkbook workbook = null;
  private static XSSFSheet sheet = null;
  private static XSSFRow row = null;
  private static XSSFCell cell = null;
  private static XSSFFont font = null;
  private static XSSFFont headerFont = null;
  private static XSSFCellStyle style = null;
  private static XSSFCellStyle headerStyle = null;
  private static String summarySheetName = "Summary";
  private static int colCount = 0;
  
  static int count = 1;
  
  public static void generateReport(String xlFileName) throws Exception {
	  String path = System.getProperty("user.dir") + "/test-output/";
	    File xmlFile = new File(path + "testng-results.xml");
	    
	    DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
	    DocumentBuilder build = fact.newDocumentBuilder();
	    Document doc = build.parse(xmlFile);
	    doc.getDocumentElement().normalize();
	    
	    workbook = new XSSFWorkbook();
	    font = workbook.createFont();
	    headerFont = workbook.createFont();
	    style = workbook.createCellStyle();
	    headerStyle = workbook.createCellStyle();
	    
	    NodeList test_results = doc.getElementsByTagName("testng-results");
	    Node test_results_node = test_results.item(0);
	    String total = ((Element)test_results_node).getAttribute("total");
	    String passed = ((Element)test_results_node).getAttribute("passed");
	    String failed = ((Element)test_results_node).getAttribute("failed");
	    String skipped = ((Element)test_results_node).getAttribute("skipped");
	    
	    NodeList test_suite = doc.getElementsByTagName("suite");
	    Node test_suite_node = test_suite.item(0);
	    
	    String test_suite_startTime = ((Element)test_suite_node).getAttribute("started-at");
	    test_suite_startTime = test_suite_startTime.replace("T", " ").replace("Z", "");
	    String test_suite_endTime = ((Element)test_suite_node).getAttribute("finished-at");
	    test_suite_endTime = test_suite_endTime.replace("T", " ").replace("Z", "");
	    String test_suite_duration = ((Element)test_suite_node).getAttribute("duration-ms");
	    Long milliseconds = MyExtentListners.lTotalExecutionTime;
	    int seconds = (int)(milliseconds.longValue() / 1000L) % 60;
	    int minutes = (int)(milliseconds.longValue() / 60000L % 60L);
	    int hours = (int)(milliseconds.longValue() / 3600000L % 24L);
	    System.out.format("%dHrs:%dMin:%dSec \n", new Object[] { Integer.valueOf(hours), Integer.valueOf(minutes), Integer.valueOf(seconds) });
	    
	    addSheet(summarySheetName);
	    
	    setCellHeaderData(summarySheetName, 0, 0, "Category", Short.valueOf((short)13));
	    setCellHeaderData(summarySheetName, 1, 0, "Count", Short.valueOf((short)13));
	    
	    setCellHeaderData(summarySheetName, 0, 0, "Category", Short.valueOf((short)13));
	    setCellHeaderData(summarySheetName, 1, 0, "Count", Short.valueOf((short)13));
	    
	    setCellData(summarySheetName, 0, 1, "Passed", Short.valueOf((short)9));
	    setCellData(summarySheetName, 1, 1, MyExtentListners.iPassCount + "", Short.valueOf((short)9));
	    
	    setCellData(summarySheetName, 0, 2, "Failed", Short.valueOf((short)9));
	    setCellData(summarySheetName, 1, 2, MyExtentListners.iFailCount + "", Short.valueOf((short)9));
	    
	    setCellData(summarySheetName, 0, 3, "Skipped", Short.valueOf((short)9));
	    setCellData(summarySheetName, 1, 3, MyExtentListners.iSkippedCount + "", Short.valueOf((short)9));
	    
	    
	    setCellHeaderData(summarySheetName, 0, 4, "Total", Short.valueOf((short)49));
	    setCellHeaderData(summarySheetName, 1, 4, MyExtentListners.iTotal_Executed + "", Short.valueOf((short)49));
	    
	    setCellData(summarySheetName, 0, 5, "Start Time", Short.valueOf((short)9));
	    setCellData(summarySheetName, 1, 5, MyExtentListners.sStartTime, Short.valueOf((short)9));
	    
	    setCellData(summarySheetName, 0, 6, "End Time", Short.valueOf((short)9));
	    setCellData(summarySheetName, 1, 6, MyExtentListners.sEndTime, Short.valueOf((short)9));
	    
	    setCellData(summarySheetName, 0, 7, "Duration", Short.valueOf((short)9));
	    setCellData(summarySheetName, 1, 7, String.format("%01dHrs:%2dMin:%02dSec", new Object[] { Integer.valueOf(hours), Integer.valueOf(minutes), Integer.valueOf(seconds) }), 
	      Short.valueOf((short)9));
    
    colCount = getColumnCount(summarySheetName);
    for (int colPosition = 0; colPosition < colCount; colPosition++) {
      sheet.autoSizeColumn((short)colPosition);
    }
    




    DefaultPieDataset my_pie_chart_data = new DefaultPieDataset();
    
    my_pie_chart_data.setValue("Passed", Integer.parseInt(passed));
    my_pie_chart_data.setValue("Failed", Integer.parseInt(failed));
    my_pie_chart_data.setValue("Skipped", Integer.parseInt(skipped));
    


    JFreeChart myPieChart = ChartFactory.createPieChart("Execution Summary", my_pie_chart_data, true, true, false);
    
    PiePlot plot = (PiePlot)myPieChart.getPlot();
    plot.setSectionPaint(1, new Color(255, 0, 0));
    plot.setSectionPaint(0, new Color(0, 128, 0));
    plot.setSectionPaint(2, new Color(255, 255, 0));
    
    int width = 270;
    int height = 300;
    float quality = 5.0F;
    ByteArrayOutputStream chart_out = new ByteArrayOutputStream();
    ChartUtilities.writeChartAsJPEG(chart_out, quality, myPieChart, width, height);
    int my_picture_id = workbook.addPicture(chart_out.toByteArray(), 5);
    chart_out.close();
    XSSFDrawing drawing = sheet.createDrawingPatriarch();
    ClientAnchor my_anchor = new XSSFClientAnchor();
    my_anchor.setCol1(2);
    my_anchor.setRow1(0);
    XSSFPicture my_picture = drawing.createPicture(my_anchor, my_picture_id);
    my_picture.resize();
    
    NodeList test_list = doc.getElementsByTagName("test");
    for (int i = 0; i < test_list.getLength(); i++) {
      int r = 19;
      Node test_node = test_list.item(i);
      String test_name = ((Element)test_node).getAttribute("name");
      


      test_name = "Summary";
      setCellHeaderData(test_name, 0, 19, "Sl.No", Short.valueOf((short)13));
      setCellHeaderData(test_name, 1, 19, "TestCase Name", Short.valueOf((short)13));
      setCellHeaderData(test_name, 2, 19, "Status", Short.valueOf((short)13));
      setCellHeaderData(test_name, 3, 19, "Start Time", Short.valueOf((short)13));
      setCellHeaderData(test_name, 4, 19, "End Time", Short.valueOf((short)13));
      setCellHeaderData(test_name, 5, 19, "Duration", Short.valueOf((short)13));
      

      NodeList class_list = ((Element)test_node).getElementsByTagName("class");
      for (int j = 0; j < class_list.getLength(); j++) {
        Node class_node = class_list.item(j);
        String class_name = ((Element)class_node).getAttribute("name");
        
        NodeList test_method_list = ((Element)class_node).getElementsByTagName("test-method");
        
        for (int k = 0; k < test_method_list.getLength(); k++) {
          Node test_method_node = test_method_list.item(k);
          String test_method_name = ((Element)test_method_node).getAttribute("name");
          String test_method_status = ((Element)test_method_node).getAttribute("status");
          String test_method_startTime = ((Element)test_method_node).getAttribute("started-at");
          test_method_startTime = test_method_startTime.substring(test_method_startTime.indexOf("T") + 1, test_method_startTime.indexOf("Z"));
          System.out.println(test_method_startTime);
          




          String test_method_endTime = ((Element)test_method_node).getAttribute("finished-at");
          test_method_endTime = test_method_endTime.substring(test_method_endTime.indexOf("T") + 1, test_method_endTime.indexOf("Z"));
          String test_method_duration = ((Element)test_method_node).getAttribute("duration-ms");
          Long test_milliseconds = Long.valueOf(Long.parseLong(test_method_duration));
          int test_seconds = (int)(test_milliseconds.longValue() / 1000L) % 60;
          int test_minutes = (int)(test_milliseconds.longValue() / 60000L % 60L);
          int test_hours = (int)(test_milliseconds.longValue() / 3600000L % 24L);
          test_method_duration = String.format("%2d:%02d Min", new Object[] { Integer.valueOf(test_minutes), Integer.valueOf(test_seconds) });
          System.out.format(test_method_duration, new Object[0]);
          
          String test_method_isConfig = ((Element)test_method_node).getAttribute("is-config");
          
          if (test_method_isConfig == "") {
            r++;
          }
          
          if (test_method_isConfig == "")
          {

            setCellData(test_name, 0, r, count + "", Short.valueOf((short)9));
            count += 1;
            setCellData(test_name, 1, r, test_method_name, Short.valueOf((short)9));
          }
          if ((test_method_status.equalsIgnoreCase("pass")) && (test_method_isConfig == "")) {
            setCellData(test_name, 2, r, test_method_status, Short.valueOf((short)11));
          }
          String str1;
          if ((test_method_status.equalsIgnoreCase("fail")) && (test_method_isConfig == "")) {
            setCellData(test_name, 2, r, test_method_status, Short.valueOf((short)10));
            
            NodeList exp_list = ((Element)test_method_node).getElementsByTagName("exception");
            for (int a = 0; a < exp_list.getLength(); a++) {
              Node err_node = exp_list.item(a);
              NodeList test_err_list = ((Element)err_node).getElementsByTagName("message");
              for (int b = 0; b < test_err_list.getLength(); b++) {
                Node err_msg_node = test_err_list.item(b);
                str1 = ((Element)err_msg_node).getTextContent().trim();
              }
            }
          }
          

          if ((test_method_status.equalsIgnoreCase("skip")) && (test_method_isConfig == "")) {
            setCellData(test_name, 2, r, test_method_status, Short.valueOf((short)13));
            NodeList exp_list = ((Element)test_method_node).getElementsByTagName("exception");
            
            for (int a = 0; a < exp_list.getLength(); a++) {
              Node err_node = exp_list.item(a);
              NodeList test_err_list = ((Element)err_node).getElementsByTagName("message");
              for (int b = 0; b < test_err_list.getLength(); b++) {
                Node err_msg_node = test_err_list.item(b);
                str1 = ((Element)err_msg_node).getTextContent().trim();
              }
            }
          }
          

          if (test_method_isConfig == "")
          {
            setCellData(test_name, 3, r, test_method_startTime, Short.valueOf((short)9));
            setCellData(test_name, 4, r, test_method_endTime, Short.valueOf((short)9));
            setCellData(test_name, 5, r, test_method_duration, Short.valueOf((short)9));
          }
        }
        colCount = getColumnCount(test_name);
        for (int colPosition = 0; colPosition < colCount; colPosition++) {
          sheet.autoSizeColumn((short)colPosition);
        }
      }
    }
    

    String xlres = xlFileName;
    
    fos = new FileOutputStream(xlres);
    workbook.write(fos);
    workbook.setPrintArea(0, 0, 7, 0, sheet.getLastRowNum());
    sheet.getPrintSetup().setPaperSize((short)6);
    workbook.close();
    fos.close();
    System.out.println("Excel Report Generated");
  }
  
  public static void generateReport(String folderLocation, String xlFileName) throws Exception {
    String path = System.getProperty("user.dir") + "/test-output/";
    File xmlFile = new File(path + "testng-results.xml");
    
    DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
    DocumentBuilder build = fact.newDocumentBuilder();
    Document doc = build.parse(xmlFile);
    doc.getDocumentElement().normalize();
    
    workbook = new XSSFWorkbook();
    font = workbook.createFont();
    headerFont = workbook.createFont();
    style = workbook.createCellStyle();
    headerStyle = workbook.createCellStyle();
    
    NodeList test_results = doc.getElementsByTagName("testng-results");
    Node test_results_node = test_results.item(0);
    String total = ((Element)test_results_node).getAttribute("total");
    String passed = ((Element)test_results_node).getAttribute("passed");
    String failed = ((Element)test_results_node).getAttribute("failed");
    String skipped = ((Element)test_results_node).getAttribute("skipped");
    
    NodeList test_suite = doc.getElementsByTagName("suite");
    Node test_suite_node = test_suite.item(0);
    
    String test_suite_startTime = ((Element)test_suite_node).getAttribute("started-at");
    test_suite_startTime = test_suite_startTime.replace("T", " ").replace("Z", "");
    String test_suite_endTime = ((Element)test_suite_node).getAttribute("finished-at");
    test_suite_endTime = test_suite_endTime.replace("T", " ").replace("Z", "");
    String test_suite_duration = ((Element)test_suite_node).getAttribute("duration-ms");
    Long milliseconds = MyExtentListners.lTotalExecutionTime;
    int seconds = (int)(milliseconds.longValue() / 1000L) % 60;
    int minutes = (int)(milliseconds.longValue() / 60000L % 60L);
    int hours = (int)(milliseconds.longValue() / 3600000L % 24L);
    System.out.format("%dHrs:%dMin:%dSec \n", new Object[] { Integer.valueOf(hours), Integer.valueOf(minutes), Integer.valueOf(seconds) });
    
    addSheet(summarySheetName);
    
    setCellHeaderData(summarySheetName, 0, 0, "Category", Short.valueOf((short)13));
    setCellHeaderData(summarySheetName, 1, 0, "Count", Short.valueOf((short)13));
    
    setCellHeaderData(summarySheetName, 0, 0, "Category", Short.valueOf((short)13));
    setCellHeaderData(summarySheetName, 1, 0, "Count", Short.valueOf((short)13));
    
    setCellData(summarySheetName, 0, 1, "Passed", Short.valueOf((short)9));
    setCellData(summarySheetName, 1, 1, MyExtentListners.iPassCount + "", Short.valueOf((short)9));
    
    setCellData(summarySheetName, 0, 2, "Failed", Short.valueOf((short)9));
    setCellData(summarySheetName, 1, 2, MyExtentListners.iFailCount + "", Short.valueOf((short)9));
    
    setCellData(summarySheetName, 0, 3, "Skipped", Short.valueOf((short)9));
    setCellData(summarySheetName, 1, 3, MyExtentListners.iSkippedCount + "", Short.valueOf((short)9));
    
    
    setCellHeaderData(summarySheetName, 0, 4, "Total", Short.valueOf((short)49));
    setCellHeaderData(summarySheetName, 1, 4, MyExtentListners.iTotal_Executed + "", Short.valueOf((short)49));
    
    setCellData(summarySheetName, 0, 5, "Start Time", Short.valueOf((short)9));
    setCellData(summarySheetName, 1, 5, MyExtentListners.sStartTime, Short.valueOf((short)9));
    
    setCellData(summarySheetName, 0, 6, "End Time", Short.valueOf((short)9));
    setCellData(summarySheetName, 1, 6, MyExtentListners.sEndTime, Short.valueOf((short)9));
    
    setCellData(summarySheetName, 0, 7, "Duration", Short.valueOf((short)9));
    setCellData(summarySheetName, 1, 7, String.format("%01dHrs:%2dMin:%02dSec", new Object[] { Integer.valueOf(hours), Integer.valueOf(minutes), Integer.valueOf(seconds) }), 
      Short.valueOf((short)9));
    
    colCount = getColumnCount(summarySheetName);
    for (int colPosition = 0; colPosition < colCount; colPosition++) {
      sheet.autoSizeColumn((short)colPosition);
    }
    




    DefaultPieDataset my_pie_chart_data = new DefaultPieDataset();
    
    my_pie_chart_data.setValue("Passed", MyExtentListners.iPassCount);
    my_pie_chart_data.setValue("Failed", MyExtentListners.iFailCount);
    my_pie_chart_data.setValue("Skipped", MyExtentListners.iSkippedCount);
    


    JFreeChart myPieChart = ChartFactory.createPieChart("Execution Summary", my_pie_chart_data, true, true, false);
    
    PiePlot plot = (PiePlot)myPieChart.getPlot();
    plot.setSectionPaint(1, new Color(255, 0, 0));
    plot.setSectionPaint(0, new Color(0, 128, 0));
    plot.setSectionPaint(2, new Color(255, 255, 0));
    
    int width = 300;
    int height = 300;
    float quality = 5.0F;
    ByteArrayOutputStream chart_out = new ByteArrayOutputStream();
    ChartUtilities.writeChartAsJPEG(chart_out, quality, myPieChart, width, height);
    int my_picture_id = workbook.addPicture(chart_out.toByteArray(), 5);
    chart_out.close();
    XSSFDrawing drawing = sheet.createDrawingPatriarch();
    ClientAnchor my_anchor = new XSSFClientAnchor();
    my_anchor.setCol1(3);
    my_anchor.setRow1(0);
    XSSFPicture my_picture = drawing.createPicture(my_anchor, my_picture_id);
    my_picture.resize();
    
    fos = new FileOutputStream(folderLocation + "/" + xlFileName);
    workbook.write(fos);
    workbook.close();
    fos.close();
    
    System.out.println("Excel Report Generated");
  }
  
  private static boolean setCellData(String sheetName, int colNumber, int rowNum, String value, Short index) {
    try {
      sheet = workbook.getSheet(sheetName);
      row = sheet.getRow(rowNum);
      if (row == null) {
        row = sheet.createRow(rowNum);
      }
      cell = row.getCell(colNumber);
      if (cell == null) {
        cell = row.createCell(colNumber);
      }
      applyCellStyle(index.shortValue());
      cell.setCellValue(value);
      sheet.autoSizeColumn((short)colNumber);
      

      cell.setCellStyle(style);
    } catch (Exception ex) {
      ex.printStackTrace();
      return false;
    }
    return true;
  }
  
  private static boolean setCellHeaderData(String sheetName, int colNumber, int rowNum, String value, Short index) {
    try {
      sheet = workbook.getSheet(sheetName);
      row = sheet.getRow(rowNum);
      if (row == null) {
        row = sheet.createRow(rowNum);
      }
      cell = row.getCell(colNumber);
      if (cell == null) {
        cell = row.createCell(colNumber);
      }
      applyCellHeaderStyle(index.shortValue());
      cell.setCellValue(value);
    } catch (Exception ex) {
      ex.printStackTrace();
      return false;
    }
    return true;
  }
  
  private static String addSheet(String sheetname)
  {
    sheet = workbook.createSheet(sheetname);
    sheet.setDisplayGridlines(true);
    sheet.setPrintGridlines(true);
    
    return sheetname;
  }
  
  private static void applyCellStyle(short index) {
    style = workbook.createCellStyle();
    
    font.setFontName("Calibri");
    font.setFontHeight(12.0D);
    style.setFont(font);
    

    style.setFillForegroundColor(index);
    style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    style.setBorderBottom(BorderStyle.MEDIUM);
    style.setBorderTop(BorderStyle.MEDIUM);
    style.setBorderRight(BorderStyle.MEDIUM);
    style.setBorderLeft(BorderStyle.MEDIUM);
    cell.setCellStyle(style);
  }
  
  private static void applyCellHeaderStyle(short index) {
    headerStyle = workbook.createCellStyle();
    
    font.setFontName("Calibri");
    headerFont.setFontHeight(14.0D);
    headerFont.setBold(true);
    headerStyle.setFont(headerFont);
    

    headerStyle.setFillForegroundColor(index);
    headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    headerStyle.setBorderBottom(BorderStyle.THICK);
    headerStyle.setBorderTop(BorderStyle.THICK);
    headerStyle.setBorderRight(BorderStyle.THICK);
    headerStyle.setBorderLeft(BorderStyle.THICK);
    cell.setCellStyle(headerStyle);
  }
  
  private static int getColumnCount(String sheetName) {
    sheet = workbook.getSheet(sheetName);
    row = sheet.getRow(0);
    int colCount = row.getLastCellNum();
    return colCount;
  }
}
