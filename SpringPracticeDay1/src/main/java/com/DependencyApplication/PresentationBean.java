package com.DependencyApplication;

public class PresentationBean {

      private ServiceBean serviceBean;

    public void setServiceBean(ServiceBean serviceBean) {
        this.serviceBean = serviceBean;
    }

    public void present(){

        serviceBean.calculateInterest();

        System.out.println("Presenting calculate interest in presentation layer");

    }

}
