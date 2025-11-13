import java.util.Scanner; 

public class Bai1 { 
    public static void main(String[] args) { 
        Scanner nhap = new Scanner(System.in); // Tạo đối tượng Scanner để nhập dữ liệu

        String ten = "", ngaysinh = "", mssv = "";
        boolean hopLe;

        // ========================================================
        // Nhập thông tin của sinh viên + NHẬP LẠI KHI SAI
        // ========================================================

        // Nhập tên - nhập lại nếu sai định dạng
        do {
            System.out.print("Nhập tên sinh viên: ");
            ten = nhap.nextLine(); // Nhập vào tên

            hopLe = ten.matches("[\\p{L}\\s]+"); // Tên chỉ được chứa chữ cái (a-z, A-Z) và khoảng trắng
            if (!hopLe) {
                System.out.println("Lỗi: Tên chỉ được chứa chữ cái và khoảng trắng! Vui lòng nhập lại.");
            }
        } while (!hopLe);
        // Nhập ngày sinh - nhập lại nếu sai định dạng
        do {
            System.out.print("Nhập ngày sinh của sinh viên (DD/MM/YYYY): ");
            ngaysinh = nhap.nextLine(); // Nhập vào ngày sinh

            hopLe = ngaysinh.matches("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}"); // Kiểm tra ngày sinh phải theo định dạng DD/MM/YYYY
            if (!hopLe) {
                System.out.println("Lỗi: Ngày sinh phải có định dạng DD/MM/YYYY! Vui lòng nhập lại.");
            }
        } while (!hopLe);

        // Nhập MSSV - nhập lại nếu sai định dạng
        do {
            System.out.print("Nhập MSSV: ");
            mssv = nhap.nextLine(); // Nhập vào mã số sinh viên

            hopLe = mssv.matches("[a-zA-Z0-9]+"); // Kiểm tra MSSV
            if (!hopLe) {
                System.out.println("Lỗi: MSSV phải chứa chữ cái và số! Vui lòng nhập lại.");
            }
        } while (!hopLe);

        if (!ten.matches("[\\p{L}\\s]+")) { // Tên chỉ được chứa chữ cái (a-z, A-Z) và khoảng trắng
            // Không được có số, ký tự đặc biệt
            System.out.println("Lỗi: Tên chỉ được chứa chữ cái và khoảng trắng!");
            return; // Dừng chương trình nếu sai
        }
        // Kiểm tra ngày sinh phải theo định dạng DD//MM/YYYY
        if (!ngaysinh.matches("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}")) {
            System.out.println("Lỗi: Ngày sinh phải có định dạng DD/MM/YYYY!");
            return; // Dừng chương trình nếu sai
        }
        // Kiểm tra MSSV
        if (!mssv.matches("[a-zA-Z0-9]+")) {
            System.out.println("Lỗi: MSSV phải chứa chữ cái và số!");
            return; // Dừng chương trình nếu sai
        }

        // Hiển thị thông tin của sinh viên
        System.out.println("\n--- Thông tin sinh viên ---");
        System.out.println("Tên sinh viên: " + ten);
        System.out.println("Ngày sinh của sinh viên: " + ngaysinh);
        System.out.println("MSSV: " + mssv);

        nhap.close();
    }
}