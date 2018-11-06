package model.modelUnit;

import model.Clients;

public class ClientsUnit implements Clients {
    private int client_id;
    private int children;
    private String name;

    public ClientsUnit(){}

    public ClientsUnit(int client_id, int children, String name) {
        setClient_id(client_id);
        setChildren(children);
        setName(name);
    }

    @Override
    public int getClient_id() {
        return this.client_id;
    }

    @Override
    public int getChildren() {
        return this.children;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setClient_id(int value) {
        this.client_id = value;
    }

    @Override
    public void setChildren(int value) {
        this.children = value;
    }

    @Override
    public void setName(String value) {
        this.name = value;
    }
}

