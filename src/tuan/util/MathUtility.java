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
//    
    // viết hàm đệ quy
    public static long getFractorial(int n) {
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("n must be between 0..20");
        
        if (n == 0 | n == 1) 
            return 1; //đk dừng
        
        return n * getFractorial(n - 1);//đệ quy đó em
        //gọi lại chính hàm của mình với quy mô khác , n -1
    }
    //5! = 5 * 4!; 4! = 4 *3!; 
}
