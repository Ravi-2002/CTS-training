import React, { Component } from 'react'
import { UserConsumer } from './UserContext'

export class ComponentF extends Component {
  render() {
    return (
      <UserConsumer>
        {
            (username)=>{
                return <h1>Its time for {username}</h1>
            }
        }
      </UserConsumer>
    )
  }
}
export default ComponentF