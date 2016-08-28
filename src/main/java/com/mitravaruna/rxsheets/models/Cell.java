package com.mitravaruna.rxsheets.models;


public abstract class Cell {

    public abstract Value eval(Sheet sheet, CellAddress address);

    public abstract Cell moveContents(CellAddress cellAddress);

    public abstract String show(CellAddress cellAddress);

    public abstract String showAfterComputation(Sheet sheet, CellAddress cellAddress);

}
