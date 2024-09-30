import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";
import { BrowserRouter, Link, Route, Routes } from "react-router-dom";
import Home from "./Home";
import Info from "./Info";
import Header from "./Header";

function App() {
  return (
    <>
      <h2>App.jsx</h2>
      <BrowserRouter>
        {/* 리액트 라우터 기능 사용 컴포넌트  */}
        {/* <Link to="/">Home</Link>
        <Link to="/info">Info</Link> */}

        <Header />
        <Routes>
          <Route path="/" element={<Home />}></Route>
          <Route path="/info" element={<Info />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
