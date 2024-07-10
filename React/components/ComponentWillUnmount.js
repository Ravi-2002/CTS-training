import React from "react";
class ComponentWillUnmount extends React.Component{
    constructor(){
        super();
        this.state={
            child:true
        }
    }
    
    change=()=>{
        this.setState({child:false});
    };
    render(){
        return(
            <div>
                <h1>Counter</h1>
                {this.state.child  &&<Child/>}
                <button onClick={this.change}>Delete</button>
            </div>
        )
    }
}
class Child extends React.Component{
    componentWillUnmount(){
        alert("this component should be deleted");
    }
    render(){
        return(
            <h1>hello world</h1>
        )
    }
}
export default ComponentWillUnmount;