import logo from './logo.svg';
import './App.css';
import { BrowserRouter, Route,Routes } from 'react-router-dom';
import Login from './Component/Login';
import Home from './Component/Home';
import Cart from './Component/Cart';
import Order from './Component/Order';
import Payment from './Component/Payment';

function App() {
  return (
    <div className="App">
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<Home/>}></Route>
          <Route path='/login' element={<Login/>}></Route>
          <Route path='/cart' element={<Cart/>}></Route>
          <Route path='/order' element={<Order/>}></Route>
          <Route path='/payment' element={<Payment/>}></Route>
        </Routes>
      </BrowserRouter>
    </div>
  );
}

export default App;
