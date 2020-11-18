/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util.test;

import org.junit.Test;
import static org.junit.Assert.*;
import tuan.util.MathUtility;

import static tuan.util.MathUtility.*;
//chỉ từ JDK 5 ? hàm static gọi hàm mà hok cần tên class chấm
//do mình đã chơi trò khai báo sẵn tên class và tên hàm static qua lệnh
//import static
//sau này xài hàm static của class này 

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {

//viết ra những việc những tình huống xài hàm getFractorial()
//kiểm tra xem actual == expected hay ko ??? như truyền thống bên main()
//nhưng ở đây xịn xò hơn , show ra màn hình XANH ĐỎ
//ngoài ra nó còn dùng cho việc CI - Continuous Integration
//                              CD - Continuous Delivery
//                              CT - Continouus Regression Tét
//                              DevOps - Development & Operation
// ngoài danh nghiệp đang xài
    //app liên tục đc kiểm tra chất lượng code , build ra file .jar .war
    //đẩy lên 1 server trung gian - STAGING ENVIRONMENT để cho nhóm test
    //sẵn sàng test kĩ
    //sau đó có thể đẩy thẳng lên PRODUCTION SERVER , MÁY CHẠY THẬT Ở NƠI KHÁCH
    //mọi việc sẽ bắt đầu kể từ lúc Developer push code lên GitHub
    //mọi thứ từ đây sẽ tự động , ko cần con người can thiệp
    
    @Test //từ khóa này - biến hàm này thàng public static void main()
    //Trong hàm này mình sẽ show ra màu xanh đỏ dựa trên sự khớp nhau của
    //EXPECTED VS. ACTUAL qua hàm assertEquals() ... mà thư viện cung cấp
    //assert...() đủ các loại assert trên cuộc đời - assert (v) so sánh
    //thay vì so sánh = mắt , ta nhờ hàm so sánh giùm , thảy về màu giùm ta
    
    public void getFractprial_RunsWell_IfValidArgument(){
        assertEquals(120, getFractiorial(5));
        assertEquals(24, getFractiorial(4));
        assertEquals(720, getFractiorial    (6));
        assertEquals(1, getFractiorial(0));
        //vietsub: hãy tính giùm tui 5! coi nó có là 120 hem?
        //có thì báo xanh , ko thì báo đỏ
    }
    // tui sửa lại code expected = 1 để có màu xanh local
    //và tui cũng mún thấy màu xanh trên GIT tui đóng dấu
}
