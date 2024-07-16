import React from 'react'
import './Payment.css';
import { useNavigate } from 'react-router-dom';
import axios from 'axios';
const Payment = (props) => {
    const { total } = props; 
    const navi = useNavigate();
    const handleClick2 = () =>{
        navi('/order');
        axios.delete('http://localhost:8084/cartservice/deleteAll')
        .then(() => {
            console.log("All Items deleted successfully");
        })
        .catch((err) => {
            console.error("Error deleting all items:", err);
        });
    }
  return (
    <div>
       <main class="page payment-page">
    <section class="payment-form dark">
      <div class="container">
        <div class="block-heading">
          <h2>Payment</h2>
    </div>
        <form>
          <div class="products">
            <h3 class="title">Checkout</h3>
            
            <div class="total">Total<span class="price">{total}</span></div>
          </div>
          <div class="card-details">
            <h3 class="title">Credit Card Details</h3>
            <div class="row">
              <div class="form-group col-sm-7">
                <label for="card-holder">Card Holder</label>
                <input id="card-holder" type="text" class="form-control" placeholder="Card Holder" aria-label="Card Holder" aria-describedby="basic-addon1" />
              </div>
              <div class="form-group col-sm-5">
                <label for="">Expiration Date</label>
                <div class="input-group expiration-date">
                  <input type="text" class="form-control" placeholder="MM" aria-label="MM" aria-describedby="basic-addon1" />
                  <span class="date-separator">/</span>
                  <input type="text" class="form-control" placeholder="YY" aria-label="YY" aria-describedby="basic-addon1" />
                </div>
              </div>
              <div class="form-group col-sm-8">
                <label for="card-number">Card Number</label>
                <input id="card-number" type="text" class="form-control" placeholder="Card Number" aria-label="Card Holder" aria-describedby="basic-addon1" />
              </div>
              <div class="form-group col-sm-4">
                <label for="cvc">CVC</label>
                <input id="cvc" type="text" class="form-control" placeholder="CVC" aria-label="Card Holder" aria-describedby="basic-addon1" />
              </div>
              <div class="form-group col-sm-12">
                <button type="button" class="btn btn-primary btn-block" onClick={handleClick2}>Proceed</button>
              </div>
            </div>
          </div>
        </form>
      </div>
    </section>
  </main>
    </div>
  )
}

export default Payment
