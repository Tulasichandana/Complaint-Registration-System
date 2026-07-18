import { useState } from "react";
import axios from "axios";
import { useNavigate, Link } from "react-router-dom";

function Register() {
  const navigate = useNavigate();

  const [user, setUser] = useState({
    name: "",
    email: "",
    password: "",
    phone: "",
    role: "USER"
  });

  const handleChange = (e) => {
    setUser({
      ...user,
      [e.target.name]: e.target.value
    });
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      await axios.post(
        "http://localhost:8081/user/register",
        user
      );

      alert("Registration Successful");

      navigate("/");
    } catch {
      alert("Registration Failed");
    }
  };

  return (
    <div className="container">

      <h2>Register</h2>

      <form onSubmit={handleSubmit}>

        <input
          name="name"
          placeholder="Name"
          onChange={handleChange}
        />

        <input
          name="email"
          placeholder="Email"
          onChange={handleChange}
        />

        <input
          name="phone"
          placeholder="Phone"
          onChange={handleChange}
        />

        <input
          type="password"
          name="password"
          placeholder="Password"
          onChange={handleChange}
        />

        <button>Register</button>

      </form>

      <p>
        Already have an account?
        <Link to="/"> Login</Link>
      </p>

    </div>
  );
}

export default Register;