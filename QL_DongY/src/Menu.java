
import java.util.Scanner;

public class Menu {

    static void menuMain() {
        System.out.println("-==========Menu==========-");
        System.out.println("-= 1. QL Bác sĩ         =-");
        System.out.println("-= 2. QL Bệnh Nhân      =-");
        System.out.println("-= 3. QL Thuốc          =-");
        System.out.println("-= 4. Exit              =-");
        System.out.println("-========================-");
    }

    static void menuSub(int luachon) {
        switch (luachon) {
            case 1:
                System.out.println("-==========QL Bác sĩ==========-");
                System.out.println("-= 1. Thêm Bác sĩ mới        =-");
                System.out.println("-= 2. Xóa Bác sĩ             =-");
                System.out.println("-= 3. Hiển thị tất cả Bác sĩ =-");
                System.out.println("-= 4. Lưu vào File           =-");
                System.out.println("-= 5. Trở lại                =-");
                System.out.println("-=============================-");
                break;
            case 2:
                System.out.println("-==========QL Bệnh nhân==========-");
                System.out.println("-= 1. Thêm Bệnh nhân mới        =-");
                System.out.println("-= 2. Xóa Bệnh nhân(nếu cần)    =-");
                System.out.println("-= 3. Hiển thị tất cả BN        =-");
                System.out.println("-= 4. Lưu vào File              =-");
                System.out.println("-= 5. Trở lại                   =-");
                System.out.println("-================================-");
        }
    }

    public static void main(String[] args) {
        boolean tmp=true;
        do {
            menuMain();
            Scanner sc = new Scanner(System.in);
            System.out.print("Mời bạn nhập lựa chọn: ");
            int choice = sc.nextInt();
            if(choice==4) return;
            int luachon;
            menuSub(choice);
            String filename = "test.txt";
            DoctorList list = new DoctorList();
            list.AddFromFile(filename);
            boolean dem=true;
            do {
                System.out.print("Mời bạn nhập lựa chọn: ");
                luachon = sc.nextInt();
                if (choice == 1) {
                    switch (luachon) {
                        case 1:
                            list.addnew();
                            dem = true;
                            break;
                        case 2:
                            list.remove();
                            dem = true;
                            break;
                        case 3:
                            list.display();
                            break;
                        case 4:
                            list.SaveToFile(filename);
                            dem=false;
                            break;
                        case 5:
                            luachon=-1;
                            break;
                        default:
                            if(dem){
                                System.out.print("Bạn muốn lưu vào file không(C/K)? ");
                                String ans = sc.nextLine().toUpperCase();
                                if (ans.startsWith("C")) {
                                    list.SaveToFile(filename);
                                }
                            }

                    }
                } else if (choice == 2) {
                    System.out.println("code Quản lý BN");
                } else if (choice == 3) {
                    System.out.println("code QL thuốc");
                } else {
                    tmp=false;
                    return;
                }
                System.out.println("\n");
            } while (luachon > 0 && luachon <5);
            System.out.println("\n\n\n");
        } while (tmp=true);

    }
}
