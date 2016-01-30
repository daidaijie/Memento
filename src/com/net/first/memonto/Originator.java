package com.net.first.memonto;

/**
 * Created by daidaijie on 2016/1/30.
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //创建备忘录
    public Memonto createMemonto() {
        return new Memonto(state);
    }

    //恢复备忘录
    public void setMemonto(Memonto memonto) {
        state = memonto.getState();
    }

    public void show() {
        System.out.println("state = " + state);
    }

}
