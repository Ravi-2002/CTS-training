import React from "react";
class ComponentDidMount extends React.Component{
    constructor(){
        super();
        this.state = {
            data:null,
        };
    }
    componentWillMount(){
        console.log("will mount")
    }

    componentDidMount(){
        console.log("did mount")
        setTimeout(()=>{
            const fetchData = "this data was fetch after mounting.";
            this.setState({data:fetchData});
        },3000
    );
    }
    render(){
        return(
            <div>
                <h1>ComponentDidMount Example</h1>

                {
                    this.state.data?(
                        <p>Data {this.state.data}</p>
                    ):(
                        <p>Loading data.....</p>
                    )
                }
            </div>
        )
    }
}
export default ComponentDidMount;