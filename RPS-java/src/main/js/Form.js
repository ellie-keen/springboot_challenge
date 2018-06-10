import React from 'react';

class Form extends React.Component {
	render() {
		return (
		    <form>
              <input type="text" name="move" />
              <input type="submit" value="Submit" />
            </form>
		);
	}
}

export default Form;