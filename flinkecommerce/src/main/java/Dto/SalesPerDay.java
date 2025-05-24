package Dto;


import java.sql.Date;


public class SalesPerDay {
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

    public SalesPerDay(Date transactionDate, Double totalSales) {
        this.transactionDate = transactionDate;
        this.totalSales = totalSales;
    }

    private Date transactionDate;
    private Double totalSales ;
}