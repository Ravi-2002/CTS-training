import React from "react";
class ComponentDidUpdate extends React.Component{
    constructor(props){
        super();
        this.state={
            count:0
        }
    }
    increment=()=>{
        this.setState((pre)=>({count:pre.count+1}));
    };
    componentDidUpdate(prevProps,prevState){
        console.log("updated  ");
        console.log('previouse state',prevState);
        console.log('Current state',this.state);
    }
    render(){
        return(
            <div>
                <h1>Counter</h1>
                <p>Count: {this.state.count}</p>
                <button onClick={this.increment}>Increment</button>
            </div>
        )
    }
}

export default ComponentDidUpdate;