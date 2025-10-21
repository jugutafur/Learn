package com.leer.Excel;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@RestController
@RequestMapping("/saludar")
public class HolaMundoController {

    String valorPrice = "8";

    @GetMapping("/hola")
    public String Saludar() {
        return "Saludar Leer Excel 6";
    }

    //leer Excel
    @GetMapping("/excel")
    public String leerExcel(){
        String excelFilePath = "C:\\Users\\HP\\Desktop\\prueba.xlsx";
        int price [] = new int[0];
        int rowCount = 0;

        try{
            FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
            Workbook workbook = WorkbookFactory.create(inputStream);

            //set value
            Sheet sheet = workbook.getSheetAt(0);
            Cell cell2Update = sheet.getRow(0).getCell(2);
            cell2Update.setCellValue(493333333);

            valorPrice = cell2Update.getRow().getCell(1).toString();

            System.out.println("valor xxx = "+valorPrice);
            /*
            Object[][] bookData = {
                    {"The Passionate Programmer", "Chad Fowler", 16},
                    {"Software Craftmanship", "Pete McBreen", 26},
                    {"The Art of Agile Development", "James Shore", 32},
                    {"Continuous Delivery", "Jez Humble", 41},
            };


            rowCount = sheet.getLastRowNum();

            for (Object[] aBook : bookData) {
                Row row = sheet.createRow(++rowCount);

                int columnCount = 0;

                Cell cell = row.createCell(columnCount);
                cell.setCellValue(rowCount);

                for (Object field : aBook) {
                    cell = row.createCell(++columnCount);
                    if (field instanceof String) {
                        cell.setCellValue((String) field);
                    } else if (field instanceof Integer) {
                        cell.setCellValue((Integer) field);
                    }
                }

            }*/

            ScheduledExecutorService scheduler
                    = Executors.newSingleThreadScheduledExecutor();

            Runnable task = new leerExcel2();
            int initialDelay = 1;
            int periodicDelay = 1;
            scheduler.scheduleAtFixedRate(task, initialDelay, periodicDelay,
                    TimeUnit.SECONDS
            );

            inputStream.close();

            FileOutputStream outputStream = new FileOutputStream("C:\\Users\\HP\\Desktop\\prueba.xlsx");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();

        } catch (IOException | EncryptedDocumentException | NoClassDefFoundError ex) {
            System.out.println("va a lanzar una ex");
            ex.printStackTrace();
        }

        return "valor de la celda B2 = " ;
    }


    public class leerExcel2 implements Runnable{

        int [] price = new int[10];
        int sum = 0;
        int position = 0;

        public void run() {
            System.out.println("ok");
            Toolkit.getDefaultToolkit().beep();

            //cargar
            //price[position] = (int)(Math.random()*10+1);
            price[position] = Integer.parseInt(valorPrice);

            //leer
            for(int i :price) {
                sum ++;
                System.out.println("valor de los prices = "+i);
            }
            position ++;
        }
    }
}
