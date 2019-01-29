/*
global React,jQuery
*/
class Welcome extends React.Component {
    constructor(props) {
        super(props);
        this.state = {name: props.name}
    }

    componentDidMount() {
        jQuery.get("/api/name")
            .done((name) => {
                this.setState({
                    name: name
                });
            })
    }

    render() {
        return <h2>Hello, {this.state.name}</h2>;
    }
}