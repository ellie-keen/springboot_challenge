const React = require('react');
const ReactDOM = require('react-dom');

class App extends React.Component {
	render() {
		return (
		    <form>
              <input type="text" name="move" />
              <input type="submit" value="Submit" />
            </form>
		);
	}
}

ReactDOM.render(
	<App />,
	document.getElementById('react')
)