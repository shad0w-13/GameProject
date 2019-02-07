package com.se.project.game;

public class GameMaster {
    public static int defaultX = 12;    //default x size of the board
    public static int defaultY = 6;     //default y size of the board
    public static int defaultTeamSize = 2;  //default size of each team

    public static Board mainBoard;
    private Team teamFirst;
    private Team teamSecond;
    private boolean running = false;
    private Thread thread;

    public GameMaster(){
        initialSetup(defaultX, defaultY, defaultTeamSize);    //default size of the board & each team
    }

    public GameMaster(int x, int y) {
        initialSetup(x, y, defaultTeamSize);   //default size of each team
    }

    public GameMaster(int x, int y, int teamSize){
        initialSetup(x, y, teamSize);
        start();
    }

    //used to initialize needed objects
    private void initialSetup(int x, int i, int teamSize){
        mainBoard = new Board(x, i);
        teamFirst = new Team(1, teamSize, x, i);
        teamSecond = new Team(2, teamSize, x, i);

        System.out.println("The board of the size " + x + "x" + i + " has been set up");

        for (Player player : teamFirst) {
            System.out.println("Player with ID " + player.id + " from team number 1 has connected to the game");
        }
        for (Player player : teamSecond) {
            System.out.println("Player with ID " + player.id + " from team number 2 has connected to the game");
        }
    }

    public Board getMainBoard() {
        return mainBoard;
    }

    private void initializeBoard(int x, int y) {
    }

    private void generateNewPiece(){
    }

    private void checkWin(){
    }

    public synchronized void start(){
        if(running)
            return;

        running = true;
        thread = new Thread();
        thread.start();
    }

    public void run() {
        long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int updates = 0;
        int frames = 0;
        /*while(running){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            while(delta >= 1){
                tick();
                updates++;
                delta--;
            }
            frames++;

            if(System.currentTimeMillis() - timer > 1000){
                timer += 1000;
                System.out.println("FPS: " + frames + " TICKS: " + updates);
                frames = 0;
                updates = 0;
            }
        }*/
    }
    private void tick(){
    }
}