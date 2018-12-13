package com.biz.come;

public class ComeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getRndDate());
	}

	public static String getRndDate() {
		int[] iMaxDay = {
				31, //1월
				28, //2월
				31, //3월
				30, //4월
				31, //5월	
				30, //6월
				31, //7월
				31, //8월
				30, //9월
				31, //10월
				30, //11월
				31  //12월
				
		};
		// 1~12값을 가져옴
		int iMonth = (int)(Math.random() * (iMaxDay.length)) +1;
		//int iMonth = iMaxDay[iRnd];
		
		int iDays = (int)(Math.random() * (iMaxDay[iMonth-1]-1)) +1;
		
		String rndDate = String.format("2018-%02d-%02d",iMonth, iDays);
		return rndDate;
	}
}
