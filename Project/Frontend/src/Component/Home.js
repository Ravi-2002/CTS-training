import React from 'react'
import Navbar from './Navbar'
import Login from './Login'
import 'bootstrap/dist/css/bootstrap.css';
import Products from './Products'
const Home = () => {
  const isLoggedIn = localStorage.getItem('isLoggedIn');
  return (
    <div>
      <Navbar></Navbar>
      {/* <Login/> */}
      <h1>Home</h1>
      <Products/>
    </div>
  )
}

export default Home
