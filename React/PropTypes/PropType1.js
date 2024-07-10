import React from 'react'

const PropType1 = () => {
  return (
    <div>
      <React.Fragment>
        <div align="center">
            <h1>React Js Props validation</h1>
            <table>
                <tr>
                    <th>Type</th>
                    <th>Value</th>
                    <th>Valid</th>
                </tr>
                <tr>
                    <td>Array</td>
                    <td>{props.propArray}</td>
                    <td>{props.propBool?"true":"false"}</td>
                    <td>{props.propBool?"true":"false"}</td>
                </tr>
                <tr>
                    <td>Function</td>
                    <td>{props.propFunc(5)}</td>
                    <td>{props.propFunc(5)?"true":"false"}</td>
                </tr>
                <tr>
                    <td>Function</td>
                    <td>{props.propString}</td>
                    <td>{props.propString?"true":"false"}</td>
                </tr>
                <tr>
                    <td>Function</td>
                    <td>{props.propNumber}</td>
                    <td>{props.propNumber?"true":"false"}</td>
                </tr>
            </table>
        </div>
        </React.Fragment>
    </div>
  )
}

export default PropType1
