import { useState } from "react";
import axios from "axios";
import { useNavigate } from "react-router-dom";

function ComplaintForm() {
  const navigate = useNavigate();

  const [complaint, setComplaint] = useState({
    title: "",
    description: "",
    category: "",
    priority: "",
  });

  const handleChange = (e) => {
    setComplaint({
      ...complaint,
      [e.target.name]: e.target.value,
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      const token = localStorage.getItem("token");

      await axios.post(
        "http://localhost:8080/complaints",
        complaint,
        {
          headers: {
            Authorization: `Bearer ${token}`,
          },
        }
      );

      alert("Complaint Registered Successfully!");
      navigate("/dashboard");
    } catch (error) {
      console.error(error);
      alert("Failed to Register Complaint");
    }
  };

  return (
    <div className="container mt-5">
      <div className="card shadow p-4">
        <h2 className="text-center mb-4">Register Complaint</h2>

        <form onSubmit={handleSubmit}>
          {/* Title */}
          <div className="mb-3">
            <label className="form-label">Complaint Title</label>
            <input
              type="text"
              className="form-control"
              name="title"
              value={complaint.title}
              onChange={handleChange}
              placeholder="Enter Complaint Title"
              required
            />
          </div>

          {/* Description */}
          <div className="mb-3">
            <label className="form-label">Description</label>
            <textarea
              className="form-control"
              rows="4"
              name="description"
              value={complaint.description}
              onChange={handleChange}
              placeholder="Describe your complaint"
              required
            ></textarea>
          </div>

          {/* Category */}
          <div className="mb-3">
            <label className="form-label">Category</label>

            <select
              className="form-select"
              name="category"
              value={complaint.category}
              onChange={handleChange}
              required
            >
              <option value="">-- Select Category --</option>
              <option value="Technical">Technical</option>
              <option value="Network">Network</option>
              <option value="Maintenance">Maintenance</option>
              <option value="Electrical">Electrical</option>
              <option value="Cleaning">Cleaning</option>
              <option value="Other">Other</option>
            </select>
          </div>

          {/* Priority */}
          <div className="mb-3">
            <label className="form-label">Priority</label>

            <select
              className="form-select"
              name="priority"
              value={complaint.priority}
              onChange={handleChange}
              required
            >
              <option value="">-- Select Priority --</option>
              <option value="Low">Low</option>
              <option value="Medium">Medium</option>
              <option value="High">High</option>
            </select>
          </div>

          <button type="submit" className="btn btn-primary w-100">
            Submit Complaint
          </button>
        </form>
      </div>
    </div>
  );
}

export default ComplaintForm;