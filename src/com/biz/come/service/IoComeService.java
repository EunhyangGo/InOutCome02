package com.biz.come.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.come.vo.IoListVO;

public class IoComeService {
	List<IoListVO> ioList;
	String strFileName;

	public IoComeService(String strFileName) {
		ioList = new ArrayList();
		this.strFileName = strFileName;
	}
	public void readFile() {
		FileReader fr;
		BufferedReader buffer;
		
		
		try {
			fr = new FileReader(strFileName);
			buffer = new BufferedReader(fr);
			// 파일을 읽기위해 open한것.
			
			// 파일 읽기 실행
			while(true) {
				String strLine = buffer.readLine();
				if(strLine == null) break;
				//System.out.println(strLine);
				
				String[] st = strLine.split(":");
				//System.out.println(st[1]);
				IoListVO vo = new IoListVO();
				vo.setStrDate(st[0]);
				vo.setStrCName(st[1]);
				vo.setInIo(Integer.valueOf(st[2]));
				vo.setIntprice(Integer.valueOf(st[3]));
				vo.setIntQuan(Integer.valueOf(st[4]));
				ioList.add(vo);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void showIoList() {
		System.out.println("=========================================");
		System.out.println("거래일자\t\t상품명\t\t구분\t단가\t수량");
		System.out.println("-----------------------------------------");
		int iSum = 0;
		int oSum = 0;
		for(IoListVO vo : ioList) {
			String strIo ="매출";
			int iTotal = 0;
			int oTotal = 0;
			
			if(vo.getInIo() ==0) { // 매입
				strIo = "매입";
				iTotal = vo.getIntprice() * vo.getIntQuan();
			} else {
				strIo = "매출";
				oTotal = vo.getIntprice() * vo.getIntQuan();
			}
			// iTotal과 oTotal 0 아니면 합계
			iSum += iTotal;
			oSum += oTotal;
		
			System.out.print(vo.getStrDate()+"\t");
			System.out.print(vo.getStrCName()+"\t");
			//System.out.print(vo.getInIo()+"\t");
			System.out.print(strIo +"\t");
			System.out.print(vo.getIntprice()+"\t");
			System.out.print(vo.getIntQuan()+"\t");
			
			System.out.print(iTotal + "\t");
			System.out.print(oTotal +"\n");
			
	     
		}
				
		System.out.println("===========================");
		System.out.println("총합\t" + iSum +"\t" + oSum);
		
	}
}

