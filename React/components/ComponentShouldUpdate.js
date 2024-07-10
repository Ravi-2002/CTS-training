import React from "react";
class ComponentShouldUpdate extends React.Component{
    constructor(){
        super();
        this.state={
            count:0
        }
    }
    shouldComponentUpdate(nextProps,nextState){
        console.log(nextProps)
        if(nextState.count%2==0){
            return true;
        }
        return false;
    }
    increment=()=>{
        this.setState((pre)=>({count:pre.count+1}));
    };
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

export default ComponentShouldUpdate;