package com.net.second;

import com.net.second.memento.GameRole;
import com.net.second.memento.RoleStateCaretaker;
import com.net.second.memento.RoleStateMemento;

/**
 * Created by daidaijie on 2016/1/30.
 */
public class Main {

    public static void main(String[] args) {

        GameRole daijie = new GameRole();
        //一系列状态操作

        //保存进度
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setRoleStateMemento(daijie.saveState());

        //大战boss
        //daijie.fight();

        //恢复
        daijie.recoveryState(caretaker.getRoleStateMemento());



    }

}
