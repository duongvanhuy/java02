package baitap;
import java.util.Scanner;
public class QuanLyLuong {	
	public static Scanner nhap;
	public static String name[];
	public static String position[];
	public static int time[];
	public static double coefficient[];
	public static int reward[];
	public static int advance[];
	public static double sum[];
	public static final int LUONGCB= 3850000;
	public static final int MAXNV =100;
	public static int soNV =5;
	// ham khoi tao mang
		
	public static void khoiTao() {
		name = new String[MAXNV];
		position = new String[MAXNV];
		time = new int[MAXNV];
		coefficient = new double[MAXNV];
		reward = new int[MAXNV];
		advance= new int[MAXNV];
		sum = new double[MAXNV];
	}
	// ham nhap gia tri cho mang
	public static void nhapThongtin() {
		System.out.println("Nhap so luong can bo nhan vien: ");
		soNV = nhap.nextInt();
		for(int i=0; i< soNV; i++) {
			System.out.printf("Nhap nhan vien thu %d \n", i+1);
			System.out.println("Name: ");
			name[i]= nhap.nextLine();
			System.out.println("position: ");
			position[i]=nhap.nextLine();
			System.out.println("Time: ");
			time[i]=nhap.nextInt();
			System.out.println("Advance:");
			advance[i] = nhap.nextInt();			
		}			
	}
		
			
		
	// Tinh he coefficient(he so luong)
	public static void seachCoefficient() {
		for(int i=0; i< soNV; i++) {
			if(position[i].equals("GiamDoc")) {
				coefficient[i]=4;					
			}
			if(position[i].equals("PhoGiamDoc"));
				coefficient[i]=3.8;
			if(position[i].equals("Ketoan")) {
				coefficient[i]= 3.6;				
			}
			if(position[i].equals("Nhanvien")){
				coefficient[i]=3.4;
			}
			System.out.println(coefficient[i]);
		}
	}
	public static int showMenu() {
		System.out.println("1.Nhap thong tin!!"); 
		System.out.println("2.Tinh he so luong");
		System.out.println("3.Hien thi ai lam nhieu ngay nhat va it ngay nhat roi hien thi luong thuong ");
		System.out.println("4.Tim kiem nhan vien theo ten");
		System.out.println("5.Xoa nhan vien ra khoi danh sach ");
		System.out.println("6. Them 1 so nhan vien vao danh sach");
		System.out.println("7. Sap xep nhan vien theo chuc vu");
		System.out.println("8. Tinh tong luong nhan duoc");
		System.out.println("9. Kiem tra xem ai co muc luong cao nhat, thap nhat roi sap xep luong cao => thap");
		System.out.println("0. Thoat khoi chuong trinh!");
		int chon = nhap.nextInt();
		return chon;
			
	}
	public static void main(System[] args) {
			
		int traloi;
		do {
			traloi=showMenu();
			switch(traloi) {
			case 1:
				nhapThongtin();
				break;
			case 2:
				seachCoefficient();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				break;
			case 9:
				break;
			case 0:
				break;
			default:
				System.err.println("Xin ban hay nhap lai!!!");
						
					
			}
		}while (traloi !=0);
		System.out.println("Xin tam biet!!");
				
	}
}


