import React, { Component } from 'react'
import WithCounter from './WithCounter'

class HoverCounter1 extends Component {
  render() {
    const {count,incrementCount} = this.props;
    return (
      <div>
        <h1 onMouseOver={incrementCount}> Hovered {count} Times</h1>
      </div>
    )
  }
}
export default WithCounter(HoverCounter1);