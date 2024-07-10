import axios from "axios";
import React, { useEffect, useState } from 'react'
//const baseUrl = "http://localhost:8000/products/";
const AxiosTask = () => {
    const[get,setGet]= useState([]);

    const handleClick = async () => {
        await axios.get("http://localhost:8000/products/0").then((response)=>{
           // setGet(response.data);
           console.log(response.data);
        });
    }

    function onpost(){
        axios.post("http://localhost:8000/products/",{
            "productId" : 501,
            "productName" : "Asus",
            "productPrice":58800,
            "productQuantity":600
        }).then((response)=>{
            console.log(response.data);
            console.log("details saved");
        });
    };
    function onupdate(){
        axios.put("http://localhost:8000/products/13",{
            "productId" : 14,
            "productName" : "Dell",
            "productPrice":58800,
            "productQuantity":2
        }).then((response)=>{
            console.log(response.data);
            console.log("details updated");
        });
    };
    function ondelete(){
        axios.delete("http://localhost:8000/products/10").then((response)=>{
            console.log("details deleted");
        });
    };
    // if(!get)
    // return null;
  return (
    <div>
        <h2>{get.productId}</h2>
      <h2>{get.productName}</h2>
      <h3>{get.productPrice}</h3>
      <h3>{get.productQuantity}</h3>

    <button onClick={onpost}></button>
    <button onClick={onupdate}>Update</button>
    <button onClick={ondelete}>Delete</button>
    <button onClick={handleClick}>getData</button>
    </div>
  )
}

export default AxiosTask
