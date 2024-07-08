import React, { useState } from "react";

const FormFunctional = () => {
  const [formState, setFormState] = useState({
    productId: "",
    productName: "",
    productCost: "",
    productOnline: "",
    productCategory: "",
    Store: [],
  });

  const onChangeCtrl = (e) => {
    const { name, value, type, checked } = e.target;

    // Handle checkbox input separately
    if (type === "checkbox") {
      const selectedStore = value;
      const updatedStores = checked
        ? [...formState.Store, selectedStore]
        : formState.Store.filter((store) => store !== selectedStore);

      setFormState((prevState) => ({ ...prevState, Store: updatedStores }));
    } else {
      setFormState((prevState) => ({ ...prevState, [name]: value }));
    }
  };

  const onSubmit = (e) => {
    e.preventDefault();
    var ereg = new EReg(
      formState.productId,
      formState.productName,
      formState.productCost,
      formState.productOnline,
      formState.productCategory,
      formState.Store
    );
    let a = JSON.stringify(ereg);
    const {
      productId,
      productName,
      productCost,
      productOnline,
      productCategory,
      ...Store
    } = formState;
    console.log(productId, productName, productCost, productOnline, productCategory, Store);
  };

  const {
    productId,
    productName,
    productCost,
    productOnline,
    productCategory,
    Store,
    editId,
  } = formState;

  // Render method is not needed in functional components
  return (
    // Your JSX goes here...
    <div>
          <form method="post" onSubmit={this.onSubmit}>
            <table className="table table-bordered">
              <tr>
                <td>
                  <span className="badge">Product ID</span>
                </td>
                <td>
                  <input
                    type="text"
                    required="true"
                    name="productId"
                    onChange={this.onChangeCtrl}
                  />
                </td>
              </tr>
              <tr>
                <td>
                  <span className="badge">Product Name</span>
                </td>
                <td>
                  <input
                    type="text"
                    required="true"
                    name="productName"
                    onChange={this.onChangeCtrl}
                  />
                </td>
              </tr>
              <tr>
                <td>
                  <span className="badge">Product Cost</span>
                </td>
                <td>
                  <input
                    type="text"
                    required="true"
                    name="productCost"
                    onChange={this.onChangeCtrl}
                  />
                </td>
              </tr>
              <tr>
                <td>
                  <span className="badge">Product Online</span>
                </td>
                <td>
                  <input
                    type="radio"
                    name="productOnline"
                    onChange={this.onChangeCtrl}
                    value={"Yes"}
                  /><span>Yes</span>
                  <input
                    type="radio"
                    name="productOnline"
                    onChange={this.onChangeCtrl}
                    value={"No"}
                  />
                </td><span>No</span>
              </tr>
              <tr>
                <td>
                  <span className="badge">Product Category</span>
                </td>
                <td>
                <select 
                  id="productCategory" className='form-select'
                  name="productCategory" onChange={this.onChangeCtrl}  >
                    <option >------</option>
                    <option >Grocery</option>
                    <option >Electornics</option>
                    <option >Mobile</option>
                    <option >Cloths</option>
                  </select>
                </td>
              </tr>
              <tr>
                <td>
                  <span className="badge">Available in Store: </span>
                </td>
                <td>
                  <input
                    type="checkbox"
                    name="Store"
                    onChange={this.onChangeCtrl}
                    value={"Big Bazar"}
                  /><span>Big Bazar</span>
                  <input
                    type="checkbox"
                    name="Store"
                    onChange={this.onChangeCtrl}
                    value={"Dmart"}
                  /><span>Dmart</span>
                  <input
                    type="checkbox"
                    name="Store"
                    onChange={this.onChangeCtrl}
                    value={"Reliance"}
                  /><span>Reliance</span>
                  <input
                    type="checkbox"
                    name="Store"
                    onChange={this.onChangeCtrl}
                    value={"Mega Store"}
                  /><span>Mega Store</span>
                </td>
              </tr>
              
              <tr>
                <td>
                  <input type="submit" className="btn btn-info" value="Send" />
                </td>
                <td>
                  <input type="reset" value="Cancel" />
                </td>
              </tr>
            </table>
          </form>
          <br />
          {/* <div className="alert alert-info">
            {this.state.productId +
              " " +
              this.state.email +
              " " +
              this.state.mobile +
              " " +
              this.state.productName}
          </div> */}
          <h2>Form details</h2>
          <table>
          <thead>
            <tr>
              <th>Name</th>
              <th>productName</th>
              <th>Email</th>
              <th>Mobile</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody>
            {/* {data.map((item) => (
              <tr key={item.id}>
                <td>{item.productId}</td>
                <td>{item.productName}</td>
                <td>{item.email}</td>
                <td>{item.mobile}</td>
                <td>
                  <button onClick={() => this.handleEdit(item.id)}>Edit</button>
                  <button onClick={() => this.handleDelete(item.id)}>Delete</button>
                </td>
              </tr>
            ))} */}
          </tbody>
        </table>
        
        </div>
  );
};

class EReg {
  constructor(productId, productName, productCost, productOnline, productCategory, Store) {
    this.productId = productId;
    this.productName = productName;
    this.productCost = productCost;
    this.productOnline = productOnline;
    this.productCategory = productCategory;
    this.Store = Store;
  }
}

export default FormFunctional;