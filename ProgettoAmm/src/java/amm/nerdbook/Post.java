/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amm.nerdbook;

public class Post {
    
    public enum Type {
        TEXT, IMAGE, LINK
    };
    
    private int id;
    private int pubId;
    private User user;
    private String text;
    private String url;
    private String linkText;
    private Type postType;

    public Post() {
        id = -1;
        pubId=-1;
        user = null;
        text= "";
        url = "";
        linkText = "";
        postType = Type.TEXT;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getPubId() {
        return pubId;
    }

    public void setPubId(int pubId) {
        this.pubId = pubId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getLinkText() {
        return linkText;
    }

    public void setLinkText(String linkText) {
        this.linkText = linkText;
    }

    public Type getPostType() {
        return postType;
    }

    public void setPostType(Type postType) {
        this.postType = postType;
    }
    
}