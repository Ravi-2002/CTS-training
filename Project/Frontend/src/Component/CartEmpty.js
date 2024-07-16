import React from 'react'
import './CartEmpty.css';
import { useNavigate } from 'react-router-dom';
const CartEmpty = () => {
    const navi = useNavigate();
  return (
    <div>
            <div class="col-sm-12 empty-cart-cls text-center" style={{marginTop:'70px'}}>
							<img src="https://i.imgur.com/dCdflKN.png" width="130" height="130" class="img-fluid mb-4 mr-3" />
							<h3 style={{fontFamily:'monospace'}}><strong>Your Cart is Empty</strong></h3>
							<h4>Add something to make me happy :)</h4>
					<a href="#" class="btn btn-warning cart-btn-transform m-3" data-abc="true" onClick={()=>navi('/')}>continue shopping</a>
			</div>
    </div>
  )
}

export default CartEmpty
