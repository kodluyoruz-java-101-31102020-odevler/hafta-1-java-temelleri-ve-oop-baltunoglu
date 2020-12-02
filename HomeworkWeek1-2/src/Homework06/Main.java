package Homework06;

public class Main {
	public static void main(String[] args) {
	PDFDocument pdfDocument = new PDFDocument();
	WordDocument wordDocument = new WordDocument();
	
	Printer.printPDFDocument(pdfDocument);
	Printer.printWordDocument(wordDocument);
}
}
/*Printer sınıfındaki 'print' fonksiyonunu static yapmamızın sebebi 
 * printer sınıfından bir nesne oluşturmadan direkt sınıf üzerinden 'print' fonksiyonunu çağırabilmek içindir.*/
 