package com.in28Minutes.oopsadvanced;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int area() {
        return length*width;
    }

    public int perimeter() {
        return 2*(length+width);
    }

    public String toString() {
        return String.format("length- %d width- %d area- %d perimeter - %d", length, width, area(), perimeter());
    }


}
