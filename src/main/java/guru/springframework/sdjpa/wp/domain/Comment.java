package guru.springframework.sdjpa.wp.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.URL;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "wp_comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comment_id;

    @NotNull
    private Long comment_post_ID;

    @OneToMany(mappedBy = "comment")
    private Set<CommentMeta> commentMetaSet;

    @NotNull
    @Size(max = 255)
    private String comment_author;

    @NotNull
    @Size(max = 100)
    @Email
    private String comment_author_email;

    @Size(max = 200)
    @URL
    private String comment_author_url;

    @NotNull
    @Size(max = 100)
    private String comment_author_IP;

    @NotNull
    private LocalDateTime comment_date;

    @NotNull
    private LocalDateTime comment_date_gmt;

    @Lob
    @NotNull
    @Column(name = "comment_content", columnDefinition = "text")
    private String comment_content;

    @NotNull
    private Integer comment_karma;

    @NotNull
    @Size(max = 20)
    private String comment_approved;

    @NotNull
    @Size(max = 255)
    private String comment_agent;

    @NotNull
    @Size(max = 20)
    private String comment_type;

    @NotNull
    private Long comment_parent;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Long getComment_id() {
        return comment_id;
    }

    public void setComment_id(Long comment_id) {
        this.comment_id = comment_id;
    }

    public Long getComment_post_ID() {
        return comment_post_ID;
    }

    public void setComment_post_ID(Long comment_post_ID) {
        this.comment_post_ID = comment_post_ID;
    }

    public Set<CommentMeta> getCommentMetaSet() {
        return commentMetaSet;
    }

    public void setCommentMetaSet(Set<CommentMeta> commentMetaSet) {
        this.commentMetaSet = commentMetaSet;
    }

    public String getComment_author() {
        return comment_author;
    }

    public void setComment_author(String comment_author) {
        this.comment_author = comment_author;
    }

    public String getComment_author_email() {
        return comment_author_email;
    }

    public void setComment_author_email(String comment_author_email) {
        this.comment_author_email = comment_author_email;
    }

    public String getComment_author_url() {
        return comment_author_url;
    }

    public void setComment_author_url(String comment_author_url) {
        this.comment_author_url = comment_author_url;
    }

    public String getComment_author_IP() {
        return comment_author_IP;
    }

    public void setComment_author_IP(String comment_author_IP) {
        this.comment_author_IP = comment_author_IP;
    }

    public LocalDateTime getComment_date() {
        return comment_date;
    }

    public void setComment_date(LocalDateTime comment_date) {
        this.comment_date = comment_date;
    }

    public LocalDateTime getComment_date_gmt() {
        return comment_date_gmt;
    }

    public void setComment_date_gmt(LocalDateTime comment_date_gmt) {
        this.comment_date_gmt = comment_date_gmt;
    }

    public String getComment_content() {
        return comment_content;
    }

    public void setComment_content(String comment_content) {
        this.comment_content = comment_content;
    }

    public Integer getComment_karma() {
        return comment_karma;
    }

    public void setComment_karma(Integer comment_karma) {
        this.comment_karma = comment_karma;
    }

    public String getComment_approved() {
        return comment_approved;
    }

    public void setComment_approved(String comment_approved) {
        this.comment_approved = comment_approved;
    }

    public String getComment_agent() {
        return comment_agent;
    }

    public void setComment_agent(String comment_agent) {
        this.comment_agent = comment_agent;
    }

    public String getComment_type() {
        return comment_type;
    }

    public void setComment_type(String comment_type) {
        this.comment_type = comment_type;
    }

    public Long getComment_parent() {
        return comment_parent;
    }

    public void setComment_parent(Long comment_parent) {
        this.comment_parent = comment_parent;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
