public class Meja{ //sebagai identitas dai program ini yaitu Meja M nya kapital atau nama dari class dan kurung kurang sebagai pembuka program 
	public int kaki_meja()//sebagai perintah class yang diberi nama kaki_meja dengan tipe data integer
	{ //sebagai pembuka steatment dan untuk membuat perintah input nilai kaki_meja
		return 70; //untuk memberikan nilai balikan pada kaki_meja yang bernilai 70
	
	} //sebagai penutup steatment perintah menginputkan nilai kaki_meja
	public int alas_meja() //sebagai perintah class yang diberi nama kaki_meja dengan tipe data integer
	{ //sebagai pembuka steatment dan untuk membuat perintah input nilai kaki_meja
		return 120; //untuk memberikan nilai balikan pada kaki_meja yang bernilai 120
	} //untuk menutup steatment dan untuk membuat perintah input nilai kaki_meja
	public static void main(String[]args) //sebuah methode untuk menjalankan program yang memiliki nilai balikan dan memiliki arguments
	{ //untuk membuka staetment untuk membuat perintah setelah perintah ini
		Meja nana = new Meja(); //membuat variabel baru dengan program yang awalnya Meja menjadi new Meja
		int kaki = nana.kaki_meja(); //mendeklarasi variabel kaki dengan memanggil variabel Meja dengan.class kaki_meja dengan tipe data integer
		int alas_meja = nana.alas_meja(); //mendeklarasikan variabel alas_meja dengan memanggil variabel Meja dengan menambahkan baru.class als_meja dengan tipe data integer

		System.out.println(kaki*alas_meja); //perintah ini untuk menampilkan output ke monitor sebagai hasil dari operasi aritmatika kaki*alas_meja
	} //penutup steatment perintah yang diatas
} //penutup steatment perintah dalam membuat perintah