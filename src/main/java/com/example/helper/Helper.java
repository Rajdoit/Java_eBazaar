package com.example.helper;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.example.entity.EbazaarReportsData;
import com.example.entity.Product;

public class Helper {

	// check that file is of excel type or not
	public static boolean checkExcelFormat(MultipartFile file) {

		String contentType = file.getContentType();

		if (contentType.equals("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet")) {
			return true;
		} else {
			return false;
		}

	}

	// convert excel to list of products
	public static List<Product> convertExcelToListOfProduct(InputStream inputstream) {
		List<Product> list = new ArrayList<>();

		try (XSSFWorkbook workbook = new XSSFWorkbook(inputstream)) {
			XSSFSheet sheet = workbook.getSheet("data");
			int rowNumber = 0;
			Iterator<Row> iterator = sheet.iterator();

			while (iterator.hasNext()) {
				Row row = iterator.next();

				if (rowNumber == 0) {
					rowNumber++;
					continue;
				}

				Iterator<Cell> cells = row.iterator();
				int cid = 0;
				Product p = new Product();

				while (cells.hasNext()) {
					Cell cell = cells.next();

					Runnable[] actions = new Runnable[] {
			                () -> p.setProductId((int) cell.getNumericCellValue()),
			                () -> p.setProductName(cell.getStringCellValue()),
			                () -> p.setProductDesc(cell.getStringCellValue()),
			                () -> p.setProductPrice(cell.getNumericCellValue()),
			                // Add more actions if needed
			            };
					
					// Use a for loop instead of the switch statement
	                for (int i = 0; i < actions.length; i++) {
	                    if (cid == i) {
	                        actions[i].run();
	                        break;
	                    }
	                }
//					switch (cid) {
//					case 0:
//						p.setProductId((int) cell.getNumericCellValue());
//						break;
//					case 1:
//						p.setProductName(cell.getStringCellValue());
//						break;
//					case 2:
//						p.setProductDesc(cell.getStringCellValue());
//						break;
//					case 3:
//						p.setProductPrice(cell.getNumericCellValue());
//						break;
//					default:
//						break;
//					}
					cid++;
				}
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	// ##############################################

	// convert excel to list of eBazaarReportData
	public static List<EbazaarReportsData> convertExcelToList(InputStream inputstream) {
		List<EbazaarReportsData> list = new ArrayList<>();
		

		try (XSSFWorkbook workbook = new XSSFWorkbook(inputstream)) {
			XSSFSheet sheet = workbook.getSheet("Ebazaar Reports Data");
			
			int rowNumber = 0;
			Iterator<Row> rowIterator = sheet.iterator();

			while (rowIterator.hasNext()) {
				Row row = rowIterator.next(); // Ek row nikali hai

				if (rowNumber == 0) {
					rowNumber++;
					continue;
				}
				
				int cellNumber = 0;
				EbazaarReportsData p = new EbazaarReportsData();
				Iterator<Cell> cellIterator = row.iterator();
				
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next(); // Ek cell nikali hai
					
					// Define an array to store actions corresponding to each case
					Runnable[] actions = new Runnable[] { 
							() -> p.setSL_No((int) cell.getNumericCellValue()),
							() -> p.setOREDER_NO(cell.getStringCellValue()),
							() -> p.setORDER_DETAIL_NO((int) cell.getNumericCellValue()),
							() -> p.setEBAZAAR_REQ_ID_PRN(cell.getStringCellValue()),
							() -> p.setPAYMENT_STATUS(cell.getStringCellValue()),
							() -> p.setSELLER_NAME(cell.getStringCellValue()),
							() -> p.setSELLER_GSTNUMBER(cell.getStringCellValue()),
							() -> p.setPRODUCT_NAME(cell.getStringCellValue()),
							() -> p.setORDER_TYPE(cell.getStringCellValue()),
							
							() -> p.setORDERED_QTY((Double) cell.getNumericCellValue()),
							() -> p.setPACKET_SIZE((Double) cell.getNumericCellValue()),
							() -> p.setNET_QUANTITY((Double) cell.getNumericCellValue()),
							() -> p.setSELLING_PRICE((Double) cell.getNumericCellValue()),
							() -> p.setPAYABLE_AMOUNT((Double) cell.getNumericCellValue()),
							() -> p.setTAXABLE_VALUE((Double) cell.getNumericCellValue()),
							() -> p.setGST_RATE((Double) cell.getNumericCellValue()),
							() -> p.setCGST((Double) cell.getNumericCellValue()),
							() -> p.setSGST((Double) cell.getNumericCellValue()),
							() -> p.setIGST((Double) cell.getNumericCellValue()),
							
							() -> p.setBUYER_STATE(cell.getStringCellValue()),
							() -> p.setORDER_DATE(cell.getStringCellValue()),
							() -> p.setORDER_STATUS(cell.getStringCellValue()),
							() -> p.setSTATUS_DATE(cell.getStringCellValue()),
							() -> p.setCANCEL_DATE(cell.getStringCellValue()),
							() -> p.setDELIVERY_DATE(cell.getStringCellValue()),
							() -> p.setRETURN_APPROVE_DATE(cell.getStringCellValue()),
							
							() -> p.setRATE_OF_EBZ_COMM_ON_CITIZEN((Double) cell.getNumericCellValue()),
							() -> p.setUNIT_OF_EBZ_COMM_ON_CITIZEN(cell.getStringCellValue()),
							() -> p.setEBZ_COMM_ON_CITIZEN((Double) cell.getNumericCellValue()),
							() -> p.setACTUAL_SHIPPING_CHARGED_TO_CITIZEN((Double) cell.getNumericCellValue()),
							() -> p.setTOTAL_AMT_CHARGED_TO_CITIZEN((Double) cell.getNumericCellValue()),
							() -> p.setRATE_OF_EBZ_COMM_ON_SELLER((Double) cell.getNumericCellValue()),
							() -> p.setUNIT_OF_EBZ_COMM_ON_SELLER(cell.getStringCellValue()),
							() -> p.setEBZ_COMM_ON_SELLER((Double) cell.getNumericCellValue()),
							
							() -> p.setSHIPPING_ON_SELLER((Double) cell.getNumericCellValue()),
							() -> p.setTOTAL_COMM((Double) cell.getNumericCellValue()),
							() -> p.setTOTAL_SHIPPING((Double) cell.getNumericCellValue()),
							() -> p.setTOTAL_DEDUCTION((Double) cell.getNumericCellValue()),
							() -> p.setTDS((Double) cell.getNumericCellValue()),
							() -> p.setTCS((Double) cell.getNumericCellValue()),
							() -> p.setNET_DEDUCTION((Double) cell.getNumericCellValue()),
							() -> p.setCOMMISSION_FLAG(cell.getStringCellValue()),
							() -> p.setPAYMENT_FLAG(cell.getStringCellValue()),
							() -> p.setRETAILER_GSTNUMBER(cell.getStringCellValue()),
							() -> p.setEMITRADIRECTPAID((int) cell.getNumericCellValue()),
							};
					
					
					// Use a for loop instead of the switch statement
	                for (int i = 0; i < actions.length; i++) {
	                    if (cellNumber == i) {
	                        actions[i].run();
	                        break;
	                    }
	                }
	                cellNumber++;
				}
				list.add(p);
			}
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	

	// ##############################################
}
