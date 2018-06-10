const React = require('react');
const ReactDOM = require('react-dom');
import Form from './form'

class App extends React.Component {
	render() {
		return (
		    <Form />
		);
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)