package Dto;

import java.sql.Date;


public class SalesPerCategory {
    private Date transactionDate;

    public SalesPerCategory(Date transactionDate, String category, Double totalSales) {
        this.transactionDate = transactionDate;
        this.category = category;
        this.totalSales = totalSales;
    }

    private String category;
    private Double totalSales;
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(Double totalSales) {
        this.totalSales = totalSales;
    }


}
