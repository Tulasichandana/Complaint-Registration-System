import { BrowserRouter, Routes, Route } from "react-router-dom";

import Navbar from "./components/Navbar";
import Footer from "./components/Footer";

import Login from "./pages/Login";
import Register from "./pages/Register";
import Dashboard from "./pages/Dashboard";
import ComplaintForm from "./pages/ComplaintForm";
import ComplaintList from "./pages/ComplaintList";

import "./App.css";
import "./Style.css";
import "./ComplaintForm.css"

function App() {
  return (
    <BrowserRouter>
      <Navbar />

      <Routes>
        {/* Authentication */}
        <Route path="/" element={<Login />} />
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />

        {/* Dashboard */}
        <Route path="/dashboard" element={<Dashboard />} />

        {/* Complaints */}
        <Route path="/complaint" element={<ComplaintForm />} />
        <Route path="/complaints" element={<ComplaintList />} />
      </Routes>

      <Footer />
    </BrowserRouter>
  );
}

export default App;