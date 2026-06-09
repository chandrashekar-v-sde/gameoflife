package com.chargepoint.gameoflife.model;

public class Universe {

    private final int rows;
    private final int cols;
    private final boolean[][] grid;

    public Universe(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Rows and columns must be greater than zero");
        }
        this.rows = rows;
        this.cols = cols;
        this.grid = new boolean[rows][cols];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public boolean isAlive(int row, int col) {
        return grid[row][col];
    }

    public void setAlive(int row, int col, boolean alive) {
        grid[row][col] = alive;
    }
}