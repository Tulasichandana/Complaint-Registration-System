package com.example.TraningProject.Service;

import com.example.TraningProject.Entity.Complaint;

import java.util.List;

public interface ComplaintService {

    // Create Complaint
    Complaint addComplaint(Complaint complaint);

    // Get All Complaints
    List<Complaint> getAllComplaints();

    // Get Complaint By ID
    Complaint getComplaintById(Long complaintId);

    // Update Complaint
    Complaint updateComplaint(Long complaintId, Complaint complaint);

    // Delete Complaint
    void deleteComplaint(Long complaintId);

    // Find Complaints By Status
    List<Complaint> getComplaintsByStatus(String status);

    // Find Complaints By Category
    List<Complaint> getComplaintsByCategory(String category);

    // Find Complaints By Priority
    List<Complaint> getComplaintsByPriority(String priority);

    // Find Complaints By User ID
    List<Complaint> getComplaintsByUserId(Long userId);

    // Search Complaint By Title
    List<Complaint> searchComplaintByTitle(String title);
}