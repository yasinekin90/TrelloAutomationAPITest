
package POJO;


import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Trello {

    @SerializedName("board")
    @Expose
    private Integer board;
    @SerializedName("card")
    @Expose
    private Integer card;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Trello() {
    }

    /**
     * 
     * @param board
     * @param card
     */
    public Trello(Integer board, Integer card) {
        super();
        this.board = board;
        this.card = card;
    }

    public Integer getBoard() {
        return board;
    }

    public void setBoard(Integer board) {
        this.board = board;
    }

    public Integer getCard() {
        return card;
    }

    public void setCard(Integer card) {
        this.card = card;
    }

}
