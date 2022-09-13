
package POJO;


import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class DescData {

    @SerializedName("emoji")
    @Expose
    private Emoji emoji;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DescData() {
    }

    /**
     * 
     * @param emoji
     */
    public DescData(Emoji emoji) {
        super();
        this.emoji = emoji;
    }

    public Emoji getEmoji() {
        return emoji;
    }

    public void setEmoji(Emoji emoji) {
        this.emoji = emoji;
    }

}
