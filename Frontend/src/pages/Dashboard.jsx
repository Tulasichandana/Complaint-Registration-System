import { Link } from "react-router-dom";

function Dashboard() {

  return (

    <div className="container">

      <h2>Complaint Dashboard</h2>

      <Link to="/complaint">
        <button>Register Complaint</button>
      </Link>

      <br /><br />

      <Link to="/complaints">
        <button>View Complaints</button>
      </Link>

    </div>

  );
}

export default Dashboard;