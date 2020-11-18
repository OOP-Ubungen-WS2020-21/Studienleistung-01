package Aufgabe3;

import de.ur.mi.oop.app.GraphicsApp;
import de.ur.mi.oop.colors.Color;
import de.ur.mi.oop.colors.Colors;
import de.ur.mi.oop.graphics.Circle;
import de.ur.mi.oop.launcher.GraphicsAppLauncher;

public class MeetingCircles extends GraphicsApp {

    private static final int START_POS_X_TOP_LEFT = 50;
    private static final int START_POS_Y_TOP_LEFT = 50;
    private static final int START_POS_X_TOP_RIGHT = 450;
    private static final int START_POS_Y_TOP_RIGHT = 50;
    private static final int START_POS_X_BOTTOM_LEFT = 50;
    private static final int START_POS_Y_BOTTOM_LEFT = 450;
    private static final int START_POS_X_BOTTOM_RIGHT = 450;
    private static final int START_POS_Y_BOTTOM_RIGHT = 450;
    private static final int DEFAULT_CIRCLE_RADIUS = 25;
    private static final Color DEFAULT_CIRCLE_COLOR = Colors.RED;
    private static final Color COLLISION_CIRCLE_COLOR = Colors.GREY;
    private static final int DEFAULT_CIRCLE_SPEED = 1;
    private static final Color BACKGROUND_COLOR = Colors.WHITE;

    private static final int DIRECTION_BOTTOM_LEFT = 1;
    private static final int DIRECTION_BOTTOM_RIGHT = 2;
    private static final int DIRECTION_TOP_LEFT = 3;
    private static final int DIRECTION_TOP_RIGHT = 4;

    private Circle topLeftCircle;
    private Circle topRightCircle;
    private Circle bottomLeftCircle;
    private Circle bottomRightCircle;

    @Override
    public void initialize() {
        setCanvasSize(500,500);
        createCircles();
    }

    private void createCircles() {
        topLeftCircle = new Circle(START_POS_X_TOP_LEFT, START_POS_Y_TOP_LEFT, DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR);
        topRightCircle = new Circle(START_POS_X_TOP_RIGHT, START_POS_Y_TOP_RIGHT, DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR);
        bottomLeftCircle = new Circle(START_POS_X_BOTTOM_LEFT, START_POS_Y_BOTTOM_LEFT, DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR);
        bottomRightCircle = new Circle(START_POS_X_BOTTOM_RIGHT, START_POS_Y_BOTTOM_RIGHT, DEFAULT_CIRCLE_RADIUS, DEFAULT_CIRCLE_COLOR);
    }

    @Override
    public void draw() {
        drawBackground(BACKGROUND_COLOR);
        moveCircles();
        drawCircles();
    }

    private void moveCircles() {
        moveSingleCircle(topLeftCircle, DIRECTION_BOTTOM_LEFT);
        moveSingleCircle(topRightCircle, DIRECTION_BOTTOM_RIGHT);
        moveSingleCircle(bottomLeftCircle, DIRECTION_TOP_RIGHT);
        moveSingleCircle(bottomRightCircle, DIRECTION_TOP_LEFT);
    }

    private void moveSingleCircle(Circle circle, int directionCode) {
        int centerX = getWidth()/2;
        int centerY = getHeight()/2;
        if(circle.getXPos() == centerX && circle.getYPos() == centerY) {
            circle.setColor(COLLISION_CIRCLE_COLOR);
            return;
        }
        if(directionCode == DIRECTION_BOTTOM_LEFT) {
            circle.move(DEFAULT_CIRCLE_SPEED,DEFAULT_CIRCLE_SPEED);
        }
        if(directionCode == DIRECTION_BOTTOM_RIGHT) {
            circle.move(-DEFAULT_CIRCLE_SPEED,DEFAULT_CIRCLE_SPEED);
        }
        if(directionCode == DIRECTION_TOP_LEFT) {
            circle.move(-DEFAULT_CIRCLE_SPEED,-DEFAULT_CIRCLE_SPEED);
        }
        if(directionCode == DIRECTION_TOP_RIGHT) {
            circle.move(DEFAULT_CIRCLE_SPEED,-DEFAULT_CIRCLE_SPEED);
        }
    }


    private void drawCircles() {
        topLeftCircle.draw();
        topRightCircle.draw();
        bottomLeftCircle.draw();
        bottomRightCircle.draw();
    }
}