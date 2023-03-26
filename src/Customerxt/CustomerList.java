package Customerxt;
/**
* CustomerList为 Customer对象管理模块，内部用数组管理
* 一组Customer 对象，并提供相应的添加、修改、删除和遍历方法，供CustomerView调用
*
* */
public class CustomerList {
    private Customer[] customers;//客户列表
    private int total = 0;//记录已保存顾客数量

    //构造器,初始化数组，totalCustomer指定数组最大值
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];//动态初始化
    }
    //方法
    /**
     * 添加客户
     * return：true添加成功，false：添加失败
     */
    public boolean addCustomer(Customer customer){
        if (total < customers.length) {
            customers[total] = customer;
            total++;
            return true;
        }else return false;
    }
    //修改指定索引位置上的客户信息
    public boolean replaceCustomer(int index,Customer cust) {
        if (index < 0 || index >= total) {
            return false;
        } else {
            customers[index] = cust;
            return true;
        }
    }
    //删除指定索引位置上的客户
    public boolean deleteCustomer(int index){
        if (index >= 0 && index < total) {
            for (int i = index; i < total - 1; i++) {
                customers[i] = customers[i+1];//后一个元素赋给前一个元素
            }
            customers[total - 1] = null;//最后元素置空
            total --;//删除一个元素，数组也要减少一个元素
            //or customers[--total] = null;
            return true;
        }
        return false;
    }
    //获取所有客户信息
    public Customer[] getAllCustomers(){
        //null的部分不返回
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }
    /**
     * 获取指定索引位置上的客户
     */
    public Customer getCustomer(int index){
        if (index >= 0 && index < total) {
            return customers[index];
        }else return null;
    }
    /**
     * 获取存储客户的数量
     */
    public int getTotal() {
        return total;
    }
    /**
     * 获取最大能储存客户的数量
     */
    public int getCustomer(){
        return customers.length;
    }

}
