
package POJO;


import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Lists {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("closed")
    @Expose
    private Boolean closed;
    @SerializedName("pos")
    @Expose
    private Integer pos;
    @SerializedName("idBoard")
    @Expose
    private String idBoard;
    @SerializedName("limits")
    @Expose
    private Limits limits;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Lists() {
    }

    /**
     * 
     * @param idBoard
     * @param pos
     * @param name
     * @param closed
     * @param id
     * @param limits
     */
    public Lists(String id, String name, Boolean closed, Integer pos, String idBoard, Limits limits) {
        super();
        this.id = id;
        this.name = name;
        this.closed = closed;
        this.pos = pos;
        this.idBoard = idBoard;
        this.limits = limits;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public String getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    public Limits getLimits() {
        return limits;
    }

    public void setLimits(Limits limits) {
        this.limits = limits;
    }

}
