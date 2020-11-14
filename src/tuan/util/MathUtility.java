/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuan.util;

/**
 *
 * @author ASUS
 */
public class MathUtility {
    // lam bo thu vien fake giong that y chang Math
    //Math.PI , .asb() .sqrt() .pow(a,b) a^b
    // pham la tu vien thi se xai static khi ko can luu info cho rieng minh 
    // con thu vien ma van can luu info rieng, thi van non-static nhu bthuong

    public static final double PI = 3.1415;

    //tien ich tinh gai thua n! = 1.2.3...n
    //n phai la 0 tro len
    //0! = 1! =1
    //am giai thua vo nghia
    //giai thua tang cuc nhanh , 21! long ko chua dc
    //bai nay minh se chan giai thua tu 0..20
    //am hoac 21 chui , ko them tinh
    public static long getFractiorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0 ..20");// ngoai le khi dua tham so vao qua vo van
        
        if (n == 0 || n == 1) 
            return 1;//dac biet , return luon   
        
        //dua nao biet else o day, tru diem
        //mac nhien CPU den dc day la hieu rang n = 2...20
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }


}
