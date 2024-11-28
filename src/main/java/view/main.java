package view;

import model.CustomerServicelmpl;

public class main {
    public static void main(String[] args) {
        CustomerServicelmpl customerServicelmpl = new CustomerServicelmpl();
        System.out.println(customerServicelmpl.findAll());
    }

}
