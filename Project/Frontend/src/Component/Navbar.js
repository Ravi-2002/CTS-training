import React from 'react'
import './Navbar.css';
import { Link, useNavigate } from 'react-router-dom'
import 'bootstrap/dist/css/bootstrap.css';
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap.bundle.min.js";
import "/node_modules/bootstrap/js/dist/dropdown.js" 

import { Dropdown, Collapse, initMDB } from "mdb-ui-kit";
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import {faShoppingCart} from '@fortawesome/free-solid-svg-icons'
// import { faShoppingCart } from '@fortawesome/free-solid-svg-icons';

initMDB({ Dropdown, Collapse });


let a=false;
const Navbar = () => {
  const navi=useNavigate();
  const isLoggedIn = localStorage.getItem('isLoggedIn');
  console.log(isLoggedIn)
  let a;
  if(isLoggedIn==false){
      a=false;
  }
  else{
    a=true;
  }
  const handleLogout = () => {
    // Perform logout logic
    // ...
  
    // Set isLoggedIn to false in local storage
    a=false;
    window.location.reload();
    
  };
  return (
    <div>
        <nav class="navbar navbar-expand-lg navbar-light ">
  <div class="container-fluid">
    <button
      data-mdb-collapse-init
      class="navbar-toggler"
      type="button"
      data-mdb-target="#navbarSupportedContent"
      aria-controls="navbarSupportedContent"
      aria-expanded="false"
      aria-label="Toggle navigation"
    >
      <i class="fas fa-bars"></i>
    </button>
    
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <a class="navbar-brand mt-2 mt-lg-0" href="/">
        Vikki & co
      </a>
      
      {/* <!-- Left links --> */}
    </div>
    
    <form class="d-flex" role="search">
            <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search" style={{borderRadius:'10px'}} />
            <div class="two wide column" style={{marginTop:'7px',cursor:'pointer'}}></div>
      </form>
    <div class="d-flex align-items-center">
      <a class="text-reset me-3" href="/cart">
        <FontAwesomeIcon icon={faShoppingCart} onClick={()=>navi('/cart')} />
      </a>
      {/* <FontAwesomeIcon icon={faShoppingCart}  /> */}

      <div class="dropdown">
      
        <a
          data-mdb-dropdown-init
          class="dropdown-toggle d-flex align-items-center hidden-arrow"
          
          id="navbarDropdownMenuAvatar"
          role="button"
          aria-expanded="false"
        >
          <img
            src="https://m.media-amazon.com/images/I/61-r9zOKBCL._SX679_.jpg"
            class="rounded-circle"
            height="25"
            href="/login"
            loading="lazy"
          />
        </a>
        <ul
          class="dropdown-menu dropdown-menu-end"
          aria-labelledby="navbarDropdownMenuAvatar"  
        >
          <li>
            <a class="dropdown-item" href="/login">Signin</a>
          </li>
          {a&& 
          <div> <li> 
          <a class="dropdown-item" href="#">My profile</a>
          </li>
          <li> 
            <a class="dropdown-item"  onClick={handleLogout}>Logout</a>
          </li>
          </div>
          }
        </ul>
      </div>
    </div>

  </div>
    
</nav>
    </div>
  )
}

export default Navbar
