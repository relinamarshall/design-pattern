package com.design.pattern.abs.factory;

/**
 * TestAbstractFactory
 *
 * @author Wenzhou
 * @since 2023/5/15 16:06
 */
public class TestAbstractFactory {
    public static void main(String[] args) {
        //生产Bmw
        BmwCarFactory bmwCarFactory = new BmwCarFactory();
        //宝马运动
        SportCar bmwSportCar = bmwCarFactory.buildSportCar();
        System.out.println("宝马运动strong:" + bmwSportCar.isStrong());
        bmwSportCar.show();
        //宝马商务
        BusinessCar bmwBusinessCar = bmwCarFactory.buildBusinessCar();
        System.out.println("宝马商务autoDoor:" + bmwBusinessCar.isAutoDoor());
        bmwBusinessCar.show();

        //生产Benz
        BenzCarFactory benzCarFactory = new BenzCarFactory();
        //奔驰运动
        SportCar benzSportCar = benzCarFactory.buildSportCar();
        System.out.println("奔驰运动strong:" + benzSportCar.isStrong());
        benzSportCar.show();
        //奔驰商务
        BusinessCar benzBusinessCar = benzCarFactory.buildBusinessCar();
        System.out.println("奔驰自动autoDoor:" + benzBusinessCar.isAutoDoor());
        benzBusinessCar.show();

        //生产Aodi
        AodiCarFactory aodiCarFactory = new AodiCarFactory();
        //奥迪运动
        SportCar aodiSportCar = aodiCarFactory.buildSportCar();
        System.out.println("奥迪运动strong:" + aodiSportCar.isStrong());
        aodiSportCar.show();
        //奥迪商务
        BusinessCar aodiBusinessCar = aodiCarFactory.buildBusinessCar();
        System.out.println("奥迪自动autoDoor:" + aodiBusinessCar.isAutoDoor());
        aodiBusinessCar.show();
    }
}
