package com.sunhu.entity;

public class Cron {
    private String id;

    private String cronClass;

    private String cron;

    private Boolean status;

    private String cronRemark;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCronClass() {
        return cronClass;
    }

    public void setCronClass(String cronClass) {
        this.cronClass = cronClass == null ? null : cronClass.trim();
    }

    public String getCron() {
        return cron;
    }

    public void setCron(String cron) {
        this.cron = cron == null ? null : cron.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getCronRemark() {
        return cronRemark;
    }

    public void setCronRemark(String cronRemark) {
        this.cronRemark = cronRemark == null ? null : cronRemark.trim();
    }
}