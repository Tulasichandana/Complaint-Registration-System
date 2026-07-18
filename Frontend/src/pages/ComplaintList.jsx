import { useEffect, useState } from "react";
import axios from "axios";

function ComplaintList() {

  const [complaints, setComplaints] = useState([]);

  useEffect(() => {

    fetchComplaints();

  }, []);

  const fetchComplaints = async () => {

    try {

      const res = await axios.get(

        "http://localhost:8080/complaints",

        {

          headers: {

            Authorization:
              "Bearer " + localStorage.getItem("token")

          }

        }

      );

      setComplaints(res.data);

    } catch {

      alert("Unable to Fetch Complaints");

    }

  };

  return (

    <div className="container">

      <h2>Complaint List</h2>

      <table>

        <thead>

          <tr>

            <th>Title</th>
            <th>Category</th>
            <th>Priority</th>
            <th>Status</th>

          </tr>

        </thead>

        <tbody>

          {

            complaints.map((c) => (

              <tr key={c.id}>

                <td>{c.title}</td>
                <td>{c.category}</td>
                <td>{c.priority}</td>
                <td>{c.status}</td>

              </tr>

            ))

          }

        </tbody>

      </table>

    </div>

  );

}

export default ComplaintList;