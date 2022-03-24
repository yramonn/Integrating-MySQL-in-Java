/*package com.sovos;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ManipularExcel {

    public static void main(String[] args) throws IOException {



        List<Cliente> listCliente = new LinkedList<Cliente>();


        int rownum = 0;
        for (Cliente cl : listCliente) {
            Row row = sheetAlunos.createRow(rownum++);
            int cellnum = 0;
            Cell cellNome = row.createCell(cellnum++);
            cellNome.setCellValue(listCliente.getId_cliente());
            Cell cellRa = row.createCell(cellnum++);
            cellRa.setCellValue(listCliente.getRa());
            Cell cellNota1 = row.createCell(cellnum++);
            cellNota1.setCellValue(listCliente.getNota1());
            Cell cellNota2 = row.createCell(cellnum++);
            cellNota2.setCellValue(listCliente.getNota2());
            Cell cellMedia = row.createCell(cellnum++);
            cellMedia.setCellValue((listCliente.getNota1() + aluno.getNota2()) / 2);
            Cell cellAprovado =row.createCell(cellnum++);
            cellAprovado.setCellValue(cellMedia.getNumericCellValue() >= 6);
        }

        try {
            FileOutputStream out =
                    new FileOutputStream(new File(ManipularExcel.fileName));
            workbook.write(out);
            out.close();
            System.out.println("Arquivo Excel criado com sucesso!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Arquivo não encontrado!");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Erro na edição do arquivo!");
        }

    }

} */
