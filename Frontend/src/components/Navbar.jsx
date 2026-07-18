import { Link, useNavigate } from "react-router-dom";

function Navbar() {
  const navigate = useNavigate();

  const logout = () => {
    localStorage.removeItem("token");
    navigate("/");
  };

  return (
    <nav className="navbar">
      <div className="logo">
        Complaint Registration System
      </div>

      <ul className="nav-links">
        <li>
          <Link to="/dashboard">Dashboard</Link>
        </li>

        <li>
          <Link to="/complaint">Register Complaint</Link>
        </li>

        <li>
          <Link to="/complaints">Complaint List</Link>
        </li>

        <li>
          <button className="logout-btn" onClick={logout}>
            Logout
          </button>
        </li>
      </ul>
    </nav>
  );
}

export default Navbar;