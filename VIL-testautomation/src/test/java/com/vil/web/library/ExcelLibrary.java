/***********************************************************************
* @author 			:		Rana Thakur
* @description		: 		This Class all application independent generic methods to read and write excel sheet 
*/

package com.vil.web.library;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ExcelLibrary {
	
	
	
	/*
	 * @author:Rana Thakur
	 * 
	 * Description: This method is to get total row count based on the file and sheet name.
	 */
	public static int getExcelRowCount(String sPath, String sSheet) {
		int iRowNum = 0;
		try {

			FileInputStream fis = new FileInputStream(sPath);
			Workbook wb = (Workbook) WorkbookFactory.create(fis);
			Sheet sht = wb.getSheet(sSheet);
			iRowNum =  sht.getLastRowNum();
			//System.out.println(sht.getLastRowNum());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return iRowNum;
	}
	
	/*
	 * @author:Rana Thakur
	 * 
	 * Description: This method is to get total cell data based on file , sheet name and row/test case id
	 */
	public static String getExcelData(String sPath, String sSheet, int rowNo, int cellNo) {
		int iRowNum = 0;
		String data = null;
		try {

			FileInputStream fis = new FileInputStream(sPath);
			Workbook wb = (Workbook) WorkbookFactory.create(fis);
			Sheet sht = wb.getSheet(sSheet);
			iRowNum = sht.getLastRowNum();
			if(rowNo<=iRowNum)
			{
				data = sht.getRow(rowNo).getCell(cellNo).getStringCellValue();
			}
			else
			{
				System.out.println("Please provide the valid Row Count");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	
	}
	
	/*
	 * @author:Rana Thakur
	 * 
	 * Description: This method is to write data based on file , sheet and row/test-case-id and cell number
	 */
	public static void writeExcelData(String sPath, String sSheet, int rowNo, int cellNo, String value) {
		try {
			FileInputStream fis = new FileInputStream(sPath);
			Workbook wb = (Workbook) WorkbookFactory.create(fis);
			Sheet sht = wb.getSheet(sSheet);
			Row row=null;
			 if(sht.getRow(rowNo) != null) {
			        //row = sh.getRow(i);
				 sht.getRow(rowNo).createCell(cellNo).setCellValue(value);
			        }
			    else {
			       row = sht.createRow(rowNo);
			       row.createCell(cellNo).setCellValue(value);
			    }
			
			FileOutputStream fos = new FileOutputStream(sPath);
			wb.write(fos);
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
	
	/*
	 * @author:Rana Thakur
	 * 
	 * Description: This method is to get total cell count from particular row/testcaseid
	 */
	public static int getExcelCellCount(String sPath, String sSheet, int rowNo) {
		int iRowNum = 0;
		int cellCount = 0;
		
		try {
			
			
			FileInputStream fis = new FileInputStream(sPath);
			Workbook wb = (Workbook) WorkbookFactory.create(fis);
			Sheet sht = wb.getSheet(sSheet);
			iRowNum = sht.getLastRowNum();
			if(rowNo<=iRowNum)
			{
				cellCount = sht.getRow(rowNo).getLastCellNum();
				//System.out.println(cellCount);
			}
			else
			{
				System.out.println("Please provide the valid Row Count");
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cellCount;
	
	}

}
