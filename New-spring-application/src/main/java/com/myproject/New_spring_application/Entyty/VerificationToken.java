package com.myproject.New_spring_application.Entyty;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import java.util.Calendar;
import java.util.Date;

@NoArgsConstructor
@Entity
public class VerificationToken {
    private static final int EXPIRE_TIME= 10;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String token;
    private Date expireTime;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_VARIFICATION_TOKEN")
    )
    private ManUser manUser;

    public VerificationToken(Long id, String token, Date expireTime, ManUser manUser) {
        super();
        this.id = id;
        this.token = token;
        this.expireTime = calculateExpireTime(EXPIRE_TIME);
        this.manUser = manUser;
    }
    public VerificationToken( String token, Date expireTime) {
        this.token = token;
        this.expireTime = calculateExpireTime(EXPIRE_TIME);
    }

    public Date calculateExpireTime(int expireTime){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime());
        calendar.add(Calendar.MINUTE,expireTime);
        return new Date(calendar.getTime().getTime());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public ManUser getManUser() {
        return manUser;
    }

    public void setManUser(ManUser manUser) {
        this.manUser = manUser;
    }
}
