import React from 'react';
import axios from 'axios';

class Form extends React.Component {

    componentDidMount() {
        axios.post('http://localhost:8080/api?move=rock', {
          })
          .then(function (response) {
            console.log(response.data);
          })
          .catch(function (error) {
            console.log(error);
          });
    }

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