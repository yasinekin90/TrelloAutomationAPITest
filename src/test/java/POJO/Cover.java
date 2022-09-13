
package POJO;


import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Cover {

    @SerializedName("idAttachment")
    @Expose
    private Object idAttachment;
    @SerializedName("color")
    @Expose
    private Object color;
    @SerializedName("idUploadedBackground")
    @Expose
    private Object idUploadedBackground;
    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("brightness")
    @Expose
    private String brightness;
    @SerializedName("idPlugin")
    @Expose
    private Object idPlugin;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cover() {
    }

    /**
     * 
     * @param idUploadedBackground
     * @param brightness
     * @param color
     * @param size
     * @param idAttachment
     * @param idPlugin
     */
    public Cover(Object idAttachment, Object color, Object idUploadedBackground, String size, String brightness, Object idPlugin) {
        super();
        this.idAttachment = idAttachment;
        this.color = color;
        this.idUploadedBackground = idUploadedBackground;
        this.size = size;
        this.brightness = brightness;
        this.idPlugin = idPlugin;
    }

    public Object getIdAttachment() {
        return idAttachment;
    }

    public void setIdAttachment(Object idAttachment) {
        this.idAttachment = idAttachment;
    }

    public Object getColor() {
        return color;
    }

    public void setColor(Object color) {
        this.color = color;
    }

    public Object getIdUploadedBackground() {
        return idUploadedBackground;
    }

    public void setIdUploadedBackground(Object idUploadedBackground) {
        this.idUploadedBackground = idUploadedBackground;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    public Object getIdPlugin() {
        return idPlugin;
    }

    public void setIdPlugin(Object idPlugin) {
        this.idPlugin = idPlugin;
    }

}
