package com.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.PropertyResolver;

/**
 * Created by keerthiprasad on 1/18/16.
 */
public class EmailService {

    private LinuxService linux;
    private WindowsService window;

    public LinuxService getLinux() {
        return linux;
    }

    public void setLinux(LinuxService linux) {
        this.linux = linux;
    }

    public WindowsService getWindow() {
        return window;
    }

    public void setWindow(WindowsService window) {
        this.window = window;
    }
}
