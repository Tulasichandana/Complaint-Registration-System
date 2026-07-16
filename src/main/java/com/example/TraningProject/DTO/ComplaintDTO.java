package com.example.TraningProject.DTO;

public class ComplaintDTO {

    private Long complaintId;
    private String title;
    private String description;
    private String category;
    private String priority;
    private String status;
    private String createdDate;
    private Long userId;

    // Default Constructor
    public ComplaintDTO() {
    }

    // Parameterized Constructor
    public ComplaintDTO(Long complaintId, String title, String description,
                        String category, String priority,
                        String status, String createdDate, Long userId) {

        this.complaintId = complaintId;
        this.title = title;
        this.description = description;
        this.category = category;
        this.priority = priority;
        this.status = status;
        this.createdDate = createdDate;
        this.userId = userId;
    }

    // Getters and Setters

    public Long getComplaintId() {
        return complaintId;
    }

    public void setComplaintId(Long complaintId) {
        this.complaintId = complaintId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}