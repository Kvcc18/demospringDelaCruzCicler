package com.desarrollo.entities;

public class ChangePasswordRequest {
    String user;
    String oldPassword;
    String newPassword;

    public ChangePasswordRequest(String user, String oldPassword, String newPassword) {
        this.user = user;
        this.oldPassword = oldPassword;
        this.newPassword = newPassword;
    }

    public String getUsername() {
        return user;
    }

    public void setUsername(String user) {
        this.user = user;
    }

    public String getOldPass() {
        return oldPassword;
    }

    public void setOldPass(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public String getNewPass() {
        return newPassword;
    }

    public void setNewPass(String newPassword) {
        this.newPassword = newPassword;
    }
}
