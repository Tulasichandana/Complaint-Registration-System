package com.example.TraningProject.Repository;

import com.example.TraningProject.Entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComplaintRepository extends JpaRepository<Complaint, Long> {

    // Find complaints by status
    List<Complaint> findByStatus(String status);

    // Find complaints by category
    List<Complaint> findByCategory(String category);

    // Find complaints by priority
    List<Complaint> findByPriority(String priority);

    // Find complaints by userId
    List<Complaint> findByUserId(Long userId);

    // Find complaints by title
    List<Complaint> findByTitleContainingIgnoreCase(String title);
}