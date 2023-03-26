package Customerxt;
/**
*   CustomerView 为主模块，负责菜单的显示和处理用户操作
*
*
*
*
* */
public class CustomerView {
    private CustomerList  customerList = new CustomerList(10);

    public CustomerView() {
        Customer cust = new Customer("李明",'男',19,"12349982563","lm@gmail.com");
        customerList.addCustomer(cust);
    }

    public void enterMainMenu(){
        //显示主页面
        boolean isFlag = true;
        while(isFlag){
            System.out.println("-----------------客户信息管理软件-----------------");
            System.out.println("                  1    添加客户");
            System.out.println("                  2    修改客户 ");
            System.out.println("                  3    删除客户 ");
            System.out.println("                  4    客户列表 ");
            System.out.println("                  5    退        出 ");
            System.out.println("       请选择（1-5）： ");

            char selection = CMUtility.readMenuSelection();
            switch (selection) {
                case '1':
                    addNewCustomer();
                    break;

                case '2':
                    modifyCustomer();
                    break;
                case '3':

                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.print("是否确认退出（Y/N）：");
                    char isExit = CMUtility.readConfirmSelection();
                    if (isExit == 'Y') {
                        isFlag = false;
                    }
            }

        }

    }
    /**
     * 添加客户
     */
    public void addNewCustomer(){
        System.out.println("-----------------添加客户-----------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(10);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(13);
        System.out.print("邮箱：");
        String email = CMUtility.readString(30);

        Customer customer = new Customer(name,gender,age,phone,email);
        boolean isSuccess = customerList.addCustomer(customer);
        if(isSuccess){
            System.out.println("-----------------添加成功-----------------");
        }else{
            System.out.println("---------------目录已满，添加失败---------------");
        }
    }
    /**
     * 修改客户
     */
    public void modifyCustomer(){
        System.out.println("-----------------修改客户-----------------");
        Customer cust;
        int num;
        for (;;) {
            System.out.print("请输入要修改的客户序号(输入-1退出)：");
            num = CMUtility.readInt();
            if (num == -1) {
                return;
            }
            cust = customerList.getCustomer(num - 1);
            if (cust == null) {
                System.out.println("无法找到指定客户!");
            } else {
                break;
            }
        }

        System.out.println("姓名（"+cust.getName()+"）：");
        String name = CMUtility.readString(10, cust.getName());
        System.out.println("性别（"+cust.getGender()+"）：");
        char gender = CMUtility.readChar( cust.getGender());
        System.out.println("年龄（"+cust.getAge()+"）：");
        int age = CMUtility.readInt(cust.getAge());
        System.out.println("电话（"+cust.getPhone()+"）：");
        String tel = CMUtility.readString(11, cust.getPhone());
        System.out.println("邮箱（"+cust.getEmail()+"）：");
        String email = CMUtility.readString(15, cust.getEmail());

        Customer newCust = new Customer(name,gender,age,tel,email);
        boolean isReplaced = customerList.replaceCustomer(num - 1, newCust);
        if (isReplaced) {
            System.out.println("-----------------修   改  成  功-----------------\t");
        } else {
            System.out.println("-----------------修   改  失  败-----------------\t");
        }


    }
    /**
     * 删除客户
     */
    public void deleteCustomer(){
        System.out.println("-----------------删除客户-----------------");
        Customer cust;
        int index;
        for (;;) {
            System.out.print("请输入要删除的客户序号(输入-1退出)：");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }
            cust = customerList.getCustomer(index - 1);
            if (cust == null) {
                System.out.println("无法找到客户!");
            } else {
                break;
            }
        }

        System.out.print("是否确认删除（Y/N）：");
        char isDelete = CMUtility.readConfirmSelection();
        if (isDelete == 'Y') {
            boolean deleteSuccess = customerList.deleteCustomer(index - 1);
            if (deleteSuccess) {
                System.out.println("-----------------删除成功-----------------");
            } else {
                System.out.println("-----------------删除失败-----------------");
            }
        }else{
            return;
        }
    }
    /**
     * 显示客户列表的操作
     */
    public void listAllCustomers(){
        System.out.println("-------------------客  户  列  表------------------\n");
        int total = customerList.getTotal();
        if (total == 0) {
            System.out.println("没有客户记录！");
        }else {
            System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
            Customer[] custList = customerList.getAllCustomers();
            for (int i = 0; i < total; i++) {
                System.out.println(i+1 + "\t" + custList[i].getName()+
                        "\t" + custList[i].getGender()+"\t" + custList[i].getAge()+
                        "\t" + custList[i].getPhone()+"\t" + custList[i].getEmail()+"\t");
            }
        }
        System.out.println("-----------------客户列表完成-----------------\n");
    }
    public static void main(String[] args) {
        CustomerView view = new CustomerView();
        view.enterMainMenu();
    }

}
