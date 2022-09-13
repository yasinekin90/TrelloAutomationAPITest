
package POJO;


import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Badges {

    @SerializedName("attachmentsByType")
    @Expose
    private AttachmentsByType attachmentsByType;
    @SerializedName("location")
    @Expose
    private Boolean location;
    @SerializedName("votes")
    @Expose
    private Integer votes;
    @SerializedName("viewingMemberVoted")
    @Expose
    private Boolean viewingMemberVoted;
    @SerializedName("subscribed")
    @Expose
    private Boolean subscribed;
    @SerializedName("fogbugz")
    @Expose
    private String fogbugz;
    @SerializedName("checkItems")
    @Expose
    private Integer checkItems;
    @SerializedName("checkItemsChecked")
    @Expose
    private Integer checkItemsChecked;
    @SerializedName("checkItemsEarliestDue")
    @Expose
    private Object checkItemsEarliestDue;
    @SerializedName("comments")
    @Expose
    private Integer comments;
    @SerializedName("attachments")
    @Expose
    private Integer attachments;
    @SerializedName("description")
    @Expose
    private Boolean description;
    @SerializedName("due")
    @Expose
    private Object due;
    @SerializedName("dueComplete")
    @Expose
    private Boolean dueComplete;
    @SerializedName("start")
    @Expose
    private Object start;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Badges() {
    }

    /**
     * 
     * @param comments
     * @param attachments
     * @param attachmentsByType
     * @param dueComplete
     * @param start
     * @param description
     * @param checkItemsEarliestDue
     * @param subscribed
     * @param due
     * @param viewingMemberVoted
     * @param location
     * @param votes
     * @param fogbugz
     * @param checkItems
     * @param checkItemsChecked
     */
    public Badges(AttachmentsByType attachmentsByType, Boolean location, Integer votes, Boolean viewingMemberVoted, Boolean subscribed, String fogbugz, Integer checkItems, Integer checkItemsChecked, Object checkItemsEarliestDue, Integer comments, Integer attachments, Boolean description, Object due, Boolean dueComplete, Object start) {
        super();
        this.attachmentsByType = attachmentsByType;
        this.location = location;
        this.votes = votes;
        this.viewingMemberVoted = viewingMemberVoted;
        this.subscribed = subscribed;
        this.fogbugz = fogbugz;
        this.checkItems = checkItems;
        this.checkItemsChecked = checkItemsChecked;
        this.checkItemsEarliestDue = checkItemsEarliestDue;
        this.comments = comments;
        this.attachments = attachments;
        this.description = description;
        this.due = due;
        this.dueComplete = dueComplete;
        this.start = start;
    }

    public AttachmentsByType getAttachmentsByType() {
        return attachmentsByType;
    }

    public void setAttachmentsByType(AttachmentsByType attachmentsByType) {
        this.attachmentsByType = attachmentsByType;
    }

    public Boolean getLocation() {
        return location;
    }

    public void setLocation(Boolean location) {
        this.location = location;
    }

    public Integer getVotes() {
        return votes;
    }

    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    public Boolean getViewingMemberVoted() {
        return viewingMemberVoted;
    }

    public void setViewingMemberVoted(Boolean viewingMemberVoted) {
        this.viewingMemberVoted = viewingMemberVoted;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public String getFogbugz() {
        return fogbugz;
    }

    public void setFogbugz(String fogbugz) {
        this.fogbugz = fogbugz;
    }

    public Integer getCheckItems() {
        return checkItems;
    }

    public void setCheckItems(Integer checkItems) {
        this.checkItems = checkItems;
    }

    public Integer getCheckItemsChecked() {
        return checkItemsChecked;
    }

    public void setCheckItemsChecked(Integer checkItemsChecked) {
        this.checkItemsChecked = checkItemsChecked;
    }

    public Object getCheckItemsEarliestDue() {
        return checkItemsEarliestDue;
    }

    public void setCheckItemsEarliestDue(Object checkItemsEarliestDue) {
        this.checkItemsEarliestDue = checkItemsEarliestDue;
    }

    public Integer getComments() {
        return comments;
    }

    public void setComments(Integer comments) {
        this.comments = comments;
    }

    public Integer getAttachments() {
        return attachments;
    }

    public void setAttachments(Integer attachments) {
        this.attachments = attachments;
    }

    public Boolean getDescription() {
        return description;
    }

    public void setDescription(Boolean description) {
        this.description = description;
    }

    public Object getDue() {
        return due;
    }

    public void setDue(Object due) {
        this.due = due;
    }

    public Boolean getDueComplete() {
        return dueComplete;
    }

    public void setDueComplete(Boolean dueComplete) {
        this.dueComplete = dueComplete;
    }

    public Object getStart() {
        return start;
    }

    public void setStart(Object start) {
        this.start = start;
    }

}
