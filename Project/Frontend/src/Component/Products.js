import React, { useEffect, useState } from 'react';
import axios from 'axios';
import './Products.css';
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css';

const Products = () => {
    const [arr, setArr] = useState([]);
    const notify = () => toast("Product Added succesfully!!");

    useEffect(() => {
        axios.get('http://localhost:8082/products')
            .then((res) => {
                setArr(res.data.list);
                console.log("Data received successfully:", res.data.list);
            })
            .catch((err) => {
                console.error("Error fetching data:", err);
            });
    }, []);

    const handleClick = (item) => {
        axios.post(`http://localhost:8082/addToCart/${item.productId}`)
        .then(() => {
            notify();
        })
        .catch((err) => {
            console.error("Error adding item to cart:", err);
        });
    }

    return (
        <div className="container-xl" style={{marginTop:'40px'}}>
            <div className="row">
                <div className="col-md-12">
                    <h2>Featured <b>Products</b></h2>
                </div>
            </div>

            <div className="row" >
                {arr.map((item) => (
                    <div className="col-sm-3" key={item.productId} >
                        <div className="card rounded shadow-sm border-0" style={{ textAlign: 'center',marginBottom:'20px',height:'340px' }} >
                            <div className="card-body p-4" >
                                {/* <img src='https://www.tutorialrepublic.com/examples/images/products/macbook-air.jpg' alt={item.productName} className="img-fluid d-block mx-auto mb-3" />
                                <h5><a href="#" className="text-dark">{item.productName}</a></h5>
                                <p className="small text-muted font-italic"><strike>{item.productPrice+500} Disc</strike> {item.productPrice}</p>
                                <ul className="list-inline small">
                                    <li className="list-inline-item m-0"><i className="fa fa-star text-success"></i></li>
                                    <li className="list-inline-item m-0"><i className="fa fa-star text-success"></i></li>
                                    <li className="list-inline-item m-0"><i className="fa fa-star text-success"></i></li>
                                    <li className="list-inline-item m-0"><i className="fa fa-star text-success"></i></li>
                                    <li className="list-inline-item m-0"><i className="fa fa-star-o text-success"></i></li>
                                </ul> */}
                                <img class='mx-auto img-thumbnail'
                                    src="https://m.media-amazon.com/images/I/61-r9zOKBCL._SX679_.jpg"
                                    width="auto" height="auto" />
                                <div class="card-body text-center mx-auto">
                                    <div class='cvp'>
                                        <h5 class="card-title font-weight-bold">{item.productName}</h5>
                                        <p class="card-text">{item.productPrice}</p>
                                        <a href="#" class="btn details px-auto">view details</a><br />
                                        <a href="#" class="btn cart px-auto" onClick={() => handleClick(item)}>ADD TO CART</a>
                                        {/* <button className="btn btn-primary" onClick={() => handleClick(item)}>Add to Cart</button> */}
                                    </div>
                                </div>
                               
                                <ToastContainer />
                            </div>
                        </div>
                    </div>
                ))}
            </div>
        </div>
    );
};

export default Products;
