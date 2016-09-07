package com.mitravaruna.rxsheets.models;


public abstract class Cell {

    public abstract Value eval();

    public abstract Cell moveContents(CellAddress cellAddress);

    public abstract String show();

    public abstract String showAfterComputation();

}
