package korea.play.culture.association.controller;

public class test {

	public static void main(String[] args) {
		int page = 5;
		int countPage = 10;
		int countList = 10;
		int totalCount = 255;
		int totalPage = totalCount / countList;
		
		if(totalCount < page) {
			page = totalPage;
		}
		
		int startPage = ((page - 1) / 10) * 10 + 1;
		int endPage = startPage + countPage -1;
		
		System.out.println(startPage);
		System.out.println(endPage);
		
		if(endPage > totalPage) {
			endPage = totalPage;
		}
		
		for(int iCount = startPage; iCount <= endPage; iCount++) {
			System.out.println(" " + iCount + " ");
		}
		
	}
}
