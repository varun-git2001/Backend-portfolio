
import { useState } from 'react';
import reactLogo from './assets/react.svg';
import viteLogo from '/vite.svg';
import './App.css';

function App() {
  return (
    <>
      <header className="header">
        <nav className="navbar">
          <h1>My Portfolio</h1>
          <ul className="nav-links">
            <li><a href="#about">About</a></li>
            <li><a href="#projects">Projects</a></li>
            <li><a href="#contact">Contact</a></li>
          </ul>
        </nav>
      </header>

      <section id="about" className="about">
        <h2>About Me</h2>
        <p>
          Hi, I'm [Your Name], a passionate developer skilled in building modern
          and responsive web applications. I enjoy creating user-friendly designs
          and solving challenging problems.
        </p>
      </section>

      <section id="projects" className="projects">
        <h2>My Projects</h2>
        <div className="project-list">
          <div className="project-card">
            <h3>Project 1</h3>
            <p>A brief description of your first project.</p>
          </div>
          <div className="project-card">
            <h3>Project 2</h3>
            <p>A brief description of your second project.</p>
          </div>
        </div>
      </section>
      
      <footer className="footer">
        <p>&copy; 2025 [Your Name]. All rights reserved.</p>
        <p>
          <a href="https://github.com/your-profile" target="_blank" rel="noopener noreferrer">
            GitHub
          </a> | 
          <a href="https://linkedin.com/in/your-profile" target="_blank" rel="noopener noreferrer">
            LinkedIn
          </a>
        </p>
      </footer>
    </>
  );
}

export default App;
