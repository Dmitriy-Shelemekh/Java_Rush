package com.javarush.task.task23.task2312;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dmitry Shelemekh on 09.11.2017.
 */
public class Snake {
    private List<SnakeSection> sections = new ArrayList<>();
    private boolean isAlive;
    private SnakeDirection direction;

    public Snake(int x, int y) {
        sections = new ArrayList<SnakeSection>();
        sections.add(new SnakeSection(x, y));
        isAlive = true;

    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public List<SnakeSection> getSections() {

        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public void move() {
        if (isAlive) {
            if (direction == SnakeDirection.UP) {
                move(0, -1);
            } else if (direction == SnakeDirection.RIGHT) {
                move(1, 0);
            } else if (direction == SnakeDirection.DOWN) {
                move(0, 1);
            } else if (direction == SnakeDirection.LEFT) {
                move(-1, 0);
            }
        }
    }

    public void move(int dx, int dy) {
        SnakeSection newSection = new SnakeSection(sections.get(0).getX() + dx, sections.get(0).getY() + dy);
        checkBorders(newSection);
        if (!isAlive) return;
        checkBody(newSection);
        if (!isAlive) return;
        if (newSection.getX() == Room.game.getMouse().getX() && newSection.getY() == Room.game.getMouse().getY()) {
            Room.game.eatMouse();
            sections.add(0, newSection);
        } else {
            sections.add(0, newSection);
            sections.remove(sections.size() - 1);
        }
    }

    public void checkBorders(SnakeSection head) {
        int headX = head.getX();
        int headY = head.getY();
        int widthRoom = Room.game.getWidth();
        int heightRoom = Room.game.getHeight();

        if (headX < 0 || headX >= widthRoom || headY < 0 || headY >= heightRoom) {
            isAlive = false;
        }
        System.out.println(isAlive);
    }

    public void checkBody(SnakeSection head) {
        if (sections.contains(head)) {
            isAlive = false;
        }
    }
}
