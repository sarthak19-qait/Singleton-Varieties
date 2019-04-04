# Singleton-Varieties

# index.js
import React from "react";
import ReactDOM from "react-dom";
import "./index.css";
import * as serviceWorker from './serviceWorker';
import "bootstrap/dist/css/bootstrap.css";
import App from "./App"

ReactDOM.render(<App />, document.getElementById("root"));
serviceWorker.unregister();

# app.js
import React, { Component } from 'react';
import './App.css';
import Navbar from "./components/navbar"
import Counters from "./components/counters"

class App extends Component {
  render() {
    return (
      <>
        <Navbar />
          <main className = "container">
            <Counters />
          </main>
      </>
    );
  }
}

export default App;

# navbar
import React, { Component } from 'react';

class Navbar extends Component{

}

export default Navbar

# counters
import React, { Component } from 'react';
import Counter from "../components/counter"

class Counters extends Component 
{ state = {
    counters :
    [
        { id : 1 , value : 4 },
        { id : 2 , value : 0 },
        { id : 3 , value : 0 },
        { id : 4 , value : 0 }
    ] }

    handleIncrement = counter =>{
      const counters = [...this.state.counters];
      const index = counters.indexOf(counter);
      counters[index] = { ...counter };
      counters[index].value++;
      this.setState({ counters })
    }

    handleDelete = (counterId)=>{
        const counters = this.state.counters.filter(c=>c.id!==counterId)
        this.setState({counters:counters})

    }

    handleReset = ()=>{
        const counters = this.state.counters.map(c=>{
            c.value = 0;
            return c;
        })
        this.setState({counters:counters})
    }

    render() {
        return (
            <div>
                <button onClick = {this.handleReset} className="btn btn-primary btn-lg m-2">Reset</button>
                {this.state.counters.map(counter => (
                <Counter
                  key = {counter.id}
                  onDelete = {this.handleDelete}
                  onIncrement = {this.handleIncrement}
                  // value = {counter.value}
                  // selected = {true}
                  // id = {counter.id}
                  counter = {counter}
                  />

                ))}
            </div>
         );
    }
    }

    export default Counters;
    
 # counter
 import React, { Component } from 'react';

class Counter extends Component {

styles = {
    fontSize : 50,
    fontWeight : "bold"
}

getBadgeColor() {
    let classes = "badge m-2 badge-";
    classes += this.props.counter.value === 0 ? "warning" : "primary";
    return classes;
}

formatCount(){
  const { value } = this.props.counter;
  return value === 0 ? "Zero" : value;
}

render() {
    console.log(this.props)
    return (
        <React.Fragment>
            <h4>Counter {this.props.counter.id}</h4>
            <span style = {this.styles} className = {this.getBadgeColor()}>{this.formatCount()}</span>
            <button onClick = {()=>this.props.onIncrement(this.props.count)} style = {{ fontSize : 50 }} className = "btn btn-secondary btn-sm">Increment</button>
            <button onClick = {()=>this.props.onDelete(this.props.counter.id)} className="btn btn-danger btn-lg m-2">Delete</button>
            <br />
        </React.Fragment>
     );
}
}

export default Counter;
