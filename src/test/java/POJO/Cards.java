
package POJO;

import java.util.List;

import javax.annotation.processing.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Cards {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("checkItemStates")
    @Expose
    private List<Object> checkItemStates = null;
    @SerializedName("closed")
    @Expose
    private Boolean closed;
    @SerializedName("dateLastActivity")
    @Expose
    private String dateLastActivity;
    @SerializedName("desc")
    @Expose
    private String desc;
    @SerializedName("descData")
    @Expose
    private DescData descData;
    @SerializedName("dueReminder")
    @Expose
    private Object dueReminder;
    @SerializedName("idBoard")
    @Expose
    private String idBoard;
    @SerializedName("idList")
    @Expose
    private String idList;
    @SerializedName("idMembersVoted")
    @Expose
    private List<Object> idMembersVoted = null;
    @SerializedName("idShort")
    @Expose
    private Integer idShort;
    @SerializedName("idAttachmentCover")
    @Expose
    private Object idAttachmentCover;
    @SerializedName("idLabels")
    @Expose
    private List<Object> idLabels = null;
    @SerializedName("manualCoverAttachment")
    @Expose
    private Boolean manualCoverAttachment;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("pos")
    @Expose
    private Integer pos;
    @SerializedName("shortLink")
    @Expose
    private String shortLink;
    @SerializedName("isTemplate")
    @Expose
    private Boolean isTemplate;
    @SerializedName("cardRole")
    @Expose
    private Object cardRole;
    @SerializedName("dueComplete")
    @Expose
    private Boolean dueComplete;
    @SerializedName("due")
    @Expose
    private Object due;
    @SerializedName("email")
    @Expose
    private Object email;
    @SerializedName("labels")
    @Expose
    private List<Object> labels = null;
    @SerializedName("shortUrl")
    @Expose
    private String shortUrl;
    @SerializedName("start")
    @Expose
    private Object start;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("cover")
    @Expose
    private Cover cover;
    @SerializedName("idMembers")
    @Expose
    private List<Object> idMembers = null;
    @SerializedName("attachments")
    @Expose
    private List<Object> attachments = null;
    @SerializedName("badges")
    @Expose
    private Badges badges;
    @SerializedName("subscribed")
    @Expose
    private Boolean subscribed;
    @SerializedName("idChecklists")
    @Expose
    private List<Object> idChecklists = null;
    @SerializedName("stickers")
    @Expose
    private List<Object> stickers = null;
    @SerializedName("limits")
    @Expose
    private Limits limits;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Cards() {
    }

    /**
     * 
     * @param descData
     * @param attachments
     * @param idLabels
     * @param shortUrl
     * @param dueComplete
     * @param dateLastActivity
     * @param idList
     * @param idMembersVoted
     * @param shortLink
     * @param cover
     * @param dueReminder
     * @param subscribed
     * @param pos
     * @param idChecklists
     * @param stickers
     * @param id
     * @param email
     * @param limits
     * @param idBoard
     * @param cardRole
     * @param start
     * @param checkItemStates
     * @param url
     * @param labels
     * @param idMembers
     * @param badges
     * @param idShort
     * @param due
     * @param idAttachmentCover
     * @param isTemplate
     * @param name
     * @param closed
     * @param manualCoverAttachment
     * @param desc
     */
    public Cards(String id, List<Object> checkItemStates, Boolean closed, String dateLastActivity, String desc, DescData descData, Object dueReminder, String idBoard, String idList, List<Object> idMembersVoted, Integer idShort, Object idAttachmentCover, List<Object> idLabels, Boolean manualCoverAttachment, String name, Integer pos, String shortLink, Boolean isTemplate, Object cardRole, Boolean dueComplete, Object due, Object email, List<Object> labels, String shortUrl, Object start, String url, Cover cover, List<Object> idMembers, List<Object> attachments, Badges badges, Boolean subscribed, List<Object> idChecklists, List<Object> stickers, Limits limits) {
        super();
        this.id = id;
        this.checkItemStates = checkItemStates;
        this.closed = closed;
        this.dateLastActivity = dateLastActivity;
        this.desc = desc;
        this.descData = descData;
        this.dueReminder = dueReminder;
        this.idBoard = idBoard;
        this.idList = idList;
        this.idMembersVoted = idMembersVoted;
        this.idShort = idShort;
        this.idAttachmentCover = idAttachmentCover;
        this.idLabels = idLabels;
        this.manualCoverAttachment = manualCoverAttachment;
        this.name = name;
        this.pos = pos;
        this.shortLink = shortLink;
        this.isTemplate = isTemplate;
        this.cardRole = cardRole;
        this.dueComplete = dueComplete;
        this.due = due;
        this.email = email;
        this.labels = labels;
        this.shortUrl = shortUrl;
        this.start = start;
        this.url = url;
        this.cover = cover;
        this.idMembers = idMembers;
        this.attachments = attachments;
        this.badges = badges;
        this.subscribed = subscribed;
        this.idChecklists = idChecklists;
        this.stickers = stickers;
        this.limits = limits;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Object> getCheckItemStates() {
        return checkItemStates;
    }

    public void setCheckItemStates(List<Object> checkItemStates) {
        this.checkItemStates = checkItemStates;
    }

    public Boolean getClosed() {
        return closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public String getDateLastActivity() {
        return dateLastActivity;
    }

    public void setDateLastActivity(String dateLastActivity) {
        this.dateLastActivity = dateLastActivity;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public DescData getDescData() {
        return descData;
    }

    public void setDescData(DescData descData) {
        this.descData = descData;
    }

    public Object getDueReminder() {
        return dueReminder;
    }

    public void setDueReminder(Object dueReminder) {
        this.dueReminder = dueReminder;
    }

    public String getIdBoard() {
        return idBoard;
    }

    public void setIdBoard(String idBoard) {
        this.idBoard = idBoard;
    }

    public String getIdList() {
        return idList;
    }

    public void setIdList(String idList) {
        this.idList = idList;
    }

    public List<Object> getIdMembersVoted() {
        return idMembersVoted;
    }

    public void setIdMembersVoted(List<Object> idMembersVoted) {
        this.idMembersVoted = idMembersVoted;
    }

    public Integer getIdShort() {
        return idShort;
    }

    public void setIdShort(Integer idShort) {
        this.idShort = idShort;
    }

    public Object getIdAttachmentCover() {
        return idAttachmentCover;
    }

    public void setIdAttachmentCover(Object idAttachmentCover) {
        this.idAttachmentCover = idAttachmentCover;
    }

    public List<Object> getIdLabels() {
        return idLabels;
    }

    public void setIdLabels(List<Object> idLabels) {
        this.idLabels = idLabels;
    }

    public Boolean getManualCoverAttachment() {
        return manualCoverAttachment;
    }

    public void setManualCoverAttachment(Boolean manualCoverAttachment) {
        this.manualCoverAttachment = manualCoverAttachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPos() {
        return pos;
    }

    public void setPos(Integer pos) {
        this.pos = pos;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    public Boolean getIsTemplate() {
        return isTemplate;
    }

    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    public Object getCardRole() {
        return cardRole;
    }

    public void setCardRole(Object cardRole) {
        this.cardRole = cardRole;
    }

    public Boolean getDueComplete() {
        return dueComplete;
    }

    public void setDueComplete(Boolean dueComplete) {
        this.dueComplete = dueComplete;
    }

    public Object getDue() {
        return due;
    }

    public void setDue(Object due) {
        this.due = due;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public List<Object> getLabels() {
        return labels;
    }

    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public Object getStart() {
        return start;
    }

    public void setStart(Object start) {
        this.start = start;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Cover getCover() {
        return cover;
    }

    public void setCover(Cover cover) {
        this.cover = cover;
    }

    public List<Object> getIdMembers() {
        return idMembers;
    }

    public void setIdMembers(List<Object> idMembers) {
        this.idMembers = idMembers;
    }

    public List<Object> getAttachments() {
        return attachments;
    }

    public void setAttachments(List<Object> attachments) {
        this.attachments = attachments;
    }

    public Badges getBadges() {
        return badges;
    }

    public void setBadges(Badges badges) {
        this.badges = badges;
    }

    public Boolean getSubscribed() {
        return subscribed;
    }

    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    public List<Object> getIdChecklists() {
        return idChecklists;
    }

    public void setIdChecklists(List<Object> idChecklists) {
        this.idChecklists = idChecklists;
    }

    public List<Object> getStickers() {
        return stickers;
    }

    public void setStickers(List<Object> stickers) {
        this.stickers = stickers;
    }

    public Limits getLimits() {
        return limits;
    }

    public void setLimits(Limits limits) {
        this.limits = limits;
    }

}
