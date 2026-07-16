package com.example.TraningProject.Controllers;

import com.example.TraningProject.Entity.Complaint;
import com.example.TraningProject.Service.ComplaintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/complaints")
@CrossOrigin("*")
public class ComplaintController {

    @Autowired
    private ComplaintService complaintService;

    @PostMapping
    public Complaint addComplaint(@RequestBody Complaint complaint){
        return complaintService.addComplaint(complaint);
    }

    @GetMapping
    public List<Complaint> getAllComplaints(){
        return complaintService.getAllComplaints();
    }

    @GetMapping("/{id}")
    public Complaint getComplaint(@PathVariable Long id){
        return complaintService.getComplaintById(id);
    }

    @PutMapping("/{id}")
    public Complaint updateComplaint(@PathVariable Long id,
                                     @RequestBody Complaint complaint){

        return complaintService.updateComplaint(id, complaint);
    }

    @DeleteMapping("/{id}")
    public String deleteComplaint(@PathVariable Long id){

        complaintService.deleteComplaint(id);

        return "Complaint Deleted Successfully";
    }
}