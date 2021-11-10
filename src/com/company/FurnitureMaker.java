package com.company;

public class FurnitureMaker {
    Couch couch;
    Table table;
    Closet closet;

    public FurnitureMaker() {
        couch = new Couch();
        table = new Table();
        closet = new Closet();
    }

    public void makeCouch()
    {couch.make();}
    public void makeTable()
    {table.make();}
    public void makeCloset()
    {closet.make();}
}
