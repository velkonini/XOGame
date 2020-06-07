package xogame;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BattleMap extends JPanel {
    private GameWindow gameWindow;

    private int gameMode;
    private int fieldSizeX;
    private int fieldSizeY;
    private int dotsToWin;

    private int cellHeight;
    private int cellWidth;
    static Image XImage;
    static Image OImage;


    private boolean isInit = false;

    public BattleMap(GameWindow gameWindow) {
        this.gameWindow = gameWindow;
        setBackground(Color.ORANGE);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                if (isInit) {
                    mouseReleasedUpdate(e);
                }
            }
        });
    }

    private void mouseReleasedUpdate(MouseEvent e) {
        int cellX = e.getX() / cellWidth;
        int cellY = e.getY() / cellHeight;

        if(!Logic.gameFinished){
            Logic.setHumanCoords(cellX, cellY);
        } else {
            Logic.aiTurn();
        }


        System.out.printf("cellX: %d  cellY: %d \n", cellX, cellY);

        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }

    private void render(Graphics g) {
        if (!isInit) {
            return;
        }

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        cellHeight = panelHeight / fieldSizeY;
        cellWidth = panelWidth / fieldSizeX;

        for (int i = 0; i < fieldSizeY; i++) {
            int y = i * cellHeight;
            g.drawLine(0, y, panelWidth, y);
        }

        for (int i = 0; i < fieldSizeX; i++) {
            int x = i * cellWidth;
            g.drawLine(x, 0, x, panelHeight);
        }


        for (int i = 0; i < Logic.SIZE; i++) {
            for (int j = 0; j < Logic.SIZE; j++) {
                if(Logic.map[i][j]==Logic.DOT_X){
                    drawX(g, j, i);
                }
                if(Logic.map[i][j] == Logic.DOT_O){
                    drawO(g, i, j);
                }
            }
        }



    }

    private void drawX(Graphics g, int cellX, int cellY) {
        g = (Graphics2D)g;

        g.setColor(Color.RED);
        g.drawLine(cellX * cellWidth, cellY * cellHeight,
                (cellX + 1) * cellWidth, (cellY + 1) * cellHeight);
        g.drawLine(cellX * cellWidth, (cellY + 1) * cellHeight,
                (cellX + 1) * cellWidth, cellY * cellHeight);


    }


    private void drawO(Graphics g, int cellX, int cellY){
        g = (Graphics2D)g;

        g.setColor(Color.BLUE);
        g.fillOval(cellX * cellWidth , cellY * cellHeight, cellWidth, cellHeight);
    }


    public void startNewGame(int gameMode, int fieldSizeX, int fieldSizeY, int dotsToWin) {
        this.gameMode = gameMode;
        this.fieldSizeX = fieldSizeX;
        this.fieldSizeY = fieldSizeY;
        this.dotsToWin = dotsToWin;

        isInit = true;
        repaint();
    }
}
