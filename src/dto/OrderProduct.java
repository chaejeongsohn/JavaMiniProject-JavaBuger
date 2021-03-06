package dto;

import java.util.ArrayList;
import java.util.List;

public class OrderProduct {
    private int orderProductNo;
    private int paymentNumber;
    private int productNumber;
    private int orderProductAmount;
    private List<OrderOption> orderOptionList = new ArrayList<OrderOption>();

    public OrderProduct() {
    }

    public OrderProduct(int paymentNumber, int productNumber, int orderProductAmount) {
        this.paymentNumber = paymentNumber;
        this.productNumber = productNumber;
        this.orderProductAmount = orderProductAmount;
    }

    public int getOrderProductNo() {
        return orderProductNo;
    }

    public void setOrderProductNo(int orderProductNo) {
        this.orderProductNo = orderProductNo;
    }

    public int getPaymentNumber() {
        return paymentNumber;
    }

    public void setPaymentNumber(int paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public int getOrderProductAmount() {
        return orderProductAmount;
    }

    public void setOrderProductAmount(int orderProductAmount) {
        this.orderProductAmount = orderProductAmount;
    }


    public List<OrderOption> getOrderOptionList() {
        return orderOptionList;
    }

    public void setOrderOptionList(List<OrderOption> orderOptionList) {
        this.orderOptionList = orderOptionList;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("orderProductNo=").append(orderProductNo);
        sb.append(", paymentNumber=").append(paymentNumber);
        sb.append(", productNumber=").append(productNumber);
        sb.append(", orderProductAmount=").append(orderProductAmount);
        return sb.toString();
    }
}
