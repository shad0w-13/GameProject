package com.se.project.game;

public class Player {
    public int id; //ID of the player
    private Field currentLocation; //Player's location on the board
    private Board ownBoard; //Player's view on the board
    private Piece piece; //Piece held by a player (can be null)
    private int teamID;

    public Player() {
        this.piece=null;
    }

    public Player(int id) {
        initializePlayer(id, 1, GameMaster.defaultX, GameMaster.defaultY);
        this.piece=null;
        this.id= id;
        // this.currentLocation = new Field(id);
    }

    public Player(int id, int teamID) {
        initializePlayer(id, teamID, GameMaster.defaultX ,GameMaster.defaultY);
    }


    public Player(int id, int teamID, int x, int y) {
        initializePlayer(id, teamID, x, y);
    }

    private void initializePlayer(int id, int teamID, int x, int y){
        this.id=id;
        this.teamID=teamID;
        this.ownBoard =new Board(x, y);
        this.piece=null;
        this.currentLocation = new Field(id, teamID);
    }

    //used to move in one of four directions
    private void move(){

    }

    //used to discover all neighbouring fields
    private void discoverFields(){
        int x = this.currentLocation.getX();
        int y = this.currentLocation.getY();

        if (x==0){
            if (y==0) {                                  //top left corner
                discoverField(x, y+1);
                discoverField(x+1, y+1);
                discoverField(x+1, y);
            } else if (y!= ownBoard.getY()) {            //upper border without corners
                discoverField(x, y-1);
                discoverField(x, y+1);
                discoverField(x+1, y-1);
                discoverField(x+1, y);
                discoverField(x+1, y+1);
            } else {                                    //top right corner
                discoverField(x, y-1);
                discoverField(x+1, y-1);
                discoverField(x+1, y+1);
            }
        } else if (x != ownBoard.getX()) {                //left border without corners
            if (y==0){
                discoverField(x-1, y);
                discoverField(x-1, y+1);
                discoverField(x, y+1);
                discoverField(x+1, y);
                discoverField(x+1, y+1);
            } else if (y!= ownBoard.getY()) {            //no borders in neighbourhood
                discoverField(x-1, y-1);
                discoverField(x-1, y);
                discoverField(x-1, y+1);
                discoverField(x, y-1);
                discoverField(x, y+1);
                discoverField(x+1, y-1);
                discoverField(x+1, y);
                discoverField(x+1, y+1);
            } else {                                    //right border without corners
                discoverField(x-1, y-1);
                discoverField(x-1, y);
                discoverField(x, y-1);
                discoverField(x+1, y-1);
                discoverField(x+1, y);
            }
        } else {
            if (y == 0) {                                  //bottom left corner
                discoverField(x-1, y);
                discoverField(x-1, y+1);
                discoverField(x, y+1);
            } else if (y != ownBoard.getY()) {            //bottom border
                discoverField(x-1, y-1);
                discoverField(x-1, y);
                discoverField(x-1, y+1);
                discoverField(x, y-1);
                discoverField(x, y+1);
            } else {                                    //bottom right corner
                discoverField(x-1, y-1);
                discoverField(x-1, y);
                discoverField(x, y-1);
            }
        }
    }

    //used to discover only one field
    private void discoverField(int x, int y) {
        ownBoard.setField(x, y, GameMaster.mainBoard.getField(x, y));
    }

    //used to test if a piece is a sham
    private void testPiece() {
        if (this.piece != null)
            if (this.piece.isSham())
                this.piece=null;
    }

    //used to pick up a piece from the current field
    private void pickUp() {
        if (this.piece != null) {
            Piece piece = GameMaster.mainBoard.getField(currentLocation.getX(), currentLocation.getY()).getPiece();
            if (piece != null)
                this.piece=piece;
        }
    }

    //used to place a piece in a goal area
    private void placePiece() {

    }

    //used to exchange information between two players
    private void exchangeInfo(Player player) {

    }
}