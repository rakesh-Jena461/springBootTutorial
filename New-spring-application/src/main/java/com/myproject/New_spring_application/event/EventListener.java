package com.myproject.New_spring_application.event;

import com.myproject.New_spring_application.Entyty.ManUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class EventListener extends ApplicationEvent {
    private String applicationUrl;

    @Autowired
    private ManUser manUser;

    public EventListener( String applicationUrl, ManUser manUser) {
        super(manUser);
        this.applicationUrl = applicationUrl;
        this.manUser = manUser;
    }

    public String getApplicationUrl() {
        return applicationUrl;
    }

    public void setApplicationUrl(String applicationUrl) {
        this.applicationUrl = applicationUrl;
    }

    public ManUser getManUser() {
        return manUser;
    }

    public void setManUser(ManUser manUser) {
        this.manUser = manUser;
    }
}
