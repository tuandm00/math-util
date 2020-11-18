/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import tuan.util.MathUtility;

/**
 *
 * @author ASUS
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long expected = 120;// to hy vong thay 120 neu to goi 5!
        long actual = MathUtility.getFractiorial(5);
        //in ra de kiem tra su khop nhau giua cai ta muon va cai ta lam
        System.out.println("5! expected: " + expected);
        System.out.println("5! actual: " + actual);

        //tiep tuc cho cac tinh huong khac 6! 7! 21! -5! 0!....
        //             cac tinh huong can phai test ta goi la test cases
        //ve li thuyet ta phai test het cac tinh huong...
        //ve thuc hanh: ki 5 se ro SWT301
        System.out.println("6!: 720 , actual: " + MathUtility.getFractiorial(6));
        System.out.println("0!: 1 , atual: " + MathUtility.getFractiorial(0));
        //tao ki vong may nem ve ngoai le , phai la ngoai le
        //IllegalArgumentException neu to co tinh , ng xai ham
        //nay cua tao dua them so am , tham so >20
        System.out.println("expected: IllegalArgumentException: " + MathUtility.getFractiorial(-5));
        
        System.out.println("Chuc cuoi tuan thu 9 vui ve");
    }

}
// MINH MUN KET LUAN HAM NGON , MINH PHAI TEST CAC TRUONG HOP XAI HAM
//TRUONG HOP 5! 0! -5! 21! 20!....
//minh phai thiet ke cac test case , tinh huong test de sau do minh verify
//giua gia tri tra ve cua ham (actual) co khop voi expected cai minh du doan
//ham hcay phai tra ve
//va neu moi thu khop,  tuc la actual == expected , mnh moi dam gay : HAM NGON
//CACH NAY CO NHUOC DIEM : NHIN BANG MAT VA SO SANH KET QUA CUA TUNG CASE
//                                                                   tinh huong test
//Cash nay on , nhung tiem an sai sot do nhin = mat nhieu case 

//CACH NANG CAO
//CUNG NHIN = MAT, NHUNG CHI NHIN 2 MAU XANH - DO CHO MOI TEST CASES
//co nghia la : neu ban xai ham  voi 100 tham so, chay 100 tinh huong khac nhau
//XANH , CODE ON CHO MOI TEST CASE , MOI TINH HUONG GOI HAM
//       MOI CASE PHAI CO EXPECTED = ACTUAL THI MOI XANH
//DO , MOI CASE MAU XANH , CHI CO IT NHAT 1 THANG DO , KET LUAN CA DAM DO
//      ham dung cho 99 truong hop, expected = actual cho 99% tinh huong
//      chi co 1 tinh huong sai , ko khop , ket luan , ham ko on dinh
//      ai dam xai khi ko on dinh , on dinh va chinh xac phai cho moi truong hop
//CHI CAN IT NHAT 1 CAI KHONG ON , DO CA DAM DE DAM BAO RANG HAM PHAI CHINH XAC MOI
//TINH HUONG

//MUON LAM DC DIEU NAY , CAN SU PHU GIUP CUA CAC THU VIEN BEN NGAOI JDK , GOI LA
//UNIT TEST FRAMEWORK
//CAC BO UNIT TEST NOI TIENG: JUnit , TestNG , NUnit , xUnit , PHPUnit , ....
//bua nay minh hoc xanh do qua JUnit
//van voi muc tieu test ham co ngon ko , nhung chi nhin dung 2 mau , ko care chi
//tiet cac tinh huong chay ham
