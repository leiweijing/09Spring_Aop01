package cn.louie.service.impl;

import cn.louie.service.UserSerivce;

public class UserServiceImpl implements UserSerivce {
    @Override
    public void search() {
        System.out.println("search");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void add() {
        System.out.println("add");
    }
}
