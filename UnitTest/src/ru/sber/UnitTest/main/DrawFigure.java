package ru.sber.UnitTest.main;

public class DrawFigure {
    private String color;

    public String draw(String color, String figureName) {
        return String.format("%s %s ���������", color, figureName);
    }

    public String delete() {
        return "������ �������";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}