const React = require('react');
const ReactDOM = require('react-dom');
import Form from './form'

class App extends React.Component {
	render() {
		return (
		      <div>
        		    <p>Choose a move</p>
                    <Form />
              </div>
		);
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)