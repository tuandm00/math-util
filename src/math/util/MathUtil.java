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
        
    }

}
