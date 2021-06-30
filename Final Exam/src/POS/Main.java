package POS;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Customer cus1 = new Customer();
        Company comp1 = new Company();

        System.out.print("Enter Customer Name: ");
        cus1.setCustomerName(input.nextLine());

        System.out.print("Enter Customer Address: ");
        cus1.setCustomerAddress(input.nextLine());

        System.out.print("Enter Product Code: ");
        cus1.setProductCode(input.next());
        comp1.setCompanyNature(cus1.getProductType());

        System.out.println("Product Type: " + cus1.getProductType());
        System.out.println(comp1.getCompanyName());

        System.out.print("Enter Product Name: ");
        cus1.setProductName(input.next());

        System.out.println("Product Price: " + cus1.getProductPrice());

        System.out.print("Quantity: ");
        int qty = input.nextInt();

        double amount = qty * cus1.getProductPrice();
        System.out.println("Amount: " + amount);

        double taxAmount = cus1.getProductTax() * amount;
        System.out.println("Tax Amount: " + taxAmount);

        double TotalAmount = amount + taxAmount;
        System.out.println("Total Amount: " + TotalAmount);

        double discount = TotalAmount * cus1.getCustomerDiscount();
        System.out.println("Discount: " + discount);

        double amountDue = TotalAmount - discount;
        System.out.println("Amount Due : " + amountDue);

        System.out.println("Customer Name: " + cus1.getCustomerName());
        System.out.println("Customer Address: " + cus1.getCustomerAddress());
        System.out.println("Product Code: " + cus1.getProductCode());
        System.out.println("Product Name: " + cus1.getProductName());
    }
}

class Product {

    private String ProductCode;
    private String ProductName;
    private String ProductType;
    private double ProductTax;
    private double ProductPrice;

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String productCode) {
        if (productCode.equals("001")) {
            setProductType("Fish");
        } else if (productCode.equals("002")) {
            setProductType("Meat");
        } else if (productCode.equals("003")) {
            setProductType("Vegetable");
        }

        ProductCode = productCode;
    }

    public String getProductType() {
        return ProductType;
    }

    public void setProductType(String productType) {
        if (productType.equalsIgnoreCase("Fish")) {
            ProductTax = 0.08;
        } else if (productType.equalsIgnoreCase("Meat")) {
            ProductTax = 0.12;
        } else if (productType.equalsIgnoreCase("Vegetable")) {
            ProductTax = 0.10;
        }

        ProductType = productType;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        if (productName.equalsIgnoreCase("Galunggong")) {
            setProductPrice(110);
        } else if (productName.equalsIgnoreCase("Aircon")) {
            setProductPrice(120);
        } else if (productName.equalsIgnoreCase("Bangus")) {
            setProductPrice(130);
        } else if (productName.equalsIgnoreCase("Pork")) {
            setProductPrice(400);
        } else if (productName.equalsIgnoreCase("Beef")) {
            setProductPrice(600);
        } else if (productName.equalsIgnoreCase("Chicken")) {
            setProductPrice(120);
        } else if (productName.equalsIgnoreCase("Tomatoes")) {
            setProductPrice(25);
        } else if (productName.equalsIgnoreCase("Eggplant")) {
            setProductPrice(20);
        } else if (productName.equalsIgnoreCase("Carrots")) {
            setProductPrice(65);
        }

        ProductName = productName;
    }

    public double getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(double productPrice) {
        ProductPrice = productPrice;
    }

    public double getProductTax() {
        return ProductTax;
    }

    public void setProductTax(double productTax) {
        ProductTax = productTax;
    }
}

class Customer extends Product {

    private String CustomerName;
    private String CustomerAddress;
    private double CustomerDiscount;

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getCustomerAddress() {
        return CustomerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        if (customerAddress.equalsIgnoreCase("Manila")) {
            CustomerDiscount = .15;
        } else {
            CustomerDiscount = 0;
        }

        CustomerAddress = customerAddress;
    }

    public double getCustomerDiscount() {
        return CustomerDiscount;
    }

    public void setCustomerDiscount(double customerDiscount) {
        CustomerDiscount = customerDiscount;
    }
}

class Company {

    private String CompanyName;
    private String CompanyNature;

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public String getCompanyNature() {
        return CompanyNature;
    }

    public void setCompanyNature(String companyNature) {
        if (companyNature.equalsIgnoreCase("Fish")) {
            setCompanyName("Mandaragat Fish, Inc.");
        } else if (companyNature.equalsIgnoreCase("Meat")) {
            setCompanyName("Aling Nene Livestock Dealer, Co.");
        } else if (CompanyNature.equalsIgnoreCase("Vegetable")) {
            setCompanyName("Bahay Kubo Fruits and Vegetables");
        }

        CompanyNature = companyNature;
    }
}
