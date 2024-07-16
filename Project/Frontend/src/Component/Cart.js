import React from 'react'
import { useState, useEffect } from 'react';
import axios from 'axios';
import './Cart.css';
import CartEmpty from './CartEmpty';
import { useNavigate } from 'react-router-dom';

const Cart = () => {
  const [carto, setCarto] = useState([]);
  const navi = useNavigate();
  const[orderItem,setOrdetItem]=useState('');
  useEffect(() => {
    axios.get('http://localhost:8082/viewCart')
        .then((res) => {
          setCarto(res.data.list);
          console.log("In");
          console.log("Data received successfully:", res.data);
        })
        .catch((err) => {
            console.error("Error fetching data:", err);
        });
  }, []);
  const address="mumbai";
  let mode="upi";
  let totalPrice = 0;
  if(carto!=null){
  carto.forEach(item => {
    totalPrice += item.productPrice; // assuming productPrice is the price for one item
  });
}
  const handleClick2 = () =>{
    axios.post(`http://localhost:8082/confirmOrder`,null,{params:{address,mode}})
        .then((res) => {
            setOrdetItem(res.data.list);
            console.log(res.data.list);
            console.log("Order Item added");
        })
        .catch((err) => {
            console.error("Error deleting item:", err);
        });
    //navi('/payment');

}
  const handleDelete = (id) => {
    axios.get(`http://localhost:8082/deleteFromCart/${id}`)
        .then(() => {
            setCarto(carto.filter(item => item.id !== id));
            console.log("Item deleted successfully");
        })
        .catch((err) => {
            console.error("Error deleting item:", err);
        });
  }

  return (
    <div>
        <h1>Cart</h1>
        {carto== null ? (
             //<p style={{textAlign:'center',marginTop:'20px'}}>Your cart is empty</p> 
             <CartEmpty/>
        ) : (   
            <div class="container mt-5 mb-5">
            <div class="d-flex justify-content-center row">
                <div class="col-md-8">
                    <div class="p-2">
                        <h4>Shopping cart</h4>
                        <div class="d-flex flex-row align-items-center pull-right"><span class="mr-1">Sort by:</span><span class="mr-1 font-weight-bold">Price</span><i class="fa fa-angle-down"></i></div>
                    </div>
                   { carto.map(item => (
                    <div key={item.id} style={{marginTop:'30px'}}> 
                    <div class="d-flex flex-row justify-content-between align-items-center p-2 bg-white mt-4 px-3 rounded">
                        <div class="mr-1"><img class="rounded" src="https://cdn.pixabay.com/photo/2023/03/04/12/40/woman-7829496_1280.jpg" width="70" /></div>
                        <div class="d-flex flex-column align-items-center product-details"><span class="font-weight-bold" style={{fontSize:'30px',fontFamily:'sans-serif',color:'blue'}}>{item.productname}</span>
                            <div class="d-flex flex-row product-desc">
                            </div>
                        </div>
                        <div class="d-flex flex-row align-items-center qty"><i class="fa fa-minus text-danger"></i>
                            <h5 class="text-grey mt-1 mr-1 ml-1">{item.quantity}</h5><i class="fa fa-plus text-success"></i></div>
                        <div>
                            <h5 class="text-grey">{item.productPrice}</h5>
                        </div>
                        <div class="d-flex align-items-center" style={{height:'10px',width:'40px'}}><i class="fa fa-trash mb-1 text-danger" style={{color:'red',cursor:'pointer'}} onClick={() => handleDelete(item.id)}></i></div>
                    </div>
                    </div>
                ))
                }
                </div>
                <div style={{width:'600px'}}>
                <div class="d-flex flex-row align-items-center mt-3 p-2 bg-white rounded"><input type="text" class="form-control border-0 gift-card" placeholder="discount code/gift card" />
                <button class="btn btn-outline-warning btn-sm ml-2" type="button" onClick={handleClick2}>Proceed Payment</button></div>

                </div>
                </div>
            </div>      
        )}
      
    </div>
  )
}

export default Cart
