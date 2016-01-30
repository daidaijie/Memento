package com.net.second.memento;

/**
 * Created by daidaijie on 2016/1/30.
 */
public class GameRole {

    private int vit;
    private int atk;
    private int def;

    public RoleStateMemento saveState() {
        return new RoleStateMemento(vit, atk, def);
    }

    public void recoveryState(RoleStateMemento memento) {
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }



}
