package com.NewApplication;

public class ServiceBean {

   private DaoBean dao;

    public void setDao(DaoBean dao) {

        this.dao = dao;

    }

    public void calculateInterest(){

        dao.findAccount();;

        System.out.println("Interest calculated in service layer....");

    }



}
