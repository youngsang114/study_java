package kr.excel.example;

import kr.excel.entity.Member;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcelWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Member> members= new ArrayList<>();
        while (true){
            System.out.print("이름을 입력하세요:");
            String name = scanner.nextLine();
            if (name.equals("quit")) break;

            System.out.print("나이를 입력하세요:");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.print("생년월일을 입력하세요");
            String birthdate = scanner.nextLine();

            System.out.print("전화번호를 입력하세요");
            String phone = scanner.nextLine();

            System.out.print("주소를 입력하세요");
            String address = scanner.nextLine();

            System.out.print("결혼여부를 입력하세요(true/fales)");
            Boolean isMarried = scanner.nextBoolean();
            scanner.nextLine();

            Member member = new Member(name,age,birthdate,phone,address,isMarried);
            members.add(member);
        }
        scanner.close();

        try(XSSFWorkbook workbook = new XSSFWorkbook();){
            Sheet sheet = workbook.createSheet("회원정보");

            // 첫번째 행(제목이 될) 생성
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("이름");
            headerRow.createCell(1).setCellValue("나이");
            headerRow.createCell(2).setCellValue("생년월일");
            headerRow.createCell(3).setCellValue("전화번호");
            headerRow.createCell(4).setCellValue("주소");
            headerRow.createCell(5).setCellValue("결혼여부");

            for (int i =0; i<members.size();i++){
                Member member = members.get(i);
                Row row = sheet.createRow(i+1);
                row.createCell(0).setCellValue(member.getName());
                row.createCell(1).setCellValue(member.getAge());
                row.createCell(2).setCellValue(member.getBirthdate());
                row.createCell(3).setCellValue(member.getPhone());
                row.createCell(4).setCellValue(member.getAddress());
                row.createCell(5).setCellValue(member.isMarried());
            }
            String filename = "members.xlsx";
            FileOutputStream outputStream = new FileOutputStream(new File(filename));
            workbook.write(outputStream);
            System.out.println("엑셀 파일이 저정되었습니다"+" 파일이름:"+filename);


        } catch (IOException e) {
            System.out.println("엑셀 파일 저장 중 오류가 발생하였습니다");
            e.printStackTrace();
        }

    }
}
