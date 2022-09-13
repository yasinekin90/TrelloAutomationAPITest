
package POJO;


import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class AttachmentsByType {

    @SerializedName("trello")
    @Expose
    private Trello trello;

    /**
     * No args constructor for use in serialization
     * 
     */
    public AttachmentsByType() {
    }

    /**
     * 
     * @param trello
     */
    public AttachmentsByType(Trello trello) {
        super();
        this.trello = trello;
    }

    public Trello getTrello() {
        return trello;
    }

    public void setTrello(Trello trello) {
        this.trello = trello;
    }

}
