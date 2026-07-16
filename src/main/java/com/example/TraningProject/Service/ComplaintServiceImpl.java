package com.example.TraningProject.Service;

import com.example.TraningProject.Entity.Complaint;
import com.example.TraningProject.Repository.ComplaintRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComplaintServiceImpl implements ComplaintService {

    @Autowired
    private ComplaintRepository complaintRepository;

    @Override
    public Complaint addComplaint(Complaint complaint) {
        return complaintRepository.save(complaint);
    }

    @Override
    public List<Complaint> getAllComplaints() {
        return complaintRepository.findAll();
    }

    @Override
    public Complaint getComplaintById(Long complaintId) {
        return complaintRepository.findById(complaintId).orElse(null);
    }

    @Override
    public Complaint updateComplaint(Long complaintId, Complaint complaint) {

        Complaint existingComplaint = complaintRepository.findById(complaintId).orElse(null);

        if (existingComplaint != null) {

            existingComplaint.setTitle(complaint.getTitle());
            existingComplaint.setDescription(complaint.getDescription());
            existingComplaint.setCategory(complaint.getCategory());
            existingComplaint.setPriority(complaint.getPriority());
            existingComplaint.setStatus(complaint.getStatus());
            existingComplaint.setUserId(complaint.getUserId());

            return complaintRepository.save(existingComplaint);
        }

        return null;
    }

    @Override
    public void deleteComplaint(Long complaintId) {
        complaintRepository.deleteById(complaintId);
    }

    @Override
    public List<Complaint> getComplaintsByStatus(String status) {
        return complaintRepository.findByStatus(status);
    }

    @Override
    public List<Complaint> getComplaintsByCategory(String category) {
        return complaintRepository.findByCategory(category);
    }

    @Override
    public List<Complaint> getComplaintsByPriority(String priority) {
        return complaintRepository.findByPriority(priority);
    }

    @Override
    public List<Complaint> getComplaintsByUserId(Long userId) {
        return complaintRepository.findByUserId(userId);
    }

    @Override
    public List<Complaint> searchComplaintByTitle(String title) {
        return complaintRepository.findByTitleContainingIgnoreCase(title);
    }
}